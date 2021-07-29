grammar Hello;

testOne: TERM BR_OP ;
testTwo: TERM BR_OP2 ;
/**** Lexer rules ****/
TERM :  [a-z]+ ;
BR_OP : SLASH 'br' | 'Br' | 'bR' | 'BR' ;
BR_OP2 : SLASH [bB][rR] ;
SLASH : '/' ;

