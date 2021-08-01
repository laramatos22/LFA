// Generated from SetCalcMain.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SetCalcMainParser}.
 */
public interface SetCalcMainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SetCalcMainParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SetCalcMainParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetCalcMainParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SetCalcMainParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link SetCalcMainParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssign(SetCalcMainParser.StatAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link SetCalcMainParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssign(SetCalcMainParser.StatAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link SetCalcMainParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatExpr(SetCalcMainParser.StatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link SetCalcMainParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatExpr(SetCalcMainParser.StatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetCalcMainParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SetCalcMainParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetCalcMainParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SetCalcMainParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVariables}
	 * labeled alternative in {@link SetCalcMainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVariables(SetCalcMainParser.ExprVariablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVariables}
	 * labeled alternative in {@link SetCalcMainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVariables(SetCalcMainParser.ExprVariablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link SetCalcMainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(SetCalcMainParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link SetCalcMainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(SetCalcMainParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumbers}
	 * labeled alternative in {@link SetCalcMainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumbers(SetCalcMainParser.ExprNumbersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumbers}
	 * labeled alternative in {@link SetCalcMainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumbers(SetCalcMainParser.ExprNumbersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnion}
	 * labeled alternative in {@link SetCalcMainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnion(SetCalcMainParser.ExprUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnion}
	 * labeled alternative in {@link SetCalcMainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnion(SetCalcMainParser.ExprUnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDifference}
	 * labeled alternative in {@link SetCalcMainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDifference(SetCalcMainParser.ExprDifferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDifference}
	 * labeled alternative in {@link SetCalcMainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDifference(SetCalcMainParser.ExprDifferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIntersect}
	 * labeled alternative in {@link SetCalcMainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIntersect(SetCalcMainParser.ExprIntersectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIntersect}
	 * labeled alternative in {@link SetCalcMainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIntersect(SetCalcMainParser.ExprIntersectContext ctx);
}