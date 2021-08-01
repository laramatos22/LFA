grammar PrefixCalculator;

program:
        stat* EOF           // Zero or more repetitions of stat
    ;

stat:
        expr? NEWLINE       // Optative expr followed by an end-of-line
    ;

expr:
        op=('*'|'/'|'+'|'-') expr expr      #ExprPrefix // -> visits / callbacks
    |   Number                              #ExprNumber
    ;

Number: [0-9]+('.'[0-9]+)?; // fixed point real number
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
