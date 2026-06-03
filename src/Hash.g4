grammar Hash;

startState : supportedStatements* EOF;


// supported statements(parser rulles)
//supportedStatements : ifElseStatments | assignmentsStatemetns | moduleStatements | importStatements | loopStatements
//    | switchStatements | functionStatemnets | classStatements | instantiationStatements | exceptionStatements;

supportedStatements
    : assignmentsStatemetns
    | definedAssignment
    | moduleStatements
    | importStatements
    | ifElseStatments
    | loopStatements
    | switchStatements
    | functionStatemnets
    | returnStatement
    | functionCallStatement
    | classStatement
    | instantiationStatement
    | thisAssignment
    | objectFieldAssignment
    | printStatement
    | goToStatements
    | inputStatement
    ;


//exceptionStatements: ' ';
//
//instantiationStatements: ' ';
//
//classStatements: ' ';
//

functionStatemnets
    : DEFINE functionTypes IDENTIFIER OP functionParameters? CP OB supportedStatements* CB
    ;

functionParameters
    : functionParameter (COMMA functionParameter)*
    ;

functionParameter
    : type IDENTIFIER
    ;

returnStatement
    : RETURN expression? SEMICOLEN
    ;

functionCallStatement
    : functionCall SEMICOLEN
    | methodCall SEMICOLEN
    ;

functionCall
    : IDENTIFIER OP argumentList? CP
    ;

argumentList
    : expression (COMMA expression)*
    ;

classStatement
    : CLASS IDENTIFIER OB classMember* CB
    ;

classMember
    : fieldDeclaration
    | classMethodDeclaration
    | constructorDeclaration
    ;

fieldDeclaration
    : type IDENTIFIER SEMICOLEN
    ;

classMethodDeclaration
    : DEFINE functionTypes IDENTIFIER OP functionParameters? CP OB supportedStatements* CB
    ;

constructorDeclaration
    : DEFINE IDENTIFIER OP functionParameters? CP OB supportedStatements* CB
    ;

thisAssignment
    : THIS DOT IDENTIFIER ASSIGNMENT expression SEMICOLEN
    ;

objectFieldAssignment
    : IDENTIFIER DOT IDENTIFIER ASSIGNMENT expression SEMICOLEN
    ;

fieldAccess
    : IDENTIFIER DOT IDENTIFIER
    ;

thisFieldAccess
    : THIS DOT IDENTIFIER
    ;

instantiationStatement
    : IDENTIFIER IDENTIFIER ASSIGNMENT NEW IDENTIFIER OP argumentList? CP SEMICOLEN
    ;


methodCall
    : IDENTIFIER DOT IDENTIFIER OP argumentList? CP
    ;

switchStatements
    : SWITCH OP IDENTIFIER CP OB caseStatements* (DEFAULT OB supportedStatements* CB)? CB
    ;

caseStatements
    : CASE literal OB supportedStatements* CB
    ;

loopStatements
    : whileStatement
    | forStatement
    ;

forStatement
    : FOR OP assignmentsStatemetns condition SEMICOLEN update CP OB loopBodyStatement* CB
    ;

whileStatement
    : WHILE OP condition CP OB loopBodyStatement* CB
    ;

goToStatements
    : (BREAK | CONTINUE) SEMICOLEN
    ;

importStatements
    : IMPORT moduleName SEMICOLEN
    ;

moduleStatements
    : MODULE packageName SEMICOLEN
    ;

assignmentsStatemetns
    : type IDENTIFIER ASSIGNMENT expression SEMICOLEN
    ;

definedAssignment
    : update SEMICOLEN
    ;

ifElseStatments
    : IF OP condition CP OB supportedStatements* CB (ELSE OB supportedStatements* CB)?
    ;

condition
    : expression
    ;

loopBodyStatement
    : assignmentsStatemetns
    | definedAssignment
    | moduleStatements
    | importStatements
    | ifElseStatmentsInLoop
    | loopStatements
    | switchStatements
    | goToStatements
    | returnStatement
    | functionCallStatement
    | instantiationStatement
    | thisAssignment
    | objectFieldAssignment
    | printStatement
    ;

ifElseStatmentsInLoop
    : IF OP condition CP OB loopBodyStatement* CB (ELSE OB loopBodyStatement* CB)?
    ;

update
    : IDENTIFIER ASSIGNMENT expression
    ;


// main grammar handeling
expression
    : logicalOrExpression
    ;

logicalOrExpression
    : logicalAndExpression (LOGICAL_OR logicalAndExpression)*
    ;

logicalAndExpression
    : equalityExpression (LOGICAL_AND equalityExpression)*
    ;

equalityExpression
    : comparitioanlExpression (EQUALITY comparitioanlExpression)?
    ;

comparitioanlExpression
    : additiveExpression (COMPARITIONAL additiveExpression)?
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression ((MULTIPLICATION | DIVISION | MODULO) unaryExpression)*
    ;

unaryExpression
    : (NOT | PLUS | MINUS | INCREEMENT | DECREEMENT) unaryExpression
    | powerExpression
    ;

powerExpression
    : postfixExpression (POWER unaryExpression)?
    ;

postfixExpression
    : primaryExpression (INCREEMENT | DECREEMENT)?
    ;

primaryExpression
    : literal
    | methodCall
    | functionCall
    | fieldAccess
    | thisFieldAccess
    | IDENTIFIER
    | OP expression CP
    ;

printStatement
    : PRINT OP expression CP SEMICOLEN
    ;

inputStatement
    : INPUT OP inputParameters (COMMA inputParameters)* CP SEMICOLEN
    ;

inputParameters
    : type IDENTIFIER
    ;

type
    : INT
    | FLOAT
    | BOOLEAN
    | CHAR
    | STRING
    ;

functionTypes
    : INT
    | FLOAT
    | BOOLEAN
    | CHAR
    | STRING
    | VOID
    ;

literal
    : INT_LITERAL
    | FLOAT_LITERAL
    | booleanLiteral
    | STRING_LITERAL
    | CHAR_LITERAL
    | NULL
    ;

packageName
    : IDENTIFIER (DOT IDENTIFIER)*
    ;

moduleName
    : packageName (DOT MULTIPLICATION)?
    ;

booleanLiteral
    : TRUE
    | FALSE
    ;


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

BLOCK_COMMENT : '/*' .*? '*/' -> skip;

WS : [ \t\r\n]+ -> skip;