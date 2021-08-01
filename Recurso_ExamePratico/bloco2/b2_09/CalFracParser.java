// Generated from CalFrac.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalFracParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, Integer=12, ID=13, WS=14, COMMENT=15, PONTO=16;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_print = 2, RULE_assignment = 3, 
		RULE_expr = 4, RULE_fraction = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "print", "assignment", "expr", "fraction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'->'", "'*'", "':'", "'+'", "'-'", "'('", "')'", "'^'", 
			"'reduce'", "'/'", null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Integer", "ID", "WS", "COMMENT", "PONTO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CalFrac.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalFracParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CalFracParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracVisitor ) return ((CalFracVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << Integer) | (1L << ID))) != 0)) {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracVisitor ) return ((CalFracVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(20);
				print();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__9:
			case Integer:
			case ID:
				{
				setState(21);
				assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracVisitor ) return ((CalFracVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(CalFracParser.ID, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracVisitor ) return ((CalFracVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			expr(0);
			setState(28);
			match(T__1);
			setState(29);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracVisitor ) return ((CalFracVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPotenciaContext extends ExprContext {
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public TerminalNode Integer() { return getToken(CalFracParser.Integer, 0); }
		public ExprPotenciaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).enterExprPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).exitExprPotencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracVisitor ) return ((CalFracVisitor<? extends T>)visitor).visitExprPotencia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParentContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).enterExprParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).exitExprParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracVisitor ) return ((CalFracVisitor<? extends T>)visitor).visitExprParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).enterExprMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).exitExprMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracVisitor ) return ((CalFracVisitor<? extends T>)visitor).visitExprMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPlusMinusContext extends ExprContext {
		public Token sign;
		public TerminalNode Integer() { return getToken(CalFracParser.Integer, 0); }
		public ExprPlusMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).enterExprPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).exitExprPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracVisitor ) return ((CalFracVisitor<? extends T>)visitor).visitExprPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprReduceContext extends ExprContext {
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public ExprReduceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).enterExprReduce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).exitExprReduce(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracVisitor ) return ((CalFracVisitor<? extends T>)visitor).visitExprReduce(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIdContext extends ExprContext {
		public TerminalNode ID() { return getToken(CalFracParser.ID, 0); }
		public ExprIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).enterExprId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).exitExprId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracVisitor ) return ((CalFracVisitor<? extends T>)visitor).visitExprId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFractionContext extends ExprContext {
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public ExprFractionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).enterExprFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).exitExprFraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracVisitor ) return ((CalFracVisitor<? extends T>)visitor).visitExprFraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPlusMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__5) {
					{
					setState(32);
					((ExprPlusMinusContext)_localctx).sign = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__4 || _la==T__5) ) {
						((ExprPlusMinusContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(35);
				match(Integer);
				}
				break;
			case 2:
				{
				_localctx = new ExprPotenciaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(T__6);
				setState(37);
				fraction();
				setState(38);
				match(T__7);
				setState(39);
				match(T__8);
				setState(40);
				match(Integer);
				}
				break;
			case 3:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(T__6);
				setState(43);
				expr(0);
				setState(44);
				match(T__7);
				}
				break;
			case 4:
				{
				_localctx = new ExprReduceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(T__9);
				setState(47);
				fraction();
				}
				break;
			case 5:
				{
				_localctx = new ExprFractionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				fraction();
				}
				break;
			case 6:
				{
				_localctx = new ExprIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(58);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(52);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(53);
						((ExprMultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((ExprMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(54);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(55);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(56);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(57);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FractionContext extends ParserRuleContext {
		public Token sign;
		public Token num;
		public Token den;
		public List<TerminalNode> Integer() { return getTokens(CalFracParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(CalFracParser.Integer, i);
		}
		public FractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).enterFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracListener ) ((CalFracListener)listener).exitFraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracVisitor ) return ((CalFracVisitor<? extends T>)visitor).visitFraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FractionContext fraction() throws RecognitionException {
		FractionContext _localctx = new FractionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==T__5) {
				{
				setState(63);
				((FractionContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
					((FractionContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(66);
			((FractionContext)_localctx).num = match(Integer);
			setState(67);
			match(T__10);
			setState(68);
			((FractionContext)_localctx).den = match(Integer);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6$\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\65\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\7\5\7C\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\2\3\n\b\2\4\6\b\n\f\2\4\3\2\7\b\3\2\5\6\2M\2\21\3\2\2\2\4"+
		"\30\3\2\2\2\6\32\3\2\2\2\b\35\3\2\2\2\n\64\3\2\2\2\fB\3\2\2\2\16\20\5"+
		"\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3"+
		"\2\2\2\23\21\3\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26\31\5\6\4\2\27\31\5"+
		"\b\5\2\30\26\3\2\2\2\30\27\3\2\2\2\31\5\3\2\2\2\32\33\7\3\2\2\33\34\5"+
		"\n\6\2\34\7\3\2\2\2\35\36\5\n\6\2\36\37\7\4\2\2\37 \7\17\2\2 \t\3\2\2"+
		"\2!#\b\6\1\2\"$\t\2\2\2#\"\3\2\2\2#$\3\2\2\2$%\3\2\2\2%\65\7\16\2\2&\'"+
		"\7\t\2\2\'(\5\f\7\2()\7\n\2\2)*\7\13\2\2*+\7\16\2\2+\65\3\2\2\2,-\7\t"+
		"\2\2-.\5\n\6\2./\7\n\2\2/\65\3\2\2\2\60\61\7\f\2\2\61\65\5\f\7\2\62\65"+
		"\5\f\7\2\63\65\7\17\2\2\64!\3\2\2\2\64&\3\2\2\2\64,\3\2\2\2\64\60\3\2"+
		"\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65>\3\2\2\2\66\67\f\n\2\2\678\t\3\2\2"+
		"8=\5\n\6\139:\f\t\2\2:;\t\2\2\2;=\5\n\6\n<\66\3\2\2\2<9\3\2\2\2=@\3\2"+
		"\2\2><\3\2\2\2>?\3\2\2\2?\13\3\2\2\2@>\3\2\2\2AC\t\2\2\2BA\3\2\2\2BC\3"+
		"\2\2\2CD\3\2\2\2DE\7\16\2\2EF\7\r\2\2FG\7\16\2\2G\r\3\2\2\2\t\21\30#\64"+
		"<>B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}