grammar MiniC;

program
    : instrucciones EOF
    ;

instrucciones
    : instruccion+
    ;

instruccion
    : decision
    ;

decision
    : IF LPAREN condicion RPAREN LBRACE sentencia RBRACE
      (ELSE LBRACE sentencia RBRACE)?
    ;

sentencia
    : salida sentencia
    | terminar
    ;

salida
    : PRINTF LPAREN cadena RPAREN SEMI
    ;

terminar
    : RETURN SEMI
    ;

condicion
    : ZERO
    | ONE
    ;

cadena
    : STRING
    ;

IF      : 'if';
ELSE    : 'else';
PRINTF  : 'printf';
RETURN  : 'return';

ZERO    : '0';
ONE     : '1';

LPAREN  : '(';
RPAREN  : ')';
LBRACE  : '{';
RBRACE  : '}';
SEMI    : ';';

STRING
    : '"' (~["\r\n])* '"'
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
