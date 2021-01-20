lexer grammar Lexer;

import UnicodeClasses;

DelimitedComment
    : '/*' ( DelimitedComment | . )*? '*/'
      -> channel(HIDDEN)
    ;

LineComment
    : '//' ~[\u000A\u000D]*
      -> channel(HIDDEN)
    ;

WS
    : [\u0020\u0009\u000C]
      -> skip
    ;

NL: '\u000A' | '\u000D' '\u000A' ;

CLASS: 'class';
CORON: ':';
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
SENSOR: 'Sensor';
ACTUATOR: 'Actuator';
PUBLIC: 'public';
SEMICORON: ';';

fragment Letter
    : UNICODE_CLASS_LL
    | UNICODE_CLASS_LM
    | UNICODE_CLASS_LO
    | UNICODE_CLASS_LT
    | UNICODE_CLASS_LU
    | UNICODE_CLASS_NL
    ;

fragment DecDigit
    : UNICODE_CLASS_ND
    ;

Identifier
    : (Letter | '_') (Letter | '_' | DecDigit)*
    | '`' ~('`')+ '`'
    ;
