package org.muml.storydiagram.expressions.parser.antlr.internal; 

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
import org.muml.storydiagram.expressions.services.PathExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPathExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'|'", "'.'", "'['", "','", "']'", "'!'", "'NO_REPEAT'", "'+'", "'*'", "'-->'", "'<>-->'", "'--><>'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPathExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPathExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPathExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPathExpressions.g"; }



     	private PathExpressionsGrammarAccess grammarAccess;
     	
        public InternalPathExpressionsParser(TokenStream input, PathExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PathExpression";	
       	}
       	
       	@Override
       	protected PathExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePathExpression"
    // InternalPathExpressions.g:68:1: entryRulePathExpression returns [EObject current=null] : iv_rulePathExpression= rulePathExpression EOF ;
    public final EObject entryRulePathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExpression = null;


        try {
            // InternalPathExpressions.g:69:2: (iv_rulePathExpression= rulePathExpression EOF )
            // InternalPathExpressions.g:70:2: iv_rulePathExpression= rulePathExpression EOF
            {
             newCompositeNode(grammarAccess.getPathExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathExpression=rulePathExpression();

            state._fsp--;

             current =iv_rulePathExpression; 
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
    // $ANTLR end "entryRulePathExpression"


    // $ANTLR start "rulePathExpression"
    // InternalPathExpressions.g:77:1: rulePathExpression returns [EObject current=null] : ( ( (lv_pathAlternatives_0_0= rulePath ) ) | (otherlv_1= '(' ( (lv_pathAlternatives_2_0= rulePath ) ) otherlv_3= ')' (otherlv_4= '|' otherlv_5= '(' ( (lv_pathAlternatives_6_0= rulePath ) ) otherlv_7= ')' )+ ) ) ;
    public final EObject rulePathExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_pathAlternatives_0_0 = null;

        EObject lv_pathAlternatives_2_0 = null;

        EObject lv_pathAlternatives_6_0 = null;


         enterRule(); 
            
        try {
            // InternalPathExpressions.g:80:28: ( ( ( (lv_pathAlternatives_0_0= rulePath ) ) | (otherlv_1= '(' ( (lv_pathAlternatives_2_0= rulePath ) ) otherlv_3= ')' (otherlv_4= '|' otherlv_5= '(' ( (lv_pathAlternatives_6_0= rulePath ) ) otherlv_7= ')' )+ ) ) )
            // InternalPathExpressions.g:81:1: ( ( (lv_pathAlternatives_0_0= rulePath ) ) | (otherlv_1= '(' ( (lv_pathAlternatives_2_0= rulePath ) ) otherlv_3= ')' (otherlv_4= '|' otherlv_5= '(' ( (lv_pathAlternatives_6_0= rulePath ) ) otherlv_7= ')' )+ ) )
            {
            // InternalPathExpressions.g:81:1: ( ( (lv_pathAlternatives_0_0= rulePath ) ) | (otherlv_1= '(' ( (lv_pathAlternatives_2_0= rulePath ) ) otherlv_3= ')' (otherlv_4= '|' otherlv_5= '(' ( (lv_pathAlternatives_6_0= rulePath ) ) otherlv_7= ')' )+ ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalPathExpressions.g:81:2: ( (lv_pathAlternatives_0_0= rulePath ) )
                    {
                    // InternalPathExpressions.g:81:2: ( (lv_pathAlternatives_0_0= rulePath ) )
                    // InternalPathExpressions.g:82:1: (lv_pathAlternatives_0_0= rulePath )
                    {
                    // InternalPathExpressions.g:82:1: (lv_pathAlternatives_0_0= rulePath )
                    // InternalPathExpressions.g:83:3: lv_pathAlternatives_0_0= rulePath
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_pathAlternatives_0_0=rulePath();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"pathAlternatives",
                            		lv_pathAlternatives_0_0, 
                            		"org.muml.storydiagram.expressions.PathExpressions.Path");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPathExpressions.g:100:6: (otherlv_1= '(' ( (lv_pathAlternatives_2_0= rulePath ) ) otherlv_3= ')' (otherlv_4= '|' otherlv_5= '(' ( (lv_pathAlternatives_6_0= rulePath ) ) otherlv_7= ')' )+ )
                    {
                    // InternalPathExpressions.g:100:6: (otherlv_1= '(' ( (lv_pathAlternatives_2_0= rulePath ) ) otherlv_3= ')' (otherlv_4= '|' otherlv_5= '(' ( (lv_pathAlternatives_6_0= rulePath ) ) otherlv_7= ')' )+ )
                    // InternalPathExpressions.g:100:8: otherlv_1= '(' ( (lv_pathAlternatives_2_0= rulePath ) ) otherlv_3= ')' (otherlv_4= '|' otherlv_5= '(' ( (lv_pathAlternatives_6_0= rulePath ) ) otherlv_7= ')' )+
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                        	newLeafNode(otherlv_1, grammarAccess.getPathExpressionAccess().getLeftParenthesisKeyword_1_0());
                        
                    // InternalPathExpressions.g:104:1: ( (lv_pathAlternatives_2_0= rulePath ) )
                    // InternalPathExpressions.g:105:1: (lv_pathAlternatives_2_0= rulePath )
                    {
                    // InternalPathExpressions.g:105:1: (lv_pathAlternatives_2_0= rulePath )
                    // InternalPathExpressions.g:106:3: lv_pathAlternatives_2_0= rulePath
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_4);
                    lv_pathAlternatives_2_0=rulePath();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"pathAlternatives",
                            		lv_pathAlternatives_2_0, 
                            		"org.muml.storydiagram.expressions.PathExpressions.Path");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getPathExpressionAccess().getRightParenthesisKeyword_1_2());
                        
                    // InternalPathExpressions.g:126:1: (otherlv_4= '|' otherlv_5= '(' ( (lv_pathAlternatives_6_0= rulePath ) ) otherlv_7= ')' )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalPathExpressions.g:126:3: otherlv_4= '|' otherlv_5= '(' ( (lv_pathAlternatives_6_0= rulePath ) ) otherlv_7= ')'
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getPathExpressionAccess().getVerticalLineKeyword_1_3_0());
                    	        
                    	    otherlv_5=(Token)match(input,11,FOLLOW_3); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getPathExpressionAccess().getLeftParenthesisKeyword_1_3_1());
                    	        
                    	    // InternalPathExpressions.g:134:1: ( (lv_pathAlternatives_6_0= rulePath ) )
                    	    // InternalPathExpressions.g:135:1: (lv_pathAlternatives_6_0= rulePath )
                    	    {
                    	    // InternalPathExpressions.g:135:1: (lv_pathAlternatives_6_0= rulePath )
                    	    // InternalPathExpressions.g:136:3: lv_pathAlternatives_6_0= rulePath
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_1_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_4);
                    	    lv_pathAlternatives_6_0=rulePath();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPathExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"pathAlternatives",
                    	            		lv_pathAlternatives_6_0, 
                    	            		"org.muml.storydiagram.expressions.PathExpressions.Path");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_7=(Token)match(input,12,FOLLOW_7); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPathExpressionAccess().getRightParenthesisKeyword_1_3_3());
                    	        

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
    // $ANTLR end "rulePathExpression"


    // $ANTLR start "entryRulePath"
    // InternalPathExpressions.g:164:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalPathExpressions.g:165:2: (iv_rulePath= rulePath EOF )
            // InternalPathExpressions.g:166:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
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
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalPathExpressions.g:173:1: rulePath returns [EObject current=null] : ( ( (lv_segments_0_0= rulePathSegment ) ) (otherlv_1= '.' ( (lv_segments_2_0= rulePathSegment ) ) )* ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_segments_0_0 = null;

        EObject lv_segments_2_0 = null;


         enterRule(); 
            
        try {
            // InternalPathExpressions.g:176:28: ( ( ( (lv_segments_0_0= rulePathSegment ) ) (otherlv_1= '.' ( (lv_segments_2_0= rulePathSegment ) ) )* ) )
            // InternalPathExpressions.g:177:1: ( ( (lv_segments_0_0= rulePathSegment ) ) (otherlv_1= '.' ( (lv_segments_2_0= rulePathSegment ) ) )* )
            {
            // InternalPathExpressions.g:177:1: ( ( (lv_segments_0_0= rulePathSegment ) ) (otherlv_1= '.' ( (lv_segments_2_0= rulePathSegment ) ) )* )
            // InternalPathExpressions.g:177:2: ( (lv_segments_0_0= rulePathSegment ) ) (otherlv_1= '.' ( (lv_segments_2_0= rulePathSegment ) ) )*
            {
            // InternalPathExpressions.g:177:2: ( (lv_segments_0_0= rulePathSegment ) )
            // InternalPathExpressions.g:178:1: (lv_segments_0_0= rulePathSegment )
            {
            // InternalPathExpressions.g:178:1: (lv_segments_0_0= rulePathSegment )
            // InternalPathExpressions.g:179:3: lv_segments_0_0= rulePathSegment
            {
             
            	        newCompositeNode(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_8);
            lv_segments_0_0=rulePathSegment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPathRule());
            	        }
                   		add(
                   			current, 
                   			"segments",
                    		lv_segments_0_0, 
                    		"org.muml.storydiagram.expressions.PathExpressions.PathSegment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalPathExpressions.g:195:2: (otherlv_1= '.' ( (lv_segments_2_0= rulePathSegment ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPathExpressions.g:195:4: otherlv_1= '.' ( (lv_segments_2_0= rulePathSegment ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_3); 

            	        	newLeafNode(otherlv_1, grammarAccess.getPathAccess().getFullStopKeyword_1_0());
            	        
            	    // InternalPathExpressions.g:199:1: ( (lv_segments_2_0= rulePathSegment ) )
            	    // InternalPathExpressions.g:200:1: (lv_segments_2_0= rulePathSegment )
            	    {
            	    // InternalPathExpressions.g:200:1: (lv_segments_2_0= rulePathSegment )
            	    // InternalPathExpressions.g:201:3: lv_segments_2_0= rulePathSegment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_8);
            	    lv_segments_2_0=rulePathSegment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPathRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"segments",
            	            		lv_segments_2_0, 
            	            		"org.muml.storydiagram.expressions.PathExpressions.PathSegment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
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
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRulePathSegment"
    // InternalPathExpressions.g:225:1: entryRulePathSegment returns [EObject current=null] : iv_rulePathSegment= rulePathSegment EOF ;
    public final EObject entryRulePathSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathSegment = null;


        try {
            // InternalPathExpressions.g:226:2: (iv_rulePathSegment= rulePathSegment EOF )
            // InternalPathExpressions.g:227:2: iv_rulePathSegment= rulePathSegment EOF
            {
             newCompositeNode(grammarAccess.getPathSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathSegment=rulePathSegment();

            state._fsp--;

             current =iv_rulePathSegment; 
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
    // $ANTLR end "entryRulePathSegment"


    // $ANTLR start "rulePathSegment"
    // InternalPathExpressions.g:234:1: rulePathSegment returns [EObject current=null] : ( ( ( (lv_alternatives_0_0= rulePathSegmentDescription ) ) | (otherlv_1= '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) (otherlv_3= '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ otherlv_5= ')' ) ) ( (lv_repeatOperator_6_0= ruleRepeatOperator ) )? ) ;
    public final EObject rulePathSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_alternatives_0_0 = null;

        EObject lv_alternatives_2_0 = null;

        EObject lv_alternatives_4_0 = null;

        Enumerator lv_repeatOperator_6_0 = null;


         enterRule(); 
            
        try {
            // InternalPathExpressions.g:237:28: ( ( ( ( (lv_alternatives_0_0= rulePathSegmentDescription ) ) | (otherlv_1= '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) (otherlv_3= '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ otherlv_5= ')' ) ) ( (lv_repeatOperator_6_0= ruleRepeatOperator ) )? ) )
            // InternalPathExpressions.g:238:1: ( ( ( (lv_alternatives_0_0= rulePathSegmentDescription ) ) | (otherlv_1= '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) (otherlv_3= '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ otherlv_5= ')' ) ) ( (lv_repeatOperator_6_0= ruleRepeatOperator ) )? )
            {
            // InternalPathExpressions.g:238:1: ( ( ( (lv_alternatives_0_0= rulePathSegmentDescription ) ) | (otherlv_1= '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) (otherlv_3= '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ otherlv_5= ')' ) ) ( (lv_repeatOperator_6_0= ruleRepeatOperator ) )? )
            // InternalPathExpressions.g:238:2: ( ( (lv_alternatives_0_0= rulePathSegmentDescription ) ) | (otherlv_1= '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) (otherlv_3= '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ otherlv_5= ')' ) ) ( (lv_repeatOperator_6_0= ruleRepeatOperator ) )?
            {
            // InternalPathExpressions.g:238:2: ( ( (lv_alternatives_0_0= rulePathSegmentDescription ) ) | (otherlv_1= '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) (otherlv_3= '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ otherlv_5= ')' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=22 && LA5_0<=24)) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPathExpressions.g:238:3: ( (lv_alternatives_0_0= rulePathSegmentDescription ) )
                    {
                    // InternalPathExpressions.g:238:3: ( (lv_alternatives_0_0= rulePathSegmentDescription ) )
                    // InternalPathExpressions.g:239:1: (lv_alternatives_0_0= rulePathSegmentDescription )
                    {
                    // InternalPathExpressions.g:239:1: (lv_alternatives_0_0= rulePathSegmentDescription )
                    // InternalPathExpressions.g:240:3: lv_alternatives_0_0= rulePathSegmentDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_alternatives_0_0=rulePathSegmentDescription();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathSegmentRule());
                    	        }
                           		add(
                           			current, 
                           			"alternatives",
                            		lv_alternatives_0_0, 
                            		"org.muml.storydiagram.expressions.PathExpressions.PathSegmentDescription");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPathExpressions.g:257:6: (otherlv_1= '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) (otherlv_3= '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ otherlv_5= ')' )
                    {
                    // InternalPathExpressions.g:257:6: (otherlv_1= '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) (otherlv_3= '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ otherlv_5= ')' )
                    // InternalPathExpressions.g:257:8: otherlv_1= '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) (otherlv_3= '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_10); 

                        	newLeafNode(otherlv_1, grammarAccess.getPathSegmentAccess().getLeftParenthesisKeyword_0_1_0());
                        
                    // InternalPathExpressions.g:261:1: ( (lv_alternatives_2_0= rulePathSegmentDescription ) )
                    // InternalPathExpressions.g:262:1: (lv_alternatives_2_0= rulePathSegmentDescription )
                    {
                    // InternalPathExpressions.g:262:1: (lv_alternatives_2_0= rulePathSegmentDescription )
                    // InternalPathExpressions.g:263:3: lv_alternatives_2_0= rulePathSegmentDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_5);
                    lv_alternatives_2_0=rulePathSegmentDescription();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathSegmentRule());
                    	        }
                           		add(
                           			current, 
                           			"alternatives",
                            		lv_alternatives_2_0, 
                            		"org.muml.storydiagram.expressions.PathExpressions.PathSegmentDescription");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalPathExpressions.g:279:2: (otherlv_3= '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==13) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPathExpressions.g:279:4: otherlv_3= '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_10); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getPathSegmentAccess().getVerticalLineKeyword_0_1_2_0());
                    	        
                    	    // InternalPathExpressions.g:283:1: ( (lv_alternatives_4_0= rulePathSegmentDescription ) )
                    	    // InternalPathExpressions.g:284:1: (lv_alternatives_4_0= rulePathSegmentDescription )
                    	    {
                    	    // InternalPathExpressions.g:284:1: (lv_alternatives_4_0= rulePathSegmentDescription )
                    	    // InternalPathExpressions.g:285:3: lv_alternatives_4_0= rulePathSegmentDescription
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_11);
                    	    lv_alternatives_4_0=rulePathSegmentDescription();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPathSegmentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"alternatives",
                    	            		lv_alternatives_4_0, 
                    	            		"org.muml.storydiagram.expressions.PathExpressions.PathSegmentDescription");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


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

                    otherlv_5=(Token)match(input,12,FOLLOW_9); 

                        	newLeafNode(otherlv_5, grammarAccess.getPathSegmentAccess().getRightParenthesisKeyword_0_1_3());
                        

                    }


                    }
                    break;

            }

            // InternalPathExpressions.g:305:3: ( (lv_repeatOperator_6_0= ruleRepeatOperator ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=19 && LA6_0<=21)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPathExpressions.g:306:1: (lv_repeatOperator_6_0= ruleRepeatOperator )
                    {
                    // InternalPathExpressions.g:306:1: (lv_repeatOperator_6_0= ruleRepeatOperator )
                    // InternalPathExpressions.g:307:3: lv_repeatOperator_6_0= ruleRepeatOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathSegmentAccess().getRepeatOperatorRepeatOperatorEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_repeatOperator_6_0=ruleRepeatOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathSegmentRule());
                    	        }
                           		set(
                           			current, 
                           			"repeatOperator",
                            		lv_repeatOperator_6_0, 
                            		"org.muml.storydiagram.expressions.PathExpressions.RepeatOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "rulePathSegment"


    // $ANTLR start "entryRulePathSegmentDescription"
    // InternalPathExpressions.g:331:1: entryRulePathSegmentDescription returns [EObject current=null] : iv_rulePathSegmentDescription= rulePathSegmentDescription EOF ;
    public final EObject entryRulePathSegmentDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathSegmentDescription = null;


        try {
            // InternalPathExpressions.g:332:2: (iv_rulePathSegmentDescription= rulePathSegmentDescription EOF )
            // InternalPathExpressions.g:333:2: iv_rulePathSegmentDescription= rulePathSegmentDescription EOF
            {
             newCompositeNode(grammarAccess.getPathSegmentDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathSegmentDescription=rulePathSegmentDescription();

            state._fsp--;

             current =iv_rulePathSegmentDescription; 
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
    // $ANTLR end "entryRulePathSegmentDescription"


    // $ANTLR start "rulePathSegmentDescription"
    // InternalPathExpressions.g:340:1: rulePathSegmentDescription returns [EObject current=null] : ( (this_ImplicitPathDescription_0= ruleImplicitPathDescription | this_ExplicitPathDescription_1= ruleExplicitPathDescription ) ( (lv_restrictionList_2_0= ruleRestrictionList ) )? ) ;
    public final EObject rulePathSegmentDescription() throws RecognitionException {
        EObject current = null;

        EObject this_ImplicitPathDescription_0 = null;

        EObject this_ExplicitPathDescription_1 = null;

        EObject lv_restrictionList_2_0 = null;


         enterRule(); 
            
        try {
            // InternalPathExpressions.g:343:28: ( ( (this_ImplicitPathDescription_0= ruleImplicitPathDescription | this_ExplicitPathDescription_1= ruleExplicitPathDescription ) ( (lv_restrictionList_2_0= ruleRestrictionList ) )? ) )
            // InternalPathExpressions.g:344:1: ( (this_ImplicitPathDescription_0= ruleImplicitPathDescription | this_ExplicitPathDescription_1= ruleExplicitPathDescription ) ( (lv_restrictionList_2_0= ruleRestrictionList ) )? )
            {
            // InternalPathExpressions.g:344:1: ( (this_ImplicitPathDescription_0= ruleImplicitPathDescription | this_ExplicitPathDescription_1= ruleExplicitPathDescription ) ( (lv_restrictionList_2_0= ruleRestrictionList ) )? )
            // InternalPathExpressions.g:344:2: (this_ImplicitPathDescription_0= ruleImplicitPathDescription | this_ExplicitPathDescription_1= ruleExplicitPathDescription ) ( (lv_restrictionList_2_0= ruleRestrictionList ) )?
            {
            // InternalPathExpressions.g:344:2: (this_ImplicitPathDescription_0= ruleImplicitPathDescription | this_ExplicitPathDescription_1= ruleExplicitPathDescription )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=22 && LA7_0<=24)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPathExpressions.g:345:5: this_ImplicitPathDescription_0= ruleImplicitPathDescription
                    {
                     
                            newCompositeNode(grammarAccess.getPathSegmentDescriptionAccess().getImplicitPathDescriptionParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_12);
                    this_ImplicitPathDescription_0=ruleImplicitPathDescription();

                    state._fsp--;

                     
                            current = this_ImplicitPathDescription_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalPathExpressions.g:355:5: this_ExplicitPathDescription_1= ruleExplicitPathDescription
                    {
                     
                            newCompositeNode(grammarAccess.getPathSegmentDescriptionAccess().getExplicitPathDescriptionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_12);
                    this_ExplicitPathDescription_1=ruleExplicitPathDescription();

                    state._fsp--;

                     
                            current = this_ExplicitPathDescription_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalPathExpressions.g:363:2: ( (lv_restrictionList_2_0= ruleRestrictionList ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPathExpressions.g:364:1: (lv_restrictionList_2_0= ruleRestrictionList )
                    {
                    // InternalPathExpressions.g:364:1: (lv_restrictionList_2_0= ruleRestrictionList )
                    // InternalPathExpressions.g:365:3: lv_restrictionList_2_0= ruleRestrictionList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathSegmentDescriptionAccess().getRestrictionListRestrictionListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_restrictionList_2_0=ruleRestrictionList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathSegmentDescriptionRule());
                    	        }
                           		set(
                           			current, 
                           			"restrictionList",
                            		lv_restrictionList_2_0, 
                            		"org.muml.storydiagram.expressions.PathExpressions.RestrictionList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "rulePathSegmentDescription"


    // $ANTLR start "entryRuleRestrictionList"
    // InternalPathExpressions.g:389:1: entryRuleRestrictionList returns [EObject current=null] : iv_ruleRestrictionList= ruleRestrictionList EOF ;
    public final EObject entryRuleRestrictionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictionList = null;


        try {
            // InternalPathExpressions.g:390:2: (iv_ruleRestrictionList= ruleRestrictionList EOF )
            // InternalPathExpressions.g:391:2: iv_ruleRestrictionList= ruleRestrictionList EOF
            {
             newCompositeNode(grammarAccess.getRestrictionListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestrictionList=ruleRestrictionList();

            state._fsp--;

             current =iv_ruleRestrictionList; 
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
    // $ANTLR end "entryRuleRestrictionList"


    // $ANTLR start "ruleRestrictionList"
    // InternalPathExpressions.g:398:1: ruleRestrictionList returns [EObject current=null] : (otherlv_0= '[' ( (lv_restrictions_1_0= ruleTypeRestriction ) ) (otherlv_2= ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleRestrictionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_restrictions_1_0 = null;

        EObject lv_restrictions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalPathExpressions.g:401:28: ( (otherlv_0= '[' ( (lv_restrictions_1_0= ruleTypeRestriction ) ) (otherlv_2= ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) ) )* otherlv_4= ']' ) )
            // InternalPathExpressions.g:402:1: (otherlv_0= '[' ( (lv_restrictions_1_0= ruleTypeRestriction ) ) (otherlv_2= ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) ) )* otherlv_4= ']' )
            {
            // InternalPathExpressions.g:402:1: (otherlv_0= '[' ( (lv_restrictions_1_0= ruleTypeRestriction ) ) (otherlv_2= ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) ) )* otherlv_4= ']' )
            // InternalPathExpressions.g:402:3: otherlv_0= '[' ( (lv_restrictions_1_0= ruleTypeRestriction ) ) (otherlv_2= ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_13); 

                	newLeafNode(otherlv_0, grammarAccess.getRestrictionListAccess().getLeftSquareBracketKeyword_0());
                
            // InternalPathExpressions.g:406:1: ( (lv_restrictions_1_0= ruleTypeRestriction ) )
            // InternalPathExpressions.g:407:1: (lv_restrictions_1_0= ruleTypeRestriction )
            {
            // InternalPathExpressions.g:407:1: (lv_restrictions_1_0= ruleTypeRestriction )
            // InternalPathExpressions.g:408:3: lv_restrictions_1_0= ruleTypeRestriction
            {
             
            	        newCompositeNode(grammarAccess.getRestrictionListAccess().getRestrictionsTypeRestrictionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_14);
            lv_restrictions_1_0=ruleTypeRestriction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestrictionListRule());
            	        }
                   		add(
                   			current, 
                   			"restrictions",
                    		lv_restrictions_1_0, 
                    		"org.muml.storydiagram.expressions.PathExpressions.TypeRestriction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalPathExpressions.g:424:2: (otherlv_2= ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPathExpressions.g:424:4: otherlv_2= ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_13); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRestrictionListAccess().getCommaKeyword_2_0());
            	        
            	    // InternalPathExpressions.g:428:1: ( (lv_restrictions_3_0= ruleTypeRestriction ) )
            	    // InternalPathExpressions.g:429:1: (lv_restrictions_3_0= ruleTypeRestriction )
            	    {
            	    // InternalPathExpressions.g:429:1: (lv_restrictions_3_0= ruleTypeRestriction )
            	    // InternalPathExpressions.g:430:3: lv_restrictions_3_0= ruleTypeRestriction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictionListAccess().getRestrictionsTypeRestrictionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_14);
            	    lv_restrictions_3_0=ruleTypeRestriction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestrictionListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"restrictions",
            	            		lv_restrictions_3_0, 
            	            		"org.muml.storydiagram.expressions.PathExpressions.TypeRestriction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getRestrictionListAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleRestrictionList"


    // $ANTLR start "entryRuleImplicitPathDescription"
    // InternalPathExpressions.g:458:1: entryRuleImplicitPathDescription returns [EObject current=null] : iv_ruleImplicitPathDescription= ruleImplicitPathDescription EOF ;
    public final EObject entryRuleImplicitPathDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitPathDescription = null;


        try {
            // InternalPathExpressions.g:459:2: (iv_ruleImplicitPathDescription= ruleImplicitPathDescription EOF )
            // InternalPathExpressions.g:460:2: iv_ruleImplicitPathDescription= ruleImplicitPathDescription EOF
            {
             newCompositeNode(grammarAccess.getImplicitPathDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplicitPathDescription=ruleImplicitPathDescription();

            state._fsp--;

             current =iv_ruleImplicitPathDescription; 
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
    // $ANTLR end "entryRuleImplicitPathDescription"


    // $ANTLR start "ruleImplicitPathDescription"
    // InternalPathExpressions.g:467:1: ruleImplicitPathDescription returns [EObject current=null] : ( (lv_kind_0_0= ruleImplicitPathKind ) ) ;
    public final EObject ruleImplicitPathDescription() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;


         enterRule(); 
            
        try {
            // InternalPathExpressions.g:470:28: ( ( (lv_kind_0_0= ruleImplicitPathKind ) ) )
            // InternalPathExpressions.g:471:1: ( (lv_kind_0_0= ruleImplicitPathKind ) )
            {
            // InternalPathExpressions.g:471:1: ( (lv_kind_0_0= ruleImplicitPathKind ) )
            // InternalPathExpressions.g:472:1: (lv_kind_0_0= ruleImplicitPathKind )
            {
            // InternalPathExpressions.g:472:1: (lv_kind_0_0= ruleImplicitPathKind )
            // InternalPathExpressions.g:473:3: lv_kind_0_0= ruleImplicitPathKind
            {
             
            	        newCompositeNode(grammarAccess.getImplicitPathDescriptionAccess().getKindImplicitPathKindEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_kind_0_0=ruleImplicitPathKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImplicitPathDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_0_0, 
                    		"org.muml.storydiagram.expressions.PathExpressions.ImplicitPathKind");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleImplicitPathDescription"


    // $ANTLR start "entryRuleExplicitPathDescription"
    // InternalPathExpressions.g:497:1: entryRuleExplicitPathDescription returns [EObject current=null] : iv_ruleExplicitPathDescription= ruleExplicitPathDescription EOF ;
    public final EObject entryRuleExplicitPathDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitPathDescription = null;


        try {
            // InternalPathExpressions.g:498:2: (iv_ruleExplicitPathDescription= ruleExplicitPathDescription EOF )
            // InternalPathExpressions.g:499:2: iv_ruleExplicitPathDescription= ruleExplicitPathDescription EOF
            {
             newCompositeNode(grammarAccess.getExplicitPathDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExplicitPathDescription=ruleExplicitPathDescription();

            state._fsp--;

             current =iv_ruleExplicitPathDescription; 
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
    // $ANTLR end "entryRuleExplicitPathDescription"


    // $ANTLR start "ruleExplicitPathDescription"
    // InternalPathExpressions.g:506:1: ruleExplicitPathDescription returns [EObject current=null] : ( (lv_associationName_0_0= RULE_ID ) ) ;
    public final EObject ruleExplicitPathDescription() throws RecognitionException {
        EObject current = null;

        Token lv_associationName_0_0=null;

         enterRule(); 
            
        try {
            // InternalPathExpressions.g:509:28: ( ( (lv_associationName_0_0= RULE_ID ) ) )
            // InternalPathExpressions.g:510:1: ( (lv_associationName_0_0= RULE_ID ) )
            {
            // InternalPathExpressions.g:510:1: ( (lv_associationName_0_0= RULE_ID ) )
            // InternalPathExpressions.g:511:1: (lv_associationName_0_0= RULE_ID )
            {
            // InternalPathExpressions.g:511:1: (lv_associationName_0_0= RULE_ID )
            // InternalPathExpressions.g:512:3: lv_associationName_0_0= RULE_ID
            {
            lv_associationName_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_associationName_0_0, grammarAccess.getExplicitPathDescriptionAccess().getAssociationNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExplicitPathDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"associationName",
                    		lv_associationName_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

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
    // $ANTLR end "ruleExplicitPathDescription"


    // $ANTLR start "entryRuleTypeRestriction"
    // InternalPathExpressions.g:536:1: entryRuleTypeRestriction returns [EObject current=null] : iv_ruleTypeRestriction= ruleTypeRestriction EOF ;
    public final EObject entryRuleTypeRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRestriction = null;


        try {
            // InternalPathExpressions.g:537:2: (iv_ruleTypeRestriction= ruleTypeRestriction EOF )
            // InternalPathExpressions.g:538:2: iv_ruleTypeRestriction= ruleTypeRestriction EOF
            {
             newCompositeNode(grammarAccess.getTypeRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeRestriction=ruleTypeRestriction();

            state._fsp--;

             current =iv_ruleTypeRestriction; 
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
    // $ANTLR end "entryRuleTypeRestriction"


    // $ANTLR start "ruleTypeRestriction"
    // InternalPathExpressions.g:545:1: ruleTypeRestriction returns [EObject current=null] : ( ( (lv_forbidden_0_0= '!' ) )? ( (lv_typeName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeRestriction() throws RecognitionException {
        EObject current = null;

        Token lv_forbidden_0_0=null;
        Token lv_typeName_1_0=null;

         enterRule(); 
            
        try {
            // InternalPathExpressions.g:548:28: ( ( ( (lv_forbidden_0_0= '!' ) )? ( (lv_typeName_1_0= RULE_ID ) ) ) )
            // InternalPathExpressions.g:549:1: ( ( (lv_forbidden_0_0= '!' ) )? ( (lv_typeName_1_0= RULE_ID ) ) )
            {
            // InternalPathExpressions.g:549:1: ( ( (lv_forbidden_0_0= '!' ) )? ( (lv_typeName_1_0= RULE_ID ) ) )
            // InternalPathExpressions.g:549:2: ( (lv_forbidden_0_0= '!' ) )? ( (lv_typeName_1_0= RULE_ID ) )
            {
            // InternalPathExpressions.g:549:2: ( (lv_forbidden_0_0= '!' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPathExpressions.g:550:1: (lv_forbidden_0_0= '!' )
                    {
                    // InternalPathExpressions.g:550:1: (lv_forbidden_0_0= '!' )
                    // InternalPathExpressions.g:551:3: lv_forbidden_0_0= '!'
                    {
                    lv_forbidden_0_0=(Token)match(input,18,FOLLOW_15); 

                            newLeafNode(lv_forbidden_0_0, grammarAccess.getTypeRestrictionAccess().getForbiddenExclamationMarkKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRestrictionRule());
                    	        }
                           		setWithLastConsumed(current, "forbidden", true, "!");
                    	    

                    }


                    }
                    break;

            }

            // InternalPathExpressions.g:564:3: ( (lv_typeName_1_0= RULE_ID ) )
            // InternalPathExpressions.g:565:1: (lv_typeName_1_0= RULE_ID )
            {
            // InternalPathExpressions.g:565:1: (lv_typeName_1_0= RULE_ID )
            // InternalPathExpressions.g:566:3: lv_typeName_1_0= RULE_ID
            {
            lv_typeName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_typeName_1_0, grammarAccess.getTypeRestrictionAccess().getTypeNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRestrictionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"typeName",
                    		lv_typeName_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

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
    // $ANTLR end "ruleTypeRestriction"


    // $ANTLR start "ruleRepeatOperator"
    // InternalPathExpressions.g:590:1: ruleRepeatOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'NO_REPEAT' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleRepeatOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalPathExpressions.g:592:28: ( ( (enumLiteral_0= 'NO_REPEAT' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalPathExpressions.g:593:1: ( (enumLiteral_0= 'NO_REPEAT' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalPathExpressions.g:593:1: ( (enumLiteral_0= 'NO_REPEAT' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPathExpressions.g:593:2: (enumLiteral_0= 'NO_REPEAT' )
                    {
                    // InternalPathExpressions.g:593:2: (enumLiteral_0= 'NO_REPEAT' )
                    // InternalPathExpressions.g:593:4: enumLiteral_0= 'NO_REPEAT'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                            current = grammarAccess.getRepeatOperatorAccess().getNO_REPEATEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRepeatOperatorAccess().getNO_REPEATEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalPathExpressions.g:599:6: (enumLiteral_1= '+' )
                    {
                    // InternalPathExpressions.g:599:6: (enumLiteral_1= '+' )
                    // InternalPathExpressions.g:599:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                            current = grammarAccess.getRepeatOperatorAccess().getAT_LEAST_ONCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRepeatOperatorAccess().getAT_LEAST_ONCEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalPathExpressions.g:605:6: (enumLiteral_2= '*' )
                    {
                    // InternalPathExpressions.g:605:6: (enumLiteral_2= '*' )
                    // InternalPathExpressions.g:605:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_2); 

                            current = grammarAccess.getRepeatOperatorAccess().getARBITRARYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRepeatOperatorAccess().getARBITRARYEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleRepeatOperator"


    // $ANTLR start "ruleImplicitPathKind"
    // InternalPathExpressions.g:615:1: ruleImplicitPathKind returns [Enumerator current=null] : ( (enumLiteral_0= '-->' ) | (enumLiteral_1= '<>-->' ) | (enumLiteral_2= '--><>' ) ) ;
    public final Enumerator ruleImplicitPathKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalPathExpressions.g:617:28: ( ( (enumLiteral_0= '-->' ) | (enumLiteral_1= '<>-->' ) | (enumLiteral_2= '--><>' ) ) )
            // InternalPathExpressions.g:618:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= '<>-->' ) | (enumLiteral_2= '--><>' ) )
            {
            // InternalPathExpressions.g:618:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= '<>-->' ) | (enumLiteral_2= '--><>' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPathExpressions.g:618:2: (enumLiteral_0= '-->' )
                    {
                    // InternalPathExpressions.g:618:2: (enumLiteral_0= '-->' )
                    // InternalPathExpressions.g:618:4: enumLiteral_0= '-->'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                            current = grammarAccess.getImplicitPathKindAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImplicitPathKindAccess().getANYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalPathExpressions.g:624:6: (enumLiteral_1= '<>-->' )
                    {
                    // InternalPathExpressions.g:624:6: (enumLiteral_1= '<>-->' )
                    // InternalPathExpressions.g:624:8: enumLiteral_1= '<>-->'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                            current = grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_SOURCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_SOURCEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalPathExpressions.g:630:6: (enumLiteral_2= '--><>' )
                    {
                    // InternalPathExpressions.g:630:6: (enumLiteral_2= '--><>' )
                    // InternalPathExpressions.g:630:8: enumLiteral_2= '--><>'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                            current = grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_TARGETEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_TARGETEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleImplicitPathKind"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\4\4\14\1\uffff\2\4\1\20\1\4\1\14\1\4\1\20";
    static final String dfa_3s = "\1\30\1\uffff\1\30\4\25\1\uffff\1\22\1\4\1\21\1\22\1\25\1\4\1\21";
    static final String dfa_4s = "\1\uffff\1\1\5\uffff\1\2\7\uffff";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\6\uffff\1\2\12\uffff\3\1",
            "",
            "\1\6\6\uffff\1\7\12\uffff\1\3\1\4\1\5",
            "\1\7\1\1\1\7\1\10\3\uffff\3\7",
            "\1\7\1\1\1\7\1\10\3\uffff\3\7",
            "\1\7\1\1\1\7\1\10\3\uffff\3\7",
            "\1\7\1\1\1\7\1\10\3\uffff\3\7",
            "",
            "\1\12\15\uffff\1\11",
            "\1\12",
            "\1\13\1\14",
            "\1\16\15\uffff\1\15",
            "\1\7\1\1\1\7\4\uffff\3\7",
            "\1\16",
            "\1\13\1\14"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "81:1: ( ( (lv_pathAlternatives_0_0= rulePath ) ) | (otherlv_1= '(' ( (lv_pathAlternatives_2_0= rulePath ) ) otherlv_3= ')' (otherlv_4= '|' otherlv_5= '(' ( (lv_pathAlternatives_6_0= rulePath ) ) otherlv_7= ')' )+ ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001C00810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001C00010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});

}