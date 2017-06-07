package glt.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRobotDSLLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NAME=8;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalRobotDSLLexer() {;} 
    public InternalRobotDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRobotDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRobotDSL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:11:7: ( 'south' )
            // InternalRobotDSL.g:11:9: 'south'
            {
            match("south"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:12:7: ( 'north' )
            // InternalRobotDSL.g:12:9: 'north'
            {
            match("north"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:13:7: ( 'west' )
            // InternalRobotDSL.g:13:9: 'west'
            {
            match("west"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:14:7: ( 'east' )
            // InternalRobotDSL.g:14:9: 'east'
            {
            match("east"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:15:7: ( 'Script' )
            // InternalRobotDSL.g:15:9: 'Script'
            {
            match("Script"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:16:7: ( 'runs' )
            // InternalRobotDSL.g:16:9: 'runs'
            {
            match("runs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:17:7: ( 'as' )
            // InternalRobotDSL.g:17:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:18:7: ( 'end' )
            // InternalRobotDSL.g:18:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:19:7: ( 'if' )
            // InternalRobotDSL.g:19:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:20:7: ( 'else' )
            // InternalRobotDSL.g:20:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:21:7: ( 'do' )
            // InternalRobotDSL.g:21:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:22:7: ( 'while' )
            // InternalRobotDSL.g:22:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:23:7: ( 'repeat' )
            // InternalRobotDSL.g:23:9: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:24:7: ( 'times' )
            // InternalRobotDSL.g:24:9: 'times'
            {
            match("times"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:25:7: ( 'step' )
            // InternalRobotDSL.g:25:9: 'step'
            {
            match("step"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:26:7: ( 'turnLeft' )
            // InternalRobotDSL.g:26:9: 'turnLeft'
            {
            match("turnLeft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:27:7: ( 'drop' )
            // InternalRobotDSL.g:27:9: 'drop'
            {
            match("drop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:28:7: ( 'pick' )
            // InternalRobotDSL.g:28:9: 'pick'
            {
            match("pick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:29:7: ( 'trace' )
            // InternalRobotDSL.g:29:9: 'trace'
            {
            match("trace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:30:7: ( '#' )
            // InternalRobotDSL.g:30:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:31:7: ( 'buildWall' )
            // InternalRobotDSL.g:31:9: 'buildWall'
            {
            match("buildWall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:32:7: ( 'at' )
            // InternalRobotDSL.g:32:9: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:33:7: ( 'row:' )
            // InternalRobotDSL.g:33:9: 'row:'
            {
            match("row:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:34:7: ( 'column:' )
            // InternalRobotDSL.g:34:9: 'column:'
            {
            match("column:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:35:7: ( 'PickMark' )
            // InternalRobotDSL.g:35:9: 'PickMark'
            {
            match("PickMark"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:36:7: ( '{' )
            // InternalRobotDSL.g:36:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:37:7: ( '}' )
            // InternalRobotDSL.g:37:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:38:7: ( 'row' )
            // InternalRobotDSL.g:38:9: 'row'
            {
            match("row"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:39:7: ( 'column' )
            // InternalRobotDSL.g:39:9: 'column'
            {
            match("column"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:40:7: ( 'DropMark' )
            // InternalRobotDSL.g:40:9: 'DropMark'
            {
            match("DropMark"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:41:7: ( 'BuildWall' )
            // InternalRobotDSL.g:41:9: 'BuildWall'
            {
            match("BuildWall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:42:7: ( 'Full' )
            // InternalRobotDSL.g:42:9: 'Full'
            {
            match("Full"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:43:7: ( 'not' )
            // InternalRobotDSL.g:43:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:44:7: ( 'Mark' )
            // InternalRobotDSL.g:44:9: 'Mark'
            {
            match("Mark"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:45:7: ( 'WallAhead' )
            // InternalRobotDSL.g:45:9: 'WallAhead'
            {
            match("WallAhead"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:46:7: ( 'Heading' )
            // InternalRobotDSL.g:46:9: 'Heading'
            {
            match("Heading"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:47:7: ( 'direction' )
            // InternalRobotDSL.g:47:9: 'direction'
            {
            match("direction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:48:7: ( 'SingleLogalExp' )
            // InternalRobotDSL.g:48:9: 'SingleLogalExp'
            {
            match("SingleLogalExp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:49:7: ( 'BinaryLogicalExp' )
            // InternalRobotDSL.g:49:9: 'BinaryLogicalExp'
            {
            match("BinaryLogicalExp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:50:7: ( 'binaries' )
            // InternalRobotDSL.g:50:9: 'binaries'
            {
            match("binaries"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:51:7: ( 'singlelogalexp' )
            // InternalRobotDSL.g:51:9: 'singlelogalexp'
            {
            match("singlelogalexp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:52:7: ( ',' )
            // InternalRobotDSL.g:52:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:53:7: ( 'Not' )
            // InternalRobotDSL.g:53:9: 'Not'
            {
            match("Not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:54:7: ( 'Binaries' )
            // InternalRobotDSL.g:54:9: 'Binaries'
            {
            match("Binaries"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:55:7: ( 'And' )
            // InternalRobotDSL.g:55:9: 'And'
            {
            match("And"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:56:7: ( 'Or' )
            // InternalRobotDSL.g:56:9: 'Or'
            {
            match("Or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:57:7: ( '-' )
            // InternalRobotDSL.g:57:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:5844:11: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // InternalRobotDSL.g:5844:13: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // InternalRobotDSL.g:5844:13: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRobotDSL.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:5846:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRobotDSL.g:5846:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRobotDSL.g:5846:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRobotDSL.g:5846:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRobotDSL.g:5846:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRobotDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:5848:10: ( ( '0' .. '9' )+ )
            // InternalRobotDSL.g:5848:12: ( '0' .. '9' )+
            {
            // InternalRobotDSL.g:5848:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRobotDSL.g:5848:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:5850:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRobotDSL.g:5850:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRobotDSL.g:5850:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRobotDSL.g:5850:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRobotDSL.g:5850:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRobotDSL.g:5850:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRobotDSL.g:5850:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:5850:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRobotDSL.g:5850:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRobotDSL.g:5850:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRobotDSL.g:5850:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:5852:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRobotDSL.g:5852:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRobotDSL.g:5852:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRobotDSL.g:5852:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:5854:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRobotDSL.g:5854:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRobotDSL.g:5854:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRobotDSL.g:5854:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalRobotDSL.g:5854:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRobotDSL.g:5854:41: ( '\\r' )? '\\n'
                    {
                    // InternalRobotDSL.g:5854:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRobotDSL.g:5854:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:5856:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRobotDSL.g:5856:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRobotDSL.g:5856:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRobotDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRobotDSL.g:5858:16: ( . )
            // InternalRobotDSL.g:5858:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRobotDSL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=55;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalRobotDSL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalRobotDSL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalRobotDSL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalRobotDSL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalRobotDSL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalRobotDSL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalRobotDSL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalRobotDSL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalRobotDSL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalRobotDSL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalRobotDSL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalRobotDSL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalRobotDSL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalRobotDSL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalRobotDSL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalRobotDSL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalRobotDSL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalRobotDSL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalRobotDSL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalRobotDSL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalRobotDSL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalRobotDSL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalRobotDSL.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalRobotDSL.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalRobotDSL.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalRobotDSL.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalRobotDSL.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalRobotDSL.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalRobotDSL.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalRobotDSL.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalRobotDSL.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalRobotDSL.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalRobotDSL.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalRobotDSL.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalRobotDSL.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalRobotDSL.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalRobotDSL.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalRobotDSL.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalRobotDSL.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalRobotDSL.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalRobotDSL.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalRobotDSL.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalRobotDSL.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalRobotDSL.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalRobotDSL.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalRobotDSL.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalRobotDSL.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalRobotDSL.g:1:292: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 49 :
                // InternalRobotDSL.g:1:302: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 50 :
                // InternalRobotDSL.g:1:310: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 51 :
                // InternalRobotDSL.g:1:319: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 52 :
                // InternalRobotDSL.g:1:331: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 53 :
                // InternalRobotDSL.g:1:347: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 54 :
                // InternalRobotDSL.g:1:363: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 55 :
                // InternalRobotDSL.g:1:371: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\13\51\1\uffff\3\51\2\uffff\6\51\1\uffff\3\51\1\uffff\1\51\1\45\2\uffff\3\45\2\uffff\3\51\1\uffff\1\51\1\uffff\13\51\1\150\1\151\1\152\1\153\6\51\1\uffff\4\51\2\uffff\7\51\1\uffff\2\51\1\177\6\uffff\4\51\1\u0084\3\51\1\u0088\5\51\1\u008f\4\uffff\21\51\1\u00a1\1\u00a2\1\uffff\1\51\1\u00a4\2\51\1\uffff\1\u00a7\1\51\1\u00a9\1\uffff\1\u00aa\2\51\1\u00ad\1\51\2\uffff\1\u00af\4\51\1\u00b4\7\51\1\u00bc\1\u00bd\2\51\2\uffff\1\u00c0\1\uffff\1\51\1\u00c2\1\uffff\1\u00c3\2\uffff\2\51\1\uffff\1\51\1\uffff\1\51\1\u00c8\1\51\1\u00ca\1\uffff\7\51\2\uffff\2\51\1\uffff\1\51\2\uffff\1\u00d6\1\51\1\u00d8\1\51\1\uffff\1\51\1\uffff\2\51\1\u00de\10\51\1\uffff\1\51\1\uffff\4\51\2\uffff\6\51\1\u00f2\3\51\1\u00f6\1\51\1\u00f8\1\u00f9\1\u00fa\2\51\1\u00fd\1\51\1\uffff\2\51\1\u0101\1\uffff\1\u0102\3\uffff\1\u0103\1\51\1\uffff\1\u0105\2\51\3\uffff\1\51\1\uffff\11\51\1\u0112\1\u0113\1\51\2\uffff\1\51\1\u0116\1\uffff";
    static final String DFA13_eofS =
        "\u0117\uffff";
    static final String DFA13_minS =
        "\1\0\13\60\1\uffff\3\60\2\uffff\6\60\1\uffff\3\60\1\uffff\1\60\1\101\2\uffff\2\0\1\52\2\uffff\3\60\1\uffff\1\60\1\uffff\25\60\1\uffff\4\60\2\uffff\7\60\1\uffff\3\60\6\uffff\17\60\4\uffff\23\60\1\uffff\4\60\1\uffff\3\60\1\uffff\5\60\2\uffff\21\60\2\uffff\1\60\1\uffff\2\60\1\uffff\1\60\2\uffff\2\60\1\uffff\1\60\1\uffff\4\60\1\uffff\7\60\2\uffff\2\60\1\uffff\1\60\2\uffff\4\60\1\uffff\1\60\1\uffff\13\60\1\uffff\1\60\1\uffff\4\60\2\uffff\23\60\1\uffff\3\60\1\uffff\1\60\3\uffff\2\60\1\uffff\3\60\3\uffff\1\60\1\uffff\14\60\2\uffff\2\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\13\172\1\uffff\3\172\2\uffff\6\172\1\uffff\3\172\1\uffff\2\172\2\uffff\2\uffff\1\57\2\uffff\3\172\1\uffff\1\172\1\uffff\25\172\1\uffff\4\172\2\uffff\7\172\1\uffff\3\172\6\uffff\17\172\4\uffff\23\172\1\uffff\4\172\1\uffff\3\172\1\uffff\5\172\2\uffff\21\172\2\uffff\1\172\1\uffff\2\172\1\uffff\1\172\2\uffff\2\172\1\uffff\1\172\1\uffff\4\172\1\uffff\7\172\2\uffff\2\172\1\uffff\1\172\2\uffff\4\172\1\uffff\1\172\1\uffff\13\172\1\uffff\1\172\1\uffff\4\172\2\uffff\23\172\1\uffff\3\172\1\uffff\1\172\3\uffff\2\172\1\uffff\3\172\3\uffff\1\172\1\uffff\14\172\2\uffff\2\172\1\uffff";
    static final String DFA13_acceptS =
        "\14\uffff\1\24\3\uffff\1\32\1\33\6\uffff\1\52\3\uffff\1\57\2\uffff\1\61\1\62\3\uffff\1\66\1\67\3\uffff\1\60\1\uffff\1\61\25\uffff\1\24\4\uffff\1\32\1\33\7\uffff\1\52\3\uffff\1\57\1\62\1\63\1\64\1\65\1\66\17\uffff\1\7\1\26\1\11\1\13\23\uffff\1\56\4\uffff\1\41\3\uffff\1\10\5\uffff\1\27\1\34\21\uffff\1\53\1\55\1\uffff\1\17\2\uffff\1\3\1\uffff\1\4\1\12\2\uffff\1\6\1\uffff\1\21\4\uffff\1\22\7\uffff\1\40\1\42\2\uffff\1\1\1\uffff\1\2\1\14\4\uffff\1\16\1\uffff\1\23\13\uffff\1\5\1\uffff\1\15\4\uffff\1\30\1\35\23\uffff\1\44\3\uffff\1\20\1\uffff\1\50\1\31\1\36\2\uffff\1\54\3\uffff\1\45\1\25\1\37\1\uffff\1\43\14\uffff\1\51\1\46\2\uffff\1\47";
    static final String DFA13_specialS =
        "\1\0\40\uffff\1\1\1\2\u00f4\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\45\1\41\1\14\3\45\1\42\4\45\1\30\1\34\1\45\1\43\12\40\7\45\1\32\1\23\1\35\1\22\1\35\1\24\1\35\1\27\4\35\1\25\1\31\1\33\1\17\2\35\1\5\3\35\1\26\3\35\3\45\1\36\1\37\1\45\1\7\1\15\1\16\1\11\1\4\3\35\1\10\4\35\1\2\1\35\1\13\1\35\1\6\1\1\1\12\2\35\1\3\3\35\1\20\1\45\1\21\uff82\45",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\50\5\52\1\46\4\52\1\47\6\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\16\52\1\54\13\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\55\2\52\1\56\22\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\57\12\52\1\61\1\52\1\60\14\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\2\52\1\62\5\52\1\63\21\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\65\11\52\1\66\5\52\1\64\5\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\22\52\1\67\1\70\6\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\5\52\1\71\24\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\74\5\52\1\72\2\52\1\73\10\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\75\10\52\1\77\2\52\1\76\5\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\100\21\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\103\13\52\1\102\5\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\16\52\1\104\13\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\105\21\52",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\21\52\1\110\10\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\112\13\52\1\111\5\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\24\52\1\113\5\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\114\31\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\115\31\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\116\25\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\16\52\1\120\13\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\121\14\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\21\52\1\122\10\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\0\125",
            "\0\125",
            "\1\126\4\uffff\1\127",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\24\52\1\131\5\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\132\25\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\133\14\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\21\52\1\134\1\52\1\135\6\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\22\52\1\136\7\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\137\21\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\22\52\1\140\7\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\3\52\1\141\26\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\22\52\1\142\7\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\21\52\1\143\10\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\144\14\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\145\14\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\17\52\1\146\12\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\26\52\1\147\3\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\16\52\1\154\13\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\21\52\1\155\10\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\14\52\1\156\15\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\21\52\1\157\10\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\160\31\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\2\52\1\161\27\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\162\21\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\163\14\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\164\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\2\52\1\165\27\52",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\16\52\1\166\13\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\167\21\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\170\14\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\171\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\21\52\1\172\10\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\173\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\174\31\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\23\52\1\175\6\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\3\52\1\176\26\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\23\52\1\u0080\6\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\17\52\1\u0081\12\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\6\52\1\u0082\23\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\23\52\1\u0083\6\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\23\52\1\u0085\6\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u0086\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\23\52\1\u0087\6\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\u0089\25\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\u008a\21\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\6\52\1\u008b\23\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\22\52\1\u008c\7\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\u008d\25\52",
            "\12\53\1\u008e\6\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\17\52\1\u0090\12\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\u0091\25\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\u0092\25\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\u0093\14\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\2\52\1\u0094\27\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\12\52\1\u0095\17\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u0096\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\u0097\31\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\24\52\1\u0098\5\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\12\52\1\u0099\17\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\17\52\1\u009a\12\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u009b\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\u009c\31\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u009d\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\12\52\1\u009e\17\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u009f\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\3\52\1\u00a0\26\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\7\52\1\u00a3\22\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u00a5\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\7\52\1\u00a6\22\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\u00a8\25\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\17\52\1\u00ab\12\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u00ac\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\u00ae\31\52",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\2\52\1\u00b0\27\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\22\52\1\u00b1\7\52",
            "\12\53\7\uffff\13\52\1\u00b2\16\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\u00b3\25\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\3\52\1\u00b5\26\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\21\52\1\u00b6\10\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\14\52\1\u00b7\15\52",
            "\12\53\7\uffff\14\52\1\u00b8\15\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\14\52\1\u00b9\15\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\3\52\1\u00ba\26\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\21\52\1\u00bb\10\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\1\u00be\31\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\u00bf\21\52",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\u00c1\25\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\23\52\1\u00c4\6\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\u00c5\25\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\23\52\1\u00c6\6\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\23\52\1\u00c7\6\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\u00c9\25\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "",
            "\12\53\7\uffff\26\52\1\u00cb\3\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\u00cc\21\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\u00cd\14\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\u00ce\31\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\u00cf\31\52",
            "\12\53\7\uffff\26\52\1\u00d0\3\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\u00d2\17\52\1\u00d1\1\52",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\7\52\1\u00d3\22\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\u00d4\14\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u00d5\16\52",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\13\52\1\u00d7\16\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\u00d9\21\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\5\52\1\u00da\24\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\u00db\31\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\u00dc\25\52",
            "\12\53\1\u00dd\6\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\21\52\1\u00df\10\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\21\52\1\u00e0\10\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\u00e1\31\52",
            "\12\53\7\uffff\13\52\1\u00e2\16\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\u00e3\25\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\u00e4\25\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\6\52\1\u00e5\23\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\16\52\1\u00e6\13\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\16\52\1\u00e7\13\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\16\52\1\u00e8\13\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\23\52\1\u00e9\6\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u00ea\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\22\52\1\u00eb\7\52",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\12\52\1\u00ec\17\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\12\52\1\u00ed\17\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u00ee\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\16\52\1\u00ef\13\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\22\52\1\u00f0\7\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\u00f1\31\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\6\52\1\u00f3\23\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\6\52\1\u00f4\23\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\u00f5\14\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u00f7\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u00fb\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\6\52\1\u00fc\23\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\3\52\1\u00fe\26\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\u00ff\31\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\u0100\31\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\u0104\21\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u0106\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u0107\16\52",
            "",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\2\52\1\u0108\27\52",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\u0109\25\52",
            "\12\53\7\uffff\4\52\1\u010a\25\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\1\u010b\31\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\27\52\1\u010c\2\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\27\52\1\u010d\2\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\u010e\16\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\17\52\1\u010f\12\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\17\52\1\u0110\12\52",
            "\12\53\7\uffff\4\52\1\u0111\25\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\27\52\1\u0114\2\52",
            "",
            "",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\17\52\1\u0115\12\52",
            "\12\53\7\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='s') ) {s = 1;}

                        else if ( (LA13_0=='n') ) {s = 2;}

                        else if ( (LA13_0=='w') ) {s = 3;}

                        else if ( (LA13_0=='e') ) {s = 4;}

                        else if ( (LA13_0=='S') ) {s = 5;}

                        else if ( (LA13_0=='r') ) {s = 6;}

                        else if ( (LA13_0=='a') ) {s = 7;}

                        else if ( (LA13_0=='i') ) {s = 8;}

                        else if ( (LA13_0=='d') ) {s = 9;}

                        else if ( (LA13_0=='t') ) {s = 10;}

                        else if ( (LA13_0=='p') ) {s = 11;}

                        else if ( (LA13_0=='#') ) {s = 12;}

                        else if ( (LA13_0=='b') ) {s = 13;}

                        else if ( (LA13_0=='c') ) {s = 14;}

                        else if ( (LA13_0=='P') ) {s = 15;}

                        else if ( (LA13_0=='{') ) {s = 16;}

                        else if ( (LA13_0=='}') ) {s = 17;}

                        else if ( (LA13_0=='D') ) {s = 18;}

                        else if ( (LA13_0=='B') ) {s = 19;}

                        else if ( (LA13_0=='F') ) {s = 20;}

                        else if ( (LA13_0=='M') ) {s = 21;}

                        else if ( (LA13_0=='W') ) {s = 22;}

                        else if ( (LA13_0=='H') ) {s = 23;}

                        else if ( (LA13_0==',') ) {s = 24;}

                        else if ( (LA13_0=='N') ) {s = 25;}

                        else if ( (LA13_0=='A') ) {s = 26;}

                        else if ( (LA13_0=='O') ) {s = 27;}

                        else if ( (LA13_0=='-') ) {s = 28;}

                        else if ( (LA13_0=='C'||LA13_0=='E'||LA13_0=='G'||(LA13_0>='I' && LA13_0<='L')||(LA13_0>='Q' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='V')||(LA13_0>='X' && LA13_0<='Z')||(LA13_0>='f' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='m')||LA13_0=='o'||LA13_0=='q'||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 29;}

                        else if ( (LA13_0=='^') ) {s = 30;}

                        else if ( (LA13_0=='_') ) {s = 31;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 32;}

                        else if ( (LA13_0=='\"') ) {s = 33;}

                        else if ( (LA13_0=='\'') ) {s = 34;}

                        else if ( (LA13_0=='/') ) {s = 35;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 36;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='$' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||LA13_0=='.'||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_33 = input.LA(1);

                        s = -1;
                        if ( ((LA13_33>='\u0000' && LA13_33<='\uFFFF')) ) {s = 85;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_34 = input.LA(1);

                        s = -1;
                        if ( ((LA13_34>='\u0000' && LA13_34<='\uFFFF')) ) {s = 85;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}