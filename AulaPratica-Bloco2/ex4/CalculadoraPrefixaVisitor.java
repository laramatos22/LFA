// Generated from CalculadoraPrefixa.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculadoraPrefixaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculadoraPrefixaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculadoraPrefixaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CalculadoraPrefixaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraPrefixaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CalculadoraPrefixaParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPreffix}
	 * labeled alternative in {@link CalculadoraPrefixaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPreffix(CalculadoraPrefixaParser.ExprPreffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link CalculadoraPrefixaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(CalculadoraPrefixaParser.ExprNumberContext ctx);
}