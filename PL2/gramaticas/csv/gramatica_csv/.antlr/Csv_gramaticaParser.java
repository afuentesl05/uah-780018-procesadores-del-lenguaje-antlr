// Generated from c:/antlr/gramatica_csv/Csv_gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Csv_gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NEWLINE=2, COMA=3, PUNTO_COMA=4, BARRA=5, NUMERO=6, NUM_COMAS=7, 
		TIEMPO=8, FECHA=9, PAREJA_N=10, PALABRA=11, TEXTO=12, PAREJA_P=13;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_campo = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "campo"
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

	@Override
	public String getGrammarFileName() { return "Csv_gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Csv_gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(Csv_gramaticaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Csv_gramaticaParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(6);
					expr();
					setState(7);
					match(NEWLINE);
					}
					} 
				}
				setState(13);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(14);
				match(NEWLINE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Csv_gramaticaParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Csv_gramaticaParser.COMA, i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(Csv_gramaticaParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(Csv_gramaticaParser.PUNTO_COMA, i);
		}
		public List<TerminalNode> BARRA() { return getTokens(Csv_gramaticaParser.BARRA); }
		public TerminalNode BARRA(int i) {
			return getToken(Csv_gramaticaParser.BARRA, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			campo();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				{
				setState(18);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(19);
					match(T__0);
					}
				}

				setState(22);
				campo();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CampoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(Csv_gramaticaParser.NUMERO, 0); }
		public TerminalNode NUM_COMAS() { return getToken(Csv_gramaticaParser.NUM_COMAS, 0); }
		public TerminalNode TIEMPO() { return getToken(Csv_gramaticaParser.TIEMPO, 0); }
		public TerminalNode FECHA() { return getToken(Csv_gramaticaParser.FECHA, 0); }
		public TerminalNode PAREJA_N() { return getToken(Csv_gramaticaParser.PAREJA_N, 0); }
		public TerminalNode PALABRA() { return getToken(Csv_gramaticaParser.PALABRA, 0); }
		public TerminalNode TEXTO() { return getToken(Csv_gramaticaParser.TEXTO, 0); }
		public TerminalNode PAREJA_P() { return getToken(Csv_gramaticaParser.PAREJA_P, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_campo);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(NUMERO);
				}
				break;
			case NUM_COMAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(NUM_COMAS);
				}
				break;
			case TIEMPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(TIEMPO);
				}
				break;
			case FECHA:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				match(FECHA);
				}
				break;
			case PAREJA_N:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				match(PAREJA_N);
				}
				break;
			case PALABRA:
				enterOuterAlt(_localctx, 6);
				{
				setState(33);
				match(PALABRA);
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 7);
				{
				setState(34);
				match(TEXTO);
				}
				break;
			case PAREJA_P:
				enterOuterAlt(_localctx, 8);
				{
				setState(35);
				match(PAREJA_P);
				}
				break;
			case NEWLINE:
			case COMA:
			case PUNTO_COMA:
			case BARRA:
				enterOuterAlt(_localctx, 9);
				{
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

	public static final String _serializedATN =
		"\u0004\u0001\r(\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\n\b"+
		"\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0000\u0003\u0000\u0010\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0015\b\u0001\u0001\u0001"+
		"\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0002\u0000\u0000\u0003"+
		"\u0000\u0002\u0004\u0000\u0001\u0001\u0000\u0003\u00050\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000\u0004%\u0001\u0000"+
		"\u0000\u0000\u0006\u0007\u0003\u0002\u0001\u0000\u0007\b\u0005\u0002\u0000"+
		"\u0000\b\n\u0001\u0000\u0000\u0000\t\u0006\u0001\u0000\u0000\u0000\n\r"+
		"\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001"+
		"\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000"+
		"\u0000\u0000\u000e\u0010\u0005\u0002\u0000\u0000\u000f\u000e\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0001\u0001\u0000"+
		"\u0000\u0000\u0011\u0019\u0003\u0004\u0002\u0000\u0012\u0014\u0007\u0000"+
		"\u0000\u0000\u0013\u0015\u0005\u0001\u0000\u0000\u0014\u0013\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000"+
		"\u0000\u0000\u0016\u0018\u0003\u0004\u0002\u0000\u0017\u0012\u0001\u0000"+
		"\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000"+
		"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c&\u0005\u0006\u0000"+
		"\u0000\u001d&\u0005\u0007\u0000\u0000\u001e&\u0005\b\u0000\u0000\u001f"+
		"&\u0005\t\u0000\u0000 &\u0005\n\u0000\u0000!&\u0005\u000b\u0000\u0000"+
		"\"&\u0005\f\u0000\u0000#&\u0005\r\u0000\u0000$&\u0001\u0000\u0000\u0000"+
		"%\u001c\u0001\u0000\u0000\u0000%\u001d\u0001\u0000\u0000\u0000%\u001e"+
		"\u0001\u0000\u0000\u0000%\u001f\u0001\u0000\u0000\u0000% \u0001\u0000"+
		"\u0000\u0000%!\u0001\u0000\u0000\u0000%\"\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&\u0005\u0001\u0000\u0000"+
		"\u0000\u0005\u000b\u000f\u0014\u0019%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}