import org.antlr.v4.runtime.tree.ParseTree;

public class GeneradorJasmin extends EppBaseVisitor<Void> {

    private final TablaSimbolos tabla;
    private final StringBuilder code = new StringBuilder();
    private int labelCount = 0;

    public GeneradorJasmin(TablaSimbolos tabla) {
        this.tabla = tabla;
    }

    public String generarPrograma(ParseTree tree) {
        code.append(".class public Programa\n");
        code.append(".super java/lang/Object\n\n");

        // Método main
        code.append(".method public static main([Ljava/lang/String;)V\n");
        code.append("    .limit stack 50\n");
        code.append("    .limit locals 50\n\n");

        // Recorrer el programa
        this.visit(tree);

        // return
        code.append("    return\n");
        code.append(".end method\n");

        return code.toString();
    }

    private String nuevaEtiqueta(String pref) {
        return pref + (labelCount++);
    }


    @Override
    public Void visitAssignInitStmt(EppParser.AssignInitStmtContext ctx) {
        // Visitar expr → genera código y deja valor en pila
        visit(ctx.expr());

        // Obtener slot local de la variable
        String id = ctx.ID().getText();
        Simbolo s = tabla.obtener(id);

        // Guardar variable según tipo
        if (s.tipo == Tipo.INT || s.tipo == Tipo.BOOL) {
            code.append("    istore ").append(s.slotLocal).append("\n");
        } else if (s.tipo == Tipo.FLOAT) {
            code.append("    fstore ").append(s.slotLocal).append("\n");
        } else {
            code.append("    astore ").append(s.slotLocal).append("\n");
        }

        return null;
    }

    @Override
    public Void visitAssignReStmt(EppParser.AssignReStmtContext ctx) {
        String id = ctx.ID().getText();
        Simbolo s = tabla.obtener(id);

        if (ctx.ASSIGN() != null) {
            // x = expr
            visit(ctx.expr());
        } else {
            // x += expr  /  x -= expr
            if (s.tipo == Tipo.INT || s.tipo == Tipo.BOOL) {
                code.append("    iload ").append(s.slotLocal).append("\n");
            } else if (s.tipo == Tipo.FLOAT) {
                code.append("    fload ").append(s.slotLocal).append("\n");
            }

            visit(ctx.expr()); // deja el valor de expr

            if (ctx.PLUS_ASSIGN() != null) {
                if (s.tipo == Tipo.FLOAT) {
                    code.append("    fadd\n");
                } else {
                    code.append("    iadd\n");
                }
            }
            if (ctx.MINUS_ASSIGN() != null) {
                if (s.tipo == Tipo.FLOAT) {
                    code.append("    fsub\n");
                } else {
                    code.append("    isub\n");
                }
            }
        }

        // Guardar resultado
        if (s.tipo == Tipo.INT || s.tipo == Tipo.BOOL) {
            code.append("    istore ").append(s.slotLocal).append("\n");
        } else if (s.tipo == Tipo.FLOAT) {
            code.append("    fstore ").append(s.slotLocal).append("\n");
        } else {
            code.append("    astore ").append(s.slotLocal).append("\n");
        }

        return null;
    }

    @SuppressWarnings("incomplete-switch")
    @Override
    public Void visitPrintStmt(EppParser.PrintStmtContext ctx) {
        // Obtener PrintStream
        code.append("    getstatic java/lang/System/out Ljava/io/PrintStream;\n");

        // Evaluar expresión a imprimir
        visit(ctx.expr());

        // Seleccionar método según tipo estático
        Tipo t = obtenerTipo(ctx.expr());

        switch (t) {
            case INT, BOOL -> code.append("    invokevirtual java/io/PrintStream/println(I)V\n");
            case FLOAT -> code.append("    invokevirtual java/io/PrintStream/println(F)V\n");
            case STRING -> code.append("    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n");
        }

        return null;
    }


    private Tipo obtenerTipo(EppParser.ExprContext ctx) {
        return obtenerTipoOr(ctx.orExpr());
    }

    private Tipo obtenerTipoOr(EppParser.OrExprContext ctx) {
        if (ctx.andExpr().size() > 1) return Tipo.BOOL;
        return obtenerTipoAnd(ctx.andExpr(0));
    }

    private Tipo obtenerTipoAnd(EppParser.AndExprContext ctx) {
        if (ctx.eqExpr().size() > 1) return Tipo.BOOL;
        return obtenerTipoEq(ctx.eqExpr(0));
    }

