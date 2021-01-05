// Generated from /home/dizz/IdeaProjects/SISWProjekt/Colorful.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ColorfulLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, EQ=2, NEQ=3, GREATER=4, LESS=5, GREATER_EQ=6, LESS_EQ=7, MUL=8, 
		DIV=9, ADD=10, SUB=11, PWR=12, SQRT=13, MOD=14, FACTORIAL=15, ASSIGN=16, 
		OPAR=17, CPAR=18, OBRACE=19, CBRACE=20, OUT=21, IF=22, ELSE=23, WHILE=24, 
		INT=25, DBL=26, BOOL=27, STR=28, ID=29, NEWLINE=30, COMMENT=31, WS=32, 
		TRUE=33, FALSE=34, STRLIT=35, OTHER=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "EQ", "NEQ", "GREATER", "LESS", "GREATER_EQ", "LESS_EQ", "MUL", 
			"DIV", "ADD", "SUB", "PWR", "SQRT", "MOD", "FACTORIAL", "ASSIGN", "OPAR", 
			"CPAR", "OBRACE", "CBRACE", "OUT", "IF", "ELSE", "WHILE", "INT", "DBL", 
			"BOOL", "STR", "ID", "NEWLINE", "COMMENT", "WS", "TRUE", "FALSE", "STRLIT", 
			"VALID_ID_START", "VALID_ID_CHAR", "INTEGER", "DOUBLE", "BOOLEAN", "STRING", 
			"OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'indigo'", "'shake'", "'>'", "'<'", "'>='", "'<='", "'pink'", 
			"'orange'", "'red'", "'blue'", "'aqua'", "'auburn'", "'magenta'", "'capri'", 
			"'mix'", "'('", "')'", "'light'", "'dark'", "'Black'", "'transparent'", 
			"'violet'", "'gold'", null, null, null, null, null, null, null, null, 
			"'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "EQ", "NEQ", "GREATER", "LESS", "GREATER_EQ", "LESS_EQ", 
			"MUL", "DIV", "ADD", "SUB", "PWR", "SQRT", "MOD", "FACTORIAL", "ASSIGN", 
			"OPAR", "CPAR", "OBRACE", "CBRACE", "OUT", "IF", "ELSE", "WHILE", "INT", 
			"DBL", "BOOL", "STR", "ID", "NEWLINE", "COMMENT", "WS", "TRUE", "FALSE", 
			"STRLIT", "OTHER"
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


	public ColorfulLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Colorful.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0160\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\5\2\\\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\5\32\u00d6\n\32\3\32\6\32\u00d9\n\32\r\32\16\32\u00da"+
		"\3\33\5\33\u00de\n\33\3\33\6\33\u00e1\n\33\r\33\16\33\u00e2\3\33\3\33"+
		"\7\33\u00e7\n\33\f\33\16\33\u00ea\13\33\3\33\5\33\u00ed\n\33\3\33\3\33"+
		"\6\33\u00f1\n\33\r\33\16\33\u00f2\5\33\u00f5\n\33\3\34\3\34\5\34\u00f9"+
		"\n\34\3\35\3\35\3\36\3\36\7\36\u00ff\n\36\f\36\16\36\u0102\13\36\3\37"+
		"\5\37\u0105\n\37\3\37\3\37\5\37\u0109\n\37\3\37\5\37\u010c\n\37\3 \3 "+
		"\7 \u0110\n \f \16 \u0113\13 \3 \3 \3!\6!\u0118\n!\r!\16!\u0119\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u012d\n$\f$\16$"+
		"\u0130\13$\3$\3$\3$\3$\5$\u0136\n$\3$\3$\3$\3%\5%\u013c\n%\3&\3&\5&\u0140"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K\2M\2O\2Q\2S\2U&"+
		"\3\2\7\3\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\4\2//@@\5\2C\\aac|\2\u016e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2U\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7d\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2"+
		"\rn\3\2\2\2\17q\3\2\2\2\21t\3\2\2\2\23y\3\2\2\2\25\u0080\3\2\2\2\27\u0084"+
		"\3\2\2\2\31\u0089\3\2\2\2\33\u008e\3\2\2\2\35\u0095\3\2\2\2\37\u009d\3"+
		"\2\2\2!\u00a3\3\2\2\2#\u00a7\3\2\2\2%\u00a9\3\2\2\2\'\u00ab\3\2\2\2)\u00b1"+
		"\3\2\2\2+\u00b6\3\2\2\2-\u00bc\3\2\2\2/\u00c8\3\2\2\2\61\u00cf\3\2\2\2"+
		"\63\u00d5\3\2\2\2\65\u00f4\3\2\2\2\67\u00f8\3\2\2\29\u00fa\3\2\2\2;\u00fc"+
		"\3\2\2\2=\u010b\3\2\2\2?\u010d\3\2\2\2A\u0117\3\2\2\2C\u011d\3\2\2\2E"+
		"\u0122\3\2\2\2G\u0128\3\2\2\2I\u013b\3\2\2\2K\u013f\3\2\2\2M\u0141\3\2"+
		"\2\2O\u0147\3\2\2\2Q\u0151\3\2\2\2S\u0157\3\2\2\2U\u015e\3\2\2\2W\\\5"+
		"M\'\2X\\\5O(\2Y\\\5S*\2Z\\\5Q)\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2"+
		"\2\\\4\3\2\2\2]^\7k\2\2^_\7p\2\2_`\7f\2\2`a\7k\2\2ab\7i\2\2bc\7q\2\2c"+
		"\6\3\2\2\2de\7u\2\2ef\7j\2\2fg\7c\2\2gh\7m\2\2hi\7g\2\2i\b\3\2\2\2jk\7"+
		"@\2\2k\n\3\2\2\2lm\7>\2\2m\f\3\2\2\2no\7@\2\2op\7?\2\2p\16\3\2\2\2qr\7"+
		">\2\2rs\7?\2\2s\20\3\2\2\2tu\7r\2\2uv\7k\2\2vw\7p\2\2wx\7m\2\2x\22\3\2"+
		"\2\2yz\7q\2\2z{\7t\2\2{|\7c\2\2|}\7p\2\2}~\7i\2\2~\177\7g\2\2\177\24\3"+
		"\2\2\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7f\2\2\u0083"+
		"\26\3\2\2\2\u0084\u0085\7d\2\2\u0085\u0086\7n\2\2\u0086\u0087\7w\2\2\u0087"+
		"\u0088\7g\2\2\u0088\30\3\2\2\2\u0089\u008a\7c\2\2\u008a\u008b\7s\2\2\u008b"+
		"\u008c\7w\2\2\u008c\u008d\7c\2\2\u008d\32\3\2\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7w\2\2\u0090\u0091\7d\2\2\u0091\u0092\7w\2\2\u0092\u0093\7t\2\2"+
		"\u0093\u0094\7p\2\2\u0094\34\3\2\2\2\u0095\u0096\7o\2\2\u0096\u0097\7"+
		"c\2\2\u0097\u0098\7i\2\2\u0098\u0099\7g\2\2\u0099\u009a\7p\2\2\u009a\u009b"+
		"\7v\2\2\u009b\u009c\7c\2\2\u009c\36\3\2\2\2\u009d\u009e\7e\2\2\u009e\u009f"+
		"\7c\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		" \3\2\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7z\2\2\u00a6"+
		"\"\3\2\2\2\u00a7\u00a8\7*\2\2\u00a8$\3\2\2\2\u00a9\u00aa\7+\2\2\u00aa"+
		"&\3\2\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7i\2\2\u00ae"+
		"\u00af\7j\2\2\u00af\u00b0\7v\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7f\2\2\u00b2"+
		"\u00b3\7c\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7m\2\2\u00b5*\3\2\2\2\u00b6"+
		"\u00b7\7D\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7e\2\2"+
		"\u00ba\u00bb\7m\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7t\2"+
		"\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2"+
		"\7r\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7v\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7x\2\2\u00c9"+
		"\u00ca\7k\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd\u00ce\7v\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7i\2\2\u00d0\u00d1\7"+
		"q\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7f\2\2\u00d3\62\3\2\2\2\u00d4\u00d6"+
		"\7/\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d9\t\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\64\3\2\2\2\u00dc\u00de\7/\2\2\u00dd\u00dc"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00e1\t\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e8\7\60\2\2\u00e5\u00e7\t\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00f5\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\7/\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\7\60"+
		"\2\2\u00ef\u00f1\t\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00dd\3\2"+
		"\2\2\u00f4\u00ec\3\2\2\2\u00f5\66\3\2\2\2\u00f6\u00f9\5C\"\2\u00f7\u00f9"+
		"\5E#\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f98\3\2\2\2\u00fa\u00fb"+
		"\5G$\2\u00fb:\3\2\2\2\u00fc\u0100\5I%\2\u00fd\u00ff\5K&\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"<\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\7\17\2\2\u0104\u0103\3\2\2\2"+
		"\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010c\7\f\2\2\u0107\u0109"+
		"\7\17\2\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2"+
		"\u010a\u010c\7\u0080\2\2\u010b\u0104\3\2\2\2\u010b\u0108\3\2\2\2\u010c"+
		">\3\2\2\2\u010d\u0111\7%\2\2\u010e\u0110\n\3\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0114\u0115\b \2\2\u0115@\3\2\2\2\u0116\u0118"+
		"\t\4\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b!\2\2\u011cB\3\2\2\2\u011d"+
		"\u011e\7v\2\2\u011e\u011f\7t\2\2\u011f\u0120\7w\2\2\u0120\u0121\7g\2\2"+
		"\u0121D\3\2\2\2\u0122\u0123\7h\2\2\u0123\u0124\7c\2\2\u0124\u0125\7n\2"+
		"\2\u0125\u0126\7u\2\2\u0126\u0127\7g\2\2\u0127F\3\2\2\2\u0128\u0129\7"+
		"/\2\2\u0129\u012a\7@\2\2\u012a\u0135\3\2\2\2\u012b\u012d\n\5\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0136\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7/\2\2\u0132"+
		"\u0133\7@\2\2\u0133\u0134\7/\2\2\u0134\u0136\7@\2\2\u0135\u012e\3\2\2"+
		"\2\u0135\u0131\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7/\2\2\u0138\u0139"+
		"\7@\2\2\u0139H\3\2\2\2\u013a\u013c\t\6\2\2\u013b\u013a\3\2\2\2\u013cJ"+
		"\3\2\2\2\u013d\u0140\5I%\2\u013e\u0140\4\62;\2\u013f\u013d\3\2\2\2\u013f"+
		"\u013e\3\2\2\2\u0140L\3\2\2\2\u0141\u0142\7I\2\2\u0142\u0143\7t\2\2\u0143"+
		"\u0144\7g\2\2\u0144\u0145\7g\2\2\u0145\u0146\7p\2\2\u0146N\3\2\2\2\u0147"+
		"\u0148\7F\2\2\u0148\u0149\7c\2\2\u0149\u014a\7t\2\2\u014a\u014b\7m\2\2"+
		"\u014b\u014c\7i\2\2\u014c\u014d\7t\2\2\u014d\u014e\7g\2\2\u014e\u014f"+
		"\7g\2\2\u014f\u0150\7p\2\2\u0150P\3\2\2\2\u0151\u0152\7D\2\2\u0152\u0153"+
		"\7t\2\2\u0153\u0154\7q\2\2\u0154\u0155\7y\2\2\u0155\u0156\7p\2\2\u0156"+
		"R\3\2\2\2\u0157\u0158\7R\2\2\u0158\u0159\7w\2\2\u0159\u015a\7t\2\2\u015a"+
		"\u015b\7r\2\2\u015b\u015c\7n\2\2\u015c\u015d\7g\2\2\u015dT\3\2\2\2\u015e"+
		"\u015f\13\2\2\2\u015fV\3\2\2\2\27\2[\u00d5\u00da\u00dd\u00e2\u00e8\u00ec"+
		"\u00f2\u00f4\u00f8\u0100\u0104\u0108\u010b\u0111\u0119\u012e\u0135\u013b"+
		"\u013f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}