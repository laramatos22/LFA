// Generated from FractionCalculator.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FractionCalculatorParser}.
 */
public interface FractionCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FractionCalculatorParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FractionCalculatorParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractionCalculatorParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FractionCalculatorParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractionCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(FractionCalculatorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractionCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(FractionCalculatorParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractionCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FractionCalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractionCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FractionCalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractionCalculatorParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(FractionCalculatorParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractionCalculatorParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(FractionCalculatorParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(FractionCalculatorParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(FractionCalculatorParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(FractionCalculatorParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(FractionCalculatorParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(FractionCalculatorParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(FractionCalculatorParser.ExprNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesis(FractionCalculatorParser.ExprParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesis(FractionCalculatorParser.ExprParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAssignment(FractionCalculatorParser.ExprAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAssignment(FractionCalculatorParser.ExprAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(FractionCalculatorParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(FractionCalculatorParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(FractionCalculatorParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(FractionCalculatorParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFraction(FractionCalculatorParser.ExprFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFraction(FractionCalculatorParser.ExprFractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivPotencia}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivPotencia(FractionCalculatorParser.ExprMultDivPotenciaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivPotencia}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivPotencia(FractionCalculatorParser.ExprMultDivPotenciaContext ctx);
}