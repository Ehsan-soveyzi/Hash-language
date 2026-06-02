grammar Hash;

startState : supportedStatements* EOF;


// supported statements(parser rulles)
//supportedStatements : ifElseStatments | assignmentsStatemetns | moduleStatements | importStatements | loopStatements
//    | switchStatements | functionStatemnets | classStatements | instantiationStatements | exceptionStatements;

supportedStatements : assignmentsStatemetns | moduleStatements | importStatements | ifElseStatments | loopStatements
    | switchStatements | functionStatemnets;


//exceptionStatements: ' ';
//
//instantiationStatements: ' ';
//
//classStatements: ' ';
//

functionStatemnets
    : DEFINE functionTypesApproaches
    ;


functionTypesApproaches
    : intReturn
    | floatReturn
    | boolReturn
    | charReturn
    | stringReturn
    | voidReturn
    ;

intReturn
    : INT IDENTIFIER OP functionParameters? CP OB intFunctionBody CB
    ;

floatReturn
    : FLOAT IDENTIFIER OP functionParameters? CP OB floatFunctionBody CB
    ;

boolReturn
    : BOOLEAN IDENTIFIER OP functionParameters? CP OB boolFunctionBody CB
    ;

charReturn
    : CHAR IDENTIFIER OP functionParameters? CP OB charFunctionBody CB
    ;

stringReturn
    : STRING IDENTIFIER OP functionParameters? CP OB stringFunctionBody CB
    ;

voidReturn
    : VOID IDENTIFIER OP functionParameters? CP OB voidFunctionBody CB
    ;
functionParameters : type IDENTIFIER (COMMA functionParameters)*;

intFunctionBody : intFunctionStatement* intReturnStatement intFunctionStatement*;

floatFunctionBody : floatFunctionStatement* floatReturnStatement floatFunctionStatement*;

boolFunctionBody : boolFunctionStatement* boolReturnStatement boolFunctionStatement*;

charFunctionBody : charFunctionStatement* charReturnStatement charFunctionStatement*;

stringFunctionBody: stringFunctionStatement* stringReturnStatement stringFunctionStatement*;

voidFunctionBody : voidFunctionStatement*;


intFunctionStatement : assignmentsStatemetns | ifElseStatments | loopStatements | switchStatements | intReturnStatement;

floatFunctionStatement : assignmentsStatemetns | ifElseStatments | loopStatements | switchStatements | floatReturnStatement;

boolFunctionStatement: assignmentsStatemetns | ifElseStatments | loopStatements | switchStatements | boolReturnStatement;

charFunctionStatement: assignmentsStatemetns | moduleStatements | importStatements | ifElseStatments | loopStatements | switchStatements | charReturnStatement;

stringFunctionStatement: assignmentsStatemetns | moduleStatements | importStatements | ifElseStatments | loopStatements | switchStatements | stringReturnStatement;

voidFunctionStatement: assignmentsStatemetns | moduleStatements | importStatements | ifElseStatments | loopStatements | switchStatements | voidReturnStatement;

intReturnStatement : RETURN INT_LITERAL SEMICOLEN;

floatReturnStatement : RETURN FLOAT_LITERAL SEMICOLEN;

boolReturnStatement : RETURN booleanLiteral SEMICOLEN;

charReturnStatement : RETURN CHAR_LITERAL SEMICOLEN;

stringReturnStatement : RETURN STRING_LITERAL SEMICOLEN;

voidReturnStatement : RETURN SEMICOLEN;

switchStatements: SWITCH OP (IDENTIFIER) CP OB (caseStatements)* (DEFAULT OB (supportedStatements)* CB)? CB;

caseStatements : CASE (literal) OB (supportedStatements)* CB;
//
loopStatements: whileStatement | forStatement;
//

forStatement : FOR OP assignmentsStatemetns condition SEMICOLEN update CP OB (loopBodyStatement)* CB;

whileStatement : WHILE OP condition CP OB (loopBodyStatement)* CB;

goToStatements : (BREAK | CONTINUE) SEMICOLEN;

importStatements: IMPORT moduleName SEMICOLEN;

moduleStatements: MODULE packageName SEMICOLEN;

assignmentsStatemetns: type IDENTIFIER ASSIGNMENT expression SEMICOLEN;

