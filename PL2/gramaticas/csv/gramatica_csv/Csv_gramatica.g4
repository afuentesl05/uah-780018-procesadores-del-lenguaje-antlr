grammar Csv_gramatica;

//LEXER
prog:   (expr NEWLINE)* (NEWLINE)? ;                 // conjunto de lineas separadas por salto de linea

expr:   campo ((COMA | PUNTO_COMA | BARRA) ' '? campo)*                          // separamos por comas
    ;

campo:  NUMERO
    |   NUM_COMAS
    |   TIEMPO
    |   FECHA
    |   PAREJA_N
    |   PALABRA
    |   TEXTO
    |   PAREJA_P
    |
    ;


// PARSER
NEWLINE : [\r\n]+;                                  // aceptamos salto de linea en mac y windows
COMA: ',';
PUNTO_COMA: ';';
BARRA: '|';

//numeros
NUMERO: [0-9]+;
NUM_COMAS: '"' [+\-]? NUMERO ( ',' NUMERO )? '"' ;   // expresion algebraica numero entre coma
TIEMPO:  '"' [+\-]? NUMERO ( ',' NUMERO )? 's' '"';
FECHA: NUMERO '-' NUMERO '-' NUMERO;
PAREJA_N: NUMERO '-' NUMERO;

//palabras
PALABRA: [a-zA-Z]+;
TEXTO: PALABRA (' ' PALABRA|PAREJA_P)*;                         // texto de palabra separada por espacio
PAREJA_P: PALABRA ( '-' PALABRA) ;                     // expresion para aceptar dos palabras con guion
