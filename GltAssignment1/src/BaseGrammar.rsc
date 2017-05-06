module BaseGrammar

//Keywords
//i.e. if / else, do / end, while, repeat / times
//About expressions
//http://tutor.rascal-mpl.org/Rascal/Libraries/Prelude/String/toLocation/toLocation.html#/Rascal/Declarations/SyntaxDefinition/SyntaxDefinition.html
keyword Keywords = "if"
                |"else"
                |"do"
                |"end"
                |"while"
                |"repeat"
                |"times";

//Whitespaces
//i.e. spaces, tabs, newlines, carriage return
layout Whitespace = [\ \t\n\r]*;

//Name
//upper or lowercase letters
lexical Name = [a-zA-Z]+ !>> [a-zA-Z] \ Keywords;

//Integer
//Similar to slide
lexical UnsignedInt = [0]|([1-9][0-9]*);
lexical SignedInt = [+\-]? UnsignedInt;
lexical Integer = UnsignedInt | SignedInt;

//Comment
//Start with a \# and end with a line breaker
layout Comment = "#" ![#]* $;
