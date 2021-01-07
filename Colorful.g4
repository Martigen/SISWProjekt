grammar Colorful;


/** PARSER RULES **/
parse
 : block
 ;

block
 : stat+
 ;

 stat:      assignment NEWLINE
  |         reserveMemoryForVariable NEWLINE
  |         operateOnDeclaredVariable NEWLINE
  |         if_stat NEWLINE?
  |         while_stat NEWLINE?
  |         fore_stat NEWLINE?
  |         blackValue NEWLINE
  |         blackExpression NEWLINE
  |         whiteValue NEWLINE
  |         NEWLINE
//  |         white NEWLINE
  |         OTHER {System.err.println("Unknown char: " + $OTHER.text);}
  ;

 reserveMemoryForVariable: TYPE ID
  ;

 assignment: TYPE ID ASSIGN expr
  ;

 operateOnDeclaredVariable: ID ASSIGN expr
  ;

 if_stat: IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
  ;

 condition_block: expr stat_block
  ;

 stat_block: OBRACE block CBRACE
        |           stat
  ;

 while_stat: WHILE expr stat_block
  ;

 fore_stat: FOR expr  (IF expr op=(GREATER | LESS | GREATER_EQ | LESS_EQ) expr)  expr  stat_block;
  // white: (type=TYPE | expr)
  //  ;
  //

 blackValue: OUT type=TYPE
  ;

 blackExpression: OUT expr
  ;

  whiteValue: IN type=TYPE;

 expr:              expr op=(MUL | DIV) expr                                #multiplicationExpr
        |           expr op=PWR expr                                        #pwrExpr
        |           expr op=SQRT                                            #sqrtExpr
        |           expr op=FACTORIAL                                       #factorialExpr
        |           expr op=MOD expr                                        #modExpr
        |           expr op=(ADD | SUB) expr                                #additiveExpr
        |           expr op=(GREATER|LESS|GREATER_EQ|LESS_EQ) expr          #relationalExpr
        |           expr op=(EQ | NEQ) expr                                 #equalityExpr
        |           whiteValue                                              #inputExpr
        |           atom                                                    #atomExpr
  ;

 atom:              OPAR expr CPAR                                          #parExpr
        |           INT                                                     #integerAtom
        |           DBL                                                     #doubleAtom
        |           BOOL                                                    #booleanAtom
        |           ID                                                      #idAtom
        |           STR                                                     #stringAtom
  ;




/** LEXER RULES **/
TYPE:           INTEGER
    |           DOUBLE
    |           STRING
    |           BOOLEAN
    ;


EQ :            'indigo';
NEQ :           'shake';
GREATER :       '>';
LESS :          '<';
GREATER_EQ :    '>=';
LESS_EQ :       '<=';
MUL :           'pink';
DIV :           'orange';
ADD :           'red';
SUB :           'blue';
PWR :           'aqua';
SQRT :          'auburn';
MOD :           'magenta';
FACTORIAL :     'capri';


ASSIGN :        'mix';
OPAR :          '(';
CPAR :          ')';
OBRACE :        'light';
CBRACE :        'dark';
OUT:            'Black';
IN:             'White';


IF :            'transparent';
ELSE :          'violet';
WHILE :         'gold';
FOR :           'silver';

INT :           '-'? [0-9]+ ;
DBL :           '-'? [0-9]+ '.' [0-9]*
    |           '-'? '.' [0-9]+
    ;
BOOL:           TRUE | FALSE ;
STR :           STRLIT ;


ID  :           VALID_ID_START VALID_ID_CHAR* ;
NEWLINE:        '\r'? '\n' | '\r'? '~' ;
COMMENT:        '#' ~[\r\n]* -> skip ;
WS  :           [ \t]+ -> skip ;


TRUE:           'true' ;
FALSE:          'false' ;
STRLIT:         '->' ((~[->])* | '->->') '->' ;


fragment VALID_ID_START:    ('a' .. 'z') | ('A' .. 'Z') | '_' ;
fragment VALID_ID_CHAR:     VALID_ID_START | ('0' .. '9') ;
fragment INTEGER:           'Green' ;
fragment DOUBLE:            'Darkgreen' ;
fragment BOOLEAN:           'Brown' ;
fragment STRING:            'Purple' ;


OTHER
 : .
 ;
