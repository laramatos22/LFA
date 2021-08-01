grammar FracLang;

program:
        stat* EOF;

stat:
        assignment ';'      #StatAssign
    |   display ';'         #StatDisplay
    ;

assignment:
        ID '<=' expr;

display:
        'display' expr;

expr:
        '(' expr ')'                #ExprParent
    |   expr op=('*'|':') expr      #ExprMultDiv
    |   expr op=('+'|'-') expr      #ExprAddSub
    |   Number '/' Number           #ExprFraction
    |   Number                      #ExprNumber
    |   ID                          #ExprID
    |   'read' STRING               #ExprReadString
    |   'reduce' expr               #ExprReduce
    |   op=('+'|'-') expr           #ExprPlusMinus
    ;

STRING: '"' .*? '"';
Number: [0-9]+;
ID: [a-z]+;
WS: [ \t\r\n]+ -> skip;
COMMENT: '--' .*? '\n' -> skip;
