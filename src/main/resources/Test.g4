grammar Test;

startN : '$' ID? ;
DOLLAR : '$' ;
ID : ([a-z]|[A-Z])+ ;
WS : [ \t\n]+ -> skip ;

EXP: [E][e][X][x][P][p] ;

//startN : 'hello' ID ;
//HELLO : 'hello' ;
//ID : [a-z]+ ;
//WS : [ \t\n]+ -> skip ;
