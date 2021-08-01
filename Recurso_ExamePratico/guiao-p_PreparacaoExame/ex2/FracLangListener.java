// Generated from FracLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FracLangParser}.
 */
public interface FracLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssign(FracLangParser.StatAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssign(FracLangParser.StatAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatDisplay}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatDisplay(FracLangParser.StatDisplayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatDisplay}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatDisplay(FracLangParser.StatDisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FracLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FracLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(FracLangParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(FracLangParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(FracLangParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(FracLangParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(FracLangParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(FracLangParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(FracLangParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(FracLangParser.ExprNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(FracLangParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(FracLangParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(FracLangParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(FracLangParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(FracLangParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(FracLangParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPlusMinus}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPlusMinus(FracLangParser.ExprPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPlusMinus}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPlusMinus(FracLangParser.ExprPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFraction(FracLangParser.ExprFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFraction(FracLangParser.ExprFractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReadString}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReadString(FracLangParser.ExprReadStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReadString}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReadString(FracLangParser.ExprReadStringContext ctx);
}