grammar Epp;

// ======================= PARSER =======================

program
    : (statement | ifStmt)* EOF
    ;

statement
    : assignInitStmt                  #StmtInitAssign
    | assignReStmt                    #StmtReAssign
    | printStmt                       #StmtPrint
    ;

assignInitStmt
    : ASIGNAR ID ASSIGN expr SEP
    ;

assignReStmt
    : ID (ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN) expr SEP
    ;

printStmt
    : MOSTRAR expr SEP
    ;

// if:
//   <expr> ???
//   si -> <block>
//   (sino si <expr> ??? -> <block>)*     // NUEVO
//   (no -> <block> | sino -> <block>)?   // extendemos else con 'sino'
//   terminar
ifStmt
    : condition thenHeader block (elseifHeader block)* (elseHeader block)? TERMINAR
    ;

condition      : expr COND_END ;
thenHeader     : SI ARROW ;
elseifHeader   : SINO SI condition ARROW ;
elseHeader     : (NO | SINO) ARROW ;

block
    : (statement | ifStmt)*
    ;

// ======================= EXPRESIONES =======================
// Precedencia:  ||  >  &&  >  == !=  >  < <= > >=  >  + -  >  * /  >  unario  >  átomo

expr        : orExpr ;
orExpr      : andExpr      ( OR  andExpr      )* ;
andExpr     : eqExpr       ( AND eqExpr       )* ;
eqExpr      : relExpr      ( (EQ|NEQ) relExpr )? ;
relExpr     : addExpr      ( (LT|LE|GT|GE) addExpr )? ;
addExpr     : mulExpr      ( (PLUS|MINUS) mulExpr )* ;
mulExpr     : unary        ( (MUL|DIV) unary )* ;
unary       : (NOT | MINUS) unary
            | atom
            ;

atom
    : NUMBER
    | FLOAT
    | STRING
    | TRUE
    | FALSE
    | ID
    | '(' expr ')'
    ;

// ======================= LÉXICO =======================

// Palabras clave
ASIGNAR  : 'asignar';
MOSTRAR  : 'mostrar';
TERMINAR : 'terminar';
SI       : 'si';
SINO     : 'sino';
NO       : 'no';

ARROW    : '->';
COND_END : '???';
SEP      : ';' 'P';

// Operadores
ASSIGN       : '=';
PLUS         : '+';
MINUS        : '-';
MUL          : '*';
DIV          : '/';

PLUS_ASSIGN  : '+=';
MINUS_ASSIGN : '-=';

AND : '&&';
OR  : '||';
NOT : '!';

EQ : '==';
NEQ: '!=';
LE : '<=';
GE : '>=';
LT : '<';
GT : '>';

// Literales
FLOAT  : [0-9]+ '.' [0-9]+;
NUMBER : [0-9]+;

TRUE   : 'verdadero';
FALSE  : 'falso';

STRING : '"' ( ~["\\] | '\\' . )* '"';

// Identificadores
ID     : [a-zA-Z_][a-zA-Z_0-9]*;

// Comentarios y espacios
COMMENT: '#' ~[\r\n]* -> skip;
WS     : [ \t\r\n]+    -> skip;
