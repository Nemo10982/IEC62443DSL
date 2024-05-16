package org.xtext.iec62443.baseModel.parser.antlr.internal;

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
import org.xtext.iec62443.baseModel.services.MiecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiecParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOL", "RULE_FLOAT", "RULE_SINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'description'", "'{'", "'name'", "'='", "';'", "'function'", "'equipment'", "'assumptions'", "'}'", "'trusted'", "'physical'", "'Zone'", "'target'", "'components'", "','", "'countermeasures'", "'subzones'", "'['", "']'", "'('", "'inactive'", "'capability'", "'cost'", "')'", "'Conduit'", "'connects'", "'channels'", "'organisations'", "'accessPoints'", "'policies'", "'dataflows'", "'network'", "'embedded'", "'host'", "'device'", "'properties'", "'system'", "'devices'", "'application'", "'executed'", "'on'", "'nothing'", "'scoreCalc'", "'constraints'", "'needs'", "'level'", "'communicates'", "'with'", "'if'", "'then'", "'else'", "'numerical'", "'cmp'", "'optional'", "'ref'", "'self'", "'SL0'", "'SL1'", "'SL2'", "'SL3'", "'SL4'", "'NR'", "'!='", "'>'", "'>='", "'<='", "'<'", "'+'", "'-'", "'*'", "'/'", "'max'", "'min'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SINT=8;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_BOOL=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalMiecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiecParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMiec.g"; }



     	private MiecGrammarAccess grammarAccess;

        public InternalMiecParser(TokenStream input, MiecGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MiecGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMiec.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMiec.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMiec.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMiec.g:72:1: ruleModel returns [EObject current=null] : ( () (otherlv_1= 'Model' otherlv_2= 'description' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ';' otherlv_8= 'function' otherlv_9= '=' ( (lv_function_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= 'equipment' otherlv_13= '=' ( (lv_equipmentDescription_14_0= RULE_STRING ) ) otherlv_15= ';' otherlv_16= 'assumptions' otherlv_17= '=' ( (lv_assumptionsOnLocation_18_0= RULE_STRING ) ) otherlv_19= ';' otherlv_20= '}' )? ( ( (lv_zones_21_0= ruleClassicalZone ) ) | ( (lv_conduits_22_0= ruleConduit ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_function_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_equipmentDescription_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_assumptionsOnLocation_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_zones_21_0 = null;

        EObject lv_conduits_22_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:78:2: ( ( () (otherlv_1= 'Model' otherlv_2= 'description' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ';' otherlv_8= 'function' otherlv_9= '=' ( (lv_function_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= 'equipment' otherlv_13= '=' ( (lv_equipmentDescription_14_0= RULE_STRING ) ) otherlv_15= ';' otherlv_16= 'assumptions' otherlv_17= '=' ( (lv_assumptionsOnLocation_18_0= RULE_STRING ) ) otherlv_19= ';' otherlv_20= '}' )? ( ( (lv_zones_21_0= ruleClassicalZone ) ) | ( (lv_conduits_22_0= ruleConduit ) ) )* ) )
            // InternalMiec.g:79:2: ( () (otherlv_1= 'Model' otherlv_2= 'description' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ';' otherlv_8= 'function' otherlv_9= '=' ( (lv_function_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= 'equipment' otherlv_13= '=' ( (lv_equipmentDescription_14_0= RULE_STRING ) ) otherlv_15= ';' otherlv_16= 'assumptions' otherlv_17= '=' ( (lv_assumptionsOnLocation_18_0= RULE_STRING ) ) otherlv_19= ';' otherlv_20= '}' )? ( ( (lv_zones_21_0= ruleClassicalZone ) ) | ( (lv_conduits_22_0= ruleConduit ) ) )* )
            {
            // InternalMiec.g:79:2: ( () (otherlv_1= 'Model' otherlv_2= 'description' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ';' otherlv_8= 'function' otherlv_9= '=' ( (lv_function_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= 'equipment' otherlv_13= '=' ( (lv_equipmentDescription_14_0= RULE_STRING ) ) otherlv_15= ';' otherlv_16= 'assumptions' otherlv_17= '=' ( (lv_assumptionsOnLocation_18_0= RULE_STRING ) ) otherlv_19= ';' otherlv_20= '}' )? ( ( (lv_zones_21_0= ruleClassicalZone ) ) | ( (lv_conduits_22_0= ruleConduit ) ) )* )
            // InternalMiec.g:80:3: () (otherlv_1= 'Model' otherlv_2= 'description' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ';' otherlv_8= 'function' otherlv_9= '=' ( (lv_function_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= 'equipment' otherlv_13= '=' ( (lv_equipmentDescription_14_0= RULE_STRING ) ) otherlv_15= ';' otherlv_16= 'assumptions' otherlv_17= '=' ( (lv_assumptionsOnLocation_18_0= RULE_STRING ) ) otherlv_19= ';' otherlv_20= '}' )? ( ( (lv_zones_21_0= ruleClassicalZone ) ) | ( (lv_conduits_22_0= ruleConduit ) ) )*
            {
            // InternalMiec.g:80:3: ()
            // InternalMiec.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalMiec.g:87:3: (otherlv_1= 'Model' otherlv_2= 'description' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ';' otherlv_8= 'function' otherlv_9= '=' ( (lv_function_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= 'equipment' otherlv_13= '=' ( (lv_equipmentDescription_14_0= RULE_STRING ) ) otherlv_15= ';' otherlv_16= 'assumptions' otherlv_17= '=' ( (lv_assumptionsOnLocation_18_0= RULE_STRING ) ) otherlv_19= ';' otherlv_20= '}' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMiec.g:88:4: otherlv_1= 'Model' otherlv_2= 'description' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ';' otherlv_8= 'function' otherlv_9= '=' ( (lv_function_10_0= RULE_STRING ) ) otherlv_11= ';' otherlv_12= 'equipment' otherlv_13= '=' ( (lv_equipmentDescription_14_0= RULE_STRING ) ) otherlv_15= ';' otherlv_16= 'assumptions' otherlv_17= '=' ( (lv_assumptionsOnLocation_18_0= RULE_STRING ) ) otherlv_19= ';' otherlv_20= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getDescriptionKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1_2());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getNameKeyword_1_3());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getEqualsSignKeyword_1_4());
                    			
                    // InternalMiec.g:108:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalMiec.g:109:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalMiec.g:109:5: (lv_name_6_0= RULE_ID )
                    // InternalMiec.g:110:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_name_6_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getModelAccess().getSemicolonKeyword_1_6());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getFunctionKeyword_1_7());
                    			
                    otherlv_9=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getModelAccess().getEqualsSignKeyword_1_8());
                    			
                    // InternalMiec.g:138:4: ( (lv_function_10_0= RULE_STRING ) )
                    // InternalMiec.g:139:5: (lv_function_10_0= RULE_STRING )
                    {
                    // InternalMiec.g:139:5: (lv_function_10_0= RULE_STRING )
                    // InternalMiec.g:140:6: lv_function_10_0= RULE_STRING
                    {
                    lv_function_10_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_function_10_0, grammarAccess.getModelAccess().getFunctionSTRINGTerminalRuleCall_1_9_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"function",
                    							lv_function_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getModelAccess().getSemicolonKeyword_1_10());
                    			
                    otherlv_12=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getModelAccess().getEquipmentKeyword_1_11());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getModelAccess().getEqualsSignKeyword_1_12());
                    			
                    // InternalMiec.g:168:4: ( (lv_equipmentDescription_14_0= RULE_STRING ) )
                    // InternalMiec.g:169:5: (lv_equipmentDescription_14_0= RULE_STRING )
                    {
                    // InternalMiec.g:169:5: (lv_equipmentDescription_14_0= RULE_STRING )
                    // InternalMiec.g:170:6: lv_equipmentDescription_14_0= RULE_STRING
                    {
                    lv_equipmentDescription_14_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_equipmentDescription_14_0, grammarAccess.getModelAccess().getEquipmentDescriptionSTRINGTerminalRuleCall_1_13_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"equipmentDescription",
                    							lv_equipmentDescription_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getModelAccess().getSemicolonKeyword_1_14());
                    			
                    otherlv_16=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getModelAccess().getAssumptionsKeyword_1_15());
                    			
                    otherlv_17=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getModelAccess().getEqualsSignKeyword_1_16());
                    			
                    // InternalMiec.g:198:4: ( (lv_assumptionsOnLocation_18_0= RULE_STRING ) )
                    // InternalMiec.g:199:5: (lv_assumptionsOnLocation_18_0= RULE_STRING )
                    {
                    // InternalMiec.g:199:5: (lv_assumptionsOnLocation_18_0= RULE_STRING )
                    // InternalMiec.g:200:6: lv_assumptionsOnLocation_18_0= RULE_STRING
                    {
                    lv_assumptionsOnLocation_18_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_assumptionsOnLocation_18_0, grammarAccess.getModelAccess().getAssumptionsOnLocationSTRINGTerminalRuleCall_1_17_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"assumptionsOnLocation",
                    							lv_assumptionsOnLocation_18_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getModelAccess().getSemicolonKeyword_1_18());
                    			
                    otherlv_20=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_1_19());
                    			

                    }
                    break;

            }

            // InternalMiec.g:225:3: ( ( (lv_zones_21_0= ruleClassicalZone ) ) | ( (lv_conduits_22_0= ruleConduit ) ) )*
            loop2:
            do {
                int alt2=3;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    switch ( input.LA(2) ) {
                    case 25:
                        {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3==26) ) {
                            alt2=1;
                        }
                        else if ( (LA2_3==39) ) {
                            alt2=2;
                        }


                        }
                        break;
                    case 26:
                        {
                        alt2=1;
                        }
                        break;
                    case 39:
                        {
                        alt2=2;
                        }
                        break;

                    }

                    }
                    break;
                case 25:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==26) ) {
                        alt2=1;
                    }
                    else if ( (LA2_3==39) ) {
                        alt2=2;
                    }


                    }
                    break;
                case 26:
                    {
                    alt2=1;
                    }
                    break;
                case 39:
                    {
                    alt2=2;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalMiec.g:226:4: ( (lv_zones_21_0= ruleClassicalZone ) )
            	    {
            	    // InternalMiec.g:226:4: ( (lv_zones_21_0= ruleClassicalZone ) )
            	    // InternalMiec.g:227:5: (lv_zones_21_0= ruleClassicalZone )
            	    {
            	    // InternalMiec.g:227:5: (lv_zones_21_0= ruleClassicalZone )
            	    // InternalMiec.g:228:6: lv_zones_21_0= ruleClassicalZone
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getZonesClassicalZoneParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_zones_21_0=ruleClassicalZone();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"zones",
            	    							lv_zones_21_0,
            	    							"org.xtext.iec62443.baseModel.Miec.ClassicalZone");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMiec.g:246:4: ( (lv_conduits_22_0= ruleConduit ) )
            	    {
            	    // InternalMiec.g:246:4: ( (lv_conduits_22_0= ruleConduit ) )
            	    // InternalMiec.g:247:5: (lv_conduits_22_0= ruleConduit )
            	    {
            	    // InternalMiec.g:247:5: (lv_conduits_22_0= ruleConduit )
            	    // InternalMiec.g:248:6: lv_conduits_22_0= ruleConduit
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getConduitsConduitParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_conduits_22_0=ruleConduit();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conduits",
            	    							lv_conduits_22_0,
            	    							"org.xtext.iec62443.baseModel.Miec.Conduit");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleComponent"
    // InternalMiec.g:270:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMiec.g:270:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalMiec.g:271:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMiec.g:277:1: ruleComponent returns [EObject current=null] : (this_Device_0= ruleDevice | this_System_1= ruleSystem | this_Application_2= ruleApplication ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Device_0 = null;

        EObject this_System_1 = null;

        EObject this_Application_2 = null;



        	enterRule();

        try {
            // InternalMiec.g:283:2: ( (this_Device_0= ruleDevice | this_System_1= ruleSystem | this_Application_2= ruleApplication ) )
            // InternalMiec.g:284:2: (this_Device_0= ruleDevice | this_System_1= ruleSystem | this_Application_2= ruleApplication )
            {
            // InternalMiec.g:284:2: (this_Device_0= ruleDevice | this_System_1= ruleSystem | this_Application_2= ruleApplication )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                switch ( input.LA(2) ) {
                case 51:
                    {
                    alt3=2;
                    }
                    break;
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case RULE_ID:
                case 46:
                case 47:
                case 48:
                case 49:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMiec.g:285:3: this_Device_0= ruleDevice
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getDeviceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Device_0=ruleDevice();

                    state._fsp--;


                    			current = this_Device_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiec.g:294:3: this_System_1= ruleSystem
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getSystemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_System_1=ruleSystem();

                    state._fsp--;


                    			current = this_System_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMiec.g:303:3: this_Application_2= ruleApplication
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getApplicationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Application_2=ruleApplication();

                    state._fsp--;


                    			current = this_Application_2;
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleZone"
    // InternalMiec.g:315:1: entryRuleZone returns [EObject current=null] : iv_ruleZone= ruleZone EOF ;
    public final EObject entryRuleZone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZone = null;


        try {
            // InternalMiec.g:315:45: (iv_ruleZone= ruleZone EOF )
            // InternalMiec.g:316:2: iv_ruleZone= ruleZone EOF
            {
             newCompositeNode(grammarAccess.getZoneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZone=ruleZone();

            state._fsp--;

             current =iv_ruleZone; 
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
    // $ANTLR end "entryRuleZone"


    // $ANTLR start "ruleZone"
    // InternalMiec.g:322:1: ruleZone returns [EObject current=null] : (this_ClassicalZone_0= ruleClassicalZone | this_Conduit_1= ruleConduit ) ;
    public final EObject ruleZone() throws RecognitionException {
        EObject current = null;

        EObject this_ClassicalZone_0 = null;

        EObject this_Conduit_1 = null;



        	enterRule();

        try {
            // InternalMiec.g:328:2: ( (this_ClassicalZone_0= ruleClassicalZone | this_Conduit_1= ruleConduit ) )
            // InternalMiec.g:329:2: (this_ClassicalZone_0= ruleClassicalZone | this_Conduit_1= ruleConduit )
            {
            // InternalMiec.g:329:2: (this_ClassicalZone_0= ruleClassicalZone | this_Conduit_1= ruleConduit )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 24:
                {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==26) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==39) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 26:
                    {
                    alt4=1;
                    }
                    break;
                case 39:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 25:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==26) ) {
                    alt4=1;
                }
                else if ( (LA4_2==39) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt4=1;
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMiec.g:330:3: this_ClassicalZone_0= ruleClassicalZone
                    {

                    			newCompositeNode(grammarAccess.getZoneAccess().getClassicalZoneParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassicalZone_0=ruleClassicalZone();

                    state._fsp--;


                    			current = this_ClassicalZone_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiec.g:339:3: this_Conduit_1= ruleConduit
                    {

                    			newCompositeNode(grammarAccess.getZoneAccess().getConduitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conduit_1=ruleConduit();

                    state._fsp--;


                    			current = this_Conduit_1;
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
    // $ANTLR end "ruleZone"


    // $ANTLR start "entryRuleClassicalZone"
    // InternalMiec.g:351:1: entryRuleClassicalZone returns [EObject current=null] : iv_ruleClassicalZone= ruleClassicalZone EOF ;
    public final EObject entryRuleClassicalZone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassicalZone = null;


        try {
            // InternalMiec.g:351:54: (iv_ruleClassicalZone= ruleClassicalZone EOF )
            // InternalMiec.g:352:2: iv_ruleClassicalZone= ruleClassicalZone EOF
            {
             newCompositeNode(grammarAccess.getClassicalZoneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassicalZone=ruleClassicalZone();

            state._fsp--;

             current =iv_ruleClassicalZone; 
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
    // $ANTLR end "entryRuleClassicalZone"


    // $ANTLR start "ruleClassicalZone"
    // InternalMiec.g:358:1: ruleClassicalZone returns [EObject current=null] : ( ( (lv_trusted_0_0= 'trusted' ) )? ( (lv_physical_1_0= 'physical' ) )? otherlv_2= 'Zone' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'target' ( (lv_target_6_0= ruleSecurityLevels ) ) (otherlv_7= ';' ( (lv_furtherDesc_8_0= ruleFurtherZoneDescription ) ) )? (otherlv_9= ';' otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}' )? (otherlv_16= ';' otherlv_17= 'countermeasures' otherlv_18= '{' ( (lv_countermeasures_19_0= rulecounterMeasure ) ) (otherlv_20= ',' ( (lv_countermeasures_21_0= rulecounterMeasure ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'subzones' otherlv_25= '{' ( (lv_subZones_26_0= ruleZone ) ) (otherlv_27= ';' ( (lv_subZones_28_0= ruleZone ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleClassicalZone() throws RecognitionException {
        EObject current = null;

        Token lv_trusted_0_0=null;
        Token lv_physical_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        EObject lv_target_6_0 = null;

        EObject lv_furtherDesc_8_0 = null;

        EObject lv_components_12_0 = null;

        EObject lv_components_14_0 = null;

        EObject lv_countermeasures_19_0 = null;

        EObject lv_countermeasures_21_0 = null;

        EObject lv_subZones_26_0 = null;

        EObject lv_subZones_28_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:364:2: ( ( ( (lv_trusted_0_0= 'trusted' ) )? ( (lv_physical_1_0= 'physical' ) )? otherlv_2= 'Zone' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'target' ( (lv_target_6_0= ruleSecurityLevels ) ) (otherlv_7= ';' ( (lv_furtherDesc_8_0= ruleFurtherZoneDescription ) ) )? (otherlv_9= ';' otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}' )? (otherlv_16= ';' otherlv_17= 'countermeasures' otherlv_18= '{' ( (lv_countermeasures_19_0= rulecounterMeasure ) ) (otherlv_20= ',' ( (lv_countermeasures_21_0= rulecounterMeasure ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'subzones' otherlv_25= '{' ( (lv_subZones_26_0= ruleZone ) ) (otherlv_27= ';' ( (lv_subZones_28_0= ruleZone ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalMiec.g:365:2: ( ( (lv_trusted_0_0= 'trusted' ) )? ( (lv_physical_1_0= 'physical' ) )? otherlv_2= 'Zone' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'target' ( (lv_target_6_0= ruleSecurityLevels ) ) (otherlv_7= ';' ( (lv_furtherDesc_8_0= ruleFurtherZoneDescription ) ) )? (otherlv_9= ';' otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}' )? (otherlv_16= ';' otherlv_17= 'countermeasures' otherlv_18= '{' ( (lv_countermeasures_19_0= rulecounterMeasure ) ) (otherlv_20= ',' ( (lv_countermeasures_21_0= rulecounterMeasure ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'subzones' otherlv_25= '{' ( (lv_subZones_26_0= ruleZone ) ) (otherlv_27= ';' ( (lv_subZones_28_0= ruleZone ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalMiec.g:365:2: ( ( (lv_trusted_0_0= 'trusted' ) )? ( (lv_physical_1_0= 'physical' ) )? otherlv_2= 'Zone' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'target' ( (lv_target_6_0= ruleSecurityLevels ) ) (otherlv_7= ';' ( (lv_furtherDesc_8_0= ruleFurtherZoneDescription ) ) )? (otherlv_9= ';' otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}' )? (otherlv_16= ';' otherlv_17= 'countermeasures' otherlv_18= '{' ( (lv_countermeasures_19_0= rulecounterMeasure ) ) (otherlv_20= ',' ( (lv_countermeasures_21_0= rulecounterMeasure ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'subzones' otherlv_25= '{' ( (lv_subZones_26_0= ruleZone ) ) (otherlv_27= ';' ( (lv_subZones_28_0= ruleZone ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalMiec.g:366:3: ( (lv_trusted_0_0= 'trusted' ) )? ( (lv_physical_1_0= 'physical' ) )? otherlv_2= 'Zone' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'target' ( (lv_target_6_0= ruleSecurityLevels ) ) (otherlv_7= ';' ( (lv_furtherDesc_8_0= ruleFurtherZoneDescription ) ) )? (otherlv_9= ';' otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}' )? (otherlv_16= ';' otherlv_17= 'countermeasures' otherlv_18= '{' ( (lv_countermeasures_19_0= rulecounterMeasure ) ) (otherlv_20= ',' ( (lv_countermeasures_21_0= rulecounterMeasure ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'subzones' otherlv_25= '{' ( (lv_subZones_26_0= ruleZone ) ) (otherlv_27= ';' ( (lv_subZones_28_0= ruleZone ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // InternalMiec.g:366:3: ( (lv_trusted_0_0= 'trusted' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiec.g:367:4: (lv_trusted_0_0= 'trusted' )
                    {
                    // InternalMiec.g:367:4: (lv_trusted_0_0= 'trusted' )
                    // InternalMiec.g:368:5: lv_trusted_0_0= 'trusted'
                    {
                    lv_trusted_0_0=(Token)match(input,24,FOLLOW_15); 

                    					newLeafNode(lv_trusted_0_0, grammarAccess.getClassicalZoneAccess().getTrustedTrustedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassicalZoneRule());
                    					}
                    					setWithLastConsumed(current, "trusted", lv_trusted_0_0 != null, "trusted");
                    				

                    }


                    }
                    break;

            }

            // InternalMiec.g:380:3: ( (lv_physical_1_0= 'physical' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMiec.g:381:4: (lv_physical_1_0= 'physical' )
                    {
                    // InternalMiec.g:381:4: (lv_physical_1_0= 'physical' )
                    // InternalMiec.g:382:5: lv_physical_1_0= 'physical'
                    {
                    lv_physical_1_0=(Token)match(input,25,FOLLOW_16); 

                    					newLeafNode(lv_physical_1_0, grammarAccess.getClassicalZoneAccess().getPhysicalPhysicalKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassicalZoneRule());
                    					}
                    					setWithLastConsumed(current, "physical", lv_physical_1_0 != null, "physical");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getClassicalZoneAccess().getZoneKeyword_2());
            		
            // InternalMiec.g:398:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMiec.g:399:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMiec.g:399:4: (lv_name_3_0= RULE_ID )
            // InternalMiec.g:400:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_3_0, grammarAccess.getClassicalZoneAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassicalZoneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getClassicalZoneAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getClassicalZoneAccess().getTargetKeyword_5());
            		
            // InternalMiec.g:424:3: ( (lv_target_6_0= ruleSecurityLevels ) )
            // InternalMiec.g:425:4: (lv_target_6_0= ruleSecurityLevels )
            {
            // InternalMiec.g:425:4: (lv_target_6_0= ruleSecurityLevels )
            // InternalMiec.g:426:5: lv_target_6_0= ruleSecurityLevels
            {

            					newCompositeNode(grammarAccess.getClassicalZoneAccess().getTargetSecurityLevelsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_target_6_0=ruleSecurityLevels();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassicalZoneRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_6_0,
            						"org.xtext.iec62443.baseModel.Miec.SecurityLevels");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiec.g:443:3: (otherlv_7= ';' ( (lv_furtherDesc_8_0= ruleFurtherZoneDescription ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_STRING) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalMiec.g:444:4: otherlv_7= ';' ( (lv_furtherDesc_8_0= ruleFurtherZoneDescription ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassicalZoneAccess().getSemicolonKeyword_7_0());
                    			
                    // InternalMiec.g:448:4: ( (lv_furtherDesc_8_0= ruleFurtherZoneDescription ) )
                    // InternalMiec.g:449:5: (lv_furtherDesc_8_0= ruleFurtherZoneDescription )
                    {
                    // InternalMiec.g:449:5: (lv_furtherDesc_8_0= ruleFurtherZoneDescription )
                    // InternalMiec.g:450:6: lv_furtherDesc_8_0= ruleFurtherZoneDescription
                    {

                    						newCompositeNode(grammarAccess.getClassicalZoneAccess().getFurtherDescFurtherZoneDescriptionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_furtherDesc_8_0=ruleFurtherZoneDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassicalZoneRule());
                    						}
                    						set(
                    							current,
                    							"furtherDesc",
                    							lv_furtherDesc_8_0,
                    							"org.xtext.iec62443.baseModel.Miec.FurtherZoneDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMiec.g:468:3: (otherlv_9= ';' otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==28) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalMiec.g:469:4: otherlv_9= ';' otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) ) (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )* otherlv_15= '}'
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getClassicalZoneAccess().getSemicolonKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getClassicalZoneAccess().getComponentsKeyword_8_1());
                    			
                    otherlv_11=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getClassicalZoneAccess().getLeftCurlyBracketKeyword_8_2());
                    			
                    // InternalMiec.g:481:4: ( (lv_components_12_0= ruleComponent ) )
                    // InternalMiec.g:482:5: (lv_components_12_0= ruleComponent )
                    {
                    // InternalMiec.g:482:5: (lv_components_12_0= ruleComponent )
                    // InternalMiec.g:483:6: lv_components_12_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getClassicalZoneAccess().getComponentsComponentParserRuleCall_8_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_components_12_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassicalZoneRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_12_0,
                    							"org.xtext.iec62443.baseModel.Miec.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiec.g:500:4: (otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==29) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMiec.g:501:5: otherlv_13= ',' ( (lv_components_14_0= ruleComponent ) )
                    	    {
                    	    otherlv_13=(Token)match(input,29,FOLLOW_21); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getClassicalZoneAccess().getCommaKeyword_8_4_0());
                    	    				
                    	    // InternalMiec.g:505:5: ( (lv_components_14_0= ruleComponent ) )
                    	    // InternalMiec.g:506:6: (lv_components_14_0= ruleComponent )
                    	    {
                    	    // InternalMiec.g:506:6: (lv_components_14_0= ruleComponent )
                    	    // InternalMiec.g:507:7: lv_components_14_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassicalZoneAccess().getComponentsComponentParserRuleCall_8_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_components_14_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassicalZoneRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"components",
                    	    								lv_components_14_0,
                    	    								"org.xtext.iec62443.baseModel.Miec.Component");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getClassicalZoneAccess().getRightCurlyBracketKeyword_8_5());
                    			

                    }
                    break;

            }

            // InternalMiec.g:530:3: (otherlv_16= ';' otherlv_17= 'countermeasures' otherlv_18= '{' ( (lv_countermeasures_19_0= rulecounterMeasure ) ) (otherlv_20= ',' ( (lv_countermeasures_21_0= rulecounterMeasure ) ) )* otherlv_22= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==30) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalMiec.g:531:4: otherlv_16= ';' otherlv_17= 'countermeasures' otherlv_18= '{' ( (lv_countermeasures_19_0= rulecounterMeasure ) ) (otherlv_20= ',' ( (lv_countermeasures_21_0= rulecounterMeasure ) ) )* otherlv_22= '}'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_23); 

                    				newLeafNode(otherlv_16, grammarAccess.getClassicalZoneAccess().getSemicolonKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getClassicalZoneAccess().getCountermeasuresKeyword_9_1());
                    			
                    otherlv_18=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_18, grammarAccess.getClassicalZoneAccess().getLeftCurlyBracketKeyword_9_2());
                    			
                    // InternalMiec.g:543:4: ( (lv_countermeasures_19_0= rulecounterMeasure ) )
                    // InternalMiec.g:544:5: (lv_countermeasures_19_0= rulecounterMeasure )
                    {
                    // InternalMiec.g:544:5: (lv_countermeasures_19_0= rulecounterMeasure )
                    // InternalMiec.g:545:6: lv_countermeasures_19_0= rulecounterMeasure
                    {

                    						newCompositeNode(grammarAccess.getClassicalZoneAccess().getCountermeasuresCounterMeasureParserRuleCall_9_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_countermeasures_19_0=rulecounterMeasure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassicalZoneRule());
                    						}
                    						add(
                    							current,
                    							"countermeasures",
                    							lv_countermeasures_19_0,
                    							"org.xtext.iec62443.baseModel.Miec.counterMeasure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiec.g:562:4: (otherlv_20= ',' ( (lv_countermeasures_21_0= rulecounterMeasure ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==29) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMiec.g:563:5: otherlv_20= ',' ( (lv_countermeasures_21_0= rulecounterMeasure ) )
                    	    {
                    	    otherlv_20=(Token)match(input,29,FOLLOW_21); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getClassicalZoneAccess().getCommaKeyword_9_4_0());
                    	    				
                    	    // InternalMiec.g:567:5: ( (lv_countermeasures_21_0= rulecounterMeasure ) )
                    	    // InternalMiec.g:568:6: (lv_countermeasures_21_0= rulecounterMeasure )
                    	    {
                    	    // InternalMiec.g:568:6: (lv_countermeasures_21_0= rulecounterMeasure )
                    	    // InternalMiec.g:569:7: lv_countermeasures_21_0= rulecounterMeasure
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassicalZoneAccess().getCountermeasuresCounterMeasureParserRuleCall_9_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_countermeasures_21_0=rulecounterMeasure();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassicalZoneRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"countermeasures",
                    	    								lv_countermeasures_21_0,
                    	    								"org.xtext.iec62443.baseModel.Miec.counterMeasure");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_22, grammarAccess.getClassicalZoneAccess().getRightCurlyBracketKeyword_9_5());
                    			

                    }
                    break;

            }

            // InternalMiec.g:592:3: (otherlv_23= ';' otherlv_24= 'subzones' otherlv_25= '{' ( (lv_subZones_26_0= ruleZone ) ) (otherlv_27= ';' ( (lv_subZones_28_0= ruleZone ) ) )* otherlv_29= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMiec.g:593:4: otherlv_23= ';' otherlv_24= 'subzones' otherlv_25= '{' ( (lv_subZones_26_0= ruleZone ) ) (otherlv_27= ';' ( (lv_subZones_28_0= ruleZone ) ) )* otherlv_29= '}'
                    {
                    otherlv_23=(Token)match(input,19,FOLLOW_24); 

                    				newLeafNode(otherlv_23, grammarAccess.getClassicalZoneAccess().getSemicolonKeyword_10_0());
                    			
                    otherlv_24=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_24, grammarAccess.getClassicalZoneAccess().getSubzonesKeyword_10_1());
                    			
                    otherlv_25=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_25, grammarAccess.getClassicalZoneAccess().getLeftCurlyBracketKeyword_10_2());
                    			
                    // InternalMiec.g:605:4: ( (lv_subZones_26_0= ruleZone ) )
                    // InternalMiec.g:606:5: (lv_subZones_26_0= ruleZone )
                    {
                    // InternalMiec.g:606:5: (lv_subZones_26_0= ruleZone )
                    // InternalMiec.g:607:6: lv_subZones_26_0= ruleZone
                    {

                    						newCompositeNode(grammarAccess.getClassicalZoneAccess().getSubZonesZoneParserRuleCall_10_3_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_subZones_26_0=ruleZone();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassicalZoneRule());
                    						}
                    						add(
                    							current,
                    							"subZones",
                    							lv_subZones_26_0,
                    							"org.xtext.iec62443.baseModel.Miec.Zone");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiec.g:624:4: (otherlv_27= ';' ( (lv_subZones_28_0= ruleZone ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMiec.g:625:5: otherlv_27= ';' ( (lv_subZones_28_0= ruleZone ) )
                    	    {
                    	    otherlv_27=(Token)match(input,19,FOLLOW_25); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getClassicalZoneAccess().getSemicolonKeyword_10_4_0());
                    	    				
                    	    // InternalMiec.g:629:5: ( (lv_subZones_28_0= ruleZone ) )
                    	    // InternalMiec.g:630:6: (lv_subZones_28_0= ruleZone )
                    	    {
                    	    // InternalMiec.g:630:6: (lv_subZones_28_0= ruleZone )
                    	    // InternalMiec.g:631:7: lv_subZones_28_0= ruleZone
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassicalZoneAccess().getSubZonesZoneParserRuleCall_10_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_subZones_28_0=ruleZone();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassicalZoneRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subZones",
                    	    								lv_subZones_28_0,
                    	    								"org.xtext.iec62443.baseModel.Miec.Zone");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_29, grammarAccess.getClassicalZoneAccess().getRightCurlyBracketKeyword_10_5());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getClassicalZoneAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleClassicalZone"


    // $ANTLR start "entryRuleSecurityLevels"
    // InternalMiec.g:662:1: entryRuleSecurityLevels returns [EObject current=null] : iv_ruleSecurityLevels= ruleSecurityLevels EOF ;
    public final EObject entryRuleSecurityLevels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityLevels = null;


        try {
            // InternalMiec.g:662:55: (iv_ruleSecurityLevels= ruleSecurityLevels EOF )
            // InternalMiec.g:663:2: iv_ruleSecurityLevels= ruleSecurityLevels EOF
            {
             newCompositeNode(grammarAccess.getSecurityLevelsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecurityLevels=ruleSecurityLevels();

            state._fsp--;

             current =iv_ruleSecurityLevels; 
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
    // $ANTLR end "entryRuleSecurityLevels"


    // $ANTLR start "ruleSecurityLevels"
    // InternalMiec.g:669:1: ruleSecurityLevels returns [EObject current=null] : (otherlv_0= '[' ( (lv_accessControl_1_0= ruleSecurityLevel ) ) otherlv_2= ',' ( (lv_useControl_3_0= ruleSecurityLevel ) ) otherlv_4= ',' ( (lv_systemIntegrity_5_0= ruleSecurityLevel ) ) otherlv_6= ',' ( (lv_dataConfidentiality_7_0= ruleSecurityLevel ) ) otherlv_8= ',' ( (lv_restrictedDataFlow_9_0= ruleSecurityLevel ) ) otherlv_10= ',' ( (lv_timelyResponse_11_0= ruleSecurityLevel ) ) otherlv_12= ',' ( (lv_resourceAvailability_13_0= ruleSecurityLevel ) ) otherlv_14= ']' ) ;
    public final EObject ruleSecurityLevels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_accessControl_1_0 = null;

        Enumerator lv_useControl_3_0 = null;

        Enumerator lv_systemIntegrity_5_0 = null;

        Enumerator lv_dataConfidentiality_7_0 = null;

        Enumerator lv_restrictedDataFlow_9_0 = null;

        Enumerator lv_timelyResponse_11_0 = null;

        Enumerator lv_resourceAvailability_13_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:675:2: ( (otherlv_0= '[' ( (lv_accessControl_1_0= ruleSecurityLevel ) ) otherlv_2= ',' ( (lv_useControl_3_0= ruleSecurityLevel ) ) otherlv_4= ',' ( (lv_systemIntegrity_5_0= ruleSecurityLevel ) ) otherlv_6= ',' ( (lv_dataConfidentiality_7_0= ruleSecurityLevel ) ) otherlv_8= ',' ( (lv_restrictedDataFlow_9_0= ruleSecurityLevel ) ) otherlv_10= ',' ( (lv_timelyResponse_11_0= ruleSecurityLevel ) ) otherlv_12= ',' ( (lv_resourceAvailability_13_0= ruleSecurityLevel ) ) otherlv_14= ']' ) )
            // InternalMiec.g:676:2: (otherlv_0= '[' ( (lv_accessControl_1_0= ruleSecurityLevel ) ) otherlv_2= ',' ( (lv_useControl_3_0= ruleSecurityLevel ) ) otherlv_4= ',' ( (lv_systemIntegrity_5_0= ruleSecurityLevel ) ) otherlv_6= ',' ( (lv_dataConfidentiality_7_0= ruleSecurityLevel ) ) otherlv_8= ',' ( (lv_restrictedDataFlow_9_0= ruleSecurityLevel ) ) otherlv_10= ',' ( (lv_timelyResponse_11_0= ruleSecurityLevel ) ) otherlv_12= ',' ( (lv_resourceAvailability_13_0= ruleSecurityLevel ) ) otherlv_14= ']' )
            {
            // InternalMiec.g:676:2: (otherlv_0= '[' ( (lv_accessControl_1_0= ruleSecurityLevel ) ) otherlv_2= ',' ( (lv_useControl_3_0= ruleSecurityLevel ) ) otherlv_4= ',' ( (lv_systemIntegrity_5_0= ruleSecurityLevel ) ) otherlv_6= ',' ( (lv_dataConfidentiality_7_0= ruleSecurityLevel ) ) otherlv_8= ',' ( (lv_restrictedDataFlow_9_0= ruleSecurityLevel ) ) otherlv_10= ',' ( (lv_timelyResponse_11_0= ruleSecurityLevel ) ) otherlv_12= ',' ( (lv_resourceAvailability_13_0= ruleSecurityLevel ) ) otherlv_14= ']' )
            // InternalMiec.g:677:3: otherlv_0= '[' ( (lv_accessControl_1_0= ruleSecurityLevel ) ) otherlv_2= ',' ( (lv_useControl_3_0= ruleSecurityLevel ) ) otherlv_4= ',' ( (lv_systemIntegrity_5_0= ruleSecurityLevel ) ) otherlv_6= ',' ( (lv_dataConfidentiality_7_0= ruleSecurityLevel ) ) otherlv_8= ',' ( (lv_restrictedDataFlow_9_0= ruleSecurityLevel ) ) otherlv_10= ',' ( (lv_timelyResponse_11_0= ruleSecurityLevel ) ) otherlv_12= ',' ( (lv_resourceAvailability_13_0= ruleSecurityLevel ) ) otherlv_14= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSecurityLevelsAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMiec.g:681:3: ( (lv_accessControl_1_0= ruleSecurityLevel ) )
            // InternalMiec.g:682:4: (lv_accessControl_1_0= ruleSecurityLevel )
            {
            // InternalMiec.g:682:4: (lv_accessControl_1_0= ruleSecurityLevel )
            // InternalMiec.g:683:5: lv_accessControl_1_0= ruleSecurityLevel
            {

            					newCompositeNode(grammarAccess.getSecurityLevelsAccess().getAccessControlSecurityLevelEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_accessControl_1_0=ruleSecurityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecurityLevelsRule());
            					}
            					set(
            						current,
            						"accessControl",
            						lv_accessControl_1_0,
            						"org.xtext.iec62443.baseModel.Miec.SecurityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getSecurityLevelsAccess().getCommaKeyword_2());
            		
            // InternalMiec.g:704:3: ( (lv_useControl_3_0= ruleSecurityLevel ) )
            // InternalMiec.g:705:4: (lv_useControl_3_0= ruleSecurityLevel )
            {
            // InternalMiec.g:705:4: (lv_useControl_3_0= ruleSecurityLevel )
            // InternalMiec.g:706:5: lv_useControl_3_0= ruleSecurityLevel
            {

            					newCompositeNode(grammarAccess.getSecurityLevelsAccess().getUseControlSecurityLevelEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_useControl_3_0=ruleSecurityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecurityLevelsRule());
            					}
            					set(
            						current,
            						"useControl",
            						lv_useControl_3_0,
            						"org.xtext.iec62443.baseModel.Miec.SecurityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getSecurityLevelsAccess().getCommaKeyword_4());
            		
            // InternalMiec.g:727:3: ( (lv_systemIntegrity_5_0= ruleSecurityLevel ) )
            // InternalMiec.g:728:4: (lv_systemIntegrity_5_0= ruleSecurityLevel )
            {
            // InternalMiec.g:728:4: (lv_systemIntegrity_5_0= ruleSecurityLevel )
            // InternalMiec.g:729:5: lv_systemIntegrity_5_0= ruleSecurityLevel
            {

            					newCompositeNode(grammarAccess.getSecurityLevelsAccess().getSystemIntegritySecurityLevelEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_systemIntegrity_5_0=ruleSecurityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecurityLevelsRule());
            					}
            					set(
            						current,
            						"systemIntegrity",
            						lv_systemIntegrity_5_0,
            						"org.xtext.iec62443.baseModel.Miec.SecurityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getSecurityLevelsAccess().getCommaKeyword_6());
            		
            // InternalMiec.g:750:3: ( (lv_dataConfidentiality_7_0= ruleSecurityLevel ) )
            // InternalMiec.g:751:4: (lv_dataConfidentiality_7_0= ruleSecurityLevel )
            {
            // InternalMiec.g:751:4: (lv_dataConfidentiality_7_0= ruleSecurityLevel )
            // InternalMiec.g:752:5: lv_dataConfidentiality_7_0= ruleSecurityLevel
            {

            					newCompositeNode(grammarAccess.getSecurityLevelsAccess().getDataConfidentialitySecurityLevelEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_27);
            lv_dataConfidentiality_7_0=ruleSecurityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecurityLevelsRule());
            					}
            					set(
            						current,
            						"dataConfidentiality",
            						lv_dataConfidentiality_7_0,
            						"org.xtext.iec62443.baseModel.Miec.SecurityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_8, grammarAccess.getSecurityLevelsAccess().getCommaKeyword_8());
            		
            // InternalMiec.g:773:3: ( (lv_restrictedDataFlow_9_0= ruleSecurityLevel ) )
            // InternalMiec.g:774:4: (lv_restrictedDataFlow_9_0= ruleSecurityLevel )
            {
            // InternalMiec.g:774:4: (lv_restrictedDataFlow_9_0= ruleSecurityLevel )
            // InternalMiec.g:775:5: lv_restrictedDataFlow_9_0= ruleSecurityLevel
            {

            					newCompositeNode(grammarAccess.getSecurityLevelsAccess().getRestrictedDataFlowSecurityLevelEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_27);
            lv_restrictedDataFlow_9_0=ruleSecurityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecurityLevelsRule());
            					}
            					set(
            						current,
            						"restrictedDataFlow",
            						lv_restrictedDataFlow_9_0,
            						"org.xtext.iec62443.baseModel.Miec.SecurityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getSecurityLevelsAccess().getCommaKeyword_10());
            		
            // InternalMiec.g:796:3: ( (lv_timelyResponse_11_0= ruleSecurityLevel ) )
            // InternalMiec.g:797:4: (lv_timelyResponse_11_0= ruleSecurityLevel )
            {
            // InternalMiec.g:797:4: (lv_timelyResponse_11_0= ruleSecurityLevel )
            // InternalMiec.g:798:5: lv_timelyResponse_11_0= ruleSecurityLevel
            {

            					newCompositeNode(grammarAccess.getSecurityLevelsAccess().getTimelyResponseSecurityLevelEnumRuleCall_11_0());
            				
            pushFollow(FOLLOW_27);
            lv_timelyResponse_11_0=ruleSecurityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecurityLevelsRule());
            					}
            					set(
            						current,
            						"timelyResponse",
            						lv_timelyResponse_11_0,
            						"org.xtext.iec62443.baseModel.Miec.SecurityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_12, grammarAccess.getSecurityLevelsAccess().getCommaKeyword_12());
            		
            // InternalMiec.g:819:3: ( (lv_resourceAvailability_13_0= ruleSecurityLevel ) )
            // InternalMiec.g:820:4: (lv_resourceAvailability_13_0= ruleSecurityLevel )
            {
            // InternalMiec.g:820:4: (lv_resourceAvailability_13_0= ruleSecurityLevel )
            // InternalMiec.g:821:5: lv_resourceAvailability_13_0= ruleSecurityLevel
            {

            					newCompositeNode(grammarAccess.getSecurityLevelsAccess().getResourceAvailabilitySecurityLevelEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_28);
            lv_resourceAvailability_13_0=ruleSecurityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecurityLevelsRule());
            					}
            					set(
            						current,
            						"resourceAvailability",
            						lv_resourceAvailability_13_0,
            						"org.xtext.iec62443.baseModel.Miec.SecurityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getSecurityLevelsAccess().getRightSquareBracketKeyword_14());
            		

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
    // $ANTLR end "ruleSecurityLevels"


    // $ANTLR start "entryRulecounterMeasure"
    // InternalMiec.g:846:1: entryRulecounterMeasure returns [EObject current=null] : iv_rulecounterMeasure= rulecounterMeasure EOF ;
    public final EObject entryRulecounterMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecounterMeasure = null;


        try {
            // InternalMiec.g:846:55: (iv_rulecounterMeasure= rulecounterMeasure EOF )
            // InternalMiec.g:847:2: iv_rulecounterMeasure= rulecounterMeasure EOF
            {
             newCompositeNode(grammarAccess.getCounterMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecounterMeasure=rulecounterMeasure();

            state._fsp--;

             current =iv_rulecounterMeasure; 
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
    // $ANTLR end "entryRulecounterMeasure"


    // $ANTLR start "rulecounterMeasure"
    // InternalMiec.g:853:1: rulecounterMeasure returns [EObject current=null] : (otherlv_0= '(' ( (lv_inactive_1_0= 'inactive' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'capability' ( (lv_capability_5_0= ruleSecurityLevels ) ) (otherlv_6= ';' otherlv_7= 'cost' ( (lv_cost_8_0= rulePositiveIntegerValue ) ) )? otherlv_9= ')' ) ;
    public final EObject rulecounterMeasure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_inactive_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_capability_5_0 = null;

        EObject lv_cost_8_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:859:2: ( (otherlv_0= '(' ( (lv_inactive_1_0= 'inactive' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'capability' ( (lv_capability_5_0= ruleSecurityLevels ) ) (otherlv_6= ';' otherlv_7= 'cost' ( (lv_cost_8_0= rulePositiveIntegerValue ) ) )? otherlv_9= ')' ) )
            // InternalMiec.g:860:2: (otherlv_0= '(' ( (lv_inactive_1_0= 'inactive' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'capability' ( (lv_capability_5_0= ruleSecurityLevels ) ) (otherlv_6= ';' otherlv_7= 'cost' ( (lv_cost_8_0= rulePositiveIntegerValue ) ) )? otherlv_9= ')' )
            {
            // InternalMiec.g:860:2: (otherlv_0= '(' ( (lv_inactive_1_0= 'inactive' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'capability' ( (lv_capability_5_0= ruleSecurityLevels ) ) (otherlv_6= ';' otherlv_7= 'cost' ( (lv_cost_8_0= rulePositiveIntegerValue ) ) )? otherlv_9= ')' )
            // InternalMiec.g:861:3: otherlv_0= '(' ( (lv_inactive_1_0= 'inactive' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'capability' ( (lv_capability_5_0= ruleSecurityLevels ) ) (otherlv_6= ';' otherlv_7= 'cost' ( (lv_cost_8_0= rulePositiveIntegerValue ) ) )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getCounterMeasureAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMiec.g:865:3: ( (lv_inactive_1_0= 'inactive' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMiec.g:866:4: (lv_inactive_1_0= 'inactive' )
                    {
                    // InternalMiec.g:866:4: (lv_inactive_1_0= 'inactive' )
                    // InternalMiec.g:867:5: lv_inactive_1_0= 'inactive'
                    {
                    lv_inactive_1_0=(Token)match(input,35,FOLLOW_7); 

                    					newLeafNode(lv_inactive_1_0, grammarAccess.getCounterMeasureAccess().getInactiveInactiveKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCounterMeasureRule());
                    					}
                    					setWithLastConsumed(current, "inactive", lv_inactive_1_0 != null, "inactive");
                    				

                    }


                    }
                    break;

            }

            // InternalMiec.g:879:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMiec.g:880:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMiec.g:880:4: (lv_name_2_0= RULE_ID )
            // InternalMiec.g:881:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCounterMeasureAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCounterMeasureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getCounterMeasureAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getCounterMeasureAccess().getCapabilityKeyword_4());
            		
            // InternalMiec.g:905:3: ( (lv_capability_5_0= ruleSecurityLevels ) )
            // InternalMiec.g:906:4: (lv_capability_5_0= ruleSecurityLevels )
            {
            // InternalMiec.g:906:4: (lv_capability_5_0= ruleSecurityLevels )
            // InternalMiec.g:907:5: lv_capability_5_0= ruleSecurityLevels
            {

            					newCompositeNode(grammarAccess.getCounterMeasureAccess().getCapabilitySecurityLevelsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_31);
            lv_capability_5_0=ruleSecurityLevels();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCounterMeasureRule());
            					}
            					set(
            						current,
            						"capability",
            						lv_capability_5_0,
            						"org.xtext.iec62443.baseModel.Miec.SecurityLevels");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiec.g:924:3: (otherlv_6= ';' otherlv_7= 'cost' ( (lv_cost_8_0= rulePositiveIntegerValue ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMiec.g:925:4: otherlv_6= ';' otherlv_7= 'cost' ( (lv_cost_8_0= rulePositiveIntegerValue ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getCounterMeasureAccess().getSemicolonKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getCounterMeasureAccess().getCostKeyword_6_1());
                    			
                    // InternalMiec.g:933:4: ( (lv_cost_8_0= rulePositiveIntegerValue ) )
                    // InternalMiec.g:934:5: (lv_cost_8_0= rulePositiveIntegerValue )
                    {
                    // InternalMiec.g:934:5: (lv_cost_8_0= rulePositiveIntegerValue )
                    // InternalMiec.g:935:6: lv_cost_8_0= rulePositiveIntegerValue
                    {

                    						newCompositeNode(grammarAccess.getCounterMeasureAccess().getCostPositiveIntegerValueParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_cost_8_0=rulePositiveIntegerValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCounterMeasureRule());
                    						}
                    						set(
                    							current,
                    							"cost",
                    							lv_cost_8_0,
                    							"org.xtext.iec62443.baseModel.Miec.PositiveIntegerValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCounterMeasureAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "rulecounterMeasure"


    // $ANTLR start "entryRuleConduit"
    // InternalMiec.g:961:1: entryRuleConduit returns [EObject current=null] : iv_ruleConduit= ruleConduit EOF ;
    public final EObject entryRuleConduit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConduit = null;


        try {
            // InternalMiec.g:961:48: (iv_ruleConduit= ruleConduit EOF )
            // InternalMiec.g:962:2: iv_ruleConduit= ruleConduit EOF
            {
             newCompositeNode(grammarAccess.getConduitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConduit=ruleConduit();

            state._fsp--;

             current =iv_ruleConduit; 
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
    // $ANTLR end "entryRuleConduit"


    // $ANTLR start "ruleConduit"
    // InternalMiec.g:968:1: ruleConduit returns [EObject current=null] : ( ( (lv_trusted_0_0= 'trusted' ) )? ( (lv_physical_1_0= 'physical' ) )? otherlv_2= 'Conduit' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'connects' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' otherlv_11= ';' otherlv_12= 'target' ( (lv_target_13_0= ruleSecurityLevels ) ) (otherlv_14= ';' ( (lv_furtherDesc_15_0= ruleFurtherZoneDescription ) ) )? (otherlv_16= ';' otherlv_17= 'components' otherlv_18= '{' ( (lv_components_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_components_21_0= ruleComponent ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'countermeasures' otherlv_25= '{' ( (lv_countermeasures_26_0= rulecounterMeasure ) ) (otherlv_27= ',' ( (lv_countermeasures_28_0= rulecounterMeasure ) ) )* otherlv_29= '}' )? (otherlv_30= ';' otherlv_31= 'channels' otherlv_32= '{' ( (lv_channels_33_0= ruleChannel ) ) (otherlv_34= ',' ( (lv_channels_35_0= ruleChannel ) ) )* otherlv_36= '}' )? otherlv_37= '}' ) ;
    public final EObject ruleConduit() throws RecognitionException {
        EObject current = null;

        Token lv_trusted_0_0=null;
        Token lv_physical_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        EObject lv_target_13_0 = null;

        EObject lv_furtherDesc_15_0 = null;

        EObject lv_components_19_0 = null;

        EObject lv_components_21_0 = null;

        EObject lv_countermeasures_26_0 = null;

        EObject lv_countermeasures_28_0 = null;

        EObject lv_channels_33_0 = null;

        EObject lv_channels_35_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:974:2: ( ( ( (lv_trusted_0_0= 'trusted' ) )? ( (lv_physical_1_0= 'physical' ) )? otherlv_2= 'Conduit' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'connects' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' otherlv_11= ';' otherlv_12= 'target' ( (lv_target_13_0= ruleSecurityLevels ) ) (otherlv_14= ';' ( (lv_furtherDesc_15_0= ruleFurtherZoneDescription ) ) )? (otherlv_16= ';' otherlv_17= 'components' otherlv_18= '{' ( (lv_components_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_components_21_0= ruleComponent ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'countermeasures' otherlv_25= '{' ( (lv_countermeasures_26_0= rulecounterMeasure ) ) (otherlv_27= ',' ( (lv_countermeasures_28_0= rulecounterMeasure ) ) )* otherlv_29= '}' )? (otherlv_30= ';' otherlv_31= 'channels' otherlv_32= '{' ( (lv_channels_33_0= ruleChannel ) ) (otherlv_34= ',' ( (lv_channels_35_0= ruleChannel ) ) )* otherlv_36= '}' )? otherlv_37= '}' ) )
            // InternalMiec.g:975:2: ( ( (lv_trusted_0_0= 'trusted' ) )? ( (lv_physical_1_0= 'physical' ) )? otherlv_2= 'Conduit' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'connects' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' otherlv_11= ';' otherlv_12= 'target' ( (lv_target_13_0= ruleSecurityLevels ) ) (otherlv_14= ';' ( (lv_furtherDesc_15_0= ruleFurtherZoneDescription ) ) )? (otherlv_16= ';' otherlv_17= 'components' otherlv_18= '{' ( (lv_components_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_components_21_0= ruleComponent ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'countermeasures' otherlv_25= '{' ( (lv_countermeasures_26_0= rulecounterMeasure ) ) (otherlv_27= ',' ( (lv_countermeasures_28_0= rulecounterMeasure ) ) )* otherlv_29= '}' )? (otherlv_30= ';' otherlv_31= 'channels' otherlv_32= '{' ( (lv_channels_33_0= ruleChannel ) ) (otherlv_34= ',' ( (lv_channels_35_0= ruleChannel ) ) )* otherlv_36= '}' )? otherlv_37= '}' )
            {
            // InternalMiec.g:975:2: ( ( (lv_trusted_0_0= 'trusted' ) )? ( (lv_physical_1_0= 'physical' ) )? otherlv_2= 'Conduit' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'connects' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' otherlv_11= ';' otherlv_12= 'target' ( (lv_target_13_0= ruleSecurityLevels ) ) (otherlv_14= ';' ( (lv_furtherDesc_15_0= ruleFurtherZoneDescription ) ) )? (otherlv_16= ';' otherlv_17= 'components' otherlv_18= '{' ( (lv_components_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_components_21_0= ruleComponent ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'countermeasures' otherlv_25= '{' ( (lv_countermeasures_26_0= rulecounterMeasure ) ) (otherlv_27= ',' ( (lv_countermeasures_28_0= rulecounterMeasure ) ) )* otherlv_29= '}' )? (otherlv_30= ';' otherlv_31= 'channels' otherlv_32= '{' ( (lv_channels_33_0= ruleChannel ) ) (otherlv_34= ',' ( (lv_channels_35_0= ruleChannel ) ) )* otherlv_36= '}' )? otherlv_37= '}' )
            // InternalMiec.g:976:3: ( (lv_trusted_0_0= 'trusted' ) )? ( (lv_physical_1_0= 'physical' ) )? otherlv_2= 'Conduit' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'connects' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' otherlv_11= ';' otherlv_12= 'target' ( (lv_target_13_0= ruleSecurityLevels ) ) (otherlv_14= ';' ( (lv_furtherDesc_15_0= ruleFurtherZoneDescription ) ) )? (otherlv_16= ';' otherlv_17= 'components' otherlv_18= '{' ( (lv_components_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_components_21_0= ruleComponent ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'countermeasures' otherlv_25= '{' ( (lv_countermeasures_26_0= rulecounterMeasure ) ) (otherlv_27= ',' ( (lv_countermeasures_28_0= rulecounterMeasure ) ) )* otherlv_29= '}' )? (otherlv_30= ';' otherlv_31= 'channels' otherlv_32= '{' ( (lv_channels_33_0= ruleChannel ) ) (otherlv_34= ',' ( (lv_channels_35_0= ruleChannel ) ) )* otherlv_36= '}' )? otherlv_37= '}'
            {
            // InternalMiec.g:976:3: ( (lv_trusted_0_0= 'trusted' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMiec.g:977:4: (lv_trusted_0_0= 'trusted' )
                    {
                    // InternalMiec.g:977:4: (lv_trusted_0_0= 'trusted' )
                    // InternalMiec.g:978:5: lv_trusted_0_0= 'trusted'
                    {
                    lv_trusted_0_0=(Token)match(input,24,FOLLOW_35); 

                    					newLeafNode(lv_trusted_0_0, grammarAccess.getConduitAccess().getTrustedTrustedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConduitRule());
                    					}
                    					setWithLastConsumed(current, "trusted", lv_trusted_0_0 != null, "trusted");
                    				

                    }


                    }
                    break;

            }

            // InternalMiec.g:990:3: ( (lv_physical_1_0= 'physical' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMiec.g:991:4: (lv_physical_1_0= 'physical' )
                    {
                    // InternalMiec.g:991:4: (lv_physical_1_0= 'physical' )
                    // InternalMiec.g:992:5: lv_physical_1_0= 'physical'
                    {
                    lv_physical_1_0=(Token)match(input,25,FOLLOW_36); 

                    					newLeafNode(lv_physical_1_0, grammarAccess.getConduitAccess().getPhysicalPhysicalKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConduitRule());
                    					}
                    					setWithLastConsumed(current, "physical", lv_physical_1_0 != null, "physical");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getConduitAccess().getConduitKeyword_2());
            		
            // InternalMiec.g:1008:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMiec.g:1009:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMiec.g:1009:4: (lv_name_3_0= RULE_ID )
            // InternalMiec.g:1010:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_3_0, grammarAccess.getConduitAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConduitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getConduitAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,40,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getConduitAccess().getConnectsKeyword_5());
            		
            otherlv_6=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getConduitAccess().getLeftParenthesisKeyword_6());
            		
            // InternalMiec.g:1038:3: ( (otherlv_7= RULE_ID ) )
            // InternalMiec.g:1039:4: (otherlv_7= RULE_ID )
            {
            // InternalMiec.g:1039:4: (otherlv_7= RULE_ID )
            // InternalMiec.g:1040:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConduitRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_7, grammarAccess.getConduitAccess().getConnectsClassicalZoneCrossReference_7_0());
            				

            }


            }

            // InternalMiec.g:1051:3: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMiec.g:1052:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,29,FOLLOW_7); 

            	    				newLeafNode(otherlv_8, grammarAccess.getConduitAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMiec.g:1056:4: ( (otherlv_9= RULE_ID ) )
            	    // InternalMiec.g:1057:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalMiec.g:1057:5: (otherlv_9= RULE_ID )
            	    // InternalMiec.g:1058:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConduitRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    						newLeafNode(otherlv_9, grammarAccess.getConduitAccess().getConnectsClassicalZoneCrossReference_8_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_10=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getConduitAccess().getRightParenthesisKeyword_9());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getConduitAccess().getSemicolonKeyword_10());
            		
            otherlv_12=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getConduitAccess().getTargetKeyword_11());
            		
            // InternalMiec.g:1082:3: ( (lv_target_13_0= ruleSecurityLevels ) )
            // InternalMiec.g:1083:4: (lv_target_13_0= ruleSecurityLevels )
            {
            // InternalMiec.g:1083:4: (lv_target_13_0= ruleSecurityLevels )
            // InternalMiec.g:1084:5: lv_target_13_0= ruleSecurityLevels
            {

            					newCompositeNode(grammarAccess.getConduitAccess().getTargetSecurityLevelsParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_19);
            lv_target_13_0=ruleSecurityLevels();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConduitRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_13_0,
            						"org.xtext.iec62443.baseModel.Miec.SecurityLevels");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiec.g:1101:3: (otherlv_14= ';' ( (lv_furtherDesc_15_0= ruleFurtherZoneDescription ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_STRING) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalMiec.g:1102:4: otherlv_14= ';' ( (lv_furtherDesc_15_0= ruleFurtherZoneDescription ) )
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getConduitAccess().getSemicolonKeyword_13_0());
                    			
                    // InternalMiec.g:1106:4: ( (lv_furtherDesc_15_0= ruleFurtherZoneDescription ) )
                    // InternalMiec.g:1107:5: (lv_furtherDesc_15_0= ruleFurtherZoneDescription )
                    {
                    // InternalMiec.g:1107:5: (lv_furtherDesc_15_0= ruleFurtherZoneDescription )
                    // InternalMiec.g:1108:6: lv_furtherDesc_15_0= ruleFurtherZoneDescription
                    {

                    						newCompositeNode(grammarAccess.getConduitAccess().getFurtherDescFurtherZoneDescriptionParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_furtherDesc_15_0=ruleFurtherZoneDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConduitRule());
                    						}
                    						set(
                    							current,
                    							"furtherDesc",
                    							lv_furtherDesc_15_0,
                    							"org.xtext.iec62443.baseModel.Miec.FurtherZoneDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMiec.g:1126:3: (otherlv_16= ';' otherlv_17= 'components' otherlv_18= '{' ( (lv_components_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_components_21_0= ruleComponent ) ) )* otherlv_22= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==28) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalMiec.g:1127:4: otherlv_16= ';' otherlv_17= 'components' otherlv_18= '{' ( (lv_components_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_components_21_0= ruleComponent ) ) )* otherlv_22= '}'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_20); 

                    				newLeafNode(otherlv_16, grammarAccess.getConduitAccess().getSemicolonKeyword_14_0());
                    			
                    otherlv_17=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getConduitAccess().getComponentsKeyword_14_1());
                    			
                    otherlv_18=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_18, grammarAccess.getConduitAccess().getLeftCurlyBracketKeyword_14_2());
                    			
                    // InternalMiec.g:1139:4: ( (lv_components_19_0= ruleComponent ) )
                    // InternalMiec.g:1140:5: (lv_components_19_0= ruleComponent )
                    {
                    // InternalMiec.g:1140:5: (lv_components_19_0= ruleComponent )
                    // InternalMiec.g:1141:6: lv_components_19_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getConduitAccess().getComponentsComponentParserRuleCall_14_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_components_19_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConduitRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_19_0,
                    							"org.xtext.iec62443.baseModel.Miec.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiec.g:1158:4: (otherlv_20= ',' ( (lv_components_21_0= ruleComponent ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==29) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMiec.g:1159:5: otherlv_20= ',' ( (lv_components_21_0= ruleComponent ) )
                    	    {
                    	    otherlv_20=(Token)match(input,29,FOLLOW_21); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getConduitAccess().getCommaKeyword_14_4_0());
                    	    				
                    	    // InternalMiec.g:1163:5: ( (lv_components_21_0= ruleComponent ) )
                    	    // InternalMiec.g:1164:6: (lv_components_21_0= ruleComponent )
                    	    {
                    	    // InternalMiec.g:1164:6: (lv_components_21_0= ruleComponent )
                    	    // InternalMiec.g:1165:7: lv_components_21_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getConduitAccess().getComponentsComponentParserRuleCall_14_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_components_21_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConduitRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"components",
                    	    								lv_components_21_0,
                    	    								"org.xtext.iec62443.baseModel.Miec.Component");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_22, grammarAccess.getConduitAccess().getRightCurlyBracketKeyword_14_5());
                    			

                    }
                    break;

            }

            // InternalMiec.g:1188:3: (otherlv_23= ';' otherlv_24= 'countermeasures' otherlv_25= '{' ( (lv_countermeasures_26_0= rulecounterMeasure ) ) (otherlv_27= ',' ( (lv_countermeasures_28_0= rulecounterMeasure ) ) )* otherlv_29= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==30) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalMiec.g:1189:4: otherlv_23= ';' otherlv_24= 'countermeasures' otherlv_25= '{' ( (lv_countermeasures_26_0= rulecounterMeasure ) ) (otherlv_27= ',' ( (lv_countermeasures_28_0= rulecounterMeasure ) ) )* otherlv_29= '}'
                    {
                    otherlv_23=(Token)match(input,19,FOLLOW_23); 

                    				newLeafNode(otherlv_23, grammarAccess.getConduitAccess().getSemicolonKeyword_15_0());
                    			
                    otherlv_24=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_24, grammarAccess.getConduitAccess().getCountermeasuresKeyword_15_1());
                    			
                    otherlv_25=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_25, grammarAccess.getConduitAccess().getLeftCurlyBracketKeyword_15_2());
                    			
                    // InternalMiec.g:1201:4: ( (lv_countermeasures_26_0= rulecounterMeasure ) )
                    // InternalMiec.g:1202:5: (lv_countermeasures_26_0= rulecounterMeasure )
                    {
                    // InternalMiec.g:1202:5: (lv_countermeasures_26_0= rulecounterMeasure )
                    // InternalMiec.g:1203:6: lv_countermeasures_26_0= rulecounterMeasure
                    {

                    						newCompositeNode(grammarAccess.getConduitAccess().getCountermeasuresCounterMeasureParserRuleCall_15_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_countermeasures_26_0=rulecounterMeasure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConduitRule());
                    						}
                    						add(
                    							current,
                    							"countermeasures",
                    							lv_countermeasures_26_0,
                    							"org.xtext.iec62443.baseModel.Miec.counterMeasure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiec.g:1220:4: (otherlv_27= ',' ( (lv_countermeasures_28_0= rulecounterMeasure ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==29) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalMiec.g:1221:5: otherlv_27= ',' ( (lv_countermeasures_28_0= rulecounterMeasure ) )
                    	    {
                    	    otherlv_27=(Token)match(input,29,FOLLOW_21); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getConduitAccess().getCommaKeyword_15_4_0());
                    	    				
                    	    // InternalMiec.g:1225:5: ( (lv_countermeasures_28_0= rulecounterMeasure ) )
                    	    // InternalMiec.g:1226:6: (lv_countermeasures_28_0= rulecounterMeasure )
                    	    {
                    	    // InternalMiec.g:1226:6: (lv_countermeasures_28_0= rulecounterMeasure )
                    	    // InternalMiec.g:1227:7: lv_countermeasures_28_0= rulecounterMeasure
                    	    {

                    	    							newCompositeNode(grammarAccess.getConduitAccess().getCountermeasuresCounterMeasureParserRuleCall_15_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_countermeasures_28_0=rulecounterMeasure();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConduitRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"countermeasures",
                    	    								lv_countermeasures_28_0,
                    	    								"org.xtext.iec62443.baseModel.Miec.counterMeasure");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_29, grammarAccess.getConduitAccess().getRightCurlyBracketKeyword_15_5());
                    			

                    }
                    break;

            }

            // InternalMiec.g:1250:3: (otherlv_30= ';' otherlv_31= 'channels' otherlv_32= '{' ( (lv_channels_33_0= ruleChannel ) ) (otherlv_34= ',' ( (lv_channels_35_0= ruleChannel ) ) )* otherlv_36= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMiec.g:1251:4: otherlv_30= ';' otherlv_31= 'channels' otherlv_32= '{' ( (lv_channels_33_0= ruleChannel ) ) (otherlv_34= ',' ( (lv_channels_35_0= ruleChannel ) ) )* otherlv_36= '}'
                    {
                    otherlv_30=(Token)match(input,19,FOLLOW_39); 

                    				newLeafNode(otherlv_30, grammarAccess.getConduitAccess().getSemicolonKeyword_16_0());
                    			
                    otherlv_31=(Token)match(input,41,FOLLOW_4); 

                    				newLeafNode(otherlv_31, grammarAccess.getConduitAccess().getChannelsKeyword_16_1());
                    			
                    otherlv_32=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_32, grammarAccess.getConduitAccess().getLeftCurlyBracketKeyword_16_2());
                    			
                    // InternalMiec.g:1263:4: ( (lv_channels_33_0= ruleChannel ) )
                    // InternalMiec.g:1264:5: (lv_channels_33_0= ruleChannel )
                    {
                    // InternalMiec.g:1264:5: (lv_channels_33_0= ruleChannel )
                    // InternalMiec.g:1265:6: lv_channels_33_0= ruleChannel
                    {

                    						newCompositeNode(grammarAccess.getConduitAccess().getChannelsChannelParserRuleCall_16_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_channels_33_0=ruleChannel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConduitRule());
                    						}
                    						add(
                    							current,
                    							"channels",
                    							lv_channels_33_0,
                    							"org.xtext.iec62443.baseModel.Miec.Channel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiec.g:1282:4: (otherlv_34= ',' ( (lv_channels_35_0= ruleChannel ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==29) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMiec.g:1283:5: otherlv_34= ',' ( (lv_channels_35_0= ruleChannel ) )
                    	    {
                    	    otherlv_34=(Token)match(input,29,FOLLOW_21); 

                    	    					newLeafNode(otherlv_34, grammarAccess.getConduitAccess().getCommaKeyword_16_4_0());
                    	    				
                    	    // InternalMiec.g:1287:5: ( (lv_channels_35_0= ruleChannel ) )
                    	    // InternalMiec.g:1288:6: (lv_channels_35_0= ruleChannel )
                    	    {
                    	    // InternalMiec.g:1288:6: (lv_channels_35_0= ruleChannel )
                    	    // InternalMiec.g:1289:7: lv_channels_35_0= ruleChannel
                    	    {

                    	    							newCompositeNode(grammarAccess.getConduitAccess().getChannelsChannelParserRuleCall_16_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_channels_35_0=ruleChannel();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConduitRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"channels",
                    	    								lv_channels_35_0,
                    	    								"org.xtext.iec62443.baseModel.Miec.Channel");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_36, grammarAccess.getConduitAccess().getRightCurlyBracketKeyword_16_5());
                    			

                    }
                    break;

            }

            otherlv_37=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_37, grammarAccess.getConduitAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleConduit"


    // $ANTLR start "entryRuleFurtherZoneDescription"
    // InternalMiec.g:1320:1: entryRuleFurtherZoneDescription returns [EObject current=null] : iv_ruleFurtherZoneDescription= ruleFurtherZoneDescription EOF ;
    public final EObject entryRuleFurtherZoneDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFurtherZoneDescription = null;


        try {
            // InternalMiec.g:1320:63: (iv_ruleFurtherZoneDescription= ruleFurtherZoneDescription EOF )
            // InternalMiec.g:1321:2: iv_ruleFurtherZoneDescription= ruleFurtherZoneDescription EOF
            {
             newCompositeNode(grammarAccess.getFurtherZoneDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFurtherZoneDescription=ruleFurtherZoneDescription();

            state._fsp--;

             current =iv_ruleFurtherZoneDescription; 
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
    // $ANTLR end "entryRuleFurtherZoneDescription"


    // $ANTLR start "ruleFurtherZoneDescription"
    // InternalMiec.g:1327:1: ruleFurtherZoneDescription returns [EObject current=null] : ( ( (lv_logicalBoundary_0_0= RULE_STRING ) ) otherlv_1= ';' ( (lv_physicalBoundary_2_0= RULE_STRING ) ) (otherlv_3= ';' otherlv_4= 'organisations' otherlv_5= '{' ( (lv_organizations_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_organizations_8_0= RULE_STRING ) ) )* otherlv_9= '}' )? (otherlv_10= ';' otherlv_11= 'accessPoints' otherlv_12= '{' ( (lv_physicalAccessPoints_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_physicalAccessPoints_15_0= RULE_STRING ) ) )* otherlv_16= '}' )? (otherlv_17= ';' otherlv_18= 'policies' otherlv_19= '{' ( (lv_securityPolicies_20_0= RULE_STRING ) ) (otherlv_21= ',' ( (lv_securityPolicies_22_0= RULE_STRING ) ) )* otherlv_23= '}' )? (otherlv_24= ';' otherlv_25= 'dataflows' otherlv_26= '{' ( (lv_dataflows_27_0= ruleDataflow ) ) (otherlv_28= ',' ( (lv_dataflows_29_0= ruleDataflow ) ) )* otherlv_30= '}' )? ) ;
    public final EObject ruleFurtherZoneDescription() throws RecognitionException {
        EObject current = null;

        Token lv_logicalBoundary_0_0=null;
        Token otherlv_1=null;
        Token lv_physicalBoundary_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_organizations_6_0=null;
        Token otherlv_7=null;
        Token lv_organizations_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_physicalAccessPoints_13_0=null;
        Token otherlv_14=null;
        Token lv_physicalAccessPoints_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_securityPolicies_20_0=null;
        Token otherlv_21=null;
        Token lv_securityPolicies_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        EObject lv_dataflows_27_0 = null;

        EObject lv_dataflows_29_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:1333:2: ( ( ( (lv_logicalBoundary_0_0= RULE_STRING ) ) otherlv_1= ';' ( (lv_physicalBoundary_2_0= RULE_STRING ) ) (otherlv_3= ';' otherlv_4= 'organisations' otherlv_5= '{' ( (lv_organizations_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_organizations_8_0= RULE_STRING ) ) )* otherlv_9= '}' )? (otherlv_10= ';' otherlv_11= 'accessPoints' otherlv_12= '{' ( (lv_physicalAccessPoints_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_physicalAccessPoints_15_0= RULE_STRING ) ) )* otherlv_16= '}' )? (otherlv_17= ';' otherlv_18= 'policies' otherlv_19= '{' ( (lv_securityPolicies_20_0= RULE_STRING ) ) (otherlv_21= ',' ( (lv_securityPolicies_22_0= RULE_STRING ) ) )* otherlv_23= '}' )? (otherlv_24= ';' otherlv_25= 'dataflows' otherlv_26= '{' ( (lv_dataflows_27_0= ruleDataflow ) ) (otherlv_28= ',' ( (lv_dataflows_29_0= ruleDataflow ) ) )* otherlv_30= '}' )? ) )
            // InternalMiec.g:1334:2: ( ( (lv_logicalBoundary_0_0= RULE_STRING ) ) otherlv_1= ';' ( (lv_physicalBoundary_2_0= RULE_STRING ) ) (otherlv_3= ';' otherlv_4= 'organisations' otherlv_5= '{' ( (lv_organizations_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_organizations_8_0= RULE_STRING ) ) )* otherlv_9= '}' )? (otherlv_10= ';' otherlv_11= 'accessPoints' otherlv_12= '{' ( (lv_physicalAccessPoints_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_physicalAccessPoints_15_0= RULE_STRING ) ) )* otherlv_16= '}' )? (otherlv_17= ';' otherlv_18= 'policies' otherlv_19= '{' ( (lv_securityPolicies_20_0= RULE_STRING ) ) (otherlv_21= ',' ( (lv_securityPolicies_22_0= RULE_STRING ) ) )* otherlv_23= '}' )? (otherlv_24= ';' otherlv_25= 'dataflows' otherlv_26= '{' ( (lv_dataflows_27_0= ruleDataflow ) ) (otherlv_28= ',' ( (lv_dataflows_29_0= ruleDataflow ) ) )* otherlv_30= '}' )? )
            {
            // InternalMiec.g:1334:2: ( ( (lv_logicalBoundary_0_0= RULE_STRING ) ) otherlv_1= ';' ( (lv_physicalBoundary_2_0= RULE_STRING ) ) (otherlv_3= ';' otherlv_4= 'organisations' otherlv_5= '{' ( (lv_organizations_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_organizations_8_0= RULE_STRING ) ) )* otherlv_9= '}' )? (otherlv_10= ';' otherlv_11= 'accessPoints' otherlv_12= '{' ( (lv_physicalAccessPoints_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_physicalAccessPoints_15_0= RULE_STRING ) ) )* otherlv_16= '}' )? (otherlv_17= ';' otherlv_18= 'policies' otherlv_19= '{' ( (lv_securityPolicies_20_0= RULE_STRING ) ) (otherlv_21= ',' ( (lv_securityPolicies_22_0= RULE_STRING ) ) )* otherlv_23= '}' )? (otherlv_24= ';' otherlv_25= 'dataflows' otherlv_26= '{' ( (lv_dataflows_27_0= ruleDataflow ) ) (otherlv_28= ',' ( (lv_dataflows_29_0= ruleDataflow ) ) )* otherlv_30= '}' )? )
            // InternalMiec.g:1335:3: ( (lv_logicalBoundary_0_0= RULE_STRING ) ) otherlv_1= ';' ( (lv_physicalBoundary_2_0= RULE_STRING ) ) (otherlv_3= ';' otherlv_4= 'organisations' otherlv_5= '{' ( (lv_organizations_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_organizations_8_0= RULE_STRING ) ) )* otherlv_9= '}' )? (otherlv_10= ';' otherlv_11= 'accessPoints' otherlv_12= '{' ( (lv_physicalAccessPoints_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_physicalAccessPoints_15_0= RULE_STRING ) ) )* otherlv_16= '}' )? (otherlv_17= ';' otherlv_18= 'policies' otherlv_19= '{' ( (lv_securityPolicies_20_0= RULE_STRING ) ) (otherlv_21= ',' ( (lv_securityPolicies_22_0= RULE_STRING ) ) )* otherlv_23= '}' )? (otherlv_24= ';' otherlv_25= 'dataflows' otherlv_26= '{' ( (lv_dataflows_27_0= ruleDataflow ) ) (otherlv_28= ',' ( (lv_dataflows_29_0= ruleDataflow ) ) )* otherlv_30= '}' )?
            {
            // InternalMiec.g:1335:3: ( (lv_logicalBoundary_0_0= RULE_STRING ) )
            // InternalMiec.g:1336:4: (lv_logicalBoundary_0_0= RULE_STRING )
            {
            // InternalMiec.g:1336:4: (lv_logicalBoundary_0_0= RULE_STRING )
            // InternalMiec.g:1337:5: lv_logicalBoundary_0_0= RULE_STRING
            {
            lv_logicalBoundary_0_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_logicalBoundary_0_0, grammarAccess.getFurtherZoneDescriptionAccess().getLogicalBoundarySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFurtherZoneDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"logicalBoundary",
            						lv_logicalBoundary_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getFurtherZoneDescriptionAccess().getSemicolonKeyword_1());
            		
            // InternalMiec.g:1357:3: ( (lv_physicalBoundary_2_0= RULE_STRING ) )
            // InternalMiec.g:1358:4: (lv_physicalBoundary_2_0= RULE_STRING )
            {
            // InternalMiec.g:1358:4: (lv_physicalBoundary_2_0= RULE_STRING )
            // InternalMiec.g:1359:5: lv_physicalBoundary_2_0= RULE_STRING
            {
            lv_physicalBoundary_2_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_physicalBoundary_2_0, grammarAccess.getFurtherZoneDescriptionAccess().getPhysicalBoundarySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFurtherZoneDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"physicalBoundary",
            						lv_physicalBoundary_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMiec.g:1375:3: (otherlv_3= ';' otherlv_4= 'organisations' otherlv_5= '{' ( (lv_organizations_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_organizations_8_0= RULE_STRING ) ) )* otherlv_9= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==42) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalMiec.g:1376:4: otherlv_3= ';' otherlv_4= 'organisations' otherlv_5= '{' ( (lv_organizations_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_organizations_8_0= RULE_STRING ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_41); 

                    				newLeafNode(otherlv_3, grammarAccess.getFurtherZoneDescriptionAccess().getSemicolonKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getFurtherZoneDescriptionAccess().getOrganisationsKeyword_3_1());
                    			
                    otherlv_5=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getFurtherZoneDescriptionAccess().getLeftCurlyBracketKeyword_3_2());
                    			
                    // InternalMiec.g:1388:4: ( (lv_organizations_6_0= RULE_STRING ) )
                    // InternalMiec.g:1389:5: (lv_organizations_6_0= RULE_STRING )
                    {
                    // InternalMiec.g:1389:5: (lv_organizations_6_0= RULE_STRING )
                    // InternalMiec.g:1390:6: lv_organizations_6_0= RULE_STRING
                    {
                    lv_organizations_6_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_organizations_6_0, grammarAccess.getFurtherZoneDescriptionAccess().getOrganizationsSTRINGTerminalRuleCall_3_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFurtherZoneDescriptionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"organizations",
                    							lv_organizations_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalMiec.g:1406:4: (otherlv_7= ',' ( (lv_organizations_8_0= RULE_STRING ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==29) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalMiec.g:1407:5: otherlv_7= ',' ( (lv_organizations_8_0= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,29,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFurtherZoneDescriptionAccess().getCommaKeyword_3_4_0());
                    	    				
                    	    // InternalMiec.g:1411:5: ( (lv_organizations_8_0= RULE_STRING ) )
                    	    // InternalMiec.g:1412:6: (lv_organizations_8_0= RULE_STRING )
                    	    {
                    	    // InternalMiec.g:1412:6: (lv_organizations_8_0= RULE_STRING )
                    	    // InternalMiec.g:1413:7: lv_organizations_8_0= RULE_STRING
                    	    {
                    	    lv_organizations_8_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    	    							newLeafNode(lv_organizations_8_0, grammarAccess.getFurtherZoneDescriptionAccess().getOrganizationsSTRINGTerminalRuleCall_3_4_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFurtherZoneDescriptionRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"organizations",
                    	    								lv_organizations_8_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,23,FOLLOW_40); 

                    				newLeafNode(otherlv_9, grammarAccess.getFurtherZoneDescriptionAccess().getRightCurlyBracketKeyword_3_5());
                    			

                    }
                    break;

            }

            // InternalMiec.g:1435:3: (otherlv_10= ';' otherlv_11= 'accessPoints' otherlv_12= '{' ( (lv_physicalAccessPoints_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_physicalAccessPoints_15_0= RULE_STRING ) ) )* otherlv_16= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==43) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalMiec.g:1436:4: otherlv_10= ';' otherlv_11= 'accessPoints' otherlv_12= '{' ( (lv_physicalAccessPoints_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_physicalAccessPoints_15_0= RULE_STRING ) ) )* otherlv_16= '}'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_42); 

                    				newLeafNode(otherlv_10, grammarAccess.getFurtherZoneDescriptionAccess().getSemicolonKeyword_4_0());
                    			
                    otherlv_11=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getFurtherZoneDescriptionAccess().getAccessPointsKeyword_4_1());
                    			
                    otherlv_12=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getFurtherZoneDescriptionAccess().getLeftCurlyBracketKeyword_4_2());
                    			
                    // InternalMiec.g:1448:4: ( (lv_physicalAccessPoints_13_0= RULE_STRING ) )
                    // InternalMiec.g:1449:5: (lv_physicalAccessPoints_13_0= RULE_STRING )
                    {
                    // InternalMiec.g:1449:5: (lv_physicalAccessPoints_13_0= RULE_STRING )
                    // InternalMiec.g:1450:6: lv_physicalAccessPoints_13_0= RULE_STRING
                    {
                    lv_physicalAccessPoints_13_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_physicalAccessPoints_13_0, grammarAccess.getFurtherZoneDescriptionAccess().getPhysicalAccessPointsSTRINGTerminalRuleCall_4_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFurtherZoneDescriptionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"physicalAccessPoints",
                    							lv_physicalAccessPoints_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalMiec.g:1466:4: (otherlv_14= ',' ( (lv_physicalAccessPoints_15_0= RULE_STRING ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==29) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalMiec.g:1467:5: otherlv_14= ',' ( (lv_physicalAccessPoints_15_0= RULE_STRING ) )
                    	    {
                    	    otherlv_14=(Token)match(input,29,FOLLOW_10); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getFurtherZoneDescriptionAccess().getCommaKeyword_4_4_0());
                    	    				
                    	    // InternalMiec.g:1471:5: ( (lv_physicalAccessPoints_15_0= RULE_STRING ) )
                    	    // InternalMiec.g:1472:6: (lv_physicalAccessPoints_15_0= RULE_STRING )
                    	    {
                    	    // InternalMiec.g:1472:6: (lv_physicalAccessPoints_15_0= RULE_STRING )
                    	    // InternalMiec.g:1473:7: lv_physicalAccessPoints_15_0= RULE_STRING
                    	    {
                    	    lv_physicalAccessPoints_15_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    	    							newLeafNode(lv_physicalAccessPoints_15_0, grammarAccess.getFurtherZoneDescriptionAccess().getPhysicalAccessPointsSTRINGTerminalRuleCall_4_4_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFurtherZoneDescriptionRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"physicalAccessPoints",
                    	    								lv_physicalAccessPoints_15_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,23,FOLLOW_40); 

                    				newLeafNode(otherlv_16, grammarAccess.getFurtherZoneDescriptionAccess().getRightCurlyBracketKeyword_4_5());
                    			

                    }
                    break;

            }

            // InternalMiec.g:1495:3: (otherlv_17= ';' otherlv_18= 'policies' otherlv_19= '{' ( (lv_securityPolicies_20_0= RULE_STRING ) ) (otherlv_21= ',' ( (lv_securityPolicies_22_0= RULE_STRING ) ) )* otherlv_23= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==19) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==44) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // InternalMiec.g:1496:4: otherlv_17= ';' otherlv_18= 'policies' otherlv_19= '{' ( (lv_securityPolicies_20_0= RULE_STRING ) ) (otherlv_21= ',' ( (lv_securityPolicies_22_0= RULE_STRING ) ) )* otherlv_23= '}'
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_43); 

                    				newLeafNode(otherlv_17, grammarAccess.getFurtherZoneDescriptionAccess().getSemicolonKeyword_5_0());
                    			
                    otherlv_18=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getFurtherZoneDescriptionAccess().getPoliciesKeyword_5_1());
                    			
                    otherlv_19=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_19, grammarAccess.getFurtherZoneDescriptionAccess().getLeftCurlyBracketKeyword_5_2());
                    			
                    // InternalMiec.g:1508:4: ( (lv_securityPolicies_20_0= RULE_STRING ) )
                    // InternalMiec.g:1509:5: (lv_securityPolicies_20_0= RULE_STRING )
                    {
                    // InternalMiec.g:1509:5: (lv_securityPolicies_20_0= RULE_STRING )
                    // InternalMiec.g:1510:6: lv_securityPolicies_20_0= RULE_STRING
                    {
                    lv_securityPolicies_20_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_securityPolicies_20_0, grammarAccess.getFurtherZoneDescriptionAccess().getSecurityPoliciesSTRINGTerminalRuleCall_5_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFurtherZoneDescriptionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"securityPolicies",
                    							lv_securityPolicies_20_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalMiec.g:1526:4: (otherlv_21= ',' ( (lv_securityPolicies_22_0= RULE_STRING ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==29) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalMiec.g:1527:5: otherlv_21= ',' ( (lv_securityPolicies_22_0= RULE_STRING ) )
                    	    {
                    	    otherlv_21=(Token)match(input,29,FOLLOW_10); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getFurtherZoneDescriptionAccess().getCommaKeyword_5_4_0());
                    	    				
                    	    // InternalMiec.g:1531:5: ( (lv_securityPolicies_22_0= RULE_STRING ) )
                    	    // InternalMiec.g:1532:6: (lv_securityPolicies_22_0= RULE_STRING )
                    	    {
                    	    // InternalMiec.g:1532:6: (lv_securityPolicies_22_0= RULE_STRING )
                    	    // InternalMiec.g:1533:7: lv_securityPolicies_22_0= RULE_STRING
                    	    {
                    	    lv_securityPolicies_22_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    	    							newLeafNode(lv_securityPolicies_22_0, grammarAccess.getFurtherZoneDescriptionAccess().getSecurityPoliciesSTRINGTerminalRuleCall_5_4_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFurtherZoneDescriptionRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"securityPolicies",
                    	    								lv_securityPolicies_22_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,23,FOLLOW_40); 

                    				newLeafNode(otherlv_23, grammarAccess.getFurtherZoneDescriptionAccess().getRightCurlyBracketKeyword_5_5());
                    			

                    }
                    break;

            }

            // InternalMiec.g:1555:3: (otherlv_24= ';' otherlv_25= 'dataflows' otherlv_26= '{' ( (lv_dataflows_27_0= ruleDataflow ) ) (otherlv_28= ',' ( (lv_dataflows_29_0= ruleDataflow ) ) )* otherlv_30= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==19) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==45) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // InternalMiec.g:1556:4: otherlv_24= ';' otherlv_25= 'dataflows' otherlv_26= '{' ( (lv_dataflows_27_0= ruleDataflow ) ) (otherlv_28= ',' ( (lv_dataflows_29_0= ruleDataflow ) ) )* otherlv_30= '}'
                    {
                    otherlv_24=(Token)match(input,19,FOLLOW_44); 

                    				newLeafNode(otherlv_24, grammarAccess.getFurtherZoneDescriptionAccess().getSemicolonKeyword_6_0());
                    			
                    otherlv_25=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_25, grammarAccess.getFurtherZoneDescriptionAccess().getDataflowsKeyword_6_1());
                    			
                    otherlv_26=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_26, grammarAccess.getFurtherZoneDescriptionAccess().getLeftCurlyBracketKeyword_6_2());
                    			
                    // InternalMiec.g:1568:4: ( (lv_dataflows_27_0= ruleDataflow ) )
                    // InternalMiec.g:1569:5: (lv_dataflows_27_0= ruleDataflow )
                    {
                    // InternalMiec.g:1569:5: (lv_dataflows_27_0= ruleDataflow )
                    // InternalMiec.g:1570:6: lv_dataflows_27_0= ruleDataflow
                    {

                    						newCompositeNode(grammarAccess.getFurtherZoneDescriptionAccess().getDataflowsDataflowParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_dataflows_27_0=ruleDataflow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFurtherZoneDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"dataflows",
                    							lv_dataflows_27_0,
                    							"org.xtext.iec62443.baseModel.Miec.Dataflow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiec.g:1587:4: (otherlv_28= ',' ( (lv_dataflows_29_0= ruleDataflow ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==29) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalMiec.g:1588:5: otherlv_28= ',' ( (lv_dataflows_29_0= ruleDataflow ) )
                    	    {
                    	    otherlv_28=(Token)match(input,29,FOLLOW_21); 

                    	    					newLeafNode(otherlv_28, grammarAccess.getFurtherZoneDescriptionAccess().getCommaKeyword_6_4_0());
                    	    				
                    	    // InternalMiec.g:1592:5: ( (lv_dataflows_29_0= ruleDataflow ) )
                    	    // InternalMiec.g:1593:6: (lv_dataflows_29_0= ruleDataflow )
                    	    {
                    	    // InternalMiec.g:1593:6: (lv_dataflows_29_0= ruleDataflow )
                    	    // InternalMiec.g:1594:7: lv_dataflows_29_0= ruleDataflow
                    	    {

                    	    							newCompositeNode(grammarAccess.getFurtherZoneDescriptionAccess().getDataflowsDataflowParserRuleCall_6_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_dataflows_29_0=ruleDataflow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFurtherZoneDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dataflows",
                    	    								lv_dataflows_29_0,
                    	    								"org.xtext.iec62443.baseModel.Miec.Dataflow");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_30, grammarAccess.getFurtherZoneDescriptionAccess().getRightCurlyBracketKeyword_6_5());
                    			

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
    // $ANTLR end "ruleFurtherZoneDescription"


    // $ANTLR start "entryRuleDataflow"
    // InternalMiec.g:1621:1: entryRuleDataflow returns [EObject current=null] : iv_ruleDataflow= ruleDataflow EOF ;
    public final EObject entryRuleDataflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataflow = null;


        try {
            // InternalMiec.g:1621:49: (iv_ruleDataflow= ruleDataflow EOF )
            // InternalMiec.g:1622:2: iv_ruleDataflow= ruleDataflow EOF
            {
             newCompositeNode(grammarAccess.getDataflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataflow=ruleDataflow();

            state._fsp--;

             current =iv_ruleDataflow; 
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
    // $ANTLR end "entryRuleDataflow"


    // $ANTLR start "ruleDataflow"
    // InternalMiec.g:1628:1: ruleDataflow returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_protocol_5_0= RULE_STRING ) ) otherlv_6= ')' ) ;
    public final EObject ruleDataflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_protocol_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMiec.g:1634:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_protocol_5_0= RULE_STRING ) ) otherlv_6= ')' ) )
            // InternalMiec.g:1635:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_protocol_5_0= RULE_STRING ) ) otherlv_6= ')' )
            {
            // InternalMiec.g:1635:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_protocol_5_0= RULE_STRING ) ) otherlv_6= ')' )
            // InternalMiec.g:1636:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_protocol_5_0= RULE_STRING ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDataflowAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMiec.g:1640:3: ( (otherlv_1= RULE_ID ) )
            // InternalMiec.g:1641:4: (otherlv_1= RULE_ID )
            {
            // InternalMiec.g:1641:4: (otherlv_1= RULE_ID )
            // InternalMiec.g:1642:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataflowRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getDataflowAccess().getSourceComponentCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDataflowAccess().getCommaKeyword_2());
            		
            // InternalMiec.g:1657:3: ( (otherlv_3= RULE_ID ) )
            // InternalMiec.g:1658:4: (otherlv_3= RULE_ID )
            {
            // InternalMiec.g:1658:4: (otherlv_3= RULE_ID )
            // InternalMiec.g:1659:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataflowRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_3, grammarAccess.getDataflowAccess().getDestinationComponentCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDataflowAccess().getCommaKeyword_4());
            		
            // InternalMiec.g:1674:3: ( (lv_protocol_5_0= RULE_STRING ) )
            // InternalMiec.g:1675:4: (lv_protocol_5_0= RULE_STRING )
            {
            // InternalMiec.g:1675:4: (lv_protocol_5_0= RULE_STRING )
            // InternalMiec.g:1676:5: lv_protocol_5_0= RULE_STRING
            {
            lv_protocol_5_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_protocol_5_0, grammarAccess.getDataflowAccess().getProtocolSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataflowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protocol",
            						lv_protocol_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDataflowAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleDataflow"


    // $ANTLR start "entryRuleDevice"
    // InternalMiec.g:1700:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalMiec.g:1700:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalMiec.g:1701:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalMiec.g:1707:1: ruleDevice returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_network_1_0= 'network' ) )? ( (lv_embedded_2_0= 'embedded' ) )? ( (lv_host_3_0= 'host' ) )? otherlv_4= 'device' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'capability' ( (lv_capability_8_0= ruleSecurityLevels ) ) (otherlv_9= ';' otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? otherlv_16= ')' ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_network_1_0=null;
        Token lv_embedded_2_0=null;
        Token lv_host_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_capability_8_0 = null;

        EObject lv_properties_12_0 = null;

        EObject lv_properties_14_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:1713:2: ( (otherlv_0= '(' ( ( (lv_network_1_0= 'network' ) )? ( (lv_embedded_2_0= 'embedded' ) )? ( (lv_host_3_0= 'host' ) )? otherlv_4= 'device' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'capability' ( (lv_capability_8_0= ruleSecurityLevels ) ) (otherlv_9= ';' otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? otherlv_16= ')' ) )
            // InternalMiec.g:1714:2: (otherlv_0= '(' ( ( (lv_network_1_0= 'network' ) )? ( (lv_embedded_2_0= 'embedded' ) )? ( (lv_host_3_0= 'host' ) )? otherlv_4= 'device' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'capability' ( (lv_capability_8_0= ruleSecurityLevels ) ) (otherlv_9= ';' otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? otherlv_16= ')' )
            {
            // InternalMiec.g:1714:2: (otherlv_0= '(' ( ( (lv_network_1_0= 'network' ) )? ( (lv_embedded_2_0= 'embedded' ) )? ( (lv_host_3_0= 'host' ) )? otherlv_4= 'device' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'capability' ( (lv_capability_8_0= ruleSecurityLevels ) ) (otherlv_9= ';' otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? otherlv_16= ')' )
            // InternalMiec.g:1715:3: otherlv_0= '(' ( ( (lv_network_1_0= 'network' ) )? ( (lv_embedded_2_0= 'embedded' ) )? ( (lv_host_3_0= 'host' ) )? otherlv_4= 'device' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'capability' ( (lv_capability_8_0= ruleSecurityLevels ) ) (otherlv_9= ';' otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )? otherlv_16= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMiec.g:1719:3: ( ( (lv_network_1_0= 'network' ) )? ( (lv_embedded_2_0= 'embedded' ) )? ( (lv_host_3_0= 'host' ) )? otherlv_4= 'device' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=46 && LA37_0<=49)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMiec.g:1720:4: ( (lv_network_1_0= 'network' ) )? ( (lv_embedded_2_0= 'embedded' ) )? ( (lv_host_3_0= 'host' ) )? otherlv_4= 'device'
                    {
                    // InternalMiec.g:1720:4: ( (lv_network_1_0= 'network' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==46) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalMiec.g:1721:5: (lv_network_1_0= 'network' )
                            {
                            // InternalMiec.g:1721:5: (lv_network_1_0= 'network' )
                            // InternalMiec.g:1722:6: lv_network_1_0= 'network'
                            {
                            lv_network_1_0=(Token)match(input,46,FOLLOW_46); 

                            						newLeafNode(lv_network_1_0, grammarAccess.getDeviceAccess().getNetworkNetworkKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDeviceRule());
                            						}
                            						setWithLastConsumed(current, "network", lv_network_1_0 != null, "network");
                            					

                            }


                            }
                            break;

                    }

                    // InternalMiec.g:1734:4: ( (lv_embedded_2_0= 'embedded' ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==47) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalMiec.g:1735:5: (lv_embedded_2_0= 'embedded' )
                            {
                            // InternalMiec.g:1735:5: (lv_embedded_2_0= 'embedded' )
                            // InternalMiec.g:1736:6: lv_embedded_2_0= 'embedded'
                            {
                            lv_embedded_2_0=(Token)match(input,47,FOLLOW_47); 

                            						newLeafNode(lv_embedded_2_0, grammarAccess.getDeviceAccess().getEmbeddedEmbeddedKeyword_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDeviceRule());
                            						}
                            						setWithLastConsumed(current, "embedded", lv_embedded_2_0 != null, "embedded");
                            					

                            }


                            }
                            break;

                    }

                    // InternalMiec.g:1748:4: ( (lv_host_3_0= 'host' ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==48) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalMiec.g:1749:5: (lv_host_3_0= 'host' )
                            {
                            // InternalMiec.g:1749:5: (lv_host_3_0= 'host' )
                            // InternalMiec.g:1750:6: lv_host_3_0= 'host'
                            {
                            lv_host_3_0=(Token)match(input,48,FOLLOW_48); 

                            						newLeafNode(lv_host_3_0, grammarAccess.getDeviceAccess().getHostHostKeyword_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDeviceRule());
                            						}
                            						setWithLastConsumed(current, "host", lv_host_3_0 != null, "host");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,49,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getDeviceKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalMiec.g:1767:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalMiec.g:1768:4: (lv_name_5_0= RULE_ID )
            {
            // InternalMiec.g:1768:4: (lv_name_5_0= RULE_ID )
            // InternalMiec.g:1769:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_5_0, grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_30); 

            			newLeafNode(otherlv_6, grammarAccess.getDeviceAccess().getSemicolonKeyword_3());
            		
            otherlv_7=(Token)match(input,36,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getDeviceAccess().getCapabilityKeyword_4());
            		
            // InternalMiec.g:1793:3: ( (lv_capability_8_0= ruleSecurityLevels ) )
            // InternalMiec.g:1794:4: (lv_capability_8_0= ruleSecurityLevels )
            {
            // InternalMiec.g:1794:4: (lv_capability_8_0= ruleSecurityLevels )
            // InternalMiec.g:1795:5: lv_capability_8_0= ruleSecurityLevels
            {

            					newCompositeNode(grammarAccess.getDeviceAccess().getCapabilitySecurityLevelsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_31);
            lv_capability_8_0=ruleSecurityLevels();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceRule());
            					}
            					set(
            						current,
            						"capability",
            						lv_capability_8_0,
            						"org.xtext.iec62443.baseModel.Miec.SecurityLevels");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiec.g:1812:3: (otherlv_9= ';' otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==19) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMiec.g:1813:4: otherlv_9= ';' otherlv_10= 'properties' otherlv_11= '{' ( (lv_properties_12_0= ruleProperty ) ) (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )* otherlv_15= '}'
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_49); 

                    				newLeafNode(otherlv_9, grammarAccess.getDeviceAccess().getSemicolonKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getDeviceAccess().getPropertiesKeyword_6_1());
                    			
                    otherlv_11=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_6_2());
                    			
                    // InternalMiec.g:1825:4: ( (lv_properties_12_0= ruleProperty ) )
                    // InternalMiec.g:1826:5: (lv_properties_12_0= ruleProperty )
                    {
                    // InternalMiec.g:1826:5: (lv_properties_12_0= ruleProperty )
                    // InternalMiec.g:1827:6: lv_properties_12_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getDeviceAccess().getPropertiesPropertyParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_properties_12_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeviceRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_12_0,
                    							"org.xtext.iec62443.baseModel.Miec.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiec.g:1844:4: (otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==29) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalMiec.g:1845:5: otherlv_13= ',' ( (lv_properties_14_0= ruleProperty ) )
                    	    {
                    	    otherlv_13=(Token)match(input,29,FOLLOW_7); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDeviceAccess().getCommaKeyword_6_4_0());
                    	    				
                    	    // InternalMiec.g:1849:5: ( (lv_properties_14_0= ruleProperty ) )
                    	    // InternalMiec.g:1850:6: (lv_properties_14_0= ruleProperty )
                    	    {
                    	    // InternalMiec.g:1850:6: (lv_properties_14_0= ruleProperty )
                    	    // InternalMiec.g:1851:7: lv_properties_14_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeviceAccess().getPropertiesPropertyParserRuleCall_6_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_properties_14_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeviceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_14_0,
                    	    								"org.xtext.iec62443.baseModel.Miec.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,23,FOLLOW_34); 

                    				newLeafNode(otherlv_15, grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_6_5());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getDeviceAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleProperty"
    // InternalMiec.g:1882:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalMiec.g:1882:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalMiec.g:1883:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalMiec.g:1889:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:1895:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalMiec.g:1896:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalMiec.g:1896:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // InternalMiec.g:1897:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalMiec.g:1897:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMiec.g:1898:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMiec.g:1898:4: (lv_name_0_0= RULE_ID )
            // InternalMiec.g:1899:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalMiec.g:1919:3: ( (lv_value_2_0= ruleValue ) )
            // InternalMiec.g:1920:4: (lv_value_2_0= ruleValue )
            {
            // InternalMiec.g:1920:4: (lv_value_2_0= ruleValue )
            // InternalMiec.g:1921:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.iec62443.baseModel.Miec.Value");
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleSystem"
    // InternalMiec.g:1942:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalMiec.g:1942:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalMiec.g:1943:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalMiec.g:1949:1: ruleSystem returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'system' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'capability' ( (lv_capability_5_0= ruleSecurityLevels ) ) (otherlv_6= ';' otherlv_7= 'devices' otherlv_8= '{' ( (lv_devices_9_0= ruleDevice ) ) (otherlv_10= ',' ( (lv_devices_11_0= ruleDevice ) ) )* otherlv_12= '}' )? (otherlv_13= ';' otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? otherlv_20= ')' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_capability_5_0 = null;

        EObject lv_devices_9_0 = null;

        EObject lv_devices_11_0 = null;

        EObject lv_properties_16_0 = null;

        EObject lv_properties_18_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:1955:2: ( (otherlv_0= '(' otherlv_1= 'system' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'capability' ( (lv_capability_5_0= ruleSecurityLevels ) ) (otherlv_6= ';' otherlv_7= 'devices' otherlv_8= '{' ( (lv_devices_9_0= ruleDevice ) ) (otherlv_10= ',' ( (lv_devices_11_0= ruleDevice ) ) )* otherlv_12= '}' )? (otherlv_13= ';' otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? otherlv_20= ')' ) )
            // InternalMiec.g:1956:2: (otherlv_0= '(' otherlv_1= 'system' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'capability' ( (lv_capability_5_0= ruleSecurityLevels ) ) (otherlv_6= ';' otherlv_7= 'devices' otherlv_8= '{' ( (lv_devices_9_0= ruleDevice ) ) (otherlv_10= ',' ( (lv_devices_11_0= ruleDevice ) ) )* otherlv_12= '}' )? (otherlv_13= ';' otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? otherlv_20= ')' )
            {
            // InternalMiec.g:1956:2: (otherlv_0= '(' otherlv_1= 'system' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'capability' ( (lv_capability_5_0= ruleSecurityLevels ) ) (otherlv_6= ';' otherlv_7= 'devices' otherlv_8= '{' ( (lv_devices_9_0= ruleDevice ) ) (otherlv_10= ',' ( (lv_devices_11_0= ruleDevice ) ) )* otherlv_12= '}' )? (otherlv_13= ';' otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? otherlv_20= ')' )
            // InternalMiec.g:1957:3: otherlv_0= '(' otherlv_1= 'system' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'capability' ( (lv_capability_5_0= ruleSecurityLevels ) ) (otherlv_6= ';' otherlv_7= 'devices' otherlv_8= '{' ( (lv_devices_9_0= ruleDevice ) ) (otherlv_10= ',' ( (lv_devices_11_0= ruleDevice ) ) )* otherlv_12= '}' )? (otherlv_13= ';' otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )? otherlv_20= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,51,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getSystemKeyword_1());
            		
            // InternalMiec.g:1965:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMiec.g:1966:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMiec.g:1966:4: (lv_name_2_0= RULE_ID )
            // InternalMiec.g:1967:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getCapabilityKeyword_4());
            		
            // InternalMiec.g:1991:3: ( (lv_capability_5_0= ruleSecurityLevels ) )
            // InternalMiec.g:1992:4: (lv_capability_5_0= ruleSecurityLevels )
            {
            // InternalMiec.g:1992:4: (lv_capability_5_0= ruleSecurityLevels )
            // InternalMiec.g:1993:5: lv_capability_5_0= ruleSecurityLevels
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getCapabilitySecurityLevelsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_31);
            lv_capability_5_0=ruleSecurityLevels();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"capability",
            						lv_capability_5_0,
            						"org.xtext.iec62443.baseModel.Miec.SecurityLevels");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiec.g:2010:3: (otherlv_6= ';' otherlv_7= 'devices' otherlv_8= '{' ( (lv_devices_9_0= ruleDevice ) ) (otherlv_10= ',' ( (lv_devices_11_0= ruleDevice ) ) )* otherlv_12= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==19) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==52) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalMiec.g:2011:4: otherlv_6= ';' otherlv_7= 'devices' otherlv_8= '{' ( (lv_devices_9_0= ruleDevice ) ) (otherlv_10= ',' ( (lv_devices_11_0= ruleDevice ) ) )* otherlv_12= '}'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_52); 

                    				newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getSemicolonKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getDevicesKeyword_6_1());
                    			
                    otherlv_8=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6_2());
                    			
                    // InternalMiec.g:2023:4: ( (lv_devices_9_0= ruleDevice ) )
                    // InternalMiec.g:2024:5: (lv_devices_9_0= ruleDevice )
                    {
                    // InternalMiec.g:2024:5: (lv_devices_9_0= ruleDevice )
                    // InternalMiec.g:2025:6: lv_devices_9_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getDevicesDeviceParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_devices_9_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"devices",
                    							lv_devices_9_0,
                    							"org.xtext.iec62443.baseModel.Miec.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiec.g:2042:4: (otherlv_10= ',' ( (lv_devices_11_0= ruleDevice ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==29) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalMiec.g:2043:5: otherlv_10= ',' ( (lv_devices_11_0= ruleDevice ) )
                    	    {
                    	    otherlv_10=(Token)match(input,29,FOLLOW_21); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getCommaKeyword_6_4_0());
                    	    				
                    	    // InternalMiec.g:2047:5: ( (lv_devices_11_0= ruleDevice ) )
                    	    // InternalMiec.g:2048:6: (lv_devices_11_0= ruleDevice )
                    	    {
                    	    // InternalMiec.g:2048:6: (lv_devices_11_0= ruleDevice )
                    	    // InternalMiec.g:2049:7: lv_devices_11_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getDevicesDeviceParserRuleCall_6_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_devices_11_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"devices",
                    	    								lv_devices_11_0,
                    	    								"org.xtext.iec62443.baseModel.Miec.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,23,FOLLOW_31); 

                    				newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6_5());
                    			

                    }
                    break;

            }

            // InternalMiec.g:2072:3: (otherlv_13= ';' otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==19) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMiec.g:2073:4: otherlv_13= ';' otherlv_14= 'properties' otherlv_15= '{' ( (lv_properties_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )* otherlv_19= '}'
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_49); 

                    				newLeafNode(otherlv_13, grammarAccess.getSystemAccess().getSemicolonKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getPropertiesKeyword_7_1());
                    			
                    otherlv_15=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_7_2());
                    			
                    // InternalMiec.g:2085:4: ( (lv_properties_16_0= ruleProperty ) )
                    // InternalMiec.g:2086:5: (lv_properties_16_0= ruleProperty )
                    {
                    // InternalMiec.g:2086:5: (lv_properties_16_0= ruleProperty )
                    // InternalMiec.g:2087:6: lv_properties_16_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getPropertiesPropertyParserRuleCall_7_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_properties_16_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_16_0,
                    							"org.xtext.iec62443.baseModel.Miec.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiec.g:2104:4: (otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==29) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalMiec.g:2105:5: otherlv_17= ',' ( (lv_properties_18_0= ruleProperty ) )
                    	    {
                    	    otherlv_17=(Token)match(input,29,FOLLOW_7); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getSystemAccess().getCommaKeyword_7_4_0());
                    	    				
                    	    // InternalMiec.g:2109:5: ( (lv_properties_18_0= ruleProperty ) )
                    	    // InternalMiec.g:2110:6: (lv_properties_18_0= ruleProperty )
                    	    {
                    	    // InternalMiec.g:2110:6: (lv_properties_18_0= ruleProperty )
                    	    // InternalMiec.g:2111:7: lv_properties_18_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getPropertiesPropertyParserRuleCall_7_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_properties_18_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_18_0,
                    	    								"org.xtext.iec62443.baseModel.Miec.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,23,FOLLOW_34); 

                    				newLeafNode(otherlv_19, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_7_5());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getSystemAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleApplication"
    // InternalMiec.g:2142:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalMiec.g:2142:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalMiec.g:2143:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalMiec.g:2149:1: ruleApplication returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'application' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'executed' otherlv_5= 'on' ( ( (otherlv_6= RULE_ID ) ) | otherlv_7= 'nothing' ) otherlv_8= ';' otherlv_9= 'capability' ( (lv_capability_10_0= ruleSecurityLevels ) ) (otherlv_11= ';' otherlv_12= 'scoreCalc' otherlv_13= '(' ( (lv_scoreExpr_14_0= ruleNumberExpression ) ) otherlv_15= ')' )? (otherlv_16= ';' otherlv_17= 'constraints' otherlv_18= '{' ( (lv_constraints_19_0= ruleConstraint ) ) (otherlv_20= ',' ( (lv_constraints_21_0= ruleConstraint ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'needs' otherlv_25= 'level' ( (lv_sLevelConstraint_26_0= ruleSecurityLevels ) ) )? (otherlv_27= ';' otherlv_28= 'communicates' otherlv_29= 'with' otherlv_30= '{' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= '}' )? (otherlv_35= ';' otherlv_36= 'properties' otherlv_37= '{' ( (lv_properties_38_0= ruleProperty ) ) (otherlv_39= ',' ( (lv_properties_40_0= ruleProperty ) ) )* otherlv_41= '}' )? otherlv_42= ')' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        EObject lv_capability_10_0 = null;

        EObject lv_scoreExpr_14_0 = null;

        EObject lv_constraints_19_0 = null;

        EObject lv_constraints_21_0 = null;

        EObject lv_sLevelConstraint_26_0 = null;

        EObject lv_properties_38_0 = null;

        EObject lv_properties_40_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:2155:2: ( (otherlv_0= '(' otherlv_1= 'application' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'executed' otherlv_5= 'on' ( ( (otherlv_6= RULE_ID ) ) | otherlv_7= 'nothing' ) otherlv_8= ';' otherlv_9= 'capability' ( (lv_capability_10_0= ruleSecurityLevels ) ) (otherlv_11= ';' otherlv_12= 'scoreCalc' otherlv_13= '(' ( (lv_scoreExpr_14_0= ruleNumberExpression ) ) otherlv_15= ')' )? (otherlv_16= ';' otherlv_17= 'constraints' otherlv_18= '{' ( (lv_constraints_19_0= ruleConstraint ) ) (otherlv_20= ',' ( (lv_constraints_21_0= ruleConstraint ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'needs' otherlv_25= 'level' ( (lv_sLevelConstraint_26_0= ruleSecurityLevels ) ) )? (otherlv_27= ';' otherlv_28= 'communicates' otherlv_29= 'with' otherlv_30= '{' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= '}' )? (otherlv_35= ';' otherlv_36= 'properties' otherlv_37= '{' ( (lv_properties_38_0= ruleProperty ) ) (otherlv_39= ',' ( (lv_properties_40_0= ruleProperty ) ) )* otherlv_41= '}' )? otherlv_42= ')' ) )
            // InternalMiec.g:2156:2: (otherlv_0= '(' otherlv_1= 'application' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'executed' otherlv_5= 'on' ( ( (otherlv_6= RULE_ID ) ) | otherlv_7= 'nothing' ) otherlv_8= ';' otherlv_9= 'capability' ( (lv_capability_10_0= ruleSecurityLevels ) ) (otherlv_11= ';' otherlv_12= 'scoreCalc' otherlv_13= '(' ( (lv_scoreExpr_14_0= ruleNumberExpression ) ) otherlv_15= ')' )? (otherlv_16= ';' otherlv_17= 'constraints' otherlv_18= '{' ( (lv_constraints_19_0= ruleConstraint ) ) (otherlv_20= ',' ( (lv_constraints_21_0= ruleConstraint ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'needs' otherlv_25= 'level' ( (lv_sLevelConstraint_26_0= ruleSecurityLevels ) ) )? (otherlv_27= ';' otherlv_28= 'communicates' otherlv_29= 'with' otherlv_30= '{' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= '}' )? (otherlv_35= ';' otherlv_36= 'properties' otherlv_37= '{' ( (lv_properties_38_0= ruleProperty ) ) (otherlv_39= ',' ( (lv_properties_40_0= ruleProperty ) ) )* otherlv_41= '}' )? otherlv_42= ')' )
            {
            // InternalMiec.g:2156:2: (otherlv_0= '(' otherlv_1= 'application' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'executed' otherlv_5= 'on' ( ( (otherlv_6= RULE_ID ) ) | otherlv_7= 'nothing' ) otherlv_8= ';' otherlv_9= 'capability' ( (lv_capability_10_0= ruleSecurityLevels ) ) (otherlv_11= ';' otherlv_12= 'scoreCalc' otherlv_13= '(' ( (lv_scoreExpr_14_0= ruleNumberExpression ) ) otherlv_15= ')' )? (otherlv_16= ';' otherlv_17= 'constraints' otherlv_18= '{' ( (lv_constraints_19_0= ruleConstraint ) ) (otherlv_20= ',' ( (lv_constraints_21_0= ruleConstraint ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'needs' otherlv_25= 'level' ( (lv_sLevelConstraint_26_0= ruleSecurityLevels ) ) )? (otherlv_27= ';' otherlv_28= 'communicates' otherlv_29= 'with' otherlv_30= '{' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= '}' )? (otherlv_35= ';' otherlv_36= 'properties' otherlv_37= '{' ( (lv_properties_38_0= ruleProperty ) ) (otherlv_39= ',' ( (lv_properties_40_0= ruleProperty ) ) )* otherlv_41= '}' )? otherlv_42= ')' )
            // InternalMiec.g:2157:3: otherlv_0= '(' otherlv_1= 'application' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'executed' otherlv_5= 'on' ( ( (otherlv_6= RULE_ID ) ) | otherlv_7= 'nothing' ) otherlv_8= ';' otherlv_9= 'capability' ( (lv_capability_10_0= ruleSecurityLevels ) ) (otherlv_11= ';' otherlv_12= 'scoreCalc' otherlv_13= '(' ( (lv_scoreExpr_14_0= ruleNumberExpression ) ) otherlv_15= ')' )? (otherlv_16= ';' otherlv_17= 'constraints' otherlv_18= '{' ( (lv_constraints_19_0= ruleConstraint ) ) (otherlv_20= ',' ( (lv_constraints_21_0= ruleConstraint ) ) )* otherlv_22= '}' )? (otherlv_23= ';' otherlv_24= 'needs' otherlv_25= 'level' ( (lv_sLevelConstraint_26_0= ruleSecurityLevels ) ) )? (otherlv_27= ';' otherlv_28= 'communicates' otherlv_29= 'with' otherlv_30= '{' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= '}' )? (otherlv_35= ';' otherlv_36= 'properties' otherlv_37= '{' ( (lv_properties_38_0= ruleProperty ) ) (otherlv_39= ',' ( (lv_properties_40_0= ruleProperty ) ) )* otherlv_41= '}' )? otherlv_42= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getApplicationKeyword_1());
            		
            // InternalMiec.g:2165:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMiec.g:2166:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMiec.g:2166:4: (lv_name_2_0= RULE_ID )
            // InternalMiec.g:2167:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,54,FOLLOW_55); 

            			newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getExecutedKeyword_4());
            		
            otherlv_5=(Token)match(input,55,FOLLOW_56); 

            			newLeafNode(otherlv_5, grammarAccess.getApplicationAccess().getOnKeyword_5());
            		
            // InternalMiec.g:2195:3: ( ( (otherlv_6= RULE_ID ) ) | otherlv_7= 'nothing' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==56) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalMiec.g:2196:4: ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalMiec.g:2196:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMiec.g:2197:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMiec.g:2197:5: (otherlv_6= RULE_ID )
                    // InternalMiec.g:2198:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getApplicationRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getExecutedOnDeviceCrossReference_6_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:2210:4: otherlv_7= 'nothing'
                    {
                    otherlv_7=(Token)match(input,56,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getApplicationAccess().getNothingKeyword_6_1());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_30); 

            			newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getSemicolonKeyword_7());
            		
            otherlv_9=(Token)match(input,36,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getApplicationAccess().getCapabilityKeyword_8());
            		
            // InternalMiec.g:2223:3: ( (lv_capability_10_0= ruleSecurityLevels ) )
            // InternalMiec.g:2224:4: (lv_capability_10_0= ruleSecurityLevels )
            {
            // InternalMiec.g:2224:4: (lv_capability_10_0= ruleSecurityLevels )
            // InternalMiec.g:2225:5: lv_capability_10_0= ruleSecurityLevels
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getCapabilitySecurityLevelsParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_31);
            lv_capability_10_0=ruleSecurityLevels();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					set(
            						current,
            						"capability",
            						lv_capability_10_0,
            						"org.xtext.iec62443.baseModel.Miec.SecurityLevels");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiec.g:2242:3: (otherlv_11= ';' otherlv_12= 'scoreCalc' otherlv_13= '(' ( (lv_scoreExpr_14_0= ruleNumberExpression ) ) otherlv_15= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==19) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==57) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalMiec.g:2243:4: otherlv_11= ';' otherlv_12= 'scoreCalc' otherlv_13= '(' ( (lv_scoreExpr_14_0= ruleNumberExpression ) ) otherlv_15= ')'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_57); 

                    				newLeafNode(otherlv_11, grammarAccess.getApplicationAccess().getSemicolonKeyword_10_0());
                    			
                    otherlv_12=(Token)match(input,57,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getApplicationAccess().getScoreCalcKeyword_10_1());
                    			
                    otherlv_13=(Token)match(input,34,FOLLOW_58); 

                    				newLeafNode(otherlv_13, grammarAccess.getApplicationAccess().getLeftParenthesisKeyword_10_2());
                    			
                    // InternalMiec.g:2255:4: ( (lv_scoreExpr_14_0= ruleNumberExpression ) )
                    // InternalMiec.g:2256:5: (lv_scoreExpr_14_0= ruleNumberExpression )
                    {
                    // InternalMiec.g:2256:5: (lv_scoreExpr_14_0= ruleNumberExpression )
                    // InternalMiec.g:2257:6: lv_scoreExpr_14_0= ruleNumberExpression
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getScoreExprNumberExpressionParserRuleCall_10_3_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_scoreExpr_14_0=ruleNumberExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"scoreExpr",
                    							lv_scoreExpr_14_0,
                    							"org.xtext.iec62443.baseModel.Miec.NumberExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,38,FOLLOW_31); 

                    				newLeafNode(otherlv_15, grammarAccess.getApplicationAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalMiec.g:2279:3: (otherlv_16= ';' otherlv_17= 'constraints' otherlv_18= '{' ( (lv_constraints_19_0= ruleConstraint ) ) (otherlv_20= ',' ( (lv_constraints_21_0= ruleConstraint ) ) )* otherlv_22= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==19) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==58) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalMiec.g:2280:4: otherlv_16= ';' otherlv_17= 'constraints' otherlv_18= '{' ( (lv_constraints_19_0= ruleConstraint ) ) (otherlv_20= ',' ( (lv_constraints_21_0= ruleConstraint ) ) )* otherlv_22= '}'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_59); 

                    				newLeafNode(otherlv_16, grammarAccess.getApplicationAccess().getSemicolonKeyword_11_0());
                    			
                    otherlv_17=(Token)match(input,58,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getApplicationAccess().getConstraintsKeyword_11_1());
                    			
                    otherlv_18=(Token)match(input,16,FOLLOW_60); 

                    				newLeafNode(otherlv_18, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_11_2());
                    			
                    // InternalMiec.g:2292:4: ( (lv_constraints_19_0= ruleConstraint ) )
                    // InternalMiec.g:2293:5: (lv_constraints_19_0= ruleConstraint )
                    {
                    // InternalMiec.g:2293:5: (lv_constraints_19_0= ruleConstraint )
                    // InternalMiec.g:2294:6: lv_constraints_19_0= ruleConstraint
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getConstraintsConstraintParserRuleCall_11_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_constraints_19_0=ruleConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						add(
                    							current,
                    							"constraints",
                    							lv_constraints_19_0,
                    							"org.xtext.iec62443.baseModel.Miec.Constraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiec.g:2311:4: (otherlv_20= ',' ( (lv_constraints_21_0= ruleConstraint ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==29) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalMiec.g:2312:5: otherlv_20= ',' ( (lv_constraints_21_0= ruleConstraint ) )
                    	    {
                    	    otherlv_20=(Token)match(input,29,FOLLOW_60); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getApplicationAccess().getCommaKeyword_11_4_0());
                    	    				
                    	    // InternalMiec.g:2316:5: ( (lv_constraints_21_0= ruleConstraint ) )
                    	    // InternalMiec.g:2317:6: (lv_constraints_21_0= ruleConstraint )
                    	    {
                    	    // InternalMiec.g:2317:6: (lv_constraints_21_0= ruleConstraint )
                    	    // InternalMiec.g:2318:7: lv_constraints_21_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getApplicationAccess().getConstraintsConstraintParserRuleCall_11_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_constraints_21_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getApplicationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_21_0,
                    	    								"org.xtext.iec62443.baseModel.Miec.Constraint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,23,FOLLOW_31); 

                    				newLeafNode(otherlv_22, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_11_5());
                    			

                    }
                    break;

            }

            // InternalMiec.g:2341:3: (otherlv_23= ';' otherlv_24= 'needs' otherlv_25= 'level' ( (lv_sLevelConstraint_26_0= ruleSecurityLevels ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==19) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==59) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalMiec.g:2342:4: otherlv_23= ';' otherlv_24= 'needs' otherlv_25= 'level' ( (lv_sLevelConstraint_26_0= ruleSecurityLevels ) )
                    {
                    otherlv_23=(Token)match(input,19,FOLLOW_61); 

                    				newLeafNode(otherlv_23, grammarAccess.getApplicationAccess().getSemicolonKeyword_12_0());
                    			
                    otherlv_24=(Token)match(input,59,FOLLOW_62); 

                    				newLeafNode(otherlv_24, grammarAccess.getApplicationAccess().getNeedsKeyword_12_1());
                    			
                    otherlv_25=(Token)match(input,60,FOLLOW_18); 

                    				newLeafNode(otherlv_25, grammarAccess.getApplicationAccess().getLevelKeyword_12_2());
                    			
                    // InternalMiec.g:2354:4: ( (lv_sLevelConstraint_26_0= ruleSecurityLevels ) )
                    // InternalMiec.g:2355:5: (lv_sLevelConstraint_26_0= ruleSecurityLevels )
                    {
                    // InternalMiec.g:2355:5: (lv_sLevelConstraint_26_0= ruleSecurityLevels )
                    // InternalMiec.g:2356:6: lv_sLevelConstraint_26_0= ruleSecurityLevels
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getSLevelConstraintSecurityLevelsParserRuleCall_12_3_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_sLevelConstraint_26_0=ruleSecurityLevels();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						set(
                    							current,
                    							"sLevelConstraint",
                    							lv_sLevelConstraint_26_0,
                    							"org.xtext.iec62443.baseModel.Miec.SecurityLevels");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMiec.g:2374:3: (otherlv_27= ';' otherlv_28= 'communicates' otherlv_29= 'with' otherlv_30= '{' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==19) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==61) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalMiec.g:2375:4: otherlv_27= ';' otherlv_28= 'communicates' otherlv_29= 'with' otherlv_30= '{' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= '}'
                    {
                    otherlv_27=(Token)match(input,19,FOLLOW_63); 

                    				newLeafNode(otherlv_27, grammarAccess.getApplicationAccess().getSemicolonKeyword_13_0());
                    			
                    otherlv_28=(Token)match(input,61,FOLLOW_64); 

                    				newLeafNode(otherlv_28, grammarAccess.getApplicationAccess().getCommunicatesKeyword_13_1());
                    			
                    otherlv_29=(Token)match(input,62,FOLLOW_4); 

                    				newLeafNode(otherlv_29, grammarAccess.getApplicationAccess().getWithKeyword_13_2());
                    			
                    otherlv_30=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_30, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_13_3());
                    			
                    // InternalMiec.g:2391:4: ( (otherlv_31= RULE_ID ) )
                    // InternalMiec.g:2392:5: (otherlv_31= RULE_ID )
                    {
                    // InternalMiec.g:2392:5: (otherlv_31= RULE_ID )
                    // InternalMiec.g:2393:6: otherlv_31= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getApplicationRule());
                    						}
                    					
                    otherlv_31=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_31, grammarAccess.getApplicationAccess().getCommunicatesWithComponentCrossReference_13_4_0());
                    					

                    }


                    }

                    // InternalMiec.g:2404:4: (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==29) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalMiec.g:2405:5: otherlv_32= ',' ( (otherlv_33= RULE_ID ) )
                    	    {
                    	    otherlv_32=(Token)match(input,29,FOLLOW_7); 

                    	    					newLeafNode(otherlv_32, grammarAccess.getApplicationAccess().getCommaKeyword_13_5_0());
                    	    				
                    	    // InternalMiec.g:2409:5: ( (otherlv_33= RULE_ID ) )
                    	    // InternalMiec.g:2410:6: (otherlv_33= RULE_ID )
                    	    {
                    	    // InternalMiec.g:2410:6: (otherlv_33= RULE_ID )
                    	    // InternalMiec.g:2411:7: otherlv_33= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getApplicationRule());
                    	    							}
                    	    						
                    	    otherlv_33=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    							newLeafNode(otherlv_33, grammarAccess.getApplicationAccess().getCommunicatesWithComponentCrossReference_13_5_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,23,FOLLOW_31); 

                    				newLeafNode(otherlv_34, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_13_6());
                    			

                    }
                    break;

            }

            // InternalMiec.g:2428:3: (otherlv_35= ';' otherlv_36= 'properties' otherlv_37= '{' ( (lv_properties_38_0= ruleProperty ) ) (otherlv_39= ',' ( (lv_properties_40_0= ruleProperty ) ) )* otherlv_41= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==19) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMiec.g:2429:4: otherlv_35= ';' otherlv_36= 'properties' otherlv_37= '{' ( (lv_properties_38_0= ruleProperty ) ) (otherlv_39= ',' ( (lv_properties_40_0= ruleProperty ) ) )* otherlv_41= '}'
                    {
                    otherlv_35=(Token)match(input,19,FOLLOW_49); 

                    				newLeafNode(otherlv_35, grammarAccess.getApplicationAccess().getSemicolonKeyword_14_0());
                    			
                    otherlv_36=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_36, grammarAccess.getApplicationAccess().getPropertiesKeyword_14_1());
                    			
                    otherlv_37=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_37, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_14_2());
                    			
                    // InternalMiec.g:2441:4: ( (lv_properties_38_0= ruleProperty ) )
                    // InternalMiec.g:2442:5: (lv_properties_38_0= ruleProperty )
                    {
                    // InternalMiec.g:2442:5: (lv_properties_38_0= ruleProperty )
                    // InternalMiec.g:2443:6: lv_properties_38_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getPropertiesPropertyParserRuleCall_14_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_properties_38_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_38_0,
                    							"org.xtext.iec62443.baseModel.Miec.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiec.g:2460:4: (otherlv_39= ',' ( (lv_properties_40_0= ruleProperty ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==29) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalMiec.g:2461:5: otherlv_39= ',' ( (lv_properties_40_0= ruleProperty ) )
                    	    {
                    	    otherlv_39=(Token)match(input,29,FOLLOW_7); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getApplicationAccess().getCommaKeyword_14_4_0());
                    	    				
                    	    // InternalMiec.g:2465:5: ( (lv_properties_40_0= ruleProperty ) )
                    	    // InternalMiec.g:2466:6: (lv_properties_40_0= ruleProperty )
                    	    {
                    	    // InternalMiec.g:2466:6: (lv_properties_40_0= ruleProperty )
                    	    // InternalMiec.g:2467:7: lv_properties_40_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getApplicationAccess().getPropertiesPropertyParserRuleCall_14_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_properties_40_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getApplicationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_40_0,
                    	    								"org.xtext.iec62443.baseModel.Miec.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,23,FOLLOW_34); 

                    				newLeafNode(otherlv_41, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_14_5());
                    			

                    }
                    break;

            }

            otherlv_42=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_42, grammarAccess.getApplicationAccess().getRightParenthesisKeyword_15());
            		

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleNumberExpression"
    // InternalMiec.g:2498:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // InternalMiec.g:2498:57: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // InternalMiec.g:2499:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
             newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;

             current =iv_ruleNumberExpression; 
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
    // $ANTLR end "entryRuleNumberExpression"


    // $ANTLR start "ruleNumberExpression"
    // InternalMiec.g:2505:1: ruleNumberExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:2511:2: (this_Addition_0= ruleAddition )
            // InternalMiec.g:2512:2: this_Addition_0= ruleAddition
            {

            		newCompositeNode(grammarAccess.getNumberExpressionAccess().getAdditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;


            		current = this_Addition_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleNumberExpression"


    // $ANTLR start "entryRuleTernaryOp"
    // InternalMiec.g:2523:1: entryRuleTernaryOp returns [EObject current=null] : iv_ruleTernaryOp= ruleTernaryOp EOF ;
    public final EObject entryRuleTernaryOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryOp = null;


        try {
            // InternalMiec.g:2523:50: (iv_ruleTernaryOp= ruleTernaryOp EOF )
            // InternalMiec.g:2524:2: iv_ruleTernaryOp= ruleTernaryOp EOF
            {
             newCompositeNode(grammarAccess.getTernaryOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTernaryOp=ruleTernaryOp();

            state._fsp--;

             current =iv_ruleTernaryOp; 
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
    // $ANTLR end "entryRuleTernaryOp"


    // $ANTLR start "ruleTernaryOp"
    // InternalMiec.g:2530:1: ruleTernaryOp returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'if' ( (lv_op1_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_op2_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_op3_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleTernaryOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_op1_2_0 = null;

        EObject lv_op2_4_0 = null;

        EObject lv_op3_6_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:2536:2: ( (otherlv_0= '(' otherlv_1= 'if' ( (lv_op1_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_op2_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_op3_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // InternalMiec.g:2537:2: (otherlv_0= '(' otherlv_1= 'if' ( (lv_op1_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_op2_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_op3_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // InternalMiec.g:2537:2: (otherlv_0= '(' otherlv_1= 'if' ( (lv_op1_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_op2_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_op3_6_0= ruleExpression ) ) otherlv_7= ')' )
            // InternalMiec.g:2538:3: otherlv_0= '(' otherlv_1= 'if' ( (lv_op1_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_op2_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_op3_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getTernaryOpAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,63,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getTernaryOpAccess().getIfKeyword_1());
            		
            // InternalMiec.g:2546:3: ( (lv_op1_2_0= ruleExpression ) )
            // InternalMiec.g:2547:4: (lv_op1_2_0= ruleExpression )
            {
            // InternalMiec.g:2547:4: (lv_op1_2_0= ruleExpression )
            // InternalMiec.g:2548:5: lv_op1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTernaryOpAccess().getOp1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_67);
            lv_op1_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTernaryOpRule());
            					}
            					set(
            						current,
            						"op1",
            						lv_op1_2_0,
            						"org.xtext.iec62443.baseModel.Miec.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,64,FOLLOW_66); 

            			newLeafNode(otherlv_3, grammarAccess.getTernaryOpAccess().getThenKeyword_3());
            		
            // InternalMiec.g:2569:3: ( (lv_op2_4_0= ruleExpression ) )
            // InternalMiec.g:2570:4: (lv_op2_4_0= ruleExpression )
            {
            // InternalMiec.g:2570:4: (lv_op2_4_0= ruleExpression )
            // InternalMiec.g:2571:5: lv_op2_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTernaryOpAccess().getOp2ExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_68);
            lv_op2_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTernaryOpRule());
            					}
            					set(
            						current,
            						"op2",
            						lv_op2_4_0,
            						"org.xtext.iec62443.baseModel.Miec.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,65,FOLLOW_66); 

            			newLeafNode(otherlv_5, grammarAccess.getTernaryOpAccess().getElseKeyword_5());
            		
            // InternalMiec.g:2592:3: ( (lv_op3_6_0= ruleExpression ) )
            // InternalMiec.g:2593:4: (lv_op3_6_0= ruleExpression )
            {
            // InternalMiec.g:2593:4: (lv_op3_6_0= ruleExpression )
            // InternalMiec.g:2594:5: lv_op3_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTernaryOpAccess().getOp3ExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_34);
            lv_op3_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTernaryOpRule());
            					}
            					set(
            						current,
            						"op3",
            						lv_op3_6_0,
            						"org.xtext.iec62443.baseModel.Miec.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTernaryOpAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleTernaryOp"


    // $ANTLR start "entryRuleNumberOperation"
    // InternalMiec.g:2619:1: entryRuleNumberOperation returns [EObject current=null] : iv_ruleNumberOperation= ruleNumberOperation EOF ;
    public final EObject entryRuleNumberOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberOperation = null;


        try {
            // InternalMiec.g:2619:56: (iv_ruleNumberOperation= ruleNumberOperation EOF )
            // InternalMiec.g:2620:2: iv_ruleNumberOperation= ruleNumberOperation EOF
            {
             newCompositeNode(grammarAccess.getNumberOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberOperation=ruleNumberOperation();

            state._fsp--;

             current =iv_ruleNumberOperation; 
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
    // $ANTLR end "entryRuleNumberOperation"


    // $ANTLR start "ruleNumberOperation"
    // InternalMiec.g:2626:1: ruleNumberOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleNumberOperationStart ) ) otherlv_1= '(' ( (lv_op1_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_op2_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleNumberOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_operation_0_0 = null;

        EObject lv_op1_2_0 = null;

        EObject lv_op2_4_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:2632:2: ( ( ( (lv_operation_0_0= ruleNumberOperationStart ) ) otherlv_1= '(' ( (lv_op1_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_op2_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // InternalMiec.g:2633:2: ( ( (lv_operation_0_0= ruleNumberOperationStart ) ) otherlv_1= '(' ( (lv_op1_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_op2_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // InternalMiec.g:2633:2: ( ( (lv_operation_0_0= ruleNumberOperationStart ) ) otherlv_1= '(' ( (lv_op1_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_op2_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // InternalMiec.g:2634:3: ( (lv_operation_0_0= ruleNumberOperationStart ) ) otherlv_1= '(' ( (lv_op1_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_op2_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // InternalMiec.g:2634:3: ( (lv_operation_0_0= ruleNumberOperationStart ) )
            // InternalMiec.g:2635:4: (lv_operation_0_0= ruleNumberOperationStart )
            {
            // InternalMiec.g:2635:4: (lv_operation_0_0= ruleNumberOperationStart )
            // InternalMiec.g:2636:5: lv_operation_0_0= ruleNumberOperationStart
            {

            					newCompositeNode(grammarAccess.getNumberOperationAccess().getOperationNumberOperationStartEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_operation_0_0=ruleNumberOperationStart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberOperationRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_0_0,
            						"org.xtext.iec62443.baseModel.Miec.NumberOperationStart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiec.g:2657:3: ( (lv_op1_2_0= ruleNumberExpression ) )
            // InternalMiec.g:2658:4: (lv_op1_2_0= ruleNumberExpression )
            {
            // InternalMiec.g:2658:4: (lv_op1_2_0= ruleNumberExpression )
            // InternalMiec.g:2659:5: lv_op1_2_0= ruleNumberExpression
            {

            					newCompositeNode(grammarAccess.getNumberOperationAccess().getOp1NumberExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_op1_2_0=ruleNumberExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberOperationRule());
            					}
            					set(
            						current,
            						"op1",
            						lv_op1_2_0,
            						"org.xtext.iec62443.baseModel.Miec.NumberExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getNumberOperationAccess().getCommaKeyword_3());
            		
            // InternalMiec.g:2680:3: ( (lv_op2_4_0= ruleNumberExpression ) )
            // InternalMiec.g:2681:4: (lv_op2_4_0= ruleNumberExpression )
            {
            // InternalMiec.g:2681:4: (lv_op2_4_0= ruleNumberExpression )
            // InternalMiec.g:2682:5: lv_op2_4_0= ruleNumberExpression
            {

            					newCompositeNode(grammarAccess.getNumberOperationAccess().getOp2NumberExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_34);
            lv_op2_4_0=ruleNumberExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberOperationRule());
            					}
            					set(
            						current,
            						"op2",
            						lv_op2_4_0,
            						"org.xtext.iec62443.baseModel.Miec.NumberExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNumberOperationAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleNumberOperation"


    // $ANTLR start "entryRuleAddition"
    // InternalMiec.g:2707:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalMiec.g:2707:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalMiec.g:2708:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalMiec.g:2714:1: ruleAddition returns [EObject current=null] : ( ( (lv_ops_0_0= ruleSoustraction ) ) ( ( (lv_operation_1_0= ruleNumberOperation1 ) ) ( (lv_ops_2_0= ruleSoustraction ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject lv_ops_0_0 = null;

        Enumerator lv_operation_1_0 = null;

        EObject lv_ops_2_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:2720:2: ( ( ( (lv_ops_0_0= ruleSoustraction ) ) ( ( (lv_operation_1_0= ruleNumberOperation1 ) ) ( (lv_ops_2_0= ruleSoustraction ) ) )* ) )
            // InternalMiec.g:2721:2: ( ( (lv_ops_0_0= ruleSoustraction ) ) ( ( (lv_operation_1_0= ruleNumberOperation1 ) ) ( (lv_ops_2_0= ruleSoustraction ) ) )* )
            {
            // InternalMiec.g:2721:2: ( ( (lv_ops_0_0= ruleSoustraction ) ) ( ( (lv_operation_1_0= ruleNumberOperation1 ) ) ( (lv_ops_2_0= ruleSoustraction ) ) )* )
            // InternalMiec.g:2722:3: ( (lv_ops_0_0= ruleSoustraction ) ) ( ( (lv_operation_1_0= ruleNumberOperation1 ) ) ( (lv_ops_2_0= ruleSoustraction ) ) )*
            {
            // InternalMiec.g:2722:3: ( (lv_ops_0_0= ruleSoustraction ) )
            // InternalMiec.g:2723:4: (lv_ops_0_0= ruleSoustraction )
            {
            // InternalMiec.g:2723:4: (lv_ops_0_0= ruleSoustraction )
            // InternalMiec.g:2724:5: lv_ops_0_0= ruleSoustraction
            {

            					newCompositeNode(grammarAccess.getAdditionAccess().getOpsSoustractionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_69);
            lv_ops_0_0=ruleSoustraction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditionRule());
            					}
            					add(
            						current,
            						"ops",
            						lv_ops_0_0,
            						"org.xtext.iec62443.baseModel.Miec.Soustraction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiec.g:2741:3: ( ( (lv_operation_1_0= ruleNumberOperation1 ) ) ( (lv_ops_2_0= ruleSoustraction ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==82) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalMiec.g:2742:4: ( (lv_operation_1_0= ruleNumberOperation1 ) ) ( (lv_ops_2_0= ruleSoustraction ) )
            	    {
            	    // InternalMiec.g:2742:4: ( (lv_operation_1_0= ruleNumberOperation1 ) )
            	    // InternalMiec.g:2743:5: (lv_operation_1_0= ruleNumberOperation1 )
            	    {
            	    // InternalMiec.g:2743:5: (lv_operation_1_0= ruleNumberOperation1 )
            	    // InternalMiec.g:2744:6: lv_operation_1_0= ruleNumberOperation1
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getOperationNumberOperation1EnumRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_58);
            	    lv_operation_1_0=ruleNumberOperation1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operation",
            	    							lv_operation_1_0,
            	    							"org.xtext.iec62443.baseModel.Miec.NumberOperation1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMiec.g:2761:4: ( (lv_ops_2_0= ruleSoustraction ) )
            	    // InternalMiec.g:2762:5: (lv_ops_2_0= ruleSoustraction )
            	    {
            	    // InternalMiec.g:2762:5: (lv_ops_2_0= ruleSoustraction )
            	    // InternalMiec.g:2763:6: lv_ops_2_0= ruleSoustraction
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getOpsSoustractionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_69);
            	    lv_ops_2_0=ruleSoustraction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ops",
            	    							lv_ops_2_0,
            	    							"org.xtext.iec62443.baseModel.Miec.Soustraction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleSoustraction"
    // InternalMiec.g:2785:1: entryRuleSoustraction returns [EObject current=null] : iv_ruleSoustraction= ruleSoustraction EOF ;
    public final EObject entryRuleSoustraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoustraction = null;


        try {
            // InternalMiec.g:2785:53: (iv_ruleSoustraction= ruleSoustraction EOF )
            // InternalMiec.g:2786:2: iv_ruleSoustraction= ruleSoustraction EOF
            {
             newCompositeNode(grammarAccess.getSoustractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSoustraction=ruleSoustraction();

            state._fsp--;

             current =iv_ruleSoustraction; 
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
    // $ANTLR end "entryRuleSoustraction"


    // $ANTLR start "ruleSoustraction"
    // InternalMiec.g:2792:1: ruleSoustraction returns [EObject current=null] : ( ( (lv_ops_0_0= ruleMultiplication ) ) ( ( (lv_operation_1_0= ruleNumberOperation2 ) ) ( (lv_ops_2_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleSoustraction() throws RecognitionException {
        EObject current = null;

        EObject lv_ops_0_0 = null;

        Enumerator lv_operation_1_0 = null;

        EObject lv_ops_2_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:2798:2: ( ( ( (lv_ops_0_0= ruleMultiplication ) ) ( ( (lv_operation_1_0= ruleNumberOperation2 ) ) ( (lv_ops_2_0= ruleMultiplication ) ) )* ) )
            // InternalMiec.g:2799:2: ( ( (lv_ops_0_0= ruleMultiplication ) ) ( ( (lv_operation_1_0= ruleNumberOperation2 ) ) ( (lv_ops_2_0= ruleMultiplication ) ) )* )
            {
            // InternalMiec.g:2799:2: ( ( (lv_ops_0_0= ruleMultiplication ) ) ( ( (lv_operation_1_0= ruleNumberOperation2 ) ) ( (lv_ops_2_0= ruleMultiplication ) ) )* )
            // InternalMiec.g:2800:3: ( (lv_ops_0_0= ruleMultiplication ) ) ( ( (lv_operation_1_0= ruleNumberOperation2 ) ) ( (lv_ops_2_0= ruleMultiplication ) ) )*
            {
            // InternalMiec.g:2800:3: ( (lv_ops_0_0= ruleMultiplication ) )
            // InternalMiec.g:2801:4: (lv_ops_0_0= ruleMultiplication )
            {
            // InternalMiec.g:2801:4: (lv_ops_0_0= ruleMultiplication )
            // InternalMiec.g:2802:5: lv_ops_0_0= ruleMultiplication
            {

            					newCompositeNode(grammarAccess.getSoustractionAccess().getOpsMultiplicationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_70);
            lv_ops_0_0=ruleMultiplication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoustractionRule());
            					}
            					add(
            						current,
            						"ops",
            						lv_ops_0_0,
            						"org.xtext.iec62443.baseModel.Miec.Multiplication");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiec.g:2819:3: ( ( (lv_operation_1_0= ruleNumberOperation2 ) ) ( (lv_ops_2_0= ruleMultiplication ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==83) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalMiec.g:2820:4: ( (lv_operation_1_0= ruleNumberOperation2 ) ) ( (lv_ops_2_0= ruleMultiplication ) )
            	    {
            	    // InternalMiec.g:2820:4: ( (lv_operation_1_0= ruleNumberOperation2 ) )
            	    // InternalMiec.g:2821:5: (lv_operation_1_0= ruleNumberOperation2 )
            	    {
            	    // InternalMiec.g:2821:5: (lv_operation_1_0= ruleNumberOperation2 )
            	    // InternalMiec.g:2822:6: lv_operation_1_0= ruleNumberOperation2
            	    {

            	    						newCompositeNode(grammarAccess.getSoustractionAccess().getOperationNumberOperation2EnumRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_58);
            	    lv_operation_1_0=ruleNumberOperation2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSoustractionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operation",
            	    							lv_operation_1_0,
            	    							"org.xtext.iec62443.baseModel.Miec.NumberOperation2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMiec.g:2839:4: ( (lv_ops_2_0= ruleMultiplication ) )
            	    // InternalMiec.g:2840:5: (lv_ops_2_0= ruleMultiplication )
            	    {
            	    // InternalMiec.g:2840:5: (lv_ops_2_0= ruleMultiplication )
            	    // InternalMiec.g:2841:6: lv_ops_2_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getSoustractionAccess().getOpsMultiplicationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_70);
            	    lv_ops_2_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSoustractionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ops",
            	    							lv_ops_2_0,
            	    							"org.xtext.iec62443.baseModel.Miec.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // $ANTLR end "ruleSoustraction"


    // $ANTLR start "entryRuleMultiplication"
    // InternalMiec.g:2863:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalMiec.g:2863:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalMiec.g:2864:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalMiec.g:2870:1: ruleMultiplication returns [EObject current=null] : ( ( (lv_ops_0_0= ruleDivision ) ) ( ( (lv_operation_1_0= ruleNumberOperation3 ) ) ( (lv_ops_2_0= ruleDivision ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject lv_ops_0_0 = null;

        Enumerator lv_operation_1_0 = null;

        EObject lv_ops_2_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:2876:2: ( ( ( (lv_ops_0_0= ruleDivision ) ) ( ( (lv_operation_1_0= ruleNumberOperation3 ) ) ( (lv_ops_2_0= ruleDivision ) ) )* ) )
            // InternalMiec.g:2877:2: ( ( (lv_ops_0_0= ruleDivision ) ) ( ( (lv_operation_1_0= ruleNumberOperation3 ) ) ( (lv_ops_2_0= ruleDivision ) ) )* )
            {
            // InternalMiec.g:2877:2: ( ( (lv_ops_0_0= ruleDivision ) ) ( ( (lv_operation_1_0= ruleNumberOperation3 ) ) ( (lv_ops_2_0= ruleDivision ) ) )* )
            // InternalMiec.g:2878:3: ( (lv_ops_0_0= ruleDivision ) ) ( ( (lv_operation_1_0= ruleNumberOperation3 ) ) ( (lv_ops_2_0= ruleDivision ) ) )*
            {
            // InternalMiec.g:2878:3: ( (lv_ops_0_0= ruleDivision ) )
            // InternalMiec.g:2879:4: (lv_ops_0_0= ruleDivision )
            {
            // InternalMiec.g:2879:4: (lv_ops_0_0= ruleDivision )
            // InternalMiec.g:2880:5: lv_ops_0_0= ruleDivision
            {

            					newCompositeNode(grammarAccess.getMultiplicationAccess().getOpsDivisionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_71);
            lv_ops_0_0=ruleDivision();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            					}
            					add(
            						current,
            						"ops",
            						lv_ops_0_0,
            						"org.xtext.iec62443.baseModel.Miec.Division");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiec.g:2897:3: ( ( (lv_operation_1_0= ruleNumberOperation3 ) ) ( (lv_ops_2_0= ruleDivision ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==84) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMiec.g:2898:4: ( (lv_operation_1_0= ruleNumberOperation3 ) ) ( (lv_ops_2_0= ruleDivision ) )
            	    {
            	    // InternalMiec.g:2898:4: ( (lv_operation_1_0= ruleNumberOperation3 ) )
            	    // InternalMiec.g:2899:5: (lv_operation_1_0= ruleNumberOperation3 )
            	    {
            	    // InternalMiec.g:2899:5: (lv_operation_1_0= ruleNumberOperation3 )
            	    // InternalMiec.g:2900:6: lv_operation_1_0= ruleNumberOperation3
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getOperationNumberOperation3EnumRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_58);
            	    lv_operation_1_0=ruleNumberOperation3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operation",
            	    							lv_operation_1_0,
            	    							"org.xtext.iec62443.baseModel.Miec.NumberOperation3");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMiec.g:2917:4: ( (lv_ops_2_0= ruleDivision ) )
            	    // InternalMiec.g:2918:5: (lv_ops_2_0= ruleDivision )
            	    {
            	    // InternalMiec.g:2918:5: (lv_ops_2_0= ruleDivision )
            	    // InternalMiec.g:2919:6: lv_ops_2_0= ruleDivision
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getOpsDivisionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_71);
            	    lv_ops_2_0=ruleDivision();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ops",
            	    							lv_ops_2_0,
            	    							"org.xtext.iec62443.baseModel.Miec.Division");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalMiec.g:2941:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalMiec.g:2941:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalMiec.g:2942:2: iv_ruleDivision= ruleDivision EOF
            {
             newCompositeNode(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivision=ruleDivision();

            state._fsp--;

             current =iv_ruleDivision; 
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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalMiec.g:2948:1: ruleDivision returns [EObject current=null] : ( ( (lv_ops_0_0= ruleNumber ) ) ( ( (lv_operation_1_0= ruleNumberOperation4 ) ) ( (lv_ops_2_0= ruleNumber ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        EObject lv_ops_0_0 = null;

        Enumerator lv_operation_1_0 = null;

        EObject lv_ops_2_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:2954:2: ( ( ( (lv_ops_0_0= ruleNumber ) ) ( ( (lv_operation_1_0= ruleNumberOperation4 ) ) ( (lv_ops_2_0= ruleNumber ) ) )* ) )
            // InternalMiec.g:2955:2: ( ( (lv_ops_0_0= ruleNumber ) ) ( ( (lv_operation_1_0= ruleNumberOperation4 ) ) ( (lv_ops_2_0= ruleNumber ) ) )* )
            {
            // InternalMiec.g:2955:2: ( ( (lv_ops_0_0= ruleNumber ) ) ( ( (lv_operation_1_0= ruleNumberOperation4 ) ) ( (lv_ops_2_0= ruleNumber ) ) )* )
            // InternalMiec.g:2956:3: ( (lv_ops_0_0= ruleNumber ) ) ( ( (lv_operation_1_0= ruleNumberOperation4 ) ) ( (lv_ops_2_0= ruleNumber ) ) )*
            {
            // InternalMiec.g:2956:3: ( (lv_ops_0_0= ruleNumber ) )
            // InternalMiec.g:2957:4: (lv_ops_0_0= ruleNumber )
            {
            // InternalMiec.g:2957:4: (lv_ops_0_0= ruleNumber )
            // InternalMiec.g:2958:5: lv_ops_0_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getDivisionAccess().getOpsNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_72);
            lv_ops_0_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivisionRule());
            					}
            					add(
            						current,
            						"ops",
            						lv_ops_0_0,
            						"org.xtext.iec62443.baseModel.Miec.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiec.g:2975:3: ( ( (lv_operation_1_0= ruleNumberOperation4 ) ) ( (lv_ops_2_0= ruleNumber ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==85) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMiec.g:2976:4: ( (lv_operation_1_0= ruleNumberOperation4 ) ) ( (lv_ops_2_0= ruleNumber ) )
            	    {
            	    // InternalMiec.g:2976:4: ( (lv_operation_1_0= ruleNumberOperation4 ) )
            	    // InternalMiec.g:2977:5: (lv_operation_1_0= ruleNumberOperation4 )
            	    {
            	    // InternalMiec.g:2977:5: (lv_operation_1_0= ruleNumberOperation4 )
            	    // InternalMiec.g:2978:6: lv_operation_1_0= ruleNumberOperation4
            	    {

            	    						newCompositeNode(grammarAccess.getDivisionAccess().getOperationNumberOperation4EnumRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_58);
            	    lv_operation_1_0=ruleNumberOperation4();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivisionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operation",
            	    							lv_operation_1_0,
            	    							"org.xtext.iec62443.baseModel.Miec.NumberOperation4");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMiec.g:2995:4: ( (lv_ops_2_0= ruleNumber ) )
            	    // InternalMiec.g:2996:5: (lv_ops_2_0= ruleNumber )
            	    {
            	    // InternalMiec.g:2996:5: (lv_ops_2_0= ruleNumber )
            	    // InternalMiec.g:2997:6: lv_ops_2_0= ruleNumber
            	    {

            	    						newCompositeNode(grammarAccess.getDivisionAccess().getOpsNumberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_72);
            	    lv_ops_2_0=ruleNumber();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivisionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ops",
            	    							lv_ops_2_0,
            	    							"org.xtext.iec62443.baseModel.Miec.Number");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleNumber"
    // InternalMiec.g:3019:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMiec.g:3019:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMiec.g:3020:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMiec.g:3026:1: ruleNumber returns [EObject current=null] : (this_IntegerValue_0= ruleIntegerValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= 'numerical' this_Reference_3= ruleReference ) | this_TernaryOp_4= ruleTernaryOp | (otherlv_5= '(' this_Addition_6= ruleAddition otherlv_7= ')' ) | this_NumberOperation_8= ruleNumberOperation ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_IntegerValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_Reference_3 = null;

        EObject this_TernaryOp_4 = null;

        EObject this_Addition_6 = null;

        EObject this_NumberOperation_8 = null;



        	enterRule();

        try {
            // InternalMiec.g:3032:2: ( (this_IntegerValue_0= ruleIntegerValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= 'numerical' this_Reference_3= ruleReference ) | this_TernaryOp_4= ruleTernaryOp | (otherlv_5= '(' this_Addition_6= ruleAddition otherlv_7= ')' ) | this_NumberOperation_8= ruleNumberOperation ) )
            // InternalMiec.g:3033:2: (this_IntegerValue_0= ruleIntegerValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= 'numerical' this_Reference_3= ruleReference ) | this_TernaryOp_4= ruleTernaryOp | (otherlv_5= '(' this_Addition_6= ruleAddition otherlv_7= ')' ) | this_NumberOperation_8= ruleNumberOperation )
            {
            // InternalMiec.g:3033:2: (this_IntegerValue_0= ruleIntegerValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= 'numerical' this_Reference_3= ruleReference ) | this_TernaryOp_4= ruleTernaryOp | (otherlv_5= '(' this_Addition_6= ruleAddition otherlv_7= ')' ) | this_NumberOperation_8= ruleNumberOperation )
            int alt57=6;
            switch ( input.LA(1) ) {
            case RULE_SINT:
                {
                alt57=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt57=2;
                }
                break;
            case 66:
                {
                alt57=3;
                }
                break;
            case 34:
                {
                int LA57_4 = input.LA(2);

                if ( ((LA57_4>=RULE_FLOAT && LA57_4<=RULE_SINT)||LA57_4==34||LA57_4==66||(LA57_4>=86 && LA57_4<=87)) ) {
                    alt57=5;
                }
                else if ( (LA57_4==63) ) {
                    alt57=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 4, input);

                    throw nvae;
                }
                }
                break;
            case 86:
            case 87:
                {
                alt57=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalMiec.g:3034:3: this_IntegerValue_0= ruleIntegerValue
                    {

                    			newCompositeNode(grammarAccess.getNumberAccess().getIntegerValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerValue_0=ruleIntegerValue();

                    state._fsp--;


                    			current = this_IntegerValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiec.g:3043:3: this_FloatValue_1= ruleFloatValue
                    {

                    			newCompositeNode(grammarAccess.getNumberAccess().getFloatValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatValue_1=ruleFloatValue();

                    state._fsp--;


                    			current = this_FloatValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMiec.g:3052:3: (otherlv_2= 'numerical' this_Reference_3= ruleReference )
                    {
                    // InternalMiec.g:3052:3: (otherlv_2= 'numerical' this_Reference_3= ruleReference )
                    // InternalMiec.g:3053:4: otherlv_2= 'numerical' this_Reference_3= ruleReference
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_66); 

                    				newLeafNode(otherlv_2, grammarAccess.getNumberAccess().getNumericalKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getNumberAccess().getReferenceParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Reference_3=ruleReference();

                    state._fsp--;


                    				current = this_Reference_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMiec.g:3067:3: this_TernaryOp_4= ruleTernaryOp
                    {

                    			newCompositeNode(grammarAccess.getNumberAccess().getTernaryOpParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TernaryOp_4=ruleTernaryOp();

                    state._fsp--;


                    			current = this_TernaryOp_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMiec.g:3076:3: (otherlv_5= '(' this_Addition_6= ruleAddition otherlv_7= ')' )
                    {
                    // InternalMiec.g:3076:3: (otherlv_5= '(' this_Addition_6= ruleAddition otherlv_7= ')' )
                    // InternalMiec.g:3077:4: otherlv_5= '(' this_Addition_6= ruleAddition otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_58); 

                    				newLeafNode(otherlv_5, grammarAccess.getNumberAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getNumberAccess().getAdditionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_34);
                    this_Addition_6=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_6;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_7=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getNumberAccess().getRightParenthesisKeyword_4_2());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMiec.g:3095:3: this_NumberOperation_8= ruleNumberOperation
                    {

                    			newCompositeNode(grammarAccess.getNumberAccess().getNumberOperationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberOperation_8=ruleNumberOperation();

                    state._fsp--;


                    			current = this_NumberOperation_8;
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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleExpression"
    // InternalMiec.g:3107:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMiec.g:3107:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMiec.g:3108:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMiec.g:3114:1: ruleExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression | this_BooleanExpression_1= ruleBooleanExpression | this_StringExpression_2= ruleStringExpression | this_Reference_3= ruleReference ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject this_BooleanExpression_1 = null;

        EObject this_StringExpression_2 = null;

        EObject this_Reference_3 = null;



        	enterRule();

        try {
            // InternalMiec.g:3120:2: ( (this_NumberExpression_0= ruleNumberExpression | this_BooleanExpression_1= ruleBooleanExpression | this_StringExpression_2= ruleStringExpression | this_Reference_3= ruleReference ) )
            // InternalMiec.g:3121:2: (this_NumberExpression_0= ruleNumberExpression | this_BooleanExpression_1= ruleBooleanExpression | this_StringExpression_2= ruleStringExpression | this_Reference_3= ruleReference )
            {
            // InternalMiec.g:3121:2: (this_NumberExpression_0= ruleNumberExpression | this_BooleanExpression_1= ruleBooleanExpression | this_StringExpression_2= ruleStringExpression | this_Reference_3= ruleReference )
            int alt58=4;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
            case RULE_SINT:
            case 66:
            case 86:
            case 87:
                {
                alt58=1;
                }
                break;
            case 34:
                {
                int LA58_2 = input.LA(2);

                if ( (LA58_2==67) ) {
                    alt58=2;
                }
                else if ( ((LA58_2>=RULE_FLOAT && LA58_2<=RULE_SINT)||LA58_2==34||LA58_2==63||LA58_2==66||(LA58_2>=86 && LA58_2<=87)) ) {
                    alt58=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOL:
                {
                alt58=2;
                }
                break;
            case RULE_STRING:
                {
                alt58=3;
                }
                break;
            case 69:
            case 70:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalMiec.g:3122:3: this_NumberExpression_0= ruleNumberExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNumberExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberExpression_0=ruleNumberExpression();

                    state._fsp--;


                    			current = this_NumberExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiec.g:3131:3: this_BooleanExpression_1= ruleBooleanExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanExpression_1=ruleBooleanExpression();

                    state._fsp--;


                    			current = this_BooleanExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMiec.g:3140:3: this_StringExpression_2= ruleStringExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getStringExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringExpression_2=ruleStringExpression();

                    state._fsp--;


                    			current = this_StringExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMiec.g:3149:3: this_Reference_3= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getReferenceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_3=ruleReference();

                    state._fsp--;


                    			current = this_Reference_3;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleStringExpression"
    // InternalMiec.g:3161:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // InternalMiec.g:3161:57: (iv_ruleStringExpression= ruleStringExpression EOF )
            // InternalMiec.g:3162:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
             newCompositeNode(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;

             current =iv_ruleStringExpression; 
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
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // InternalMiec.g:3168:1: ruleStringExpression returns [EObject current=null] : this_StringValue_0= ruleStringValue ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:3174:2: (this_StringValue_0= ruleStringValue )
            // InternalMiec.g:3175:2: this_StringValue_0= ruleStringValue
            {

            		newCompositeNode(grammarAccess.getStringExpressionAccess().getStringValueParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_StringValue_0=ruleStringValue();

            state._fsp--;


            		current = this_StringValue_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalMiec.g:3186:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalMiec.g:3186:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalMiec.g:3187:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalMiec.g:3193:1: ruleBooleanExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_Comparison_1= ruleComparison ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_Comparison_1 = null;



        	enterRule();

        try {
            // InternalMiec.g:3199:2: ( (this_BooleanValue_0= ruleBooleanValue | this_Comparison_1= ruleComparison ) )
            // InternalMiec.g:3200:2: (this_BooleanValue_0= ruleBooleanValue | this_Comparison_1= ruleComparison )
            {
            // InternalMiec.g:3200:2: (this_BooleanValue_0= ruleBooleanValue | this_Comparison_1= ruleComparison )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_BOOL) ) {
                alt59=1;
            }
            else if ( (LA59_0==34) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalMiec.g:3201:3: this_BooleanValue_0= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_0=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiec.g:3210:3: this_Comparison_1= ruleComparison
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getComparisonParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comparison_1=ruleComparison();

                    state._fsp--;


                    			current = this_Comparison_1;
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalMiec.g:3222:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalMiec.g:3222:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalMiec.g:3223:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMiec.g:3229:1: ruleComparison returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'cmp' ( (lv_op1_2_0= ruleExpression ) ) ( (lv_operation_3_0= ruleOperation ) ) ( (lv_op2_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_op1_2_0 = null;

        Enumerator lv_operation_3_0 = null;

        EObject lv_op2_4_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:3235:2: ( (otherlv_0= '(' otherlv_1= 'cmp' ( (lv_op1_2_0= ruleExpression ) ) ( (lv_operation_3_0= ruleOperation ) ) ( (lv_op2_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalMiec.g:3236:2: (otherlv_0= '(' otherlv_1= 'cmp' ( (lv_op1_2_0= ruleExpression ) ) ( (lv_operation_3_0= ruleOperation ) ) ( (lv_op2_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalMiec.g:3236:2: (otherlv_0= '(' otherlv_1= 'cmp' ( (lv_op1_2_0= ruleExpression ) ) ( (lv_operation_3_0= ruleOperation ) ) ( (lv_op2_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalMiec.g:3237:3: otherlv_0= '(' otherlv_1= 'cmp' ( (lv_op1_2_0= ruleExpression ) ) ( (lv_operation_3_0= ruleOperation ) ) ( (lv_op2_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getComparisonAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,67,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getCmpKeyword_1());
            		
            // InternalMiec.g:3245:3: ( (lv_op1_2_0= ruleExpression ) )
            // InternalMiec.g:3246:4: (lv_op1_2_0= ruleExpression )
            {
            // InternalMiec.g:3246:4: (lv_op1_2_0= ruleExpression )
            // InternalMiec.g:3247:5: lv_op1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOp1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_74);
            lv_op1_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"op1",
            						lv_op1_2_0,
            						"org.xtext.iec62443.baseModel.Miec.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiec.g:3264:3: ( (lv_operation_3_0= ruleOperation ) )
            // InternalMiec.g:3265:4: (lv_operation_3_0= ruleOperation )
            {
            // InternalMiec.g:3265:4: (lv_operation_3_0= ruleOperation )
            // InternalMiec.g:3266:5: lv_operation_3_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOperationOperationEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_66);
            lv_operation_3_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_3_0,
            						"org.xtext.iec62443.baseModel.Miec.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiec.g:3283:3: ( (lv_op2_4_0= ruleExpression ) )
            // InternalMiec.g:3284:4: (lv_op2_4_0= ruleExpression )
            {
            // InternalMiec.g:3284:4: (lv_op2_4_0= ruleExpression )
            // InternalMiec.g:3285:5: lv_op2_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOp2ExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_34);
            lv_op2_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"op2",
            						lv_op2_4_0,
            						"org.xtext.iec62443.baseModel.Miec.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleChannel"
    // InternalMiec.g:3310:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalMiec.g:3310:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalMiec.g:3311:2: iv_ruleChannel= ruleChannel EOF
            {
             newCompositeNode(grammarAccess.getChannelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannel=ruleChannel();

            state._fsp--;

             current =iv_ruleChannel; 
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
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalMiec.g:3317:1: ruleChannel returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'connects' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' otherlv_11= ')' ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalMiec.g:3323:2: ( (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'connects' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' otherlv_11= ')' ) )
            // InternalMiec.g:3324:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'connects' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' otherlv_11= ')' )
            {
            // InternalMiec.g:3324:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'connects' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' otherlv_11= ')' )
            // InternalMiec.g:3325:3: otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'connects' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getChannelAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMiec.g:3329:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiec.g:3330:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiec.g:3330:4: (lv_name_1_0= RULE_ID )
            // InternalMiec.g:3331:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChannelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getChannelAccess().getSemicolonKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getConnectsKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMiec.g:3359:3: ( (otherlv_5= RULE_ID ) )
            // InternalMiec.g:3360:4: (otherlv_5= RULE_ID )
            {
            // InternalMiec.g:3360:4: (otherlv_5= RULE_ID )
            // InternalMiec.g:3361:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChannelRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_5, grammarAccess.getChannelAccess().getConnectsComponentCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getChannelAccess().getCommaKeyword_6());
            		
            // InternalMiec.g:3376:3: ( (otherlv_7= RULE_ID ) )
            // InternalMiec.g:3377:4: (otherlv_7= RULE_ID )
            {
            // InternalMiec.g:3377:4: (otherlv_7= RULE_ID )
            // InternalMiec.g:3378:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChannelRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_7, grammarAccess.getChannelAccess().getConnectsComponentCrossReference_7_0());
            				

            }


            }

            // InternalMiec.g:3389:3: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==29) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalMiec.g:3390:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,29,FOLLOW_7); 

            	    				newLeafNode(otherlv_8, grammarAccess.getChannelAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMiec.g:3394:4: ( (otherlv_9= RULE_ID ) )
            	    // InternalMiec.g:3395:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalMiec.g:3395:5: (otherlv_9= RULE_ID )
            	    // InternalMiec.g:3396:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getChannelRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    						newLeafNode(otherlv_9, grammarAccess.getChannelAccess().getConnectsComponentCrossReference_8_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_10=(Token)match(input,23,FOLLOW_34); 

            			newLeafNode(otherlv_10, grammarAccess.getChannelAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getChannelAccess().getRightParenthesisKeyword_10());
            		

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
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleConstraint"
    // InternalMiec.g:3420:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMiec.g:3420:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMiec.g:3421:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalMiec.g:3427:1: ruleConstraint returns [EObject current=null] : (this_PresenceConstraint_0= rulePresenceConstraint | this_OperationConstraint_1= ruleOperationConstraint ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_PresenceConstraint_0 = null;

        EObject this_OperationConstraint_1 = null;



        	enterRule();

        try {
            // InternalMiec.g:3433:2: ( (this_PresenceConstraint_0= rulePresenceConstraint | this_OperationConstraint_1= ruleOperationConstraint ) )
            // InternalMiec.g:3434:2: (this_PresenceConstraint_0= rulePresenceConstraint | this_OperationConstraint_1= ruleOperationConstraint )
            {
            // InternalMiec.g:3434:2: (this_PresenceConstraint_0= rulePresenceConstraint | this_OperationConstraint_1= ruleOperationConstraint )
            int alt61=2;
            switch ( input.LA(1) ) {
            case 68:
                {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==59) ) {
                    alt61=1;
                }
                else if ( (LA61_1==RULE_ID) ) {
                    alt61=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
                }
                break;
            case 59:
                {
                alt61=1;
                }
                break;
            case RULE_ID:
                {
                alt61=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalMiec.g:3435:3: this_PresenceConstraint_0= rulePresenceConstraint
                    {

                    			newCompositeNode(grammarAccess.getConstraintAccess().getPresenceConstraintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PresenceConstraint_0=rulePresenceConstraint();

                    state._fsp--;


                    			current = this_PresenceConstraint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiec.g:3444:3: this_OperationConstraint_1= ruleOperationConstraint
                    {

                    			newCompositeNode(grammarAccess.getConstraintAccess().getOperationConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationConstraint_1=ruleOperationConstraint();

                    state._fsp--;


                    			current = this_OperationConstraint_1;
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRulePresenceConstraint"
    // InternalMiec.g:3456:1: entryRulePresenceConstraint returns [EObject current=null] : iv_rulePresenceConstraint= rulePresenceConstraint EOF ;
    public final EObject entryRulePresenceConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresenceConstraint = null;


        try {
            // InternalMiec.g:3456:59: (iv_rulePresenceConstraint= rulePresenceConstraint EOF )
            // InternalMiec.g:3457:2: iv_rulePresenceConstraint= rulePresenceConstraint EOF
            {
             newCompositeNode(grammarAccess.getPresenceConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresenceConstraint=rulePresenceConstraint();

            state._fsp--;

             current =iv_rulePresenceConstraint; 
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
    // $ANTLR end "entryRulePresenceConstraint"


    // $ANTLR start "rulePresenceConstraint"
    // InternalMiec.g:3463:1: rulePresenceConstraint returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'needs' ( (lv_propertyName_2_0= RULE_ID ) ) ) ;
    public final EObject rulePresenceConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token otherlv_1=null;
        Token lv_propertyName_2_0=null;


        	enterRule();

        try {
            // InternalMiec.g:3469:2: ( ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'needs' ( (lv_propertyName_2_0= RULE_ID ) ) ) )
            // InternalMiec.g:3470:2: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'needs' ( (lv_propertyName_2_0= RULE_ID ) ) )
            {
            // InternalMiec.g:3470:2: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'needs' ( (lv_propertyName_2_0= RULE_ID ) ) )
            // InternalMiec.g:3471:3: ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'needs' ( (lv_propertyName_2_0= RULE_ID ) )
            {
            // InternalMiec.g:3471:3: ( (lv_optional_0_0= 'optional' ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==68) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMiec.g:3472:4: (lv_optional_0_0= 'optional' )
                    {
                    // InternalMiec.g:3472:4: (lv_optional_0_0= 'optional' )
                    // InternalMiec.g:3473:5: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,68,FOLLOW_61); 

                    					newLeafNode(lv_optional_0_0, grammarAccess.getPresenceConstraintAccess().getOptionalOptionalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPresenceConstraintRule());
                    					}
                    					setWithLastConsumed(current, "optional", lv_optional_0_0 != null, "optional");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,59,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPresenceConstraintAccess().getNeedsKeyword_1());
            		
            // InternalMiec.g:3489:3: ( (lv_propertyName_2_0= RULE_ID ) )
            // InternalMiec.g:3490:4: (lv_propertyName_2_0= RULE_ID )
            {
            // InternalMiec.g:3490:4: (lv_propertyName_2_0= RULE_ID )
            // InternalMiec.g:3491:5: lv_propertyName_2_0= RULE_ID
            {
            lv_propertyName_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_propertyName_2_0, grammarAccess.getPresenceConstraintAccess().getPropertyNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresenceConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"propertyName",
            						lv_propertyName_2_0,
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
    // $ANTLR end "rulePresenceConstraint"


    // $ANTLR start "entryRuleOperationConstraint"
    // InternalMiec.g:3511:1: entryRuleOperationConstraint returns [EObject current=null] : iv_ruleOperationConstraint= ruleOperationConstraint EOF ;
    public final EObject entryRuleOperationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationConstraint = null;


        try {
            // InternalMiec.g:3511:60: (iv_ruleOperationConstraint= ruleOperationConstraint EOF )
            // InternalMiec.g:3512:2: iv_ruleOperationConstraint= ruleOperationConstraint EOF
            {
             newCompositeNode(grammarAccess.getOperationConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationConstraint=ruleOperationConstraint();

            state._fsp--;

             current =iv_ruleOperationConstraint; 
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
    // $ANTLR end "entryRuleOperationConstraint"


    // $ANTLR start "ruleOperationConstraint"
    // InternalMiec.g:3518:1: ruleOperationConstraint returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_propertyName_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleOperation ) ) ( (lv_value_3_0= ruleValueOrReference ) ) ) ;
    public final EObject ruleOperationConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token lv_propertyName_1_0=null;
        Enumerator lv_operation_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMiec.g:3524:2: ( ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_propertyName_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleOperation ) ) ( (lv_value_3_0= ruleValueOrReference ) ) ) )
            // InternalMiec.g:3525:2: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_propertyName_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleOperation ) ) ( (lv_value_3_0= ruleValueOrReference ) ) )
            {
            // InternalMiec.g:3525:2: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_propertyName_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleOperation ) ) ( (lv_value_3_0= ruleValueOrReference ) ) )
            // InternalMiec.g:3526:3: ( (lv_optional_0_0= 'optional' ) )? ( (lv_propertyName_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleOperation ) ) ( (lv_value_3_0= ruleValueOrReference ) )
            {
            // InternalMiec.g:3526:3: ( (lv_optional_0_0= 'optional' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==68) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMiec.g:3527:4: (lv_optional_0_0= 'optional' )
                    {
                    // InternalMiec.g:3527:4: (lv_optional_0_0= 'optional' )
                    // InternalMiec.g:3528:5: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,68,FOLLOW_7); 

                    					newLeafNode(lv_optional_0_0, grammarAccess.getOperationConstraintAccess().getOptionalOptionalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationConstraintRule());
                    					}
                    					setWithLastConsumed(current, "optional", lv_optional_0_0 != null, "optional");
                    				

                    }


                    }
                    break;

            }

            // InternalMiec.g:3540:3: ( (lv_propertyName_1_0= RULE_ID ) )
            // InternalMiec.g:3541:4: (lv_propertyName_1_0= RULE_ID )
            {
            // InternalMiec.g:3541:4: (lv_propertyName_1_0= RULE_ID )
            // InternalMiec.g:3542:5: lv_propertyName_1_0= RULE_ID
            {
            lv_propertyName_1_0=(Token)match(input,RULE_ID,FOLLOW_74); 

            					newLeafNode(lv_propertyName_1_0, grammarAccess.getOperationConstraintAccess().getPropertyNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"propertyName",
            						lv_propertyName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMiec.g:3558:3: ( (lv_operation_2_0= ruleOperation ) )
            // InternalMiec.g:3559:4: (lv_operation_2_0= ruleOperation )
            {
            // InternalMiec.g:3559:4: (lv_operation_2_0= ruleOperation )
            // InternalMiec.g:3560:5: lv_operation_2_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getOperationConstraintAccess().getOperationOperationEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_66);
            lv_operation_2_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationConstraintRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_2_0,
            						"org.xtext.iec62443.baseModel.Miec.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiec.g:3577:3: ( (lv_value_3_0= ruleValueOrReference ) )
            // InternalMiec.g:3578:4: (lv_value_3_0= ruleValueOrReference )
            {
            // InternalMiec.g:3578:4: (lv_value_3_0= ruleValueOrReference )
            // InternalMiec.g:3579:5: lv_value_3_0= ruleValueOrReference
            {

            					newCompositeNode(grammarAccess.getOperationConstraintAccess().getValueValueOrReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleValueOrReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationConstraintRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.iec62443.baseModel.Miec.ValueOrReference");
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
    // $ANTLR end "ruleOperationConstraint"


    // $ANTLR start "entryRuleValueOrReference"
    // InternalMiec.g:3600:1: entryRuleValueOrReference returns [EObject current=null] : iv_ruleValueOrReference= ruleValueOrReference EOF ;
    public final EObject entryRuleValueOrReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueOrReference = null;


        try {
            // InternalMiec.g:3600:57: (iv_ruleValueOrReference= ruleValueOrReference EOF )
            // InternalMiec.g:3601:2: iv_ruleValueOrReference= ruleValueOrReference EOF
            {
             newCompositeNode(grammarAccess.getValueOrReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueOrReference=ruleValueOrReference();

            state._fsp--;

             current =iv_ruleValueOrReference; 
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
    // $ANTLR end "entryRuleValueOrReference"


    // $ANTLR start "ruleValueOrReference"
    // InternalMiec.g:3607:1: ruleValueOrReference returns [EObject current=null] : (this_Value_0= ruleValue | this_Reference_1= ruleReference ) ;
    public final EObject ruleValueOrReference() throws RecognitionException {
        EObject current = null;

        EObject this_Value_0 = null;

        EObject this_Reference_1 = null;



        	enterRule();

        try {
            // InternalMiec.g:3613:2: ( (this_Value_0= ruleValue | this_Reference_1= ruleReference ) )
            // InternalMiec.g:3614:2: (this_Value_0= ruleValue | this_Reference_1= ruleReference )
            {
            // InternalMiec.g:3614:2: (this_Value_0= ruleValue | this_Reference_1= ruleReference )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_SINT)) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=69 && LA64_0<=70)) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalMiec.g:3615:3: this_Value_0= ruleValue
                    {

                    			newCompositeNode(grammarAccess.getValueOrReferenceAccess().getValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Value_0=ruleValue();

                    state._fsp--;


                    			current = this_Value_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiec.g:3624:3: this_Reference_1= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getValueOrReferenceAccess().getReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_1=ruleReference();

                    state._fsp--;


                    			current = this_Reference_1;
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
    // $ANTLR end "ruleValueOrReference"


    // $ANTLR start "entryRuleReference"
    // InternalMiec.g:3636:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalMiec.g:3636:50: (iv_ruleReference= ruleReference EOF )
            // InternalMiec.g:3637:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalMiec.g:3643:1: ruleReference returns [EObject current=null] : (this_SelfReference_0= ruleSelfReference | this_DeviceReference_1= ruleDeviceReference ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        EObject this_SelfReference_0 = null;

        EObject this_DeviceReference_1 = null;



        	enterRule();

        try {
            // InternalMiec.g:3649:2: ( (this_SelfReference_0= ruleSelfReference | this_DeviceReference_1= ruleDeviceReference ) )
            // InternalMiec.g:3650:2: (this_SelfReference_0= ruleSelfReference | this_DeviceReference_1= ruleDeviceReference )
            {
            // InternalMiec.g:3650:2: (this_SelfReference_0= ruleSelfReference | this_DeviceReference_1= ruleDeviceReference )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==70) ) {
                alt65=1;
            }
            else if ( (LA65_0==69) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalMiec.g:3651:3: this_SelfReference_0= ruleSelfReference
                    {

                    			newCompositeNode(grammarAccess.getReferenceAccess().getSelfReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelfReference_0=ruleSelfReference();

                    state._fsp--;


                    			current = this_SelfReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiec.g:3660:3: this_DeviceReference_1= ruleDeviceReference
                    {

                    			newCompositeNode(grammarAccess.getReferenceAccess().getDeviceReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeviceReference_1=ruleDeviceReference();

                    state._fsp--;


                    			current = this_DeviceReference_1;
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleDeviceReference"
    // InternalMiec.g:3672:1: entryRuleDeviceReference returns [EObject current=null] : iv_ruleDeviceReference= ruleDeviceReference EOF ;
    public final EObject entryRuleDeviceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceReference = null;


        try {
            // InternalMiec.g:3672:56: (iv_ruleDeviceReference= ruleDeviceReference EOF )
            // InternalMiec.g:3673:2: iv_ruleDeviceReference= ruleDeviceReference EOF
            {
             newCompositeNode(grammarAccess.getDeviceReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceReference=ruleDeviceReference();

            state._fsp--;

             current =iv_ruleDeviceReference; 
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
    // $ANTLR end "entryRuleDeviceReference"


    // $ANTLR start "ruleDeviceReference"
    // InternalMiec.g:3679:1: ruleDeviceReference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_reference_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeviceReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reference_1_0=null;


        	enterRule();

        try {
            // InternalMiec.g:3685:2: ( (otherlv_0= 'ref' ( (lv_reference_1_0= RULE_STRING ) ) ) )
            // InternalMiec.g:3686:2: (otherlv_0= 'ref' ( (lv_reference_1_0= RULE_STRING ) ) )
            {
            // InternalMiec.g:3686:2: (otherlv_0= 'ref' ( (lv_reference_1_0= RULE_STRING ) ) )
            // InternalMiec.g:3687:3: otherlv_0= 'ref' ( (lv_reference_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceReferenceAccess().getRefKeyword_0());
            		
            // InternalMiec.g:3691:3: ( (lv_reference_1_0= RULE_STRING ) )
            // InternalMiec.g:3692:4: (lv_reference_1_0= RULE_STRING )
            {
            // InternalMiec.g:3692:4: (lv_reference_1_0= RULE_STRING )
            // InternalMiec.g:3693:5: lv_reference_1_0= RULE_STRING
            {
            lv_reference_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_reference_1_0, grammarAccess.getDeviceReferenceAccess().getReferenceSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"reference",
            						lv_reference_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleDeviceReference"


    // $ANTLR start "entryRuleSelfReference"
    // InternalMiec.g:3713:1: entryRuleSelfReference returns [EObject current=null] : iv_ruleSelfReference= ruleSelfReference EOF ;
    public final EObject entryRuleSelfReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfReference = null;


        try {
            // InternalMiec.g:3713:54: (iv_ruleSelfReference= ruleSelfReference EOF )
            // InternalMiec.g:3714:2: iv_ruleSelfReference= ruleSelfReference EOF
            {
             newCompositeNode(grammarAccess.getSelfReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelfReference=ruleSelfReference();

            state._fsp--;

             current =iv_ruleSelfReference; 
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
    // $ANTLR end "entryRuleSelfReference"


    // $ANTLR start "ruleSelfReference"
    // InternalMiec.g:3720:1: ruleSelfReference returns [EObject current=null] : (otherlv_0= 'self' ( (lv_reference_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSelfReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reference_1_0=null;


        	enterRule();

        try {
            // InternalMiec.g:3726:2: ( (otherlv_0= 'self' ( (lv_reference_1_0= RULE_STRING ) ) ) )
            // InternalMiec.g:3727:2: (otherlv_0= 'self' ( (lv_reference_1_0= RULE_STRING ) ) )
            {
            // InternalMiec.g:3727:2: (otherlv_0= 'self' ( (lv_reference_1_0= RULE_STRING ) ) )
            // InternalMiec.g:3728:3: otherlv_0= 'self' ( (lv_reference_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSelfReferenceAccess().getSelfKeyword_0());
            		
            // InternalMiec.g:3732:3: ( (lv_reference_1_0= RULE_STRING ) )
            // InternalMiec.g:3733:4: (lv_reference_1_0= RULE_STRING )
            {
            // InternalMiec.g:3733:4: (lv_reference_1_0= RULE_STRING )
            // InternalMiec.g:3734:5: lv_reference_1_0= RULE_STRING
            {
            lv_reference_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_reference_1_0, grammarAccess.getSelfReferenceAccess().getReferenceSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelfReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"reference",
            						lv_reference_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSelfReference"


    // $ANTLR start "entryRuleValue"
    // InternalMiec.g:3754:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMiec.g:3754:46: (iv_ruleValue= ruleValue EOF )
            // InternalMiec.g:3755:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMiec.g:3761:1: ruleValue returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue | this_StringValue_3= ruleStringValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_IntegerValue_1 = null;

        EObject this_FloatValue_2 = null;

        EObject this_StringValue_3 = null;



        	enterRule();

        try {
            // InternalMiec.g:3767:2: ( (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue | this_StringValue_3= ruleStringValue ) )
            // InternalMiec.g:3768:2: (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue | this_StringValue_3= ruleStringValue )
            {
            // InternalMiec.g:3768:2: (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue | this_StringValue_3= ruleStringValue )
            int alt66=4;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt66=1;
                }
                break;
            case RULE_SINT:
                {
                alt66=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt66=3;
                }
                break;
            case RULE_STRING:
                {
                alt66=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalMiec.g:3769:3: this_BooleanValue_0= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_0=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiec.g:3778:3: this_IntegerValue_1= ruleIntegerValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerValue_1=ruleIntegerValue();

                    state._fsp--;


                    			current = this_IntegerValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMiec.g:3787:3: this_FloatValue_2= ruleFloatValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatValue_2=ruleFloatValue();

                    state._fsp--;


                    			current = this_FloatValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMiec.g:3796:3: this_StringValue_3= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_3=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_3;
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalMiec.g:3808:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalMiec.g:3808:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalMiec.g:3809:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalMiec.g:3815:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMiec.g:3821:2: ( ( (lv_value_0_0= RULE_BOOL ) ) )
            // InternalMiec.g:3822:2: ( (lv_value_0_0= RULE_BOOL ) )
            {
            // InternalMiec.g:3822:2: ( (lv_value_0_0= RULE_BOOL ) )
            // InternalMiec.g:3823:3: (lv_value_0_0= RULE_BOOL )
            {
            // InternalMiec.g:3823:3: (lv_value_0_0= RULE_BOOL )
            // InternalMiec.g:3824:4: lv_value_0_0= RULE_BOOL
            {
            lv_value_0_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getBooleanValueAccess().getValueBOOLTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.iec62443.baseModel.Miec.BOOL");
            			

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalMiec.g:3843:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalMiec.g:3843:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalMiec.g:3844:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalMiec.g:3850:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMiec.g:3856:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMiec.g:3857:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMiec.g:3857:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMiec.g:3858:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMiec.g:3858:3: (lv_value_0_0= RULE_STRING )
            // InternalMiec.g:3859:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalMiec.g:3878:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalMiec.g:3878:51: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalMiec.g:3879:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
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
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalMiec.g:3885:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMiec.g:3891:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalMiec.g:3892:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalMiec.g:3892:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalMiec.g:3893:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalMiec.g:3893:3: (lv_value_0_0= RULE_FLOAT )
            // InternalMiec.g:3894:4: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFloatValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.iec62443.baseModel.Miec.FLOAT");
            			

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
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalMiec.g:3913:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalMiec.g:3913:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalMiec.g:3914:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
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
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalMiec.g:3920:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= RULE_SINT ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMiec.g:3926:2: ( ( (lv_value_0_0= RULE_SINT ) ) )
            // InternalMiec.g:3927:2: ( (lv_value_0_0= RULE_SINT ) )
            {
            // InternalMiec.g:3927:2: ( (lv_value_0_0= RULE_SINT ) )
            // InternalMiec.g:3928:3: (lv_value_0_0= RULE_SINT )
            {
            // InternalMiec.g:3928:3: (lv_value_0_0= RULE_SINT )
            // InternalMiec.g:3929:4: lv_value_0_0= RULE_SINT
            {
            lv_value_0_0=(Token)match(input,RULE_SINT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntegerValueAccess().getValueSINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntegerValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.iec62443.baseModel.Miec.SINT");
            			

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
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRulePositiveIntegerValue"
    // InternalMiec.g:3948:1: entryRulePositiveIntegerValue returns [EObject current=null] : iv_rulePositiveIntegerValue= rulePositiveIntegerValue EOF ;
    public final EObject entryRulePositiveIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositiveIntegerValue = null;


        try {
            // InternalMiec.g:3948:61: (iv_rulePositiveIntegerValue= rulePositiveIntegerValue EOF )
            // InternalMiec.g:3949:2: iv_rulePositiveIntegerValue= rulePositiveIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getPositiveIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositiveIntegerValue=rulePositiveIntegerValue();

            state._fsp--;

             current =iv_rulePositiveIntegerValue; 
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
    // $ANTLR end "entryRulePositiveIntegerValue"


    // $ANTLR start "rulePositiveIntegerValue"
    // InternalMiec.g:3955:1: rulePositiveIntegerValue returns [EObject current=null] : ( (lv_value_0_0= RULE_SINT ) ) ;
    public final EObject rulePositiveIntegerValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMiec.g:3961:2: ( ( (lv_value_0_0= RULE_SINT ) ) )
            // InternalMiec.g:3962:2: ( (lv_value_0_0= RULE_SINT ) )
            {
            // InternalMiec.g:3962:2: ( (lv_value_0_0= RULE_SINT ) )
            // InternalMiec.g:3963:3: (lv_value_0_0= RULE_SINT )
            {
            // InternalMiec.g:3963:3: (lv_value_0_0= RULE_SINT )
            // InternalMiec.g:3964:4: lv_value_0_0= RULE_SINT
            {
            lv_value_0_0=(Token)match(input,RULE_SINT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getPositiveIntegerValueAccess().getValueSINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPositiveIntegerValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.iec62443.baseModel.Miec.SINT");
            			

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
    // $ANTLR end "rulePositiveIntegerValue"


    // $ANTLR start "ruleSecurityLevel"
    // InternalMiec.g:3983:1: ruleSecurityLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'SL0' ) | (enumLiteral_1= 'SL1' ) | (enumLiteral_2= 'SL2' ) | (enumLiteral_3= 'SL3' ) | (enumLiteral_4= 'SL4' ) | (enumLiteral_5= 'NR' ) ) ;
    public final Enumerator ruleSecurityLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMiec.g:3989:2: ( ( (enumLiteral_0= 'SL0' ) | (enumLiteral_1= 'SL1' ) | (enumLiteral_2= 'SL2' ) | (enumLiteral_3= 'SL3' ) | (enumLiteral_4= 'SL4' ) | (enumLiteral_5= 'NR' ) ) )
            // InternalMiec.g:3990:2: ( (enumLiteral_0= 'SL0' ) | (enumLiteral_1= 'SL1' ) | (enumLiteral_2= 'SL2' ) | (enumLiteral_3= 'SL3' ) | (enumLiteral_4= 'SL4' ) | (enumLiteral_5= 'NR' ) )
            {
            // InternalMiec.g:3990:2: ( (enumLiteral_0= 'SL0' ) | (enumLiteral_1= 'SL1' ) | (enumLiteral_2= 'SL2' ) | (enumLiteral_3= 'SL3' ) | (enumLiteral_4= 'SL4' ) | (enumLiteral_5= 'NR' ) )
            int alt67=6;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt67=1;
                }
                break;
            case 72:
                {
                alt67=2;
                }
                break;
            case 73:
                {
                alt67=3;
                }
                break;
            case 74:
                {
                alt67=4;
                }
                break;
            case 75:
                {
                alt67=5;
                }
                break;
            case 76:
                {
                alt67=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalMiec.g:3991:3: (enumLiteral_0= 'SL0' )
                    {
                    // InternalMiec.g:3991:3: (enumLiteral_0= 'SL0' )
                    // InternalMiec.g:3992:4: enumLiteral_0= 'SL0'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getSecurityLevelAccess().getSL0EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSecurityLevelAccess().getSL0EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:3999:3: (enumLiteral_1= 'SL1' )
                    {
                    // InternalMiec.g:3999:3: (enumLiteral_1= 'SL1' )
                    // InternalMiec.g:4000:4: enumLiteral_1= 'SL1'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getSecurityLevelAccess().getSL1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSecurityLevelAccess().getSL1EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMiec.g:4007:3: (enumLiteral_2= 'SL2' )
                    {
                    // InternalMiec.g:4007:3: (enumLiteral_2= 'SL2' )
                    // InternalMiec.g:4008:4: enumLiteral_2= 'SL2'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getSecurityLevelAccess().getSL2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSecurityLevelAccess().getSL2EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMiec.g:4015:3: (enumLiteral_3= 'SL3' )
                    {
                    // InternalMiec.g:4015:3: (enumLiteral_3= 'SL3' )
                    // InternalMiec.g:4016:4: enumLiteral_3= 'SL3'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getSecurityLevelAccess().getSL3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSecurityLevelAccess().getSL3EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMiec.g:4023:3: (enumLiteral_4= 'SL4' )
                    {
                    // InternalMiec.g:4023:3: (enumLiteral_4= 'SL4' )
                    // InternalMiec.g:4024:4: enumLiteral_4= 'SL4'
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getSecurityLevelAccess().getSL4EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSecurityLevelAccess().getSL4EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMiec.g:4031:3: (enumLiteral_5= 'NR' )
                    {
                    // InternalMiec.g:4031:3: (enumLiteral_5= 'NR' )
                    // InternalMiec.g:4032:4: enumLiteral_5= 'NR'
                    {
                    enumLiteral_5=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getSecurityLevelAccess().getNREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSecurityLevelAccess().getNREnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleSecurityLevel"


    // $ANTLR start "ruleOperation"
    // InternalMiec.g:4042:1: ruleOperation returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) ;
    public final Enumerator ruleOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMiec.g:4048:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) )
            // InternalMiec.g:4049:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            {
            // InternalMiec.g:4049:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            int alt68=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt68=1;
                }
                break;
            case 77:
                {
                alt68=2;
                }
                break;
            case 78:
                {
                alt68=3;
                }
                break;
            case 79:
                {
                alt68=4;
                }
                break;
            case 80:
                {
                alt68=5;
                }
                break;
            case 81:
                {
                alt68=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalMiec.g:4050:3: (enumLiteral_0= '=' )
                    {
                    // InternalMiec.g:4050:3: (enumLiteral_0= '=' )
                    // InternalMiec.g:4051:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getEqEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationAccess().getEqEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:4058:3: (enumLiteral_1= '!=' )
                    {
                    // InternalMiec.g:4058:3: (enumLiteral_1= '!=' )
                    // InternalMiec.g:4059:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getNeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationAccess().getNeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMiec.g:4066:3: (enumLiteral_2= '>' )
                    {
                    // InternalMiec.g:4066:3: (enumLiteral_2= '>' )
                    // InternalMiec.g:4067:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getGtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationAccess().getGtEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMiec.g:4074:3: (enumLiteral_3= '>=' )
                    {
                    // InternalMiec.g:4074:3: (enumLiteral_3= '>=' )
                    // InternalMiec.g:4075:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getGeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperationAccess().getGeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMiec.g:4082:3: (enumLiteral_4= '<=' )
                    {
                    // InternalMiec.g:4082:3: (enumLiteral_4= '<=' )
                    // InternalMiec.g:4083:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getLeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperationAccess().getLeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMiec.g:4090:3: (enumLiteral_5= '<' )
                    {
                    // InternalMiec.g:4090:3: (enumLiteral_5= '<' )
                    // InternalMiec.g:4091:4: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getLtEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperationAccess().getLtEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "ruleNumberOperation1"
    // InternalMiec.g:4101:1: ruleNumberOperation1 returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleNumberOperation1() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMiec.g:4107:2: ( (enumLiteral_0= '+' ) )
            // InternalMiec.g:4108:2: (enumLiteral_0= '+' )
            {
            // InternalMiec.g:4108:2: (enumLiteral_0= '+' )
            // InternalMiec.g:4109:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

            			current = grammarAccess.getNumberOperation1Access().getAddEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getNumberOperation1Access().getAddEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleNumberOperation1"


    // $ANTLR start "ruleNumberOperation2"
    // InternalMiec.g:4118:1: ruleNumberOperation2 returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleNumberOperation2() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMiec.g:4124:2: ( (enumLiteral_0= '-' ) )
            // InternalMiec.g:4125:2: (enumLiteral_0= '-' )
            {
            // InternalMiec.g:4125:2: (enumLiteral_0= '-' )
            // InternalMiec.g:4126:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

            			current = grammarAccess.getNumberOperation2Access().getMinusEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getNumberOperation2Access().getMinusEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleNumberOperation2"


    // $ANTLR start "ruleNumberOperation3"
    // InternalMiec.g:4135:1: ruleNumberOperation3 returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleNumberOperation3() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMiec.g:4141:2: ( (enumLiteral_0= '*' ) )
            // InternalMiec.g:4142:2: (enumLiteral_0= '*' )
            {
            // InternalMiec.g:4142:2: (enumLiteral_0= '*' )
            // InternalMiec.g:4143:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,84,FOLLOW_2); 

            			current = grammarAccess.getNumberOperation3Access().getMulEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getNumberOperation3Access().getMulEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleNumberOperation3"


    // $ANTLR start "ruleNumberOperation4"
    // InternalMiec.g:4152:1: ruleNumberOperation4 returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleNumberOperation4() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMiec.g:4158:2: ( (enumLiteral_0= '/' ) )
            // InternalMiec.g:4159:2: (enumLiteral_0= '/' )
            {
            // InternalMiec.g:4159:2: (enumLiteral_0= '/' )
            // InternalMiec.g:4160:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,85,FOLLOW_2); 

            			current = grammarAccess.getNumberOperation4Access().getDivEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getNumberOperation4Access().getDivEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleNumberOperation4"


    // $ANTLR start "ruleNumberOperationStart"
    // InternalMiec.g:4169:1: ruleNumberOperationStart returns [Enumerator current=null] : ( (enumLiteral_0= 'max' ) | (enumLiteral_1= 'min' ) ) ;
    public final Enumerator ruleNumberOperationStart() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMiec.g:4175:2: ( ( (enumLiteral_0= 'max' ) | (enumLiteral_1= 'min' ) ) )
            // InternalMiec.g:4176:2: ( (enumLiteral_0= 'max' ) | (enumLiteral_1= 'min' ) )
            {
            // InternalMiec.g:4176:2: ( (enumLiteral_0= 'max' ) | (enumLiteral_1= 'min' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==86) ) {
                alt69=1;
            }
            else if ( (LA69_0==87) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalMiec.g:4177:3: (enumLiteral_0= 'max' )
                    {
                    // InternalMiec.g:4177:3: (enumLiteral_0= 'max' )
                    // InternalMiec.g:4178:4: enumLiteral_0= 'max'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getNumberOperationStartAccess().getMaxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNumberOperationStartAccess().getMaxEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:4185:3: (enumLiteral_1= 'min' )
                    {
                    // InternalMiec.g:4185:3: (enumLiteral_1= 'min' )
                    // InternalMiec.g:4186:4: enumLiteral_1= 'min'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getNumberOperationStartAccess().getMinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNumberOperationStartAccess().getMinEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleNumberOperationStart"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008007000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008007000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001F80L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0003C00000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000400000180L,0x0000000000C00004L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0800000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x00000004000001E0L,0x0000000000C00064L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000040000L,0x000000000003E000L});

}