ifElseStatments: IF OP condition CP OB (supportedStatements)* CB (ELSE OB (supportedStatements)* CB)?;


condition : expression;

loopBodyStatement // this define just for handling goTO commands in if statement in the loop
    : assignmentsStatemetns
    | moduleStatements
    | importStatements
    | ifElseStatmentsInLoop
    | loopStatements
    | goToStatements
    ;


ifElseStatmentsInLoop : IF OP condition CP OB (loopBodyStatement)* CB (ELSE OB (loopBodyStatement)* CB)?;

update : IDENTIFIER ASSIGNMENT expression;

// main grammar handeling
expression : logicalOrExpression;

logicalOrExpression : logicalAndExpression (LOGICAL_OR logicalAndExpression)*;

logicalAndExpression : equalityExpression (LOGICAL_AND equalityExpression)*;

equalityExpression : comparitioanlExpression (EQUALITY comparitioanlExpression)?;

comparitioanlExpression : additiveExpression (COMPARITIONAL additiveExpression)?;

additiveExpression : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*;

multiplicativeExpression : unaryExpression ((MULTIPLICATION | DIVISION | MODULO) unaryExpression)*;

unaryExpression : (NOT | PLUS | MINUS | INCREEMENT | DECREEMENT) unaryExpression | powerExpression;

powerExpression : postfixExpression (POWER unaryExpression)?;

postfixExpression : primaryExpression (INCREEMENT | DECREEMENT)?;

primaryExpression : literal | IDENTIFIER | OP expression CP;

type : INT | FLOAT | BOOLEAN | CHAR | STRING;

literal : INT_LITERAL | FLOAT_LITERAL | booleanLiteral | STRING_LITERAL | CHAR_LITERAL | NULL;

packageName : IDENTIFIER (DOT IDENTIFIER)*;

moduleName : packageName (DOT MULTIPLICATION)?;

booleanLiteral : TRUE | FALSE;









// supported keywords(lexer rulles)
MODULE : 'baste';
IMPORT : 'biar';
CLASS : 'klass';
THIS : 'in';
NEW : 'jadid';
DEFINE : 'bebin';
RETURN : 'bede';
INT : 'adad';
FLOAT : 'ashari';
BOOLEAN : 'boole';
STRING : 'matn';
CHAR : 'harf';
VOID : 'hich';
NULL : 'khali';
TRUE : 'dorost';
FALSE : 'ghalat';
IF : 'age';
IS : 'bood';
ELSE : 'vagarna';
WHILE : 'ta';
FOR : 'baraye';
BREAK : 'shekan';
CONTINUE : 'edame';
SWITCH : 'entekhab';
CASE : 'halat';
DEFAULT : 'digar';
TRY : 'emtehan';
CATCH : 'gereftar';
FINALLY : 'akhar';
THROWS : 'bendaz';
PRINT : 'bechap';
INPUT : 'bekhan';






// rest supported words(not known as key words)
OP : '(';
CP : ')';
OB : '{';
CB : '}';
PLUS : '+';
MINUS : '-';
SEMICOLEN : ';';
ASSIGNMENT : '=' | '+=' | '-=' | '*=' | '/=';
DIVISION : '/';
MULTIPLICATION : '*';
NOT : '!';
DOT : '.';
COMMA : ',';
MODULO : '%';
POWER : '**';
EQUALITY : '==' | '!=';
COMPARITIONAL : '>' | '>=' | '<' | '<=';
LOGICAL_OR : '||';
LOGICAL_AND : '&&';
INCREEMENT : '++';
DECREEMENT : '--';


INT_LITERAL : [0-9]+;
FLOAT_LITERAL : [0-9]+ '.' [0-9]+;
STRING_LITERAL : '"' ~["\r\n]* '"';
CHAR_LITERAL : '\'' . '\'';

IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;












// AGNORABLE_STATEMENTS
LINE_COMMENT : '//' ~[\r\n]* -> skip;

///* one */ code /* two */ -> the reason why we use ? after .*
BLOCK_COMMENT : '/*' .*? '*/' -> skip; // dot assginments in regex means all the possible supported characters

WS : [ \t\r\n]+ -> skip;

