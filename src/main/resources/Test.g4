grammar Test;

startN : '$' ID? ;
DOLLAR : '$' ;
ID : [a-z]+ ;
WS : [ \t\n]+ -> skip ;

//startN : 'hello' ID ;
//HELLO : 'hello' ;
//ID : [a-z]+ ;
//WS : [ \t\n]+ -> skip ;
