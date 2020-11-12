// Generated from /home/dizz/IdeaProjects/SISWProjekt/Colorful.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, EQ=2, NEQ=3, GREATER=4, LESS=5, GREATER_EQ=6, LESS_EQ=7, MUL=8, 
		DIV=9, ADD=10, SUB=11, ASSIGN=12, OPAR=13, CPAR=14, OBRACE=15, CBRACE=16, 
		OUT=17, IF=18, ELSE=19, WHILE=20, INT=21, DBL=22, BOOL=23, STR=24, ID=25, 
		NEWLINE=26, COMMENT=27, WS=28, TRUE=29, FALSE=30, STRLIT=31, OTHER=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "EQ", "NEQ", "GREATER", "LESS", "GREATER_EQ", "LESS_EQ", "MUL", 
			"DIV", "ADD", "SUB", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "OUT", 
			"IF", "ELSE", "WHILE", "INT", "DBL", "BOOL", "STR", "ID", "NEWLINE", 
			"COMMENT", "WS", "TRUE", "FALSE", "STRLIT", "VALID_ID_START", "VALID_ID_CHAR", 
			"INTEGER", "DOUBLE", "BOOLEAN", "STRING", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'indigo'", "'shake'", "'>'", "'<'", "'>='", "'<='", "'pink'", 
			"'orange'", "'red'", "'blue'", "'mix'", "'('", "')'", "'light'", "'dark'", 
			"'Black'", "'transparent'", "'violet'", "'gold'", null, null, null, null, 
			null, null, null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "EQ", "NEQ", "GREATER", "LESS", "GREATER_EQ", "LESS_EQ", 
			"MUL", "DIV", "ADD", "SUB", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", 
			"OUT", "IF", "ELSE", "WHILE", "INT", "DBL", "BOOL", "STR", "ID", "NEWLINE", 
			"COMMENT", "WS", "TRUE", "FALSE", "STRLIT", "OTHER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u013e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\5\2T\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\5\26\u00b4\n\26\3\26\6\26\u00b7\n\26\r\26\16\26\u00b8\3\27\5\27"+
		"\u00bc\n\27\3\27\6\27\u00bf\n\27\r\27\16\27\u00c0\3\27\3\27\7\27\u00c5"+
		"\n\27\f\27\16\27\u00c8\13\27\3\27\5\27\u00cb\n\27\3\27\3\27\6\27\u00cf"+
		"\n\27\r\27\16\27\u00d0\5\27\u00d3\n\27\3\30\3\30\5\30\u00d7\n\30\3\31"+
		"\3\31\3\32\3\32\7\32\u00dd\n\32\f\32\16\32\u00e0\13\32\3\33\5\33\u00e3"+
		"\n\33\3\33\3\33\5\33\u00e7\n\33\3\33\5\33\u00ea\n\33\3\34\3\34\7\34\u00ee"+
		"\n\34\f\34\16\34\u00f1\13\34\3\34\3\34\3\35\6\35\u00f6\n\35\r\35\16\35"+
		"\u00f7\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \7 \u010b\n \f \16 \u010e\13 \3 \3 \3 \3 \5 \u0114\n \3 \3"+
		" \3 \3!\5!\u011a\n!\3\"\3\"\5\"\u011e\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\2\2"+
		"(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\2C\2E\2G\2I\2K\2M\"\3\2\7\3\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\4"+
		"\2//@@\5\2C\\aac|\2\u014c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2M\3\2\2\2\3S\3\2"+
		"\2\2\5U\3\2\2\2\7\\\3\2\2\2\tb\3\2\2\2\13d\3\2\2\2\rf\3\2\2\2\17i\3\2"+
		"\2\2\21l\3\2\2\2\23q\3\2\2\2\25x\3\2\2\2\27|\3\2\2\2\31\u0081\3\2\2\2"+
		"\33\u0085\3\2\2\2\35\u0087\3\2\2\2\37\u0089\3\2\2\2!\u008f\3\2\2\2#\u0094"+
		"\3\2\2\2%\u009a\3\2\2\2\'\u00a6\3\2\2\2)\u00ad\3\2\2\2+\u00b3\3\2\2\2"+
		"-\u00d2\3\2\2\2/\u00d6\3\2\2\2\61\u00d8\3\2\2\2\63\u00da\3\2\2\2\65\u00e9"+
		"\3\2\2\2\67\u00eb\3\2\2\29\u00f5\3\2\2\2;\u00fb\3\2\2\2=\u0100\3\2\2\2"+
		"?\u0106\3\2\2\2A\u0119\3\2\2\2C\u011d\3\2\2\2E\u011f\3\2\2\2G\u0125\3"+
		"\2\2\2I\u012f\3\2\2\2K\u0135\3\2\2\2M\u013c\3\2\2\2OT\5E#\2PT\5G$\2QT"+
		"\5K&\2RT\5I%\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\4\3\2\2\2UV\7"+
		"k\2\2VW\7p\2\2WX\7f\2\2XY\7k\2\2YZ\7i\2\2Z[\7q\2\2[\6\3\2\2\2\\]\7u\2"+
		"\2]^\7j\2\2^_\7c\2\2_`\7m\2\2`a\7g\2\2a\b\3\2\2\2bc\7@\2\2c\n\3\2\2\2"+
		"de\7>\2\2e\f\3\2\2\2fg\7@\2\2gh\7?\2\2h\16\3\2\2\2ij\7>\2\2jk\7?\2\2k"+
		"\20\3\2\2\2lm\7r\2\2mn\7k\2\2no\7p\2\2op\7m\2\2p\22\3\2\2\2qr\7q\2\2r"+
		"s\7t\2\2st\7c\2\2tu\7p\2\2uv\7i\2\2vw\7g\2\2w\24\3\2\2\2xy\7t\2\2yz\7"+
		"g\2\2z{\7f\2\2{\26\3\2\2\2|}\7d\2\2}~\7n\2\2~\177\7w\2\2\177\u0080\7g"+
		"\2\2\u0080\30\3\2\2\2\u0081\u0082\7o\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7z\2\2\u0084\32\3\2\2\2\u0085\u0086\7*\2\2\u0086\34\3\2\2\2\u0087\u0088"+
		"\7+\2\2\u0088\36\3\2\2\2\u0089\u008a\7n\2\2\u008a\u008b\7k\2\2\u008b\u008c"+
		"\7i\2\2\u008c\u008d\7j\2\2\u008d\u008e\7v\2\2\u008e \3\2\2\2\u008f\u0090"+
		"\7f\2\2\u0090\u0091\7c\2\2\u0091\u0092\7t\2\2\u0092\u0093\7m\2\2\u0093"+
		"\"\3\2\2\2\u0094\u0095\7D\2\2\u0095\u0096\7n\2\2\u0096\u0097\7c\2\2\u0097"+
		"\u0098\7e\2\2\u0098\u0099\7m\2\2\u0099$\3\2\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7t\2\2\u009c\u009d\7c\2\2\u009d\u009e\7p\2\2\u009e\u009f\7u\2\2"+
		"\u009f\u00a0\7r\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5&\3\2\2\2\u00a6\u00a7"+
		"\7x\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7n\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab\u00ac\7v\2\2\u00ac(\3\2\2\2\u00ad\u00ae\7i\2\2\u00ae"+
		"\u00af\7q\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7f\2\2\u00b1*\3\2\2\2\u00b2"+
		"\u00b4\7/\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00b7\t\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9,\3\2\2\2\u00ba\u00bc\7/\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\t\2"+
		"\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c6\7\60\2\2\u00c3\u00c5\t"+
		"\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00d3\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb\7/"+
		"\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\7\60\2\2\u00cd\u00cf\t\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00bb\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d3.\3\2\2\2\u00d4\u00d7\5;\36\2"+
		"\u00d5\u00d7\5=\37\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\60"+
		"\3\2\2\2\u00d8\u00d9\5? \2\u00d9\62\3\2\2\2\u00da\u00de\5A!\2\u00db\u00dd"+
		"\5C\"\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\64\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\7\17\2"+
		"\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00ea"+
		"\7\f\2\2\u00e5\u00e7\7\17\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00ea\7\u0080\2\2\u00e9\u00e2\3\2\2\2\u00e9"+
		"\u00e6\3\2\2\2\u00ea\66\3\2\2\2\u00eb\u00ef\7%\2\2\u00ec\u00ee\n\3\2\2"+
		"\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\b\34\2\2"+
		"\u00f38\3\2\2\2\u00f4\u00f6\t\4\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3"+
		"\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\b\35\2\2\u00fa:\3\2\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7t\2\2\u00fd"+
		"\u00fe\7w\2\2\u00fe\u00ff\7g\2\2\u00ff<\3\2\2\2\u0100\u0101\7h\2\2\u0101"+
		"\u0102\7c\2\2\u0102\u0103\7n\2\2\u0103\u0104\7u\2\2\u0104\u0105\7g\2\2"+
		"\u0105>\3\2\2\2\u0106\u0107\7/\2\2\u0107\u0108\7@\2\2\u0108\u0113\3\2"+
		"\2\2\u0109\u010b\n\5\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0114\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0110\7/\2\2\u0110\u0111\7@\2\2\u0111\u0112\7/\2\2\u0112\u0114"+
		"\7@\2\2\u0113\u010c\3\2\2\2\u0113\u010f\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\7/\2\2\u0116\u0117\7@\2\2\u0117@\3\2\2\2\u0118\u011a\t\6\2\2\u0119"+
		"\u0118\3\2\2\2\u011aB\3\2\2\2\u011b\u011e\5A!\2\u011c\u011e\4\62;\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011eD\3\2\2\2\u011f\u0120\7I\2\2\u0120"+
		"\u0121\7t\2\2\u0121\u0122\7g\2\2\u0122\u0123\7g\2\2\u0123\u0124\7p\2\2"+
		"\u0124F\3\2\2\2\u0125\u0126\7F\2\2\u0126\u0127\7c\2\2\u0127\u0128\7t\2"+
		"\2\u0128\u0129\7m\2\2\u0129\u012a\7i\2\2\u012a\u012b\7t\2\2\u012b\u012c"+
		"\7g\2\2\u012c\u012d\7g\2\2\u012d\u012e\7p\2\2\u012eH\3\2\2\2\u012f\u0130"+
		"\7D\2\2\u0130\u0131\7t\2\2\u0131\u0132\7q\2\2\u0132\u0133\7y\2\2\u0133"+
		"\u0134\7p\2\2\u0134J\3\2\2\2\u0135\u0136\7R\2\2\u0136\u0137\7w\2\2\u0137"+
		"\u0138\7t\2\2\u0138\u0139\7r\2\2\u0139\u013a\7n\2\2\u013a\u013b\7g\2\2"+
		"\u013bL\3\2\2\2\u013c\u013d\13\2\2\2\u013dN\3\2\2\2\27\2S\u00b3\u00b8"+
		"\u00bb\u00c0\u00c6\u00ca\u00d0\u00d2\u00d6\u00de\u00e2\u00e6\u00e9\u00ef"+
		"\u00f7\u010c\u0113\u0119\u011d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}