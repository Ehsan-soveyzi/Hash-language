grammar Hash;

/*    ............. Start Way ....................... */
startState : moduleStatements? importStatements* supportedStatements* EOF;



/*   ...............  supported statementes  ................ */


//topLevelStatements : moduleStatements |  importStatements ;

supportedStatements
    : assignmentsStatemetns // type identifier = expression ;
    | definedAssignment // means like x = 1; x++ , ...
    | ifElseStatments // age vagarna
    | loopStatements // ta() ... & baraye() ...
    | switchStatements // entekhab -> halat ... -> digar
    | functionStatemnets // bebin type identifier()
    | returnStatement // bede somthing
    | functionCallStatement // x(passed parameteres);
    | classStatement // klass -> feileds , methods , constructures
    | instantiationStatement // definedClass identifier = jadid definedClass(passed parameters);
    | thisAssignment // in.feildName
    | objectFieldAssignment
    | printStatement  // bechap(somthing)
    | goToStatements // handling shekan & edame statements
    | inputStatement // bekhan(somthing)
    | exceptionStatements // emteghan , gereftar , akhar
    | throwsException // bendaz
    | customExceptionStatement // klass MyException;
    | defineVariableWithNoAssignmentStatement
    ;


/* .....................   supportStatements definitions   .................... */

importStatements
    : IMPORT moduleName SEMICOLEN
    ;

moduleStatements
    : MODULE packageName SEMICOLEN
    ;

definedAssignment
    : update SEMICOLEN
    ;

assignmentsStatemetns
    : type IDENTIFIER ASSIGNMENT expression SEMICOLEN
    ;

defineVariableWithNoAssignmentStatement
    : type IDENTIFIER SEMICOLEN // likes how we define fields inside a class
    ;

ifElseStatments
    : IF OP condition CP IS OB supportedStatements* CB (ELSE OB supportedStatements* CB)?
    ;

loopStatements
    : whileStatement
    | forStatement
    ;

goToStatements
    : (BREAK | CONTINUE) SEMICOLEN
    ;


functionStatemnets
    : DEFINE functionTypes IDENTIFIER OP functionParameters? CP OB supportedStatements* CB
    ;

functionCallStatement
    : functionCall SEMICOLEN
    | methodCall SEMICOLEN
    ;

returnStatement
    : RETURN expression? SEMICOLEN
    ;


switchStatements
    : SWITCH OP IDENTIFIER CP OB caseStatements* (DEFAULT OB supportedStatements* CB)? CB
    ;


classStatement
    : CLASS IDENTIFIER OB classMember* CB
    ;

thisAssignment
    : THIS DOT IDENTIFIER ASSIGNMENT expression SEMICOLEN
    ;

instantiationStatement
    : IDENTIFIER IDENTIFIER ASSIGNMENT NEW IDENTIFIER OP argumentList? CP SEMICOLEN
    ;

objectFieldAssignment
    : IDENTIFIER DOT IDENTIFIER ASSIGNMENT expression SEMICOLEN
    ;

printStatement
    : PRINT OP expression CP SEMICOLEN
    ;

inputStatement
    : INPUT OP inputParameters (COMMA inputParameters)* CP SEMICOLEN
    ;

exceptionStatements
    : TRY OB supportedStatements* CB catchClause+ finallyClause?
    | TRY OB supportedStatements* CB finallyClause
    ;

throwsException
    : THROWS exceptionType OP CP SEMICOLEN
    ;

customExceptionStatement
    : CLASS IDENTIFIER SEMICOLEN
    ;


/* helper statements (derived by supportedStatements) */
functionParameters
    : functionParameter (COMMA functionParameter)*
    ;

functionParameter
    : type IDENTIFIER
    ;

catchClause
    : CATCH OP exceptionType IDENTIFIER CP OB supportedStatements* CB
    ;

finallyClause
    : FINALLY OB supportedStatements* CB
    ;


fieldAccess
    : IDENTIFIER DOT IDENTIFIER
    ;

thisFieldAccess
    : THIS DOT IDENTIFIER
    ;

exceptionType
    : IDENTIFIER
    ;


methodCall
    : IDENTIFIER DOT IDENTIFIER OP argumentList? CP
    ;

caseStatements
    : CASE literal OB supportedStatements* CB
    ;

forStatement
    : FOR OP assignmentsStatemetns condition SEMICOLEN update CP OB loopBodyStatement* CB
    ;

whileStatement
    : WHILE OP condition CP OB loopBodyStatement* CB
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

condition
    : expression
    ;

functionCall
    : IDENTIFIER OP argumentList? CP
    ;

argumentList
    : expression (COMMA expression)*
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
    | inputStatement
    | exceptionStatements
    | throwsException
    | customExceptionStatement
    | defineVariableWithNoAssignmentStatement
    ;


ifElseStatmentsInLoop
    : IF OP condition CP IS OB loopBodyStatement* CB (ELSE OB loopBodyStatement* CB)?
    ;

update
    : IDENTIFIER ASSIGNMENT expression
    ;


// main expression priority handling in parser
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
    : powerExpression ((MULTIPLICATION | DIVISION | MODULO) powerExpression)*
    ;

// power is right associative: x ** y ** z => x ** (y ** z)
powerExpression
    : postfixExpression (POWER powerExpression)?
    ;

// postfix is parsed after prefix
// example: ++x-- becomes (++x)--
postfixExpression
    : prefixExpression (INCREEMENT | DECREEMENT)?
    ;

// prefix unary operators: !x, -x, +x, ++x, --x
prefixExpression
    : (NOT | PLUS | MINUS | INCREEMENT | DECREEMENT) prefixExpression
    | accessAndCallsExpression
    ;

// access and calls have very high priority
accessAndCallsExpression
    : methodCall
    | functionCall
    | fieldAccess
    | thisFieldAccess
    | primaryExpression
    ;

// parentheses, literals, and simple identifiers
primaryExpression
    : literal
    | IDENTIFIER
    | OP expression CP
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


/* .................... supported keywords(lexer rulles) .................   */
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


/* ............ rest supported words(not known as key words) ............ */
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


/* ..................... AGNORABLE_STATEMENTS ................... */
LINE_COMMENT : '//' ~[\r\n]* -> skip;

BLOCK_COMMENT : '/*' .*? '*/' -> skip;

WS : [ \t\r\n]+ -> skip;