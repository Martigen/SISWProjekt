grammar Colorful;





//WS : [ \t\r\n]+ -> skip;
//
//operation   : WHITESPACE* left=NUMBER WHITESPACE* operator='red' WHITESPACE* right=NUMBER
//            | WHITESPACE* left=NUMBER WHITESPACE* operator='blue' WHITESPACE* right=NUMBER
//            | WHITESPACE* left=NUMBER WHITESPACE* operator='pink' WHITESPACE* right=NUMBER
//            | WHITESPACE* left=NUMBER WHITESPACE* operator='orange' WHITESPACE* right=NUMBER;
//
//NUMBER : [-0-9]+;
//WHITESPACE : ' ' -> skip ;
//
//
//ADD : 'red';
//
//
//gold
//   : statementlist+ EOF
//   ;
//
//statementlist
//   : statement (';' statement)?
//   ;
//
//statement
//   : assignstmt
//   | incrementstmt
//   | loopstmt
//   ;
//
//assignstmt
//   : var ':=' number ';'
//   ;
//
//incrementstmt
//   : var ':=' var ('+' | '-') number
//   ;
//
//loopstmt
//   : 'Gold' var 'Light' statementlist 'Dark'
//   ;
//
//var
//   : ID
//   ;
//
//number
//   : NUMBER
//   ;
//
//ID
//   : [a-zA-Z] [a-zA-Z0-9]*
//   ;
//
//
//COMMENT
//   : '/*' .*? '*/' -> skip
//   ;
prog:   stat+ ;

stat:   expr NEWLINE                # printExpr
    |   ID 'mix' expr NEWLINE         # assign
    |   loop NEWLINE                # whileLoop
    |   relational NEWLINE          # relat
    |   black NEWLINE       # output
    |   ID 'mix' 'White' white NEWLINE  # input
    |   NEWLINE                     # blank
    ;

black : 'Black' INT       #out;
white : INT       #in;

expr:   expr op=('pink'|'orange') expr      # MulDiv
    |   expr op=('red'|'blue') expr      # AddSub
    |   INT                         # int
    |   ID                          # id
    |   '(' expr ')'                # parens
    ;

relational:     expr op=(GREATER|LESS) expr     # GreaterEqual
          ;

loop:   'Gold' '('relational')' NEWLINE? 'Light'stat*'Dark'   #while
    ;

EQ : 'mix';
GREATER : '>' ;
LESS : '<' ;
MUL :   'pink' ;
DIV :   'orange' ;
ADD :   'red' ;
SUB :   'blue' ;
ID  :   [a-zA-Z]+ ;
INT :   [0-9]+ ;
NEWLINE:'\r'? '\n' ;
WS  :   [ \t]+ -> skip ;
