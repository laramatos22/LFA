// Generated from FractionCalculator.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FractionCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FractionCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FractionCalculatorParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FractionCalculatorParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractionCalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(FractionCalculatorParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractionCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FractionCalculatorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractionCalculatorParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(FractionCalculatorParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(FractionCalculatorParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(FractionCalculatorParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(FractionCalculatorParser.ExprNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenthesis(FractionCalculatorParser.ExprParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAssignment}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssignment(FractionCalculatorParser.ExprAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(FractionCalculatorParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReduce(FractionCalculatorParser.ExprReduceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFraction(FractionCalculatorParser.ExprFractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDivPotencia}
	 * labeled alternative in {@link FractionCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivPotencia(FractionCalculatorParser.ExprMultDivPotenciaContext ctx);
}