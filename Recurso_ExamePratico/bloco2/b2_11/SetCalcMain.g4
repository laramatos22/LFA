// Calculadora simples para operações sobre conjuntos

grammar SetCalcMain;

program:
        stat* EOF
    ;

stat:
        assignment? NEWLINE         #StatAssign
    |   expr? NEWLINE               #StatExpr
    ;

assignment:
        Variables '=' expr
    ;

expr:
        '{' Numbers+ '}'            #ExprNumbers
    |   Variables                   #ExprVariables
    |   expr '+' expr               #ExprUnion
    |   expr '&' expr               #ExprIntersect
    |   expr '\\' expr              #ExprDifference
    |   '(' expr ')'                #ExprParent
    ;

Numbers:
        Integer
    |   Integer ','
    ;

ID: [a-z]+;
Variables: [A-Z]+;
Integer: [0-9]+;
WS: [ \t] -> skip;
NEWLINE: '\r'? '\n';
COMMENT: '--' .*? '\n' -> skip;
