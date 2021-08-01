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
        op=('+'|'-') expr               #ExprMinusPlus
    |   expr op=('*'|'/'|'%') expr      #ExprMultDivMod
    |   expr op=('+'|'-') expr          #ExprAddSub
    |   Integer                         #ExprInteger
    |   '(' expr  ')'                   #ExprParent
    |   ID                              #ExprId
    ;

Integer: [0-9]+;        // implement with long integers
ID: [a-zA-Z_]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;

/**
converta uma expressão aritmética infixa (operador no meio dos operandos), numa expressão
equivalente sufixa (operador no fim). Para resolver o problema de ambiguidade com os
operadores unários + e -, faça com que na expressão sufixa convertida, esses operadores
apareçam, respectivamente, como !+ e !-.
 */

