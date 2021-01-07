// Generated from /home/dizz/IdeaProjects/SISWProjekt/Colorful.g4 by ANTLR 4.9
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
		RULE_assignment = 4, RULE_assignmentWithWhite = 5, RULE_operateOnDeclaredVariable = 6, 
		RULE_if_stat = 7, RULE_condition_block = 8, RULE_stat_block = 9, RULE_while_stat = 10, 
		RULE_fore_stat = 11, RULE_whiteValue = 12, RULE_blackValue = 13, RULE_blackExpression = 14, 
		RULE_blackInput = 15, RULE_expr = 16, RULE_atom = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "stat", "reserveMemoryForVariable", "assignment", "assignmentWithWhite", 
			"operateOnDeclaredVariable", "if_stat", "condition_block", "stat_block", 
			"while_stat", "fore_stat", "whiteValue", "blackValue", "blackExpression", 
			"blackInput", "expr", "atom"
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
			setState(36);
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				stat();
				}
				}
				setState(41); 
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
		public AssignmentWithWhiteContext assignmentWithWhite() {
			return getRuleContext(AssignmentWithWhiteContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ColorfulParser.NEWLINE, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
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
		public WhiteValueContext whiteValue() {
			return getRuleContext(WhiteValueContext.class,0);
		}
		public BlackInputContext blackInput() {
			return getRuleContext(BlackInputContext.class,0);
		}
		public BlackValueContext blackValue() {
			return getRuleContext(BlackValueContext.class,0);
		}
		public BlackExpressionContext blackExpression() {
			return getRuleContext(BlackExpressionContext.class,0);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				assignmentWithWhite();
				setState(44);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				assignment();
				setState(47);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				reserveMemoryForVariable();
				setState(50);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				operateOnDeclaredVariable();
				setState(53);
				match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				if_stat();
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(56);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				while_stat();
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(60);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				fore_stat();
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(64);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
				whiteValue();
				setState(68);
				match(NEWLINE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				blackInput();
				setState(71);
				match(NEWLINE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(73);
				blackValue();
				setState(74);
				match(NEWLINE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(76);
				blackExpression();
				setState(77);
				match(NEWLINE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(79);
				match(NEWLINE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(80);
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
			setState(84);
			match(TYPE);
			setState(85);
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
			setState(87);
			match(TYPE);
			setState(88);
			match(ID);
			setState(89);
			match(ASSIGN);
			setState(90);
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

	public static class AssignmentWithWhiteContext extends ParserRuleContext {
		public Token varType;
		public Token varName;
		public Token type;
		public TerminalNode ASSIGN() { return getToken(ColorfulParser.ASSIGN, 0); }
		public TerminalNode IN() { return getToken(ColorfulParser.IN, 0); }
		public List<TerminalNode> TYPE() { return getTokens(ColorfulParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(ColorfulParser.TYPE, i);
		}
		public TerminalNode ID() { return getToken(ColorfulParser.ID, 0); }
		public AssignmentWithWhiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentWithWhite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterAssignmentWithWhite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitAssignmentWithWhite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitAssignmentWithWhite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentWithWhiteContext assignmentWithWhite() throws RecognitionException {
		AssignmentWithWhiteContext _localctx = new AssignmentWithWhiteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentWithWhite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((AssignmentWithWhiteContext)_localctx).varType = match(TYPE);
			setState(93);
			((AssignmentWithWhiteContext)_localctx).varName = match(ID);
			setState(94);
			match(ASSIGN);
			setState(95);
			match(IN);
			setState(96);
			((AssignmentWithWhiteContext)_localctx).type = match(TYPE);
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
		enterRule(_localctx, 12, RULE_operateOnDeclaredVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ID);
			setState(99);
			match(ASSIGN);
			setState(100);
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
		enterRule(_localctx, 14, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IF);
			setState(103);
			condition_block();
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					match(ELSE);
					setState(105);
					match(IF);
					setState(106);
					condition_block();
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(112);
				match(ELSE);
				setState(113);
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
		enterRule(_localctx, 16, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			expr(0);
			setState(117);
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
		enterRule(_localctx, 18, RULE_stat_block);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(OBRACE);
				setState(120);
				block();
				setState(121);
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
				setState(123);
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
		enterRule(_localctx, 20, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(WHILE);
			setState(127);
			expr(0);
			setState(128);
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
		enterRule(_localctx, 22, RULE_fore_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(FOR);
			setState(131);
			expr(0);
			{
			setState(132);
			match(IF);
			setState(133);
			expr(0);
			setState(134);
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
			setState(135);
			expr(0);
			}
			setState(137);
			expr(0);
			setState(138);
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
		enterRule(_localctx, 24, RULE_whiteValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IN);
			setState(141);
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
		enterRule(_localctx, 26, RULE_blackValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(OUT);
			setState(144);
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
		enterRule(_localctx, 28, RULE_blackExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(OUT);
			setState(147);
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

	public static class BlackInputContext extends ParserRuleContext {
		public Token type;
		public TerminalNode OUT() { return getToken(ColorfulParser.OUT, 0); }
		public TerminalNode IN() { return getToken(ColorfulParser.IN, 0); }
		public TerminalNode TYPE() { return getToken(ColorfulParser.TYPE, 0); }
		public BlackInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blackInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).enterBlackInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorfulListener ) ((ColorfulListener)listener).exitBlackInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ColorfulVisitor ) return ((ColorfulVisitor<? extends T>)visitor).visitBlackInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlackInputContext blackInput() throws RecognitionException {
		BlackInputContext _localctx = new BlackInputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blackInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(OUT);
			setState(150);
			match(IN);
			setState(151);
			((BlackInputContext)_localctx).type = match(TYPE);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				{
				_localctx = new InputExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(154);
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
				setState(155);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(159);
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
						setState(160);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new PwrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(162);
						((PwrExprContext)_localctx).op = match(PWR);
						setState(163);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(165);
						((ModExprContext)_localctx).op = match(MOD);
						setState(166);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(168);
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
						setState(169);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(171);
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
						setState(172);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(174);
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
						setState(175);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new SqrtExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(177);
						((SqrtExprContext)_localctx).op = match(SQRT);
						}
						break;
					case 8:
						{
						_localctx = new FactorialExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(179);
						((FactorialExprContext)_localctx).op = match(FACTORIAL);
						}
						break;
					}
					} 
				}
				setState(184);
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
		enterRule(_localctx, 34, RULE_atom);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(OPAR);
				setState(186);
				expr(0);
				setState(187);
				match(CPAR);
				}
				break;
			case INT:
				_localctx = new IntegerAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(INT);
				}
				break;
			case DBL:
				_localctx = new DoubleAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(DBL);
				}
				break;
			case BOOL:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(BOOL);
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(ID);
				}
				break;
			case STR:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\6\3*\n\3\r\3\16\3+\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\5\4@\n\4\3\4\3\4\5\4D\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4U\n"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\t\3\t\5\tu\n\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\177\n\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u009f\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00b7\n\22\f\22\16\22\u00ba\13\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c5\n\23\3\23\2\3"+
		"\"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\6\3\2\6\t\3\2\n\13"+
		"\3\2\f\r\3\2\4\5\2\u00d5\2&\3\2\2\2\4)\3\2\2\2\6T\3\2\2\2\bV\3\2\2\2\n"+
		"Y\3\2\2\2\f^\3\2\2\2\16d\3\2\2\2\20h\3\2\2\2\22v\3\2\2\2\24~\3\2\2\2\26"+
		"\u0080\3\2\2\2\30\u0084\3\2\2\2\32\u008e\3\2\2\2\34\u0091\3\2\2\2\36\u0094"+
		"\3\2\2\2 \u0097\3\2\2\2\"\u009e\3\2\2\2$\u00c4\3\2\2\2&\'\5\4\3\2\'\3"+
		"\3\2\2\2(*\5\6\4\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5\3\2\2\2"+
		"-.\5\f\7\2./\7\"\2\2/U\3\2\2\2\60\61\5\n\6\2\61\62\7\"\2\2\62U\3\2\2\2"+
		"\63\64\5\b\5\2\64\65\7\"\2\2\65U\3\2\2\2\66\67\5\16\b\2\678\7\"\2\28U"+
		"\3\2\2\29;\5\20\t\2:<\7\"\2\2;:\3\2\2\2;<\3\2\2\2<U\3\2\2\2=?\5\26\f\2"+
		">@\7\"\2\2?>\3\2\2\2?@\3\2\2\2@U\3\2\2\2AC\5\30\r\2BD\7\"\2\2CB\3\2\2"+
		"\2CD\3\2\2\2DU\3\2\2\2EF\5\32\16\2FG\7\"\2\2GU\3\2\2\2HI\5 \21\2IJ\7\""+
		"\2\2JU\3\2\2\2KL\5\34\17\2LM\7\"\2\2MU\3\2\2\2NO\5\36\20\2OP\7\"\2\2P"+
		"U\3\2\2\2QU\7\"\2\2RS\7(\2\2SU\b\4\1\2T-\3\2\2\2T\60\3\2\2\2T\63\3\2\2"+
		"\2T\66\3\2\2\2T9\3\2\2\2T=\3\2\2\2TA\3\2\2\2TE\3\2\2\2TH\3\2\2\2TK\3\2"+
		"\2\2TN\3\2\2\2TQ\3\2\2\2TR\3\2\2\2U\7\3\2\2\2VW\7\3\2\2WX\7!\2\2X\t\3"+
		"\2\2\2YZ\7\3\2\2Z[\7!\2\2[\\\7\22\2\2\\]\5\"\22\2]\13\3\2\2\2^_\7\3\2"+
		"\2_`\7!\2\2`a\7\22\2\2ab\7\30\2\2bc\7\3\2\2c\r\3\2\2\2de\7!\2\2ef\7\22"+
		"\2\2fg\5\"\22\2g\17\3\2\2\2hi\7\31\2\2io\5\22\n\2jk\7\32\2\2kl\7\31\2"+
		"\2ln\5\22\n\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pt\3\2\2\2qo\3\2"+
		"\2\2rs\7\32\2\2su\5\24\13\2tr\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vw\5\"\22\2"+
		"wx\5\24\13\2x\23\3\2\2\2yz\7\25\2\2z{\5\4\3\2{|\7\26\2\2|\177\3\2\2\2"+
		"}\177\5\6\4\2~y\3\2\2\2~}\3\2\2\2\177\25\3\2\2\2\u0080\u0081\7\33\2\2"+
		"\u0081\u0082\5\"\22\2\u0082\u0083\5\24\13\2\u0083\27\3\2\2\2\u0084\u0085"+
		"\7\34\2\2\u0085\u0086\5\"\22\2\u0086\u0087\7\31\2\2\u0087\u0088\5\"\22"+
		"\2\u0088\u0089\t\2\2\2\u0089\u008a\5\"\22\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\5\"\22\2\u008c\u008d\5\24\13\2\u008d\31\3\2\2\2\u008e\u008f\7\30"+
		"\2\2\u008f\u0090\7\3\2\2\u0090\33\3\2\2\2\u0091\u0092\7\27\2\2\u0092\u0093"+
		"\7\3\2\2\u0093\35\3\2\2\2\u0094\u0095\7\27\2\2\u0095\u0096\5\"\22\2\u0096"+
		"\37\3\2\2\2\u0097\u0098\7\27\2\2\u0098\u0099\7\30\2\2\u0099\u009a\7\3"+
		"\2\2\u009a!\3\2\2\2\u009b\u009c\b\22\1\2\u009c\u009f\5\32\16\2\u009d\u009f"+
		"\5$\23\2\u009e\u009b\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00b8\3\2\2\2\u00a0"+
		"\u00a1\f\f\2\2\u00a1\u00a2\t\3\2\2\u00a2\u00b7\5\"\22\r\u00a3\u00a4\f"+
		"\13\2\2\u00a4\u00a5\7\16\2\2\u00a5\u00b7\5\"\22\f\u00a6\u00a7\f\b\2\2"+
		"\u00a7\u00a8\7\20\2\2\u00a8\u00b7\5\"\22\t\u00a9\u00aa\f\7\2\2\u00aa\u00ab"+
		"\t\4\2\2\u00ab\u00b7\5\"\22\b\u00ac\u00ad\f\6\2\2\u00ad\u00ae\t\2\2\2"+
		"\u00ae\u00b7\5\"\22\7\u00af\u00b0\f\5\2\2\u00b0\u00b1\t\5\2\2\u00b1\u00b7"+
		"\5\"\22\6\u00b2\u00b3\f\n\2\2\u00b3\u00b7\7\17\2\2\u00b4\u00b5\f\t\2\2"+
		"\u00b5\u00b7\7\21\2\2\u00b6\u00a0\3\2\2\2\u00b6\u00a3\3\2\2\2\u00b6\u00a6"+
		"\3\2\2\2\u00b6\u00a9\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b6\u00af\3\2\2\2\u00b6"+
		"\u00b2\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9#\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc"+
		"\7\23\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\7\24\2\2\u00be\u00c5\3\2\2"+
		"\2\u00bf\u00c5\7\35\2\2\u00c0\u00c5\7\36\2\2\u00c1\u00c5\7\37\2\2\u00c2"+
		"\u00c5\7!\2\2\u00c3\u00c5\7 \2\2\u00c4\u00bb\3\2\2\2\u00c4\u00bf\3\2\2"+
		"\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5%\3\2\2\2\16+;?CTot~\u009e\u00b6\u00b8\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}