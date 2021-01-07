// Generated from G:/Pr-SISW2\Colorful.g4 by ANTLR 4.9
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
		OPAR=17, CPAR=18, OBRACE=19, CBRACE=20, OUT=21, IN=22, IF=23, ELSE=24, 
		WHILE=25, FOR=26, INT=27, DBL=28, BOOL=29, STR=30, ID=31, NEWLINE=32, 
		COMMENT=33, WS=34, TRUE=35, FALSE=36, STRLIT=37, OTHER=38;
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
			"CPAR", "OBRACE", "CBRACE", "OUT", "IN", "IF", "ELSE", "WHILE", "FOR", 
			"INT", "DBL", "BOOL", "STR", "ID", "NEWLINE", "COMMENT", "WS", "TRUE", 
			"FALSE", "STRLIT", "VALID_ID_START", "VALID_ID_CHAR", "INTEGER", "DOUBLE", 
			"BOOLEAN", "STRING", "OTHER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0171\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\5\2`\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\5\34\u00e7\n\34\3\34\6\34\u00ea\n\34\r\34\16"+
		"\34\u00eb\3\35\5\35\u00ef\n\35\3\35\6\35\u00f2\n\35\r\35\16\35\u00f3\3"+
		"\35\3\35\7\35\u00f8\n\35\f\35\16\35\u00fb\13\35\3\35\5\35\u00fe\n\35\3"+
		"\35\3\35\6\35\u0102\n\35\r\35\16\35\u0103\5\35\u0106\n\35\3\36\3\36\5"+
		"\36\u010a\n\36\3\37\3\37\3 \3 \7 \u0110\n \f \16 \u0113\13 \3!\5!\u0116"+
		"\n!\3!\3!\5!\u011a\n!\3!\5!\u011d\n!\3\"\3\"\7\"\u0121\n\"\f\"\16\"\u0124"+
		"\13\"\3\"\3\"\3#\6#\u0129\n#\r#\16#\u012a\3#\3#\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\7&\u013e\n&\f&\16&\u0141\13&\3&\3&\3&\3&\5&\u0147"+
		"\n&\3&\3&\3&\3\'\5\'\u014d\n\'\3(\3(\5(\u0151\n(\3)\3)\3)\3)\3)\3)\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-"+
		"\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q\2S\2U\2W\2Y(\3\2\7\3\2\62;\4\2\f\f\17"+
		"\17\4\2\13\13\"\"\4\2//@@\5\2C\\aac|\2\u017f\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"Y\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7h\3\2\2\2\tn\3\2\2\2\13p\3\2\2\2\rr\3"+
		"\2\2\2\17u\3\2\2\2\21x\3\2\2\2\23}\3\2\2\2\25\u0084\3\2\2\2\27\u0088\3"+
		"\2\2\2\31\u008d\3\2\2\2\33\u0092\3\2\2\2\35\u0099\3\2\2\2\37\u00a1\3\2"+
		"\2\2!\u00a7\3\2\2\2#\u00ab\3\2\2\2%\u00ad\3\2\2\2\'\u00af\3\2\2\2)\u00b5"+
		"\3\2\2\2+\u00ba\3\2\2\2-\u00c0\3\2\2\2/\u00c6\3\2\2\2\61\u00d2\3\2\2\2"+
		"\63\u00d9\3\2\2\2\65\u00de\3\2\2\2\67\u00e6\3\2\2\29\u0105\3\2\2\2;\u0109"+
		"\3\2\2\2=\u010b\3\2\2\2?\u010d\3\2\2\2A\u011c\3\2\2\2C\u011e\3\2\2\2E"+
		"\u0128\3\2\2\2G\u012e\3\2\2\2I\u0133\3\2\2\2K\u0139\3\2\2\2M\u014c\3\2"+
		"\2\2O\u0150\3\2\2\2Q\u0152\3\2\2\2S\u0158\3\2\2\2U\u0162\3\2\2\2W\u0168"+
		"\3\2\2\2Y\u016f\3\2\2\2[`\5Q)\2\\`\5S*\2]`\5W,\2^`\5U+\2_[\3\2\2\2_\\"+
		"\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\4\3\2\2\2ab\7k\2\2bc\7p\2\2cd\7f\2\2de\7"+
		"k\2\2ef\7i\2\2fg\7q\2\2g\6\3\2\2\2hi\7u\2\2ij\7j\2\2jk\7c\2\2kl\7m\2\2"+
		"lm\7g\2\2m\b\3\2\2\2no\7@\2\2o\n\3\2\2\2pq\7>\2\2q\f\3\2\2\2rs\7@\2\2"+
		"st\7?\2\2t\16\3\2\2\2uv\7>\2\2vw\7?\2\2w\20\3\2\2\2xy\7r\2\2yz\7k\2\2"+
		"z{\7p\2\2{|\7m\2\2|\22\3\2\2\2}~\7q\2\2~\177\7t\2\2\177\u0080\7c\2\2\u0080"+
		"\u0081\7p\2\2\u0081\u0082\7i\2\2\u0082\u0083\7g\2\2\u0083\24\3\2\2\2\u0084"+
		"\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\7f\2\2\u0087\26\3\2\2\2\u0088"+
		"\u0089\7d\2\2\u0089\u008a\7n\2\2\u008a\u008b\7w\2\2\u008b\u008c\7g\2\2"+
		"\u008c\30\3\2\2\2\u008d\u008e\7c\2\2\u008e\u008f\7s\2\2\u008f\u0090\7"+
		"w\2\2\u0090\u0091\7c\2\2\u0091\32\3\2\2\2\u0092\u0093\7c\2\2\u0093\u0094"+
		"\7w\2\2\u0094\u0095\7d\2\2\u0095\u0096\7w\2\2\u0096\u0097\7t\2\2\u0097"+
		"\u0098\7p\2\2\u0098\34\3\2\2\2\u0099\u009a\7o\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7i\2\2\u009c\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e\u009f\7v\2\2"+
		"\u009f\u00a0\7c\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7"+
		"c\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7k\2\2\u00a6 "+
		"\3\2\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7z\2\2\u00aa"+
		"\"\3\2\2\2\u00ab\u00ac\7*\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7+\2\2\u00ae"+
		"&\3\2\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7i\2\2\u00b2"+
		"\u00b3\7j\2\2\u00b3\u00b4\7v\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6"+
		"\u00b7\7c\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7m\2\2\u00b9*\3\2\2\2\u00ba"+
		"\u00bb\7D\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7e\2\2"+
		"\u00be\u00bf\7m\2\2\u00bf,\3\2\2\2\u00c0\u00c1\7Y\2\2\u00c1\u00c2\7j\2"+
		"\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7g\2\2\u00c5.\3\2"+
		"\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca"+
		"\7p\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\u00ce\7t\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7v\2\2"+
		"\u00d1\60\3\2\2\2\u00d2\u00d3\7x\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7"+
		"q\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7v\2\2\u00d8\62"+
		"\3\2\2\2\u00d9\u00da\7i\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7n\2\2\u00dc"+
		"\u00dd\7f\2\2\u00dd\64\3\2\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7k\2\2\u00e0"+
		"\u00e1\7n\2\2\u00e1\u00e2\7x\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7t\2\2"+
		"\u00e4\66\3\2\2\2\u00e5\u00e7\7/\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3"+
		"\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00ea\t\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec8\3\2\2\2"+
		"\u00ed\u00ef\7/\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1"+
		"\3\2\2\2\u00f0\u00f2\t\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f9\7\60"+
		"\2\2\u00f6\u00f8\t\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0106\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\u00fe\7/\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0101\7\60\2\2\u0100\u0102\t\2\2\2\u0101\u0100\3"+
		"\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u00ee\3\2\2\2\u0105\u00fd\3\2\2\2\u0106:\3\2\2\2"+
		"\u0107\u010a\5G$\2\u0108\u010a\5I%\2\u0109\u0107\3\2\2\2\u0109\u0108\3"+
		"\2\2\2\u010a<\3\2\2\2\u010b\u010c\5K&\2\u010c>\3\2\2\2\u010d\u0111\5M"+
		"\'\2\u010e\u0110\5O(\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112@\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0116\7\17\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3"+
		"\2\2\2\u0117\u011d\7\f\2\2\u0118\u011a\7\17\2\2\u0119\u0118\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\7\u0080\2\2\u011c\u0115"+
		"\3\2\2\2\u011c\u0119\3\2\2\2\u011dB\3\2\2\2\u011e\u0122\7%\2\2\u011f\u0121"+
		"\n\3\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\b\""+
		"\2\2\u0126D\3\2\2\2\u0127\u0129\t\4\2\2\u0128\u0127\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\b#\2\2\u012dF\3\2\2\2\u012e\u012f\7v\2\2\u012f\u0130\7t\2\2\u0130"+
		"\u0131\7w\2\2\u0131\u0132\7g\2\2\u0132H\3\2\2\2\u0133\u0134\7h\2\2\u0134"+
		"\u0135\7c\2\2\u0135\u0136\7n\2\2\u0136\u0137\7u\2\2\u0137\u0138\7g\2\2"+
		"\u0138J\3\2\2\2\u0139\u013a\7/\2\2\u013a\u013b\7@\2\2\u013b\u0146\3\2"+
		"\2\2\u013c\u013e\n\5\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0147\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0142\u0143\7/\2\2\u0143\u0144\7@\2\2\u0144\u0145\7/\2\2\u0145\u0147"+
		"\7@\2\2\u0146\u013f\3\2\2\2\u0146\u0142\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\7/\2\2\u0149\u014a\7@\2\2\u014aL\3\2\2\2\u014b\u014d\t\6\2\2\u014c"+
		"\u014b\3\2\2\2\u014dN\3\2\2\2\u014e\u0151\5M\'\2\u014f\u0151\4\62;\2\u0150"+
		"\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151P\3\2\2\2\u0152\u0153\7I\2\2\u0153"+
		"\u0154\7t\2\2\u0154\u0155\7g\2\2\u0155\u0156\7g\2\2\u0156\u0157\7p\2\2"+
		"\u0157R\3\2\2\2\u0158\u0159\7F\2\2\u0159\u015a\7c\2\2\u015a\u015b\7t\2"+
		"\2\u015b\u015c\7m\2\2\u015c\u015d\7i\2\2\u015d\u015e\7t\2\2\u015e\u015f"+
		"\7g\2\2\u015f\u0160\7g\2\2\u0160\u0161\7p\2\2\u0161T\3\2\2\2\u0162\u0163"+
		"\7D\2\2\u0163\u0164\7t\2\2\u0164\u0165\7q\2\2\u0165\u0166\7y\2\2\u0166"+
		"\u0167\7p\2\2\u0167V\3\2\2\2\u0168\u0169\7R\2\2\u0169\u016a\7w\2\2\u016a"+
		"\u016b\7t\2\2\u016b\u016c\7r\2\2\u016c\u016d\7n\2\2\u016d\u016e\7g\2\2"+
		"\u016eX\3\2\2\2\u016f\u0170\13\2\2\2\u0170Z\3\2\2\2\27\2_\u00e6\u00eb"+
		"\u00ee\u00f3\u00f9\u00fd\u0103\u0105\u0109\u0111\u0115\u0119\u011c\u0122"+
		"\u012a\u013f\u0146\u014c\u0150\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}