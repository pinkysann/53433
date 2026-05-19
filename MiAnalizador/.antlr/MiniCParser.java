// Generated from c:/Users/munoz/OneDrive/Desktop/53433/MiAnalizador/MiniC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, PRINTF=3, RETURN=4, ZERO=5, ONE=6, LPAREN=7, RPAREN=8, LBRACE=9, 
		RBRACE=10, SEMI=11, STRING=12, WS=13;
	public static final int
		RULE_program = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_decision = 3, 
		RULE_sentencia = 4, RULE_salida = 5, RULE_terminar = 6, RULE_condicion = 7, 
		RULE_cadena = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instrucciones", "instruccion", "decision", "sentencia", "salida", 
			"terminar", "condicion", "cadena"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'printf'", "'return'", "'0'", "'1'", "'('", 
			"')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "PRINTF", "RETURN", "ZERO", "ONE", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "SEMI", "STRING", "WS"
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
	public String getGrammarFileName() { return "MiniC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniCParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			instrucciones();
			setState(19);
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
	public static class InstruccionesContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitInstrucciones(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				instruccion();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IF );
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
	public static class InstruccionContext extends ParserRuleContext {
		public DecisionContext decision() {
			return getRuleContext(DecisionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			decision();
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
	public static class DecisionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniCParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MiniCParser.LPAREN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniCParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(MiniCParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(MiniCParser.LBRACE, i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(MiniCParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(MiniCParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(MiniCParser.ELSE, 0); }
		public DecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterDecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitDecision(this);
		}
	}

	public final DecisionContext decision() throws RecognitionException {
		DecisionContext _localctx = new DecisionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(IF);
			setState(29);
			match(LPAREN);
			setState(30);
			condicion();
			setState(31);
			match(RPAREN);
			setState(32);
			match(LBRACE);
			setState(33);
			sentencia();
			setState(34);
			match(RBRACE);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(35);
				match(ELSE);
				setState(36);
				match(LBRACE);
				setState(37);
				sentencia();
				setState(38);
				match(RBRACE);
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
	public static class SentenciaContext extends ParserRuleContext {
		public SalidaContext salida() {
			return getRuleContext(SalidaContext.class,0);
		}
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminarContext terminar() {
			return getRuleContext(TerminarContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTF:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				salida();
				setState(43);
				sentencia();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				terminar();
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
	public static class SalidaContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(MiniCParser.PRINTF, 0); }
		public TerminalNode LPAREN() { return getToken(MiniCParser.LPAREN, 0); }
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniCParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(MiniCParser.SEMI, 0); }
		public SalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterSalida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitSalida(this);
		}
	}

	public final SalidaContext salida() throws RecognitionException {
		SalidaContext _localctx = new SalidaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_salida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(PRINTF);
			setState(49);
			match(LPAREN);
			setState(50);
			cadena();
			setState(51);
			match(RPAREN);
			setState(52);
			match(SEMI);
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
	public static class TerminarContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniCParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(MiniCParser.SEMI, 0); }
		public TerminarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterTerminar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitTerminar(this);
		}
	}

	public final TerminarContext terminar() throws RecognitionException {
		TerminarContext _localctx = new TerminarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_terminar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(RETURN);
			setState(55);
			match(SEMI);
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
	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(MiniCParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(MiniCParser.ONE, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !(_la==ZERO || _la==ONE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MiniCParser.STRING, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCadena(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(STRING);
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
		"\u0004\u0001\r>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001"+
		"\u0017\b\u0001\u000b\u0001\f\u0001\u0018\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003)\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004/\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0000\u0001\u0001\u0000\u0005\u00067\u0000\u0012\u0001"+
		"\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004\u001a\u0001"+
		"\u0000\u0000\u0000\u0006\u001c\u0001\u0000\u0000\u0000\b.\u0001\u0000"+
		"\u0000\u0000\n0\u0001\u0000\u0000\u0000\f6\u0001\u0000\u0000\u0000\u000e"+
		"9\u0001\u0000\u0000\u0000\u0010;\u0001\u0000\u0000\u0000\u0012\u0013\u0003"+
		"\u0002\u0001\u0000\u0013\u0014\u0005\u0000\u0000\u0001\u0014\u0001\u0001"+
		"\u0000\u0000\u0000\u0015\u0017\u0003\u0004\u0002\u0000\u0016\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0003\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0003\u0006\u0003\u0000\u001b\u0005\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d\u001e\u0005"+
		"\u0007\u0000\u0000\u001e\u001f\u0003\u000e\u0007\u0000\u001f \u0005\b"+
		"\u0000\u0000 !\u0005\t\u0000\u0000!\"\u0003\b\u0004\u0000\"(\u0005\n\u0000"+
		"\u0000#$\u0005\u0002\u0000\u0000$%\u0005\t\u0000\u0000%&\u0003\b\u0004"+
		"\u0000&\'\u0005\n\u0000\u0000\')\u0001\u0000\u0000\u0000(#\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)\u0007\u0001\u0000\u0000\u0000"+
		"*+\u0003\n\u0005\u0000+,\u0003\b\u0004\u0000,/\u0001\u0000\u0000\u0000"+
		"-/\u0003\f\u0006\u0000.*\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000"+
		"/\t\u0001\u0000\u0000\u000001\u0005\u0003\u0000\u000012\u0005\u0007\u0000"+
		"\u000023\u0003\u0010\b\u000034\u0005\b\u0000\u000045\u0005\u000b\u0000"+
		"\u00005\u000b\u0001\u0000\u0000\u000067\u0005\u0004\u0000\u000078\u0005"+
		"\u000b\u0000\u00008\r\u0001\u0000\u0000\u00009:\u0007\u0000\u0000\u0000"+
		":\u000f\u0001\u0000\u0000\u0000;<\u0005\f\u0000\u0000<\u0011\u0001\u0000"+
		"\u0000\u0000\u0003\u0018(.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}