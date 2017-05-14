module LogicalExtension

extend BaseGrammar;

//Unary and binary operators
lexical Not = "not";
lexical And = "and";
lexical Or = "or";
lexical Binaries = And
                |Or;
                
//Add not into logical Exps
syntax LogicalExpNegative = Not OneSpace LogicalExps;
                     
//Add binaries into it   
syntax LogicalExpsExtended = LogicalExpNegative
                            |LogicalExpNegative OneSpace Binaries OneSpace LogicalExpNegative
                            |LogicalExps OneSpace Binaries OneSpace LogicalExpNegative
                            |LogicalExpNegative OneSpace Binaries OneSpace LogicalExps
                            |LogicalExps OneSpace Binaries OneSpace LogicalExps;
                            
//Slightly modify if and while
syntax IfWithoutElse = If OneSpace LogicalExpsExtended OneSpace Do Whitespaces 
                            CommandStats Whitespaces End;   

syntax WhileStats = While OneSpace LogicalExpsExtended OneSpace Do Whitespaces
                    CommandStats Whitespaces End;