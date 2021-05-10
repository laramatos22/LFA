grammar Calculator;

program:
        stat* EOF
    ;
stat:
        expr? NEWLINE
    ;

assingment: 
        ID '=' expr
    ;
    
ID:     [a-zA-Z_]+;

expr:
        expr op=('*'|'/'|'%') expr   #ExprMultDivMod
    |   expr op=('+'|'-') expr       #ExprAddSub
    |   Integer                      #ExprInteger
    |   '(' expr ')'                 #ExprParent
    |   ID                           #ExprId
    ;

Integer: [0-9]+;        //implement with long integers
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;