// Generated from D:/Szkola/Semestr_9/SISW/Projekt\Colorful.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ColorfulParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, EQ=8, GREATER=9, 
		LESS=10, MUL=11, DIV=12, ADD=13, SUB=14, ID=15, INT=16, NEWLINE=17, WS=18;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_black = 2, RULE_white = 3, RULE_expr = 4, 
		RULE_relational = 5, RULE_loop = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "black", "white", "expr", "relational", "loop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'White'", "'Black'", "'('", "')'", "'Gold'", "'Light'", "'Dark'", 
			"'mix'", "'>'", "'<'", "'pink'", "'orange'", "'red'", "'blue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "EQ", "GREATER", "LESS", 
			"MUL", "DIV", "ADD", "SUB", "ID", "INT", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Colorful.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ColorfulParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				stat();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0) );
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
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OutputContext extends StatContext {
		public BlackContext black() {
			return getRuleContext(BlackContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ColorfulParser.NEWLINE, 0); }
		public OutputContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputContext extends StatContext {
		public TerminalNode ID() { return getToken(ColorfulParser.ID, 0); }
		public TerminalNode EQ() { return getToken(ColorfulParser.EQ, 0); }
		public WhiteContext white() {
			return getRuleContext(WhiteContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ColorfulParser.NEWLINE, 0); }
		public InputContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends StatContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ColorfulParser.NEWLINE, 0); }
		public WhileLoopContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(ColorfulParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitBlank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelatContext extends StatContext {
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ColorfulParser.NEWLINE, 0); }
		public RelatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterRelat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitRelat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitRelat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ColorfulParser.NEWLINE, 0); }
		public PrintExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(ColorfulParser.ID, 0); }
		public TerminalNode EQ() { return getToken(ColorfulParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ColorfulParser.NEWLINE, 0); }
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				expr(0);
				setState(20);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(ID);
				setState(23);
				match(EQ);
				setState(24);
				expr(0);
				setState(25);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				loop();
				setState(28);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new RelatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				relational();
				setState(31);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				black();
				setState(34);
				match(NEWLINE);
				}
				break;
			case 6:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(36);
				match(ID);
				setState(37);
				match(EQ);
				setState(38);
				match(T__0);
				setState(39);
				white();
				setState(40);
				match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				match(NEWLINE);
				}
				break;
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

	public static class BlackContext extends ParserRuleContext {
		public BlackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_black; }
	 
		public BlackContext() { }
		public void copyFrom(BlackContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OutContext extends BlackContext {
		public TerminalNode INT() { return getToken(ColorfulParser.INT, 0); }
		public OutContext(BlackContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlackContext black() throws RecognitionException {
		BlackContext _localctx = new BlackContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_black);
		try {
			_localctx = new OutContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(46);
			match(INT);
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

	public static class WhiteContext extends ParserRuleContext {
		public WhiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_white; }
	 
		public WhiteContext() { }
		public void copyFrom(WhiteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InContext extends WhiteContext {
		public TerminalNode INT() { return getToken(ColorfulParser.INT, 0); }
		public InContext(WhiteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhiteContext white() throws RecognitionException {
		WhiteContext _localctx = new WhiteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_white);
		try {
			_localctx = new InContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(INT);
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
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ColorfulParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ColorfulParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ColorfulParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ColorfulParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(ColorfulParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(ColorfulParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitInt(this);
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(ID);
				}
				break;
			case T__2:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(T__2);
				setState(54);
				expr(0);
				setState(55);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(60);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(61);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(62);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(63);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(64);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class RelationalContext extends ParserRuleContext {
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
	 
		public RelationalContext() { }
		public void copyFrom(RelationalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GreaterEqualContext extends RelationalContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(ColorfulParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(ColorfulParser.LESS, 0); }
		public GreaterEqualContext(RelationalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterGreaterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitGreaterEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitGreaterEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relational);
		int _la;
		try {
			_localctx = new GreaterEqualContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			expr(0);
			setState(71);
			((GreaterEqualContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==GREATER || _la==LESS) ) {
				((GreaterEqualContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72);
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

	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileContext extends LoopContext {
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ColorfulParser.NEWLINE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loop);
		int _la;
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__4);
			setState(75);
			match(T__2);
			setState(76);
			relational();
			setState(77);
			match(T__3);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(78);
				match(NEWLINE);
				}
			}

			setState(81);
			match(T__5);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(82);
				stat();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(T__6);
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
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6<\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6D\n\6\f\6\16\6G\13"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\3\b\3\b\7\bV\n\b\f\b\16"+
		"\bY\13\b\3\b\3\b\3\b\2\3\n\t\2\4\6\b\n\f\16\2\5\3\2\r\16\3\2\17\20\3\2"+
		"\13\f\2b\2\21\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\b\62\3\2\2\2\n;\3\2\2\2\f"+
		"H\3\2\2\2\16L\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21"+
		"\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26\5\n\6\2\26\27\7\23\2\2\27.\3"+
		"\2\2\2\30\31\7\21\2\2\31\32\7\n\2\2\32\33\5\n\6\2\33\34\7\23\2\2\34.\3"+
		"\2\2\2\35\36\5\16\b\2\36\37\7\23\2\2\37.\3\2\2\2 !\5\f\7\2!\"\7\23\2\2"+
		"\".\3\2\2\2#$\5\6\4\2$%\7\23\2\2%.\3\2\2\2&\'\7\21\2\2\'(\7\n\2\2()\7"+
		"\3\2\2)*\5\b\5\2*+\7\23\2\2+.\3\2\2\2,.\7\23\2\2-\25\3\2\2\2-\30\3\2\2"+
		"\2-\35\3\2\2\2- \3\2\2\2-#\3\2\2\2-&\3\2\2\2-,\3\2\2\2.\5\3\2\2\2/\60"+
		"\7\4\2\2\60\61\7\22\2\2\61\7\3\2\2\2\62\63\7\22\2\2\63\t\3\2\2\2\64\65"+
		"\b\6\1\2\65<\7\22\2\2\66<\7\21\2\2\678\7\5\2\289\5\n\6\29:\7\6\2\2:<\3"+
		"\2\2\2;\64\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2<E\3\2\2\2=>\f\7\2\2>?\t\2\2"+
		"\2?D\5\n\6\b@A\f\6\2\2AB\t\3\2\2BD\5\n\6\7C=\3\2\2\2C@\3\2\2\2DG\3\2\2"+
		"\2EC\3\2\2\2EF\3\2\2\2F\13\3\2\2\2GE\3\2\2\2HI\5\n\6\2IJ\t\4\2\2JK\5\n"+
		"\6\2K\r\3\2\2\2LM\7\7\2\2MN\7\5\2\2NO\5\f\7\2OQ\7\6\2\2PR\7\23\2\2QP\3"+
		"\2\2\2QR\3\2\2\2RS\3\2\2\2SW\7\b\2\2TV\5\4\3\2UT\3\2\2\2VY\3\2\2\2WU\3"+
		"\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\t\2\2[\17\3\2\2\2\t\23-;CEQW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}