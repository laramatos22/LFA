grammar CalFrac;

program:
        stat* EOF 
    ;

stat:
        (print | assignment) 
    ;

print:
        'print'expr 
    ;

assignment:
        expr '->' ID 
    ;

expr:
        expr op=('*'|':') expr          #ExprMultDiv
    |   expr op=('+'|'-') expr          #ExprAddSub
    |   sign=('-'|'+')? Integer         #ExprPlusMinus
    |   '(' fraction ')' '^' Integer    #ExprPotencia
    |   '(' expr ')'                    #ExprParent
    |   'reduce' fraction               #ExprReduce
    |   fraction                        #ExprFraction
    |   ID                              #ExprId
    ;

fraction: sign=('-'|'+')? num=Integer '/' den=Integer;
Integer: [0-9]+;
ID: [a-zA-Z_]+;
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;
PONTO: ';' -> skip;

