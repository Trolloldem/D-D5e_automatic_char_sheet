// Generated from /home/oldem/IdeaProjects/D_and_D_Compiler/digits4.g4 by ANTLR 4.8

	package myLex;
	//import util.checkStats;
        //import util.classChecker; //util è il nome del mio package, chiamalo come vuoi te


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class digits4Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, BLANKSPACE=6, WS=7, DIGIT=8, STR=9, 
		DEX=10, CHA=11, INT=12, CON=13, WIS=14, STARTENTITY=15, ENDENTITY=16, 
		CREATE=17, PLAYER=18, EQUIPMENT=19, COLON=20, BL=21, RACE=22, HP=23, ARCHTYPE=24, 
		ABILITY=25, ALIGN=26, SKILLSID=27, LANG=28, ARMOR=29, WEAPON=30, SHIELD=31, 
		CONSUMABLES=32, ARMORTYPE=33, WEAPONTYPE=34, SHIELDPRESENCE=35, NONE=36, 
		CONSUMABLE=37, PGCLASS=38, SUBCLASS=39, ALIGNMENT=40, SKILL=41, LANGUAGE=42, 
		RACES=43, LETTER=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "BLANKSPACE", "WS", "DIGIT", 
			"STR", "DEX", "CHA", "INT", "CON", "WIS", "STARTENTITY", "ENDENTITY", 
			"CREATE", "PLAYER", "EQUIPMENT", "COLON", "BL", "RACE", "HP", "ARCHTYPE", 
			"ABILITY", "ALIGN", "SKILLSID", "LANG", "ARMOR", "WEAPON", "SHIELD", 
			"CONSUMABLES", "ARMORTYPE", "WEAPONTYPE", "SHIELDPRESENCE", "NONE", "CONSUMABLE", 
			"PGCLASS", "SUBCLASS", "ALIGNMENT", "SKILL", "LANGUAGE", "RACES", "LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "','", "'->'", "' '", null, null, null, null, 
			null, null, null, null, "'{'", "'}'", "'create'", "'Player'", "'Equipment'", 
			"':'", null, null, null, null, null, null, null, null, "'armor'", "'weapon'", 
			"'shield'", "'consumables'", null, null, null, "'None'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "BLANKSPACE", "WS", "DIGIT", "STR", 
			"DEX", "CHA", "INT", "CON", "WIS", "STARTENTITY", "ENDENTITY", "CREATE", 
			"PLAYER", "EQUIPMENT", "COLON", "BL", "RACE", "HP", "ARCHTYPE", "ABILITY", 
			"ALIGN", "SKILLSID", "LANG", "ARMOR", "WEAPON", "SHIELD", "CONSUMABLES", 
			"ARMORTYPE", "WEAPONTYPE", "SHIELDPRESENCE", "NONE", "CONSUMABLE", "PGCLASS", 
			"SUBCLASS", "ALIGNMENT", "SKILL", "LANGUAGE", "RACES", "LETTER"
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


	public digits4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "digits4.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u024f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\6\to\n\t\r\t\16\tp\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\5\26\u00ac\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u011a\n\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u012d\n#\3$\3$\3$\3$\3$\5$\u0134\n"+
		"$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0157\n&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u016f"+
		"\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0195\n(\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0201\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5"+
		"*\u0223\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0237"+
		"\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0249\n,\3-\6-"+
		"\u024c\n-\r-\16-\u024d\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\3\4\2C"+
		"\\c|\2\u026b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3"+
		"\2\2\2\ta\3\2\2\2\13c\3\2\2\2\rf\3\2\2\2\17h\3\2\2\2\21n\3\2\2\2\23r\3"+
		"\2\2\2\25v\3\2\2\2\27z\3\2\2\2\31~\3\2\2\2\33\u0082\3\2\2\2\35\u0086\3"+
		"\2\2\2\37\u008a\3\2\2\2!\u008c\3\2\2\2#\u008e\3\2\2\2%\u0095\3\2\2\2\'"+
		"\u009c\3\2\2\2)\u00a6\3\2\2\2+\u00ab\3\2\2\2-\u00ad\3\2\2\2/\u00b2\3\2"+
		"\2\2\61\u00b5\3\2\2\2\63\u00bf\3\2\2\2\65\u00c9\3\2\2\2\67\u00d3\3\2\2"+
		"\29\u00da\3\2\2\2;\u00e4\3\2\2\2=\u00ea\3\2\2\2?\u00f1\3\2\2\2A\u00f8"+
		"\3\2\2\2C\u0119\3\2\2\2E\u012c\3\2\2\2G\u0133\3\2\2\2I\u0135\3\2\2\2K"+
		"\u0156\3\2\2\2M\u016e\3\2\2\2O\u0194\3\2\2\2Q\u0200\3\2\2\2S\u0222\3\2"+
		"\2\2U\u0236\3\2\2\2W\u0248\3\2\2\2Y\u024b\3\2\2\2[\\\7*\2\2\\\4\3\2\2"+
		"\2]^\7+\2\2^\6\3\2\2\2_`\7,\2\2`\b\3\2\2\2ab\7.\2\2b\n\3\2\2\2cd\7/\2"+
		"\2de\7@\2\2e\f\3\2\2\2fg\7\"\2\2g\16\3\2\2\2hi\5\r\7\2ij\5\r\7\2jk\3\2"+
		"\2\2kl\b\b\2\2l\20\3\2\2\2mo\4\62;\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3"+
		"\2\2\2q\22\3\2\2\2rs\7U\2\2st\7V\2\2tu\7T\2\2u\24\3\2\2\2vw\7F\2\2wx\7"+
		"G\2\2xy\7Z\2\2y\26\3\2\2\2z{\7E\2\2{|\7J\2\2|}\7C\2\2}\30\3\2\2\2~\177"+
		"\7K\2\2\177\u0080\7P\2\2\u0080\u0081\7V\2\2\u0081\32\3\2\2\2\u0082\u0083"+
		"\7E\2\2\u0083\u0084\7Q\2\2\u0084\u0085\7P\2\2\u0085\34\3\2\2\2\u0086\u0087"+
		"\7Y\2\2\u0087\u0088\7K\2\2\u0088\u0089\7U\2\2\u0089\36\3\2\2\2\u008a\u008b"+
		"\7}\2\2\u008b \3\2\2\2\u008c\u008d\7\177\2\2\u008d\"\3\2\2\2\u008e\u008f"+
		"\7e\2\2\u008f\u0090\7t\2\2\u0090\u0091\7g\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7v\2\2\u0093\u0094\7g\2\2\u0094$\3\2\2\2\u0095\u0096\7R\2\2\u0096"+
		"\u0097\7n\2\2\u0097\u0098\7c\2\2\u0098\u0099\7{\2\2\u0099\u009a\7g\2\2"+
		"\u009a\u009b\7t\2\2\u009b&\3\2\2\2\u009c\u009d\7G\2\2\u009d\u009e\7s\2"+
		"\2\u009e\u009f\7w\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2"+
		"\7o\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"(\3\2\2\2\u00a6\u00a7\7<\2\2\u00a7*\3\2\2\2\u00a8\u00ac\7\f\2\2\u00a9"+
		"\u00aa\7\17\2\2\u00aa\u00ac\7\f\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ac,\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7c\2\2\u00af\u00b0"+
		"\7e\2\2\u00b0\u00b1\7g\2\2\u00b1.\3\2\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4"+
		"\7r\2\2\u00b4\60\3\2\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8"+
		"\7e\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7v\2\2\u00bb"+
		"\u00bc\7{\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7g\2\2\u00be\62\3\2\2\2\u00bf"+
		"\u00c0\7c\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7n\2\2"+
		"\u00c3\u00c4\7k\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7"+
		"\7g\2\2\u00c7\u00c8\7u\2\2\u00c8\64\3\2\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb"+
		"\7n\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7i\2\2\u00cd\u00ce\7p\2\2\u00ce"+
		"\u00cf\7o\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2"+
		"\u00d2\66\3\2\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7m\2\2\u00d5\u00d6\7"+
		"k\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7u\2\2\u00d98"+
		"\3\2\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7p\2\2\u00dd"+
		"\u00de\7i\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7i\2\2"+
		"\u00e1\u00e2\7g\2\2\u00e2\u00e3\7u\2\2\u00e3:\3\2\2\2\u00e4\u00e5\7c\2"+
		"\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7o\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9"+
		"\7t\2\2\u00e9<\3\2\2\2\u00ea\u00eb\7y\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed"+
		"\7c\2\2\u00ed\u00ee\7r\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7p\2\2\u00f0"+
		">\3\2\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7j\2\2\u00f3\u00f4\7k\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7f\2\2\u00f7@\3\2\2\2\u00f8"+
		"\u00f9\7e\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7u\2\2"+
		"\u00fc\u00fd\7w\2\2\u00fd\u00fe\7o\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100"+
		"\7d\2\2\u0100\u0101\7n\2\2\u0101\u0102\7g\2\2\u0102\u0103\7u\2\2\u0103"+
		"B\3\2\2\2\u0104\u0105\7J\2\2\u0105\u0106\7c\2\2\u0106\u0107\7n\2\2\u0107"+
		"\u0108\7h\2\2\u0108\u0109\7\"\2\2\u0109\u010a\7r\2\2\u010a\u010b\7n\2"+
		"\2\u010b\u010c\7c\2\2\u010c\u010d\7v\2\2\u010d\u011a\7g\2\2\u010e\u010f"+
		"\7H\2\2\u010f\u0110\7w\2\2\u0110\u0111\7n\2\2\u0111\u0112\7n\2\2\u0112"+
		"\u0113\7\"\2\2\u0113\u0114\7r\2\2\u0114\u0115\7n\2\2\u0115\u0116\7c\2"+
		"\2\u0116\u0117\7v\2\2\u0117\u011a\7g\2\2\u0118\u011a\5I%\2\u0119\u0104"+
		"\3\2\2\2\u0119\u010e\3\2\2\2\u0119\u0118\3\2\2\2\u011aD\3\2\2\2\u011b"+
		"\u011c\7D\2\2\u011c\u011d\7c\2\2\u011d\u011e\7u\2\2\u011e\u011f\7v\2\2"+
		"\u011f\u0120\7c\2\2\u0120\u0121\7t\2\2\u0121\u0122\7f\2\2\u0122\u0123"+
		"\7\"\2\2\u0123\u0124\7u\2\2\u0124\u0125\7y\2\2\u0125\u0126\7q\2\2\u0126"+
		"\u0127\7t\2\2\u0127\u012d\7f\2\2\u0128\u0129\7C\2\2\u0129\u012a\7z\2\2"+
		"\u012a\u012d\7g\2\2\u012b\u012d\5I%\2\u012c\u011b\3\2\2\2\u012c\u0128"+
		"\3\2\2\2\u012c\u012b\3\2\2\2\u012dF\3\2\2\2\u012e\u012f\7[\2\2\u012f\u0130"+
		"\7g\2\2\u0130\u0134\7u\2\2\u0131\u0132\7P\2\2\u0132\u0134\7q\2\2\u0133"+
		"\u012e\3\2\2\2\u0133\u0131\3\2\2\2\u0134H\3\2\2\2\u0135\u0136\7P\2\2\u0136"+
		"\u0137\7q\2\2\u0137\u0138\7p\2\2\u0138\u0139\7g\2\2\u0139J\3\2\2\2\u013a"+
		"\u013b\7J\2\2\u013b\u013c\7g\2\2\u013c\u013d\7c\2\2\u013d\u013e\7n\2\2"+
		"\u013e\u013f\7v\2\2\u013f\u0140\7j\2\2\u0140\u0141\7\"\2\2\u0141\u0142"+
		"\7r\2\2\u0142\u0143\7q\2\2\u0143\u0144\7v\2\2\u0144\u0145\7k\2\2\u0145"+
		"\u0146\7q\2\2\u0146\u0157\7p\2\2\u0147\u0148\7O\2\2\u0148\u0149\7c\2\2"+
		"\u0149\u014a\7p\2\2\u014a\u014b\7c\2\2\u014b\u014c\7\"\2\2\u014c\u014d"+
		"\7r\2\2\u014d\u014e\7q\2\2\u014e\u014f\7v\2\2\u014f\u0150\7k\2\2\u0150"+
		"\u0151\7q\2\2\u0151\u0157\7p\2\2\u0152\u0153\7I\2\2\u0153\u0154\7q\2\2"+
		"\u0154\u0155\7n\2\2\u0155\u0157\7f\2\2\u0156\u013a\3\2\2\2\u0156\u0147"+
		"\3\2\2\2\u0156\u0152\3\2\2\2\u0157L\3\2\2\2\u0158\u0159\7E\2\2\u0159\u015a"+
		"\7n\2\2\u015a\u015b\7g\2\2\u015b\u015c\7t\2\2\u015c\u015d\7k\2\2\u015d"+
		"\u016f\7e\2\2\u015e\u015f\7R\2\2\u015f\u0160\7c\2\2\u0160\u0161\7n\2\2"+
		"\u0161\u0162\7c\2\2\u0162\u0163\7f\2\2\u0163\u0164\7k\2\2\u0164\u016f"+
		"\7p\2\2\u0165\u0166\7D\2\2\u0166\u0167\7c\2\2\u0167\u0168\7t\2\2\u0168"+
		"\u0169\7d\2\2\u0169\u016a\7c\2\2\u016a\u016b\7t\2\2\u016b\u016c\7k\2\2"+
		"\u016c\u016d\7c\2\2\u016d\u016f\7p\2\2\u016e\u0158\3\2\2\2\u016e\u015e"+
		"\3\2\2\2\u016e\u0165\3\2\2\2\u016fN\3\2\2\2\u0170\u0171\7D\2\2\u0171\u0172"+
		"\7g\2\2\u0172\u0173\7t\2\2\u0173\u0174\7u\2\2\u0174\u0175\7g\2\2\u0175"+
		"\u0176\7t\2\2\u0176\u0177\7m\2\2\u0177\u0178\7g\2\2\u0178\u0195\7t\2\2"+
		"\u0179\u017a\7V\2\2\u017a\u017b\7q\2\2\u017b\u017c\7v\2\2\u017c\u017d"+
		"\7g\2\2\u017d\u017e\7o\2\2\u017e\u017f\7\"\2\2\u017f\u0180\7y\2\2\u0180"+
		"\u0181\7c\2\2\u0181\u0182\7t\2\2\u0182\u0183\7t\2\2\u0183\u0184\7k\2\2"+
		"\u0184\u0185\7q\2\2\u0185\u0195\7t\2\2\u0186\u0187\7F\2\2\u0187\u0188"+
		"\7q\2\2\u0188\u0189\7o\2\2\u0189\u018a\7c\2\2\u018a\u018b\7k\2\2\u018b"+
		"\u018c\7p\2\2\u018c\u018d\7\"\2\2\u018d\u018e\7q\2\2\u018e\u018f\7h\2"+
		"\2\u018f\u0190\7\"\2\2\u0190\u0191\7n\2\2\u0191\u0192\7k\2\2\u0192\u0193"+
		"\7h\2\2\u0193\u0195\7g\2\2\u0194\u0170\3\2\2\2\u0194\u0179\3\2\2\2\u0194"+
		"\u0186\3\2\2\2\u0195P\3\2\2\2\u0196\u0197\7n\2\2\u0197\u0198\7c\2\2\u0198"+
		"\u0199\7y\2\2\u0199\u019a\7h\2\2\u019a\u019b\7w\2\2\u019b\u019c\7n\2\2"+
		"\u019c\u019d\7\"\2\2\u019d\u019e\7i\2\2\u019e\u019f\7q\2\2\u019f\u01a0"+
		"\7q\2\2\u01a0\u0201\7f\2\2\u01a1\u01a2\7n\2\2\u01a2\u01a3\7c\2\2\u01a3"+
		"\u01a4\7y\2\2\u01a4\u01a5\7h\2\2\u01a5\u01a6\7w\2\2\u01a6\u01a7\7n\2\2"+
		"\u01a7\u01a8\7\"\2\2\u01a8\u01a9\7p\2\2\u01a9\u01aa\7g\2\2\u01aa\u01ab"+
		"\7w\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7t\2\2\u01ad\u01ae\7c\2\2\u01ae"+
		"\u0201\7n\2\2\u01af\u01b0\7n\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7y\2\2"+
		"\u01b2\u01b3\7h\2\2\u01b3\u01b4\7w\2\2\u01b4\u01b5\7n\2\2\u01b5\u01b6"+
		"\7\"\2\2\u01b6\u01b7\7g\2\2\u01b7\u01b8\7x\2\2\u01b8\u01b9\7k\2\2\u01b9"+
		"\u0201\7n\2\2\u01ba\u01bb\7p\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7w\2\2"+
		"\u01bd\u01be\7v\2\2\u01be\u01bf\7t\2\2\u01bf\u01c0\7c\2\2\u01c0\u01c1"+
		"\7n\2\2\u01c1\u01c2\7\"\2\2\u01c2\u01c3\7i\2\2\u01c3\u01c4\7q\2\2\u01c4"+
		"\u01c5\7q\2\2\u01c5\u0201\7f\2\2\u01c6\u01c7\7p\2\2\u01c7\u01c8\7g\2\2"+
		"\u01c8\u01c9\7w\2\2\u01c9\u01ca\7v\2\2\u01ca\u01cb\7t\2\2\u01cb\u01cc"+
		"\7c\2\2\u01cc\u0201\7n\2\2\u01cd\u01ce\7p\2\2\u01ce\u01cf\7g\2\2\u01cf"+
		"\u01d0\7w\2\2\u01d0\u01d1\7v\2\2\u01d1\u01d2\7t\2\2\u01d2\u01d3\7c\2\2"+
		"\u01d3\u01d4\7n\2\2\u01d4\u01d5\7\"\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7"+
		"\7x\2\2\u01d7\u01d8\7k\2\2\u01d8\u0201\7n\2\2\u01d9\u01da\7e\2\2\u01da"+
		"\u01db\7j\2\2\u01db\u01dc\7c\2\2\u01dc\u01dd\7q\2\2\u01dd\u01de\7v\2\2"+
		"\u01de\u01df\7k\2\2\u01df\u01e0\7e\2\2\u01e0\u01e1\7\"\2\2\u01e1\u01e2"+
		"\7i\2\2\u01e2\u01e3\7q\2\2\u01e3\u01e4\7q\2\2\u01e4\u0201\7f\2\2\u01e5"+
		"\u01e6\7e\2\2\u01e6\u01e7\7j\2\2\u01e7\u01e8\7c\2\2\u01e8\u01e9\7q\2\2"+
		"\u01e9\u01ea\7v\2\2\u01ea\u01eb\7k\2\2\u01eb\u01ec\7e\2\2\u01ec\u01ed"+
		"\7\"\2\2\u01ed\u01ee\7p\2\2\u01ee\u01ef\7g\2\2\u01ef\u01f0\7w\2\2\u01f0"+
		"\u01f1\7v\2\2\u01f1\u01f2\7t\2\2\u01f2\u01f3\7c\2\2\u01f3\u0201\7n\2\2"+
		"\u01f4\u01f5\7e\2\2\u01f5\u01f6\7j\2\2\u01f6\u01f7\7c\2\2\u01f7\u01f8"+
		"\7q\2\2\u01f8\u01f9\7v\2\2\u01f9\u01fa\7k\2\2\u01fa\u01fb\7e\2\2\u01fb"+
		"\u01fc\7\"\2\2\u01fc\u01fd\7g\2\2\u01fd\u01fe\7x\2\2\u01fe\u01ff\7k\2"+
		"\2\u01ff\u0201\7n\2\2\u0200\u0196\3\2\2\2\u0200\u01a1\3\2\2\2\u0200\u01af"+
		"\3\2\2\2\u0200\u01ba\3\2\2\2\u0200\u01c6\3\2\2\2\u0200\u01cd\3\2\2\2\u0200"+
		"\u01d9\3\2\2\2\u0200\u01e5\3\2\2\2\u0200\u01f4\3\2\2\2\u0201R\3\2\2\2"+
		"\u0202\u0203\7C\2\2\u0203\u0204\7e\2\2\u0204\u0205\7t\2\2\u0205\u0206"+
		"\7q\2\2\u0206\u0207\7d\2\2\u0207\u0208\7c\2\2\u0208\u0209\7v\2\2\u0209"+
		"\u020a\7k\2\2\u020a\u020b\7e\2\2\u020b\u0223\7u\2\2\u020c\u020d\7C\2\2"+
		"\u020d\u020e\7p\2\2\u020e\u020f\7k\2\2\u020f\u0210\7o\2\2\u0210\u0211"+
		"\7c\2\2\u0211\u0212\7n\2\2\u0212\u0213\7\"\2\2\u0213\u0214\7J\2\2\u0214"+
		"\u0215\7c\2\2\u0215\u0216\7p\2\2\u0216\u0217\7f\2\2\u0217\u0218\7n\2\2"+
		"\u0218\u0219\7k\2\2\u0219\u021a\7p\2\2\u021a\u0223\7i\2\2\u021b\u021c"+
		"\7J\2\2\u021c\u021d\7k\2\2\u021d\u021e\7u\2\2\u021e\u021f\7v\2\2\u021f"+
		"\u0220\7q\2\2\u0220\u0221\7t\2\2\u0221\u0223\7{\2\2\u0222\u0202\3\2\2"+
		"\2\u0222\u020c\3\2\2\2\u0222\u021b\3\2\2\2\u0223T\3\2\2\2\u0224\u0225"+
		"\7E\2\2\u0225\u0226\7q\2\2\u0226\u0227\7o\2\2\u0227\u0228\7o\2\2\u0228"+
		"\u0229\7q\2\2\u0229\u0237\7p\2\2\u022a\u022b\7G\2\2\u022b\u022c\7n\2\2"+
		"\u022c\u022d\7h\2\2\u022d\u022e\7k\2\2\u022e\u0237\7e\2\2\u022f\u0230"+
		"\7C\2\2\u0230\u0231\7d\2\2\u0231\u0232\7k\2\2\u0232\u0233\7u\2\2\u0233"+
		"\u0234\7u\2\2\u0234\u0235\7c\2\2\u0235\u0237\7n\2\2\u0236\u0224\3\2\2"+
		"\2\u0236\u022a\3\2\2\2\u0236\u022f\3\2\2\2\u0237V\3\2\2\2\u0238\u0239"+
		"\7G\2\2\u0239\u023a\7n\2\2\u023a\u0249\7h\2\2\u023b\u023c\7J\2\2\u023c"+
		"\u023d\7w\2\2\u023d\u023e\7o\2\2\u023e\u023f\7c\2\2\u023f\u0249\7p\2\2"+
		"\u0240\u0241\7Q\2\2\u0241\u0242\7t\2\2\u0242\u0249\7e\2\2\u0243\u0244"+
		"\7F\2\2\u0244\u0245\7y\2\2\u0245\u0246\7c\2\2\u0246\u0247\7t\2\2\u0247"+
		"\u0249\7h\2\2\u0248\u0238\3\2\2\2\u0248\u023b\3\2\2\2\u0248\u0240\3\2"+
		"\2\2\u0248\u0243\3\2\2\2\u0249X\3\2\2\2\u024a\u024c\t\2\2\2\u024b\u024a"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"Z\3\2\2\2\20\2p\u00ab\u0119\u012c\u0133\u0156\u016e\u0194\u0200\u0222"+
		"\u0236\u0248\u024d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}