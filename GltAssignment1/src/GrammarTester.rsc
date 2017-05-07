module GrammarTester

import BaseGrammar;
import IO;

public void tests() {
    scriptLoc = |project://GltAssignment1/GrammarTestCases/TestCase1SimpleTest.txt|;
    script = readFile(scriptLoc);
    print(script);
    //print(scriptLoc);
}