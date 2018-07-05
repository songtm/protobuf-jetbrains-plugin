// Generated from /Users/songtianming/Documents/dev/proj/protobuf-jetbrains-plugin/src/main/ProtoLexer.g4 by ANTLR 4.7
package io.protostuff.compiler.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProtoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PACKAGE=1, SYNTAX=2, IMPORT=3, PUBLIC=4, OPTION=5, MESSAGE=6, GROUP=7, 
		OPTIONAL=8, REQUIRED=9, REPEATED=10, ONEOF=11, EXTEND=12, EXTENSIONS=13, 
		TO=14, MAX=15, RESERVED=16, ENUM=17, SERVICE=18, RPC=19, RETURNS=20, STREAM=21, 
		MAP=22, BOOLEAN_VALUE=23, DOUBLE=24, FLOAT=25, INT32=26, INT64=27, UINT32=28, 
		UINT64=29, SINT32=30, SINT64=31, FIXED32=32, FIXED64=33, SFIXED32=34, 
		SFIXED64=35, BOOL=36, STRING=37, BYTES=38, COMMENT=39, LINE_COMMENT=40, 
		PLUGIN_DEV_MARKER=41, NL=42, WS=43, LCURLY=44, RCURLY=45, LPAREN=46, RPAREN=47, 
		LSQUARE=48, RSQUARE=49, LT=50, GT=51, COMMA=52, DOT=53, COLON=54, SEMICOLON=55, 
		ASSIGN=56, IDENT=57, STRING_VALUE=58, INTEGER_VALUE=59, FLOAT_VALUE=60, 
		ERRCHAR=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PACKAGE", "SYNTAX", "IMPORT", "PUBLIC", "OPTION", "MESSAGE", "GROUP", 
		"OPTIONAL", "REQUIRED", "REPEATED", "ONEOF", "EXTEND", "EXTENSIONS", "TO", 
		"MAX", "RESERVED", "ENUM", "SERVICE", "RPC", "RETURNS", "STREAM", "MAP", 
		"BOOLEAN_VALUE", "DOUBLE", "FLOAT", "INT32", "INT64", "UINT32", "UINT64", 
		"SINT32", "SINT64", "FIXED32", "FIXED64", "SFIXED32", "SFIXED64", "BOOL", 
		"STRING", "BYTES", "COMMENT", "LINE_COMMENT", "PLUGIN_DEV_MARKER", "NL", 
		"WS", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LT", 
		"GT", "COMMA", "DOT", "COLON", "SEMICOLON", "ASSIGN", "IDENT", "STRING_VALUE", 
		"INTEGER_VALUE", "FLOAT_VALUE", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING", 
		"EXPONENT", "FLOAT_LIT", "INF", "NAN", "EXP", "DEC_VALUE", "HEX_VALUE", 
		"OCT_VALUE", "MINUS", "ALPHA", "DIGIT", "HEX_DIGIT", "OCT_DIGIT", "UNDERSCORE", 
		"ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC", "ERRCHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package'", "'syntax'", "'import'", "'public'", "'option'", "'message'", 
		"'group'", "'optional'", "'required'", "'repeated'", "'oneof'", "'extend'", 
		"'extensions'", "'to'", "'max'", "'reserved'", "'enum'", "'service'", 
		"'rpc'", "'returns'", "'stream'", "'map'", null, "'double'", "'float'", 
		"'int32'", "'int64'", "'uint32'", "'uint64'", "'sint32'", "'sint64'", 
		"'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", "'bool'", "'string'", 
		"'bytes'", null, null, null, null, null, "'{'", "'}'", "'('", "')'", "'['", 
		"']'", "'<'", "'>'", "','", "'.'", "':'", "';'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PACKAGE", "SYNTAX", "IMPORT", "PUBLIC", "OPTION", "MESSAGE", "GROUP", 
		"OPTIONAL", "REQUIRED", "REPEATED", "ONEOF", "EXTEND", "EXTENSIONS", "TO", 
		"MAX", "RESERVED", "ENUM", "SERVICE", "RPC", "RETURNS", "STREAM", "MAP", 
		"BOOLEAN_VALUE", "DOUBLE", "FLOAT", "INT32", "INT64", "UINT32", "UINT64", 
		"SINT32", "SINT64", "FIXED32", "FIXED64", "SFIXED32", "SFIXED64", "BOOL", 
		"STRING", "BYTES", "COMMENT", "LINE_COMMENT", "PLUGIN_DEV_MARKER", "NL", 
		"WS", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LT", 
		"GT", "COMMA", "DOT", "COLON", "SEMICOLON", "ASSIGN", "IDENT", "STRING_VALUE", 
		"INTEGER_VALUE", "FLOAT_VALUE", "ERRCHAR"
	};
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


	public ProtoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProtoLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u02e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u0146\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u01b5\n(\f(\16(\u01b8"+
		"\13(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u01c3\n)\f)\16)\u01c6\13)\3)\3)\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\6*\u01d7\n*\r*\16*\u01d8\3*\7*\u01dc"+
		"\n*\f*\16*\u01df\13*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u01ec\n*\f*\16"+
		"*\u01ef\13*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u0202"+
		"\n*\f*\16*\u0205\13*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u020f\n*\3*\3*\3+\5+\u0214"+
		"\n+\3+\3+\3+\3+\3,\6,\u021b\n,\r,\16,\u021c\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\67\3\67\38\38\39\39\3:\3:\5:\u023d\n:\3:\3:\3:\7:\u0242\n:\f:\16:\u0245"+
		"\13:\3;\3;\5;\u0249\n;\3<\3<\3<\5<\u024e\n<\3=\3=\3=\5=\u0253\n=\3=\3"+
		"=\5=\u0257\n=\3>\3>\3>\7>\u025c\n>\f>\16>\u025f\13>\3>\3>\3?\3?\3?\7?"+
		"\u0266\n?\f?\16?\u0269\13?\3?\3?\3@\3@\5@\u026f\n@\3@\3@\3@\3A\5A\u0275"+
		"\nA\3A\6A\u0278\nA\rA\16A\u0279\3A\3A\7A\u027e\nA\fA\16A\u0281\13A\3A"+
		"\5A\u0284\nA\3A\3A\6A\u0288\nA\rA\16A\u0289\5A\u028c\nA\3B\3B\3B\3B\3"+
		"C\3C\3C\3C\3D\3D\3E\3E\5E\u029a\nE\3E\3E\7E\u029e\nE\fE\16E\u02a1\13E"+
		"\5E\u02a3\nE\3F\5F\u02a6\nF\3F\3F\3F\6F\u02ab\nF\rF\16F\u02ac\3G\5G\u02b0"+
		"\nG\3G\3G\6G\u02b4\nG\rG\16G\u02b5\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3"+
		"M\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u02cd\nN\3O\3O\3O\3O\3O\3O\3O\3O\3O\3"+
		"O\3O\5O\u02da\nO\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\6\u01b6\u01dd\u01ed"+
		"\u0203\2R\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089"+
		"\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b"+
		"\2\u009d\2\u009f\2\u00a1?\3\2\16\4\2\f\f\17\17\4\2\13\13\"\"\6\2\f\f\17"+
		"\17$$^^\6\2\f\f\17\17))^^\4\2GGgg\4\2ZZzz\4\2C\\c|\3\2\62;\5\2\62;CHc"+
		"h\3\2\629\f\2$$))AA^^cdhhppttvvxx\3\2\62\65\2\u0302\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2\u00a1\3\2\2\2\3\u00a3"+
		"\3\2\2\2\5\u00ab\3\2\2\2\7\u00b2\3\2\2\2\t\u00b9\3\2\2\2\13\u00c0\3\2"+
		"\2\2\r\u00c7\3\2\2\2\17\u00cf\3\2\2\2\21\u00d5\3\2\2\2\23\u00de\3\2\2"+
		"\2\25\u00e7\3\2\2\2\27\u00f0\3\2\2\2\31\u00f6\3\2\2\2\33\u00fd\3\2\2\2"+
		"\35\u0108\3\2\2\2\37\u010b\3\2\2\2!\u010f\3\2\2\2#\u0118\3\2\2\2%\u011d"+
		"\3\2\2\2\'\u0125\3\2\2\2)\u0129\3\2\2\2+\u0131\3\2\2\2-\u0138\3\2\2\2"+
		"/\u0145\3\2\2\2\61\u0147\3\2\2\2\63\u014e\3\2\2\2\65\u0154\3\2\2\2\67"+
		"\u015a\3\2\2\29\u0160\3\2\2\2;\u0167\3\2\2\2=\u016e\3\2\2\2?\u0175\3\2"+
		"\2\2A\u017c\3\2\2\2C\u0184\3\2\2\2E\u018c\3\2\2\2G\u0195\3\2\2\2I\u019e"+
		"\3\2\2\2K\u01a3\3\2\2\2M\u01aa\3\2\2\2O\u01b0\3\2\2\2Q\u01be\3\2\2\2S"+
		"\u020e\3\2\2\2U\u0213\3\2\2\2W\u021a\3\2\2\2Y\u0220\3\2\2\2[\u0222\3\2"+
		"\2\2]\u0224\3\2\2\2_\u0226\3\2\2\2a\u0228\3\2\2\2c\u022a\3\2\2\2e\u022c"+
		"\3\2\2\2g\u022e\3\2\2\2i\u0230\3\2\2\2k\u0232\3\2\2\2m\u0234\3\2\2\2o"+
		"\u0236\3\2\2\2q\u0238\3\2\2\2s\u023c\3\2\2\2u\u0248\3\2\2\2w\u024d\3\2"+
		"\2\2y\u0256\3\2\2\2{\u0258\3\2\2\2}\u0262\3\2\2\2\177\u026e\3\2\2\2\u0081"+
		"\u028b\3\2\2\2\u0083\u028d\3\2\2\2\u0085\u0291\3\2\2\2\u0087\u0295\3\2"+
		"\2\2\u0089\u02a2\3\2\2\2\u008b\u02a5\3\2\2\2\u008d\u02af\3\2\2\2\u008f"+
		"\u02b7\3\2\2\2\u0091\u02b9\3\2\2\2\u0093\u02bb\3\2\2\2\u0095\u02bd\3\2"+
		"\2\2\u0097\u02bf\3\2\2\2\u0099\u02c1\3\2\2\2\u009b\u02cc\3\2\2\2\u009d"+
		"\u02d9\3\2\2\2\u009f\u02db\3\2\2\2\u00a1\u02e2\3\2\2\2\u00a3\u00a4\7r"+
		"\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7m\2\2\u00a7\u00a8"+
		"\7c\2\2\u00a8\u00a9\7i\2\2\u00a9\u00aa\7g\2\2\u00aa\4\3\2\2\2\u00ab\u00ac"+
		"\7u\2\2\u00ac\u00ad\7{\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af"+
		"\u00b0\7c\2\2\u00b0\u00b1\7z\2\2\u00b1\6\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7o\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7t\2\2"+
		"\u00b7\u00b8\7v\2\2\u00b8\b\3\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7w"+
		"\2\2\u00bb\u00bc\7d\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7k\2\2\u00be\u00bf"+
		"\7e\2\2\u00bf\n\3\2\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7r\2\2\u00c2\u00c3"+
		"\7v\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7p\2\2\u00c6"+
		"\f\3\2\2\2\u00c7\u00c8\7o\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7u\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7i\2\2\u00cd\u00ce\7g\2\2"+
		"\u00ce\16\3\2\2\2\u00cf\u00d0\7i\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7"+
		"q\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7r\2\2\u00d4\20\3\2\2\2\u00d5\u00d6"+
		"\7q\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7k\2\2\u00d9"+
		"\u00da\7q\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7n\2\2"+
		"\u00dd\22\3\2\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7"+
		"s\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5"+
		"\7g\2\2\u00e5\u00e6\7f\2\2\u00e6\24\3\2\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9"+
		"\7g\2\2\u00e9\u00ea\7r\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7c\2\2\u00ec"+
		"\u00ed\7v\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7f\2\2\u00ef\26\3\2\2\2\u00f0"+
		"\u00f1\7q\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7q\2\2"+
		"\u00f4\u00f5\7h\2\2\u00f5\30\3\2\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7"+
		"z\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc"+
		"\7f\2\2\u00fc\32\3\2\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7z\2\2\u00ff\u0100"+
		"\7v\2\2\u0100\u0101\7g\2\2\u0101\u0102\7p\2\2\u0102\u0103\7u\2\2\u0103"+
		"\u0104\7k\2\2\u0104\u0105\7q\2\2\u0105\u0106\7p\2\2\u0106\u0107\7u\2\2"+
		"\u0107\34\3\2\2\2\u0108\u0109\7v\2\2\u0109\u010a\7q\2\2\u010a\36\3\2\2"+
		"\2\u010b\u010c\7o\2\2\u010c\u010d\7c\2\2\u010d\u010e\7z\2\2\u010e \3\2"+
		"\2\2\u010f\u0110\7t\2\2\u0110\u0111\7g\2\2\u0111\u0112\7u\2\2\u0112\u0113"+
		"\7g\2\2\u0113\u0114\7t\2\2\u0114\u0115\7x\2\2\u0115\u0116\7g\2\2\u0116"+
		"\u0117\7f\2\2\u0117\"\3\2\2\2\u0118\u0119\7g\2\2\u0119\u011a\7p\2\2\u011a"+
		"\u011b\7w\2\2\u011b\u011c\7o\2\2\u011c$\3\2\2\2\u011d\u011e\7u\2\2\u011e"+
		"\u011f\7g\2\2\u011f\u0120\7t\2\2\u0120\u0121\7x\2\2\u0121\u0122\7k\2\2"+
		"\u0122\u0123\7e\2\2\u0123\u0124\7g\2\2\u0124&\3\2\2\2\u0125\u0126\7t\2"+
		"\2\u0126\u0127\7r\2\2\u0127\u0128\7e\2\2\u0128(\3\2\2\2\u0129\u012a\7"+
		"t\2\2\u012a\u012b\7g\2\2\u012b\u012c\7v\2\2\u012c\u012d\7w\2\2\u012d\u012e"+
		"\7t\2\2\u012e\u012f\7p\2\2\u012f\u0130\7u\2\2\u0130*\3\2\2\2\u0131\u0132"+
		"\7u\2\2\u0132\u0133\7v\2\2\u0133\u0134\7t\2\2\u0134\u0135\7g\2\2\u0135"+
		"\u0136\7c\2\2\u0136\u0137\7o\2\2\u0137,\3\2\2\2\u0138\u0139\7o\2\2\u0139"+
		"\u013a\7c\2\2\u013a\u013b\7r\2\2\u013b.\3\2\2\2\u013c\u013d\7v\2\2\u013d"+
		"\u013e\7t\2\2\u013e\u013f\7w\2\2\u013f\u0146\7g\2\2\u0140\u0141\7h\2\2"+
		"\u0141\u0142\7c\2\2\u0142\u0143\7n\2\2\u0143\u0144\7u\2\2\u0144\u0146"+
		"\7g\2\2\u0145\u013c\3\2\2\2\u0145\u0140\3\2\2\2\u0146\60\3\2\2\2\u0147"+
		"\u0148\7f\2\2\u0148\u0149\7q\2\2\u0149\u014a\7w\2\2\u014a\u014b\7d\2\2"+
		"\u014b\u014c\7n\2\2\u014c\u014d\7g\2\2\u014d\62\3\2\2\2\u014e\u014f\7"+
		"h\2\2\u014f\u0150\7n\2\2\u0150\u0151\7q\2\2\u0151\u0152\7c\2\2\u0152\u0153"+
		"\7v\2\2\u0153\64\3\2\2\2\u0154\u0155\7k\2\2\u0155\u0156\7p\2\2\u0156\u0157"+
		"\7v\2\2\u0157\u0158\7\65\2\2\u0158\u0159\7\64\2\2\u0159\66\3\2\2\2\u015a"+
		"\u015b\7k\2\2\u015b\u015c\7p\2\2\u015c\u015d\7v\2\2\u015d\u015e\78\2\2"+
		"\u015e\u015f\7\66\2\2\u015f8\3\2\2\2\u0160\u0161\7w\2\2\u0161\u0162\7"+
		"k\2\2\u0162\u0163\7p\2\2\u0163\u0164\7v\2\2\u0164\u0165\7\65\2\2\u0165"+
		"\u0166\7\64\2\2\u0166:\3\2\2\2\u0167\u0168\7w\2\2\u0168\u0169\7k\2\2\u0169"+
		"\u016a\7p\2\2\u016a\u016b\7v\2\2\u016b\u016c\78\2\2\u016c\u016d\7\66\2"+
		"\2\u016d<\3\2\2\2\u016e\u016f\7u\2\2\u016f\u0170\7k\2\2\u0170\u0171\7"+
		"p\2\2\u0171\u0172\7v\2\2\u0172\u0173\7\65\2\2\u0173\u0174\7\64\2\2\u0174"+
		">\3\2\2\2\u0175\u0176\7u\2\2\u0176\u0177\7k\2\2\u0177\u0178\7p\2\2\u0178"+
		"\u0179\7v\2\2\u0179\u017a\78\2\2\u017a\u017b\7\66\2\2\u017b@\3\2\2\2\u017c"+
		"\u017d\7h\2\2\u017d\u017e\7k\2\2\u017e\u017f\7z\2\2\u017f\u0180\7g\2\2"+
		"\u0180\u0181\7f\2\2\u0181\u0182\7\65\2\2\u0182\u0183\7\64\2\2\u0183B\3"+
		"\2\2\2\u0184\u0185\7h\2\2\u0185\u0186\7k\2\2\u0186\u0187\7z\2\2\u0187"+
		"\u0188\7g\2\2\u0188\u0189\7f\2\2\u0189\u018a\78\2\2\u018a\u018b\7\66\2"+
		"\2\u018bD\3\2\2\2\u018c\u018d\7u\2\2\u018d\u018e\7h\2\2\u018e\u018f\7"+
		"k\2\2\u018f\u0190\7z\2\2\u0190\u0191\7g\2\2\u0191\u0192\7f\2\2\u0192\u0193"+
		"\7\65\2\2\u0193\u0194\7\64\2\2\u0194F\3\2\2\2\u0195\u0196\7u\2\2\u0196"+
		"\u0197\7h\2\2\u0197\u0198\7k\2\2\u0198\u0199\7z\2\2\u0199\u019a\7g\2\2"+
		"\u019a\u019b\7f\2\2\u019b\u019c\78\2\2\u019c\u019d\7\66\2\2\u019dH\3\2"+
		"\2\2\u019e\u019f\7d\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a2"+
		"\7n\2\2\u01a2J\3\2\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5\7v\2\2\u01a5\u01a6"+
		"\7t\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7i\2\2\u01a9"+
		"L\3\2\2\2\u01aa\u01ab\7d\2\2\u01ab\u01ac\7{\2\2\u01ac\u01ad\7v\2\2\u01ad"+
		"\u01ae\7g\2\2\u01ae\u01af\7u\2\2\u01afN\3\2\2\2\u01b0\u01b1\7\61\2\2\u01b1"+
		"\u01b2\7,\2\2\u01b2\u01b6\3\2\2\2\u01b3\u01b5\13\2\2\2\u01b4\u01b3\3\2"+
		"\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7,\2\2\u01ba\u01bb\7\61"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\b(\2\2\u01bdP\3\2\2\2\u01be\u01bf"+
		"\7\61\2\2\u01bf\u01c0\7\61\2\2\u01c0\u01c4\3\2\2\2\u01c1\u01c3\n\2\2\2"+
		"\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\b)\2\2\u01c8"+
		"R\3\2\2\2\u01c9\u01ca\7>\2\2\u01ca\u01cb\7e\2\2\u01cb\u01cc\7c\2\2\u01cc"+
		"\u01cd\7t\2\2\u01cd\u01ce\7g\2\2\u01ce\u01cf\7v\2\2\u01cf\u020f\7@\2\2"+
		"\u01d0\u01d1\7]\2\2\u01d1\u01d2\7k\2\2\u01d2\u01d3\7f\2\2\u01d3\u01d4"+
		"\7?\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d7\5\u0093J\2\u01d6\u01d5\3\2\2\2"+
		"\u01d7\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dd"+
		"\3\2\2\2\u01da\u01dc\13\2\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2"+
		"\u01dd\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd"+
		"\3\2\2\2\u01e0\u01e1\7_\2\2\u01e1\u020f\3\2\2\2\u01e2\u01e3\7>\2\2\u01e3"+
		"\u01e4\7g\2\2\u01e4\u01e5\7t\2\2\u01e5\u01e6\7t\2\2\u01e6\u01e7\7q\2\2"+
		"\u01e7\u01e8\7t\2\2\u01e8\u01e9\7\"\2\2\u01e9\u01ed\3\2\2\2\u01ea\u01ec"+
		"\13\2\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01ee\3\2\2\2"+
		"\u01ed\u01eb\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u020f"+
		"\7@\2\2\u01f1\u01f2\7>\2\2\u01f2\u01f3\7\61\2\2\u01f3\u01f4\7g\2\2\u01f4"+
		"\u01f5\7t\2\2\u01f5\u01f6\7t\2\2\u01f6\u01f7\7q\2\2\u01f7\u01f8\7t\2\2"+
		"\u01f8\u020f\7@\2\2\u01f9\u01fa\7>\2\2\u01fa\u01fb\7h\2\2\u01fb\u01fc"+
		"\7q\2\2\u01fc\u01fd\7n\2\2\u01fd\u01fe\7f\2\2\u01fe\u01ff\7\"\2\2\u01ff"+
		"\u0203\3\2\2\2\u0200\u0202\13\2\2\2\u0201\u0200\3\2\2\2\u0202\u0205\3"+
		"\2\2\2\u0203\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0206\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0206\u020f\7@\2\2\u0207\u0208\7>\2\2\u0208\u0209\7\61"+
		"\2\2\u0209\u020a\7h\2\2\u020a\u020b\7q\2\2\u020b\u020c\7n\2\2\u020c\u020d"+
		"\7f\2\2\u020d\u020f\7@\2\2\u020e\u01c9\3\2\2\2\u020e\u01d0\3\2\2\2\u020e"+
		"\u01e2\3\2\2\2\u020e\u01f1\3\2\2\2\u020e\u01f9\3\2\2\2\u020e\u0207\3\2"+
		"\2\2\u020f\u0210\3\2\2\2\u0210\u0211\b*\2\2\u0211T\3\2\2\2\u0212\u0214"+
		"\7\17\2\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2"+
		"\u0215\u0216\7\f\2\2\u0216\u0217\3\2\2\2\u0217\u0218\b+\2\2\u0218V\3\2"+
		"\2\2\u0219\u021b\t\3\2\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\b,"+
		"\2\2\u021fX\3\2\2\2\u0220\u0221\7}\2\2\u0221Z\3\2\2\2\u0222\u0223\7\177"+
		"\2\2\u0223\\\3\2\2\2\u0224\u0225\7*\2\2\u0225^\3\2\2\2\u0226\u0227\7+"+
		"\2\2\u0227`\3\2\2\2\u0228\u0229\7]\2\2\u0229b\3\2\2\2\u022a\u022b\7_\2"+
		"\2\u022bd\3\2\2\2\u022c\u022d\7>\2\2\u022df\3\2\2\2\u022e\u022f\7@\2\2"+
		"\u022fh\3\2\2\2\u0230\u0231\7.\2\2\u0231j\3\2\2\2\u0232\u0233\7\60\2\2"+
		"\u0233l\3\2\2\2\u0234\u0235\7<\2\2\u0235n\3\2\2\2\u0236\u0237\7=\2\2\u0237"+
		"p\3\2\2\2\u0238\u0239\7?\2\2\u0239r\3\2\2\2\u023a\u023d\5\u0091I\2\u023b"+
		"\u023d\5\u0099M\2\u023c\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023d\u0243"+
		"\3\2\2\2\u023e\u0242\5\u0091I\2\u023f\u0242\5\u0093J\2\u0240\u0242\5\u0099"+
		"M\2\u0241\u023e\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0240\3\2\2\2\u0242"+
		"\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244t\3\2\2\2"+
		"\u0245\u0243\3\2\2\2\u0246\u0249\5{>\2\u0247\u0249\5}?\2\u0248\u0246\3"+
		"\2\2\2\u0248\u0247\3\2\2\2\u0249v\3\2\2\2\u024a\u024e\5\u0089E\2\u024b"+
		"\u024e\5\u008bF\2\u024c\u024e\5\u008dG\2\u024d\u024a\3\2\2\2\u024d\u024b"+
		"\3\2\2\2\u024d\u024c\3\2\2\2\u024ex\3\2\2\2\u024f\u0257\5\177@\2\u0250"+
		"\u0257\5\u0081A\2\u0251\u0253\5\u008fH\2\u0252\u0251\3\2\2\2\u0252\u0253"+
		"\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0257\5\u0083B\2\u0255\u0257\5\u0085"+
		"C\2\u0256\u024f\3\2\2\2\u0256\u0250\3\2\2\2\u0256\u0252\3\2\2\2\u0256"+
		"\u0255\3\2\2\2\u0257z\3\2\2\2\u0258\u025d\7$\2\2\u0259\u025c\5\u009bN"+
		"\2\u025a\u025c\n\4\2\2\u025b\u0259\3\2\2\2\u025b\u025a\3\2\2\2\u025c\u025f"+
		"\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u0260\u0261\7$\2\2\u0261|\3\2\2\2\u0262\u0267\7)\2\2\u0263"+
		"\u0266\5\u009bN\2\u0264\u0266\n\5\2\2\u0265\u0263\3\2\2\2\u0265\u0264"+
		"\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u026a\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026b\7)\2\2\u026b~\3\2\2\2\u026c"+
		"\u026f\5\u0081A\2\u026d\u026f\5\u0089E\2\u026e\u026c\3\2\2\2\u026e\u026d"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\5\u0087D\2\u0271\u0272\5\u0089"+
		"E\2\u0272\u0080\3\2\2\2\u0273\u0275\5\u008fH\2\u0274\u0273\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0278\5\u0093J\2\u0277\u0276"+
		"\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u027f\7\60\2\2\u027c\u027e\5\u0093J\2\u027d\u027c"+
		"\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u028c\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0284\5\u008fH\2\u0283\u0282"+
		"\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\7\60\2\2"+
		"\u0286\u0288\5\u0093J\2\u0287\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b\u0274\3\2"+
		"\2\2\u028b\u0283\3\2\2\2\u028c\u0082\3\2\2\2\u028d\u028e\7k\2\2\u028e"+
		"\u028f\7p\2\2\u028f\u0290\7h\2\2\u0290\u0084\3\2\2\2\u0291\u0292\7p\2"+
		"\2\u0292\u0293\7c\2\2\u0293\u0294\7p\2\2\u0294\u0086\3\2\2\2\u0295\u0296"+
		"\t\6\2\2\u0296\u0088\3\2\2\2\u0297\u02a3\7\62\2\2\u0298\u029a\5\u008f"+
		"H\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u029f\4\63;\2\u029c\u029e\4\62;\2\u029d\u029c\3\2\2\2\u029e\u02a1\3\2"+
		"\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1"+
		"\u029f\3\2\2\2\u02a2\u0297\3\2\2\2\u02a2\u0299\3\2\2\2\u02a3\u008a\3\2"+
		"\2\2\u02a4\u02a6\5\u008fH\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02a8\7\62\2\2\u02a8\u02aa\t\7\2\2\u02a9\u02ab\5"+
		"\u0095K\2\u02aa\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02aa\3\2\2\2"+
		"\u02ac\u02ad\3\2\2\2\u02ad\u008c\3\2\2\2\u02ae\u02b0\5\u008fH\2\u02af"+
		"\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\7\62"+
		"\2\2\u02b2\u02b4\5\u0097L\2\u02b3\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u008e\3\2\2\2\u02b7\u02b8\7/"+
		"\2\2\u02b8\u0090\3\2\2\2\u02b9\u02ba\t\b\2\2\u02ba\u0092\3\2\2\2\u02bb"+
		"\u02bc\t\t\2\2\u02bc\u0094\3\2\2\2\u02bd\u02be\t\n\2\2\u02be\u0096\3\2"+
		"\2\2\u02bf\u02c0\t\13\2\2\u02c0\u0098\3\2\2\2\u02c1\u02c2\7a\2\2\u02c2"+
		"\u009a\3\2\2\2\u02c3\u02c4\7^\2\2\u02c4\u02cd\t\f\2\2\u02c5\u02c6\7^\2"+
		"\2\u02c6\u02c7\t\7\2\2\u02c7\u02c8\5\u0095K\2\u02c8\u02c9\5\u0095K\2\u02c9"+
		"\u02cd\3\2\2\2\u02ca\u02cd\5\u009fP\2\u02cb\u02cd\5\u009dO\2\u02cc\u02c3"+
		"\3\2\2\2\u02cc\u02c5\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd"+
		"\u009c\3\2\2\2\u02ce\u02cf\7^\2\2\u02cf\u02d0\t\r\2\2\u02d0\u02d1\5\u0097"+
		"L\2\u02d1\u02d2\5\u0097L\2\u02d2\u02da\3\2\2\2\u02d3\u02d4\7^\2\2\u02d4"+
		"\u02d5\5\u0097L\2\u02d5\u02d6\5\u0097L\2\u02d6\u02da\3\2\2\2\u02d7\u02d8"+
		"\7^\2\2\u02d8\u02da\5\u0097L\2\u02d9\u02ce\3\2\2\2\u02d9\u02d3\3\2\2\2"+
		"\u02d9\u02d7\3\2\2\2\u02da\u009e\3\2\2\2\u02db\u02dc\7^\2\2\u02dc\u02dd"+
		"\7w\2\2\u02dd\u02de\5\u0095K\2\u02de\u02df\5\u0095K\2\u02df\u02e0\5\u0095"+
		"K\2\u02e0\u02e1\5\u0095K\2\u02e1\u00a0\3\2\2\2\u02e2\u02e3\13\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02e5\bQ\2\2\u02e5\u00a2\3\2\2\2(\2\u0145\u01b6\u01c4"+
		"\u01d8\u01dd\u01ed\u0203\u020e\u0213\u021c\u023c\u0241\u0243\u0248\u024d"+
		"\u0252\u0256\u025b\u025d\u0265\u0267\u026e\u0274\u0279\u027f\u0283\u0289"+
		"\u028b\u0299\u029f\u02a2\u02a5\u02ac\u02af\u02b5\u02cc\u02d9\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}