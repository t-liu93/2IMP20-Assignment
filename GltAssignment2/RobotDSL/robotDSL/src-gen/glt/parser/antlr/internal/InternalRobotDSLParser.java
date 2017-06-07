package glt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import glt.services.RobotDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRobotDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_COMMENTS", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Script'", "'runs'", "'as'", "'end'", "'if'", "'do'", "'else'", "'while'", "'repeat'", "'times'", "'step'", "'turnLeft'", "'drop'", "'pick'", "'trace'", "'destroyWall'", "'at'", "'row:'", "'col:'", "'pickMark'", "'dropMark'", "'buildWall'", "'full'", "'mark'", "'wall'", "'ahead'", "'heading'", "'not'", "'and'", "'or'", "'-'", "'south'", "'north'", "'west'", "'east'"
    };
    public static final int T__19=19;
    public static final int RULE_COMMENTS=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=8;
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
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=7;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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


        public InternalRobotDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRobotDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRobotDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRobotDSL.g"; }



     	private RobotDSLGrammarAccess grammarAccess;

        public InternalRobotDSLParser(TokenStream input, RobotDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Script";
       	}

       	@Override
       	protected RobotDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleScript"
    // InternalRobotDSL.g:65:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalRobotDSL.g:65:47: (iv_ruleScript= ruleScript EOF )
            // InternalRobotDSL.g:66:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalRobotDSL.g:72:1: ruleScript returns [EObject current=null] : ( () otherlv_1= 'Script' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= 'runs' otherlv_4= 'as' ( ( (lv_statements_5_0= ruleStatements ) ) ( (lv_statements_6_0= ruleStatements ) )* )? otherlv_7= 'end' ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_statements_5_0 = null;

        EObject lv_statements_6_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:78:2: ( ( () otherlv_1= 'Script' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= 'runs' otherlv_4= 'as' ( ( (lv_statements_5_0= ruleStatements ) ) ( (lv_statements_6_0= ruleStatements ) )* )? otherlv_7= 'end' ) )
            // InternalRobotDSL.g:79:2: ( () otherlv_1= 'Script' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= 'runs' otherlv_4= 'as' ( ( (lv_statements_5_0= ruleStatements ) ) ( (lv_statements_6_0= ruleStatements ) )* )? otherlv_7= 'end' )
            {
            // InternalRobotDSL.g:79:2: ( () otherlv_1= 'Script' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= 'runs' otherlv_4= 'as' ( ( (lv_statements_5_0= ruleStatements ) ) ( (lv_statements_6_0= ruleStatements ) )* )? otherlv_7= 'end' )
            // InternalRobotDSL.g:80:3: () otherlv_1= 'Script' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= 'runs' otherlv_4= 'as' ( ( (lv_statements_5_0= ruleStatements ) ) ( (lv_statements_6_0= ruleStatements ) )* )? otherlv_7= 'end'
            {
            // InternalRobotDSL.g:80:3: ()
            // InternalRobotDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScriptAccess().getScriptAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getScriptAccess().getScriptKeyword_1());
            		
            // InternalRobotDSL.g:91:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalRobotDSL.g:92:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalRobotDSL.g:92:4: (lv_name_2_0= RULE_NAME )
            // InternalRobotDSL.g:93:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getScriptAccess().getNameNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScriptRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"glt.RobotDSL.NAME");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getRunsKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getScriptAccess().getAsKeyword_4());
            		
            // InternalRobotDSL.g:117:3: ( ( (lv_statements_5_0= ruleStatements ) ) ( (lv_statements_6_0= ruleStatements ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_COMMENTS||LA2_0==17||(LA2_0>=20 && LA2_0<=21)||(LA2_0>=23 && LA2_0<=28)||(LA2_0>=32 && LA2_0<=34)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRobotDSL.g:118:4: ( (lv_statements_5_0= ruleStatements ) ) ( (lv_statements_6_0= ruleStatements ) )*
                    {
                    // InternalRobotDSL.g:118:4: ( (lv_statements_5_0= ruleStatements ) )
                    // InternalRobotDSL.g:119:5: (lv_statements_5_0= ruleStatements )
                    {
                    // InternalRobotDSL.g:119:5: (lv_statements_5_0= ruleStatements )
                    // InternalRobotDSL.g:120:6: lv_statements_5_0= ruleStatements
                    {

                    						newCompositeNode(grammarAccess.getScriptAccess().getStatementsStatementsParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_statements_5_0=ruleStatements();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScriptRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_5_0,
                    							"glt.RobotDSL.Statements");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDSL.g:137:4: ( (lv_statements_6_0= ruleStatements ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_COMMENTS||LA1_0==17||(LA1_0>=20 && LA1_0<=21)||(LA1_0>=23 && LA1_0<=28)||(LA1_0>=32 && LA1_0<=34)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRobotDSL.g:138:5: (lv_statements_6_0= ruleStatements )
                    	    {
                    	    // InternalRobotDSL.g:138:5: (lv_statements_6_0= ruleStatements )
                    	    // InternalRobotDSL.g:139:6: lv_statements_6_0= ruleStatements
                    	    {

                    	    						newCompositeNode(grammarAccess.getScriptAccess().getStatementsStatementsParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_statements_6_0=ruleStatements();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScriptRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"statements",
                    	    							lv_statements_6_0,
                    	    							"glt.RobotDSL.Statements");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getScriptAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleStatements"
    // InternalRobotDSL.g:165:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // InternalRobotDSL.g:165:51: (iv_ruleStatements= ruleStatements EOF )
            // InternalRobotDSL.g:166:2: iv_ruleStatements= ruleStatements EOF
            {
             newCompositeNode(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatements=ruleStatements();

            state._fsp--;

             current =iv_ruleStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalRobotDSL.g:172:1: ruleStatements returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Step_3= ruleStep | this_TurnLeft_4= ruleTurnLeft | this_Drop_5= ruleDrop | this_Pick_6= rulePick | this_TraceMessage_7= ruleTraceMessage | this_Comment_8= ruleComment | this_DestroyWall_9= ruleDestroyWall | this_PickMark_10= rulePickMark | this_DropMark_11= ruleDropMark | this_BuildWall_12= ruleBuildWall ) ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_WhileStatement_1 = null;

        EObject this_RepeatStatement_2 = null;

        EObject this_Step_3 = null;

        EObject this_TurnLeft_4 = null;

        EObject this_Drop_5 = null;

        EObject this_Pick_6 = null;

        EObject this_TraceMessage_7 = null;

        EObject this_Comment_8 = null;

        EObject this_DestroyWall_9 = null;

        EObject this_PickMark_10 = null;

        EObject this_DropMark_11 = null;

        EObject this_BuildWall_12 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:178:2: ( (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Step_3= ruleStep | this_TurnLeft_4= ruleTurnLeft | this_Drop_5= ruleDrop | this_Pick_6= rulePick | this_TraceMessage_7= ruleTraceMessage | this_Comment_8= ruleComment | this_DestroyWall_9= ruleDestroyWall | this_PickMark_10= rulePickMark | this_DropMark_11= ruleDropMark | this_BuildWall_12= ruleBuildWall ) )
            // InternalRobotDSL.g:179:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Step_3= ruleStep | this_TurnLeft_4= ruleTurnLeft | this_Drop_5= ruleDrop | this_Pick_6= rulePick | this_TraceMessage_7= ruleTraceMessage | this_Comment_8= ruleComment | this_DestroyWall_9= ruleDestroyWall | this_PickMark_10= rulePickMark | this_DropMark_11= ruleDropMark | this_BuildWall_12= ruleBuildWall )
            {
            // InternalRobotDSL.g:179:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Step_3= ruleStep | this_TurnLeft_4= ruleTurnLeft | this_Drop_5= ruleDrop | this_Pick_6= rulePick | this_TraceMessage_7= ruleTraceMessage | this_Comment_8= ruleComment | this_DestroyWall_9= ruleDestroyWall | this_PickMark_10= rulePickMark | this_DropMark_11= ruleDropMark | this_BuildWall_12= ruleBuildWall )
            int alt3=13;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            case 25:
                {
                alt3=6;
                }
                break;
            case 26:
                {
                alt3=7;
                }
                break;
            case 27:
                {
                alt3=8;
                }
                break;
            case RULE_COMMENTS:
                {
                alt3=9;
                }
                break;
            case 28:
                {
                alt3=10;
                }
                break;
            case 32:
                {
                alt3=11;
                }
                break;
            case 33:
                {
                alt3=12;
                }
                break;
            case 34:
                {
                alt3=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRobotDSL.g:180:3: this_IfStatement_0= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getIfStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_0=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:189:3: this_WhileStatement_1= ruleWhileStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getWhileStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_1=ruleWhileStatement();

                    state._fsp--;


                    			current = this_WhileStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:198:3: this_RepeatStatement_2= ruleRepeatStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getRepeatStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RepeatStatement_2=ruleRepeatStatement();

                    state._fsp--;


                    			current = this_RepeatStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:207:3: this_Step_3= ruleStep
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getStepParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Step_3=ruleStep();

                    state._fsp--;


                    			current = this_Step_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:216:3: this_TurnLeft_4= ruleTurnLeft
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getTurnLeftParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnLeft_4=ruleTurnLeft();

                    state._fsp--;


                    			current = this_TurnLeft_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRobotDSL.g:225:3: this_Drop_5= ruleDrop
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getDropParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Drop_5=ruleDrop();

                    state._fsp--;


                    			current = this_Drop_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRobotDSL.g:234:3: this_Pick_6= rulePick
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getPickParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pick_6=rulePick();

                    state._fsp--;


                    			current = this_Pick_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRobotDSL.g:243:3: this_TraceMessage_7= ruleTraceMessage
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getTraceMessageParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_TraceMessage_7=ruleTraceMessage();

                    state._fsp--;


                    			current = this_TraceMessage_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRobotDSL.g:252:3: this_Comment_8= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getCommentParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_8=ruleComment();

                    state._fsp--;


                    			current = this_Comment_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRobotDSL.g:261:3: this_DestroyWall_9= ruleDestroyWall
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getDestroyWallParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_DestroyWall_9=ruleDestroyWall();

                    state._fsp--;


                    			current = this_DestroyWall_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalRobotDSL.g:270:3: this_PickMark_10= rulePickMark
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getPickMarkParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_PickMark_10=rulePickMark();

                    state._fsp--;


                    			current = this_PickMark_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalRobotDSL.g:279:3: this_DropMark_11= ruleDropMark
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getDropMarkParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropMark_11=ruleDropMark();

                    state._fsp--;


                    			current = this_DropMark_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalRobotDSL.g:288:3: this_BuildWall_12= ruleBuildWall
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getBuildWallParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_BuildWall_12=ruleBuildWall();

                    state._fsp--;


                    			current = this_BuildWall_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleLogicalExps"
    // InternalRobotDSL.g:300:1: entryRuleLogicalExps returns [EObject current=null] : iv_ruleLogicalExps= ruleLogicalExps EOF ;
    public final EObject entryRuleLogicalExps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExps = null;


        try {
            // InternalRobotDSL.g:300:52: (iv_ruleLogicalExps= ruleLogicalExps EOF )
            // InternalRobotDSL.g:301:2: iv_ruleLogicalExps= ruleLogicalExps EOF
            {
             newCompositeNode(grammarAccess.getLogicalExpsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalExps=ruleLogicalExps();

            state._fsp--;

             current =iv_ruleLogicalExps; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalExps"


    // $ANTLR start "ruleLogicalExps"
    // InternalRobotDSL.g:307:1: ruleLogicalExps returns [EObject current=null] : (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_WallAhead_2= ruleWallAhead | this_Heading_3= ruleHeading | this_BinaryLogicalExp_4= ruleBinaryLogicalExp ) ;
    public final EObject ruleLogicalExps() throws RecognitionException {
        EObject current = null;

        EObject this_Full_0 = null;

        EObject this_Mark_1 = null;

        EObject this_WallAhead_2 = null;

        EObject this_Heading_3 = null;

        EObject this_BinaryLogicalExp_4 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:313:2: ( (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_WallAhead_2= ruleWallAhead | this_Heading_3= ruleHeading | this_BinaryLogicalExp_4= ruleBinaryLogicalExp ) )
            // InternalRobotDSL.g:314:2: (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_WallAhead_2= ruleWallAhead | this_Heading_3= ruleHeading | this_BinaryLogicalExp_4= ruleBinaryLogicalExp )
            {
            // InternalRobotDSL.g:314:2: (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_WallAhead_2= ruleWallAhead | this_Heading_3= ruleHeading | this_BinaryLogicalExp_4= ruleBinaryLogicalExp )
            int alt4=5;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalRobotDSL.g:315:3: this_Full_0= ruleFull
                    {

                    			newCompositeNode(grammarAccess.getLogicalExpsAccess().getFullParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Full_0=ruleFull();

                    state._fsp--;


                    			current = this_Full_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:324:3: this_Mark_1= ruleMark
                    {

                    			newCompositeNode(grammarAccess.getLogicalExpsAccess().getMarkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mark_1=ruleMark();

                    state._fsp--;


                    			current = this_Mark_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:333:3: this_WallAhead_2= ruleWallAhead
                    {

                    			newCompositeNode(grammarAccess.getLogicalExpsAccess().getWallAheadParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WallAhead_2=ruleWallAhead();

                    state._fsp--;


                    			current = this_WallAhead_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:342:3: this_Heading_3= ruleHeading
                    {

                    			newCompositeNode(grammarAccess.getLogicalExpsAccess().getHeadingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Heading_3=ruleHeading();

                    state._fsp--;


                    			current = this_Heading_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:351:3: this_BinaryLogicalExp_4= ruleBinaryLogicalExp
                    {

                    			newCompositeNode(grammarAccess.getLogicalExpsAccess().getBinaryLogicalExpParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryLogicalExp_4=ruleBinaryLogicalExp();

                    state._fsp--;


                    			current = this_BinaryLogicalExp_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalExps"


    // $ANTLR start "entryRuleRunningStatements"
    // InternalRobotDSL.g:363:1: entryRuleRunningStatements returns [EObject current=null] : iv_ruleRunningStatements= ruleRunningStatements EOF ;
    public final EObject entryRuleRunningStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunningStatements = null;


        try {
            // InternalRobotDSL.g:363:58: (iv_ruleRunningStatements= ruleRunningStatements EOF )
            // InternalRobotDSL.g:364:2: iv_ruleRunningStatements= ruleRunningStatements EOF
            {
             newCompositeNode(grammarAccess.getRunningStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunningStatements=ruleRunningStatements();

            state._fsp--;

             current =iv_ruleRunningStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRunningStatements"


    // $ANTLR start "ruleRunningStatements"
    // InternalRobotDSL.g:370:1: ruleRunningStatements returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Step_3= ruleStep | this_TurnLeft_4= ruleTurnLeft | this_Drop_5= ruleDrop | this_Pick_6= rulePick | this_TraceMessage_7= ruleTraceMessage | this_Comment_8= ruleComment ) ;
    public final EObject ruleRunningStatements() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_WhileStatement_1 = null;

        EObject this_RepeatStatement_2 = null;

        EObject this_Step_3 = null;

        EObject this_TurnLeft_4 = null;

        EObject this_Drop_5 = null;

        EObject this_Pick_6 = null;

        EObject this_TraceMessage_7 = null;

        EObject this_Comment_8 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:376:2: ( (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Step_3= ruleStep | this_TurnLeft_4= ruleTurnLeft | this_Drop_5= ruleDrop | this_Pick_6= rulePick | this_TraceMessage_7= ruleTraceMessage | this_Comment_8= ruleComment ) )
            // InternalRobotDSL.g:377:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Step_3= ruleStep | this_TurnLeft_4= ruleTurnLeft | this_Drop_5= ruleDrop | this_Pick_6= rulePick | this_TraceMessage_7= ruleTraceMessage | this_Comment_8= ruleComment )
            {
            // InternalRobotDSL.g:377:2: (this_IfStatement_0= ruleIfStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement | this_Step_3= ruleStep | this_TurnLeft_4= ruleTurnLeft | this_Drop_5= ruleDrop | this_Pick_6= rulePick | this_TraceMessage_7= ruleTraceMessage | this_Comment_8= ruleComment )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 25:
                {
                alt5=6;
                }
                break;
            case 26:
                {
                alt5=7;
                }
                break;
            case 27:
                {
                alt5=8;
                }
                break;
            case RULE_COMMENTS:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRobotDSL.g:378:3: this_IfStatement_0= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getRunningStatementsAccess().getIfStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_0=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:387:3: this_WhileStatement_1= ruleWhileStatement
                    {

                    			newCompositeNode(grammarAccess.getRunningStatementsAccess().getWhileStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_1=ruleWhileStatement();

                    state._fsp--;


                    			current = this_WhileStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:396:3: this_RepeatStatement_2= ruleRepeatStatement
                    {

                    			newCompositeNode(grammarAccess.getRunningStatementsAccess().getRepeatStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RepeatStatement_2=ruleRepeatStatement();

                    state._fsp--;


                    			current = this_RepeatStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:405:3: this_Step_3= ruleStep
                    {

                    			newCompositeNode(grammarAccess.getRunningStatementsAccess().getStepParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Step_3=ruleStep();

                    state._fsp--;


                    			current = this_Step_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:414:3: this_TurnLeft_4= ruleTurnLeft
                    {

                    			newCompositeNode(grammarAccess.getRunningStatementsAccess().getTurnLeftParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnLeft_4=ruleTurnLeft();

                    state._fsp--;


                    			current = this_TurnLeft_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRobotDSL.g:423:3: this_Drop_5= ruleDrop
                    {

                    			newCompositeNode(grammarAccess.getRunningStatementsAccess().getDropParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Drop_5=ruleDrop();

                    state._fsp--;


                    			current = this_Drop_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRobotDSL.g:432:3: this_Pick_6= rulePick
                    {

                    			newCompositeNode(grammarAccess.getRunningStatementsAccess().getPickParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pick_6=rulePick();

                    state._fsp--;


                    			current = this_Pick_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRobotDSL.g:441:3: this_TraceMessage_7= ruleTraceMessage
                    {

                    			newCompositeNode(grammarAccess.getRunningStatementsAccess().getTraceMessageParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_TraceMessage_7=ruleTraceMessage();

                    state._fsp--;


                    			current = this_TraceMessage_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRobotDSL.g:450:3: this_Comment_8= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getRunningStatementsAccess().getCommentParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_8=ruleComment();

                    state._fsp--;


                    			current = this_Comment_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRunningStatements"


    // $ANTLR start "entryRuleCommandStatement"
    // InternalRobotDSL.g:462:1: entryRuleCommandStatement returns [EObject current=null] : iv_ruleCommandStatement= ruleCommandStatement EOF ;
    public final EObject entryRuleCommandStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandStatement = null;


        try {
            // InternalRobotDSL.g:462:57: (iv_ruleCommandStatement= ruleCommandStatement EOF )
            // InternalRobotDSL.g:463:2: iv_ruleCommandStatement= ruleCommandStatement EOF
            {
             newCompositeNode(grammarAccess.getCommandStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandStatement=ruleCommandStatement();

            state._fsp--;

             current =iv_ruleCommandStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandStatement"


    // $ANTLR start "ruleCommandStatement"
    // InternalRobotDSL.g:469:1: ruleCommandStatement returns [EObject current=null] : (this_Step_0= ruleStep | this_TurnLeft_1= ruleTurnLeft | this_Drop_2= ruleDrop | this_Pick_3= rulePick | this_TraceMessage_4= ruleTraceMessage | this_Comment_5= ruleComment ) ;
    public final EObject ruleCommandStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Step_0 = null;

        EObject this_TurnLeft_1 = null;

        EObject this_Drop_2 = null;

        EObject this_Pick_3 = null;

        EObject this_TraceMessage_4 = null;

        EObject this_Comment_5 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:475:2: ( (this_Step_0= ruleStep | this_TurnLeft_1= ruleTurnLeft | this_Drop_2= ruleDrop | this_Pick_3= rulePick | this_TraceMessage_4= ruleTraceMessage | this_Comment_5= ruleComment ) )
            // InternalRobotDSL.g:476:2: (this_Step_0= ruleStep | this_TurnLeft_1= ruleTurnLeft | this_Drop_2= ruleDrop | this_Pick_3= rulePick | this_TraceMessage_4= ruleTraceMessage | this_Comment_5= ruleComment )
            {
            // InternalRobotDSL.g:476:2: (this_Step_0= ruleStep | this_TurnLeft_1= ruleTurnLeft | this_Drop_2= ruleDrop | this_Pick_3= rulePick | this_TraceMessage_4= ruleTraceMessage | this_Comment_5= ruleComment )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            case 27:
                {
                alt6=5;
                }
                break;
            case RULE_COMMENTS:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRobotDSL.g:477:3: this_Step_0= ruleStep
                    {

                    			newCompositeNode(grammarAccess.getCommandStatementAccess().getStepParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Step_0=ruleStep();

                    state._fsp--;


                    			current = this_Step_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:486:3: this_TurnLeft_1= ruleTurnLeft
                    {

                    			newCompositeNode(grammarAccess.getCommandStatementAccess().getTurnLeftParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnLeft_1=ruleTurnLeft();

                    state._fsp--;


                    			current = this_TurnLeft_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:495:3: this_Drop_2= ruleDrop
                    {

                    			newCompositeNode(grammarAccess.getCommandStatementAccess().getDropParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Drop_2=ruleDrop();

                    state._fsp--;


                    			current = this_Drop_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:504:3: this_Pick_3= rulePick
                    {

                    			newCompositeNode(grammarAccess.getCommandStatementAccess().getPickParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pick_3=rulePick();

                    state._fsp--;


                    			current = this_Pick_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:513:3: this_TraceMessage_4= ruleTraceMessage
                    {

                    			newCompositeNode(grammarAccess.getCommandStatementAccess().getTraceMessageParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TraceMessage_4=ruleTraceMessage();

                    state._fsp--;


                    			current = this_TraceMessage_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRobotDSL.g:522:3: this_Comment_5= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getCommandStatementAccess().getCommentParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_5=ruleComment();

                    state._fsp--;


                    			current = this_Comment_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandStatement"


    // $ANTLR start "entryRuleBinaries"
    // InternalRobotDSL.g:534:1: entryRuleBinaries returns [EObject current=null] : iv_ruleBinaries= ruleBinaries EOF ;
    public final EObject entryRuleBinaries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaries = null;


        try {
            // InternalRobotDSL.g:534:49: (iv_ruleBinaries= ruleBinaries EOF )
            // InternalRobotDSL.g:535:2: iv_ruleBinaries= ruleBinaries EOF
            {
             newCompositeNode(grammarAccess.getBinariesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaries=ruleBinaries();

            state._fsp--;

             current =iv_ruleBinaries; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaries"


    // $ANTLR start "ruleBinaries"
    // InternalRobotDSL.g:541:1: ruleBinaries returns [EObject current=null] : (this_And_0= ruleAnd | this_Or_1= ruleOr ) ;
    public final EObject ruleBinaries() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_Or_1 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:547:2: ( (this_And_0= ruleAnd | this_Or_1= ruleOr ) )
            // InternalRobotDSL.g:548:2: (this_And_0= ruleAnd | this_Or_1= ruleOr )
            {
            // InternalRobotDSL.g:548:2: (this_And_0= ruleAnd | this_Or_1= ruleOr )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==41) ) {
                alt7=1;
            }
            else if ( (LA7_0==42) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRobotDSL.g:549:3: this_And_0= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getBinariesAccess().getAndParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_0=ruleAnd();

                    state._fsp--;


                    			current = this_And_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:558:3: this_Or_1= ruleOr
                    {

                    			newCompositeNode(grammarAccess.getBinariesAccess().getOrParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Or_1=ruleOr();

                    state._fsp--;


                    			current = this_Or_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaries"


    // $ANTLR start "entryRuleSingleLogalExp"
    // InternalRobotDSL.g:570:1: entryRuleSingleLogalExp returns [EObject current=null] : iv_ruleSingleLogalExp= ruleSingleLogalExp EOF ;
    public final EObject entryRuleSingleLogalExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleLogalExp = null;


        try {
            // InternalRobotDSL.g:570:55: (iv_ruleSingleLogalExp= ruleSingleLogalExp EOF )
            // InternalRobotDSL.g:571:2: iv_ruleSingleLogalExp= ruleSingleLogalExp EOF
            {
             newCompositeNode(grammarAccess.getSingleLogalExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleLogalExp=ruleSingleLogalExp();

            state._fsp--;

             current =iv_ruleSingleLogalExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleLogalExp"


    // $ANTLR start "ruleSingleLogalExp"
    // InternalRobotDSL.g:577:1: ruleSingleLogalExp returns [EObject current=null] : (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_WallAhead_2= ruleWallAhead | this_Heading_3= ruleHeading ) ;
    public final EObject ruleSingleLogalExp() throws RecognitionException {
        EObject current = null;

        EObject this_Full_0 = null;

        EObject this_Mark_1 = null;

        EObject this_WallAhead_2 = null;

        EObject this_Heading_3 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:583:2: ( (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_WallAhead_2= ruleWallAhead | this_Heading_3= ruleHeading ) )
            // InternalRobotDSL.g:584:2: (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_WallAhead_2= ruleWallAhead | this_Heading_3= ruleHeading )
            {
            // InternalRobotDSL.g:584:2: (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_WallAhead_2= ruleWallAhead | this_Heading_3= ruleHeading )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt8=2;
                    }
                    break;
                case 39:
                    {
                    alt8=4;
                    }
                    break;
                case 37:
                    {
                    alt8=3;
                    }
                    break;
                case 35:
                    {
                    alt8=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

                }
                break;
            case 35:
                {
                alt8=1;
                }
                break;
            case 36:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            case 39:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRobotDSL.g:585:3: this_Full_0= ruleFull
                    {

                    			newCompositeNode(grammarAccess.getSingleLogalExpAccess().getFullParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Full_0=ruleFull();

                    state._fsp--;


                    			current = this_Full_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:594:3: this_Mark_1= ruleMark
                    {

                    			newCompositeNode(grammarAccess.getSingleLogalExpAccess().getMarkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mark_1=ruleMark();

                    state._fsp--;


                    			current = this_Mark_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:603:3: this_WallAhead_2= ruleWallAhead
                    {

                    			newCompositeNode(grammarAccess.getSingleLogalExpAccess().getWallAheadParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WallAhead_2=ruleWallAhead();

                    state._fsp--;


                    			current = this_WallAhead_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:612:3: this_Heading_3= ruleHeading
                    {

                    			newCompositeNode(grammarAccess.getSingleLogalExpAccess().getHeadingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Heading_3=ruleHeading();

                    state._fsp--;


                    			current = this_Heading_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleLogalExp"


    // $ANTLR start "entryRuleIfStatement"
    // InternalRobotDSL.g:624:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalRobotDSL.g:624:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalRobotDSL.g:625:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalRobotDSL.g:631:1: ruleIfStatement returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_logicalexps_2_0= ruleLogicalExps ) ) otherlv_3= 'do' ( ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )* )? otherlv_6= 'end' (otherlv_7= 'else' otherlv_8= 'do' ( ( (lv_runningstatements_9_0= ruleRunningStatements ) ) ( (lv_runningstatements_10_0= ruleRunningStatements ) )* )? otherlv_11= 'end' )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_logicalexps_2_0 = null;

        EObject lv_runningstatements_4_0 = null;

        EObject lv_runningstatements_5_0 = null;

        EObject lv_runningstatements_9_0 = null;

        EObject lv_runningstatements_10_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:637:2: ( ( () otherlv_1= 'if' ( (lv_logicalexps_2_0= ruleLogicalExps ) ) otherlv_3= 'do' ( ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )* )? otherlv_6= 'end' (otherlv_7= 'else' otherlv_8= 'do' ( ( (lv_runningstatements_9_0= ruleRunningStatements ) ) ( (lv_runningstatements_10_0= ruleRunningStatements ) )* )? otherlv_11= 'end' )? ) )
            // InternalRobotDSL.g:638:2: ( () otherlv_1= 'if' ( (lv_logicalexps_2_0= ruleLogicalExps ) ) otherlv_3= 'do' ( ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )* )? otherlv_6= 'end' (otherlv_7= 'else' otherlv_8= 'do' ( ( (lv_runningstatements_9_0= ruleRunningStatements ) ) ( (lv_runningstatements_10_0= ruleRunningStatements ) )* )? otherlv_11= 'end' )? )
            {
            // InternalRobotDSL.g:638:2: ( () otherlv_1= 'if' ( (lv_logicalexps_2_0= ruleLogicalExps ) ) otherlv_3= 'do' ( ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )* )? otherlv_6= 'end' (otherlv_7= 'else' otherlv_8= 'do' ( ( (lv_runningstatements_9_0= ruleRunningStatements ) ) ( (lv_runningstatements_10_0= ruleRunningStatements ) )* )? otherlv_11= 'end' )? )
            // InternalRobotDSL.g:639:3: () otherlv_1= 'if' ( (lv_logicalexps_2_0= ruleLogicalExps ) ) otherlv_3= 'do' ( ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )* )? otherlv_6= 'end' (otherlv_7= 'else' otherlv_8= 'do' ( ( (lv_runningstatements_9_0= ruleRunningStatements ) ) ( (lv_runningstatements_10_0= ruleRunningStatements ) )* )? otherlv_11= 'end' )?
            {
            // InternalRobotDSL.g:639:3: ()
            // InternalRobotDSL.g:640:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfStatementAccess().getIfStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getIfKeyword_1());
            		
            // InternalRobotDSL.g:650:3: ( (lv_logicalexps_2_0= ruleLogicalExps ) )
            // InternalRobotDSL.g:651:4: (lv_logicalexps_2_0= ruleLogicalExps )
            {
            // InternalRobotDSL.g:651:4: (lv_logicalexps_2_0= ruleLogicalExps )
            // InternalRobotDSL.g:652:5: lv_logicalexps_2_0= ruleLogicalExps
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getLogicalexpsLogicalExpsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_logicalexps_2_0=ruleLogicalExps();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"logicalexps",
            						lv_logicalexps_2_0,
            						"glt.RobotDSL.LogicalExps");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getDoKeyword_3());
            		
            // InternalRobotDSL.g:673:3: ( ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_COMMENTS||LA10_0==17||(LA10_0>=20 && LA10_0<=21)||(LA10_0>=23 && LA10_0<=27)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRobotDSL.g:674:4: ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )*
                    {
                    // InternalRobotDSL.g:674:4: ( (lv_runningstatements_4_0= ruleRunningStatements ) )
                    // InternalRobotDSL.g:675:5: (lv_runningstatements_4_0= ruleRunningStatements )
                    {
                    // InternalRobotDSL.g:675:5: (lv_runningstatements_4_0= ruleRunningStatements )
                    // InternalRobotDSL.g:676:6: lv_runningstatements_4_0= ruleRunningStatements
                    {

                    						newCompositeNode(grammarAccess.getIfStatementAccess().getRunningstatementsRunningStatementsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_runningstatements_4_0=ruleRunningStatements();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    						}
                    						add(
                    							current,
                    							"runningstatements",
                    							lv_runningstatements_4_0,
                    							"glt.RobotDSL.RunningStatements");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDSL.g:693:4: ( (lv_runningstatements_5_0= ruleRunningStatements ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_COMMENTS||LA9_0==17||(LA9_0>=20 && LA9_0<=21)||(LA9_0>=23 && LA9_0<=27)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRobotDSL.g:694:5: (lv_runningstatements_5_0= ruleRunningStatements )
                    	    {
                    	    // InternalRobotDSL.g:694:5: (lv_runningstatements_5_0= ruleRunningStatements )
                    	    // InternalRobotDSL.g:695:6: lv_runningstatements_5_0= ruleRunningStatements
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfStatementAccess().getRunningstatementsRunningStatementsParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_runningstatements_5_0=ruleRunningStatements();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"runningstatements",
                    	    							lv_runningstatements_5_0,
                    	    							"glt.RobotDSL.RunningStatements");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getEndKeyword_5());
            		
            // InternalRobotDSL.g:717:3: (otherlv_7= 'else' otherlv_8= 'do' ( ( (lv_runningstatements_9_0= ruleRunningStatements ) ) ( (lv_runningstatements_10_0= ruleRunningStatements ) )* )? otherlv_11= 'end' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRobotDSL.g:718:4: otherlv_7= 'else' otherlv_8= 'do' ( ( (lv_runningstatements_9_0= ruleRunningStatements ) ) ( (lv_runningstatements_10_0= ruleRunningStatements ) )* )? otherlv_11= 'end'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getIfStatementAccess().getElseKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getDoKeyword_6_1());
                    			
                    // InternalRobotDSL.g:726:4: ( ( (lv_runningstatements_9_0= ruleRunningStatements ) ) ( (lv_runningstatements_10_0= ruleRunningStatements ) )* )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_COMMENTS||LA12_0==17||(LA12_0>=20 && LA12_0<=21)||(LA12_0>=23 && LA12_0<=27)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalRobotDSL.g:727:5: ( (lv_runningstatements_9_0= ruleRunningStatements ) ) ( (lv_runningstatements_10_0= ruleRunningStatements ) )*
                            {
                            // InternalRobotDSL.g:727:5: ( (lv_runningstatements_9_0= ruleRunningStatements ) )
                            // InternalRobotDSL.g:728:6: (lv_runningstatements_9_0= ruleRunningStatements )
                            {
                            // InternalRobotDSL.g:728:6: (lv_runningstatements_9_0= ruleRunningStatements )
                            // InternalRobotDSL.g:729:7: lv_runningstatements_9_0= ruleRunningStatements
                            {

                            							newCompositeNode(grammarAccess.getIfStatementAccess().getRunningstatementsRunningStatementsParserRuleCall_6_2_0_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_runningstatements_9_0=ruleRunningStatements();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getIfStatementRule());
                            							}
                            							add(
                            								current,
                            								"runningstatements",
                            								lv_runningstatements_9_0,
                            								"glt.RobotDSL.RunningStatements");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRobotDSL.g:746:5: ( (lv_runningstatements_10_0= ruleRunningStatements ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==RULE_COMMENTS||LA11_0==17||(LA11_0>=20 && LA11_0<=21)||(LA11_0>=23 && LA11_0<=27)) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // InternalRobotDSL.g:747:6: (lv_runningstatements_10_0= ruleRunningStatements )
                            	    {
                            	    // InternalRobotDSL.g:747:6: (lv_runningstatements_10_0= ruleRunningStatements )
                            	    // InternalRobotDSL.g:748:7: lv_runningstatements_10_0= ruleRunningStatements
                            	    {

                            	    							newCompositeNode(grammarAccess.getIfStatementAccess().getRunningstatementsRunningStatementsParserRuleCall_6_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_9);
                            	    lv_runningstatements_10_0=ruleRunningStatements();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getIfStatementRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"runningstatements",
                            	    								lv_runningstatements_10_0,
                            	    								"glt.RobotDSL.RunningStatements");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop11;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getIfStatementAccess().getEndKeyword_6_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalRobotDSL.g:775:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalRobotDSL.g:775:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalRobotDSL.g:776:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
             newCompositeNode(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;

             current =iv_ruleWhileStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalRobotDSL.g:782:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' ( (lv_logicalexps_2_0= ruleLogicalExps ) ) otherlv_3= 'do' ( ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )* )? otherlv_6= 'end' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_logicalexps_2_0 = null;

        EObject lv_runningstatements_4_0 = null;

        EObject lv_runningstatements_5_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:788:2: ( ( () otherlv_1= 'while' ( (lv_logicalexps_2_0= ruleLogicalExps ) ) otherlv_3= 'do' ( ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )* )? otherlv_6= 'end' ) )
            // InternalRobotDSL.g:789:2: ( () otherlv_1= 'while' ( (lv_logicalexps_2_0= ruleLogicalExps ) ) otherlv_3= 'do' ( ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )* )? otherlv_6= 'end' )
            {
            // InternalRobotDSL.g:789:2: ( () otherlv_1= 'while' ( (lv_logicalexps_2_0= ruleLogicalExps ) ) otherlv_3= 'do' ( ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )* )? otherlv_6= 'end' )
            // InternalRobotDSL.g:790:3: () otherlv_1= 'while' ( (lv_logicalexps_2_0= ruleLogicalExps ) ) otherlv_3= 'do' ( ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )* )? otherlv_6= 'end'
            {
            // InternalRobotDSL.g:790:3: ()
            // InternalRobotDSL.g:791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileStatementAccess().getWhileStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
            		
            // InternalRobotDSL.g:801:3: ( (lv_logicalexps_2_0= ruleLogicalExps ) )
            // InternalRobotDSL.g:802:4: (lv_logicalexps_2_0= ruleLogicalExps )
            {
            // InternalRobotDSL.g:802:4: (lv_logicalexps_2_0= ruleLogicalExps )
            // InternalRobotDSL.g:803:5: lv_logicalexps_2_0= ruleLogicalExps
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getLogicalexpsLogicalExpsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_logicalexps_2_0=ruleLogicalExps();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"logicalexps",
            						lv_logicalexps_2_0,
            						"glt.RobotDSL.LogicalExps");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getDoKeyword_3());
            		
            // InternalRobotDSL.g:824:3: ( ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_COMMENTS||LA15_0==17||(LA15_0>=20 && LA15_0<=21)||(LA15_0>=23 && LA15_0<=27)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRobotDSL.g:825:4: ( (lv_runningstatements_4_0= ruleRunningStatements ) ) ( (lv_runningstatements_5_0= ruleRunningStatements ) )*
                    {
                    // InternalRobotDSL.g:825:4: ( (lv_runningstatements_4_0= ruleRunningStatements ) )
                    // InternalRobotDSL.g:826:5: (lv_runningstatements_4_0= ruleRunningStatements )
                    {
                    // InternalRobotDSL.g:826:5: (lv_runningstatements_4_0= ruleRunningStatements )
                    // InternalRobotDSL.g:827:6: lv_runningstatements_4_0= ruleRunningStatements
                    {

                    						newCompositeNode(grammarAccess.getWhileStatementAccess().getRunningstatementsRunningStatementsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_runningstatements_4_0=ruleRunningStatements();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhileStatementRule());
                    						}
                    						add(
                    							current,
                    							"runningstatements",
                    							lv_runningstatements_4_0,
                    							"glt.RobotDSL.RunningStatements");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDSL.g:844:4: ( (lv_runningstatements_5_0= ruleRunningStatements ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_COMMENTS||LA14_0==17||(LA14_0>=20 && LA14_0<=21)||(LA14_0>=23 && LA14_0<=27)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRobotDSL.g:845:5: (lv_runningstatements_5_0= ruleRunningStatements )
                    	    {
                    	    // InternalRobotDSL.g:845:5: (lv_runningstatements_5_0= ruleRunningStatements )
                    	    // InternalRobotDSL.g:846:6: lv_runningstatements_5_0= ruleRunningStatements
                    	    {

                    	    						newCompositeNode(grammarAccess.getWhileStatementAccess().getRunningstatementsRunningStatementsParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_runningstatements_5_0=ruleRunningStatements();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getWhileStatementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"runningstatements",
                    	    							lv_runningstatements_5_0,
                    	    							"glt.RobotDSL.RunningStatements");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWhileStatementAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleRepeatStatement"
    // InternalRobotDSL.g:872:1: entryRuleRepeatStatement returns [EObject current=null] : iv_ruleRepeatStatement= ruleRepeatStatement EOF ;
    public final EObject entryRuleRepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatStatement = null;


        try {
            // InternalRobotDSL.g:872:56: (iv_ruleRepeatStatement= ruleRepeatStatement EOF )
            // InternalRobotDSL.g:873:2: iv_ruleRepeatStatement= ruleRepeatStatement EOF
            {
             newCompositeNode(grammarAccess.getRepeatStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeatStatement=ruleRepeatStatement();

            state._fsp--;

             current =iv_ruleRepeatStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepeatStatement"


    // $ANTLR start "ruleRepeatStatement"
    // InternalRobotDSL.g:879:1: ruleRepeatStatement returns [EObject current=null] : ( () otherlv_1= 'repeat' ( (lv_time_2_0= ruleEInt ) ) otherlv_3= 'times' ( ( (lv_commandstatement_4_0= ruleCommandStatement ) ) ( (lv_commandstatement_5_0= ruleCommandStatement ) )* )? otherlv_6= 'end' ) ;
    public final EObject ruleRepeatStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_time_2_0 = null;

        EObject lv_commandstatement_4_0 = null;

        EObject lv_commandstatement_5_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:885:2: ( ( () otherlv_1= 'repeat' ( (lv_time_2_0= ruleEInt ) ) otherlv_3= 'times' ( ( (lv_commandstatement_4_0= ruleCommandStatement ) ) ( (lv_commandstatement_5_0= ruleCommandStatement ) )* )? otherlv_6= 'end' ) )
            // InternalRobotDSL.g:886:2: ( () otherlv_1= 'repeat' ( (lv_time_2_0= ruleEInt ) ) otherlv_3= 'times' ( ( (lv_commandstatement_4_0= ruleCommandStatement ) ) ( (lv_commandstatement_5_0= ruleCommandStatement ) )* )? otherlv_6= 'end' )
            {
            // InternalRobotDSL.g:886:2: ( () otherlv_1= 'repeat' ( (lv_time_2_0= ruleEInt ) ) otherlv_3= 'times' ( ( (lv_commandstatement_4_0= ruleCommandStatement ) ) ( (lv_commandstatement_5_0= ruleCommandStatement ) )* )? otherlv_6= 'end' )
            // InternalRobotDSL.g:887:3: () otherlv_1= 'repeat' ( (lv_time_2_0= ruleEInt ) ) otherlv_3= 'times' ( ( (lv_commandstatement_4_0= ruleCommandStatement ) ) ( (lv_commandstatement_5_0= ruleCommandStatement ) )* )? otherlv_6= 'end'
            {
            // InternalRobotDSL.g:887:3: ()
            // InternalRobotDSL.g:888:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepeatStatementAccess().getRepeatStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRepeatStatementAccess().getRepeatKeyword_1());
            		
            // InternalRobotDSL.g:898:3: ( (lv_time_2_0= ruleEInt ) )
            // InternalRobotDSL.g:899:4: (lv_time_2_0= ruleEInt )
            {
            // InternalRobotDSL.g:899:4: (lv_time_2_0= ruleEInt )
            // InternalRobotDSL.g:900:5: lv_time_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRepeatStatementAccess().getTimeEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_time_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_2_0,
            						"glt.RobotDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRepeatStatementAccess().getTimesKeyword_3());
            		
            // InternalRobotDSL.g:921:3: ( ( (lv_commandstatement_4_0= ruleCommandStatement ) ) ( (lv_commandstatement_5_0= ruleCommandStatement ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_COMMENTS||(LA17_0>=23 && LA17_0<=27)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRobotDSL.g:922:4: ( (lv_commandstatement_4_0= ruleCommandStatement ) ) ( (lv_commandstatement_5_0= ruleCommandStatement ) )*
                    {
                    // InternalRobotDSL.g:922:4: ( (lv_commandstatement_4_0= ruleCommandStatement ) )
                    // InternalRobotDSL.g:923:5: (lv_commandstatement_4_0= ruleCommandStatement )
                    {
                    // InternalRobotDSL.g:923:5: (lv_commandstatement_4_0= ruleCommandStatement )
                    // InternalRobotDSL.g:924:6: lv_commandstatement_4_0= ruleCommandStatement
                    {

                    						newCompositeNode(grammarAccess.getRepeatStatementAccess().getCommandstatementCommandStatementParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_commandstatement_4_0=ruleCommandStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
                    						}
                    						add(
                    							current,
                    							"commandstatement",
                    							lv_commandstatement_4_0,
                    							"glt.RobotDSL.CommandStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDSL.g:941:4: ( (lv_commandstatement_5_0= ruleCommandStatement ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_COMMENTS||(LA16_0>=23 && LA16_0<=27)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRobotDSL.g:942:5: (lv_commandstatement_5_0= ruleCommandStatement )
                    	    {
                    	    // InternalRobotDSL.g:942:5: (lv_commandstatement_5_0= ruleCommandStatement )
                    	    // InternalRobotDSL.g:943:6: lv_commandstatement_5_0= ruleCommandStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getRepeatStatementAccess().getCommandstatementCommandStatementParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_commandstatement_5_0=ruleCommandStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"commandstatement",
                    	    							lv_commandstatement_5_0,
                    	    							"glt.RobotDSL.CommandStatement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRepeatStatementAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepeatStatement"


    // $ANTLR start "entryRuleStep"
    // InternalRobotDSL.g:969:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalRobotDSL.g:969:45: (iv_ruleStep= ruleStep EOF )
            // InternalRobotDSL.g:970:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalRobotDSL.g:976:1: ruleStep returns [EObject current=null] : ( () otherlv_1= 'step' ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:982:2: ( ( () otherlv_1= 'step' ) )
            // InternalRobotDSL.g:983:2: ( () otherlv_1= 'step' )
            {
            // InternalRobotDSL.g:983:2: ( () otherlv_1= 'step' )
            // InternalRobotDSL.g:984:3: () otherlv_1= 'step'
            {
            // InternalRobotDSL.g:984:3: ()
            // InternalRobotDSL.g:985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepAccess().getStepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStepAccess().getStepKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleTurnLeft"
    // InternalRobotDSL.g:999:1: entryRuleTurnLeft returns [EObject current=null] : iv_ruleTurnLeft= ruleTurnLeft EOF ;
    public final EObject entryRuleTurnLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnLeft = null;


        try {
            // InternalRobotDSL.g:999:49: (iv_ruleTurnLeft= ruleTurnLeft EOF )
            // InternalRobotDSL.g:1000:2: iv_ruleTurnLeft= ruleTurnLeft EOF
            {
             newCompositeNode(grammarAccess.getTurnLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnLeft=ruleTurnLeft();

            state._fsp--;

             current =iv_ruleTurnLeft; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnLeft"


    // $ANTLR start "ruleTurnLeft"
    // InternalRobotDSL.g:1006:1: ruleTurnLeft returns [EObject current=null] : ( () otherlv_1= 'turnLeft' ) ;
    public final EObject ruleTurnLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1012:2: ( ( () otherlv_1= 'turnLeft' ) )
            // InternalRobotDSL.g:1013:2: ( () otherlv_1= 'turnLeft' )
            {
            // InternalRobotDSL.g:1013:2: ( () otherlv_1= 'turnLeft' )
            // InternalRobotDSL.g:1014:3: () otherlv_1= 'turnLeft'
            {
            // InternalRobotDSL.g:1014:3: ()
            // InternalRobotDSL.g:1015:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnLeftAccess().getTurnLeftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnLeftAccess().getTurnLeftKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnLeft"


    // $ANTLR start "entryRuleDrop"
    // InternalRobotDSL.g:1029:1: entryRuleDrop returns [EObject current=null] : iv_ruleDrop= ruleDrop EOF ;
    public final EObject entryRuleDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrop = null;


        try {
            // InternalRobotDSL.g:1029:45: (iv_ruleDrop= ruleDrop EOF )
            // InternalRobotDSL.g:1030:2: iv_ruleDrop= ruleDrop EOF
            {
             newCompositeNode(grammarAccess.getDropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDrop=ruleDrop();

            state._fsp--;

             current =iv_ruleDrop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDrop"


    // $ANTLR start "ruleDrop"
    // InternalRobotDSL.g:1036:1: ruleDrop returns [EObject current=null] : ( () otherlv_1= 'drop' ) ;
    public final EObject ruleDrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1042:2: ( ( () otherlv_1= 'drop' ) )
            // InternalRobotDSL.g:1043:2: ( () otherlv_1= 'drop' )
            {
            // InternalRobotDSL.g:1043:2: ( () otherlv_1= 'drop' )
            // InternalRobotDSL.g:1044:3: () otherlv_1= 'drop'
            {
            // InternalRobotDSL.g:1044:3: ()
            // InternalRobotDSL.g:1045:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDropAccess().getDropAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDropAccess().getDropKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDrop"


    // $ANTLR start "entryRulePick"
    // InternalRobotDSL.g:1059:1: entryRulePick returns [EObject current=null] : iv_rulePick= rulePick EOF ;
    public final EObject entryRulePick() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePick = null;


        try {
            // InternalRobotDSL.g:1059:45: (iv_rulePick= rulePick EOF )
            // InternalRobotDSL.g:1060:2: iv_rulePick= rulePick EOF
            {
             newCompositeNode(grammarAccess.getPickRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePick=rulePick();

            state._fsp--;

             current =iv_rulePick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePick"


    // $ANTLR start "rulePick"
    // InternalRobotDSL.g:1066:1: rulePick returns [EObject current=null] : ( () otherlv_1= 'pick' ) ;
    public final EObject rulePick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1072:2: ( ( () otherlv_1= 'pick' ) )
            // InternalRobotDSL.g:1073:2: ( () otherlv_1= 'pick' )
            {
            // InternalRobotDSL.g:1073:2: ( () otherlv_1= 'pick' )
            // InternalRobotDSL.g:1074:3: () otherlv_1= 'pick'
            {
            // InternalRobotDSL.g:1074:3: ()
            // InternalRobotDSL.g:1075:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPickAccess().getPickAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPickAccess().getPickKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePick"


    // $ANTLR start "entryRuleTraceMessage"
    // InternalRobotDSL.g:1089:1: entryRuleTraceMessage returns [EObject current=null] : iv_ruleTraceMessage= ruleTraceMessage EOF ;
    public final EObject entryRuleTraceMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceMessage = null;


        try {
            // InternalRobotDSL.g:1089:53: (iv_ruleTraceMessage= ruleTraceMessage EOF )
            // InternalRobotDSL.g:1090:2: iv_ruleTraceMessage= ruleTraceMessage EOF
            {
             newCompositeNode(grammarAccess.getTraceMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraceMessage=ruleTraceMessage();

            state._fsp--;

             current =iv_ruleTraceMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraceMessage"


    // $ANTLR start "ruleTraceMessage"
    // InternalRobotDSL.g:1096:1: ruleTraceMessage returns [EObject current=null] : ( () otherlv_1= 'trace' ( (lv_message_2_0= ruleMessages ) ) ) ;
    public final EObject ruleTraceMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_message_2_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:1102:2: ( ( () otherlv_1= 'trace' ( (lv_message_2_0= ruleMessages ) ) ) )
            // InternalRobotDSL.g:1103:2: ( () otherlv_1= 'trace' ( (lv_message_2_0= ruleMessages ) ) )
            {
            // InternalRobotDSL.g:1103:2: ( () otherlv_1= 'trace' ( (lv_message_2_0= ruleMessages ) ) )
            // InternalRobotDSL.g:1104:3: () otherlv_1= 'trace' ( (lv_message_2_0= ruleMessages ) )
            {
            // InternalRobotDSL.g:1104:3: ()
            // InternalRobotDSL.g:1105:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTraceMessageAccess().getTraceMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTraceMessageAccess().getTraceKeyword_1());
            		
            // InternalRobotDSL.g:1115:3: ( (lv_message_2_0= ruleMessages ) )
            // InternalRobotDSL.g:1116:4: (lv_message_2_0= ruleMessages )
            {
            // InternalRobotDSL.g:1116:4: (lv_message_2_0= ruleMessages )
            // InternalRobotDSL.g:1117:5: lv_message_2_0= ruleMessages
            {

            					newCompositeNode(grammarAccess.getTraceMessageAccess().getMessageMessagesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_message_2_0=ruleMessages();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceMessageRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_2_0,
            						"glt.RobotDSL.Messages");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraceMessage"


    // $ANTLR start "entryRuleComment"
    // InternalRobotDSL.g:1138:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalRobotDSL.g:1138:48: (iv_ruleComment= ruleComment EOF )
            // InternalRobotDSL.g:1139:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalRobotDSL.g:1145:1: ruleComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_COMMENTS ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1151:2: ( ( () ( (lv_comment_1_0= RULE_COMMENTS ) ) ) )
            // InternalRobotDSL.g:1152:2: ( () ( (lv_comment_1_0= RULE_COMMENTS ) ) )
            {
            // InternalRobotDSL.g:1152:2: ( () ( (lv_comment_1_0= RULE_COMMENTS ) ) )
            // InternalRobotDSL.g:1153:3: () ( (lv_comment_1_0= RULE_COMMENTS ) )
            {
            // InternalRobotDSL.g:1153:3: ()
            // InternalRobotDSL.g:1154:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommentAccess().getCommentAction_0(),
            					current);
            			

            }

            // InternalRobotDSL.g:1160:3: ( (lv_comment_1_0= RULE_COMMENTS ) )
            // InternalRobotDSL.g:1161:4: (lv_comment_1_0= RULE_COMMENTS )
            {
            // InternalRobotDSL.g:1161:4: (lv_comment_1_0= RULE_COMMENTS )
            // InternalRobotDSL.g:1162:5: lv_comment_1_0= RULE_COMMENTS
            {
            lv_comment_1_0=(Token)match(input,RULE_COMMENTS,FOLLOW_2); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getCommentAccess().getCommentCOMMENTSTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"glt.RobotDSL.COMMENTS");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleDestroyWall"
    // InternalRobotDSL.g:1182:1: entryRuleDestroyWall returns [EObject current=null] : iv_ruleDestroyWall= ruleDestroyWall EOF ;
    public final EObject entryRuleDestroyWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestroyWall = null;


        try {
            // InternalRobotDSL.g:1182:52: (iv_ruleDestroyWall= ruleDestroyWall EOF )
            // InternalRobotDSL.g:1183:2: iv_ruleDestroyWall= ruleDestroyWall EOF
            {
             newCompositeNode(grammarAccess.getDestroyWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestroyWall=ruleDestroyWall();

            state._fsp--;

             current =iv_ruleDestroyWall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestroyWall"


    // $ANTLR start "ruleDestroyWall"
    // InternalRobotDSL.g:1189:1: ruleDestroyWall returns [EObject current=null] : ( () otherlv_1= 'destroyWall' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) ) ;
    public final EObject ruleDestroyWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_row_4_0=null;
        Token otherlv_5=null;
        Token lv_column_6_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1195:2: ( ( () otherlv_1= 'destroyWall' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:1196:2: ( () otherlv_1= 'destroyWall' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:1196:2: ( () otherlv_1= 'destroyWall' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) )
            // InternalRobotDSL.g:1197:3: () otherlv_1= 'destroyWall' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) )
            {
            // InternalRobotDSL.g:1197:3: ()
            // InternalRobotDSL.g:1198:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDestroyWallAccess().getDestroyWallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDestroyWallAccess().getDestroyWallKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getDestroyWallAccess().getAtKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getDestroyWallAccess().getRowKeyword_3());
            		
            // InternalRobotDSL.g:1216:3: ( (lv_row_4_0= RULE_INT ) )
            // InternalRobotDSL.g:1217:4: (lv_row_4_0= RULE_INT )
            {
            // InternalRobotDSL.g:1217:4: (lv_row_4_0= RULE_INT )
            // InternalRobotDSL.g:1218:5: lv_row_4_0= RULE_INT
            {
            lv_row_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_row_4_0, grammarAccess.getDestroyWallAccess().getRowINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestroyWallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"row",
            						lv_row_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getDestroyWallAccess().getColKeyword_5());
            		
            // InternalRobotDSL.g:1238:3: ( (lv_column_6_0= RULE_INT ) )
            // InternalRobotDSL.g:1239:4: (lv_column_6_0= RULE_INT )
            {
            // InternalRobotDSL.g:1239:4: (lv_column_6_0= RULE_INT )
            // InternalRobotDSL.g:1240:5: lv_column_6_0= RULE_INT
            {
            lv_column_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_column_6_0, grammarAccess.getDestroyWallAccess().getColumnINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestroyWallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestroyWall"


    // $ANTLR start "entryRulePickMark"
    // InternalRobotDSL.g:1260:1: entryRulePickMark returns [EObject current=null] : iv_rulePickMark= rulePickMark EOF ;
    public final EObject entryRulePickMark() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePickMark = null;


        try {
            // InternalRobotDSL.g:1260:49: (iv_rulePickMark= rulePickMark EOF )
            // InternalRobotDSL.g:1261:2: iv_rulePickMark= rulePickMark EOF
            {
             newCompositeNode(grammarAccess.getPickMarkRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePickMark=rulePickMark();

            state._fsp--;

             current =iv_rulePickMark; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePickMark"


    // $ANTLR start "rulePickMark"
    // InternalRobotDSL.g:1267:1: rulePickMark returns [EObject current=null] : ( () otherlv_1= 'pickMark' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) ) ;
    public final EObject rulePickMark() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_row_4_0=null;
        Token otherlv_5=null;
        Token lv_column_6_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1273:2: ( ( () otherlv_1= 'pickMark' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:1274:2: ( () otherlv_1= 'pickMark' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:1274:2: ( () otherlv_1= 'pickMark' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) )
            // InternalRobotDSL.g:1275:3: () otherlv_1= 'pickMark' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) )
            {
            // InternalRobotDSL.g:1275:3: ()
            // InternalRobotDSL.g:1276:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPickMarkAccess().getPickMarkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPickMarkAccess().getPickMarkKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getPickMarkAccess().getAtKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getPickMarkAccess().getRowKeyword_3());
            		
            // InternalRobotDSL.g:1294:3: ( (lv_row_4_0= RULE_INT ) )
            // InternalRobotDSL.g:1295:4: (lv_row_4_0= RULE_INT )
            {
            // InternalRobotDSL.g:1295:4: (lv_row_4_0= RULE_INT )
            // InternalRobotDSL.g:1296:5: lv_row_4_0= RULE_INT
            {
            lv_row_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_row_4_0, grammarAccess.getPickMarkAccess().getRowINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPickMarkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"row",
            						lv_row_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getPickMarkAccess().getColKeyword_5());
            		
            // InternalRobotDSL.g:1316:3: ( (lv_column_6_0= RULE_INT ) )
            // InternalRobotDSL.g:1317:4: (lv_column_6_0= RULE_INT )
            {
            // InternalRobotDSL.g:1317:4: (lv_column_6_0= RULE_INT )
            // InternalRobotDSL.g:1318:5: lv_column_6_0= RULE_INT
            {
            lv_column_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_column_6_0, grammarAccess.getPickMarkAccess().getColumnINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPickMarkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePickMark"


    // $ANTLR start "entryRuleDropMark"
    // InternalRobotDSL.g:1338:1: entryRuleDropMark returns [EObject current=null] : iv_ruleDropMark= ruleDropMark EOF ;
    public final EObject entryRuleDropMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropMark = null;


        try {
            // InternalRobotDSL.g:1338:49: (iv_ruleDropMark= ruleDropMark EOF )
            // InternalRobotDSL.g:1339:2: iv_ruleDropMark= ruleDropMark EOF
            {
             newCompositeNode(grammarAccess.getDropMarkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropMark=ruleDropMark();

            state._fsp--;

             current =iv_ruleDropMark; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropMark"


    // $ANTLR start "ruleDropMark"
    // InternalRobotDSL.g:1345:1: ruleDropMark returns [EObject current=null] : ( () otherlv_1= 'dropMark' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) ) ;
    public final EObject ruleDropMark() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_row_4_0=null;
        Token otherlv_5=null;
        Token lv_column_6_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1351:2: ( ( () otherlv_1= 'dropMark' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:1352:2: ( () otherlv_1= 'dropMark' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:1352:2: ( () otherlv_1= 'dropMark' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) )
            // InternalRobotDSL.g:1353:3: () otherlv_1= 'dropMark' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) )
            {
            // InternalRobotDSL.g:1353:3: ()
            // InternalRobotDSL.g:1354:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDropMarkAccess().getDropMarkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDropMarkAccess().getDropMarkKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getDropMarkAccess().getAtKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getDropMarkAccess().getRowKeyword_3());
            		
            // InternalRobotDSL.g:1372:3: ( (lv_row_4_0= RULE_INT ) )
            // InternalRobotDSL.g:1373:4: (lv_row_4_0= RULE_INT )
            {
            // InternalRobotDSL.g:1373:4: (lv_row_4_0= RULE_INT )
            // InternalRobotDSL.g:1374:5: lv_row_4_0= RULE_INT
            {
            lv_row_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_row_4_0, grammarAccess.getDropMarkAccess().getRowINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropMarkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"row",
            						lv_row_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getDropMarkAccess().getColKeyword_5());
            		
            // InternalRobotDSL.g:1394:3: ( (lv_column_6_0= RULE_INT ) )
            // InternalRobotDSL.g:1395:4: (lv_column_6_0= RULE_INT )
            {
            // InternalRobotDSL.g:1395:4: (lv_column_6_0= RULE_INT )
            // InternalRobotDSL.g:1396:5: lv_column_6_0= RULE_INT
            {
            lv_column_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_column_6_0, grammarAccess.getDropMarkAccess().getColumnINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropMarkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropMark"


    // $ANTLR start "entryRuleBuildWall"
    // InternalRobotDSL.g:1416:1: entryRuleBuildWall returns [EObject current=null] : iv_ruleBuildWall= ruleBuildWall EOF ;
    public final EObject entryRuleBuildWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildWall = null;


        try {
            // InternalRobotDSL.g:1416:50: (iv_ruleBuildWall= ruleBuildWall EOF )
            // InternalRobotDSL.g:1417:2: iv_ruleBuildWall= ruleBuildWall EOF
            {
             newCompositeNode(grammarAccess.getBuildWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildWall=ruleBuildWall();

            state._fsp--;

             current =iv_ruleBuildWall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuildWall"


    // $ANTLR start "ruleBuildWall"
    // InternalRobotDSL.g:1423:1: ruleBuildWall returns [EObject current=null] : ( () otherlv_1= 'buildWall' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) ) ;
    public final EObject ruleBuildWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_row_4_0=null;
        Token otherlv_5=null;
        Token lv_column_6_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1429:2: ( ( () otherlv_1= 'buildWall' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:1430:2: ( () otherlv_1= 'buildWall' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:1430:2: ( () otherlv_1= 'buildWall' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) ) )
            // InternalRobotDSL.g:1431:3: () otherlv_1= 'buildWall' otherlv_2= 'at' otherlv_3= 'row:' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'col:' ( (lv_column_6_0= RULE_INT ) )
            {
            // InternalRobotDSL.g:1431:3: ()
            // InternalRobotDSL.g:1432:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBuildWallAccess().getBuildWallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getBuildWallAccess().getBuildWallKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getBuildWallAccess().getAtKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getBuildWallAccess().getRowKeyword_3());
            		
            // InternalRobotDSL.g:1450:3: ( (lv_row_4_0= RULE_INT ) )
            // InternalRobotDSL.g:1451:4: (lv_row_4_0= RULE_INT )
            {
            // InternalRobotDSL.g:1451:4: (lv_row_4_0= RULE_INT )
            // InternalRobotDSL.g:1452:5: lv_row_4_0= RULE_INT
            {
            lv_row_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_row_4_0, grammarAccess.getBuildWallAccess().getRowINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuildWallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"row",
            						lv_row_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getBuildWallAccess().getColKeyword_5());
            		
            // InternalRobotDSL.g:1472:3: ( (lv_column_6_0= RULE_INT ) )
            // InternalRobotDSL.g:1473:4: (lv_column_6_0= RULE_INT )
            {
            // InternalRobotDSL.g:1473:4: (lv_column_6_0= RULE_INT )
            // InternalRobotDSL.g:1474:5: lv_column_6_0= RULE_INT
            {
            lv_column_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_column_6_0, grammarAccess.getBuildWallAccess().getColumnINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuildWallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuildWall"


    // $ANTLR start "entryRuleFull"
    // InternalRobotDSL.g:1494:1: entryRuleFull returns [EObject current=null] : iv_ruleFull= ruleFull EOF ;
    public final EObject entryRuleFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFull = null;


        try {
            // InternalRobotDSL.g:1494:45: (iv_ruleFull= ruleFull EOF )
            // InternalRobotDSL.g:1495:2: iv_ruleFull= ruleFull EOF
            {
             newCompositeNode(grammarAccess.getFullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFull=ruleFull();

            state._fsp--;

             current =iv_ruleFull; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFull"


    // $ANTLR start "ruleFull"
    // InternalRobotDSL.g:1501:1: ruleFull returns [EObject current=null] : ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'full' ) ;
    public final EObject ruleFull() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_not_1_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:1507:2: ( ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'full' ) )
            // InternalRobotDSL.g:1508:2: ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'full' )
            {
            // InternalRobotDSL.g:1508:2: ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'full' )
            // InternalRobotDSL.g:1509:3: () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'full'
            {
            // InternalRobotDSL.g:1509:3: ()
            // InternalRobotDSL.g:1510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFullAccess().getFullAction_0(),
            					current);
            			

            }

            // InternalRobotDSL.g:1516:3: ( (lv_not_1_0= ruleNot ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRobotDSL.g:1517:4: (lv_not_1_0= ruleNot )
                    {
                    // InternalRobotDSL.g:1517:4: (lv_not_1_0= ruleNot )
                    // InternalRobotDSL.g:1518:5: lv_not_1_0= ruleNot
                    {

                    					newCompositeNode(grammarAccess.getFullAccess().getNotNotParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_not_1_0=ruleNot();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFullRule());
                    					}
                    					set(
                    						current,
                    						"not",
                    						lv_not_1_0,
                    						"glt.RobotDSL.Not");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFullAccess().getFullKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFull"


    // $ANTLR start "entryRuleMark"
    // InternalRobotDSL.g:1543:1: entryRuleMark returns [EObject current=null] : iv_ruleMark= ruleMark EOF ;
    public final EObject entryRuleMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMark = null;


        try {
            // InternalRobotDSL.g:1543:45: (iv_ruleMark= ruleMark EOF )
            // InternalRobotDSL.g:1544:2: iv_ruleMark= ruleMark EOF
            {
             newCompositeNode(grammarAccess.getMarkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMark=ruleMark();

            state._fsp--;

             current =iv_ruleMark; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMark"


    // $ANTLR start "ruleMark"
    // InternalRobotDSL.g:1550:1: ruleMark returns [EObject current=null] : ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'mark' ) ;
    public final EObject ruleMark() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_not_1_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:1556:2: ( ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'mark' ) )
            // InternalRobotDSL.g:1557:2: ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'mark' )
            {
            // InternalRobotDSL.g:1557:2: ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'mark' )
            // InternalRobotDSL.g:1558:3: () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'mark'
            {
            // InternalRobotDSL.g:1558:3: ()
            // InternalRobotDSL.g:1559:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarkAccess().getMarkAction_0(),
            					current);
            			

            }

            // InternalRobotDSL.g:1565:3: ( (lv_not_1_0= ruleNot ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRobotDSL.g:1566:4: (lv_not_1_0= ruleNot )
                    {
                    // InternalRobotDSL.g:1566:4: (lv_not_1_0= ruleNot )
                    // InternalRobotDSL.g:1567:5: lv_not_1_0= ruleNot
                    {

                    					newCompositeNode(grammarAccess.getMarkAccess().getNotNotParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_not_1_0=ruleNot();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMarkRule());
                    					}
                    					set(
                    						current,
                    						"not",
                    						lv_not_1_0,
                    						"glt.RobotDSL.Not");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMarkAccess().getMarkKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMark"


    // $ANTLR start "entryRuleWallAhead"
    // InternalRobotDSL.g:1592:1: entryRuleWallAhead returns [EObject current=null] : iv_ruleWallAhead= ruleWallAhead EOF ;
    public final EObject entryRuleWallAhead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWallAhead = null;


        try {
            // InternalRobotDSL.g:1592:50: (iv_ruleWallAhead= ruleWallAhead EOF )
            // InternalRobotDSL.g:1593:2: iv_ruleWallAhead= ruleWallAhead EOF
            {
             newCompositeNode(grammarAccess.getWallAheadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWallAhead=ruleWallAhead();

            state._fsp--;

             current =iv_ruleWallAhead; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWallAhead"


    // $ANTLR start "ruleWallAhead"
    // InternalRobotDSL.g:1599:1: ruleWallAhead returns [EObject current=null] : ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'wall' otherlv_3= 'ahead' ) ;
    public final EObject ruleWallAhead() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_not_1_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:1605:2: ( ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'wall' otherlv_3= 'ahead' ) )
            // InternalRobotDSL.g:1606:2: ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'wall' otherlv_3= 'ahead' )
            {
            // InternalRobotDSL.g:1606:2: ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'wall' otherlv_3= 'ahead' )
            // InternalRobotDSL.g:1607:3: () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'wall' otherlv_3= 'ahead'
            {
            // InternalRobotDSL.g:1607:3: ()
            // InternalRobotDSL.g:1608:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWallAheadAccess().getWallAheadAction_0(),
            					current);
            			

            }

            // InternalRobotDSL.g:1614:3: ( (lv_not_1_0= ruleNot ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRobotDSL.g:1615:4: (lv_not_1_0= ruleNot )
                    {
                    // InternalRobotDSL.g:1615:4: (lv_not_1_0= ruleNot )
                    // InternalRobotDSL.g:1616:5: lv_not_1_0= ruleNot
                    {

                    					newCompositeNode(grammarAccess.getWallAheadAccess().getNotNotParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_not_1_0=ruleNot();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWallAheadRule());
                    					}
                    					set(
                    						current,
                    						"not",
                    						lv_not_1_0,
                    						"glt.RobotDSL.Not");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getWallAheadAccess().getWallKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getWallAheadAccess().getAheadKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWallAhead"


    // $ANTLR start "entryRuleHeading"
    // InternalRobotDSL.g:1645:1: entryRuleHeading returns [EObject current=null] : iv_ruleHeading= ruleHeading EOF ;
    public final EObject entryRuleHeading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading = null;


        try {
            // InternalRobotDSL.g:1645:48: (iv_ruleHeading= ruleHeading EOF )
            // InternalRobotDSL.g:1646:2: iv_ruleHeading= ruleHeading EOF
            {
             newCompositeNode(grammarAccess.getHeadingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeading=ruleHeading();

            state._fsp--;

             current =iv_ruleHeading; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeading"


    // $ANTLR start "ruleHeading"
    // InternalRobotDSL.g:1652:1: ruleHeading returns [EObject current=null] : ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'heading' ( (lv_direction_3_0= ruleDirections ) ) ) ;
    public final EObject ruleHeading() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_not_1_0 = null;

        Enumerator lv_direction_3_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:1658:2: ( ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'heading' ( (lv_direction_3_0= ruleDirections ) ) ) )
            // InternalRobotDSL.g:1659:2: ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'heading' ( (lv_direction_3_0= ruleDirections ) ) )
            {
            // InternalRobotDSL.g:1659:2: ( () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'heading' ( (lv_direction_3_0= ruleDirections ) ) )
            // InternalRobotDSL.g:1660:3: () ( (lv_not_1_0= ruleNot ) )? otherlv_2= 'heading' ( (lv_direction_3_0= ruleDirections ) )
            {
            // InternalRobotDSL.g:1660:3: ()
            // InternalRobotDSL.g:1661:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeadingAccess().getHeadingAction_0(),
            					current);
            			

            }

            // InternalRobotDSL.g:1667:3: ( (lv_not_1_0= ruleNot ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRobotDSL.g:1668:4: (lv_not_1_0= ruleNot )
                    {
                    // InternalRobotDSL.g:1668:4: (lv_not_1_0= ruleNot )
                    // InternalRobotDSL.g:1669:5: lv_not_1_0= ruleNot
                    {

                    					newCompositeNode(grammarAccess.getHeadingAccess().getNotNotParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_not_1_0=ruleNot();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHeadingRule());
                    					}
                    					set(
                    						current,
                    						"not",
                    						lv_not_1_0,
                    						"glt.RobotDSL.Not");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getHeadingAccess().getHeadingKeyword_2());
            		
            // InternalRobotDSL.g:1690:3: ( (lv_direction_3_0= ruleDirections ) )
            // InternalRobotDSL.g:1691:4: (lv_direction_3_0= ruleDirections )
            {
            // InternalRobotDSL.g:1691:4: (lv_direction_3_0= ruleDirections )
            // InternalRobotDSL.g:1692:5: lv_direction_3_0= ruleDirections
            {

            					newCompositeNode(grammarAccess.getHeadingAccess().getDirectionDirectionsEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_direction_3_0=ruleDirections();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadingRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_3_0,
            						"glt.RobotDSL.Directions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeading"


    // $ANTLR start "entryRuleBinaryLogicalExp"
    // InternalRobotDSL.g:1713:1: entryRuleBinaryLogicalExp returns [EObject current=null] : iv_ruleBinaryLogicalExp= ruleBinaryLogicalExp EOF ;
    public final EObject entryRuleBinaryLogicalExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryLogicalExp = null;


        try {
            // InternalRobotDSL.g:1713:57: (iv_ruleBinaryLogicalExp= ruleBinaryLogicalExp EOF )
            // InternalRobotDSL.g:1714:2: iv_ruleBinaryLogicalExp= ruleBinaryLogicalExp EOF
            {
             newCompositeNode(grammarAccess.getBinaryLogicalExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryLogicalExp=ruleBinaryLogicalExp();

            state._fsp--;

             current =iv_ruleBinaryLogicalExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryLogicalExp"


    // $ANTLR start "ruleBinaryLogicalExp"
    // InternalRobotDSL.g:1720:1: ruleBinaryLogicalExp returns [EObject current=null] : ( ( (lv_singlelogalexp_0_0= ruleSingleLogalExp ) ) ( ( (lv_binaries_1_0= ruleBinaries ) ) ( (lv_singlelogalexp_2_0= ruleSingleLogalExp ) ) )+ ) ;
    public final EObject ruleBinaryLogicalExp() throws RecognitionException {
        EObject current = null;

        EObject lv_singlelogalexp_0_0 = null;

        EObject lv_binaries_1_0 = null;

        EObject lv_singlelogalexp_2_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:1726:2: ( ( ( (lv_singlelogalexp_0_0= ruleSingleLogalExp ) ) ( ( (lv_binaries_1_0= ruleBinaries ) ) ( (lv_singlelogalexp_2_0= ruleSingleLogalExp ) ) )+ ) )
            // InternalRobotDSL.g:1727:2: ( ( (lv_singlelogalexp_0_0= ruleSingleLogalExp ) ) ( ( (lv_binaries_1_0= ruleBinaries ) ) ( (lv_singlelogalexp_2_0= ruleSingleLogalExp ) ) )+ )
            {
            // InternalRobotDSL.g:1727:2: ( ( (lv_singlelogalexp_0_0= ruleSingleLogalExp ) ) ( ( (lv_binaries_1_0= ruleBinaries ) ) ( (lv_singlelogalexp_2_0= ruleSingleLogalExp ) ) )+ )
            // InternalRobotDSL.g:1728:3: ( (lv_singlelogalexp_0_0= ruleSingleLogalExp ) ) ( ( (lv_binaries_1_0= ruleBinaries ) ) ( (lv_singlelogalexp_2_0= ruleSingleLogalExp ) ) )+
            {
            // InternalRobotDSL.g:1728:3: ( (lv_singlelogalexp_0_0= ruleSingleLogalExp ) )
            // InternalRobotDSL.g:1729:4: (lv_singlelogalexp_0_0= ruleSingleLogalExp )
            {
            // InternalRobotDSL.g:1729:4: (lv_singlelogalexp_0_0= ruleSingleLogalExp )
            // InternalRobotDSL.g:1730:5: lv_singlelogalexp_0_0= ruleSingleLogalExp
            {

            					newCompositeNode(grammarAccess.getBinaryLogicalExpAccess().getSinglelogalexpSingleLogalExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_singlelogalexp_0_0=ruleSingleLogalExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryLogicalExpRule());
            					}
            					add(
            						current,
            						"singlelogalexp",
            						lv_singlelogalexp_0_0,
            						"glt.RobotDSL.SingleLogalExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotDSL.g:1747:3: ( ( (lv_binaries_1_0= ruleBinaries ) ) ( (lv_singlelogalexp_2_0= ruleSingleLogalExp ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=41 && LA22_0<=42)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRobotDSL.g:1748:4: ( (lv_binaries_1_0= ruleBinaries ) ) ( (lv_singlelogalexp_2_0= ruleSingleLogalExp ) )
            	    {
            	    // InternalRobotDSL.g:1748:4: ( (lv_binaries_1_0= ruleBinaries ) )
            	    // InternalRobotDSL.g:1749:5: (lv_binaries_1_0= ruleBinaries )
            	    {
            	    // InternalRobotDSL.g:1749:5: (lv_binaries_1_0= ruleBinaries )
            	    // InternalRobotDSL.g:1750:6: lv_binaries_1_0= ruleBinaries
            	    {

            	    						newCompositeNode(grammarAccess.getBinaryLogicalExpAccess().getBinariesBinariesParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_binaries_1_0=ruleBinaries();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBinaryLogicalExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"binaries",
            	    							lv_binaries_1_0,
            	    							"glt.RobotDSL.Binaries");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalRobotDSL.g:1767:4: ( (lv_singlelogalexp_2_0= ruleSingleLogalExp ) )
            	    // InternalRobotDSL.g:1768:5: (lv_singlelogalexp_2_0= ruleSingleLogalExp )
            	    {
            	    // InternalRobotDSL.g:1768:5: (lv_singlelogalexp_2_0= ruleSingleLogalExp )
            	    // InternalRobotDSL.g:1769:6: lv_singlelogalexp_2_0= ruleSingleLogalExp
            	    {

            	    						newCompositeNode(grammarAccess.getBinaryLogicalExpAccess().getSinglelogalexpSingleLogalExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_singlelogalexp_2_0=ruleSingleLogalExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBinaryLogicalExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"singlelogalexp",
            	    							lv_singlelogalexp_2_0,
            	    							"glt.RobotDSL.SingleLogalExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryLogicalExp"


    // $ANTLR start "entryRuleNot"
    // InternalRobotDSL.g:1791:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalRobotDSL.g:1791:44: (iv_ruleNot= ruleNot EOF )
            // InternalRobotDSL.g:1792:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalRobotDSL.g:1798:1: ruleNot returns [EObject current=null] : ( () otherlv_1= 'not' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1804:2: ( ( () otherlv_1= 'not' ) )
            // InternalRobotDSL.g:1805:2: ( () otherlv_1= 'not' )
            {
            // InternalRobotDSL.g:1805:2: ( () otherlv_1= 'not' )
            // InternalRobotDSL.g:1806:3: () otherlv_1= 'not'
            {
            // InternalRobotDSL.g:1806:3: ()
            // InternalRobotDSL.g:1807:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNotAccess().getNotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNotAccess().getNotKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleAnd"
    // InternalRobotDSL.g:1821:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalRobotDSL.g:1821:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalRobotDSL.g:1822:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalRobotDSL.g:1828:1: ruleAnd returns [EObject current=null] : ( () otherlv_1= 'and' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1834:2: ( ( () otherlv_1= 'and' ) )
            // InternalRobotDSL.g:1835:2: ( () otherlv_1= 'and' )
            {
            // InternalRobotDSL.g:1835:2: ( () otherlv_1= 'and' )
            // InternalRobotDSL.g:1836:3: () otherlv_1= 'and'
            {
            // InternalRobotDSL.g:1836:3: ()
            // InternalRobotDSL.g:1837:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAndAccess().getAndAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalRobotDSL.g:1851:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalRobotDSL.g:1851:43: (iv_ruleOr= ruleOr EOF )
            // InternalRobotDSL.g:1852:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalRobotDSL.g:1858:1: ruleOr returns [EObject current=null] : ( () otherlv_1= 'or' ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1864:2: ( ( () otherlv_1= 'or' ) )
            // InternalRobotDSL.g:1865:2: ( () otherlv_1= 'or' )
            {
            // InternalRobotDSL.g:1865:2: ( () otherlv_1= 'or' )
            // InternalRobotDSL.g:1866:3: () otherlv_1= 'or'
            {
            // InternalRobotDSL.g:1866:3: ()
            // InternalRobotDSL.g:1867:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrAccess().getOrAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getOrAccess().getOrKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleEInt"
    // InternalRobotDSL.g:1881:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRobotDSL.g:1881:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRobotDSL.g:1882:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRobotDSL.g:1888:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1894:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRobotDSL.g:1895:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRobotDSL.g:1895:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRobotDSL.g:1896:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRobotDSL.g:1896:3: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRobotDSL.g:1897:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleMessages"
    // InternalRobotDSL.g:1914:1: entryRuleMessages returns [String current=null] : iv_ruleMessages= ruleMessages EOF ;
    public final String entryRuleMessages() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMessages = null;


        try {
            // InternalRobotDSL.g:1914:48: (iv_ruleMessages= ruleMessages EOF )
            // InternalRobotDSL.g:1915:2: iv_ruleMessages= ruleMessages EOF
            {
             newCompositeNode(grammarAccess.getMessagesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessages=ruleMessages();

            state._fsp--;

             current =iv_ruleMessages.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessages"


    // $ANTLR start "ruleMessages"
    // InternalRobotDSL.g:1921:1: ruleMessages returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleMessages() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1927:2: (this_STRING_0= RULE_STRING )
            // InternalRobotDSL.g:1928:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getMessagesAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessages"


    // $ANTLR start "ruleDirections"
    // InternalRobotDSL.g:1938:1: ruleDirections returns [Enumerator current=null] : ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'west' ) | (enumLiteral_3= 'east' ) ) ;
    public final Enumerator ruleDirections() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1944:2: ( ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'west' ) | (enumLiteral_3= 'east' ) ) )
            // InternalRobotDSL.g:1945:2: ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'west' ) | (enumLiteral_3= 'east' ) )
            {
            // InternalRobotDSL.g:1945:2: ( (enumLiteral_0= 'south' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'west' ) | (enumLiteral_3= 'east' ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt24=1;
                }
                break;
            case 45:
                {
                alt24=2;
                }
                break;
            case 46:
                {
                alt24=3;
                }
                break;
            case 47:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalRobotDSL.g:1946:3: (enumLiteral_0= 'south' )
                    {
                    // InternalRobotDSL.g:1946:3: (enumLiteral_0= 'south' )
                    // InternalRobotDSL.g:1947:4: enumLiteral_0= 'south'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDirectionsAccess().getSouthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionsAccess().getSouthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1954:3: (enumLiteral_1= 'north' )
                    {
                    // InternalRobotDSL.g:1954:3: (enumLiteral_1= 'north' )
                    // InternalRobotDSL.g:1955:4: enumLiteral_1= 'north'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDirectionsAccess().getNorthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionsAccess().getNorthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:1962:3: (enumLiteral_2= 'west' )
                    {
                    // InternalRobotDSL.g:1962:3: (enumLiteral_2= 'west' )
                    // InternalRobotDSL.g:1963:4: enumLiteral_2= 'west'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getDirectionsAccess().getWestEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionsAccess().getWestEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:1970:3: (enumLiteral_3= 'east' )
                    {
                    // InternalRobotDSL.g:1970:3: (enumLiteral_3= 'east' )
                    // InternalRobotDSL.g:1971:4: enumLiteral_3= 'east'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getDirectionsAccess().getEastEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionsAccess().getEastEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirections"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\2\uffff\1\6\1\10\5\uffff\1\16\4\17\2\uffff";
    static final String dfa_3s = "\2\43\2\22\1\46\1\54\3\uffff\5\22\2\uffff";
    static final String dfa_4s = "\1\50\1\47\2\52\1\46\1\57\3\uffff\5\52\2\uffff";
    static final String dfa_5s = "\6\uffff\1\1\1\5\1\2\5\uffff\1\3\1\4";
    static final String dfa_6s = "\20\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\4\1\uffff\1\5\1\1",
            "\1\2\1\3\1\4\1\uffff\1\5",
            "\1\6\26\uffff\2\7",
            "\1\10\26\uffff\2\7",
            "\1\11",
            "\1\12\1\13\1\14\1\15",
            "",
            "",
            "",
            "\1\16\26\uffff\2\7",
            "\1\17\26\uffff\2\7",
            "\1\17\26\uffff\2\7",
            "\1\17\26\uffff\2\7",
            "\1\17\26\uffff\2\7",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "314:2: (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_WallAhead_2= ruleWallAhead | this_Heading_3= ruleHeading | this_BinaryLogicalExp_4= ruleBinaryLogicalExp )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000071FB30020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000001B800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000FB30020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000F810020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000F00000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000060000000002L});

}