    private Tipo obtenerTipoEq(EppParser.EqExprContext ctx) {
        if (ctx.relExpr().size() > 1) return Tipo.BOOL;
        return obtenerTipoRel(ctx.relExpr(0));
    }

    private Tipo obtenerTipoRel(EppParser.RelExprContext ctx) {
        if (ctx.addExpr().size() > 1) return Tipo.BOOL;
        return obtenerTipoAdd(ctx.addExpr(0));
    }

    private Tipo obtenerTipoAdd(EppParser.AddExprContext ctx) {
        Tipo t = obtenerTipoMul(ctx.mulExpr(0));
        for (int i = 1; i < ctx.mulExpr().size(); i++) {
            Tipo t2 = obtenerTipoMul(ctx.mulExpr(i));
            if (t == Tipo.FLOAT || t2 == Tipo.FLOAT) t = Tipo.FLOAT;
            else t = Tipo.INT;
        }
        return t;
    }

    private Tipo obtenerTipoMul(EppParser.MulExprContext ctx) {
        Tipo t = obtenerTipoUnary(ctx.unary(0));
        for (int i = 1; i < ctx.unary().size(); i++) {
            Tipo t2 = obtenerTipoUnary(ctx.unary(i));
            if (t == Tipo.FLOAT || t2 == Tipo.FLOAT) t = Tipo.FLOAT;
            else t = Tipo.INT;
        }
        return t;
    }

    private Tipo obtenerTipoUnary(EppParser.UnaryContext ctx) {
        if (ctx.atom() != null) {
            return obtenerTipoAtom(ctx.atom());
        } else {
            Tipo t = obtenerTipoUnary(ctx.unary());
            if (ctx.NOT() != null) {
                return Tipo.BOOL;
            }
            return t; // '-' conserva tipo numérico
        }
    }

    private Tipo obtenerTipoAtom(EppParser.AtomContext ctx) {
        if (ctx.NUMBER() != null) return Tipo.INT;
        if (ctx.FLOAT()  != null) return Tipo.FLOAT;
        if (ctx.STRING() != null) return Tipo.STRING;
        if (ctx.TRUE()   != null || ctx.FALSE() != null) return Tipo.BOOL;

        if (ctx.ID() != null) {
            String nombre = ctx.ID().getText();
            return tabla.obtener(nombre).tipo;
        }

        // (expr)
        return obtenerTipo(ctx.expr());
    }


    @Override
    public Void visitExpr(EppParser.ExprContext ctx) {
        visit(ctx.orExpr());
        return null;
    }

    @Override
    public Void visitOrExpr(EppParser.OrExprContext ctx) {
        // orExpr : andExpr (OR andExpr)*
        visit(ctx.andExpr(0));
        for (int i = 1; i < ctx.andExpr().size(); i++) {
            visit(ctx.andExpr(i));
            // 0/1 OR 0/1 → 0/1
            code.append("    ior\n");
        }
        return null;
    }

    @Override
    public Void visitAndExpr(EppParser.AndExprContext ctx) {
        // andExpr : eqExpr (AND eqExpr)*
        visit(ctx.eqExpr(0));
        for (int i = 1; i < ctx.eqExpr().size(); i++) {
            visit(ctx.eqExpr(i));
            // 0/1 AND 0/1 → 0/1
            code.append("    iand\n");
        }
        return null;
    }

    @Override
    public Void visitEqExpr(EppParser.EqExprContext ctx) {
        // eqExpr : relExpr ((EQ|NEQ) relExpr)?
        if (ctx.relExpr().size() == 1) {
            visit(ctx.relExpr(0));
            return null;
        }

        EppParser.RelExprContext left = ctx.relExpr(0);
        EppParser.RelExprContext right = ctx.relExpr(1);
        Tipo t = obtenerTipoRel(left);

        // == ó !=
        boolean isEq = (ctx.EQ() != null);

        if (t == Tipo.STRING) {
            // String.equals
            visit(left);
            visit(right);
            code.append("    invokevirtual java/lang/String/equals(Ljava/lang/Object;)Z\n");
            if (!isEq) {
                // negar el booleano: 1 ^ x
                code.append("    iconst_1\n");
                code.append("    ixor\n");
            }
            return null;
        }

        // numérico o booleano
        visit(left);
        visit(right);

        String lTrue = nuevaEtiqueta("eq_true");
        String lEnd  = nuevaEtiqueta("eq_end");

        if (t == Tipo.FLOAT) {
            code.append("    fcmpl\n");
            if (isEq) {
                code.append("    ifeq ").append(lTrue).append("\n");
            } else {
                code.append("    ifne ").append(lTrue).append("\n");
            }
        } else {
            // INT o BOOL
            if (isEq) {
                code.append("    if_icmpeq ").append(lTrue).append("\n");
            } else {
                code.append("    if_icmpne ").append(lTrue).append("\n");
            }
        }

        code.append("    iconst_0\n");
        code.append("    goto ").append(lEnd).append("\n");
        code.append(lTrue).append(":\n");
        code.append("    iconst_1\n");
        code.append(lEnd).append(":\n");

        return null;
    }

