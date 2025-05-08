grammar JuliaSubset;

program: statement* EOF;

interfaceDecl: 'interface' ID '{' interfaceBody '}' ;
interfaceBody: methodSignature* ;
methodSignature: 'function' ID '(' paramList? ')' ';' ;

classDecl: 'class' ID ('extends' ID)? ('implements' ID)? '{' classBody '}' ;
classBody: (fieldDecl | constructorDecl | destructorDecl | methodDecl)* ;

fieldDecl: visibility ID ':' 'Int' ';' ;
constructorDecl: 'constructor' '(' paramList? ')' block 'end' ;
destructorDecl: 'destructor' '(' ')' block 'end' ;
methodDecl: 'function' ID '(' paramList? ')' block 'end' ;

funcDecl: 'function' ID '(' paramList? ')' block 'end' ;

objectDecl: ID '=' 'new' ID '(' argList? ')' ';' ;
methodCall: ID '.' ID '(' argList? ')' ';' ;

printStmt: 'print' '(' expr ')' ';' ;
inputStmt: ID '=' 'input' '(' ')' ';' ;
assignmentStmt: ('this' '.' ID | ID) '=' expr ';' ;
deleteStmt: 'delete' ID ';' ;
breakStmt: 'break' ';' ;
continueStmt: 'continue' ';' ;

whileStmt: 'while' expr 'do' block 'end' ;
forStmt: 'for' ID '=' expr ':' expr 'do' block 'end' ;

paramList: ID (',' ID)* ;
argList: expr (',' expr)* ;

block: '{' statement* returnStmt? '}' ;
returnStmt: 'return' expr ';' ;

ifStmt: 'if' expr 'then' block 'end';

STRING: '"' (~["\\] | '\\' .)* '"';

funcCallStmt: ID '(' argList? ')' ';';

statement
    : forStmt
    | ifStmt
    | classDecl
    | funcDecl
    | objectDecl
    | methodCall
    | funcCallStmt
    | printStmt
    | inputStmt
    | assignmentStmt
    | deleteStmt
    | breakStmt
    | continueStmt
    | whileStmt
    ;



expr
    : STRING                         # StringExpr       
    | INT                            # IntExpr
    | ID                             # IdExpr
    | ID '(' argList? ')'            # FuncCallExpr
    | ID '.' ID                      # FieldAccessExpr
    | ID '.' ID '(' argList? ')'     # MethodCallExpr
    | 'this' '.' ID                  # ThisFieldExpr
    | expr op=('*'|'/') expr         # MulDivExpr
    | expr op=('+'|'-') expr         # AddSubExpr
    | expr op=('<'|'>'|'<='|'>='|'=='|'!=') expr  # ComparisonExpr
    | '(' expr ')'                   # ParensExpr
    ;

visibility: 'public' | 'private' ;

ID: [a-zA-Z_][a-zA-Z_0-9]* ;
INT: [0-9]+ ;

LINE_COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \t\r\n]+ -> skip ;
