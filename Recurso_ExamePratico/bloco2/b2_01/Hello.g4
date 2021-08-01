grammar Hello;              // Define a grammar called Hello
statements: (greetings | goodBye)+;
greetings: 'hello' name;      // match keyword hello followed by an identifier
goodBye: 'bye' name;
name: ID+;
ID: [a-zA-Z]+;                 // match lower-case identifiers
WS: [ \t\r\n]+ -> skip;     // skip spaces, tabs, newlines, \r (Windows)

/**
No terminal:
$ antlr4 Hello.g4
$ ls -l
$ javac *.java //->compila os ficheiros em Java
$ antlr4-test
  hello mundo (ENTER + ^D) -> nao apareceu nada, pois significa que a entrada inserida está de acordo com a gramática
 */