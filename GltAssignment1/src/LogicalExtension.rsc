module LogicalExtension

extend BaseGrammar;

//Unary and binary operators
lexical Not = "not";
lexical And = "and";
lexical Or = "or";
lexical Binaries = Not
                |And
                |Or;
                
