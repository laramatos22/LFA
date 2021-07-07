/** EXERCICIO 9
Pretende-se implementar uma calculadora para fracções racionais (numerador e denomi-
nador representados por números inteiros).
 */

grammar FractionCalculator;

main:  
    stat* EOF;

stat:
    (print | assignment) ';'
    ;

assignment:
    expr '->' ID;           // exemplo: 3/4 -> x; // guarda a fração 3/4 na variavel x

print:
    'print' expr;

expr:
    op2=('+' | '-') expr                    #ExprUnary
    | expr op=('*' | ':' | '^') expr        #ExprMultDivPotencia
    | expr op2=('+' | '-') expr             #ExprAddSub
    | 'read' '"' prompt=.* '"'              #ExprAssignment
    | ID                                    #ExprId
    |Number                                 #ExprNumber
    | '(' expr ')'                          #ExprParenthesis
    | 'reduce' expr                         #ExprReduce
    | '('? Number '/' Number ')'?           #ExprFraction
    ;

ID: [a-zA-Z_]+;
Number: [-]?[0-9]+;
WS: [ \t\r\n]+ -> skip;
COMMENT: '//'.*? '\n' -> skip;
