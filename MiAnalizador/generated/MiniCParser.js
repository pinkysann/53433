// Generated from MiniC.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import MiniCListener from './MiniCListener.js';
import MiniCVisitor from './MiniCVisitor.js';

const serializedATN = [4,1,13,62,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,1,0,1,0,1,0,1,1,4,1,23,8,1,11,1,12,1,24,
1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,3,3,41,8,3,1,4,1,
4,1,4,1,4,3,4,47,8,4,1,5,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,7,1,7,1,8,1,8,
1,8,0,0,9,0,2,4,6,8,10,12,14,16,0,1,1,0,5,6,55,0,18,1,0,0,0,2,22,1,0,0,0,
4,26,1,0,0,0,6,28,1,0,0,0,8,46,1,0,0,0,10,48,1,0,0,0,12,54,1,0,0,0,14,57,
1,0,0,0,16,59,1,0,0,0,18,19,3,2,1,0,19,20,5,0,0,1,20,1,1,0,0,0,21,23,3,4,
2,0,22,21,1,0,0,0,23,24,1,0,0,0,24,22,1,0,0,0,24,25,1,0,0,0,25,3,1,0,0,0,
26,27,3,6,3,0,27,5,1,0,0,0,28,29,5,1,0,0,29,30,5,7,0,0,30,31,3,14,7,0,31,
32,5,8,0,0,32,33,5,9,0,0,33,34,3,8,4,0,34,40,5,10,0,0,35,36,5,2,0,0,36,37,
5,9,0,0,37,38,3,8,4,0,38,39,5,10,0,0,39,41,1,0,0,0,40,35,1,0,0,0,40,41,1,
0,0,0,41,7,1,0,0,0,42,43,3,10,5,0,43,44,3,8,4,0,44,47,1,0,0,0,45,47,3,12,
6,0,46,42,1,0,0,0,46,45,1,0,0,0,47,9,1,0,0,0,48,49,5,3,0,0,49,50,5,7,0,0,
50,51,3,16,8,0,51,52,5,8,0,0,52,53,5,11,0,0,53,11,1,0,0,0,54,55,5,4,0,0,
55,56,5,11,0,0,56,13,1,0,0,0,57,58,7,0,0,0,58,15,1,0,0,0,59,60,5,12,0,0,
60,17,1,0,0,0,3,24,40,46];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class MiniCParser extends antlr4.Parser {

    static grammarFileName = "MiniC.g4";
    static literalNames = [ null, "'if'", "'else'", "'printf'", "'return'", 
                            "'0'", "'1'", "'('", "')'", "'{'", "'}'", "';'" ];
    static symbolicNames = [ null, "IF", "ELSE", "PRINTF", "RETURN", "ZERO", 
                             "ONE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
                             "SEMI", "STRING", "WS" ];
    static ruleNames = [ "program", "instrucciones", "instruccion", "decision", 
                         "sentencia", "salida", "terminar", "condicion", 
                         "cadena" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = MiniCParser.ruleNames;
        this.literalNames = MiniCParser.literalNames;
        this.symbolicNames = MiniCParser.symbolicNames;
    }



	program() {
	    let localctx = new ProgramContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, MiniCParser.RULE_program);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 18;
	        this.instrucciones();
	        this.state = 19;
	        this.match(MiniCParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	instrucciones() {
	    let localctx = new InstruccionesContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, MiniCParser.RULE_instrucciones);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 22; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 21;
	            this.instruccion();
	            this.state = 24; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===1);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	instruccion() {
	    let localctx = new InstruccionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, MiniCParser.RULE_instruccion);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 26;
	        this.decision();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	decision() {
	    let localctx = new DecisionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, MiniCParser.RULE_decision);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 28;
	        this.match(MiniCParser.IF);
	        this.state = 29;
	        this.match(MiniCParser.LPAREN);
	        this.state = 30;
	        this.condicion();
	        this.state = 31;
	        this.match(MiniCParser.RPAREN);
	        this.state = 32;
	        this.match(MiniCParser.LBRACE);
	        this.state = 33;
	        this.sentencia();
	        this.state = 34;
	        this.match(MiniCParser.RBRACE);
	        this.state = 40;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===2) {
	            this.state = 35;
	            this.match(MiniCParser.ELSE);
	            this.state = 36;
	            this.match(MiniCParser.LBRACE);
	            this.state = 37;
	            this.sentencia();
	            this.state = 38;
	            this.match(MiniCParser.RBRACE);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	sentencia() {
	    let localctx = new SentenciaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, MiniCParser.RULE_sentencia);
	    try {
	        this.state = 46;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 3:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 42;
	            this.salida();
	            this.state = 43;
	            this.sentencia();
	            break;
	        case 4:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 45;
	            this.terminar();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	salida() {
	    let localctx = new SalidaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, MiniCParser.RULE_salida);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 48;
	        this.match(MiniCParser.PRINTF);
	        this.state = 49;
	        this.match(MiniCParser.LPAREN);
	        this.state = 50;
	        this.cadena();
	        this.state = 51;
	        this.match(MiniCParser.RPAREN);
	        this.state = 52;
	        this.match(MiniCParser.SEMI);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	terminar() {
	    let localctx = new TerminarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, MiniCParser.RULE_terminar);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 54;
	        this.match(MiniCParser.RETURN);
	        this.state = 55;
	        this.match(MiniCParser.SEMI);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condicion() {
	    let localctx = new CondicionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, MiniCParser.RULE_condicion);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 57;
	        _la = this._input.LA(1);
	        if(!(_la===5 || _la===6)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	cadena() {
	    let localctx = new CadenaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, MiniCParser.RULE_cadena);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 59;
	        this.match(MiniCParser.STRING);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

MiniCParser.EOF = antlr4.Token.EOF;
MiniCParser.IF = 1;
MiniCParser.ELSE = 2;
MiniCParser.PRINTF = 3;
MiniCParser.RETURN = 4;
MiniCParser.ZERO = 5;
MiniCParser.ONE = 6;
MiniCParser.LPAREN = 7;
MiniCParser.RPAREN = 8;
MiniCParser.LBRACE = 9;
MiniCParser.RBRACE = 10;
MiniCParser.SEMI = 11;
MiniCParser.STRING = 12;
MiniCParser.WS = 13;

MiniCParser.RULE_program = 0;
MiniCParser.RULE_instrucciones = 1;
MiniCParser.RULE_instruccion = 2;
MiniCParser.RULE_decision = 3;
MiniCParser.RULE_sentencia = 4;
MiniCParser.RULE_salida = 5;
MiniCParser.RULE_terminar = 6;
MiniCParser.RULE_condicion = 7;
MiniCParser.RULE_cadena = 8;

class ProgramContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniCParser.RULE_program;
    }

	instrucciones() {
	    return this.getTypedRuleContext(InstruccionesContext,0);
	};

	EOF() {
	    return this.getToken(MiniCParser.EOF, 0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.enterProgram(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.exitProgram(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniCVisitor ) {
	        return visitor.visitProgram(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InstruccionesContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniCParser.RULE_instrucciones;
    }

	instruccion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(InstruccionContext);
	    } else {
	        return this.getTypedRuleContext(InstruccionContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.enterInstrucciones(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.exitInstrucciones(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniCVisitor ) {
	        return visitor.visitInstrucciones(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InstruccionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniCParser.RULE_instruccion;
    }

	decision() {
	    return this.getTypedRuleContext(DecisionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.enterInstruccion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.exitInstruccion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniCVisitor ) {
	        return visitor.visitInstruccion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DecisionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniCParser.RULE_decision;
    }

	IF() {
	    return this.getToken(MiniCParser.IF, 0);
	};

	LPAREN() {
	    return this.getToken(MiniCParser.LPAREN, 0);
	};

	condicion() {
	    return this.getTypedRuleContext(CondicionContext,0);
	};

	RPAREN() {
	    return this.getToken(MiniCParser.RPAREN, 0);
	};

	LBRACE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(MiniCParser.LBRACE);
	    } else {
	        return this.getToken(MiniCParser.LBRACE, i);
	    }
	};


	sentencia = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SentenciaContext);
	    } else {
	        return this.getTypedRuleContext(SentenciaContext,i);
	    }
	};

	RBRACE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(MiniCParser.RBRACE);
	    } else {
	        return this.getToken(MiniCParser.RBRACE, i);
	    }
	};


	ELSE() {
	    return this.getToken(MiniCParser.ELSE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.enterDecision(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.exitDecision(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniCVisitor ) {
	        return visitor.visitDecision(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SentenciaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniCParser.RULE_sentencia;
    }

	salida() {
	    return this.getTypedRuleContext(SalidaContext,0);
	};

	sentencia() {
	    return this.getTypedRuleContext(SentenciaContext,0);
	};

	terminar() {
	    return this.getTypedRuleContext(TerminarContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.enterSentencia(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.exitSentencia(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniCVisitor ) {
	        return visitor.visitSentencia(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SalidaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniCParser.RULE_salida;
    }

	PRINTF() {
	    return this.getToken(MiniCParser.PRINTF, 0);
	};

	LPAREN() {
	    return this.getToken(MiniCParser.LPAREN, 0);
	};

	cadena() {
	    return this.getTypedRuleContext(CadenaContext,0);
	};

	RPAREN() {
	    return this.getToken(MiniCParser.RPAREN, 0);
	};

	SEMI() {
	    return this.getToken(MiniCParser.SEMI, 0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.enterSalida(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.exitSalida(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniCVisitor ) {
	        return visitor.visitSalida(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TerminarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniCParser.RULE_terminar;
    }

	RETURN() {
	    return this.getToken(MiniCParser.RETURN, 0);
	};

	SEMI() {
	    return this.getToken(MiniCParser.SEMI, 0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.enterTerminar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.exitTerminar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniCVisitor ) {
	        return visitor.visitTerminar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CondicionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniCParser.RULE_condicion;
    }

	ZERO() {
	    return this.getToken(MiniCParser.ZERO, 0);
	};

	ONE() {
	    return this.getToken(MiniCParser.ONE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.enterCondicion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.exitCondicion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniCVisitor ) {
	        return visitor.visitCondicion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CadenaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniCParser.RULE_cadena;
    }

	STRING() {
	    return this.getToken(MiniCParser.STRING, 0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.enterCadena(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniCListener ) {
	        listener.exitCadena(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniCVisitor ) {
	        return visitor.visitCadena(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




MiniCParser.ProgramContext = ProgramContext; 
MiniCParser.InstruccionesContext = InstruccionesContext; 
MiniCParser.InstruccionContext = InstruccionContext; 
MiniCParser.DecisionContext = DecisionContext; 
MiniCParser.SentenciaContext = SentenciaContext; 
MiniCParser.SalidaContext = SalidaContext; 
MiniCParser.TerminarContext = TerminarContext; 
MiniCParser.CondicionContext = CondicionContext; 
MiniCParser.CadenaContext = CadenaContext; 
