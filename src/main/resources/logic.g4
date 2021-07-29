grammar logic;
logic: expression EOF;
expression
    : LPAREN expression RPAREN   # ParenExp
    | expression AND expression  # AndBlock
    | expression OR expression   # OrBlock
    | atom                       # AtomExp
    ;
atom : INT;
INT: DIGITS;
DIGITS : [0-9]+;
AND : 'AND';
OR : 'OR';
LPAREN : '(';
RPAREN : ')';
WS: [ \n\t\r\u00A0]+ -> skip;
//WS: [ \t\r\n\007C]+ -> skip;