    @Override
    public Void visitRelExpr(EppParser.RelExprContext ctx) {
        // relExpr : addExpr ((<,<=,>,>=) addExpr)?
        if (ctx.addExpr().size() == 1) {
            visit(ctx.addExpr(0));
            return null;
        }

        EppParser.AddExprContext left = ctx.addExpr(0);
        EppParser.AddExprContext right = ctx.addExpr(1);
        Tipo t = obtenerTipoAdd(left);

        visit(left);
        visit(right);

        String op = ctx.getChild(1).getText(); // <, <=, >, >=
        String lTrue = nuevaEtiqueta("rel_true");
        String lEnd  = nuevaEtiqueta("rel_end");

        if (t == Tipo.FLOAT) {
            code.append("    fcmpl\n");
            switch (op) {
                case "<"  -> code.append("    iflt ");
                case "<=" -> code.append("    ifle ");
                case ">"  -> code.append("    ifgt ");
                case ">=" -> code.append("    ifge ");
            }
            code.append(lTrue).append("\n");
        } else {
            // INT
            switch (op) {
                case "<"  -> code.append("    if_icmplt ");
                case "<=" -> code.append("    if_icmple ");
                case ">"  -> code.append("    if_icmpgt ");
                case ">=" -> code.append("    if_icmpge ");
            }
            code.append(lTrue).append("\n");
        }

        code.append("    iconst_0\n");
        code.append("    goto ").append(lEnd).append("\n");
        code.append(lTrue).append(":\n");
        code.append("    iconst_1\n");
        code.append(lEnd).append(":\n");

        return null;
    }

    @Override
    public Void visitAddExpr(EppParser.AddExprContext ctx) {
        // addExpr : mulExpr ((PLUS|MINUS) mulExpr)*
        Tipo t = obtenerTipoMul(ctx.mulExpr(0));
        visit(ctx.mulExpr(0));

        for (int i = 1; i < ctx.mulExpr().size(); i++) {
            Tipo t2 = obtenerTipoMul(ctx.mulExpr(i));
            boolean resultFloat = (t == Tipo.FLOAT || t2 == Tipo.FLOAT);

            // promover acumulado si hace falta
            if (resultFloat && t == Tipo.INT) {
                code.append("    i2f\n");
            }

            // siguiente operando
            visit(ctx.mulExpr(i));
            if (resultFloat && t2 == Tipo.INT) {
                code.append("    i2f\n");
            }

            String op = ctx.getChild(2 * i - 1).getText(); // + o -

            if (op.equals("+")) {
                code.append(resultFloat ? "    fadd\n" : "    iadd\n");
            } else {
                code.append(resultFloat ? "    fsub\n" : "    isub\n");
            }

            t = resultFloat ? Tipo.FLOAT : Tipo.INT;
        }

        return null;
    }

    @Override
    public Void visitMulExpr(EppParser.MulExprContext ctx) {
        // mulExpr : unary ((MUL|DIV) unary)*
        Tipo t = obtenerTipoUnary(ctx.unary(0));
        visit(ctx.unary(0));

        for (int i = 1; i < ctx.unary().size(); i++) {
            Tipo t2 = obtenerTipoUnary(ctx.unary(i));
            boolean resultFloat = (t == Tipo.FLOAT || t2 == Tipo.FLOAT);

            if (resultFloat && t == Tipo.INT) {
                code.append("    i2f\n");
            }

            visit(ctx.unary(i));
            if (resultFloat && t2 == Tipo.INT) {
                code.append("    i2f\n");
            }

            String op = ctx.getChild(2 * i - 1).getText(); // * o /
            if (op.equals("*")) {
                code.append(resultFloat ? "    fmul\n" : "    imul\n");
            } else {
                code.append(resultFloat ? "    fdiv\n" : "    idiv\n");
            }

            t = resultFloat ? Tipo.FLOAT : Tipo.INT;
        }

        return null;
    }

