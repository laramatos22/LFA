// Generated from CalFrac.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalFracParser}.
 */
public interface CalFracListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalFracParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalFracParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalFracParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalFracParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalFracParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CalFracParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalFracParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CalFracParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalFracParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CalFracParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalFracParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CalFracParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalFracParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalFracParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalFracParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalFracParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(CalFracParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(CalFracParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPotencia}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPotencia(CalFracParser.ExprPotenciaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPotencia}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPotencia(CalFracParser.ExprPotenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(CalFracParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(CalFracParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(CalFracParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(CalFracParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPlusMinus}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPlusMinus(CalFracParser.ExprPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPlusMinus}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPlusMinus(CalFracParser.ExprPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(CalFracParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(CalFracParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(CalFracParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(CalFracParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFraction(CalFracParser.ExprFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link CalFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFraction(CalFracParser.ExprFractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalFracParser#fraction}.
	 * @param ctx the parse tree
	 */
	void enterFraction(CalFracParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalFracParser#fraction}.
	 * @param ctx the parse tree
	 */
	void exitFraction(CalFracParser.FractionContext ctx);
}