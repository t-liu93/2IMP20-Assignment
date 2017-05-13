module BaseGrammar

//Just for testing
//Test if the console working
start syntax A = "a"; // it works

//Keywords
//i.e. if / else, do / end, while, repeat / times
//as well as Script, run as
keyword If = "if";
keyword Else = "else";
keyword Do = "do";
keyword End = "end";
keyword While = "while";
keyword Repeat = "repeat";
keyword Times = "times";
keyword Script = "Script";
keyword Runas = "runs as";
//The whole keywords set
keyword Keywords = If 
                |Else
                |Do
                |End
                |While
                |Repeat
                |Times
                |Script
                |Runas;
                
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
//Not sure whether in this case only unsigned int is needed or not
//According to our interpertation, only unsigned int is needed.
//Hence the 'repeat time' cannot be negative

//Comment
//Start with a \# and end with a line breaker
layout Comment = "#" ![#]* $;
