package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones

%%
 
%public
%class Scanner
%char
%line
%column
%cup
%unicode
%ignorecase
//%notunix

%implements ScannerIF
%scanerror LexicalError

//macros
SPACE= [\ \t]
ENDLINE= \r\n
DIGIT= [0-9]
CHAR= [A-Za-z]
COMM= --.*{ENDLINE}
IN= {DIGIT}+
STR= \".*\"
ID= {CHAR} ({CHAR} | {DIGIT}) *

%{
 	LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
 	private int commentCount = 0;
    
//metodo de creacion de token
	private Token CreateToken (int id){
		Token token = new Token (id);
		token.setLine (yyline + 1);
		token.setColumn (yycolumn + 1);
		token.setLexema (yytext ());
		return token;
	}
%}
%%



<YYINITIAL> {

// palabras reservadas
	"begin" { return CreateToken (sym.BEGIN); }
	"Boolean" { return CreateToken (sym.BOOLEAN); }
	"constant" { return CreateToken (sym.CONSTANT); }
	"else" { return CreateToken (sym.ELSE); }
	"end" { return CreateToken (sym.END); }
	"False" { return CreateToken (sym.FALSE); }
	"function" { return CreateToken (sym.FUNCTION); }
	"if" { return CreateToken (sym.IF); }
	"Integer" { return CreateToken (sym.INTEGER); }
	"is" { return CreateToken (sym.IS); }
	"loop" { return CreateToken (sym.LOOP); }
	"out" { return CreateToken (sym.OUT); }
	"procedure" { return CreateToken (sym.PROCEDURE); }
	"Put_line" { return CreateToken (sym.PUT_LINE); }
	"record" { return CreateToken (sym.RECORD); }
	"return" { return CreateToken (sym.RETURN); }
	"then" { return CreateToken (sym.THEN); }
	"True" { return CreateToken (sym.TRUE); }
	"type" { return CreateToken (sym.TYPE); }
	"while" { return CreateToken (sym.WHILE); }

// delimitadores
	"(" { return CreateToken (sym.PAR_L); }
	")" { return CreateToken (sym.PAR_R); }
	"," { return CreateToken (sym.COMMA); }
	";" { return CreateToken (sym.SEMICOLON); }
	":" { return CreateToken (sym.COLON); }
// operadores
	"-" { return CreateToken (sym.MINUS); }
    "*" { return CreateToken (sym.BY); }
    ">" { return CreateToken (sym.GREATER); }
    "/=" { return CreateToken (sym.UNEQUAL); }
	"and" { return CreateToken (sym.AND); }
	":=" { return CreateToken (sym.BECOMES); }
	"." { return CreateToken (sym.DOT); }
// constantes literales
	{ IN } { return CreateToken (sym.INT); }
	{ STR } { return CreateToken (sym.STRING); }
// identificadores
	{ID} { return CreateToken (sym.ID); }
	{SPACE}	{}
	{ENDLINE} {}
// comentarios
	{ COMM } {} 
    
    // error en caso de coincidir con ning�n patr�n
	[^]     
                        {                                               
                           LexicalError error = new LexicalError ();
                           error.setLine (yyline + 1);
                           error.setColumn (yycolumn + 1);
                           error.setLexema (yytext ());
                           lexicalErrorManager.lexicalError (error);
                        }
    
}


                         


