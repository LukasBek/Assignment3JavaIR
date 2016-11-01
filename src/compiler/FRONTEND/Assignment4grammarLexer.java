package compiler.FRONTEND;
// Generated from C:\Users\lukas\Dropbox\DTU\Compiler Teknik\ass4\Assignment4grammar.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Assignment4grammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25, NUMBER=26, MAC=27, BYTE=28, WORD=29, HEX=30, HEXNUMBER=31, IPV4ADR=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'ttl'", "'length'", "'id'", "'MF'", "'ICMP'", "'offset'", "'tos'", "'IPv4'", 
		"'none'", "'flags'", "'('", "','", "'TCP'", "'.'", "':'", "'['", "']'", 
		"'>'", "'IGMP'", "'DF'", "'proto'", "'ethertype'", "')'", "'-'", "'UDP'", 
		"NUMBER", "MAC", "BYTE", "WORD", "HEX", "HEXNUMBER", "IPV4ADR"
	};
	public static final String[] ruleNames = {
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"DIGIT", "NUMBER", "MAC", "BYTE", "WORD", "HEX", "HEXNUMBER", "IPV4ADR"
	};


	public Assignment4grammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Assignment4grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\"\u00d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\6\34\u00ac\n\34"+
		"\r\34\16\34\u00ad\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \5 \u00c6\n \3!"+
		"\3!\3!\3!\6!\u00cc\n!\r!\16!\u00cd\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\2#\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)"+
		"\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\2\1\67\34\19\35\1;\36\1=\37"+
		"\1? \1A!\1C\"\1\3\2\3\4\2CHch\u00da\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\3E\3\2\2\2\5I\3\2\2\2\7P\3\2\2\2\tS\3\2\2\2\13V\3\2\2\2\r[\3\2\2\2"+
		"\17b\3\2\2\2\21f\3\2\2\2\23k\3\2\2\2\25p\3\2\2\2\27v\3\2\2\2\31x\3\2\2"+
		"\2\33z\3\2\2\2\35~\3\2\2\2\37\u0080\3\2\2\2!\u0082\3\2\2\2#\u0084\3\2"+
		"\2\2%\u0086\3\2\2\2\'\u0088\3\2\2\2)\u008d\3\2\2\2+\u0090\3\2\2\2-\u0096"+
		"\3\2\2\2/\u00a0\3\2\2\2\61\u00a2\3\2\2\2\63\u00a4\3\2\2\2\65\u00a8\3\2"+
		"\2\2\67\u00ab\3\2\2\29\u00af\3\2\2\2;\u00bb\3\2\2\2=\u00be\3\2\2\2?\u00c5"+
		"\3\2\2\2A\u00c7\3\2\2\2C\u00cf\3\2\2\2EF\7v\2\2FG\7v\2\2GH\7n\2\2H\4\3"+
		"\2\2\2IJ\7n\2\2JK\7g\2\2KL\7p\2\2LM\7i\2\2MN\7v\2\2NO\7j\2\2O\6\3\2\2"+
		"\2PQ\7k\2\2QR\7f\2\2R\b\3\2\2\2ST\7O\2\2TU\7H\2\2U\n\3\2\2\2VW\7K\2\2"+
		"WX\7E\2\2XY\7O\2\2YZ\7R\2\2Z\f\3\2\2\2[\\\7q\2\2\\]\7h\2\2]^\7h\2\2^_"+
		"\7u\2\2_`\7g\2\2`a\7v\2\2a\16\3\2\2\2bc\7v\2\2cd\7q\2\2de\7u\2\2e\20\3"+
		"\2\2\2fg\7K\2\2gh\7R\2\2hi\7x\2\2ij\7\66\2\2j\22\3\2\2\2kl\7p\2\2lm\7"+
		"q\2\2mn\7p\2\2no\7g\2\2o\24\3\2\2\2pq\7h\2\2qr\7n\2\2rs\7c\2\2st\7i\2"+
		"\2tu\7u\2\2u\26\3\2\2\2vw\7*\2\2w\30\3\2\2\2xy\7.\2\2y\32\3\2\2\2z{\7"+
		"V\2\2{|\7E\2\2|}\7R\2\2}\34\3\2\2\2~\177\7\60\2\2\177\36\3\2\2\2\u0080"+
		"\u0081\7<\2\2\u0081 \3\2\2\2\u0082\u0083\7]\2\2\u0083\"\3\2\2\2\u0084"+
		"\u0085\7_\2\2\u0085$\3\2\2\2\u0086\u0087\7@\2\2\u0087&\3\2\2\2\u0088\u0089"+
		"\7K\2\2\u0089\u008a\7I\2\2\u008a\u008b\7O\2\2\u008b\u008c\7R\2\2\u008c"+
		"(\3\2\2\2\u008d\u008e\7F\2\2\u008e\u008f\7H\2\2\u008f*\3\2\2\2\u0090\u0091"+
		"\7r\2\2\u0091\u0092\7t\2\2\u0092\u0093\7q\2\2\u0093\u0094\7v\2\2\u0094"+
		"\u0095\7q\2\2\u0095,\3\2\2\2\u0096\u0097\7g\2\2\u0097\u0098\7v\2\2\u0098"+
		"\u0099\7j\2\2\u0099\u009a\7g\2\2\u009a\u009b\7t\2\2\u009b\u009c\7v\2\2"+
		"\u009c\u009d\7{\2\2\u009d\u009e\7r\2\2\u009e\u009f\7g\2\2\u009f.\3\2\2"+
		"\2\u00a0\u00a1\7+\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7/\2\2\u00a3\62\3\2"+
		"\2\2\u00a4\u00a5\7W\2\2\u00a5\u00a6\7F\2\2\u00a6\u00a7\7R\2\2\u00a7\64"+
		"\3\2\2\2\u00a8\u00a9\4\62;\2\u00a9\66\3\2\2\2\u00aa\u00ac\5\65\33\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae8\3\2\2\2\u00af\u00b0\5;\36\2\u00b0\u00b1\7<\2\2\u00b1\u00b2"+
		"\5;\36\2\u00b2\u00b3\7<\2\2\u00b3\u00b4\5;\36\2\u00b4\u00b5\7<\2\2\u00b5"+
		"\u00b6\5;\36\2\u00b6\u00b7\7<\2\2\u00b7\u00b8\5;\36\2\u00b8\u00b9\7<\2"+
		"\2\u00b9\u00ba\5;\36\2\u00ba:\3\2\2\2\u00bb\u00bc\5? \2\u00bc\u00bd\5"+
		"? \2\u00bd<\3\2\2\2\u00be\u00bf\5? \2\u00bf\u00c0\5? \2\u00c0\u00c1\5"+
		"? \2\u00c1\u00c2\5? \2\u00c2>\3\2\2\2\u00c3\u00c6\5\65\33\2\u00c4\u00c6"+
		"\t\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6@\3\2\2\2\u00c7"+
		"\u00c8\7\62\2\2\u00c8\u00c9\7z\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00cc\5?"+
		" \2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ceB\3\2\2\2\u00cf\u00d0\5\67\34\2\u00d0\u00d1\7\60\2"+
		"\2\u00d1\u00d2\5\67\34\2\u00d2\u00d3\7\60\2\2\u00d3\u00d4\5\67\34\2\u00d4"+
		"\u00d5\7\60\2\2\u00d5\u00d6\5\67\34\2\u00d6\u00d7\7\60\2\2\u00d7\u00d8"+
		"\5\67\34\2\u00d8D\3\2\2\2\6\2\u00ad\u00c5\u00cd";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}