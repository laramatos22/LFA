// Generated from Hello.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(HelloParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(HelloParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#greetings}.
	 * @param ctx the parse tree
	 */
	void enterGreetings(HelloParser.GreetingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#greetings}.
	 * @param ctx the parse tree
	 */
	void exitGreetings(HelloParser.GreetingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#goodBye}.
	 * @param ctx the parse tree
	 */
	void enterGoodBye(HelloParser.GoodByeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#goodBye}.
	 * @param ctx the parse tree
	 */
	void exitGoodBye(HelloParser.GoodByeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(HelloParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(HelloParser.NameContext ctx);
}