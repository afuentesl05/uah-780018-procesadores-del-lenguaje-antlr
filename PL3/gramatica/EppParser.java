// Generated from Epp.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EppParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ASIGNAR=3, MOSTRAR=4, TERMINAR=5, SI=6, SINO=7, NO=8, 
		PARA=9, MIENTRAS=10, ARROW=11, COND_END=12, SEP=13, ASSIGN=14, PLUS=15, 
		MINUS=16, MUL=17, DIV=18, PLUS_ASSIGN=19, MINUS_ASSIGN=20, AND=21, OR=22, 
		NOT=23, EQ=24, NEQ=25, LE=26, GE=27, LT=28, GT=29, FLOAT=30, NUMBER=31, 
		TRUE=32, FALSE=33, STRING=34, ID=35, COMMENT=36, WS=37;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignInitStmt = 2, RULE_assignReStmt = 3, 
		RULE_printStmt = 4, RULE_forStmt = 5, RULE_whileStmt = 6, RULE_ifStmt = 7, 
		RULE_condition = 8, RULE_thenHeader = 9, RULE_elseifHeader = 10, RULE_elseHeader = 11, 
		RULE_block = 12, RULE_expr = 13, RULE_orExpr = 14, RULE_andExpr = 15, 
		RULE_eqExpr = 16, RULE_relExpr = 17, RULE_addExpr = 18, RULE_mulExpr = 19, 
		RULE_unary = 20, RULE_atom = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignInitStmt", "assignReStmt", "printStmt", 
			"forStmt", "whileStmt", "ifStmt", "condition", "thenHeader", "elseifHeader", 
			"elseHeader", "block", "expr", "orExpr", "andExpr", "eqExpr", "relExpr", 
			"addExpr", "mulExpr", "unary", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'asignar'", "'mostrar'", "'terminar'", "'si'", "'sino'", 
			"'no'", "'para'", "'mientras'", "'->'", "'???'", null, "'='", "'+'", 
			"'-'", "'*'", "'/'", "'+='", "'-='", "'&&'", "'||'", "'!'", "'=='", "'!='", 
			"'<='", "'>='", "'<'", "'>'", null, null, "'verdadero'", "'falso'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ASIGNAR", "MOSTRAR", "TERMINAR", "SI", "SINO", "NO", 
			"PARA", "MIENTRAS", "ARROW", "COND_END", "SEP", "ASSIGN", "PLUS", "MINUS", 
			"MUL", "DIV", "PLUS_ASSIGN", "MINUS_ASSIGN", "AND", "OR", "NOT", "EQ", 
			"NEQ", "LE", "GE", "LT", "GT", "FLOAT", "NUMBER", "TRUE", "FALSE", "STRING", 
			"ID", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Epp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EppParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<IfStmtContext> ifStmt() {
			return getRuleContexts(IfStmtContext.class);
		}
		public IfStmtContext ifStmt(int i) {
			return getRuleContext(IfStmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67654190618L) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					statement();
					}
					break;
				case 2:
					{
					setState(45);
					ifStmt();
					}
					break;
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(EOF);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtWhileContext extends StatementContext {
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public StmtWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterStmtWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitStmtWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitStmtWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtReAssignContext extends StatementContext {
		public AssignReStmtContext assignReStmt() {
			return getRuleContext(AssignReStmtContext.class,0);
		}
		public StmtReAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterStmtReAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitStmtReAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitStmtReAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtPrintContext extends StatementContext {
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public StmtPrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterStmtPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitStmtPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitStmtPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtForContext extends StatementContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public StmtForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterStmtFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitStmtFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitStmtFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtInitAssignContext extends StatementContext {
		public AssignInitStmtContext assignInitStmt() {
			return getRuleContext(AssignInitStmtContext.class,0);
		}
		public StmtInitAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterStmtInitAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitStmtInitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitStmtInitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGNAR:
				_localctx = new StmtInitAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				assignInitStmt();
				}
				break;
			case ID:
				_localctx = new StmtReAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				assignReStmt();
				}
				break;
			case MOSTRAR:
				_localctx = new StmtPrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				printStmt();
				}
				break;
			case PARA:
				_localctx = new StmtForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				forStmt();
				}
				break;
			case MIENTRAS:
				_localctx = new StmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				whileStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignInitStmtContext extends ParserRuleContext {
		public TerminalNode ASIGNAR() { return getToken(EppParser.ASIGNAR, 0); }
		public TerminalNode ID() { return getToken(EppParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(EppParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP() { return getToken(EppParser.SEP, 0); }
		public AssignInitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignInitStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterAssignInitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitAssignInitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitAssignInitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignInitStmtContext assignInitStmt() throws RecognitionException {
		AssignInitStmtContext _localctx = new AssignInitStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignInitStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ASIGNAR);
			setState(61);
			match(ID);
			setState(62);
			match(ASSIGN);
			setState(63);
			expr();
			setState(64);
			match(SEP);
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
	public static class AssignReStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EppParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP() { return getToken(EppParser.SEP, 0); }
		public TerminalNode ASSIGN() { return getToken(EppParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(EppParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(EppParser.MINUS_ASSIGN, 0); }
		public AssignReStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignReStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterAssignReStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitAssignReStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitAssignReStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignReStmtContext assignReStmt() throws RecognitionException {
		AssignReStmtContext _localctx = new AssignReStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignReStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1589248L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(68);
			expr();
			setState(69);
			match(SEP);
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
	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode MOSTRAR() { return getToken(EppParser.MOSTRAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEP() { return getToken(EppParser.SEP, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(MOSTRAR);
			setState(72);
			expr();
			setState(73);
			match(SEP);
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
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(EppParser.PARA, 0); }
		public AssignInitStmtContext assignInitStmt() {
			return getRuleContext(AssignInitStmtContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AssignReStmtContext assignReStmt() {
			return getRuleContext(AssignReStmtContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(EppParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TERMINAR() { return getToken(EppParser.TERMINAR, 0); }
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(PARA);
			setState(76);
			assignInitStmt();
			setState(77);
			condition();
			setState(78);
			assignReStmt();
			setState(79);
			match(ARROW);
			setState(80);
			block();
			setState(81);
			match(TERMINAR);
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
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(EppParser.MIENTRAS, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(EppParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TERMINAR() { return getToken(EppParser.TERMINAR, 0); }
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(MIENTRAS);
			setState(84);
			condition();
			setState(85);
			match(ARROW);
			setState(86);
			block();
			setState(87);
			match(TERMINAR);
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
	public static class IfStmtContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ThenHeaderContext thenHeader() {
			return getRuleContext(ThenHeaderContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode TERMINAR() { return getToken(EppParser.TERMINAR, 0); }
		public List<ElseifHeaderContext> elseifHeader() {
			return getRuleContexts(ElseifHeaderContext.class);
		}
		public ElseifHeaderContext elseifHeader(int i) {
			return getRuleContext(ElseifHeaderContext.class,i);
		}
		public ElseHeaderContext elseHeader() {
			return getRuleContext(ElseHeaderContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			condition();
			setState(90);
			thenHeader();
			setState(91);
			block();
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					elseifHeader();
					setState(93);
					block();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO || _la==NO) {
				{
				setState(100);
				elseHeader();
				setState(101);
				block();
				}
			}

			setState(105);
			match(TERMINAR);
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
	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COND_END() { return getToken(EppParser.COND_END, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			expr();
			setState(108);
			match(COND_END);
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
	public static class ThenHeaderContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(EppParser.SI, 0); }
		public TerminalNode ARROW() { return getToken(EppParser.ARROW, 0); }
		public ThenHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterThenHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitThenHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitThenHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenHeaderContext thenHeader() throws RecognitionException {
		ThenHeaderContext _localctx = new ThenHeaderContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_thenHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(SI);
			setState(111);
			match(ARROW);
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
	public static class ElseifHeaderContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(EppParser.SINO, 0); }
		public TerminalNode SI() { return getToken(EppParser.SI, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(EppParser.ARROW, 0); }
		public ElseifHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterElseifHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitElseifHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitElseifHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifHeaderContext elseifHeader() throws RecognitionException {
		ElseifHeaderContext _localctx = new ElseifHeaderContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseifHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(SINO);
			setState(114);
			match(SI);
			setState(115);
			condition();
			setState(116);
			match(ARROW);
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
	public static class ElseHeaderContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(EppParser.ARROW, 0); }
		public TerminalNode NO() { return getToken(EppParser.NO, 0); }
		public TerminalNode SINO() { return getToken(EppParser.SINO, 0); }
		public ElseHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterElseHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitElseHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitElseHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseHeaderContext elseHeader() throws RecognitionException {
		ElseHeaderContext _localctx = new ElseHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==SINO || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(119);
			match(ARROW);
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<IfStmtContext> ifStmt() {
			return getRuleContexts(IfStmtContext.class);
		}
		public IfStmtContext ifStmt(int i) {
			return getRuleContext(IfStmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67654190618L) != 0)) {
				{
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(121);
					statement();
					}
					break;
				case 2:
					{
					setState(122);
					ifStmt();
					}
					break;
				}
				}
				setState(127);
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
	public static class ExprContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			orExpr();
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
	public static class OrExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(EppParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(EppParser.OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			andExpr();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(131);
				match(OR);
				setState(132);
				andExpr();
				}
				}
				setState(137);
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
	public static class AndExprContext extends ParserRuleContext {
		public List<EqExprContext> eqExpr() {
			return getRuleContexts(EqExprContext.class);
		}
		public EqExprContext eqExpr(int i) {
			return getRuleContext(EqExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(EppParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(EppParser.AND, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			eqExpr();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(139);
				match(AND);
				setState(140);
				eqExpr();
				}
				}
				setState(145);
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
	public static class EqExprContext extends ParserRuleContext {
		public List<RelExprContext> relExpr() {
			return getRuleContexts(RelExprContext.class);
		}
		public RelExprContext relExpr(int i) {
			return getRuleContext(RelExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(EppParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(EppParser.NEQ, 0); }
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		EqExprContext _localctx = new EqExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eqExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			relExpr();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ || _la==NEQ) {
				{
				setState(147);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(148);
				relExpr();
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
	public static class RelExprContext extends ParserRuleContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(EppParser.LT, 0); }
		public TerminalNode LE() { return getToken(EppParser.LE, 0); }
		public TerminalNode GT() { return getToken(EppParser.GT, 0); }
		public TerminalNode GE() { return getToken(EppParser.GE, 0); }
		public RelExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterRelExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitRelExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitRelExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExprContext relExpr() throws RecognitionException {
		RelExprContext _localctx = new RelExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			addExpr();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) {
				{
				setState(152);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(153);
				addExpr();
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
	public static class AddExprContext extends ParserRuleContext {
		public List<MulExprContext> mulExpr() {
			return getRuleContexts(MulExprContext.class);
		}
		public MulExprContext mulExpr(int i) {
			return getRuleContext(MulExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(EppParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(EppParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(EppParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(EppParser.MINUS, i);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			mulExpr();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(158);
				mulExpr();
				}
				}
				setState(163);
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
	public static class MulExprContext extends ParserRuleContext {
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(EppParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(EppParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(EppParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(EppParser.DIV, i);
		}
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mulExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			unary();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(165);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(166);
				unary();
				}
				}
				setState(171);
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
	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(EppParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(EppParser.MINUS, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unary);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				unary();
				}
				break;
			case T__0:
			case FLOAT:
			case NUMBER:
			case TRUE:
			case FALSE:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				atom();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(EppParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(EppParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EppParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(EppParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(EppParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(EppParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EppListener ) ((EppListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EppVisitor ) return ((EppVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atom);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(NUMBER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(STRING);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				match(FALSE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				match(ID);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				match(T__0);
				setState(184);
				expr();
				setState(185);
				match(T__1);
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
		"\u0004\u0001%\u00be\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007`\b\u0007\n\u0007\f\u0007c\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007h\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0005\f|\b\f\n\f\f\f\u007f\t\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0086\b\u000e\n\u000e\f\u000e\u0089\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u008e\b\u000f\n\u000f"+
		"\f\u000f\u0091\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0096\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u009b\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00a0\b\u0012\n"+
		"\u0012\f\u0012\u00a3\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u00a8\b\u0013\n\u0013\f\u0013\u00ab\t\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00b0\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u00bc\b\u0015\u0001\u0015\u0000\u0000\u0016\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*\u0000\u0007\u0002\u0000\u000e\u000e\u0013\u0014\u0001\u0000"+
		"\u0007\b\u0001\u0000\u0018\u0019\u0001\u0000\u001a\u001d\u0001\u0000\u000f"+
		"\u0010\u0001\u0000\u0011\u0012\u0002\u0000\u0010\u0010\u0017\u0017\u00be"+
		"\u00000\u0001\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004<"+
		"\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bG\u0001\u0000"+
		"\u0000\u0000\nK\u0001\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000\u000e"+
		"Y\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012n\u0001"+
		"\u0000\u0000\u0000\u0014q\u0001\u0000\u0000\u0000\u0016v\u0001\u0000\u0000"+
		"\u0000\u0018}\u0001\u0000\u0000\u0000\u001a\u0080\u0001\u0000\u0000\u0000"+
		"\u001c\u0082\u0001\u0000\u0000\u0000\u001e\u008a\u0001\u0000\u0000\u0000"+
		" \u0092\u0001\u0000\u0000\u0000\"\u0097\u0001\u0000\u0000\u0000$\u009c"+
		"\u0001\u0000\u0000\u0000&\u00a4\u0001\u0000\u0000\u0000(\u00af\u0001\u0000"+
		"\u0000\u0000*\u00bb\u0001\u0000\u0000\u0000,/\u0003\u0002\u0001\u0000"+
		"-/\u0003\u000e\u0007\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000"+
		"\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0005"+
		"\u0000\u0000\u00014\u0001\u0001\u0000\u0000\u00005;\u0003\u0004\u0002"+
		"\u00006;\u0003\u0006\u0003\u00007;\u0003\b\u0004\u00008;\u0003\n\u0005"+
		"\u00009;\u0003\f\u0006\u0000:5\u0001\u0000\u0000\u0000:6\u0001\u0000\u0000"+
		"\u0000:7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000"+
		"\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0005\u0003\u0000\u0000"+
		"=>\u0005#\u0000\u0000>?\u0005\u000e\u0000\u0000?@\u0003\u001a\r\u0000"+
		"@A\u0005\r\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0005#\u0000\u0000"+
		"CD\u0007\u0000\u0000\u0000DE\u0003\u001a\r\u0000EF\u0005\r\u0000\u0000"+
		"F\u0007\u0001\u0000\u0000\u0000GH\u0005\u0004\u0000\u0000HI\u0003\u001a"+
		"\r\u0000IJ\u0005\r\u0000\u0000J\t\u0001\u0000\u0000\u0000KL\u0005\t\u0000"+
		"\u0000LM\u0003\u0004\u0002\u0000MN\u0003\u0010\b\u0000NO\u0003\u0006\u0003"+
		"\u0000OP\u0005\u000b\u0000\u0000PQ\u0003\u0018\f\u0000QR\u0005\u0005\u0000"+
		"\u0000R\u000b\u0001\u0000\u0000\u0000ST\u0005\n\u0000\u0000TU\u0003\u0010"+
		"\b\u0000UV\u0005\u000b\u0000\u0000VW\u0003\u0018\f\u0000WX\u0005\u0005"+
		"\u0000\u0000X\r\u0001\u0000\u0000\u0000YZ\u0003\u0010\b\u0000Z[\u0003"+
		"\u0012\t\u0000[a\u0003\u0018\f\u0000\\]\u0003\u0014\n\u0000]^\u0003\u0018"+
		"\f\u0000^`\u0001\u0000\u0000\u0000_\\\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bg\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0003\u0016\u000b"+
		"\u0000ef\u0003\u0018\f\u0000fh\u0001\u0000\u0000\u0000gd\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005\u0005"+
		"\u0000\u0000j\u000f\u0001\u0000\u0000\u0000kl\u0003\u001a\r\u0000lm\u0005"+
		"\f\u0000\u0000m\u0011\u0001\u0000\u0000\u0000no\u0005\u0006\u0000\u0000"+
		"op\u0005\u000b\u0000\u0000p\u0013\u0001\u0000\u0000\u0000qr\u0005\u0007"+
		"\u0000\u0000rs\u0005\u0006\u0000\u0000st\u0003\u0010\b\u0000tu\u0005\u000b"+
		"\u0000\u0000u\u0015\u0001\u0000\u0000\u0000vw\u0007\u0001\u0000\u0000"+
		"wx\u0005\u000b\u0000\u0000x\u0017\u0001\u0000\u0000\u0000y|\u0003\u0002"+
		"\u0001\u0000z|\u0003\u000e\u0007\u0000{y\u0001\u0000\u0000\u0000{z\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0019\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u0080\u0081\u0003\u001c\u000e\u0000\u0081\u001b"+
		"\u0001\u0000\u0000\u0000\u0082\u0087\u0003\u001e\u000f\u0000\u0083\u0084"+
		"\u0005\u0016\u0000\u0000\u0084\u0086\u0003\u001e\u000f\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u001d"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008f"+
		"\u0003 \u0010\u0000\u008b\u008c\u0005\u0015\u0000\u0000\u008c\u008e\u0003"+
		" \u0010\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u001f\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u0095\u0003\"\u0011\u0000\u0093\u0094\u0007\u0002\u0000"+
		"\u0000\u0094\u0096\u0003\"\u0011\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096!\u0001\u0000\u0000\u0000\u0097"+
		"\u009a\u0003$\u0012\u0000\u0098\u0099\u0007\u0003\u0000\u0000\u0099\u009b"+
		"\u0003$\u0012\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b#\u0001\u0000\u0000\u0000\u009c\u00a1\u0003&\u0013"+
		"\u0000\u009d\u009e\u0007\u0004\u0000\u0000\u009e\u00a0\u0003&\u0013\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2%\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a9\u0003(\u0014\u0000\u00a5\u00a6\u0007\u0005\u0000\u0000\u00a6\u00a8"+
		"\u0003(\u0014\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\'\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0007\u0006\u0000\u0000\u00ad\u00b0\u0003(\u0014"+
		"\u0000\u00ae\u00b0\u0003*\u0015\u0000\u00af\u00ac\u0001\u0000\u0000\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0)\u0001\u0000\u0000\u0000\u00b1"+
		"\u00bc\u0005\u001f\u0000\u0000\u00b2\u00bc\u0005\u001e\u0000\u0000\u00b3"+
		"\u00bc\u0005\"\u0000\u0000\u00b4\u00bc\u0005 \u0000\u0000\u00b5\u00bc"+
		"\u0005!\u0000\u0000\u00b6\u00bc\u0005#\u0000\u0000\u00b7\u00b8\u0005\u0001"+
		"\u0000\u0000\u00b8\u00b9\u0003\u001a\r\u0000\u00b9\u00ba\u0005\u0002\u0000"+
		"\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b1\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b2\u0001\u0000\u0000\u0000\u00bb\u00b3\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b4\u0001\u0000\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b6\u0001\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000"+
		"\u0000\u00bc+\u0001\u0000\u0000\u0000\u000f.0:ag{}\u0087\u008f\u0095\u009a"+
		"\u00a1\u00a9\u00af\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}