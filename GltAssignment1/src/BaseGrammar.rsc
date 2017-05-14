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
keyword Runsas = "runs as";
//The whole keywords set
keyword Keywords = If 
                |Else
                |Do
                |End
                |While
                |Repeat
                |Times
                |Script
                |Runsas;
                
//Whitespaces
//i.e. spaces, tabs, newlines, carriage return
layout OneSpace = [\ ];
layout NewLine = [\n];
lexical Whitespace = [\ \t\n\r];
layout Whitespaces = Whitespace* !>> [\ \t\n\r];

//Comment
//Start with a \# and end with a line breaker
//Since comment is considered as comment, so it is not layout
lexical Comment = "#" ![\n]* [\n];

//Combined whitespace and comments
//lexical WhitespaceAndComment = Whitespace
//                            |Comment;
//layout WhitespaceAndComments = WhitespaceAndComment* !>> [\ \t\n\r];

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
                    |TraceMessage
                    |Comment
                    |Comment Whitespaces CommandStats
                    |Step Whitespaces CommandStats
                    |TurnLeft Whitespaces CommandStats
                    |Drop Whitespaces CommandStats
                    |Pick Whitespaces CommandStats
                    |TraceMessage Whitespaces CommandStats;

//Heading direction
//only one space can follow heading
syntax HeadingDirection = Heading OneSpace Directions;

//Logical syntax
syntax LogicalExps = Full
                |Mark
                |WallAhead
                |HeadingDirection;
                
//Conditional statements
//Note:
//According to my interpretation of the description
//The conditional or while statements' bodies contains all kinds of commands.
//i.e. basic commands and control flow commands
//So a loop in a loop is allowed in this grammar

//If without Else
syntax IfWithoutElse = If OneSpace LogicalExps OneSpace Do Whitespaces 
                            Statements Whitespaces End;                 
//If with else
syntax IfWithElse = IfWithoutElse Whitespaces
                    Else Do Whitespaces Statements Whitespaces End;
//Whole if
syntax IfStats = IfWithElse
                >IfWithoutElse;
                
//While statements
syntax WhileStats = While OneSpace LogicalExps OneSpace Do Whitespaces
                    Statements Whitespaces End;
                    
//Repeat statements
syntax RepeatStats = Repeat OneSpace UnsignedInt OneSpace Times Whitespaces
                        CommandStats Whitespaces End;
                        
//The collection of all statements
syntax Statements = CommandStats
                |IfStats
                |WhileStats
                |RepeatStats
                |CommandStats Whitespaces NonCommandStats
                |IfStats Whitespaces Statements
                |WhileStats Whitespaces Statements
                |RepeatStats Whitespaces Statements;
                
//CommandStats only go to non-command stats
syntax NonCommandStats = IfStats
                        |WhileStats
                        |RepeatStats
                        |IfStats Whitespaces Statements
                        |WhileStats Whitespaces Statements
                        |RepeatStats Whitespaces Statements;
                
 
                
//Main program
//Since the description does not mention whether an empty statement list is allowed
//Here we follow the description, i.e. allow empty list
start syntax Program = 
    program: Whitespaces Script OneSpace Name OneSpace Runsas Whitespaces 
                Statements* Whitespaces
                End Whitespaces;