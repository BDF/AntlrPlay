grammar Hello;

testOne: TERM BR_OP ;
testTwo: TERM BR_OP2 ;
testTre: TERM BR_OP3 ;

/**** Lexer rules ****/
TERM :  [a-z]+ ;
BR_OP : LT 'br' | 'Br' | 'bR' | 'BR' ;
BR_OP2 : LT B R ;
BR_OP3 : LT [bB][rR] ;
LT : '<' ;

fragment B : [bB] ;
fragment R : [rT] ;



