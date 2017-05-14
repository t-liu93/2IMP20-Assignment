module Tests

import vis::ParseTree;
import vis::Figure;
import vis::Render;
import ParseTree;
import BaseGrammar;
import BuildSceneExtension;
import LogicalExtension;
import IO;

public void tests(loc location) {
    str script = readFile(location);
    
    println("Start parsing...");
    println(parse(#Program, script));
    
    println("Start building parse tree...");
    
    render(visParsetree(parse(#Program, script)));
}