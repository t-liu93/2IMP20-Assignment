module BaseGrammar

//Just for testing
//Test if the console working
//start syntax A = "a"; // it works

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
layout OneSpace = [\ ];
layout NewLine = [\n];
layout Whitespaces = [\ \t\n\r]*;

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

//Message
//Used for trace
lexical Message = "\"" ![\"]+ "\"";

//Basic commands
//i.e. step, turn left, drop, pick and trace
lexical Step = "step";
lexical TurnLeft = "turnLeft";
lexical Drop = "drop";
lexical Pick = "pick";
lexical Trace = "trace";
lexical Commands = Step
                |TurnLeft
                |Drop
                |Pick
                |Trace;
                
//Logical expressions
//i.e. full, mark, wall ahead, heading
lexical Full = "full";
lexical Mark = "mark";
lexical WallAhead = "wall ahead";
lexical Heading = "heading";
lexical Logicals = Full
                |Mark
                |WallAhead
                |Heading;
                
//Directions
//i.e. south, north, west, east, followed by heading
lexical South = "south";
lexical North = "north";
lexical West = "west";
lexical East = "east";
lexical Directions = South
                    |North
                    |West
                    |East;
                   
//Sub programs, i.e. sub syntaxs
//Trace message, here we followed the description
//i.e. only one space follows keyword trace
syntax TraceMessage = Trace OneSpace Message;

//Have Command syntax
syntax CommandStats = Step
                    |TurnLeft
                    |Drop
                    |Pick
                    |TraceMessage;

//Heading direction
//only one space can follow heading
syntax HeadingDirection = Heading OneSpace Directions;

//Logical syntax
syntax LogicalExps = Full
                |Mark
                |WallAhead
                |HeadingDirection;
                
//Do statements
//I.e. statements between do and end
//Including a list of commands.
//Since the description does not say empty list is not allowed, we allow empty
//list between do and end here.
syntax DoStatements = ([CommandStats][Whitespaces])*;
