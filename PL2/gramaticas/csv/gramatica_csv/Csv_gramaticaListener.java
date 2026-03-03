// Generated from Csv_gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Csv_gramaticaParser}.
 */
public interface Csv_gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Csv_gramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Csv_gramaticaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Csv_gramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Csv_gramaticaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Csv_gramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Csv_gramaticaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Csv_gramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Csv_gramaticaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Csv_gramaticaParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(Csv_gramaticaParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Csv_gramaticaParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(Csv_gramaticaParser.CampoContext ctx);
}