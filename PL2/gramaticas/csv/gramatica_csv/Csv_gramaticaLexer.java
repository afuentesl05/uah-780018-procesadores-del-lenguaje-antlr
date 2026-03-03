// Generated from Csv_gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Csv_gramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NEWLINE=2, COMA=3, PUNTO_COMA=4, BARRA=5, NUMERO=6, NUM_COMAS=7, 
		TIEMPO=8, FECHA=9, PAREJA_N=10, PALABRA=11, TEXTO=12, PAREJA_P=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NEWLINE", "COMA", "PUNTO_COMA", "BARRA", "NUMERO", "NUM_COMAS", 
			"TIEMPO", "FECHA", "PAREJA_N", "PALABRA", "TEXTO", "PAREJA_P"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", null, "','", "';'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NEWLINE", "COMA", "PUNTO_COMA", "BARRA", "NUMERO", "NUM_COMAS", 
			"TIEMPO", "FECHA", "PAREJA_N", "PALABRA", "TEXTO", "PAREJA_P"
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


	public Csv_gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Csv_gramatica.g4"; }

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
		"\u0004\u0000\r`\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0004"+
		"\u0001\u001f\b\u0001\u000b\u0001\f\u0001 \u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005*\b"+
		"\u0005\u000b\u0005\f\u0005+\u0001\u0006\u0001\u0006\u0003\u00060\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u00065\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007;\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007@\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0004\nP\b\n\u000b\n\f\nQ\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000bX\b\u000b\n\u000b\f\u000b[\t"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0004\u0002\u0000\n"+
		"\n\r\r\u0001\u000009\u0002\u0000++--\u0002\u0000AZazh\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003\u001e\u0001\u0000\u0000"+
		"\u0000\u0005\"\u0001\u0000\u0000\u0000\u0007$\u0001\u0000\u0000\u0000"+
		"\t&\u0001\u0000\u0000\u0000\u000b)\u0001\u0000\u0000\u0000\r-\u0001\u0000"+
		"\u0000\u0000\u000f8\u0001\u0000\u0000\u0000\u0011D\u0001\u0000\u0000\u0000"+
		"\u0013J\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017S"+
		"\u0001\u0000\u0000\u0000\u0019\\\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		" \u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001f\u0007\u0000"+
		"\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0004"+
		"\u0001\u0000\u0000\u0000\"#\u0005,\u0000\u0000#\u0006\u0001\u0000\u0000"+
		"\u0000$%\u0005;\u0000\u0000%\b\u0001\u0000\u0000\u0000&\'\u0005|\u0000"+
		"\u0000\'\n\u0001\u0000\u0000\u0000(*\u0007\u0001\u0000\u0000)(\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,\f\u0001\u0000\u0000\u0000-/\u0005\"\u0000\u0000.0"+
		"\u0007\u0002\u0000\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000014\u0003\u000b\u0005\u000023\u0005,\u0000"+
		"\u000035\u0003\u000b\u0005\u000042\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u000067\u0005\"\u0000\u00007\u000e\u0001"+
		"\u0000\u0000\u00008:\u0005\"\u0000\u00009;\u0007\u0002\u0000\u0000:9\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<?\u0003\u000b\u0005\u0000=>\u0005,\u0000\u0000>@\u0003\u000b\u0005\u0000"+
		"?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AB\u0005s\u0000\u0000BC\u0005\"\u0000\u0000C\u0010\u0001\u0000\u0000"+
		"\u0000DE\u0003\u000b\u0005\u0000EF\u0005-\u0000\u0000FG\u0003\u000b\u0005"+
		"\u0000GH\u0005-\u0000\u0000HI\u0003\u000b\u0005\u0000I\u0012\u0001\u0000"+
		"\u0000\u0000JK\u0003\u000b\u0005\u0000KL\u0005-\u0000\u0000LM\u0003\u000b"+
		"\u0005\u0000M\u0014\u0001\u0000\u0000\u0000NP\u0007\u0003\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000R\u0016\u0001\u0000\u0000\u0000SY\u0003"+
		"\u0015\n\u0000TU\u0005 \u0000\u0000UX\u0003\u0015\n\u0000VX\u0003\u0019"+
		"\f\u0000WT\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0018"+
		"\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0003\u0015\n\u0000"+
		"]^\u0005-\u0000\u0000^_\u0003\u0015\n\u0000_\u001a\u0001\u0000\u0000\u0000"+
		"\n\u0000 +/4:?QWY\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}