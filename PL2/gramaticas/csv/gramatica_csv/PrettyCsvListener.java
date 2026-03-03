import org.antlr.v4.runtime.Token;

public class PrettyCsvListener extends Csv_gramaticaBaseListener {
    private final StringBuilder out = new StringBuilder();
    private int indent = 0;

    private void line(String s) {
        for (int i = 0; i < indent; i++) out.append("  ");
        out.append(s).append("\n");
    }

    // prog: ... ;
    @Override
    public void enterProg(Csv_gramaticaParser.ProgContext ctx) {
        line("CSV");
        indent++;
    }
    @Override
    public void exitProg(Csv_gramaticaParser.ProgContext ctx) { indent--; }

    // expr: ... ;
    @Override
    public void enterExpr(Csv_gramaticaParser.ExprContext ctx) {
        line("Fila");
        indent++;
    }
    @Override
    public void exitExpr(Csv_gramaticaParser.ExprContext ctx) { indent--; }

    // campo: NUMERO | NUM_COMAS | TIEMPO | FECHA | PAREJA_N | PALABRA | TEXTO | PAREJA_P ;
    @Override
    public void enterCampo(Csv_gramaticaParser.CampoContext ctx) {
        Token t = ctx.getStart();                         // primer token del campo
        int type = t.getType();                           // id del tipo léxico
        String sym = Csv_gramaticaLexer.VOCABULARY.getSymbolicName(type); // p.ej. "FECHA"
        String etiqueta = switch (sym) {
            case "NUMERO"    -> "Número";
            case "NUM_COMAS" -> "NúmeroDecimal";
            case "TIEMPO"    -> "Hora";
            case "FECHA"     -> "Fecha";
            case "PAREJA_N"  -> "ParNum";
            case "PALABRA"   -> "Palabra";
            case "TEXTO"     -> "Texto";
            case "PAREJA_P"  -> "ParTexto";
            default          -> "Valor";
        };
        line(etiqueta + ": " + ctx.getText());
    }

    public String getText() { return out.toString(); }
}
