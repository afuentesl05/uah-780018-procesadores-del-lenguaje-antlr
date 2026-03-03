// Generated from Epp.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EppParser}.
 */
public interface EppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EppParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EppParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EppParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtInitAssign}
	 * labeled alternative in {@link EppParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtInitAssign(EppParser.StmtInitAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtInitAssign}
	 * labeled alternative in {@link EppParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtInitAssign(EppParser.StmtInitAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtReAssign}
	 * labeled alternative in {@link EppParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtReAssign(EppParser.StmtReAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtReAssign}
	 * labeled alternative in {@link EppParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtReAssign(EppParser.StmtReAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtPrint}
	 * labeled alternative in {@link EppParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtPrint(EppParser.StmtPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtPrint}
	 * labeled alternative in {@link EppParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtPrint(EppParser.StmtPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#assignInitStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignInitStmt(EppParser.AssignInitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#assignInitStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignInitStmt(EppParser.AssignInitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#assignReStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignReStmt(EppParser.AssignReStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#assignReStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignReStmt(EppParser.AssignReStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(EppParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(EppParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(EppParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(EppParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(EppParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(EppParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#thenHeader}.
	 * @param ctx the parse tree
	 */
	void enterThenHeader(EppParser.ThenHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#thenHeader}.
	 * @param ctx the parse tree
	 */
	void exitThenHeader(EppParser.ThenHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#elseifHeader}.
	 * @param ctx the parse tree
	 */
	void enterElseifHeader(EppParser.ElseifHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#elseifHeader}.
	 * @param ctx the parse tree
	 */
	void exitElseifHeader(EppParser.ElseifHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#elseHeader}.
	 * @param ctx the parse tree
	 */
	void enterElseHeader(EppParser.ElseHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#elseHeader}.
	 * @param ctx the parse tree
	 */
	void exitElseHeader(EppParser.ElseHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(EppParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(EppParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EppParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EppParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(EppParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(EppParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(EppParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(EppParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(EppParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(EppParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(EppParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(EppParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(EppParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(EppParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(EppParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(EppParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(EppParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(EppParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EppParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(EppParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link EppParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(EppParser.AtomContext ctx);
}