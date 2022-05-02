/* Krishna Pandya */
grammar GJGrammar;

/* Program */
program
        : '{' body '}'
        ;

/* Body of the Program */
body
	:
	| terms+
	;

/* Terms that will be included in the body */

terms
	: (ifCondition|whileLoop|printStatement|expr)
	;

/* expr will have assignment expressions for integer and boolean */

expr
	: 'ank' IDENTIFIER (isEqualto operator)?   #integerAssignment
	| 'tark' IDENTIFIER (isEqualto booleanExpression)? #booleanAssignment
    | 'vakya' IDENTIFIER (isEqualto stringExpression)? #stringAssignment
	| IDENTIFIER isEqualto operator  #integerAssignment
	| IDENTIFIER isEqualto booleanExpression #booleanAssignment
    | IDENTIFIER isEqualto stringExpression #stringAssignment
    ;


/* booleanExpression includes logic and comparison operators also maintains uniformity*/
booleanExpression
    : booleanExpression op=(Equals|NotEqual) booleanExpression #expressionBoolean
    | booleanExpression op=(AND|OR) booleanExpression #booleanConnectorExpression
    | arithmeticComparison #booleanComparisonExpression
    | '(' booleanExpression ')' #booleanParenthesisExpression
    | BOOL #onlyBooleanExpression
    | IDENTIFIER #onlyBooleanIdentifier
    ;

/* Arithmetic Compsrisons for datatype Integer(in this language ank)*/
arithmeticComparison
    : operator op=(GreaterThan|Lessthan|GreaterEqual|LessEqual|Equals|NotEqual) operator  # numberComparisonExpression
    ;

/* Arithmetic Operations */
operator
    : operator op=(MULTIPLY|DIVIDE) operator #numberMulDivExpr
    | operator op=(ADDITION|SUBTRACTION) operator #numberAddSubExpr
    | '(' operator ')' #numberParenthesesExpr
	| operator op=QUESTIONMARK expr bop=COLON expr #numberTernaryExpr
    | SUBTRACTION? DIGITS  #onlyNumberExpr
    | SUBTRACTION? IDENTIFIER #onlyNumberIdentifier
    ;

/* stringExpression  includes string datatype and string comparison operator */

stringExpression
    : stringExpression se=(Equals|NotEqual) stringExpression #stringExpr
    | STR #onlyStringExpr
    ;

/* condition expression block for loop*/
cond_expressn
    : '(' booleanExpression ')'
    ;


/* if condition block syntax */
ifCondition
    : 'jo' cond_expressn '{' body '}' (elseifCondition)* (elseCondition)? 'bas'
    ;

/* Else if condition syntax */

elseifCondition
    : 'nahitoh' cond_expressn '{' body '}'
    ;

/* else syntax */
elseCondition
    : 'toh' '{' body '}'
    ;

/* whileLoop condition */
whileLoop
    : 'sudhi' cond_expressn '{' body '}'
    ;

/* printStatement systax */
printStatement
    : 'batav' '(' (DIGITS|BOOL|IDENTIFIER|operator|booleanExpression) ')'
    ;

/* DIGITS Accepts numbers from 0 to 9 */
DIGITS
	: [1-9] [0-9]*
	| '0'
	;

/* Takes Boolean value as True or false. */
BOOL
	: 'Ha'
	| 'Na'
	;

/* Takes String values */

STR : '"'[a-zA-Z0-9]*'"''\n' ;


/* Arithmetic Operators */

ADDITION               : '+';
SUBTRACTION              : '-';
MULTIPLY           : '*';
DIVIDE             : '/';
AND                : '&&';
OR                 : '||';
Lessthan          : '<';
GreaterThan       : '>';
LessEqual    : '<=';
GreaterEqual : '>=';
NotEqual          : '!=';
Equals        : '==';
QUESTIONMARK   :'?';
COLON		:':';


/* Identifiers */
IDENTIFIER
	: [a-zA-Z_] [a-zA-Z_0-9]*
	;

isEqualto  : '=';

WS      : [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
Comment : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip;