// Generated from Epp.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EppParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EppVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EppParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EppParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtInitAssign}
	 * labeled alternative in {@link EppParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtInitAssign(EppParser.StmtInitAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtReAssign}
	 * labeled alternative in {@link EppParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtReAssign(EppParser.StmtReAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtPrint}
	 * labeled alternative in {@link EppParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPrint(EppParser.StmtPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtFor}
	 * labeled alternative in {@link EppParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFor(EppParser.StmtForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtWhile}
	 * labeled alternative in {@link EppParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtWhile(EppParser.StmtWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#assignInitStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignInitStmt(EppParser.AssignInitStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#assignReStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignReStmt(EppParser.AssignReStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(EppParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(EppParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(EppParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(EppParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(EppParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#thenHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenHeader(EppParser.ThenHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#elseifHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifHeader(EppParser.ElseifHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#elseHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseHeader(EppParser.ElseHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(EppParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(EppParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(EppParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(EppParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(EppParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#relExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(EppParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(EppParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(EppParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(EppParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EppParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(EppParser.AtomContext ctx);
}