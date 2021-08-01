grammar Calculator;

program:
        stat* EOF
    ;

stat:
        expr? NEWLINE                   #ExprStat
    |   assignment? NEWLINE             #AssignStat
    ;

assignment:
        ID '=' expr
    ;

expr:
        expr op=('*'|'/'|'%') expr      #ExprMultDivMod
    |   expr op=('+'|'-') expr          #ExprAddSub
    |   Integer                         #ExprInteger
    |   '(' expr  ')'                   #ExprParent
    |   ID                              #ExprId
    ;

Integer: [0-9]+;        // implement with long integers
ID: [a-zA-Z]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;

