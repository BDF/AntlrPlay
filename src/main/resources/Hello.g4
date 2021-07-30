grammar Hello;

testOne: TERM BR_OP ;
testTwo: TERM BR_OP2 ;
testTre: TERM BR_OP3 ;

/**** Lexer rules ****/

TERM :  [a-z]+ ;

/**
This shows that the lexer rules match only once.
So in this case testing
    'name'/br
would match parser rule testTre, it would not match testOne or Two.

Moving BR_OP2 to before BR_OP3 would maean testTwo would match but not testOne or testTre.
*/
BR_OP3 : LT [bB][rR] ;
BR_OP2 : LT B R ;
BR_OP : LT 'br' | 'Br' | 'bR' | 'BR' ;
LT : '<' ;

fragment B : [bB] ;
fragment R : [rR] ;



