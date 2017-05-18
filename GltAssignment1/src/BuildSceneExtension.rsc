/*
Author: Tianyu Liu 0937147
Xiayang Hao 0892474
*/
module BuildSceneExtension

extend BaseGrammar;

//4 extra commands
lexical BuildWall = "buildWall";
lexical DestroyWall = "destroyWall";
lexical DropMark = "dropMark";
lexical PickMark = "pickMark";
lexical At = "at";

//row and column
lexical Row = "row:";
lexical Column = "col:";

//Extended commands
//Positions
syntax Position = Row OneSpace UnsignedInt OneSpace Column OneSpace UnsignedInt;
//Modify scenes
syntax BuildWallStat = BuildWall OneSpace At OneSpace Position;
syntax DestroyWallStat = DestroyWall OneSpace At OneSpace Position;
syntax PickMarkStat = PickMark OneSpace At OneSpace Position;
syntax DropMarkStat = DropMark OneSpace At OneSpace Position;

//Whole build scene statements
syntax BuildScene = BuildWallStat
                    |DestroyWallStat
                    |PickMarkStat
                    |DropMarkStat;
                    
//These are command statements, add to commandStats
//syntax CommandStatsExtended = BuildScene
//                            |BuildScene Whitespaces CommandStatsExtended
//                            |BuildScene Whitespaces CommandStats
//                            |BuildScene Whitespaces NonCommandStats;

syntax NonCommandStats = BuildScene
                        |BuildScene Whitespaces Statements
                        |BuildScene Whitespaces NonCommandStats;
                            
//new statements
//modify it to suit CommandStatsExtended
//syntax Statements = CommandStatsExtended;