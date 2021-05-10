// Generated from CalculadoraPrefixa.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraPrefixaParser}.
 */
public interface CalculadoraPrefixaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculadoraPrefixaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculadoraPrefixaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraPrefixaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculadoraPrefixaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraPrefixaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CalculadoraPrefixaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraPrefixaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CalculadoraPrefixaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPreffix}
	 * labeled alternative in {@link CalculadoraPrefixaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPreffix(CalculadoraPrefixaParser.ExprPreffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPreffix}
	 * labeled alternative in {@link CalculadoraPrefixaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPreffix(CalculadoraPrefixaParser.ExprPreffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link CalculadoraPrefixaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(CalculadoraPrefixaParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link CalculadoraPrefixaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(CalculadoraPrefixaParser.ExprNumberContext ctx);
}