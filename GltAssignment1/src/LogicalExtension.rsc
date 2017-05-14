module LogicalExtension

extend BaseGrammar;

//Unary and binary operators
lexical Not = "not";
lexical And = "and";
lexical Or = "or";
lexical Binaries = And
                |Or;
                
//Add not into logical Exps
syntax LogicalExpWithNot = LogicalExps
                        |Not OneSpace LogicalExps;
                     
//Add binaries into it   
syntax LogicalExpsExtended = LogicalExpWithNot
                            |LogicalExpWithNot OneSpace Binaries OneSpace LogicalExpWithNot;
                            
//Slightly modify if and while
syntax IfWithoutElse = If OneSpace LogicalExpsExtended OneSpace Do Whitespaces 
                            CommandStats Whitespaces End;   

syntax WhileStats = While OneSpace LogicalExpsExtended OneSpace Do Whitespaces
                    CommandStats Whitespaces End;