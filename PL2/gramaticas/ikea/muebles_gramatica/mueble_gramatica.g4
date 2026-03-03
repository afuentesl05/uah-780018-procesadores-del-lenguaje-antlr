grammar mueble_gramatica;

// PARSER 
programa
    : definicionMueble seccionDefiniciones instruccion FIN PUNTOYCOMA?
    ;

definicionMueble
    : MUEBLE CADENA PUNTOYCOMA
    ;

// definiciones que no son mueble 
seccionDefiniciones
    : (usoHerramienta
     | definicionPieza
     | definicionHerraje)*
    ;


definicionHerraje
    : HERRAJE CADENA CANTIDAD NUM PUNTOYCOMA
    ;

usoHerramienta
    : USAR HERRAMIENTA CADENA PUNTOYCOMA
    ;

definicionPieza
    : PIEZA CADENA CANTIDAD NUM PUNTOYCOMA
    ;

nombre: CADENA | ID;

// pasos del montaje
instruccion
    : (pasoMontaje)+
    ;

pasoMontaje
    : PASO NUM DOS_PUNTOS accionLista (REPETIR NUM)? PUNTOYCOMA  
    ;

accionLista
    : accion (COMA accion)* (Y accion)?
    ;
    
accion:   
    // Operaciones de unión/fijación 
    (UNIR | FIJAR) (piezaRef|herrajeItem) ((CON | A | EN) piezaRef)? (USANDO herrajeLista (CANTIDAD NUM)?)?

    // Pared y mueble 
    | ATORNILLAR MUEBLE EN PARED USANDO herrajeLista

    // Colgar 
    | COLGAR piezaRef EN PARED USANDO herrajeLista (CANTIDAD NUM)?

    // Atornillar/insertar/martillar herrajes o piezas
    | (ATORNILLAR | MARTILLAR | INSERTAR | PEGAR | COLOCAR) (piezaRef | herrajeItem) (A | EN) (piezaRef | PARED | herrajeItem) (USANDO herrajeLista (CANTIDAD NUM)?)?

    | MARCAR (piezaRef | herrajeItem) (EN (piezaRef|PARED))? USANDO herramientaRef
    | NIVELAR piezaRef USANDO herramientaRef

    //repetir paso 
    | REPETIR PASO NUM (NUM)?
    | DESHACER PASO NUM
    ;

// referencias
piezaRef        : nombre | MUEBLE ;

herrajeRef      : nombre | NUM ;
herrajeItem     : herrajeRef (CANTIDAD NUM)? ;
herrajeLista    : herrajeItem (COMA herrajeItem)* (Y herrajeItem)? ;

herramientaRef  : nombre ;

// LEXER 
MUEBLE: 'mueble';
HERRAMIENTA: 'herramienta';
HERRAJE: 'herraje';
PIEZA: 'pieza';
CANTIDAD: 'cantidad';
PASO: 'paso';


//verbos
USAR: 'usar';
UNIR: 'unir';
FIJAR: 'fijar';
INSERTAR: 'insertar';
REPETIR: 'repetir';
DESHACER: 'deshacer';
COMPROBAR: 'comprobar';
ATORNILLAR: 'atornillar';
MARTILLAR: 'martillar';
COLGAR: 'colgar';
MARCAR: 'marcar';
PEGAR: 'pegar';
COLOCAR: 'colocar';
NIVELAR: 'nivelar';


FIN: 'fin';
CON: 'con';
EN: 'en';
A: 'a';
Y: 'y';
USANDO: 'usando';
PARED: 'pared';


NUM: [0-9]+;
CADENA: '"' (~["\r\n])* '"';
ID: [a-zA-ZáéíóúÁÉÍÓÚñÑ_] [a-zA-Z0-9_áéíóúÁÉÍÓÚñÑ]*;
COMA: ',';
PUNTOYCOMA: ';';
DOS_PUNTOS: ':';
ESPACIO: [ \t\r\n]+ -> skip;