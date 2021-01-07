// Generated from G:/Pr-SISW2\Colorful.g4 by ANTLR 4.9
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, EQ=2, NEQ=3, GREATER=4, LESS=5, GREATER_EQ=6, LESS_EQ=7, MUL=8, 
		DIV=9, ADD=10, SUB=11, PWR=12, SQRT=13, MOD=14, FACTORIAL=15, ASSIGN=16, 
		OPAR=17, CPAR=18, OBRACE=19, CBRACE=20, OUT=21, IN=22, IF=23, ELSE=24, 
		WHILE=25, FOR=26, INT=27, DBL=28, BOOL=29, STR=30, ID=31, NEWLINE=32, 
		COMMENT=33, WS=34, TRUE=35, FALSE=36, STRLIT=37, OTHER=38;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_stat = 2, RULE_reserveMemoryForVariable = 3, 
		RULE_assignment = 4, RULE_operateOnDeclaredVariable = 5, RULE_if_stat = 6, 
		RULE_condition_block = 7, RULE_stat_block = 8, RULE_while_stat = 9, RULE_fore_stat = 10, 
		RULE_blackValue = 11, RULE_blackExpression = 12, RULE_whiteValue = 13, 
		RULE_expr = 14, RULE_atom = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "stat", "reserveMemoryForVariable", "assignment", "operateOnDeclaredVariable", 
			"if_stat", "condition_block", "stat_block", "while_stat", "fore_stat", 
			"blackValue", "blackExpression", "whiteValue", "expr", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'indigo'", "'shake'", "'>'", "'<'", "'>='", "'<='", "'pink'", 
			"'orange'", "'red'", "'blue'", "'aqua'", "'auburn'", "'magenta'", "'capri'", 
			"'mix'", "'('", "')'", "'light'", "'dark'", "'Black'", "'White'", "'transparent'", 
			"'violet'", "'gold'", "'silver'", null, null, null, null, null, null, 
			null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "EQ", "NEQ", "GREATER", "LESS", "GREATER_EQ", "LESS_EQ", 
			"MUL", "DIV", "ADD", "SUB", "PWR", "SQRT", "MOD", "FACTORIAL", "ASSIGN", 
			"OPAR", "CPAR", "OBRACE", "CBRACE", "OUT", "IN", "IF", "ELSE", "WHILE", 
			"FOR", "INT", "DBL", "BOOL", "STR", "ID", "NEWLINE", "COMMENT", "WS", 
			"TRUE", "FALSE", "STRLIT", "OTHER"
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

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				stat();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << OUT) | (1L << IN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID) | (1L << NEWLINE) | (1L << OTHER))) != 0) );
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
		public Token OTHER;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ColorfulParser.NEWLINE, 0); }
		public ReserveMemoryForVariableContext reserveMemoryForVariable() {
			return getRuleContext(ReserveMemoryForVariableContext.class,0);
		}
		public OperateOnDeclaredVariableContext operateOnDeclaredVariable() {
			return getRuleContext(OperateOnDeclaredVariableContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Fore_statContext fore_stat() {
			return getRuleContext(Fore_statContext.class,0);
		}
		public BlackValueContext blackValue() {
			return getRuleContext(BlackValueContext.class,0);
		}
		public BlackExpressionContext blackExpression() {
			return getRuleContext(BlackExpressionContext.class,0);
		}
		public WhiteValueContext whiteValue() {
			return getRuleContext(WhiteValueContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(ColorfulParser.OTHER, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				assignment();
				setState(40);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				reserveMemoryForVariable();
				setState(43);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				operateOnDeclaredVariable();
				setState(46);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				if_stat();
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(49);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				while_stat();
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(53);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				fore_stat();
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(57);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				blackValue();
				setState(61);
				match(NEWLINE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				blackExpression();
				setState(64);
				match(NEWLINE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
				whiteValue();
				setState(67);
				match(NEWLINE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(69);
				match(NEWLINE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(70);
				((StatContext)_localctx).OTHER = match(OTHER);
				System.err.println("Unknown char: " + (((StatContext)_localctx).OTHER!=null?((StatContext)_localctx).OTHER.getText():null));
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

	public static class ReserveMemoryForVariableContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ColorfulParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(ColorfulParser.ID, 0); }
		public ReserveMemoryForVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserveMemoryForVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterReserveMemoryForVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitReserveMemoryForVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitReserveMemoryForVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReserveMemoryForVariableContext reserveMemoryForVariable() throws RecognitionException {
		ReserveMemoryForVariableContext _localctx = new ReserveMemoryForVariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reserveMemoryForVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(TYPE);
			setState(75);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ColorfulParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(ColorfulParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ColorfulParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(TYPE);
			setState(78);
			match(ID);
			setState(79);
			match(ASSIGN);
			setState(80);
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

	public static class OperateOnDeclaredVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ColorfulParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ColorfulParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OperateOnDeclaredVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operateOnDeclaredVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterOperateOnDeclaredVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitOperateOnDeclaredVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitOperateOnDeclaredVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperateOnDeclaredVariableContext operateOnDeclaredVariable() throws RecognitionException {
		OperateOnDeclaredVariableContext _localctx = new OperateOnDeclaredVariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operateOnDeclaredVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ID);
			setState(83);
			match(ASSIGN);
			setState(84);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(ColorfulParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(ColorfulParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(ColorfulParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(ColorfulParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(IF);
			setState(87);
			condition_block();
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					match(ELSE);
					setState(89);
					match(IF);
					setState(90);
					condition_block();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(96);
				match(ELSE);
				setState(97);
				stat_block();
				}
				break;
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

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			expr(0);
			setState(101);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(ColorfulParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(ColorfulParser.CBRACE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stat_block);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(OBRACE);
				setState(104);
				block();
				setState(105);
				match(CBRACE);
				}
				break;
			case TYPE:
			case OUT:
			case IN:
			case IF:
			case WHILE:
			case FOR:
			case ID:
			case NEWLINE:
			case OTHER:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ColorfulParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(WHILE);
			setState(111);
			expr(0);
			setState(112);
			stat_block();
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

	public static class Fore_statContext extends ParserRuleContext {
		public Token op;
		public TerminalNode FOR() { return getToken(ColorfulParser.FOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode IF() { return getToken(ColorfulParser.IF, 0); }
		public TerminalNode GREATER() { return getToken(ColorfulParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(ColorfulParser.LESS, 0); }
		public TerminalNode GREATER_EQ() { return getToken(ColorfulParser.GREATER_EQ, 0); }
		public TerminalNode LESS_EQ() { return getToken(ColorfulParser.LESS_EQ, 0); }
		public Fore_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fore_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterFore_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitFore_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitFore_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fore_statContext fore_stat() throws RecognitionException {
		Fore_statContext _localctx = new Fore_statContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fore_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(FOR);
			setState(115);
			expr(0);
			{
			setState(116);
			match(IF);
			setState(117);
			expr(0);
			setState(118);
			((Fore_statContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << GREATER_EQ) | (1L << LESS_EQ))) != 0)) ) {
				((Fore_statContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(119);
			expr(0);
			}
			setState(121);
			expr(0);
			setState(122);
			stat_block();
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

	public static class BlackValueContext extends ParserRuleContext {
		public Token type;
		public TerminalNode OUT() { return getToken(ColorfulParser.OUT, 0); }
		public TerminalNode TYPE() { return getToken(ColorfulParser.TYPE, 0); }
		public BlackValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blackValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterBlackValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitBlackValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitBlackValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlackValueContext blackValue() throws RecognitionException {
		BlackValueContext _localctx = new BlackValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blackValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(OUT);
			setState(125);
			((BlackValueContext)_localctx).type = match(TYPE);
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

	public static class BlackExpressionContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(ColorfulParser.OUT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlackExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blackExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterBlackExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitBlackExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitBlackExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlackExpressionContext blackExpression() throws RecognitionException {
		BlackExpressionContext _localctx = new BlackExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blackExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(OUT);
			setState(128);
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

	public static class WhiteValueContext extends ParserRuleContext {
		public Token type;
		public TerminalNode IN() { return getToken(ColorfulParser.IN, 0); }
		public TerminalNode TYPE() { return getToken(ColorfulParser.TYPE, 0); }
		public WhiteValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiteValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterWhiteValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitWhiteValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitWhiteValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhiteValueContext whiteValue() throws RecognitionException {
		WhiteValueContext _localctx = new WhiteValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whiteValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IN);
			setState(131);
			((WhiteValueContext)_localctx).type = match(TYPE);
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
	public static class PwrExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PWR() { return getToken(ColorfulParser.PWR, 0); }
		public PwrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterPwrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitPwrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitPwrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(ColorfulParser.MOD, 0); }
		public ModExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitModExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitModExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SQRT() { return getToken(ColorfulParser.SQRT, 0); }
		public SqrtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterSqrtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitSqrtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitSqrtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputExprContext extends ExprContext {
		public WhiteValueContext whiteValue() {
			return getRuleContext(WhiteValueContext.class,0);
		}
		public InputExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterInputExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitInputExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitInputExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ColorfulParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ColorfulParser.DIV, 0); }
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitMultiplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ColorfulParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ColorfulParser.SUB, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(ColorfulParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(ColorfulParser.LESS, 0); }
		public TerminalNode GREATER_EQ() { return getToken(ColorfulParser.GREATER_EQ, 0); }
		public TerminalNode LESS_EQ() { return getToken(ColorfulParser.LESS_EQ, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorialExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FACTORIAL() { return getToken(ColorfulParser.FACTORIAL, 0); }
		public FactorialExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterFactorialExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitFactorialExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitFactorialExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ColorfulParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ColorfulParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitEqualityExpr(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				{
				_localctx = new InputExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(134);
				whiteValue();
				}
				break;
			case OPAR:
			case INT:
			case DBL:
			case BOOL:
			case STR:
			case ID:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(139);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new PwrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(142);
						((PwrExprContext)_localctx).op = match(PWR);
						setState(143);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(145);
						((ModExprContext)_localctx).op = match(MOD);
						setState(146);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(148);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(151);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << GREATER_EQ) | (1L << LESS_EQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(154);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(155);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new SqrtExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(157);
						((SqrtExprContext)_localctx).op = match(SQRT);
						}
						break;
					case 8:
						{
						_localctx = new FactorialExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(159);
						((FactorialExprContext)_localctx).op = match(FACTORIAL);
						}
						break;
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoubleAtomContext extends AtomContext {
		public TerminalNode DBL() { return getToken(ColorfulParser.DBL, 0); }
		public DoubleAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterDoubleAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitDoubleAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitDoubleAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExprContext extends AtomContext {
		public TerminalNode OPAR() { return getToken(ColorfulParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(ColorfulParser.CPAR, 0); }
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode BOOL() { return getToken(ColorfulParser.BOOL, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(ColorfulParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STR() { return getToken(ColorfulParser.STR, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(ColorfulParser.INT, 0); }
		public IntegerAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterIntegerAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitIntegerAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitIntegerAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atom);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(OPAR);
				setState(166);
				expr(0);
				setState(167);
				match(CPAR);
				}
				break;
			case INT:
				_localctx = new IntegerAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(INT);
				}
				break;
			case DBL:
				_localctx = new DoubleAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(DBL);
				}
				break;
			case BOOL:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(BOOL);
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(ID);
				}
				break;
			case STR:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(STR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\6\3&\n\3\r\3\16\3\'\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\65\n\4\3\4\3\4\5\49\n\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\3\b\3\b\5\be\n\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\no\n\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\5\20\u008b\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00a3\n\20\f\20\16\20\u00a6\13\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00b1\n\21\3\21\2\3\36\22\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \2\6\3\2\6\t\3\2\n\13\3\2\f\r\3\2\4\5\2\u00c1\2"+
		"\"\3\2\2\2\4%\3\2\2\2\6J\3\2\2\2\bL\3\2\2\2\nO\3\2\2\2\fT\3\2\2\2\16X"+
		"\3\2\2\2\20f\3\2\2\2\22n\3\2\2\2\24p\3\2\2\2\26t\3\2\2\2\30~\3\2\2\2\32"+
		"\u0081\3\2\2\2\34\u0084\3\2\2\2\36\u008a\3\2\2\2 \u00b0\3\2\2\2\"#\5\4"+
		"\3\2#\3\3\2\2\2$&\5\6\4\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2("+
		"\5\3\2\2\2)*\5\n\6\2*+\7\"\2\2+K\3\2\2\2,-\5\b\5\2-.\7\"\2\2.K\3\2\2\2"+
		"/\60\5\f\7\2\60\61\7\"\2\2\61K\3\2\2\2\62\64\5\16\b\2\63\65\7\"\2\2\64"+
		"\63\3\2\2\2\64\65\3\2\2\2\65K\3\2\2\2\668\5\24\13\2\679\7\"\2\28\67\3"+
		"\2\2\289\3\2\2\29K\3\2\2\2:<\5\26\f\2;=\7\"\2\2<;\3\2\2\2<=\3\2\2\2=K"+
		"\3\2\2\2>?\5\30\r\2?@\7\"\2\2@K\3\2\2\2AB\5\32\16\2BC\7\"\2\2CK\3\2\2"+
		"\2DE\5\34\17\2EF\7\"\2\2FK\3\2\2\2GK\7\"\2\2HI\7(\2\2IK\b\4\1\2J)\3\2"+
		"\2\2J,\3\2\2\2J/\3\2\2\2J\62\3\2\2\2J\66\3\2\2\2J:\3\2\2\2J>\3\2\2\2J"+
		"A\3\2\2\2JD\3\2\2\2JG\3\2\2\2JH\3\2\2\2K\7\3\2\2\2LM\7\3\2\2MN\7!\2\2"+
		"N\t\3\2\2\2OP\7\3\2\2PQ\7!\2\2QR\7\22\2\2RS\5\36\20\2S\13\3\2\2\2TU\7"+
		"!\2\2UV\7\22\2\2VW\5\36\20\2W\r\3\2\2\2XY\7\31\2\2Y_\5\20\t\2Z[\7\32\2"+
		"\2[\\\7\31\2\2\\^\5\20\t\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`d\3"+
		"\2\2\2a_\3\2\2\2bc\7\32\2\2ce\5\22\n\2db\3\2\2\2de\3\2\2\2e\17\3\2\2\2"+
		"fg\5\36\20\2gh\5\22\n\2h\21\3\2\2\2ij\7\25\2\2jk\5\4\3\2kl\7\26\2\2lo"+
		"\3\2\2\2mo\5\6\4\2ni\3\2\2\2nm\3\2\2\2o\23\3\2\2\2pq\7\33\2\2qr\5\36\20"+
		"\2rs\5\22\n\2s\25\3\2\2\2tu\7\34\2\2uv\5\36\20\2vw\7\31\2\2wx\5\36\20"+
		"\2xy\t\2\2\2yz\5\36\20\2z{\3\2\2\2{|\5\36\20\2|}\5\22\n\2}\27\3\2\2\2"+
		"~\177\7\27\2\2\177\u0080\7\3\2\2\u0080\31\3\2\2\2\u0081\u0082\7\27\2\2"+
		"\u0082\u0083\5\36\20\2\u0083\33\3\2\2\2\u0084\u0085\7\30\2\2\u0085\u0086"+
		"\7\3\2\2\u0086\35\3\2\2\2\u0087\u0088\b\20\1\2\u0088\u008b\5\34\17\2\u0089"+
		"\u008b\5 \21\2\u008a\u0087\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u00a4\3\2"+
		"\2\2\u008c\u008d\f\f\2\2\u008d\u008e\t\3\2\2\u008e\u00a3\5\36\20\r\u008f"+
		"\u0090\f\13\2\2\u0090\u0091\7\16\2\2\u0091\u00a3\5\36\20\f\u0092\u0093"+
		"\f\b\2\2\u0093\u0094\7\20\2\2\u0094\u00a3\5\36\20\t\u0095\u0096\f\7\2"+
		"\2\u0096\u0097\t\4\2\2\u0097\u00a3\5\36\20\b\u0098\u0099\f\6\2\2\u0099"+
		"\u009a\t\2\2\2\u009a\u00a3\5\36\20\7\u009b\u009c\f\5\2\2\u009c\u009d\t"+
		"\5\2\2\u009d\u00a3\5\36\20\6\u009e\u009f\f\n\2\2\u009f\u00a3\7\17\2\2"+
		"\u00a0\u00a1\f\t\2\2\u00a1\u00a3\7\21\2\2\u00a2\u008c\3\2\2\2\u00a2\u008f"+
		"\3\2\2\2\u00a2\u0092\3\2\2\2\u00a2\u0095\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2"+
		"\u009b\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\37\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\7\24\2"+
		"\2\u00aa\u00b1\3\2\2\2\u00ab\u00b1\7\35\2\2\u00ac\u00b1\7\36\2\2\u00ad"+
		"\u00b1\7\37\2\2\u00ae\u00b1\7!\2\2\u00af\u00b1\7 \2\2\u00b0\u00a7\3\2"+
		"\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1!\3\2\2\2\16\'\648<J_dn\u008a"+
		"\u00a2\u00a4\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}