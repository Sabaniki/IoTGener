parser grammar Parser;

options {tokenVocab = Lexer;}

program:
    class
    ;

class
    : CLASS Identifier CORON (ACTUATOR | SENSOR) block;

block: LBRACE NL Identifier NL RBRACE;



