import java.util.ArrayDeque;
import java.util.Deque;

public class AstPrinterListener extends EppBaseListener {
    private final StringBuilder out = new StringBuilder();
    private int indent = 0;

    // Etiquetas pendientes para el siguiente `block` (Then / ElseIf#k / Else)
    private final Deque<String> pendingBlockLabels = new ArrayDeque<>();
    // Pila para saber si un block abrió indent por etiqueta
    private final Deque<Boolean> blockLabeled = new ArrayDeque<>();
    // Contador de elseif por cada if
    private int elseifCount = 0;

    private void line(String s) {
        for (int i = 0; i < indent; i++) out.append("  ");
        out.append(s).append("\n");
    }

    public String getText() { return out.toString(); }

    // -------- Programa
    @Override public void enterProgram(EppParser.ProgramContext ctx) {
        line("Program"); indent++;
    }
    @Override public void exitProgram(EppParser.ProgramContext ctx) { indent--; }

    // -------- Sentencias
    @Override public void enterAssignInitStmt(EppParser.AssignInitStmtContext ctx) {
        line("AssignInit id=" + ctx.ID().getText()); indent++;
    }
    @Override public void exitAssignInitStmt(EppParser.AssignInitStmtContext ctx) { indent--; }

    @Override public void enterAssignReStmt(EppParser.AssignReStmtContext ctx) {
        String op = ctx.ASSIGN()!=null ? "=" : (ctx.PLUS_ASSIGN()!=null?"+=":"-=");
        line("Assign id=" + ctx.ID().getText() + " op=" + op); indent++;
    }
    @Override public void exitAssignReStmt(EppParser.AssignReStmtContext ctx) { indent--; }

    @Override public void enterPrintStmt(EppParser.PrintStmtContext ctx) {
        line("Print"); indent++;
    }
    @Override public void exitPrintStmt(EppParser.PrintStmtContext ctx) { indent--; }

    // -------- IF / ELSEIF / ELSE (con bloques etiquetados)
    @Override public void enterIfStmt(EppParser.IfStmtContext ctx) {
        line("If"); indent++; elseifCount = 0;
    }
    @Override public void exitIfStmt(EppParser.IfStmtContext ctx) { indent--; }

    @Override public void enterCondition(EppParser.ConditionContext ctx) {
        line("Cond"); indent++;
    }
    @Override public void exitCondition(EppParser.ConditionContext ctx) { indent--; }

    @Override public void enterThenHeader(EppParser.ThenHeaderContext ctx) {
        pendingBlockLabels.addLast("Then");
    }
    @Override public void enterElseifHeader(EppParser.ElseifHeaderContext ctx) {
        pendingBlockLabels.addLast("ElseIf#" + (++elseifCount));
    }
    @Override public void enterElseHeader(EppParser.ElseHeaderContext ctx) {
        pendingBlockLabels.addLast("Else");
    }

    @Override public void enterBlock(EppParser.BlockContext ctx) {
        if (!pendingBlockLabels.isEmpty()) {
            line(pendingBlockLabels.removeFirst());
            indent++; blockLabeled.push(true);
        } else {
            blockLabeled.push(false);
        }
    }
    @Override public void exitBlock(EppParser.BlockContext ctx) {
        if (!blockLabeled.isEmpty() && blockLabeled.pop()) indent--;
    }

    // -------- Expresiones (nodos compactos y legibles)
    @Override public void enterOrExpr(EppParser.OrExprContext ctx) {
        if (!ctx.OR().isEmpty()) { line("Or"); indent++; }
    }
    @Override public void exitOrExpr(EppParser.OrExprContext ctx) {
        if (!ctx.OR().isEmpty()) indent--;
    }

    @Override public void enterAndExpr(EppParser.AndExprContext ctx) {
        if (!ctx.AND().isEmpty()) { line("And"); indent++; }
    }
    @Override public void exitAndExpr(EppParser.AndExprContext ctx) {
        if (!ctx.AND().isEmpty()) indent--;
    }

    @Override public void enterEqExpr(EppParser.EqExprContext ctx) {
        if (ctx.getChildCount() > 1) {
            String op = ctx.EQ()!=null ? "==" : "!=";
            line("Eq op=" + op); indent++;
        }
    }
    @Override public void exitEqExpr(EppParser.EqExprContext ctx) {
        if (ctx.getChildCount() > 1) indent--;
    }

    @Override public void enterRelExpr(EppParser.RelExprContext ctx) {
        if (ctx.getChildCount() > 1) {
            String op = ctx.LT()!=null?"<":ctx.LE()!=null?"<=":ctx.GT()!=null?">":">=";
            line("Rel op=" + op); indent++;
        }
    }
    @Override public void exitRelExpr(EppParser.RelExprContext ctx) {
        if (ctx.getChildCount() > 1) indent--;
    }

    @Override public void enterAddExpr(EppParser.AddExprContext ctx) {
        if (ctx.getChildCount() > 1) { line("AddSub"); indent++; }
    }
    @Override public void exitAddExpr(EppParser.AddExprContext ctx) {
        if (ctx.getChildCount() > 1) indent--;
    }

    @Override public void enterMulExpr(EppParser.MulExprContext ctx) {
        if (ctx.getChildCount() > 1) { line("MulDiv"); indent++; }
    }
    @Override public void exitMulExpr(EppParser.MulExprContext ctx) {
        if (ctx.getChildCount() > 1) indent--;
    }

    @Override public void enterUnary(EppParser.UnaryContext ctx) {
        if (ctx.atom()==null) {
            String op = ctx.NOT()!=null ? "!" : "u-";
            line("Unary op=" + op); indent++;
        }
    }
    @Override public void exitUnary(EppParser.UnaryContext ctx) {
        if (ctx.atom()==null) indent--;
    }

    @Override public void enterAtom(EppParser.AtomContext ctx) {
        if (ctx.NUMBER()!=null) { line("Int " + ctx.NUMBER().getText()); return; }
        if (ctx.FLOAT()!=null)  { line("Float " + ctx.FLOAT().getText()); return; }
        if (ctx.STRING()!=null) { line("String " + ctx.STRING().getText()); return; }
        if (ctx.TRUE()!=null)   { line("Bool verdadero"); return; }
        if (ctx.FALSE()!=null)  { line("Bool falso"); return; }
        if (ctx.ID()!=null)     { line("Id " + ctx.ID().getText()); return; }
        // Si es '(' expr ')', no imprimimos nodo extra; lo verá el hijo.
    }
}
