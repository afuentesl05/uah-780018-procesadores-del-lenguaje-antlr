public class AnalizadorSemantico extends EppBaseVisitor<Tipo> {

    private final TablaSimbolos tabla = new TablaSimbolos();

    public TablaSimbolos getTabla() {
        return this.tabla;
    }


    @Override
    public Tipo visitAssignInitStmt(EppParser.AssignInitStmtContext ctx) {
        String id = ctx.ID().getText();
        Tipo tipoExpr = visit(ctx.expr());

        if (tabla.existe(id)) {
            throw new RuntimeException("Error: variable '" + id + "' ya declarada");
        }

        tabla.declarar(id, tipoExpr);
        return tipoExpr;
    }

    @Override
    public Tipo visitAssignReStmt(EppParser.AssignReStmtContext ctx) {
        String id = ctx.ID().getText();

        if (!tabla.existe(id)) {
            throw new RuntimeException("Error: variable '" + id + "' no declarada");
        }

        Simbolo s = tabla.obtener(id);
        Tipo tipoVar = s.tipo;
        Tipo tipoExpr = visit(ctx.expr());

        // operadores compuestos
        if (ctx.PLUS_ASSIGN() != null || ctx.MINUS_ASSIGN() != null) {
            if (!esNumerico(tipoVar) || !esNumerico(tipoExpr)) {
                throw new RuntimeException("Error: '" + ctx.getChild(1).getText() + "' solo válido para números");
            }
            return tipoVar;
        }

        // asignación simple
        if (tipoVar != tipoExpr) {
            throw new RuntimeException("Error: tipos incompatibles en asignación a '" + id + "'");
        }

        return tipoVar;
    }

    @Override
    public Tipo visitPrintStmt(EppParser.PrintStmtContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Tipo visitCondition(EppParser.ConditionContext ctx) {
        Tipo t = visit(ctx.expr());
        if (t != Tipo.BOOL) {
            throw new RuntimeException("Error: la condición debe ser booleana");
        }
        return Tipo.BOOL;
    }


    @Override
    public Tipo visitExpr(EppParser.ExprContext ctx) {
        return visit(ctx.orExpr());
    }

    // OR
    @Override
    public Tipo visitOrExpr(EppParser.OrExprContext ctx) {
        if (ctx.andExpr().size() == 1) {
            return visit(ctx.andExpr(0));
        }

        // OR requiere booleanos
        for (EppParser.AndExprContext a : ctx.andExpr()) {
            if (visit(a) != Tipo.BOOL) {
                throw new RuntimeException("Error: '||' solo aplica a booleanos");
            }
        }
        return Tipo.BOOL;
    }

    // AND
    @Override
    public Tipo visitAndExpr(EppParser.AndExprContext ctx) {
        if (ctx.eqExpr().size() == 1) {
            return visit(ctx.eqExpr(0));
        }

        for (EppParser.EqExprContext e : ctx.eqExpr()) {
            if (visit(e) != Tipo.BOOL) {
                throw new RuntimeException("Error: '&&' solo aplica a booleanos");
            }
        }
        return Tipo.BOOL;
    }

    // ==, !=
    @Override
    public Tipo visitEqExpr(EppParser.EqExprContext ctx) {
        Tipo t1 = visit(ctx.relExpr(0));
        if (ctx.relExpr().size() == 1) return t1;

        Tipo t2 = visit(ctx.relExpr(1));

        if (t1 != t2) {
            throw new RuntimeException("Error: comparación '=='/'!=' entre tipos incompatibles");
        }
        return Tipo.BOOL;
    }

    // <, <=, >, >=
    @Override
    public Tipo visitRelExpr(EppParser.RelExprContext ctx) {
        Tipo t1 = visit(ctx.addExpr(0));
        if (ctx.addExpr().size() == 1) return t1;

        Tipo t2 = visit(ctx.addExpr(1));
        if (!esNumerico(t1) || !esNumerico(t2)) {
            throw new RuntimeException("Error: comparaciones numéricas requieren números");
        }
        return Tipo.BOOL;
    }

    // +, -
    @Override
    public Tipo visitAddExpr(EppParser.AddExprContext ctx) {
        Tipo t = visit(ctx.mulExpr(0));

        for (int i = 1; i < ctx.mulExpr().size(); i++) {
            Tipo t2 = visit(ctx.mulExpr(i));
            if (!esNumerico(t) || !esNumerico(t2)) {
                throw new RuntimeException("Error: suma/resta solo válida para números");
            }
            if (t == Tipo.FLOAT || t2 == Tipo.FLOAT) t = Tipo.FLOAT;
        }
        return t;
    }

    // *, /
    @Override
    public Tipo visitMulExpr(EppParser.MulExprContext ctx) {
        Tipo t = visit(ctx.unary(0));

        for (int i = 1; i < ctx.unary().size(); i++) {
            Tipo t2 = visit(ctx.unary(i));
            if (!esNumerico(t) || !esNumerico(t2)) {
                throw new RuntimeException("Error: multiplicación/división solo válida para números");
            }
            if (t == Tipo.FLOAT || t2 == Tipo.FLOAT) t = Tipo.FLOAT;
        }

        return t;
    }

    @Override
    public Tipo visitUnary(EppParser.UnaryContext ctx) {
        if (ctx.atom() != null) return visit(ctx.atom());

        Tipo t = visit(ctx.unary());
        if (ctx.NOT() != null) {
            if (t != Tipo.BOOL) throw new RuntimeException("Error: '!' solo aplica a booleanos");
            return Tipo.BOOL;
        }
        if (ctx.MINUS() != null) {
            if (!esNumerico(t)) throw new RuntimeException("Error: '-' unario solo aplica a números");
            return t;
        }
        return t;
    }

    @Override
    public Tipo visitAtom(EppParser.AtomContext ctx) {

        if (ctx.NUMBER() != null) return Tipo.INT;
        if (ctx.FLOAT()  != null) return Tipo.FLOAT;
        if (ctx.STRING() != null) return Tipo.STRING;
        if (ctx.TRUE()   != null || ctx.FALSE() != null) return Tipo.BOOL;

        if (ctx.ID() != null) {
            String name = ctx.ID().getText();
            if (!tabla.existe(name)) {
                throw new RuntimeException("Error: variable '" + name + "' no declarada");
            }
            return tabla.obtener(name).tipo;
        }

        // paréntesis
        return visit(ctx.expr());
    }

    

    private boolean esNumerico(Tipo t) {
        return t == Tipo.INT || t == Tipo.FLOAT;
    }
}