    @Override
    public Void visitUnary(EppParser.UnaryContext ctx) {
        if (ctx.atom() != null) {
            visit(ctx.atom());
            return null;
        }

        // (NOT | MINUS) unary
        visit(ctx.unary());

        if (ctx.NOT() != null) {
            // !x → 1 ^ x   (x es 0/1)
            code.append("    iconst_1\n");
            code.append("    ixor\n");
        } else if (ctx.MINUS() != null) {
            Tipo t = obtenerTipoUnary(ctx);
            if (t == Tipo.FLOAT) {
                code.append("    fneg\n");
            } else {
                code.append("    ineg\n");
            }
        }

        return null;
    }

    @Override
    public Void visitAtom(EppParser.AtomContext ctx) {
        if (ctx.NUMBER() != null) {
            code.append("    ldc ").append(ctx.NUMBER().getText()).append("\n");
        } else if (ctx.FLOAT() != null) {
            code.append("    ldc ").append(ctx.FLOAT().getText()).append("\n");
        } else if (ctx.STRING() != null) {
            code.append("    ldc ").append(ctx.STRING().getText()).append("\n");
        } else if (ctx.TRUE() != null) {
            code.append("    iconst_1\n");
        } else if (ctx.FALSE() != null) {
            code.append("    iconst_0\n");
        } else if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            Simbolo s = tabla.obtener(id);
            if (s.tipo == Tipo.INT || s.tipo == Tipo.BOOL) {
                code.append("    iload ").append(s.slotLocal).append("\n");
            } else if (s.tipo == Tipo.FLOAT) {
                code.append("    fload ").append(s.slotLocal).append("\n");
            } else {
                code.append("    aload ").append(s.slotLocal).append("\n");
            }
        } else {
            // ( expr )
            visit(ctx.expr());
        }

        return null;
    }


    @Override
    public Void visitIfStmt(EppParser.IfStmtContext ctx) {
        int numElseIf = ctx.elseifHeader().size();
        boolean hasElse = ctx.elseHeader() != null;
        int numBlocks = ctx.block().size();

        String lEnd = nuevaEtiqueta("endif");
        String nextLabel = nuevaEtiqueta("if_next");

        // Rama principal (if)
        generarCondicion(ctx.condition(), nextLabel);
        visit(ctx.block(0));
        code.append("    goto ").append(lEnd).append("\n");
        code.append(nextLabel).append(":\n");

        // Ramas else-if
        for (int i = 0; i < numElseIf; i++) {
            String nextLabelElseIf = nuevaEtiqueta("if_next");
            EppParser.ConditionContext cond = ctx.elseifHeader(i).condition();
            generarCondicion(cond, nextLabelElseIf);
            visit(ctx.block(i + 1));
            code.append("    goto ").append(lEnd).append("\n");
            code.append(nextLabelElseIf).append(":\n");
        }

        // Rama else opcional
        if (hasElse) {
            // el último bloque es el del else
            visit(ctx.block(numBlocks - 1));
        }

        code.append(lEnd).append(":\n");
        return null;
    }


    @Override
    public Void visitWhileStmt(EppParser.WhileStmtContext ctx) {
        String lInicio = nuevaEtiqueta("while_ini");
        String lFin = nuevaEtiqueta("while_fin");

        code.append(lInicio).append(":\n");
        generarCondicion(ctx.condition(), lFin);
        visit(ctx.block());
        code.append("    goto ").append(lInicio).append("\n");
        code.append(lFin).append(":\n");

        return null;
    }


    @Override
    public Void visitForStmt(EppParser.ForStmtContext ctx) {
        // inicialización
        visit(ctx.assignInitStmt());

        String lCond = nuevaEtiqueta("for_cond");
        String lFin = nuevaEtiqueta("for_fin");

        code.append(lCond).append(":\n");

        generarCondicion(ctx.condition(), lFin);

        // cuerpo
        visit(ctx.block());

        // incremento
        visit(ctx.assignReStmt());

        code.append("    goto ").append(lCond).append("\n");
        code.append(lFin).append(":\n");

        return null;
    }


    private void generarCondicion(EppParser.ConditionContext cond, String etiquetaFallo) {
        // Expresión condicional → resultado booleano (0/1) en pila
        visit(cond.expr());
        // Si es falso (0) → saltar
        code.append("    ifeq ").append(etiquetaFallo).append("\n");
    }
}
