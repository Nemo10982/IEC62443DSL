package org.xtext.iec62443.baseModel.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.iec62443.baseModel.services.MiecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiecParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOL", "RULE_FLOAT", "RULE_SINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'nothing'", "'SL0'", "'SL1'", "'SL2'", "'SL3'", "'SL4'", "'='", "'!='", "'>'", "'>='", "'<='", "'<'", "'Zone'", "'{'", "'target'", "'}'", "';'", "'components'", "','", "'countermeasures'", "'subzones'", "'['", "']'", "'('", "'capability'", "')'", "'Conduit'", "'connects'", "'channels'", "'device'", "'properties'", "'system'", "'devices'", "'application'", "'executed'", "'on'", "'constraints'", "'communicates'", "'with'", "'needs'", "'ref'", "'self'", "'trusted'", "'physical'", "'network'", "'embedded'", "'host'", "'optional'"
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
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SINT=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

    	public void setGrammarAccess(MiecGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMiec.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMiec.g:54:1: ( ruleModel EOF )
            // InternalMiec.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMiec.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMiec.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMiec.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMiec.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMiec.g:69:3: ( rule__Model__Group__0 )
            // InternalMiec.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleComponent"
    // InternalMiec.g:78:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalMiec.g:79:1: ( ruleComponent EOF )
            // InternalMiec.g:80:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMiec.g:87:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:91:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalMiec.g:92:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalMiec.g:92:2: ( ( rule__Component__Alternatives ) )
            // InternalMiec.g:93:3: ( rule__Component__Alternatives )
            {
             before(grammarAccess.getComponentAccess().getAlternatives()); 
            // InternalMiec.g:94:3: ( rule__Component__Alternatives )
            // InternalMiec.g:94:4: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleZone"
    // InternalMiec.g:103:1: entryRuleZone : ruleZone EOF ;
    public final void entryRuleZone() throws RecognitionException {
        try {
            // InternalMiec.g:104:1: ( ruleZone EOF )
            // InternalMiec.g:105:1: ruleZone EOF
            {
             before(grammarAccess.getZoneRule()); 
            pushFollow(FOLLOW_1);
            ruleZone();

            state._fsp--;

             after(grammarAccess.getZoneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleZone"


    // $ANTLR start "ruleZone"
    // InternalMiec.g:112:1: ruleZone : ( ( rule__Zone__Alternatives ) ) ;
    public final void ruleZone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:116:2: ( ( ( rule__Zone__Alternatives ) ) )
            // InternalMiec.g:117:2: ( ( rule__Zone__Alternatives ) )
            {
            // InternalMiec.g:117:2: ( ( rule__Zone__Alternatives ) )
            // InternalMiec.g:118:3: ( rule__Zone__Alternatives )
            {
             before(grammarAccess.getZoneAccess().getAlternatives()); 
            // InternalMiec.g:119:3: ( rule__Zone__Alternatives )
            // InternalMiec.g:119:4: rule__Zone__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Zone__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getZoneAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleZone"


    // $ANTLR start "entryRuleClassicalZone"
    // InternalMiec.g:128:1: entryRuleClassicalZone : ruleClassicalZone EOF ;
    public final void entryRuleClassicalZone() throws RecognitionException {
        try {
            // InternalMiec.g:129:1: ( ruleClassicalZone EOF )
            // InternalMiec.g:130:1: ruleClassicalZone EOF
            {
             before(grammarAccess.getClassicalZoneRule()); 
            pushFollow(FOLLOW_1);
            ruleClassicalZone();

            state._fsp--;

             after(grammarAccess.getClassicalZoneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassicalZone"


    // $ANTLR start "ruleClassicalZone"
    // InternalMiec.g:137:1: ruleClassicalZone : ( ( rule__ClassicalZone__Group__0 ) ) ;
    public final void ruleClassicalZone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:141:2: ( ( ( rule__ClassicalZone__Group__0 ) ) )
            // InternalMiec.g:142:2: ( ( rule__ClassicalZone__Group__0 ) )
            {
            // InternalMiec.g:142:2: ( ( rule__ClassicalZone__Group__0 ) )
            // InternalMiec.g:143:3: ( rule__ClassicalZone__Group__0 )
            {
             before(grammarAccess.getClassicalZoneAccess().getGroup()); 
            // InternalMiec.g:144:3: ( rule__ClassicalZone__Group__0 )
            // InternalMiec.g:144:4: rule__ClassicalZone__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassicalZoneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassicalZone"


    // $ANTLR start "entryRuleSecurityLevels"
    // InternalMiec.g:153:1: entryRuleSecurityLevels : ruleSecurityLevels EOF ;
    public final void entryRuleSecurityLevels() throws RecognitionException {
        try {
            // InternalMiec.g:154:1: ( ruleSecurityLevels EOF )
            // InternalMiec.g:155:1: ruleSecurityLevels EOF
            {
             before(grammarAccess.getSecurityLevelsRule()); 
            pushFollow(FOLLOW_1);
            ruleSecurityLevels();

            state._fsp--;

             after(grammarAccess.getSecurityLevelsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecurityLevels"


    // $ANTLR start "ruleSecurityLevels"
    // InternalMiec.g:162:1: ruleSecurityLevels : ( ( rule__SecurityLevels__Group__0 ) ) ;
    public final void ruleSecurityLevels() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:166:2: ( ( ( rule__SecurityLevels__Group__0 ) ) )
            // InternalMiec.g:167:2: ( ( rule__SecurityLevels__Group__0 ) )
            {
            // InternalMiec.g:167:2: ( ( rule__SecurityLevels__Group__0 ) )
            // InternalMiec.g:168:3: ( rule__SecurityLevels__Group__0 )
            {
             before(grammarAccess.getSecurityLevelsAccess().getGroup()); 
            // InternalMiec.g:169:3: ( rule__SecurityLevels__Group__0 )
            // InternalMiec.g:169:4: rule__SecurityLevels__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecurityLevelsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecurityLevels"


    // $ANTLR start "entryRulecounterMeasure"
    // InternalMiec.g:178:1: entryRulecounterMeasure : rulecounterMeasure EOF ;
    public final void entryRulecounterMeasure() throws RecognitionException {
        try {
            // InternalMiec.g:179:1: ( rulecounterMeasure EOF )
            // InternalMiec.g:180:1: rulecounterMeasure EOF
            {
             before(grammarAccess.getCounterMeasureRule()); 
            pushFollow(FOLLOW_1);
            rulecounterMeasure();

            state._fsp--;

             after(grammarAccess.getCounterMeasureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecounterMeasure"


    // $ANTLR start "rulecounterMeasure"
    // InternalMiec.g:187:1: rulecounterMeasure : ( ( rule__CounterMeasure__Group__0 ) ) ;
    public final void rulecounterMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:191:2: ( ( ( rule__CounterMeasure__Group__0 ) ) )
            // InternalMiec.g:192:2: ( ( rule__CounterMeasure__Group__0 ) )
            {
            // InternalMiec.g:192:2: ( ( rule__CounterMeasure__Group__0 ) )
            // InternalMiec.g:193:3: ( rule__CounterMeasure__Group__0 )
            {
             before(grammarAccess.getCounterMeasureAccess().getGroup()); 
            // InternalMiec.g:194:3: ( rule__CounterMeasure__Group__0 )
            // InternalMiec.g:194:4: rule__CounterMeasure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CounterMeasure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCounterMeasureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecounterMeasure"


    // $ANTLR start "entryRuleConduit"
    // InternalMiec.g:203:1: entryRuleConduit : ruleConduit EOF ;
    public final void entryRuleConduit() throws RecognitionException {
        try {
            // InternalMiec.g:204:1: ( ruleConduit EOF )
            // InternalMiec.g:205:1: ruleConduit EOF
            {
             before(grammarAccess.getConduitRule()); 
            pushFollow(FOLLOW_1);
            ruleConduit();

            state._fsp--;

             after(grammarAccess.getConduitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConduit"


    // $ANTLR start "ruleConduit"
    // InternalMiec.g:212:1: ruleConduit : ( ( rule__Conduit__Group__0 ) ) ;
    public final void ruleConduit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:216:2: ( ( ( rule__Conduit__Group__0 ) ) )
            // InternalMiec.g:217:2: ( ( rule__Conduit__Group__0 ) )
            {
            // InternalMiec.g:217:2: ( ( rule__Conduit__Group__0 ) )
            // InternalMiec.g:218:3: ( rule__Conduit__Group__0 )
            {
             before(grammarAccess.getConduitAccess().getGroup()); 
            // InternalMiec.g:219:3: ( rule__Conduit__Group__0 )
            // InternalMiec.g:219:4: rule__Conduit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConduitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConduit"


    // $ANTLR start "entryRuleDevice"
    // InternalMiec.g:228:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalMiec.g:229:1: ( ruleDevice EOF )
            // InternalMiec.g:230:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalMiec.g:237:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:241:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalMiec.g:242:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalMiec.g:242:2: ( ( rule__Device__Group__0 ) )
            // InternalMiec.g:243:3: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // InternalMiec.g:244:3: ( rule__Device__Group__0 )
            // InternalMiec.g:244:4: rule__Device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleProperty"
    // InternalMiec.g:253:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalMiec.g:254:1: ( ruleProperty EOF )
            // InternalMiec.g:255:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalMiec.g:262:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:266:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalMiec.g:267:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalMiec.g:267:2: ( ( rule__Property__Group__0 ) )
            // InternalMiec.g:268:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalMiec.g:269:3: ( rule__Property__Group__0 )
            // InternalMiec.g:269:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleSystem"
    // InternalMiec.g:278:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalMiec.g:279:1: ( ruleSystem EOF )
            // InternalMiec.g:280:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalMiec.g:287:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:291:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalMiec.g:292:2: ( ( rule__System__Group__0 ) )
            {
            // InternalMiec.g:292:2: ( ( rule__System__Group__0 ) )
            // InternalMiec.g:293:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalMiec.g:294:3: ( rule__System__Group__0 )
            // InternalMiec.g:294:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleApplication"
    // InternalMiec.g:303:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalMiec.g:304:1: ( ruleApplication EOF )
            // InternalMiec.g:305:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalMiec.g:312:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:316:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalMiec.g:317:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalMiec.g:317:2: ( ( rule__Application__Group__0 ) )
            // InternalMiec.g:318:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalMiec.g:319:3: ( rule__Application__Group__0 )
            // InternalMiec.g:319:4: rule__Application__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleChannel"
    // InternalMiec.g:328:1: entryRuleChannel : ruleChannel EOF ;
    public final void entryRuleChannel() throws RecognitionException {
        try {
            // InternalMiec.g:329:1: ( ruleChannel EOF )
            // InternalMiec.g:330:1: ruleChannel EOF
            {
             before(grammarAccess.getChannelRule()); 
            pushFollow(FOLLOW_1);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getChannelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalMiec.g:337:1: ruleChannel : ( ( rule__Channel__Group__0 ) ) ;
    public final void ruleChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:341:2: ( ( ( rule__Channel__Group__0 ) ) )
            // InternalMiec.g:342:2: ( ( rule__Channel__Group__0 ) )
            {
            // InternalMiec.g:342:2: ( ( rule__Channel__Group__0 ) )
            // InternalMiec.g:343:3: ( rule__Channel__Group__0 )
            {
             before(grammarAccess.getChannelAccess().getGroup()); 
            // InternalMiec.g:344:3: ( rule__Channel__Group__0 )
            // InternalMiec.g:344:4: rule__Channel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleConstraint"
    // InternalMiec.g:353:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalMiec.g:354:1: ( ruleConstraint EOF )
            // InternalMiec.g:355:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalMiec.g:362:1: ruleConstraint : ( ( rule__Constraint__Alternatives ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:366:2: ( ( ( rule__Constraint__Alternatives ) ) )
            // InternalMiec.g:367:2: ( ( rule__Constraint__Alternatives ) )
            {
            // InternalMiec.g:367:2: ( ( rule__Constraint__Alternatives ) )
            // InternalMiec.g:368:3: ( rule__Constraint__Alternatives )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives()); 
            // InternalMiec.g:369:3: ( rule__Constraint__Alternatives )
            // InternalMiec.g:369:4: rule__Constraint__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRulePresenceConstraint"
    // InternalMiec.g:378:1: entryRulePresenceConstraint : rulePresenceConstraint EOF ;
    public final void entryRulePresenceConstraint() throws RecognitionException {
        try {
            // InternalMiec.g:379:1: ( rulePresenceConstraint EOF )
            // InternalMiec.g:380:1: rulePresenceConstraint EOF
            {
             before(grammarAccess.getPresenceConstraintRule()); 
            pushFollow(FOLLOW_1);
            rulePresenceConstraint();

            state._fsp--;

             after(grammarAccess.getPresenceConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePresenceConstraint"


    // $ANTLR start "rulePresenceConstraint"
    // InternalMiec.g:387:1: rulePresenceConstraint : ( ( rule__PresenceConstraint__Group__0 ) ) ;
    public final void rulePresenceConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:391:2: ( ( ( rule__PresenceConstraint__Group__0 ) ) )
            // InternalMiec.g:392:2: ( ( rule__PresenceConstraint__Group__0 ) )
            {
            // InternalMiec.g:392:2: ( ( rule__PresenceConstraint__Group__0 ) )
            // InternalMiec.g:393:3: ( rule__PresenceConstraint__Group__0 )
            {
             before(grammarAccess.getPresenceConstraintAccess().getGroup()); 
            // InternalMiec.g:394:3: ( rule__PresenceConstraint__Group__0 )
            // InternalMiec.g:394:4: rule__PresenceConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PresenceConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPresenceConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePresenceConstraint"


    // $ANTLR start "entryRuleOperationConstraint"
    // InternalMiec.g:403:1: entryRuleOperationConstraint : ruleOperationConstraint EOF ;
    public final void entryRuleOperationConstraint() throws RecognitionException {
        try {
            // InternalMiec.g:404:1: ( ruleOperationConstraint EOF )
            // InternalMiec.g:405:1: ruleOperationConstraint EOF
            {
             before(grammarAccess.getOperationConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationConstraint();

            state._fsp--;

             after(grammarAccess.getOperationConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationConstraint"


    // $ANTLR start "ruleOperationConstraint"
    // InternalMiec.g:412:1: ruleOperationConstraint : ( ( rule__OperationConstraint__Group__0 ) ) ;
    public final void ruleOperationConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:416:2: ( ( ( rule__OperationConstraint__Group__0 ) ) )
            // InternalMiec.g:417:2: ( ( rule__OperationConstraint__Group__0 ) )
            {
            // InternalMiec.g:417:2: ( ( rule__OperationConstraint__Group__0 ) )
            // InternalMiec.g:418:3: ( rule__OperationConstraint__Group__0 )
            {
             before(grammarAccess.getOperationConstraintAccess().getGroup()); 
            // InternalMiec.g:419:3: ( rule__OperationConstraint__Group__0 )
            // InternalMiec.g:419:4: rule__OperationConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationConstraint"


    // $ANTLR start "entryRuleValueOrReference"
    // InternalMiec.g:428:1: entryRuleValueOrReference : ruleValueOrReference EOF ;
    public final void entryRuleValueOrReference() throws RecognitionException {
        try {
            // InternalMiec.g:429:1: ( ruleValueOrReference EOF )
            // InternalMiec.g:430:1: ruleValueOrReference EOF
            {
             before(grammarAccess.getValueOrReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleValueOrReference();

            state._fsp--;

             after(grammarAccess.getValueOrReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueOrReference"


    // $ANTLR start "ruleValueOrReference"
    // InternalMiec.g:437:1: ruleValueOrReference : ( ( rule__ValueOrReference__Alternatives ) ) ;
    public final void ruleValueOrReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:441:2: ( ( ( rule__ValueOrReference__Alternatives ) ) )
            // InternalMiec.g:442:2: ( ( rule__ValueOrReference__Alternatives ) )
            {
            // InternalMiec.g:442:2: ( ( rule__ValueOrReference__Alternatives ) )
            // InternalMiec.g:443:3: ( rule__ValueOrReference__Alternatives )
            {
             before(grammarAccess.getValueOrReferenceAccess().getAlternatives()); 
            // InternalMiec.g:444:3: ( rule__ValueOrReference__Alternatives )
            // InternalMiec.g:444:4: rule__ValueOrReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueOrReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueOrReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueOrReference"


    // $ANTLR start "entryRuleReference"
    // InternalMiec.g:453:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalMiec.g:454:1: ( ruleReference EOF )
            // InternalMiec.g:455:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalMiec.g:462:1: ruleReference : ( ( rule__Reference__Alternatives ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:466:2: ( ( ( rule__Reference__Alternatives ) ) )
            // InternalMiec.g:467:2: ( ( rule__Reference__Alternatives ) )
            {
            // InternalMiec.g:467:2: ( ( rule__Reference__Alternatives ) )
            // InternalMiec.g:468:3: ( rule__Reference__Alternatives )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives()); 
            // InternalMiec.g:469:3: ( rule__Reference__Alternatives )
            // InternalMiec.g:469:4: rule__Reference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleDeviceReference"
    // InternalMiec.g:478:1: entryRuleDeviceReference : ruleDeviceReference EOF ;
    public final void entryRuleDeviceReference() throws RecognitionException {
        try {
            // InternalMiec.g:479:1: ( ruleDeviceReference EOF )
            // InternalMiec.g:480:1: ruleDeviceReference EOF
            {
             before(grammarAccess.getDeviceReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceReference();

            state._fsp--;

             after(grammarAccess.getDeviceReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeviceReference"


    // $ANTLR start "ruleDeviceReference"
    // InternalMiec.g:487:1: ruleDeviceReference : ( ( rule__DeviceReference__Group__0 ) ) ;
    public final void ruleDeviceReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:491:2: ( ( ( rule__DeviceReference__Group__0 ) ) )
            // InternalMiec.g:492:2: ( ( rule__DeviceReference__Group__0 ) )
            {
            // InternalMiec.g:492:2: ( ( rule__DeviceReference__Group__0 ) )
            // InternalMiec.g:493:3: ( rule__DeviceReference__Group__0 )
            {
             before(grammarAccess.getDeviceReferenceAccess().getGroup()); 
            // InternalMiec.g:494:3: ( rule__DeviceReference__Group__0 )
            // InternalMiec.g:494:4: rule__DeviceReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceReference"


    // $ANTLR start "entryRuleSelfReference"
    // InternalMiec.g:503:1: entryRuleSelfReference : ruleSelfReference EOF ;
    public final void entryRuleSelfReference() throws RecognitionException {
        try {
            // InternalMiec.g:504:1: ( ruleSelfReference EOF )
            // InternalMiec.g:505:1: ruleSelfReference EOF
            {
             before(grammarAccess.getSelfReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSelfReference();

            state._fsp--;

             after(grammarAccess.getSelfReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelfReference"


    // $ANTLR start "ruleSelfReference"
    // InternalMiec.g:512:1: ruleSelfReference : ( ( rule__SelfReference__Group__0 ) ) ;
    public final void ruleSelfReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:516:2: ( ( ( rule__SelfReference__Group__0 ) ) )
            // InternalMiec.g:517:2: ( ( rule__SelfReference__Group__0 ) )
            {
            // InternalMiec.g:517:2: ( ( rule__SelfReference__Group__0 ) )
            // InternalMiec.g:518:3: ( rule__SelfReference__Group__0 )
            {
             before(grammarAccess.getSelfReferenceAccess().getGroup()); 
            // InternalMiec.g:519:3: ( rule__SelfReference__Group__0 )
            // InternalMiec.g:519:4: rule__SelfReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelfReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelfReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelfReference"


    // $ANTLR start "entryRuleValue"
    // InternalMiec.g:528:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMiec.g:529:1: ( ruleValue EOF )
            // InternalMiec.g:530:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMiec.g:537:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:541:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMiec.g:542:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMiec.g:542:2: ( ( rule__Value__Alternatives ) )
            // InternalMiec.g:543:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMiec.g:544:3: ( rule__Value__Alternatives )
            // InternalMiec.g:544:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalMiec.g:553:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalMiec.g:554:1: ( ruleBooleanValue EOF )
            // InternalMiec.g:555:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalMiec.g:562:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:566:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalMiec.g:567:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalMiec.g:567:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalMiec.g:568:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalMiec.g:569:3: ( rule__BooleanValue__ValueAssignment )
            // InternalMiec.g:569:4: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalMiec.g:578:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalMiec.g:579:1: ( ruleStringValue EOF )
            // InternalMiec.g:580:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalMiec.g:587:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:591:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalMiec.g:592:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalMiec.g:592:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalMiec.g:593:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalMiec.g:594:3: ( rule__StringValue__ValueAssignment )
            // InternalMiec.g:594:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalMiec.g:603:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalMiec.g:604:1: ( ruleFloatValue EOF )
            // InternalMiec.g:605:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalMiec.g:612:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:616:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // InternalMiec.g:617:2: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // InternalMiec.g:617:2: ( ( rule__FloatValue__ValueAssignment ) )
            // InternalMiec.g:618:3: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // InternalMiec.g:619:3: ( rule__FloatValue__ValueAssignment )
            // InternalMiec.g:619:4: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FloatValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFloatValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalMiec.g:628:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalMiec.g:629:1: ( ruleIntegerValue EOF )
            // InternalMiec.g:630:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalMiec.g:637:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:641:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // InternalMiec.g:642:2: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // InternalMiec.g:642:2: ( ( rule__IntegerValue__ValueAssignment ) )
            // InternalMiec.g:643:3: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // InternalMiec.g:644:3: ( rule__IntegerValue__ValueAssignment )
            // InternalMiec.g:644:4: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "ruleSecurityLevel"
    // InternalMiec.g:653:1: ruleSecurityLevel : ( ( rule__SecurityLevel__Alternatives ) ) ;
    public final void ruleSecurityLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:657:1: ( ( ( rule__SecurityLevel__Alternatives ) ) )
            // InternalMiec.g:658:2: ( ( rule__SecurityLevel__Alternatives ) )
            {
            // InternalMiec.g:658:2: ( ( rule__SecurityLevel__Alternatives ) )
            // InternalMiec.g:659:3: ( rule__SecurityLevel__Alternatives )
            {
             before(grammarAccess.getSecurityLevelAccess().getAlternatives()); 
            // InternalMiec.g:660:3: ( rule__SecurityLevel__Alternatives )
            // InternalMiec.g:660:4: rule__SecurityLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SecurityLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSecurityLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecurityLevel"


    // $ANTLR start "ruleOperation"
    // InternalMiec.g:669:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:673:1: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalMiec.g:674:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalMiec.g:674:2: ( ( rule__Operation__Alternatives ) )
            // InternalMiec.g:675:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalMiec.g:676:3: ( rule__Operation__Alternatives )
            // InternalMiec.g:676:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "rule__Model__Alternatives_1"
    // InternalMiec.g:684:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__ZonesAssignment_1_0 ) ) | ( ( rule__Model__ConduitsAssignment_1_1 ) ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:688:1: ( ( ( rule__Model__ZonesAssignment_1_0 ) ) | ( ( rule__Model__ConduitsAssignment_1_1 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 56:
                {
                switch ( input.LA(2) ) {
                case 57:
                    {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==26) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==40) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 26:
                    {
                    alt1=1;
                    }
                    break;
                case 40:
                    {
                    alt1=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 57:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==26) ) {
                    alt1=1;
                }
                else if ( (LA1_2==40) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMiec.g:689:2: ( ( rule__Model__ZonesAssignment_1_0 ) )
                    {
                    // InternalMiec.g:689:2: ( ( rule__Model__ZonesAssignment_1_0 ) )
                    // InternalMiec.g:690:3: ( rule__Model__ZonesAssignment_1_0 )
                    {
                     before(grammarAccess.getModelAccess().getZonesAssignment_1_0()); 
                    // InternalMiec.g:691:3: ( rule__Model__ZonesAssignment_1_0 )
                    // InternalMiec.g:691:4: rule__Model__ZonesAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ZonesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getZonesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:695:2: ( ( rule__Model__ConduitsAssignment_1_1 ) )
                    {
                    // InternalMiec.g:695:2: ( ( rule__Model__ConduitsAssignment_1_1 ) )
                    // InternalMiec.g:696:3: ( rule__Model__ConduitsAssignment_1_1 )
                    {
                     before(grammarAccess.getModelAccess().getConduitsAssignment_1_1()); 
                    // InternalMiec.g:697:3: ( rule__Model__ConduitsAssignment_1_1 )
                    // InternalMiec.g:697:4: rule__Model__ConduitsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ConduitsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getConduitsAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_1"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalMiec.g:705:1: rule__Component__Alternatives : ( ( ruleDevice ) | ( ruleSystem ) | ( ruleApplication ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:709:1: ( ( ruleDevice ) | ( ruleSystem ) | ( ruleApplication ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==37) ) {
                switch ( input.LA(2) ) {
                case 45:
                    {
                    alt2=2;
                    }
                    break;
                case 47:
                    {
                    alt2=3;
                    }
                    break;
                case RULE_ID:
                case 43:
                case 58:
                case 59:
                case 60:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMiec.g:710:2: ( ruleDevice )
                    {
                    // InternalMiec.g:710:2: ( ruleDevice )
                    // InternalMiec.g:711:3: ruleDevice
                    {
                     before(grammarAccess.getComponentAccess().getDeviceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDevice();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getDeviceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:716:2: ( ruleSystem )
                    {
                    // InternalMiec.g:716:2: ( ruleSystem )
                    // InternalMiec.g:717:3: ruleSystem
                    {
                     before(grammarAccess.getComponentAccess().getSystemParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSystem();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getSystemParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiec.g:722:2: ( ruleApplication )
                    {
                    // InternalMiec.g:722:2: ( ruleApplication )
                    // InternalMiec.g:723:3: ruleApplication
                    {
                     before(grammarAccess.getComponentAccess().getApplicationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleApplication();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getApplicationParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives"


    // $ANTLR start "rule__Zone__Alternatives"
    // InternalMiec.g:732:1: rule__Zone__Alternatives : ( ( ruleClassicalZone ) | ( ruleConduit ) );
    public final void rule__Zone__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:736:1: ( ( ruleClassicalZone ) | ( ruleConduit ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 56:
                {
                switch ( input.LA(2) ) {
                case 57:
                    {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==26) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==40) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 26:
                    {
                    alt3=1;
                    }
                    break;
                case 40:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 57:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==26) ) {
                    alt3=1;
                }
                else if ( (LA3_2==40) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt3=1;
                }
                break;
            case 40:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMiec.g:737:2: ( ruleClassicalZone )
                    {
                    // InternalMiec.g:737:2: ( ruleClassicalZone )
                    // InternalMiec.g:738:3: ruleClassicalZone
                    {
                     before(grammarAccess.getZoneAccess().getClassicalZoneParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClassicalZone();

                    state._fsp--;

                     after(grammarAccess.getZoneAccess().getClassicalZoneParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:743:2: ( ruleConduit )
                    {
                    // InternalMiec.g:743:2: ( ruleConduit )
                    // InternalMiec.g:744:3: ruleConduit
                    {
                     before(grammarAccess.getZoneAccess().getConduitParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConduit();

                    state._fsp--;

                     after(grammarAccess.getZoneAccess().getConduitParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Zone__Alternatives"


    // $ANTLR start "rule__Application__Alternatives_6"
    // InternalMiec.g:753:1: rule__Application__Alternatives_6 : ( ( ( rule__Application__ExecutedOnAssignment_6_0 ) ) | ( 'nothing' ) );
    public final void rule__Application__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:757:1: ( ( ( rule__Application__ExecutedOnAssignment_6_0 ) ) | ( 'nothing' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMiec.g:758:2: ( ( rule__Application__ExecutedOnAssignment_6_0 ) )
                    {
                    // InternalMiec.g:758:2: ( ( rule__Application__ExecutedOnAssignment_6_0 ) )
                    // InternalMiec.g:759:3: ( rule__Application__ExecutedOnAssignment_6_0 )
                    {
                     before(grammarAccess.getApplicationAccess().getExecutedOnAssignment_6_0()); 
                    // InternalMiec.g:760:3: ( rule__Application__ExecutedOnAssignment_6_0 )
                    // InternalMiec.g:760:4: rule__Application__ExecutedOnAssignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__ExecutedOnAssignment_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getApplicationAccess().getExecutedOnAssignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:764:2: ( 'nothing' )
                    {
                    // InternalMiec.g:764:2: ( 'nothing' )
                    // InternalMiec.g:765:3: 'nothing'
                    {
                     before(grammarAccess.getApplicationAccess().getNothingKeyword_6_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getApplicationAccess().getNothingKeyword_6_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Alternatives_6"


    // $ANTLR start "rule__Constraint__Alternatives"
    // InternalMiec.g:774:1: rule__Constraint__Alternatives : ( ( rulePresenceConstraint ) | ( ruleOperationConstraint ) );
    public final void rule__Constraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:778:1: ( ( rulePresenceConstraint ) | ( ruleOperationConstraint ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 61:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==53) ) {
                    alt5=1;
                }
                else if ( (LA5_1==RULE_ID) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMiec.g:779:2: ( rulePresenceConstraint )
                    {
                    // InternalMiec.g:779:2: ( rulePresenceConstraint )
                    // InternalMiec.g:780:3: rulePresenceConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getPresenceConstraintParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePresenceConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getPresenceConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:785:2: ( ruleOperationConstraint )
                    {
                    // InternalMiec.g:785:2: ( ruleOperationConstraint )
                    // InternalMiec.g:786:3: ruleOperationConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getOperationConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getOperationConstraintParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Alternatives"


    // $ANTLR start "rule__ValueOrReference__Alternatives"
    // InternalMiec.g:795:1: rule__ValueOrReference__Alternatives : ( ( ruleValue ) | ( ruleReference ) );
    public final void rule__ValueOrReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:799:1: ( ( ruleValue ) | ( ruleReference ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_SINT)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=54 && LA6_0<=55)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMiec.g:800:2: ( ruleValue )
                    {
                    // InternalMiec.g:800:2: ( ruleValue )
                    // InternalMiec.g:801:3: ruleValue
                    {
                     before(grammarAccess.getValueOrReferenceAccess().getValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getValueOrReferenceAccess().getValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:806:2: ( ruleReference )
                    {
                    // InternalMiec.g:806:2: ( ruleReference )
                    // InternalMiec.g:807:3: ruleReference
                    {
                     before(grammarAccess.getValueOrReferenceAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getValueOrReferenceAccess().getReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueOrReference__Alternatives"


    // $ANTLR start "rule__Reference__Alternatives"
    // InternalMiec.g:816:1: rule__Reference__Alternatives : ( ( ruleSelfReference ) | ( ruleDeviceReference ) );
    public final void rule__Reference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:820:1: ( ( ruleSelfReference ) | ( ruleDeviceReference ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==55) ) {
                alt7=1;
            }
            else if ( (LA7_0==54) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMiec.g:821:2: ( ruleSelfReference )
                    {
                    // InternalMiec.g:821:2: ( ruleSelfReference )
                    // InternalMiec.g:822:3: ruleSelfReference
                    {
                     before(grammarAccess.getReferenceAccess().getSelfReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelfReference();

                    state._fsp--;

                     after(grammarAccess.getReferenceAccess().getSelfReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:827:2: ( ruleDeviceReference )
                    {
                    // InternalMiec.g:827:2: ( ruleDeviceReference )
                    // InternalMiec.g:828:3: ruleDeviceReference
                    {
                     before(grammarAccess.getReferenceAccess().getDeviceReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDeviceReference();

                    state._fsp--;

                     after(grammarAccess.getReferenceAccess().getDeviceReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalMiec.g:837:1: rule__Value__Alternatives : ( ( ruleBooleanValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) | ( ruleStringValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:841:1: ( ( ruleBooleanValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) | ( ruleStringValue ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt8=1;
                }
                break;
            case RULE_SINT:
                {
                alt8=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt8=3;
                }
                break;
            case RULE_STRING:
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
                    // InternalMiec.g:842:2: ( ruleBooleanValue )
                    {
                    // InternalMiec.g:842:2: ( ruleBooleanValue )
                    // InternalMiec.g:843:3: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:848:2: ( ruleIntegerValue )
                    {
                    // InternalMiec.g:848:2: ( ruleIntegerValue )
                    // InternalMiec.g:849:3: ruleIntegerValue
                    {
                     before(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiec.g:854:2: ( ruleFloatValue )
                    {
                    // InternalMiec.g:854:2: ( ruleFloatValue )
                    // InternalMiec.g:855:3: ruleFloatValue
                    {
                     before(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFloatValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiec.g:860:2: ( ruleStringValue )
                    {
                    // InternalMiec.g:860:2: ( ruleStringValue )
                    // InternalMiec.g:861:3: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__SecurityLevel__Alternatives"
    // InternalMiec.g:870:1: rule__SecurityLevel__Alternatives : ( ( ( 'SL0' ) ) | ( ( 'SL1' ) ) | ( ( 'SL2' ) ) | ( ( 'SL3' ) ) | ( ( 'SL4' ) ) );
    public final void rule__SecurityLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:874:1: ( ( ( 'SL0' ) ) | ( ( 'SL1' ) ) | ( ( 'SL2' ) ) | ( ( 'SL3' ) ) | ( ( 'SL4' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            case 18:
                {
                alt9=4;
                }
                break;
            case 19:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMiec.g:875:2: ( ( 'SL0' ) )
                    {
                    // InternalMiec.g:875:2: ( ( 'SL0' ) )
                    // InternalMiec.g:876:3: ( 'SL0' )
                    {
                     before(grammarAccess.getSecurityLevelAccess().getSL0EnumLiteralDeclaration_0()); 
                    // InternalMiec.g:877:3: ( 'SL0' )
                    // InternalMiec.g:877:4: 'SL0'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSecurityLevelAccess().getSL0EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:881:2: ( ( 'SL1' ) )
                    {
                    // InternalMiec.g:881:2: ( ( 'SL1' ) )
                    // InternalMiec.g:882:3: ( 'SL1' )
                    {
                     before(grammarAccess.getSecurityLevelAccess().getSL1EnumLiteralDeclaration_1()); 
                    // InternalMiec.g:883:3: ( 'SL1' )
                    // InternalMiec.g:883:4: 'SL1'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSecurityLevelAccess().getSL1EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiec.g:887:2: ( ( 'SL2' ) )
                    {
                    // InternalMiec.g:887:2: ( ( 'SL2' ) )
                    // InternalMiec.g:888:3: ( 'SL2' )
                    {
                     before(grammarAccess.getSecurityLevelAccess().getSL2EnumLiteralDeclaration_2()); 
                    // InternalMiec.g:889:3: ( 'SL2' )
                    // InternalMiec.g:889:4: 'SL2'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSecurityLevelAccess().getSL2EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiec.g:893:2: ( ( 'SL3' ) )
                    {
                    // InternalMiec.g:893:2: ( ( 'SL3' ) )
                    // InternalMiec.g:894:3: ( 'SL3' )
                    {
                     before(grammarAccess.getSecurityLevelAccess().getSL3EnumLiteralDeclaration_3()); 
                    // InternalMiec.g:895:3: ( 'SL3' )
                    // InternalMiec.g:895:4: 'SL3'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSecurityLevelAccess().getSL3EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMiec.g:899:2: ( ( 'SL4' ) )
                    {
                    // InternalMiec.g:899:2: ( ( 'SL4' ) )
                    // InternalMiec.g:900:3: ( 'SL4' )
                    {
                     before(grammarAccess.getSecurityLevelAccess().getSL4EnumLiteralDeclaration_4()); 
                    // InternalMiec.g:901:3: ( 'SL4' )
                    // InternalMiec.g:901:4: 'SL4'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSecurityLevelAccess().getSL4EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevel__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalMiec.g:909:1: rule__Operation__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:913:1: ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            case 24:
                {
                alt10=5;
                }
                break;
            case 25:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMiec.g:914:2: ( ( '=' ) )
                    {
                    // InternalMiec.g:914:2: ( ( '=' ) )
                    // InternalMiec.g:915:3: ( '=' )
                    {
                     before(grammarAccess.getOperationAccess().getEqEnumLiteralDeclaration_0()); 
                    // InternalMiec.g:916:3: ( '=' )
                    // InternalMiec.g:916:4: '='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getEqEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiec.g:920:2: ( ( '!=' ) )
                    {
                    // InternalMiec.g:920:2: ( ( '!=' ) )
                    // InternalMiec.g:921:3: ( '!=' )
                    {
                     before(grammarAccess.getOperationAccess().getNeEnumLiteralDeclaration_1()); 
                    // InternalMiec.g:922:3: ( '!=' )
                    // InternalMiec.g:922:4: '!='
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getNeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiec.g:926:2: ( ( '>' ) )
                    {
                    // InternalMiec.g:926:2: ( ( '>' ) )
                    // InternalMiec.g:927:3: ( '>' )
                    {
                     before(grammarAccess.getOperationAccess().getGtEnumLiteralDeclaration_2()); 
                    // InternalMiec.g:928:3: ( '>' )
                    // InternalMiec.g:928:4: '>'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getGtEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiec.g:932:2: ( ( '>=' ) )
                    {
                    // InternalMiec.g:932:2: ( ( '>=' ) )
                    // InternalMiec.g:933:3: ( '>=' )
                    {
                     before(grammarAccess.getOperationAccess().getGeEnumLiteralDeclaration_3()); 
                    // InternalMiec.g:934:3: ( '>=' )
                    // InternalMiec.g:934:4: '>='
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getGeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMiec.g:938:2: ( ( '<=' ) )
                    {
                    // InternalMiec.g:938:2: ( ( '<=' ) )
                    // InternalMiec.g:939:3: ( '<=' )
                    {
                     before(grammarAccess.getOperationAccess().getLeEnumLiteralDeclaration_4()); 
                    // InternalMiec.g:940:3: ( '<=' )
                    // InternalMiec.g:940:4: '<='
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getLeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMiec.g:944:2: ( ( '<' ) )
                    {
                    // InternalMiec.g:944:2: ( ( '<' ) )
                    // InternalMiec.g:945:3: ( '<' )
                    {
                     before(grammarAccess.getOperationAccess().getLtEnumLiteralDeclaration_5()); 
                    // InternalMiec.g:946:3: ( '<' )
                    // InternalMiec.g:946:4: '<'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getLtEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMiec.g:954:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:958:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMiec.g:959:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMiec.g:966:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:970:1: ( ( () ) )
            // InternalMiec.g:971:1: ( () )
            {
            // InternalMiec.g:971:1: ( () )
            // InternalMiec.g:972:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalMiec.g:973:2: ()
            // InternalMiec.g:973:3: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMiec.g:981:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:985:1: ( rule__Model__Group__1__Impl )
            // InternalMiec.g:986:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMiec.g:992:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:996:1: ( ( ( rule__Model__Alternatives_1 )* ) )
            // InternalMiec.g:997:1: ( ( rule__Model__Alternatives_1 )* )
            {
            // InternalMiec.g:997:1: ( ( rule__Model__Alternatives_1 )* )
            // InternalMiec.g:998:2: ( rule__Model__Alternatives_1 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // InternalMiec.g:999:2: ( rule__Model__Alternatives_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26||LA11_0==40||(LA11_0>=56 && LA11_0<=57)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMiec.g:999:3: rule__Model__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__ClassicalZone__Group__0"
    // InternalMiec.g:1008:1: rule__ClassicalZone__Group__0 : rule__ClassicalZone__Group__0__Impl rule__ClassicalZone__Group__1 ;
    public final void rule__ClassicalZone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1012:1: ( rule__ClassicalZone__Group__0__Impl rule__ClassicalZone__Group__1 )
            // InternalMiec.g:1013:2: rule__ClassicalZone__Group__0__Impl rule__ClassicalZone__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ClassicalZone__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__0"


    // $ANTLR start "rule__ClassicalZone__Group__0__Impl"
    // InternalMiec.g:1020:1: rule__ClassicalZone__Group__0__Impl : ( ( rule__ClassicalZone__TrustedAssignment_0 )? ) ;
    public final void rule__ClassicalZone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1024:1: ( ( ( rule__ClassicalZone__TrustedAssignment_0 )? ) )
            // InternalMiec.g:1025:1: ( ( rule__ClassicalZone__TrustedAssignment_0 )? )
            {
            // InternalMiec.g:1025:1: ( ( rule__ClassicalZone__TrustedAssignment_0 )? )
            // InternalMiec.g:1026:2: ( rule__ClassicalZone__TrustedAssignment_0 )?
            {
             before(grammarAccess.getClassicalZoneAccess().getTrustedAssignment_0()); 
            // InternalMiec.g:1027:2: ( rule__ClassicalZone__TrustedAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==56) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiec.g:1027:3: rule__ClassicalZone__TrustedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassicalZone__TrustedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassicalZoneAccess().getTrustedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__0__Impl"


    // $ANTLR start "rule__ClassicalZone__Group__1"
    // InternalMiec.g:1035:1: rule__ClassicalZone__Group__1 : rule__ClassicalZone__Group__1__Impl rule__ClassicalZone__Group__2 ;
    public final void rule__ClassicalZone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1039:1: ( rule__ClassicalZone__Group__1__Impl rule__ClassicalZone__Group__2 )
            // InternalMiec.g:1040:2: rule__ClassicalZone__Group__1__Impl rule__ClassicalZone__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ClassicalZone__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__1"


    // $ANTLR start "rule__ClassicalZone__Group__1__Impl"
    // InternalMiec.g:1047:1: rule__ClassicalZone__Group__1__Impl : ( ( rule__ClassicalZone__PhysicalAssignment_1 )? ) ;
    public final void rule__ClassicalZone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1051:1: ( ( ( rule__ClassicalZone__PhysicalAssignment_1 )? ) )
            // InternalMiec.g:1052:1: ( ( rule__ClassicalZone__PhysicalAssignment_1 )? )
            {
            // InternalMiec.g:1052:1: ( ( rule__ClassicalZone__PhysicalAssignment_1 )? )
            // InternalMiec.g:1053:2: ( rule__ClassicalZone__PhysicalAssignment_1 )?
            {
             before(grammarAccess.getClassicalZoneAccess().getPhysicalAssignment_1()); 
            // InternalMiec.g:1054:2: ( rule__ClassicalZone__PhysicalAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==57) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMiec.g:1054:3: rule__ClassicalZone__PhysicalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassicalZone__PhysicalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassicalZoneAccess().getPhysicalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__1__Impl"


    // $ANTLR start "rule__ClassicalZone__Group__2"
    // InternalMiec.g:1062:1: rule__ClassicalZone__Group__2 : rule__ClassicalZone__Group__2__Impl rule__ClassicalZone__Group__3 ;
    public final void rule__ClassicalZone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1066:1: ( rule__ClassicalZone__Group__2__Impl rule__ClassicalZone__Group__3 )
            // InternalMiec.g:1067:2: rule__ClassicalZone__Group__2__Impl rule__ClassicalZone__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ClassicalZone__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__2"


    // $ANTLR start "rule__ClassicalZone__Group__2__Impl"
    // InternalMiec.g:1074:1: rule__ClassicalZone__Group__2__Impl : ( 'Zone' ) ;
    public final void rule__ClassicalZone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1078:1: ( ( 'Zone' ) )
            // InternalMiec.g:1079:1: ( 'Zone' )
            {
            // InternalMiec.g:1079:1: ( 'Zone' )
            // InternalMiec.g:1080:2: 'Zone'
            {
             before(grammarAccess.getClassicalZoneAccess().getZoneKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getZoneKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__2__Impl"


    // $ANTLR start "rule__ClassicalZone__Group__3"
    // InternalMiec.g:1089:1: rule__ClassicalZone__Group__3 : rule__ClassicalZone__Group__3__Impl rule__ClassicalZone__Group__4 ;
    public final void rule__ClassicalZone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1093:1: ( rule__ClassicalZone__Group__3__Impl rule__ClassicalZone__Group__4 )
            // InternalMiec.g:1094:2: rule__ClassicalZone__Group__3__Impl rule__ClassicalZone__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ClassicalZone__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__3"


    // $ANTLR start "rule__ClassicalZone__Group__3__Impl"
    // InternalMiec.g:1101:1: rule__ClassicalZone__Group__3__Impl : ( ( rule__ClassicalZone__NameAssignment_3 ) ) ;
    public final void rule__ClassicalZone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1105:1: ( ( ( rule__ClassicalZone__NameAssignment_3 ) ) )
            // InternalMiec.g:1106:1: ( ( rule__ClassicalZone__NameAssignment_3 ) )
            {
            // InternalMiec.g:1106:1: ( ( rule__ClassicalZone__NameAssignment_3 ) )
            // InternalMiec.g:1107:2: ( rule__ClassicalZone__NameAssignment_3 )
            {
             before(grammarAccess.getClassicalZoneAccess().getNameAssignment_3()); 
            // InternalMiec.g:1108:2: ( rule__ClassicalZone__NameAssignment_3 )
            // InternalMiec.g:1108:3: rule__ClassicalZone__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClassicalZoneAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__3__Impl"


    // $ANTLR start "rule__ClassicalZone__Group__4"
    // InternalMiec.g:1116:1: rule__ClassicalZone__Group__4 : rule__ClassicalZone__Group__4__Impl rule__ClassicalZone__Group__5 ;
    public final void rule__ClassicalZone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1120:1: ( rule__ClassicalZone__Group__4__Impl rule__ClassicalZone__Group__5 )
            // InternalMiec.g:1121:2: rule__ClassicalZone__Group__4__Impl rule__ClassicalZone__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ClassicalZone__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__4"


    // $ANTLR start "rule__ClassicalZone__Group__4__Impl"
    // InternalMiec.g:1128:1: rule__ClassicalZone__Group__4__Impl : ( '{' ) ;
    public final void rule__ClassicalZone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1132:1: ( ( '{' ) )
            // InternalMiec.g:1133:1: ( '{' )
            {
            // InternalMiec.g:1133:1: ( '{' )
            // InternalMiec.g:1134:2: '{'
            {
             before(grammarAccess.getClassicalZoneAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__4__Impl"


    // $ANTLR start "rule__ClassicalZone__Group__5"
    // InternalMiec.g:1143:1: rule__ClassicalZone__Group__5 : rule__ClassicalZone__Group__5__Impl rule__ClassicalZone__Group__6 ;
    public final void rule__ClassicalZone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1147:1: ( rule__ClassicalZone__Group__5__Impl rule__ClassicalZone__Group__6 )
            // InternalMiec.g:1148:2: rule__ClassicalZone__Group__5__Impl rule__ClassicalZone__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ClassicalZone__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__5"


    // $ANTLR start "rule__ClassicalZone__Group__5__Impl"
    // InternalMiec.g:1155:1: rule__ClassicalZone__Group__5__Impl : ( 'target' ) ;
    public final void rule__ClassicalZone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1159:1: ( ( 'target' ) )
            // InternalMiec.g:1160:1: ( 'target' )
            {
            // InternalMiec.g:1160:1: ( 'target' )
            // InternalMiec.g:1161:2: 'target'
            {
             before(grammarAccess.getClassicalZoneAccess().getTargetKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getTargetKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__5__Impl"


    // $ANTLR start "rule__ClassicalZone__Group__6"
    // InternalMiec.g:1170:1: rule__ClassicalZone__Group__6 : rule__ClassicalZone__Group__6__Impl rule__ClassicalZone__Group__7 ;
    public final void rule__ClassicalZone__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1174:1: ( rule__ClassicalZone__Group__6__Impl rule__ClassicalZone__Group__7 )
            // InternalMiec.g:1175:2: rule__ClassicalZone__Group__6__Impl rule__ClassicalZone__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__ClassicalZone__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__6"


    // $ANTLR start "rule__ClassicalZone__Group__6__Impl"
    // InternalMiec.g:1182:1: rule__ClassicalZone__Group__6__Impl : ( ( rule__ClassicalZone__TargetAssignment_6 ) ) ;
    public final void rule__ClassicalZone__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1186:1: ( ( ( rule__ClassicalZone__TargetAssignment_6 ) ) )
            // InternalMiec.g:1187:1: ( ( rule__ClassicalZone__TargetAssignment_6 ) )
            {
            // InternalMiec.g:1187:1: ( ( rule__ClassicalZone__TargetAssignment_6 ) )
            // InternalMiec.g:1188:2: ( rule__ClassicalZone__TargetAssignment_6 )
            {
             before(grammarAccess.getClassicalZoneAccess().getTargetAssignment_6()); 
            // InternalMiec.g:1189:2: ( rule__ClassicalZone__TargetAssignment_6 )
            // InternalMiec.g:1189:3: rule__ClassicalZone__TargetAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__TargetAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getClassicalZoneAccess().getTargetAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__6__Impl"


    // $ANTLR start "rule__ClassicalZone__Group__7"
    // InternalMiec.g:1197:1: rule__ClassicalZone__Group__7 : rule__ClassicalZone__Group__7__Impl rule__ClassicalZone__Group__8 ;
    public final void rule__ClassicalZone__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1201:1: ( rule__ClassicalZone__Group__7__Impl rule__ClassicalZone__Group__8 )
            // InternalMiec.g:1202:2: rule__ClassicalZone__Group__7__Impl rule__ClassicalZone__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__ClassicalZone__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__7"


    // $ANTLR start "rule__ClassicalZone__Group__7__Impl"
    // InternalMiec.g:1209:1: rule__ClassicalZone__Group__7__Impl : ( ( rule__ClassicalZone__Group_7__0 )? ) ;
    public final void rule__ClassicalZone__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1213:1: ( ( ( rule__ClassicalZone__Group_7__0 )? ) )
            // InternalMiec.g:1214:1: ( ( rule__ClassicalZone__Group_7__0 )? )
            {
            // InternalMiec.g:1214:1: ( ( rule__ClassicalZone__Group_7__0 )? )
            // InternalMiec.g:1215:2: ( rule__ClassicalZone__Group_7__0 )?
            {
             before(grammarAccess.getClassicalZoneAccess().getGroup_7()); 
            // InternalMiec.g:1216:2: ( rule__ClassicalZone__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==31) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalMiec.g:1216:3: rule__ClassicalZone__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassicalZone__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassicalZoneAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__7__Impl"


    // $ANTLR start "rule__ClassicalZone__Group__8"
    // InternalMiec.g:1224:1: rule__ClassicalZone__Group__8 : rule__ClassicalZone__Group__8__Impl rule__ClassicalZone__Group__9 ;
    public final void rule__ClassicalZone__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1228:1: ( rule__ClassicalZone__Group__8__Impl rule__ClassicalZone__Group__9 )
            // InternalMiec.g:1229:2: rule__ClassicalZone__Group__8__Impl rule__ClassicalZone__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__ClassicalZone__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__8"


    // $ANTLR start "rule__ClassicalZone__Group__8__Impl"
    // InternalMiec.g:1236:1: rule__ClassicalZone__Group__8__Impl : ( ( rule__ClassicalZone__Group_8__0 )? ) ;
    public final void rule__ClassicalZone__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1240:1: ( ( ( rule__ClassicalZone__Group_8__0 )? ) )
            // InternalMiec.g:1241:1: ( ( rule__ClassicalZone__Group_8__0 )? )
            {
            // InternalMiec.g:1241:1: ( ( rule__ClassicalZone__Group_8__0 )? )
            // InternalMiec.g:1242:2: ( rule__ClassicalZone__Group_8__0 )?
            {
             before(grammarAccess.getClassicalZoneAccess().getGroup_8()); 
            // InternalMiec.g:1243:2: ( rule__ClassicalZone__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==33) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalMiec.g:1243:3: rule__ClassicalZone__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassicalZone__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassicalZoneAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__8__Impl"


    // $ANTLR start "rule__ClassicalZone__Group__9"
    // InternalMiec.g:1251:1: rule__ClassicalZone__Group__9 : rule__ClassicalZone__Group__9__Impl rule__ClassicalZone__Group__10 ;
    public final void rule__ClassicalZone__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1255:1: ( rule__ClassicalZone__Group__9__Impl rule__ClassicalZone__Group__10 )
            // InternalMiec.g:1256:2: rule__ClassicalZone__Group__9__Impl rule__ClassicalZone__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__ClassicalZone__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__9"


    // $ANTLR start "rule__ClassicalZone__Group__9__Impl"
    // InternalMiec.g:1263:1: rule__ClassicalZone__Group__9__Impl : ( ( rule__ClassicalZone__Group_9__0 )? ) ;
    public final void rule__ClassicalZone__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1267:1: ( ( ( rule__ClassicalZone__Group_9__0 )? ) )
            // InternalMiec.g:1268:1: ( ( rule__ClassicalZone__Group_9__0 )? )
            {
            // InternalMiec.g:1268:1: ( ( rule__ClassicalZone__Group_9__0 )? )
            // InternalMiec.g:1269:2: ( rule__ClassicalZone__Group_9__0 )?
            {
             before(grammarAccess.getClassicalZoneAccess().getGroup_9()); 
            // InternalMiec.g:1270:2: ( rule__ClassicalZone__Group_9__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMiec.g:1270:3: rule__ClassicalZone__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassicalZone__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassicalZoneAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__9__Impl"


    // $ANTLR start "rule__ClassicalZone__Group__10"
    // InternalMiec.g:1278:1: rule__ClassicalZone__Group__10 : rule__ClassicalZone__Group__10__Impl ;
    public final void rule__ClassicalZone__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1282:1: ( rule__ClassicalZone__Group__10__Impl )
            // InternalMiec.g:1283:2: rule__ClassicalZone__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__10"


    // $ANTLR start "rule__ClassicalZone__Group__10__Impl"
    // InternalMiec.g:1289:1: rule__ClassicalZone__Group__10__Impl : ( '}' ) ;
    public final void rule__ClassicalZone__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1293:1: ( ( '}' ) )
            // InternalMiec.g:1294:1: ( '}' )
            {
            // InternalMiec.g:1294:1: ( '}' )
            // InternalMiec.g:1295:2: '}'
            {
             before(grammarAccess.getClassicalZoneAccess().getRightCurlyBracketKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group__10__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_7__0"
    // InternalMiec.g:1305:1: rule__ClassicalZone__Group_7__0 : rule__ClassicalZone__Group_7__0__Impl rule__ClassicalZone__Group_7__1 ;
    public final void rule__ClassicalZone__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1309:1: ( rule__ClassicalZone__Group_7__0__Impl rule__ClassicalZone__Group_7__1 )
            // InternalMiec.g:1310:2: rule__ClassicalZone__Group_7__0__Impl rule__ClassicalZone__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__ClassicalZone__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7__0"


    // $ANTLR start "rule__ClassicalZone__Group_7__0__Impl"
    // InternalMiec.g:1317:1: rule__ClassicalZone__Group_7__0__Impl : ( ';' ) ;
    public final void rule__ClassicalZone__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1321:1: ( ( ';' ) )
            // InternalMiec.g:1322:1: ( ';' )
            {
            // InternalMiec.g:1322:1: ( ';' )
            // InternalMiec.g:1323:2: ';'
            {
             before(grammarAccess.getClassicalZoneAccess().getSemicolonKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getSemicolonKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7__0__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_7__1"
    // InternalMiec.g:1332:1: rule__ClassicalZone__Group_7__1 : rule__ClassicalZone__Group_7__1__Impl rule__ClassicalZone__Group_7__2 ;
    public final void rule__ClassicalZone__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1336:1: ( rule__ClassicalZone__Group_7__1__Impl rule__ClassicalZone__Group_7__2 )
            // InternalMiec.g:1337:2: rule__ClassicalZone__Group_7__1__Impl rule__ClassicalZone__Group_7__2
            {
            pushFollow(FOLLOW_7);
            rule__ClassicalZone__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7__1"


    // $ANTLR start "rule__ClassicalZone__Group_7__1__Impl"
    // InternalMiec.g:1344:1: rule__ClassicalZone__Group_7__1__Impl : ( 'components' ) ;
    public final void rule__ClassicalZone__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1348:1: ( ( 'components' ) )
            // InternalMiec.g:1349:1: ( 'components' )
            {
            // InternalMiec.g:1349:1: ( 'components' )
            // InternalMiec.g:1350:2: 'components'
            {
             before(grammarAccess.getClassicalZoneAccess().getComponentsKeyword_7_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getComponentsKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7__1__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_7__2"
    // InternalMiec.g:1359:1: rule__ClassicalZone__Group_7__2 : rule__ClassicalZone__Group_7__2__Impl rule__ClassicalZone__Group_7__3 ;
    public final void rule__ClassicalZone__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1363:1: ( rule__ClassicalZone__Group_7__2__Impl rule__ClassicalZone__Group_7__3 )
            // InternalMiec.g:1364:2: rule__ClassicalZone__Group_7__2__Impl rule__ClassicalZone__Group_7__3
            {
            pushFollow(FOLLOW_12);
            rule__ClassicalZone__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7__2"


    // $ANTLR start "rule__ClassicalZone__Group_7__2__Impl"
    // InternalMiec.g:1371:1: rule__ClassicalZone__Group_7__2__Impl : ( '{' ) ;
    public final void rule__ClassicalZone__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1375:1: ( ( '{' ) )
            // InternalMiec.g:1376:1: ( '{' )
            {
            // InternalMiec.g:1376:1: ( '{' )
            // InternalMiec.g:1377:2: '{'
            {
             before(grammarAccess.getClassicalZoneAccess().getLeftCurlyBracketKeyword_7_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getLeftCurlyBracketKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7__2__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_7__3"
    // InternalMiec.g:1386:1: rule__ClassicalZone__Group_7__3 : rule__ClassicalZone__Group_7__3__Impl rule__ClassicalZone__Group_7__4 ;
    public final void rule__ClassicalZone__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1390:1: ( rule__ClassicalZone__Group_7__3__Impl rule__ClassicalZone__Group_7__4 )
            // InternalMiec.g:1391:2: rule__ClassicalZone__Group_7__3__Impl rule__ClassicalZone__Group_7__4
            {
            pushFollow(FOLLOW_13);
            rule__ClassicalZone__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7__3"


    // $ANTLR start "rule__ClassicalZone__Group_7__3__Impl"
    // InternalMiec.g:1398:1: rule__ClassicalZone__Group_7__3__Impl : ( ( rule__ClassicalZone__ComponentsAssignment_7_3 ) ) ;
    public final void rule__ClassicalZone__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1402:1: ( ( ( rule__ClassicalZone__ComponentsAssignment_7_3 ) ) )
            // InternalMiec.g:1403:1: ( ( rule__ClassicalZone__ComponentsAssignment_7_3 ) )
            {
            // InternalMiec.g:1403:1: ( ( rule__ClassicalZone__ComponentsAssignment_7_3 ) )
            // InternalMiec.g:1404:2: ( rule__ClassicalZone__ComponentsAssignment_7_3 )
            {
             before(grammarAccess.getClassicalZoneAccess().getComponentsAssignment_7_3()); 
            // InternalMiec.g:1405:2: ( rule__ClassicalZone__ComponentsAssignment_7_3 )
            // InternalMiec.g:1405:3: rule__ClassicalZone__ComponentsAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__ComponentsAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getClassicalZoneAccess().getComponentsAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7__3__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_7__4"
    // InternalMiec.g:1413:1: rule__ClassicalZone__Group_7__4 : rule__ClassicalZone__Group_7__4__Impl rule__ClassicalZone__Group_7__5 ;
    public final void rule__ClassicalZone__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1417:1: ( rule__ClassicalZone__Group_7__4__Impl rule__ClassicalZone__Group_7__5 )
            // InternalMiec.g:1418:2: rule__ClassicalZone__Group_7__4__Impl rule__ClassicalZone__Group_7__5
            {
            pushFollow(FOLLOW_13);
            rule__ClassicalZone__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7__4"


    // $ANTLR start "rule__ClassicalZone__Group_7__4__Impl"
    // InternalMiec.g:1425:1: rule__ClassicalZone__Group_7__4__Impl : ( ( rule__ClassicalZone__Group_7_4__0 )* ) ;
    public final void rule__ClassicalZone__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1429:1: ( ( ( rule__ClassicalZone__Group_7_4__0 )* ) )
            // InternalMiec.g:1430:1: ( ( rule__ClassicalZone__Group_7_4__0 )* )
            {
            // InternalMiec.g:1430:1: ( ( rule__ClassicalZone__Group_7_4__0 )* )
            // InternalMiec.g:1431:2: ( rule__ClassicalZone__Group_7_4__0 )*
            {
             before(grammarAccess.getClassicalZoneAccess().getGroup_7_4()); 
            // InternalMiec.g:1432:2: ( rule__ClassicalZone__Group_7_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMiec.g:1432:3: rule__ClassicalZone__Group_7_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ClassicalZone__Group_7_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getClassicalZoneAccess().getGroup_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7__4__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_7__5"
    // InternalMiec.g:1440:1: rule__ClassicalZone__Group_7__5 : rule__ClassicalZone__Group_7__5__Impl ;
    public final void rule__ClassicalZone__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1444:1: ( rule__ClassicalZone__Group_7__5__Impl )
            // InternalMiec.g:1445:2: rule__ClassicalZone__Group_7__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_7__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7__5"


    // $ANTLR start "rule__ClassicalZone__Group_7__5__Impl"
    // InternalMiec.g:1451:1: rule__ClassicalZone__Group_7__5__Impl : ( '}' ) ;
    public final void rule__ClassicalZone__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1455:1: ( ( '}' ) )
            // InternalMiec.g:1456:1: ( '}' )
            {
            // InternalMiec.g:1456:1: ( '}' )
            // InternalMiec.g:1457:2: '}'
            {
             before(grammarAccess.getClassicalZoneAccess().getRightCurlyBracketKeyword_7_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getRightCurlyBracketKeyword_7_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7__5__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_7_4__0"
    // InternalMiec.g:1467:1: rule__ClassicalZone__Group_7_4__0 : rule__ClassicalZone__Group_7_4__0__Impl rule__ClassicalZone__Group_7_4__1 ;
    public final void rule__ClassicalZone__Group_7_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1471:1: ( rule__ClassicalZone__Group_7_4__0__Impl rule__ClassicalZone__Group_7_4__1 )
            // InternalMiec.g:1472:2: rule__ClassicalZone__Group_7_4__0__Impl rule__ClassicalZone__Group_7_4__1
            {
            pushFollow(FOLLOW_12);
            rule__ClassicalZone__Group_7_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_7_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7_4__0"


    // $ANTLR start "rule__ClassicalZone__Group_7_4__0__Impl"
    // InternalMiec.g:1479:1: rule__ClassicalZone__Group_7_4__0__Impl : ( ',' ) ;
    public final void rule__ClassicalZone__Group_7_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1483:1: ( ( ',' ) )
            // InternalMiec.g:1484:1: ( ',' )
            {
            // InternalMiec.g:1484:1: ( ',' )
            // InternalMiec.g:1485:2: ','
            {
             before(grammarAccess.getClassicalZoneAccess().getCommaKeyword_7_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getCommaKeyword_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7_4__0__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_7_4__1"
    // InternalMiec.g:1494:1: rule__ClassicalZone__Group_7_4__1 : rule__ClassicalZone__Group_7_4__1__Impl ;
    public final void rule__ClassicalZone__Group_7_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1498:1: ( rule__ClassicalZone__Group_7_4__1__Impl )
            // InternalMiec.g:1499:2: rule__ClassicalZone__Group_7_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_7_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7_4__1"


    // $ANTLR start "rule__ClassicalZone__Group_7_4__1__Impl"
    // InternalMiec.g:1505:1: rule__ClassicalZone__Group_7_4__1__Impl : ( ( rule__ClassicalZone__ComponentsAssignment_7_4_1 ) ) ;
    public final void rule__ClassicalZone__Group_7_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1509:1: ( ( ( rule__ClassicalZone__ComponentsAssignment_7_4_1 ) ) )
            // InternalMiec.g:1510:1: ( ( rule__ClassicalZone__ComponentsAssignment_7_4_1 ) )
            {
            // InternalMiec.g:1510:1: ( ( rule__ClassicalZone__ComponentsAssignment_7_4_1 ) )
            // InternalMiec.g:1511:2: ( rule__ClassicalZone__ComponentsAssignment_7_4_1 )
            {
             before(grammarAccess.getClassicalZoneAccess().getComponentsAssignment_7_4_1()); 
            // InternalMiec.g:1512:2: ( rule__ClassicalZone__ComponentsAssignment_7_4_1 )
            // InternalMiec.g:1512:3: rule__ClassicalZone__ComponentsAssignment_7_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__ComponentsAssignment_7_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassicalZoneAccess().getComponentsAssignment_7_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_7_4__1__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_8__0"
    // InternalMiec.g:1521:1: rule__ClassicalZone__Group_8__0 : rule__ClassicalZone__Group_8__0__Impl rule__ClassicalZone__Group_8__1 ;
    public final void rule__ClassicalZone__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1525:1: ( rule__ClassicalZone__Group_8__0__Impl rule__ClassicalZone__Group_8__1 )
            // InternalMiec.g:1526:2: rule__ClassicalZone__Group_8__0__Impl rule__ClassicalZone__Group_8__1
            {
            pushFollow(FOLLOW_15);
            rule__ClassicalZone__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8__0"


    // $ANTLR start "rule__ClassicalZone__Group_8__0__Impl"
    // InternalMiec.g:1533:1: rule__ClassicalZone__Group_8__0__Impl : ( ';' ) ;
    public final void rule__ClassicalZone__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1537:1: ( ( ';' ) )
            // InternalMiec.g:1538:1: ( ';' )
            {
            // InternalMiec.g:1538:1: ( ';' )
            // InternalMiec.g:1539:2: ';'
            {
             before(grammarAccess.getClassicalZoneAccess().getSemicolonKeyword_8_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getSemicolonKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8__0__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_8__1"
    // InternalMiec.g:1548:1: rule__ClassicalZone__Group_8__1 : rule__ClassicalZone__Group_8__1__Impl rule__ClassicalZone__Group_8__2 ;
    public final void rule__ClassicalZone__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1552:1: ( rule__ClassicalZone__Group_8__1__Impl rule__ClassicalZone__Group_8__2 )
            // InternalMiec.g:1553:2: rule__ClassicalZone__Group_8__1__Impl rule__ClassicalZone__Group_8__2
            {
            pushFollow(FOLLOW_7);
            rule__ClassicalZone__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8__1"


    // $ANTLR start "rule__ClassicalZone__Group_8__1__Impl"
    // InternalMiec.g:1560:1: rule__ClassicalZone__Group_8__1__Impl : ( 'countermeasures' ) ;
    public final void rule__ClassicalZone__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1564:1: ( ( 'countermeasures' ) )
            // InternalMiec.g:1565:1: ( 'countermeasures' )
            {
            // InternalMiec.g:1565:1: ( 'countermeasures' )
            // InternalMiec.g:1566:2: 'countermeasures'
            {
             before(grammarAccess.getClassicalZoneAccess().getCountermeasuresKeyword_8_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getCountermeasuresKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8__1__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_8__2"
    // InternalMiec.g:1575:1: rule__ClassicalZone__Group_8__2 : rule__ClassicalZone__Group_8__2__Impl rule__ClassicalZone__Group_8__3 ;
    public final void rule__ClassicalZone__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1579:1: ( rule__ClassicalZone__Group_8__2__Impl rule__ClassicalZone__Group_8__3 )
            // InternalMiec.g:1580:2: rule__ClassicalZone__Group_8__2__Impl rule__ClassicalZone__Group_8__3
            {
            pushFollow(FOLLOW_12);
            rule__ClassicalZone__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8__2"


    // $ANTLR start "rule__ClassicalZone__Group_8__2__Impl"
    // InternalMiec.g:1587:1: rule__ClassicalZone__Group_8__2__Impl : ( '{' ) ;
    public final void rule__ClassicalZone__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1591:1: ( ( '{' ) )
            // InternalMiec.g:1592:1: ( '{' )
            {
            // InternalMiec.g:1592:1: ( '{' )
            // InternalMiec.g:1593:2: '{'
            {
             before(grammarAccess.getClassicalZoneAccess().getLeftCurlyBracketKeyword_8_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getLeftCurlyBracketKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8__2__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_8__3"
    // InternalMiec.g:1602:1: rule__ClassicalZone__Group_8__3 : rule__ClassicalZone__Group_8__3__Impl rule__ClassicalZone__Group_8__4 ;
    public final void rule__ClassicalZone__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1606:1: ( rule__ClassicalZone__Group_8__3__Impl rule__ClassicalZone__Group_8__4 )
            // InternalMiec.g:1607:2: rule__ClassicalZone__Group_8__3__Impl rule__ClassicalZone__Group_8__4
            {
            pushFollow(FOLLOW_13);
            rule__ClassicalZone__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8__3"


    // $ANTLR start "rule__ClassicalZone__Group_8__3__Impl"
    // InternalMiec.g:1614:1: rule__ClassicalZone__Group_8__3__Impl : ( ( rule__ClassicalZone__CountermeasuresAssignment_8_3 ) ) ;
    public final void rule__ClassicalZone__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1618:1: ( ( ( rule__ClassicalZone__CountermeasuresAssignment_8_3 ) ) )
            // InternalMiec.g:1619:1: ( ( rule__ClassicalZone__CountermeasuresAssignment_8_3 ) )
            {
            // InternalMiec.g:1619:1: ( ( rule__ClassicalZone__CountermeasuresAssignment_8_3 ) )
            // InternalMiec.g:1620:2: ( rule__ClassicalZone__CountermeasuresAssignment_8_3 )
            {
             before(grammarAccess.getClassicalZoneAccess().getCountermeasuresAssignment_8_3()); 
            // InternalMiec.g:1621:2: ( rule__ClassicalZone__CountermeasuresAssignment_8_3 )
            // InternalMiec.g:1621:3: rule__ClassicalZone__CountermeasuresAssignment_8_3
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__CountermeasuresAssignment_8_3();

            state._fsp--;


            }

             after(grammarAccess.getClassicalZoneAccess().getCountermeasuresAssignment_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8__3__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_8__4"
    // InternalMiec.g:1629:1: rule__ClassicalZone__Group_8__4 : rule__ClassicalZone__Group_8__4__Impl rule__ClassicalZone__Group_8__5 ;
    public final void rule__ClassicalZone__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1633:1: ( rule__ClassicalZone__Group_8__4__Impl rule__ClassicalZone__Group_8__5 )
            // InternalMiec.g:1634:2: rule__ClassicalZone__Group_8__4__Impl rule__ClassicalZone__Group_8__5
            {
            pushFollow(FOLLOW_13);
            rule__ClassicalZone__Group_8__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_8__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8__4"


    // $ANTLR start "rule__ClassicalZone__Group_8__4__Impl"
    // InternalMiec.g:1641:1: rule__ClassicalZone__Group_8__4__Impl : ( ( rule__ClassicalZone__Group_8_4__0 )* ) ;
    public final void rule__ClassicalZone__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1645:1: ( ( ( rule__ClassicalZone__Group_8_4__0 )* ) )
            // InternalMiec.g:1646:1: ( ( rule__ClassicalZone__Group_8_4__0 )* )
            {
            // InternalMiec.g:1646:1: ( ( rule__ClassicalZone__Group_8_4__0 )* )
            // InternalMiec.g:1647:2: ( rule__ClassicalZone__Group_8_4__0 )*
            {
             before(grammarAccess.getClassicalZoneAccess().getGroup_8_4()); 
            // InternalMiec.g:1648:2: ( rule__ClassicalZone__Group_8_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMiec.g:1648:3: rule__ClassicalZone__Group_8_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ClassicalZone__Group_8_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getClassicalZoneAccess().getGroup_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8__4__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_8__5"
    // InternalMiec.g:1656:1: rule__ClassicalZone__Group_8__5 : rule__ClassicalZone__Group_8__5__Impl ;
    public final void rule__ClassicalZone__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1660:1: ( rule__ClassicalZone__Group_8__5__Impl )
            // InternalMiec.g:1661:2: rule__ClassicalZone__Group_8__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_8__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8__5"


    // $ANTLR start "rule__ClassicalZone__Group_8__5__Impl"
    // InternalMiec.g:1667:1: rule__ClassicalZone__Group_8__5__Impl : ( '}' ) ;
    public final void rule__ClassicalZone__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1671:1: ( ( '}' ) )
            // InternalMiec.g:1672:1: ( '}' )
            {
            // InternalMiec.g:1672:1: ( '}' )
            // InternalMiec.g:1673:2: '}'
            {
             before(grammarAccess.getClassicalZoneAccess().getRightCurlyBracketKeyword_8_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getRightCurlyBracketKeyword_8_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8__5__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_8_4__0"
    // InternalMiec.g:1683:1: rule__ClassicalZone__Group_8_4__0 : rule__ClassicalZone__Group_8_4__0__Impl rule__ClassicalZone__Group_8_4__1 ;
    public final void rule__ClassicalZone__Group_8_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1687:1: ( rule__ClassicalZone__Group_8_4__0__Impl rule__ClassicalZone__Group_8_4__1 )
            // InternalMiec.g:1688:2: rule__ClassicalZone__Group_8_4__0__Impl rule__ClassicalZone__Group_8_4__1
            {
            pushFollow(FOLLOW_12);
            rule__ClassicalZone__Group_8_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_8_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8_4__0"


    // $ANTLR start "rule__ClassicalZone__Group_8_4__0__Impl"
    // InternalMiec.g:1695:1: rule__ClassicalZone__Group_8_4__0__Impl : ( ',' ) ;
    public final void rule__ClassicalZone__Group_8_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1699:1: ( ( ',' ) )
            // InternalMiec.g:1700:1: ( ',' )
            {
            // InternalMiec.g:1700:1: ( ',' )
            // InternalMiec.g:1701:2: ','
            {
             before(grammarAccess.getClassicalZoneAccess().getCommaKeyword_8_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getCommaKeyword_8_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8_4__0__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_8_4__1"
    // InternalMiec.g:1710:1: rule__ClassicalZone__Group_8_4__1 : rule__ClassicalZone__Group_8_4__1__Impl ;
    public final void rule__ClassicalZone__Group_8_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1714:1: ( rule__ClassicalZone__Group_8_4__1__Impl )
            // InternalMiec.g:1715:2: rule__ClassicalZone__Group_8_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_8_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8_4__1"


    // $ANTLR start "rule__ClassicalZone__Group_8_4__1__Impl"
    // InternalMiec.g:1721:1: rule__ClassicalZone__Group_8_4__1__Impl : ( ( rule__ClassicalZone__CountermeasuresAssignment_8_4_1 ) ) ;
    public final void rule__ClassicalZone__Group_8_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1725:1: ( ( ( rule__ClassicalZone__CountermeasuresAssignment_8_4_1 ) ) )
            // InternalMiec.g:1726:1: ( ( rule__ClassicalZone__CountermeasuresAssignment_8_4_1 ) )
            {
            // InternalMiec.g:1726:1: ( ( rule__ClassicalZone__CountermeasuresAssignment_8_4_1 ) )
            // InternalMiec.g:1727:2: ( rule__ClassicalZone__CountermeasuresAssignment_8_4_1 )
            {
             before(grammarAccess.getClassicalZoneAccess().getCountermeasuresAssignment_8_4_1()); 
            // InternalMiec.g:1728:2: ( rule__ClassicalZone__CountermeasuresAssignment_8_4_1 )
            // InternalMiec.g:1728:3: rule__ClassicalZone__CountermeasuresAssignment_8_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__CountermeasuresAssignment_8_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassicalZoneAccess().getCountermeasuresAssignment_8_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_8_4__1__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_9__0"
    // InternalMiec.g:1737:1: rule__ClassicalZone__Group_9__0 : rule__ClassicalZone__Group_9__0__Impl rule__ClassicalZone__Group_9__1 ;
    public final void rule__ClassicalZone__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1741:1: ( rule__ClassicalZone__Group_9__0__Impl rule__ClassicalZone__Group_9__1 )
            // InternalMiec.g:1742:2: rule__ClassicalZone__Group_9__0__Impl rule__ClassicalZone__Group_9__1
            {
            pushFollow(FOLLOW_16);
            rule__ClassicalZone__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9__0"


    // $ANTLR start "rule__ClassicalZone__Group_9__0__Impl"
    // InternalMiec.g:1749:1: rule__ClassicalZone__Group_9__0__Impl : ( ';' ) ;
    public final void rule__ClassicalZone__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1753:1: ( ( ';' ) )
            // InternalMiec.g:1754:1: ( ';' )
            {
            // InternalMiec.g:1754:1: ( ';' )
            // InternalMiec.g:1755:2: ';'
            {
             before(grammarAccess.getClassicalZoneAccess().getSemicolonKeyword_9_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getSemicolonKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9__0__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_9__1"
    // InternalMiec.g:1764:1: rule__ClassicalZone__Group_9__1 : rule__ClassicalZone__Group_9__1__Impl rule__ClassicalZone__Group_9__2 ;
    public final void rule__ClassicalZone__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1768:1: ( rule__ClassicalZone__Group_9__1__Impl rule__ClassicalZone__Group_9__2 )
            // InternalMiec.g:1769:2: rule__ClassicalZone__Group_9__1__Impl rule__ClassicalZone__Group_9__2
            {
            pushFollow(FOLLOW_7);
            rule__ClassicalZone__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9__1"


    // $ANTLR start "rule__ClassicalZone__Group_9__1__Impl"
    // InternalMiec.g:1776:1: rule__ClassicalZone__Group_9__1__Impl : ( 'subzones' ) ;
    public final void rule__ClassicalZone__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1780:1: ( ( 'subzones' ) )
            // InternalMiec.g:1781:1: ( 'subzones' )
            {
            // InternalMiec.g:1781:1: ( 'subzones' )
            // InternalMiec.g:1782:2: 'subzones'
            {
             before(grammarAccess.getClassicalZoneAccess().getSubzonesKeyword_9_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getSubzonesKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9__1__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_9__2"
    // InternalMiec.g:1791:1: rule__ClassicalZone__Group_9__2 : rule__ClassicalZone__Group_9__2__Impl rule__ClassicalZone__Group_9__3 ;
    public final void rule__ClassicalZone__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1795:1: ( rule__ClassicalZone__Group_9__2__Impl rule__ClassicalZone__Group_9__3 )
            // InternalMiec.g:1796:2: rule__ClassicalZone__Group_9__2__Impl rule__ClassicalZone__Group_9__3
            {
            pushFollow(FOLLOW_3);
            rule__ClassicalZone__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9__2"


    // $ANTLR start "rule__ClassicalZone__Group_9__2__Impl"
    // InternalMiec.g:1803:1: rule__ClassicalZone__Group_9__2__Impl : ( '{' ) ;
    public final void rule__ClassicalZone__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1807:1: ( ( '{' ) )
            // InternalMiec.g:1808:1: ( '{' )
            {
            // InternalMiec.g:1808:1: ( '{' )
            // InternalMiec.g:1809:2: '{'
            {
             before(grammarAccess.getClassicalZoneAccess().getLeftCurlyBracketKeyword_9_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getLeftCurlyBracketKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9__2__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_9__3"
    // InternalMiec.g:1818:1: rule__ClassicalZone__Group_9__3 : rule__ClassicalZone__Group_9__3__Impl rule__ClassicalZone__Group_9__4 ;
    public final void rule__ClassicalZone__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1822:1: ( rule__ClassicalZone__Group_9__3__Impl rule__ClassicalZone__Group_9__4 )
            // InternalMiec.g:1823:2: rule__ClassicalZone__Group_9__3__Impl rule__ClassicalZone__Group_9__4
            {
            pushFollow(FOLLOW_10);
            rule__ClassicalZone__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9__3"


    // $ANTLR start "rule__ClassicalZone__Group_9__3__Impl"
    // InternalMiec.g:1830:1: rule__ClassicalZone__Group_9__3__Impl : ( ( rule__ClassicalZone__SubZonesAssignment_9_3 ) ) ;
    public final void rule__ClassicalZone__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1834:1: ( ( ( rule__ClassicalZone__SubZonesAssignment_9_3 ) ) )
            // InternalMiec.g:1835:1: ( ( rule__ClassicalZone__SubZonesAssignment_9_3 ) )
            {
            // InternalMiec.g:1835:1: ( ( rule__ClassicalZone__SubZonesAssignment_9_3 ) )
            // InternalMiec.g:1836:2: ( rule__ClassicalZone__SubZonesAssignment_9_3 )
            {
             before(grammarAccess.getClassicalZoneAccess().getSubZonesAssignment_9_3()); 
            // InternalMiec.g:1837:2: ( rule__ClassicalZone__SubZonesAssignment_9_3 )
            // InternalMiec.g:1837:3: rule__ClassicalZone__SubZonesAssignment_9_3
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__SubZonesAssignment_9_3();

            state._fsp--;


            }

             after(grammarAccess.getClassicalZoneAccess().getSubZonesAssignment_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9__3__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_9__4"
    // InternalMiec.g:1845:1: rule__ClassicalZone__Group_9__4 : rule__ClassicalZone__Group_9__4__Impl rule__ClassicalZone__Group_9__5 ;
    public final void rule__ClassicalZone__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1849:1: ( rule__ClassicalZone__Group_9__4__Impl rule__ClassicalZone__Group_9__5 )
            // InternalMiec.g:1850:2: rule__ClassicalZone__Group_9__4__Impl rule__ClassicalZone__Group_9__5
            {
            pushFollow(FOLLOW_10);
            rule__ClassicalZone__Group_9__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_9__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9__4"


    // $ANTLR start "rule__ClassicalZone__Group_9__4__Impl"
    // InternalMiec.g:1857:1: rule__ClassicalZone__Group_9__4__Impl : ( ( rule__ClassicalZone__Group_9_4__0 )* ) ;
    public final void rule__ClassicalZone__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1861:1: ( ( ( rule__ClassicalZone__Group_9_4__0 )* ) )
            // InternalMiec.g:1862:1: ( ( rule__ClassicalZone__Group_9_4__0 )* )
            {
            // InternalMiec.g:1862:1: ( ( rule__ClassicalZone__Group_9_4__0 )* )
            // InternalMiec.g:1863:2: ( rule__ClassicalZone__Group_9_4__0 )*
            {
             before(grammarAccess.getClassicalZoneAccess().getGroup_9_4()); 
            // InternalMiec.g:1864:2: ( rule__ClassicalZone__Group_9_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMiec.g:1864:3: rule__ClassicalZone__Group_9_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ClassicalZone__Group_9_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getClassicalZoneAccess().getGroup_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9__4__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_9__5"
    // InternalMiec.g:1872:1: rule__ClassicalZone__Group_9__5 : rule__ClassicalZone__Group_9__5__Impl ;
    public final void rule__ClassicalZone__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1876:1: ( rule__ClassicalZone__Group_9__5__Impl )
            // InternalMiec.g:1877:2: rule__ClassicalZone__Group_9__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_9__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9__5"


    // $ANTLR start "rule__ClassicalZone__Group_9__5__Impl"
    // InternalMiec.g:1883:1: rule__ClassicalZone__Group_9__5__Impl : ( '}' ) ;
    public final void rule__ClassicalZone__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1887:1: ( ( '}' ) )
            // InternalMiec.g:1888:1: ( '}' )
            {
            // InternalMiec.g:1888:1: ( '}' )
            // InternalMiec.g:1889:2: '}'
            {
             before(grammarAccess.getClassicalZoneAccess().getRightCurlyBracketKeyword_9_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getRightCurlyBracketKeyword_9_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9__5__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_9_4__0"
    // InternalMiec.g:1899:1: rule__ClassicalZone__Group_9_4__0 : rule__ClassicalZone__Group_9_4__0__Impl rule__ClassicalZone__Group_9_4__1 ;
    public final void rule__ClassicalZone__Group_9_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1903:1: ( rule__ClassicalZone__Group_9_4__0__Impl rule__ClassicalZone__Group_9_4__1 )
            // InternalMiec.g:1904:2: rule__ClassicalZone__Group_9_4__0__Impl rule__ClassicalZone__Group_9_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassicalZone__Group_9_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_9_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9_4__0"


    // $ANTLR start "rule__ClassicalZone__Group_9_4__0__Impl"
    // InternalMiec.g:1911:1: rule__ClassicalZone__Group_9_4__0__Impl : ( ';' ) ;
    public final void rule__ClassicalZone__Group_9_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1915:1: ( ( ';' ) )
            // InternalMiec.g:1916:1: ( ';' )
            {
            // InternalMiec.g:1916:1: ( ';' )
            // InternalMiec.g:1917:2: ';'
            {
             before(grammarAccess.getClassicalZoneAccess().getSemicolonKeyword_9_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getSemicolonKeyword_9_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9_4__0__Impl"


    // $ANTLR start "rule__ClassicalZone__Group_9_4__1"
    // InternalMiec.g:1926:1: rule__ClassicalZone__Group_9_4__1 : rule__ClassicalZone__Group_9_4__1__Impl ;
    public final void rule__ClassicalZone__Group_9_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1930:1: ( rule__ClassicalZone__Group_9_4__1__Impl )
            // InternalMiec.g:1931:2: rule__ClassicalZone__Group_9_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__Group_9_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9_4__1"


    // $ANTLR start "rule__ClassicalZone__Group_9_4__1__Impl"
    // InternalMiec.g:1937:1: rule__ClassicalZone__Group_9_4__1__Impl : ( ( rule__ClassicalZone__SubZonesAssignment_9_4_1 ) ) ;
    public final void rule__ClassicalZone__Group_9_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1941:1: ( ( ( rule__ClassicalZone__SubZonesAssignment_9_4_1 ) ) )
            // InternalMiec.g:1942:1: ( ( rule__ClassicalZone__SubZonesAssignment_9_4_1 ) )
            {
            // InternalMiec.g:1942:1: ( ( rule__ClassicalZone__SubZonesAssignment_9_4_1 ) )
            // InternalMiec.g:1943:2: ( rule__ClassicalZone__SubZonesAssignment_9_4_1 )
            {
             before(grammarAccess.getClassicalZoneAccess().getSubZonesAssignment_9_4_1()); 
            // InternalMiec.g:1944:2: ( rule__ClassicalZone__SubZonesAssignment_9_4_1 )
            // InternalMiec.g:1944:3: rule__ClassicalZone__SubZonesAssignment_9_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassicalZone__SubZonesAssignment_9_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassicalZoneAccess().getSubZonesAssignment_9_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__Group_9_4__1__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__0"
    // InternalMiec.g:1953:1: rule__SecurityLevels__Group__0 : rule__SecurityLevels__Group__0__Impl rule__SecurityLevels__Group__1 ;
    public final void rule__SecurityLevels__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1957:1: ( rule__SecurityLevels__Group__0__Impl rule__SecurityLevels__Group__1 )
            // InternalMiec.g:1958:2: rule__SecurityLevels__Group__0__Impl rule__SecurityLevels__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__SecurityLevels__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__0"


    // $ANTLR start "rule__SecurityLevels__Group__0__Impl"
    // InternalMiec.g:1965:1: rule__SecurityLevels__Group__0__Impl : ( '[' ) ;
    public final void rule__SecurityLevels__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1969:1: ( ( '[' ) )
            // InternalMiec.g:1970:1: ( '[' )
            {
            // InternalMiec.g:1970:1: ( '[' )
            // InternalMiec.g:1971:2: '['
            {
             before(grammarAccess.getSecurityLevelsAccess().getLeftSquareBracketKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSecurityLevelsAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__0__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__1"
    // InternalMiec.g:1980:1: rule__SecurityLevels__Group__1 : rule__SecurityLevels__Group__1__Impl rule__SecurityLevels__Group__2 ;
    public final void rule__SecurityLevels__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1984:1: ( rule__SecurityLevels__Group__1__Impl rule__SecurityLevels__Group__2 )
            // InternalMiec.g:1985:2: rule__SecurityLevels__Group__1__Impl rule__SecurityLevels__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__SecurityLevels__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__1"


    // $ANTLR start "rule__SecurityLevels__Group__1__Impl"
    // InternalMiec.g:1992:1: rule__SecurityLevels__Group__1__Impl : ( ( rule__SecurityLevels__AccessControlAssignment_1 ) ) ;
    public final void rule__SecurityLevels__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:1996:1: ( ( ( rule__SecurityLevels__AccessControlAssignment_1 ) ) )
            // InternalMiec.g:1997:1: ( ( rule__SecurityLevels__AccessControlAssignment_1 ) )
            {
            // InternalMiec.g:1997:1: ( ( rule__SecurityLevels__AccessControlAssignment_1 ) )
            // InternalMiec.g:1998:2: ( rule__SecurityLevels__AccessControlAssignment_1 )
            {
             before(grammarAccess.getSecurityLevelsAccess().getAccessControlAssignment_1()); 
            // InternalMiec.g:1999:2: ( rule__SecurityLevels__AccessControlAssignment_1 )
            // InternalMiec.g:1999:3: rule__SecurityLevels__AccessControlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SecurityLevels__AccessControlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityLevelsAccess().getAccessControlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__1__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__2"
    // InternalMiec.g:2007:1: rule__SecurityLevels__Group__2 : rule__SecurityLevels__Group__2__Impl rule__SecurityLevels__Group__3 ;
    public final void rule__SecurityLevels__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2011:1: ( rule__SecurityLevels__Group__2__Impl rule__SecurityLevels__Group__3 )
            // InternalMiec.g:2012:2: rule__SecurityLevels__Group__2__Impl rule__SecurityLevels__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__SecurityLevels__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__2"


    // $ANTLR start "rule__SecurityLevels__Group__2__Impl"
    // InternalMiec.g:2019:1: rule__SecurityLevels__Group__2__Impl : ( ',' ) ;
    public final void rule__SecurityLevels__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2023:1: ( ( ',' ) )
            // InternalMiec.g:2024:1: ( ',' )
            {
            // InternalMiec.g:2024:1: ( ',' )
            // InternalMiec.g:2025:2: ','
            {
             before(grammarAccess.getSecurityLevelsAccess().getCommaKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSecurityLevelsAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__2__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__3"
    // InternalMiec.g:2034:1: rule__SecurityLevels__Group__3 : rule__SecurityLevels__Group__3__Impl rule__SecurityLevels__Group__4 ;
    public final void rule__SecurityLevels__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2038:1: ( rule__SecurityLevels__Group__3__Impl rule__SecurityLevels__Group__4 )
            // InternalMiec.g:2039:2: rule__SecurityLevels__Group__3__Impl rule__SecurityLevels__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__SecurityLevels__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__3"


    // $ANTLR start "rule__SecurityLevels__Group__3__Impl"
    // InternalMiec.g:2046:1: rule__SecurityLevels__Group__3__Impl : ( ( rule__SecurityLevels__UseControlAssignment_3 ) ) ;
    public final void rule__SecurityLevels__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2050:1: ( ( ( rule__SecurityLevels__UseControlAssignment_3 ) ) )
            // InternalMiec.g:2051:1: ( ( rule__SecurityLevels__UseControlAssignment_3 ) )
            {
            // InternalMiec.g:2051:1: ( ( rule__SecurityLevels__UseControlAssignment_3 ) )
            // InternalMiec.g:2052:2: ( rule__SecurityLevels__UseControlAssignment_3 )
            {
             before(grammarAccess.getSecurityLevelsAccess().getUseControlAssignment_3()); 
            // InternalMiec.g:2053:2: ( rule__SecurityLevels__UseControlAssignment_3 )
            // InternalMiec.g:2053:3: rule__SecurityLevels__UseControlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SecurityLevels__UseControlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSecurityLevelsAccess().getUseControlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__3__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__4"
    // InternalMiec.g:2061:1: rule__SecurityLevels__Group__4 : rule__SecurityLevels__Group__4__Impl rule__SecurityLevels__Group__5 ;
    public final void rule__SecurityLevels__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2065:1: ( rule__SecurityLevels__Group__4__Impl rule__SecurityLevels__Group__5 )
            // InternalMiec.g:2066:2: rule__SecurityLevels__Group__4__Impl rule__SecurityLevels__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__SecurityLevels__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__4"


    // $ANTLR start "rule__SecurityLevels__Group__4__Impl"
    // InternalMiec.g:2073:1: rule__SecurityLevels__Group__4__Impl : ( ',' ) ;
    public final void rule__SecurityLevels__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2077:1: ( ( ',' ) )
            // InternalMiec.g:2078:1: ( ',' )
            {
            // InternalMiec.g:2078:1: ( ',' )
            // InternalMiec.g:2079:2: ','
            {
             before(grammarAccess.getSecurityLevelsAccess().getCommaKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSecurityLevelsAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__4__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__5"
    // InternalMiec.g:2088:1: rule__SecurityLevels__Group__5 : rule__SecurityLevels__Group__5__Impl rule__SecurityLevels__Group__6 ;
    public final void rule__SecurityLevels__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2092:1: ( rule__SecurityLevels__Group__5__Impl rule__SecurityLevels__Group__6 )
            // InternalMiec.g:2093:2: rule__SecurityLevels__Group__5__Impl rule__SecurityLevels__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__SecurityLevels__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__5"


    // $ANTLR start "rule__SecurityLevels__Group__5__Impl"
    // InternalMiec.g:2100:1: rule__SecurityLevels__Group__5__Impl : ( ( rule__SecurityLevels__SystemIntegrityAssignment_5 ) ) ;
    public final void rule__SecurityLevels__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2104:1: ( ( ( rule__SecurityLevels__SystemIntegrityAssignment_5 ) ) )
            // InternalMiec.g:2105:1: ( ( rule__SecurityLevels__SystemIntegrityAssignment_5 ) )
            {
            // InternalMiec.g:2105:1: ( ( rule__SecurityLevels__SystemIntegrityAssignment_5 ) )
            // InternalMiec.g:2106:2: ( rule__SecurityLevels__SystemIntegrityAssignment_5 )
            {
             before(grammarAccess.getSecurityLevelsAccess().getSystemIntegrityAssignment_5()); 
            // InternalMiec.g:2107:2: ( rule__SecurityLevels__SystemIntegrityAssignment_5 )
            // InternalMiec.g:2107:3: rule__SecurityLevels__SystemIntegrityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SecurityLevels__SystemIntegrityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSecurityLevelsAccess().getSystemIntegrityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__5__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__6"
    // InternalMiec.g:2115:1: rule__SecurityLevels__Group__6 : rule__SecurityLevels__Group__6__Impl rule__SecurityLevels__Group__7 ;
    public final void rule__SecurityLevels__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2119:1: ( rule__SecurityLevels__Group__6__Impl rule__SecurityLevels__Group__7 )
            // InternalMiec.g:2120:2: rule__SecurityLevels__Group__6__Impl rule__SecurityLevels__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__SecurityLevels__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__6"


    // $ANTLR start "rule__SecurityLevels__Group__6__Impl"
    // InternalMiec.g:2127:1: rule__SecurityLevels__Group__6__Impl : ( ',' ) ;
    public final void rule__SecurityLevels__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2131:1: ( ( ',' ) )
            // InternalMiec.g:2132:1: ( ',' )
            {
            // InternalMiec.g:2132:1: ( ',' )
            // InternalMiec.g:2133:2: ','
            {
             before(grammarAccess.getSecurityLevelsAccess().getCommaKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSecurityLevelsAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__6__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__7"
    // InternalMiec.g:2142:1: rule__SecurityLevels__Group__7 : rule__SecurityLevels__Group__7__Impl rule__SecurityLevels__Group__8 ;
    public final void rule__SecurityLevels__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2146:1: ( rule__SecurityLevels__Group__7__Impl rule__SecurityLevels__Group__8 )
            // InternalMiec.g:2147:2: rule__SecurityLevels__Group__7__Impl rule__SecurityLevels__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__SecurityLevels__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__7"


    // $ANTLR start "rule__SecurityLevels__Group__7__Impl"
    // InternalMiec.g:2154:1: rule__SecurityLevels__Group__7__Impl : ( ( rule__SecurityLevels__DataConfidentialityAssignment_7 ) ) ;
    public final void rule__SecurityLevels__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2158:1: ( ( ( rule__SecurityLevels__DataConfidentialityAssignment_7 ) ) )
            // InternalMiec.g:2159:1: ( ( rule__SecurityLevels__DataConfidentialityAssignment_7 ) )
            {
            // InternalMiec.g:2159:1: ( ( rule__SecurityLevels__DataConfidentialityAssignment_7 ) )
            // InternalMiec.g:2160:2: ( rule__SecurityLevels__DataConfidentialityAssignment_7 )
            {
             before(grammarAccess.getSecurityLevelsAccess().getDataConfidentialityAssignment_7()); 
            // InternalMiec.g:2161:2: ( rule__SecurityLevels__DataConfidentialityAssignment_7 )
            // InternalMiec.g:2161:3: rule__SecurityLevels__DataConfidentialityAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SecurityLevels__DataConfidentialityAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSecurityLevelsAccess().getDataConfidentialityAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__7__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__8"
    // InternalMiec.g:2169:1: rule__SecurityLevels__Group__8 : rule__SecurityLevels__Group__8__Impl rule__SecurityLevels__Group__9 ;
    public final void rule__SecurityLevels__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2173:1: ( rule__SecurityLevels__Group__8__Impl rule__SecurityLevels__Group__9 )
            // InternalMiec.g:2174:2: rule__SecurityLevels__Group__8__Impl rule__SecurityLevels__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__SecurityLevels__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__8"


    // $ANTLR start "rule__SecurityLevels__Group__8__Impl"
    // InternalMiec.g:2181:1: rule__SecurityLevels__Group__8__Impl : ( ',' ) ;
    public final void rule__SecurityLevels__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2185:1: ( ( ',' ) )
            // InternalMiec.g:2186:1: ( ',' )
            {
            // InternalMiec.g:2186:1: ( ',' )
            // InternalMiec.g:2187:2: ','
            {
             before(grammarAccess.getSecurityLevelsAccess().getCommaKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSecurityLevelsAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__8__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__9"
    // InternalMiec.g:2196:1: rule__SecurityLevels__Group__9 : rule__SecurityLevels__Group__9__Impl rule__SecurityLevels__Group__10 ;
    public final void rule__SecurityLevels__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2200:1: ( rule__SecurityLevels__Group__9__Impl rule__SecurityLevels__Group__10 )
            // InternalMiec.g:2201:2: rule__SecurityLevels__Group__9__Impl rule__SecurityLevels__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__SecurityLevels__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__9"


    // $ANTLR start "rule__SecurityLevels__Group__9__Impl"
    // InternalMiec.g:2208:1: rule__SecurityLevels__Group__9__Impl : ( ( rule__SecurityLevels__RestrictedDataFlowAssignment_9 ) ) ;
    public final void rule__SecurityLevels__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2212:1: ( ( ( rule__SecurityLevels__RestrictedDataFlowAssignment_9 ) ) )
            // InternalMiec.g:2213:1: ( ( rule__SecurityLevels__RestrictedDataFlowAssignment_9 ) )
            {
            // InternalMiec.g:2213:1: ( ( rule__SecurityLevels__RestrictedDataFlowAssignment_9 ) )
            // InternalMiec.g:2214:2: ( rule__SecurityLevels__RestrictedDataFlowAssignment_9 )
            {
             before(grammarAccess.getSecurityLevelsAccess().getRestrictedDataFlowAssignment_9()); 
            // InternalMiec.g:2215:2: ( rule__SecurityLevels__RestrictedDataFlowAssignment_9 )
            // InternalMiec.g:2215:3: rule__SecurityLevels__RestrictedDataFlowAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__SecurityLevels__RestrictedDataFlowAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSecurityLevelsAccess().getRestrictedDataFlowAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__9__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__10"
    // InternalMiec.g:2223:1: rule__SecurityLevels__Group__10 : rule__SecurityLevels__Group__10__Impl rule__SecurityLevels__Group__11 ;
    public final void rule__SecurityLevels__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2227:1: ( rule__SecurityLevels__Group__10__Impl rule__SecurityLevels__Group__11 )
            // InternalMiec.g:2228:2: rule__SecurityLevels__Group__10__Impl rule__SecurityLevels__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__SecurityLevels__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__10"


    // $ANTLR start "rule__SecurityLevels__Group__10__Impl"
    // InternalMiec.g:2235:1: rule__SecurityLevels__Group__10__Impl : ( ',' ) ;
    public final void rule__SecurityLevels__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2239:1: ( ( ',' ) )
            // InternalMiec.g:2240:1: ( ',' )
            {
            // InternalMiec.g:2240:1: ( ',' )
            // InternalMiec.g:2241:2: ','
            {
             before(grammarAccess.getSecurityLevelsAccess().getCommaKeyword_10()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSecurityLevelsAccess().getCommaKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__10__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__11"
    // InternalMiec.g:2250:1: rule__SecurityLevels__Group__11 : rule__SecurityLevels__Group__11__Impl rule__SecurityLevels__Group__12 ;
    public final void rule__SecurityLevels__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2254:1: ( rule__SecurityLevels__Group__11__Impl rule__SecurityLevels__Group__12 )
            // InternalMiec.g:2255:2: rule__SecurityLevels__Group__11__Impl rule__SecurityLevels__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__SecurityLevels__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__11"


    // $ANTLR start "rule__SecurityLevels__Group__11__Impl"
    // InternalMiec.g:2262:1: rule__SecurityLevels__Group__11__Impl : ( ( rule__SecurityLevels__TimelyResponseAssignment_11 ) ) ;
    public final void rule__SecurityLevels__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2266:1: ( ( ( rule__SecurityLevels__TimelyResponseAssignment_11 ) ) )
            // InternalMiec.g:2267:1: ( ( rule__SecurityLevels__TimelyResponseAssignment_11 ) )
            {
            // InternalMiec.g:2267:1: ( ( rule__SecurityLevels__TimelyResponseAssignment_11 ) )
            // InternalMiec.g:2268:2: ( rule__SecurityLevels__TimelyResponseAssignment_11 )
            {
             before(grammarAccess.getSecurityLevelsAccess().getTimelyResponseAssignment_11()); 
            // InternalMiec.g:2269:2: ( rule__SecurityLevels__TimelyResponseAssignment_11 )
            // InternalMiec.g:2269:3: rule__SecurityLevels__TimelyResponseAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__SecurityLevels__TimelyResponseAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getSecurityLevelsAccess().getTimelyResponseAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__11__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__12"
    // InternalMiec.g:2277:1: rule__SecurityLevels__Group__12 : rule__SecurityLevels__Group__12__Impl rule__SecurityLevels__Group__13 ;
    public final void rule__SecurityLevels__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2281:1: ( rule__SecurityLevels__Group__12__Impl rule__SecurityLevels__Group__13 )
            // InternalMiec.g:2282:2: rule__SecurityLevels__Group__12__Impl rule__SecurityLevels__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__SecurityLevels__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__12"


    // $ANTLR start "rule__SecurityLevels__Group__12__Impl"
    // InternalMiec.g:2289:1: rule__SecurityLevels__Group__12__Impl : ( ',' ) ;
    public final void rule__SecurityLevels__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2293:1: ( ( ',' ) )
            // InternalMiec.g:2294:1: ( ',' )
            {
            // InternalMiec.g:2294:1: ( ',' )
            // InternalMiec.g:2295:2: ','
            {
             before(grammarAccess.getSecurityLevelsAccess().getCommaKeyword_12()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSecurityLevelsAccess().getCommaKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__12__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__13"
    // InternalMiec.g:2304:1: rule__SecurityLevels__Group__13 : rule__SecurityLevels__Group__13__Impl rule__SecurityLevels__Group__14 ;
    public final void rule__SecurityLevels__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2308:1: ( rule__SecurityLevels__Group__13__Impl rule__SecurityLevels__Group__14 )
            // InternalMiec.g:2309:2: rule__SecurityLevels__Group__13__Impl rule__SecurityLevels__Group__14
            {
            pushFollow(FOLLOW_20);
            rule__SecurityLevels__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__13"


    // $ANTLR start "rule__SecurityLevels__Group__13__Impl"
    // InternalMiec.g:2316:1: rule__SecurityLevels__Group__13__Impl : ( ( rule__SecurityLevels__ResourceAvailabilityAssignment_13 ) ) ;
    public final void rule__SecurityLevels__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2320:1: ( ( ( rule__SecurityLevels__ResourceAvailabilityAssignment_13 ) ) )
            // InternalMiec.g:2321:1: ( ( rule__SecurityLevels__ResourceAvailabilityAssignment_13 ) )
            {
            // InternalMiec.g:2321:1: ( ( rule__SecurityLevels__ResourceAvailabilityAssignment_13 ) )
            // InternalMiec.g:2322:2: ( rule__SecurityLevels__ResourceAvailabilityAssignment_13 )
            {
             before(grammarAccess.getSecurityLevelsAccess().getResourceAvailabilityAssignment_13()); 
            // InternalMiec.g:2323:2: ( rule__SecurityLevels__ResourceAvailabilityAssignment_13 )
            // InternalMiec.g:2323:3: rule__SecurityLevels__ResourceAvailabilityAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__SecurityLevels__ResourceAvailabilityAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getSecurityLevelsAccess().getResourceAvailabilityAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__13__Impl"


    // $ANTLR start "rule__SecurityLevels__Group__14"
    // InternalMiec.g:2331:1: rule__SecurityLevels__Group__14 : rule__SecurityLevels__Group__14__Impl ;
    public final void rule__SecurityLevels__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2335:1: ( rule__SecurityLevels__Group__14__Impl )
            // InternalMiec.g:2336:2: rule__SecurityLevels__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityLevels__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__14"


    // $ANTLR start "rule__SecurityLevels__Group__14__Impl"
    // InternalMiec.g:2342:1: rule__SecurityLevels__Group__14__Impl : ( ']' ) ;
    public final void rule__SecurityLevels__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2346:1: ( ( ']' ) )
            // InternalMiec.g:2347:1: ( ']' )
            {
            // InternalMiec.g:2347:1: ( ']' )
            // InternalMiec.g:2348:2: ']'
            {
             before(grammarAccess.getSecurityLevelsAccess().getRightSquareBracketKeyword_14()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSecurityLevelsAccess().getRightSquareBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__Group__14__Impl"


    // $ANTLR start "rule__CounterMeasure__Group__0"
    // InternalMiec.g:2358:1: rule__CounterMeasure__Group__0 : rule__CounterMeasure__Group__0__Impl rule__CounterMeasure__Group__1 ;
    public final void rule__CounterMeasure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2362:1: ( rule__CounterMeasure__Group__0__Impl rule__CounterMeasure__Group__1 )
            // InternalMiec.g:2363:2: rule__CounterMeasure__Group__0__Impl rule__CounterMeasure__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CounterMeasure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CounterMeasure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__Group__0"


    // $ANTLR start "rule__CounterMeasure__Group__0__Impl"
    // InternalMiec.g:2370:1: rule__CounterMeasure__Group__0__Impl : ( '(' ) ;
    public final void rule__CounterMeasure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2374:1: ( ( '(' ) )
            // InternalMiec.g:2375:1: ( '(' )
            {
            // InternalMiec.g:2375:1: ( '(' )
            // InternalMiec.g:2376:2: '('
            {
             before(grammarAccess.getCounterMeasureAccess().getLeftParenthesisKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCounterMeasureAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__Group__0__Impl"


    // $ANTLR start "rule__CounterMeasure__Group__1"
    // InternalMiec.g:2385:1: rule__CounterMeasure__Group__1 : rule__CounterMeasure__Group__1__Impl rule__CounterMeasure__Group__2 ;
    public final void rule__CounterMeasure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2389:1: ( rule__CounterMeasure__Group__1__Impl rule__CounterMeasure__Group__2 )
            // InternalMiec.g:2390:2: rule__CounterMeasure__Group__1__Impl rule__CounterMeasure__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__CounterMeasure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CounterMeasure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__Group__1"


    // $ANTLR start "rule__CounterMeasure__Group__1__Impl"
    // InternalMiec.g:2397:1: rule__CounterMeasure__Group__1__Impl : ( ( rule__CounterMeasure__NameAssignment_1 ) ) ;
    public final void rule__CounterMeasure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2401:1: ( ( ( rule__CounterMeasure__NameAssignment_1 ) ) )
            // InternalMiec.g:2402:1: ( ( rule__CounterMeasure__NameAssignment_1 ) )
            {
            // InternalMiec.g:2402:1: ( ( rule__CounterMeasure__NameAssignment_1 ) )
            // InternalMiec.g:2403:2: ( rule__CounterMeasure__NameAssignment_1 )
            {
             before(grammarAccess.getCounterMeasureAccess().getNameAssignment_1()); 
            // InternalMiec.g:2404:2: ( rule__CounterMeasure__NameAssignment_1 )
            // InternalMiec.g:2404:3: rule__CounterMeasure__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CounterMeasure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCounterMeasureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__Group__1__Impl"


    // $ANTLR start "rule__CounterMeasure__Group__2"
    // InternalMiec.g:2412:1: rule__CounterMeasure__Group__2 : rule__CounterMeasure__Group__2__Impl rule__CounterMeasure__Group__3 ;
    public final void rule__CounterMeasure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2416:1: ( rule__CounterMeasure__Group__2__Impl rule__CounterMeasure__Group__3 )
            // InternalMiec.g:2417:2: rule__CounterMeasure__Group__2__Impl rule__CounterMeasure__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__CounterMeasure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CounterMeasure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__Group__2"


    // $ANTLR start "rule__CounterMeasure__Group__2__Impl"
    // InternalMiec.g:2424:1: rule__CounterMeasure__Group__2__Impl : ( ';' ) ;
    public final void rule__CounterMeasure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2428:1: ( ( ';' ) )
            // InternalMiec.g:2429:1: ( ';' )
            {
            // InternalMiec.g:2429:1: ( ';' )
            // InternalMiec.g:2430:2: ';'
            {
             before(grammarAccess.getCounterMeasureAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCounterMeasureAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__Group__2__Impl"


    // $ANTLR start "rule__CounterMeasure__Group__3"
    // InternalMiec.g:2439:1: rule__CounterMeasure__Group__3 : rule__CounterMeasure__Group__3__Impl rule__CounterMeasure__Group__4 ;
    public final void rule__CounterMeasure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2443:1: ( rule__CounterMeasure__Group__3__Impl rule__CounterMeasure__Group__4 )
            // InternalMiec.g:2444:2: rule__CounterMeasure__Group__3__Impl rule__CounterMeasure__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__CounterMeasure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CounterMeasure__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__Group__3"


    // $ANTLR start "rule__CounterMeasure__Group__3__Impl"
    // InternalMiec.g:2451:1: rule__CounterMeasure__Group__3__Impl : ( 'capability' ) ;
    public final void rule__CounterMeasure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2455:1: ( ( 'capability' ) )
            // InternalMiec.g:2456:1: ( 'capability' )
            {
            // InternalMiec.g:2456:1: ( 'capability' )
            // InternalMiec.g:2457:2: 'capability'
            {
             before(grammarAccess.getCounterMeasureAccess().getCapabilityKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCounterMeasureAccess().getCapabilityKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__Group__3__Impl"


    // $ANTLR start "rule__CounterMeasure__Group__4"
    // InternalMiec.g:2466:1: rule__CounterMeasure__Group__4 : rule__CounterMeasure__Group__4__Impl rule__CounterMeasure__Group__5 ;
    public final void rule__CounterMeasure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2470:1: ( rule__CounterMeasure__Group__4__Impl rule__CounterMeasure__Group__5 )
            // InternalMiec.g:2471:2: rule__CounterMeasure__Group__4__Impl rule__CounterMeasure__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__CounterMeasure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CounterMeasure__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__Group__4"


    // $ANTLR start "rule__CounterMeasure__Group__4__Impl"
    // InternalMiec.g:2478:1: rule__CounterMeasure__Group__4__Impl : ( ( rule__CounterMeasure__CapabilityAssignment_4 ) ) ;
    public final void rule__CounterMeasure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2482:1: ( ( ( rule__CounterMeasure__CapabilityAssignment_4 ) ) )
            // InternalMiec.g:2483:1: ( ( rule__CounterMeasure__CapabilityAssignment_4 ) )
            {
            // InternalMiec.g:2483:1: ( ( rule__CounterMeasure__CapabilityAssignment_4 ) )
            // InternalMiec.g:2484:2: ( rule__CounterMeasure__CapabilityAssignment_4 )
            {
             before(grammarAccess.getCounterMeasureAccess().getCapabilityAssignment_4()); 
            // InternalMiec.g:2485:2: ( rule__CounterMeasure__CapabilityAssignment_4 )
            // InternalMiec.g:2485:3: rule__CounterMeasure__CapabilityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CounterMeasure__CapabilityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCounterMeasureAccess().getCapabilityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__Group__4__Impl"


    // $ANTLR start "rule__CounterMeasure__Group__5"
    // InternalMiec.g:2493:1: rule__CounterMeasure__Group__5 : rule__CounterMeasure__Group__5__Impl ;
    public final void rule__CounterMeasure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2497:1: ( rule__CounterMeasure__Group__5__Impl )
            // InternalMiec.g:2498:2: rule__CounterMeasure__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CounterMeasure__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__Group__5"


    // $ANTLR start "rule__CounterMeasure__Group__5__Impl"
    // InternalMiec.g:2504:1: rule__CounterMeasure__Group__5__Impl : ( ')' ) ;
    public final void rule__CounterMeasure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2508:1: ( ( ')' ) )
            // InternalMiec.g:2509:1: ( ')' )
            {
            // InternalMiec.g:2509:1: ( ')' )
            // InternalMiec.g:2510:2: ')'
            {
             before(grammarAccess.getCounterMeasureAccess().getRightParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCounterMeasureAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__Group__5__Impl"


    // $ANTLR start "rule__Conduit__Group__0"
    // InternalMiec.g:2520:1: rule__Conduit__Group__0 : rule__Conduit__Group__0__Impl rule__Conduit__Group__1 ;
    public final void rule__Conduit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2524:1: ( rule__Conduit__Group__0__Impl rule__Conduit__Group__1 )
            // InternalMiec.g:2525:2: rule__Conduit__Group__0__Impl rule__Conduit__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Conduit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__0"


    // $ANTLR start "rule__Conduit__Group__0__Impl"
    // InternalMiec.g:2532:1: rule__Conduit__Group__0__Impl : ( ( rule__Conduit__TrustedAssignment_0 )? ) ;
    public final void rule__Conduit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2536:1: ( ( ( rule__Conduit__TrustedAssignment_0 )? ) )
            // InternalMiec.g:2537:1: ( ( rule__Conduit__TrustedAssignment_0 )? )
            {
            // InternalMiec.g:2537:1: ( ( rule__Conduit__TrustedAssignment_0 )? )
            // InternalMiec.g:2538:2: ( rule__Conduit__TrustedAssignment_0 )?
            {
             before(grammarAccess.getConduitAccess().getTrustedAssignment_0()); 
            // InternalMiec.g:2539:2: ( rule__Conduit__TrustedAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==56) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMiec.g:2539:3: rule__Conduit__TrustedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conduit__TrustedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConduitAccess().getTrustedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__0__Impl"


    // $ANTLR start "rule__Conduit__Group__1"
    // InternalMiec.g:2547:1: rule__Conduit__Group__1 : rule__Conduit__Group__1__Impl rule__Conduit__Group__2 ;
    public final void rule__Conduit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2551:1: ( rule__Conduit__Group__1__Impl rule__Conduit__Group__2 )
            // InternalMiec.g:2552:2: rule__Conduit__Group__1__Impl rule__Conduit__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Conduit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__1"


    // $ANTLR start "rule__Conduit__Group__1__Impl"
    // InternalMiec.g:2559:1: rule__Conduit__Group__1__Impl : ( ( rule__Conduit__PhysicalAssignment_1 )? ) ;
    public final void rule__Conduit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2563:1: ( ( ( rule__Conduit__PhysicalAssignment_1 )? ) )
            // InternalMiec.g:2564:1: ( ( rule__Conduit__PhysicalAssignment_1 )? )
            {
            // InternalMiec.g:2564:1: ( ( rule__Conduit__PhysicalAssignment_1 )? )
            // InternalMiec.g:2565:2: ( rule__Conduit__PhysicalAssignment_1 )?
            {
             before(grammarAccess.getConduitAccess().getPhysicalAssignment_1()); 
            // InternalMiec.g:2566:2: ( rule__Conduit__PhysicalAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==57) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMiec.g:2566:3: rule__Conduit__PhysicalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conduit__PhysicalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConduitAccess().getPhysicalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__1__Impl"


    // $ANTLR start "rule__Conduit__Group__2"
    // InternalMiec.g:2574:1: rule__Conduit__Group__2 : rule__Conduit__Group__2__Impl rule__Conduit__Group__3 ;
    public final void rule__Conduit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2578:1: ( rule__Conduit__Group__2__Impl rule__Conduit__Group__3 )
            // InternalMiec.g:2579:2: rule__Conduit__Group__2__Impl rule__Conduit__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Conduit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__2"


    // $ANTLR start "rule__Conduit__Group__2__Impl"
    // InternalMiec.g:2586:1: rule__Conduit__Group__2__Impl : ( 'Conduit' ) ;
    public final void rule__Conduit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2590:1: ( ( 'Conduit' ) )
            // InternalMiec.g:2591:1: ( 'Conduit' )
            {
            // InternalMiec.g:2591:1: ( 'Conduit' )
            // InternalMiec.g:2592:2: 'Conduit'
            {
             before(grammarAccess.getConduitAccess().getConduitKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getConduitKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__2__Impl"


    // $ANTLR start "rule__Conduit__Group__3"
    // InternalMiec.g:2601:1: rule__Conduit__Group__3 : rule__Conduit__Group__3__Impl rule__Conduit__Group__4 ;
    public final void rule__Conduit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2605:1: ( rule__Conduit__Group__3__Impl rule__Conduit__Group__4 )
            // InternalMiec.g:2606:2: rule__Conduit__Group__3__Impl rule__Conduit__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Conduit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__3"


    // $ANTLR start "rule__Conduit__Group__3__Impl"
    // InternalMiec.g:2613:1: rule__Conduit__Group__3__Impl : ( ( rule__Conduit__NameAssignment_3 ) ) ;
    public final void rule__Conduit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2617:1: ( ( ( rule__Conduit__NameAssignment_3 ) ) )
            // InternalMiec.g:2618:1: ( ( rule__Conduit__NameAssignment_3 ) )
            {
            // InternalMiec.g:2618:1: ( ( rule__Conduit__NameAssignment_3 ) )
            // InternalMiec.g:2619:2: ( rule__Conduit__NameAssignment_3 )
            {
             before(grammarAccess.getConduitAccess().getNameAssignment_3()); 
            // InternalMiec.g:2620:2: ( rule__Conduit__NameAssignment_3 )
            // InternalMiec.g:2620:3: rule__Conduit__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConduitAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__3__Impl"


    // $ANTLR start "rule__Conduit__Group__4"
    // InternalMiec.g:2628:1: rule__Conduit__Group__4 : rule__Conduit__Group__4__Impl rule__Conduit__Group__5 ;
    public final void rule__Conduit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2632:1: ( rule__Conduit__Group__4__Impl rule__Conduit__Group__5 )
            // InternalMiec.g:2633:2: rule__Conduit__Group__4__Impl rule__Conduit__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Conduit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__4"


    // $ANTLR start "rule__Conduit__Group__4__Impl"
    // InternalMiec.g:2640:1: rule__Conduit__Group__4__Impl : ( '{' ) ;
    public final void rule__Conduit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2644:1: ( ( '{' ) )
            // InternalMiec.g:2645:1: ( '{' )
            {
            // InternalMiec.g:2645:1: ( '{' )
            // InternalMiec.g:2646:2: '{'
            {
             before(grammarAccess.getConduitAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__4__Impl"


    // $ANTLR start "rule__Conduit__Group__5"
    // InternalMiec.g:2655:1: rule__Conduit__Group__5 : rule__Conduit__Group__5__Impl rule__Conduit__Group__6 ;
    public final void rule__Conduit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2659:1: ( rule__Conduit__Group__5__Impl rule__Conduit__Group__6 )
            // InternalMiec.g:2660:2: rule__Conduit__Group__5__Impl rule__Conduit__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Conduit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__5"


    // $ANTLR start "rule__Conduit__Group__5__Impl"
    // InternalMiec.g:2667:1: rule__Conduit__Group__5__Impl : ( 'connects' ) ;
    public final void rule__Conduit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2671:1: ( ( 'connects' ) )
            // InternalMiec.g:2672:1: ( 'connects' )
            {
            // InternalMiec.g:2672:1: ( 'connects' )
            // InternalMiec.g:2673:2: 'connects'
            {
             before(grammarAccess.getConduitAccess().getConnectsKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getConnectsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__5__Impl"


    // $ANTLR start "rule__Conduit__Group__6"
    // InternalMiec.g:2682:1: rule__Conduit__Group__6 : rule__Conduit__Group__6__Impl rule__Conduit__Group__7 ;
    public final void rule__Conduit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2686:1: ( rule__Conduit__Group__6__Impl rule__Conduit__Group__7 )
            // InternalMiec.g:2687:2: rule__Conduit__Group__6__Impl rule__Conduit__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Conduit__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__6"


    // $ANTLR start "rule__Conduit__Group__6__Impl"
    // InternalMiec.g:2694:1: rule__Conduit__Group__6__Impl : ( '(' ) ;
    public final void rule__Conduit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2698:1: ( ( '(' ) )
            // InternalMiec.g:2699:1: ( '(' )
            {
            // InternalMiec.g:2699:1: ( '(' )
            // InternalMiec.g:2700:2: '('
            {
             before(grammarAccess.getConduitAccess().getLeftParenthesisKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__6__Impl"


    // $ANTLR start "rule__Conduit__Group__7"
    // InternalMiec.g:2709:1: rule__Conduit__Group__7 : rule__Conduit__Group__7__Impl rule__Conduit__Group__8 ;
    public final void rule__Conduit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2713:1: ( rule__Conduit__Group__7__Impl rule__Conduit__Group__8 )
            // InternalMiec.g:2714:2: rule__Conduit__Group__7__Impl rule__Conduit__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Conduit__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__7"


    // $ANTLR start "rule__Conduit__Group__7__Impl"
    // InternalMiec.g:2721:1: rule__Conduit__Group__7__Impl : ( ( rule__Conduit__ConnectsAssignment_7 ) ) ;
    public final void rule__Conduit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2725:1: ( ( ( rule__Conduit__ConnectsAssignment_7 ) ) )
            // InternalMiec.g:2726:1: ( ( rule__Conduit__ConnectsAssignment_7 ) )
            {
            // InternalMiec.g:2726:1: ( ( rule__Conduit__ConnectsAssignment_7 ) )
            // InternalMiec.g:2727:2: ( rule__Conduit__ConnectsAssignment_7 )
            {
             before(grammarAccess.getConduitAccess().getConnectsAssignment_7()); 
            // InternalMiec.g:2728:2: ( rule__Conduit__ConnectsAssignment_7 )
            // InternalMiec.g:2728:3: rule__Conduit__ConnectsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__ConnectsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConduitAccess().getConnectsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__7__Impl"


    // $ANTLR start "rule__Conduit__Group__8"
    // InternalMiec.g:2736:1: rule__Conduit__Group__8 : rule__Conduit__Group__8__Impl rule__Conduit__Group__9 ;
    public final void rule__Conduit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2740:1: ( rule__Conduit__Group__8__Impl rule__Conduit__Group__9 )
            // InternalMiec.g:2741:2: rule__Conduit__Group__8__Impl rule__Conduit__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__Conduit__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__8"


    // $ANTLR start "rule__Conduit__Group__8__Impl"
    // InternalMiec.g:2748:1: rule__Conduit__Group__8__Impl : ( ( rule__Conduit__Group_8__0 )* ) ;
    public final void rule__Conduit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2752:1: ( ( ( rule__Conduit__Group_8__0 )* ) )
            // InternalMiec.g:2753:1: ( ( rule__Conduit__Group_8__0 )* )
            {
            // InternalMiec.g:2753:1: ( ( rule__Conduit__Group_8__0 )* )
            // InternalMiec.g:2754:2: ( rule__Conduit__Group_8__0 )*
            {
             before(grammarAccess.getConduitAccess().getGroup_8()); 
            // InternalMiec.g:2755:2: ( rule__Conduit__Group_8__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMiec.g:2755:3: rule__Conduit__Group_8__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Conduit__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getConduitAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__8__Impl"


    // $ANTLR start "rule__Conduit__Group__9"
    // InternalMiec.g:2763:1: rule__Conduit__Group__9 : rule__Conduit__Group__9__Impl rule__Conduit__Group__10 ;
    public final void rule__Conduit__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2767:1: ( rule__Conduit__Group__9__Impl rule__Conduit__Group__10 )
            // InternalMiec.g:2768:2: rule__Conduit__Group__9__Impl rule__Conduit__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__Conduit__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__9"


    // $ANTLR start "rule__Conduit__Group__9__Impl"
    // InternalMiec.g:2775:1: rule__Conduit__Group__9__Impl : ( ')' ) ;
    public final void rule__Conduit__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2779:1: ( ( ')' ) )
            // InternalMiec.g:2780:1: ( ')' )
            {
            // InternalMiec.g:2780:1: ( ')' )
            // InternalMiec.g:2781:2: ')'
            {
             before(grammarAccess.getConduitAccess().getRightParenthesisKeyword_9()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__9__Impl"


    // $ANTLR start "rule__Conduit__Group__10"
    // InternalMiec.g:2790:1: rule__Conduit__Group__10 : rule__Conduit__Group__10__Impl rule__Conduit__Group__11 ;
    public final void rule__Conduit__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2794:1: ( rule__Conduit__Group__10__Impl rule__Conduit__Group__11 )
            // InternalMiec.g:2795:2: rule__Conduit__Group__10__Impl rule__Conduit__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Conduit__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__10"


    // $ANTLR start "rule__Conduit__Group__10__Impl"
    // InternalMiec.g:2802:1: rule__Conduit__Group__10__Impl : ( ';' ) ;
    public final void rule__Conduit__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2806:1: ( ( ';' ) )
            // InternalMiec.g:2807:1: ( ';' )
            {
            // InternalMiec.g:2807:1: ( ';' )
            // InternalMiec.g:2808:2: ';'
            {
             before(grammarAccess.getConduitAccess().getSemicolonKeyword_10()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__10__Impl"


    // $ANTLR start "rule__Conduit__Group__11"
    // InternalMiec.g:2817:1: rule__Conduit__Group__11 : rule__Conduit__Group__11__Impl rule__Conduit__Group__12 ;
    public final void rule__Conduit__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2821:1: ( rule__Conduit__Group__11__Impl rule__Conduit__Group__12 )
            // InternalMiec.g:2822:2: rule__Conduit__Group__11__Impl rule__Conduit__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Conduit__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__11"


    // $ANTLR start "rule__Conduit__Group__11__Impl"
    // InternalMiec.g:2829:1: rule__Conduit__Group__11__Impl : ( 'target' ) ;
    public final void rule__Conduit__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2833:1: ( ( 'target' ) )
            // InternalMiec.g:2834:1: ( 'target' )
            {
            // InternalMiec.g:2834:1: ( 'target' )
            // InternalMiec.g:2835:2: 'target'
            {
             before(grammarAccess.getConduitAccess().getTargetKeyword_11()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getTargetKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__11__Impl"


    // $ANTLR start "rule__Conduit__Group__12"
    // InternalMiec.g:2844:1: rule__Conduit__Group__12 : rule__Conduit__Group__12__Impl rule__Conduit__Group__13 ;
    public final void rule__Conduit__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2848:1: ( rule__Conduit__Group__12__Impl rule__Conduit__Group__13 )
            // InternalMiec.g:2849:2: rule__Conduit__Group__12__Impl rule__Conduit__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__Conduit__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__12"


    // $ANTLR start "rule__Conduit__Group__12__Impl"
    // InternalMiec.g:2856:1: rule__Conduit__Group__12__Impl : ( ( rule__Conduit__TargetAssignment_12 ) ) ;
    public final void rule__Conduit__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2860:1: ( ( ( rule__Conduit__TargetAssignment_12 ) ) )
            // InternalMiec.g:2861:1: ( ( rule__Conduit__TargetAssignment_12 ) )
            {
            // InternalMiec.g:2861:1: ( ( rule__Conduit__TargetAssignment_12 ) )
            // InternalMiec.g:2862:2: ( rule__Conduit__TargetAssignment_12 )
            {
             before(grammarAccess.getConduitAccess().getTargetAssignment_12()); 
            // InternalMiec.g:2863:2: ( rule__Conduit__TargetAssignment_12 )
            // InternalMiec.g:2863:3: rule__Conduit__TargetAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__TargetAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getConduitAccess().getTargetAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__12__Impl"


    // $ANTLR start "rule__Conduit__Group__13"
    // InternalMiec.g:2871:1: rule__Conduit__Group__13 : rule__Conduit__Group__13__Impl rule__Conduit__Group__14 ;
    public final void rule__Conduit__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2875:1: ( rule__Conduit__Group__13__Impl rule__Conduit__Group__14 )
            // InternalMiec.g:2876:2: rule__Conduit__Group__13__Impl rule__Conduit__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__Conduit__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__13"


    // $ANTLR start "rule__Conduit__Group__13__Impl"
    // InternalMiec.g:2883:1: rule__Conduit__Group__13__Impl : ( ( rule__Conduit__Group_13__0 )? ) ;
    public final void rule__Conduit__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2887:1: ( ( ( rule__Conduit__Group_13__0 )? ) )
            // InternalMiec.g:2888:1: ( ( rule__Conduit__Group_13__0 )? )
            {
            // InternalMiec.g:2888:1: ( ( rule__Conduit__Group_13__0 )? )
            // InternalMiec.g:2889:2: ( rule__Conduit__Group_13__0 )?
            {
             before(grammarAccess.getConduitAccess().getGroup_13()); 
            // InternalMiec.g:2890:2: ( rule__Conduit__Group_13__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==31) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalMiec.g:2890:3: rule__Conduit__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conduit__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConduitAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__13__Impl"


    // $ANTLR start "rule__Conduit__Group__14"
    // InternalMiec.g:2898:1: rule__Conduit__Group__14 : rule__Conduit__Group__14__Impl rule__Conduit__Group__15 ;
    public final void rule__Conduit__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2902:1: ( rule__Conduit__Group__14__Impl rule__Conduit__Group__15 )
            // InternalMiec.g:2903:2: rule__Conduit__Group__14__Impl rule__Conduit__Group__15
            {
            pushFollow(FOLLOW_10);
            rule__Conduit__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__14"


    // $ANTLR start "rule__Conduit__Group__14__Impl"
    // InternalMiec.g:2910:1: rule__Conduit__Group__14__Impl : ( ( rule__Conduit__Group_14__0 )? ) ;
    public final void rule__Conduit__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2914:1: ( ( ( rule__Conduit__Group_14__0 )? ) )
            // InternalMiec.g:2915:1: ( ( rule__Conduit__Group_14__0 )? )
            {
            // InternalMiec.g:2915:1: ( ( rule__Conduit__Group_14__0 )? )
            // InternalMiec.g:2916:2: ( rule__Conduit__Group_14__0 )?
            {
             before(grammarAccess.getConduitAccess().getGroup_14()); 
            // InternalMiec.g:2917:2: ( rule__Conduit__Group_14__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==33) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalMiec.g:2917:3: rule__Conduit__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conduit__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConduitAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__14__Impl"


    // $ANTLR start "rule__Conduit__Group__15"
    // InternalMiec.g:2925:1: rule__Conduit__Group__15 : rule__Conduit__Group__15__Impl rule__Conduit__Group__16 ;
    public final void rule__Conduit__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2929:1: ( rule__Conduit__Group__15__Impl rule__Conduit__Group__16 )
            // InternalMiec.g:2930:2: rule__Conduit__Group__15__Impl rule__Conduit__Group__16
            {
            pushFollow(FOLLOW_10);
            rule__Conduit__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__15"


    // $ANTLR start "rule__Conduit__Group__15__Impl"
    // InternalMiec.g:2937:1: rule__Conduit__Group__15__Impl : ( ( rule__Conduit__Group_15__0 )? ) ;
    public final void rule__Conduit__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2941:1: ( ( ( rule__Conduit__Group_15__0 )? ) )
            // InternalMiec.g:2942:1: ( ( rule__Conduit__Group_15__0 )? )
            {
            // InternalMiec.g:2942:1: ( ( rule__Conduit__Group_15__0 )? )
            // InternalMiec.g:2943:2: ( rule__Conduit__Group_15__0 )?
            {
             before(grammarAccess.getConduitAccess().getGroup_15()); 
            // InternalMiec.g:2944:2: ( rule__Conduit__Group_15__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMiec.g:2944:3: rule__Conduit__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conduit__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConduitAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__15__Impl"


    // $ANTLR start "rule__Conduit__Group__16"
    // InternalMiec.g:2952:1: rule__Conduit__Group__16 : rule__Conduit__Group__16__Impl ;
    public final void rule__Conduit__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2956:1: ( rule__Conduit__Group__16__Impl )
            // InternalMiec.g:2957:2: rule__Conduit__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__16"


    // $ANTLR start "rule__Conduit__Group__16__Impl"
    // InternalMiec.g:2963:1: rule__Conduit__Group__16__Impl : ( '}' ) ;
    public final void rule__Conduit__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2967:1: ( ( '}' ) )
            // InternalMiec.g:2968:1: ( '}' )
            {
            // InternalMiec.g:2968:1: ( '}' )
            // InternalMiec.g:2969:2: '}'
            {
             before(grammarAccess.getConduitAccess().getRightCurlyBracketKeyword_16()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group__16__Impl"


    // $ANTLR start "rule__Conduit__Group_8__0"
    // InternalMiec.g:2979:1: rule__Conduit__Group_8__0 : rule__Conduit__Group_8__0__Impl rule__Conduit__Group_8__1 ;
    public final void rule__Conduit__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2983:1: ( rule__Conduit__Group_8__0__Impl rule__Conduit__Group_8__1 )
            // InternalMiec.g:2984:2: rule__Conduit__Group_8__0__Impl rule__Conduit__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__Conduit__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_8__0"


    // $ANTLR start "rule__Conduit__Group_8__0__Impl"
    // InternalMiec.g:2991:1: rule__Conduit__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Conduit__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:2995:1: ( ( ',' ) )
            // InternalMiec.g:2996:1: ( ',' )
            {
            // InternalMiec.g:2996:1: ( ',' )
            // InternalMiec.g:2997:2: ','
            {
             before(grammarAccess.getConduitAccess().getCommaKeyword_8_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_8__0__Impl"


    // $ANTLR start "rule__Conduit__Group_8__1"
    // InternalMiec.g:3006:1: rule__Conduit__Group_8__1 : rule__Conduit__Group_8__1__Impl ;
    public final void rule__Conduit__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3010:1: ( rule__Conduit__Group_8__1__Impl )
            // InternalMiec.g:3011:2: rule__Conduit__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_8__1"


    // $ANTLR start "rule__Conduit__Group_8__1__Impl"
    // InternalMiec.g:3017:1: rule__Conduit__Group_8__1__Impl : ( ( rule__Conduit__ConnectsAssignment_8_1 ) ) ;
    public final void rule__Conduit__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3021:1: ( ( ( rule__Conduit__ConnectsAssignment_8_1 ) ) )
            // InternalMiec.g:3022:1: ( ( rule__Conduit__ConnectsAssignment_8_1 ) )
            {
            // InternalMiec.g:3022:1: ( ( rule__Conduit__ConnectsAssignment_8_1 ) )
            // InternalMiec.g:3023:2: ( rule__Conduit__ConnectsAssignment_8_1 )
            {
             before(grammarAccess.getConduitAccess().getConnectsAssignment_8_1()); 
            // InternalMiec.g:3024:2: ( rule__Conduit__ConnectsAssignment_8_1 )
            // InternalMiec.g:3024:3: rule__Conduit__ConnectsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__ConnectsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getConduitAccess().getConnectsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_8__1__Impl"


    // $ANTLR start "rule__Conduit__Group_13__0"
    // InternalMiec.g:3033:1: rule__Conduit__Group_13__0 : rule__Conduit__Group_13__0__Impl rule__Conduit__Group_13__1 ;
    public final void rule__Conduit__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3037:1: ( rule__Conduit__Group_13__0__Impl rule__Conduit__Group_13__1 )
            // InternalMiec.g:3038:2: rule__Conduit__Group_13__0__Impl rule__Conduit__Group_13__1
            {
            pushFollow(FOLLOW_11);
            rule__Conduit__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13__0"


    // $ANTLR start "rule__Conduit__Group_13__0__Impl"
    // InternalMiec.g:3045:1: rule__Conduit__Group_13__0__Impl : ( ';' ) ;
    public final void rule__Conduit__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3049:1: ( ( ';' ) )
            // InternalMiec.g:3050:1: ( ';' )
            {
            // InternalMiec.g:3050:1: ( ';' )
            // InternalMiec.g:3051:2: ';'
            {
             before(grammarAccess.getConduitAccess().getSemicolonKeyword_13_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getSemicolonKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13__0__Impl"


    // $ANTLR start "rule__Conduit__Group_13__1"
    // InternalMiec.g:3060:1: rule__Conduit__Group_13__1 : rule__Conduit__Group_13__1__Impl rule__Conduit__Group_13__2 ;
    public final void rule__Conduit__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3064:1: ( rule__Conduit__Group_13__1__Impl rule__Conduit__Group_13__2 )
            // InternalMiec.g:3065:2: rule__Conduit__Group_13__1__Impl rule__Conduit__Group_13__2
            {
            pushFollow(FOLLOW_7);
            rule__Conduit__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13__1"


    // $ANTLR start "rule__Conduit__Group_13__1__Impl"
    // InternalMiec.g:3072:1: rule__Conduit__Group_13__1__Impl : ( 'components' ) ;
    public final void rule__Conduit__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3076:1: ( ( 'components' ) )
            // InternalMiec.g:3077:1: ( 'components' )
            {
            // InternalMiec.g:3077:1: ( 'components' )
            // InternalMiec.g:3078:2: 'components'
            {
             before(grammarAccess.getConduitAccess().getComponentsKeyword_13_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getComponentsKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13__1__Impl"


    // $ANTLR start "rule__Conduit__Group_13__2"
    // InternalMiec.g:3087:1: rule__Conduit__Group_13__2 : rule__Conduit__Group_13__2__Impl rule__Conduit__Group_13__3 ;
    public final void rule__Conduit__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3091:1: ( rule__Conduit__Group_13__2__Impl rule__Conduit__Group_13__3 )
            // InternalMiec.g:3092:2: rule__Conduit__Group_13__2__Impl rule__Conduit__Group_13__3
            {
            pushFollow(FOLLOW_12);
            rule__Conduit__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13__2"


    // $ANTLR start "rule__Conduit__Group_13__2__Impl"
    // InternalMiec.g:3099:1: rule__Conduit__Group_13__2__Impl : ( '{' ) ;
    public final void rule__Conduit__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3103:1: ( ( '{' ) )
            // InternalMiec.g:3104:1: ( '{' )
            {
            // InternalMiec.g:3104:1: ( '{' )
            // InternalMiec.g:3105:2: '{'
            {
             before(grammarAccess.getConduitAccess().getLeftCurlyBracketKeyword_13_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getLeftCurlyBracketKeyword_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13__2__Impl"


    // $ANTLR start "rule__Conduit__Group_13__3"
    // InternalMiec.g:3114:1: rule__Conduit__Group_13__3 : rule__Conduit__Group_13__3__Impl rule__Conduit__Group_13__4 ;
    public final void rule__Conduit__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3118:1: ( rule__Conduit__Group_13__3__Impl rule__Conduit__Group_13__4 )
            // InternalMiec.g:3119:2: rule__Conduit__Group_13__3__Impl rule__Conduit__Group_13__4
            {
            pushFollow(FOLLOW_13);
            rule__Conduit__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13__3"


    // $ANTLR start "rule__Conduit__Group_13__3__Impl"
    // InternalMiec.g:3126:1: rule__Conduit__Group_13__3__Impl : ( ( rule__Conduit__ComponentsAssignment_13_3 ) ) ;
    public final void rule__Conduit__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3130:1: ( ( ( rule__Conduit__ComponentsAssignment_13_3 ) ) )
            // InternalMiec.g:3131:1: ( ( rule__Conduit__ComponentsAssignment_13_3 ) )
            {
            // InternalMiec.g:3131:1: ( ( rule__Conduit__ComponentsAssignment_13_3 ) )
            // InternalMiec.g:3132:2: ( rule__Conduit__ComponentsAssignment_13_3 )
            {
             before(grammarAccess.getConduitAccess().getComponentsAssignment_13_3()); 
            // InternalMiec.g:3133:2: ( rule__Conduit__ComponentsAssignment_13_3 )
            // InternalMiec.g:3133:3: rule__Conduit__ComponentsAssignment_13_3
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__ComponentsAssignment_13_3();

            state._fsp--;


            }

             after(grammarAccess.getConduitAccess().getComponentsAssignment_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13__3__Impl"


    // $ANTLR start "rule__Conduit__Group_13__4"
    // InternalMiec.g:3141:1: rule__Conduit__Group_13__4 : rule__Conduit__Group_13__4__Impl rule__Conduit__Group_13__5 ;
    public final void rule__Conduit__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3145:1: ( rule__Conduit__Group_13__4__Impl rule__Conduit__Group_13__5 )
            // InternalMiec.g:3146:2: rule__Conduit__Group_13__4__Impl rule__Conduit__Group_13__5
            {
            pushFollow(FOLLOW_13);
            rule__Conduit__Group_13__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_13__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13__4"


    // $ANTLR start "rule__Conduit__Group_13__4__Impl"
    // InternalMiec.g:3153:1: rule__Conduit__Group_13__4__Impl : ( ( rule__Conduit__Group_13_4__0 )* ) ;
    public final void rule__Conduit__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3157:1: ( ( ( rule__Conduit__Group_13_4__0 )* ) )
            // InternalMiec.g:3158:1: ( ( rule__Conduit__Group_13_4__0 )* )
            {
            // InternalMiec.g:3158:1: ( ( rule__Conduit__Group_13_4__0 )* )
            // InternalMiec.g:3159:2: ( rule__Conduit__Group_13_4__0 )*
            {
             before(grammarAccess.getConduitAccess().getGroup_13_4()); 
            // InternalMiec.g:3160:2: ( rule__Conduit__Group_13_4__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==32) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMiec.g:3160:3: rule__Conduit__Group_13_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Conduit__Group_13_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getConduitAccess().getGroup_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13__4__Impl"


    // $ANTLR start "rule__Conduit__Group_13__5"
    // InternalMiec.g:3168:1: rule__Conduit__Group_13__5 : rule__Conduit__Group_13__5__Impl ;
    public final void rule__Conduit__Group_13__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3172:1: ( rule__Conduit__Group_13__5__Impl )
            // InternalMiec.g:3173:2: rule__Conduit__Group_13__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__Group_13__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13__5"


    // $ANTLR start "rule__Conduit__Group_13__5__Impl"
    // InternalMiec.g:3179:1: rule__Conduit__Group_13__5__Impl : ( '}' ) ;
    public final void rule__Conduit__Group_13__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3183:1: ( ( '}' ) )
            // InternalMiec.g:3184:1: ( '}' )
            {
            // InternalMiec.g:3184:1: ( '}' )
            // InternalMiec.g:3185:2: '}'
            {
             before(grammarAccess.getConduitAccess().getRightCurlyBracketKeyword_13_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getRightCurlyBracketKeyword_13_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13__5__Impl"


    // $ANTLR start "rule__Conduit__Group_13_4__0"
    // InternalMiec.g:3195:1: rule__Conduit__Group_13_4__0 : rule__Conduit__Group_13_4__0__Impl rule__Conduit__Group_13_4__1 ;
    public final void rule__Conduit__Group_13_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3199:1: ( rule__Conduit__Group_13_4__0__Impl rule__Conduit__Group_13_4__1 )
            // InternalMiec.g:3200:2: rule__Conduit__Group_13_4__0__Impl rule__Conduit__Group_13_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Conduit__Group_13_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_13_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13_4__0"


    // $ANTLR start "rule__Conduit__Group_13_4__0__Impl"
    // InternalMiec.g:3207:1: rule__Conduit__Group_13_4__0__Impl : ( ',' ) ;
    public final void rule__Conduit__Group_13_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3211:1: ( ( ',' ) )
            // InternalMiec.g:3212:1: ( ',' )
            {
            // InternalMiec.g:3212:1: ( ',' )
            // InternalMiec.g:3213:2: ','
            {
             before(grammarAccess.getConduitAccess().getCommaKeyword_13_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getCommaKeyword_13_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13_4__0__Impl"


    // $ANTLR start "rule__Conduit__Group_13_4__1"
    // InternalMiec.g:3222:1: rule__Conduit__Group_13_4__1 : rule__Conduit__Group_13_4__1__Impl ;
    public final void rule__Conduit__Group_13_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3226:1: ( rule__Conduit__Group_13_4__1__Impl )
            // InternalMiec.g:3227:2: rule__Conduit__Group_13_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__Group_13_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13_4__1"


    // $ANTLR start "rule__Conduit__Group_13_4__1__Impl"
    // InternalMiec.g:3233:1: rule__Conduit__Group_13_4__1__Impl : ( ( rule__Conduit__ComponentsAssignment_13_4_1 ) ) ;
    public final void rule__Conduit__Group_13_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3237:1: ( ( ( rule__Conduit__ComponentsAssignment_13_4_1 ) ) )
            // InternalMiec.g:3238:1: ( ( rule__Conduit__ComponentsAssignment_13_4_1 ) )
            {
            // InternalMiec.g:3238:1: ( ( rule__Conduit__ComponentsAssignment_13_4_1 ) )
            // InternalMiec.g:3239:2: ( rule__Conduit__ComponentsAssignment_13_4_1 )
            {
             before(grammarAccess.getConduitAccess().getComponentsAssignment_13_4_1()); 
            // InternalMiec.g:3240:2: ( rule__Conduit__ComponentsAssignment_13_4_1 )
            // InternalMiec.g:3240:3: rule__Conduit__ComponentsAssignment_13_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__ComponentsAssignment_13_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConduitAccess().getComponentsAssignment_13_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_13_4__1__Impl"


    // $ANTLR start "rule__Conduit__Group_14__0"
    // InternalMiec.g:3249:1: rule__Conduit__Group_14__0 : rule__Conduit__Group_14__0__Impl rule__Conduit__Group_14__1 ;
    public final void rule__Conduit__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3253:1: ( rule__Conduit__Group_14__0__Impl rule__Conduit__Group_14__1 )
            // InternalMiec.g:3254:2: rule__Conduit__Group_14__0__Impl rule__Conduit__Group_14__1
            {
            pushFollow(FOLLOW_15);
            rule__Conduit__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14__0"


    // $ANTLR start "rule__Conduit__Group_14__0__Impl"
    // InternalMiec.g:3261:1: rule__Conduit__Group_14__0__Impl : ( ';' ) ;
    public final void rule__Conduit__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3265:1: ( ( ';' ) )
            // InternalMiec.g:3266:1: ( ';' )
            {
            // InternalMiec.g:3266:1: ( ';' )
            // InternalMiec.g:3267:2: ';'
            {
             before(grammarAccess.getConduitAccess().getSemicolonKeyword_14_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getSemicolonKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14__0__Impl"


    // $ANTLR start "rule__Conduit__Group_14__1"
    // InternalMiec.g:3276:1: rule__Conduit__Group_14__1 : rule__Conduit__Group_14__1__Impl rule__Conduit__Group_14__2 ;
    public final void rule__Conduit__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3280:1: ( rule__Conduit__Group_14__1__Impl rule__Conduit__Group_14__2 )
            // InternalMiec.g:3281:2: rule__Conduit__Group_14__1__Impl rule__Conduit__Group_14__2
            {
            pushFollow(FOLLOW_7);
            rule__Conduit__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14__1"


    // $ANTLR start "rule__Conduit__Group_14__1__Impl"
    // InternalMiec.g:3288:1: rule__Conduit__Group_14__1__Impl : ( 'countermeasures' ) ;
    public final void rule__Conduit__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3292:1: ( ( 'countermeasures' ) )
            // InternalMiec.g:3293:1: ( 'countermeasures' )
            {
            // InternalMiec.g:3293:1: ( 'countermeasures' )
            // InternalMiec.g:3294:2: 'countermeasures'
            {
             before(grammarAccess.getConduitAccess().getCountermeasuresKeyword_14_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getCountermeasuresKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14__1__Impl"


    // $ANTLR start "rule__Conduit__Group_14__2"
    // InternalMiec.g:3303:1: rule__Conduit__Group_14__2 : rule__Conduit__Group_14__2__Impl rule__Conduit__Group_14__3 ;
    public final void rule__Conduit__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3307:1: ( rule__Conduit__Group_14__2__Impl rule__Conduit__Group_14__3 )
            // InternalMiec.g:3308:2: rule__Conduit__Group_14__2__Impl rule__Conduit__Group_14__3
            {
            pushFollow(FOLLOW_12);
            rule__Conduit__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14__2"


    // $ANTLR start "rule__Conduit__Group_14__2__Impl"
    // InternalMiec.g:3315:1: rule__Conduit__Group_14__2__Impl : ( '{' ) ;
    public final void rule__Conduit__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3319:1: ( ( '{' ) )
            // InternalMiec.g:3320:1: ( '{' )
            {
            // InternalMiec.g:3320:1: ( '{' )
            // InternalMiec.g:3321:2: '{'
            {
             before(grammarAccess.getConduitAccess().getLeftCurlyBracketKeyword_14_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getLeftCurlyBracketKeyword_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14__2__Impl"


    // $ANTLR start "rule__Conduit__Group_14__3"
    // InternalMiec.g:3330:1: rule__Conduit__Group_14__3 : rule__Conduit__Group_14__3__Impl rule__Conduit__Group_14__4 ;
    public final void rule__Conduit__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3334:1: ( rule__Conduit__Group_14__3__Impl rule__Conduit__Group_14__4 )
            // InternalMiec.g:3335:2: rule__Conduit__Group_14__3__Impl rule__Conduit__Group_14__4
            {
            pushFollow(FOLLOW_13);
            rule__Conduit__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14__3"


    // $ANTLR start "rule__Conduit__Group_14__3__Impl"
    // InternalMiec.g:3342:1: rule__Conduit__Group_14__3__Impl : ( ( rule__Conduit__CountermeasuresAssignment_14_3 ) ) ;
    public final void rule__Conduit__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3346:1: ( ( ( rule__Conduit__CountermeasuresAssignment_14_3 ) ) )
            // InternalMiec.g:3347:1: ( ( rule__Conduit__CountermeasuresAssignment_14_3 ) )
            {
            // InternalMiec.g:3347:1: ( ( rule__Conduit__CountermeasuresAssignment_14_3 ) )
            // InternalMiec.g:3348:2: ( rule__Conduit__CountermeasuresAssignment_14_3 )
            {
             before(grammarAccess.getConduitAccess().getCountermeasuresAssignment_14_3()); 
            // InternalMiec.g:3349:2: ( rule__Conduit__CountermeasuresAssignment_14_3 )
            // InternalMiec.g:3349:3: rule__Conduit__CountermeasuresAssignment_14_3
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__CountermeasuresAssignment_14_3();

            state._fsp--;


            }

             after(grammarAccess.getConduitAccess().getCountermeasuresAssignment_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14__3__Impl"


    // $ANTLR start "rule__Conduit__Group_14__4"
    // InternalMiec.g:3357:1: rule__Conduit__Group_14__4 : rule__Conduit__Group_14__4__Impl rule__Conduit__Group_14__5 ;
    public final void rule__Conduit__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3361:1: ( rule__Conduit__Group_14__4__Impl rule__Conduit__Group_14__5 )
            // InternalMiec.g:3362:2: rule__Conduit__Group_14__4__Impl rule__Conduit__Group_14__5
            {
            pushFollow(FOLLOW_13);
            rule__Conduit__Group_14__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_14__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14__4"


    // $ANTLR start "rule__Conduit__Group_14__4__Impl"
    // InternalMiec.g:3369:1: rule__Conduit__Group_14__4__Impl : ( ( rule__Conduit__Group_14_4__0 )* ) ;
    public final void rule__Conduit__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3373:1: ( ( ( rule__Conduit__Group_14_4__0 )* ) )
            // InternalMiec.g:3374:1: ( ( rule__Conduit__Group_14_4__0 )* )
            {
            // InternalMiec.g:3374:1: ( ( rule__Conduit__Group_14_4__0 )* )
            // InternalMiec.g:3375:2: ( rule__Conduit__Group_14_4__0 )*
            {
             before(grammarAccess.getConduitAccess().getGroup_14_4()); 
            // InternalMiec.g:3376:2: ( rule__Conduit__Group_14_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==32) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMiec.g:3376:3: rule__Conduit__Group_14_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Conduit__Group_14_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getConduitAccess().getGroup_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14__4__Impl"


    // $ANTLR start "rule__Conduit__Group_14__5"
    // InternalMiec.g:3384:1: rule__Conduit__Group_14__5 : rule__Conduit__Group_14__5__Impl ;
    public final void rule__Conduit__Group_14__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3388:1: ( rule__Conduit__Group_14__5__Impl )
            // InternalMiec.g:3389:2: rule__Conduit__Group_14__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__Group_14__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14__5"


    // $ANTLR start "rule__Conduit__Group_14__5__Impl"
    // InternalMiec.g:3395:1: rule__Conduit__Group_14__5__Impl : ( '}' ) ;
    public final void rule__Conduit__Group_14__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3399:1: ( ( '}' ) )
            // InternalMiec.g:3400:1: ( '}' )
            {
            // InternalMiec.g:3400:1: ( '}' )
            // InternalMiec.g:3401:2: '}'
            {
             before(grammarAccess.getConduitAccess().getRightCurlyBracketKeyword_14_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getRightCurlyBracketKeyword_14_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14__5__Impl"


    // $ANTLR start "rule__Conduit__Group_14_4__0"
    // InternalMiec.g:3411:1: rule__Conduit__Group_14_4__0 : rule__Conduit__Group_14_4__0__Impl rule__Conduit__Group_14_4__1 ;
    public final void rule__Conduit__Group_14_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3415:1: ( rule__Conduit__Group_14_4__0__Impl rule__Conduit__Group_14_4__1 )
            // InternalMiec.g:3416:2: rule__Conduit__Group_14_4__0__Impl rule__Conduit__Group_14_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Conduit__Group_14_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_14_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14_4__0"


    // $ANTLR start "rule__Conduit__Group_14_4__0__Impl"
    // InternalMiec.g:3423:1: rule__Conduit__Group_14_4__0__Impl : ( ',' ) ;
    public final void rule__Conduit__Group_14_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3427:1: ( ( ',' ) )
            // InternalMiec.g:3428:1: ( ',' )
            {
            // InternalMiec.g:3428:1: ( ',' )
            // InternalMiec.g:3429:2: ','
            {
             before(grammarAccess.getConduitAccess().getCommaKeyword_14_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getCommaKeyword_14_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14_4__0__Impl"


    // $ANTLR start "rule__Conduit__Group_14_4__1"
    // InternalMiec.g:3438:1: rule__Conduit__Group_14_4__1 : rule__Conduit__Group_14_4__1__Impl ;
    public final void rule__Conduit__Group_14_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3442:1: ( rule__Conduit__Group_14_4__1__Impl )
            // InternalMiec.g:3443:2: rule__Conduit__Group_14_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__Group_14_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14_4__1"


    // $ANTLR start "rule__Conduit__Group_14_4__1__Impl"
    // InternalMiec.g:3449:1: rule__Conduit__Group_14_4__1__Impl : ( ( rule__Conduit__CountermeasuresAssignment_14_4_1 ) ) ;
    public final void rule__Conduit__Group_14_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3453:1: ( ( ( rule__Conduit__CountermeasuresAssignment_14_4_1 ) ) )
            // InternalMiec.g:3454:1: ( ( rule__Conduit__CountermeasuresAssignment_14_4_1 ) )
            {
            // InternalMiec.g:3454:1: ( ( rule__Conduit__CountermeasuresAssignment_14_4_1 ) )
            // InternalMiec.g:3455:2: ( rule__Conduit__CountermeasuresAssignment_14_4_1 )
            {
             before(grammarAccess.getConduitAccess().getCountermeasuresAssignment_14_4_1()); 
            // InternalMiec.g:3456:2: ( rule__Conduit__CountermeasuresAssignment_14_4_1 )
            // InternalMiec.g:3456:3: rule__Conduit__CountermeasuresAssignment_14_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__CountermeasuresAssignment_14_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConduitAccess().getCountermeasuresAssignment_14_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_14_4__1__Impl"


    // $ANTLR start "rule__Conduit__Group_15__0"
    // InternalMiec.g:3465:1: rule__Conduit__Group_15__0 : rule__Conduit__Group_15__0__Impl rule__Conduit__Group_15__1 ;
    public final void rule__Conduit__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3469:1: ( rule__Conduit__Group_15__0__Impl rule__Conduit__Group_15__1 )
            // InternalMiec.g:3470:2: rule__Conduit__Group_15__0__Impl rule__Conduit__Group_15__1
            {
            pushFollow(FOLLOW_26);
            rule__Conduit__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15__0"


    // $ANTLR start "rule__Conduit__Group_15__0__Impl"
    // InternalMiec.g:3477:1: rule__Conduit__Group_15__0__Impl : ( ';' ) ;
    public final void rule__Conduit__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3481:1: ( ( ';' ) )
            // InternalMiec.g:3482:1: ( ';' )
            {
            // InternalMiec.g:3482:1: ( ';' )
            // InternalMiec.g:3483:2: ';'
            {
             before(grammarAccess.getConduitAccess().getSemicolonKeyword_15_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getSemicolonKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15__0__Impl"


    // $ANTLR start "rule__Conduit__Group_15__1"
    // InternalMiec.g:3492:1: rule__Conduit__Group_15__1 : rule__Conduit__Group_15__1__Impl rule__Conduit__Group_15__2 ;
    public final void rule__Conduit__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3496:1: ( rule__Conduit__Group_15__1__Impl rule__Conduit__Group_15__2 )
            // InternalMiec.g:3497:2: rule__Conduit__Group_15__1__Impl rule__Conduit__Group_15__2
            {
            pushFollow(FOLLOW_7);
            rule__Conduit__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15__1"


    // $ANTLR start "rule__Conduit__Group_15__1__Impl"
    // InternalMiec.g:3504:1: rule__Conduit__Group_15__1__Impl : ( 'channels' ) ;
    public final void rule__Conduit__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3508:1: ( ( 'channels' ) )
            // InternalMiec.g:3509:1: ( 'channels' )
            {
            // InternalMiec.g:3509:1: ( 'channels' )
            // InternalMiec.g:3510:2: 'channels'
            {
             before(grammarAccess.getConduitAccess().getChannelsKeyword_15_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getChannelsKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15__1__Impl"


    // $ANTLR start "rule__Conduit__Group_15__2"
    // InternalMiec.g:3519:1: rule__Conduit__Group_15__2 : rule__Conduit__Group_15__2__Impl rule__Conduit__Group_15__3 ;
    public final void rule__Conduit__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3523:1: ( rule__Conduit__Group_15__2__Impl rule__Conduit__Group_15__3 )
            // InternalMiec.g:3524:2: rule__Conduit__Group_15__2__Impl rule__Conduit__Group_15__3
            {
            pushFollow(FOLLOW_12);
            rule__Conduit__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15__2"


    // $ANTLR start "rule__Conduit__Group_15__2__Impl"
    // InternalMiec.g:3531:1: rule__Conduit__Group_15__2__Impl : ( '{' ) ;
    public final void rule__Conduit__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3535:1: ( ( '{' ) )
            // InternalMiec.g:3536:1: ( '{' )
            {
            // InternalMiec.g:3536:1: ( '{' )
            // InternalMiec.g:3537:2: '{'
            {
             before(grammarAccess.getConduitAccess().getLeftCurlyBracketKeyword_15_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getLeftCurlyBracketKeyword_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15__2__Impl"


    // $ANTLR start "rule__Conduit__Group_15__3"
    // InternalMiec.g:3546:1: rule__Conduit__Group_15__3 : rule__Conduit__Group_15__3__Impl rule__Conduit__Group_15__4 ;
    public final void rule__Conduit__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3550:1: ( rule__Conduit__Group_15__3__Impl rule__Conduit__Group_15__4 )
            // InternalMiec.g:3551:2: rule__Conduit__Group_15__3__Impl rule__Conduit__Group_15__4
            {
            pushFollow(FOLLOW_13);
            rule__Conduit__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15__3"


    // $ANTLR start "rule__Conduit__Group_15__3__Impl"
    // InternalMiec.g:3558:1: rule__Conduit__Group_15__3__Impl : ( ( rule__Conduit__ChannelsAssignment_15_3 ) ) ;
    public final void rule__Conduit__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3562:1: ( ( ( rule__Conduit__ChannelsAssignment_15_3 ) ) )
            // InternalMiec.g:3563:1: ( ( rule__Conduit__ChannelsAssignment_15_3 ) )
            {
            // InternalMiec.g:3563:1: ( ( rule__Conduit__ChannelsAssignment_15_3 ) )
            // InternalMiec.g:3564:2: ( rule__Conduit__ChannelsAssignment_15_3 )
            {
             before(grammarAccess.getConduitAccess().getChannelsAssignment_15_3()); 
            // InternalMiec.g:3565:2: ( rule__Conduit__ChannelsAssignment_15_3 )
            // InternalMiec.g:3565:3: rule__Conduit__ChannelsAssignment_15_3
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__ChannelsAssignment_15_3();

            state._fsp--;


            }

             after(grammarAccess.getConduitAccess().getChannelsAssignment_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15__3__Impl"


    // $ANTLR start "rule__Conduit__Group_15__4"
    // InternalMiec.g:3573:1: rule__Conduit__Group_15__4 : rule__Conduit__Group_15__4__Impl rule__Conduit__Group_15__5 ;
    public final void rule__Conduit__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3577:1: ( rule__Conduit__Group_15__4__Impl rule__Conduit__Group_15__5 )
            // InternalMiec.g:3578:2: rule__Conduit__Group_15__4__Impl rule__Conduit__Group_15__5
            {
            pushFollow(FOLLOW_13);
            rule__Conduit__Group_15__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_15__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15__4"


    // $ANTLR start "rule__Conduit__Group_15__4__Impl"
    // InternalMiec.g:3585:1: rule__Conduit__Group_15__4__Impl : ( ( rule__Conduit__Group_15_4__0 )* ) ;
    public final void rule__Conduit__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3589:1: ( ( ( rule__Conduit__Group_15_4__0 )* ) )
            // InternalMiec.g:3590:1: ( ( rule__Conduit__Group_15_4__0 )* )
            {
            // InternalMiec.g:3590:1: ( ( rule__Conduit__Group_15_4__0 )* )
            // InternalMiec.g:3591:2: ( rule__Conduit__Group_15_4__0 )*
            {
             before(grammarAccess.getConduitAccess().getGroup_15_4()); 
            // InternalMiec.g:3592:2: ( rule__Conduit__Group_15_4__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==32) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMiec.g:3592:3: rule__Conduit__Group_15_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Conduit__Group_15_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getConduitAccess().getGroup_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15__4__Impl"


    // $ANTLR start "rule__Conduit__Group_15__5"
    // InternalMiec.g:3600:1: rule__Conduit__Group_15__5 : rule__Conduit__Group_15__5__Impl ;
    public final void rule__Conduit__Group_15__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3604:1: ( rule__Conduit__Group_15__5__Impl )
            // InternalMiec.g:3605:2: rule__Conduit__Group_15__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__Group_15__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15__5"


    // $ANTLR start "rule__Conduit__Group_15__5__Impl"
    // InternalMiec.g:3611:1: rule__Conduit__Group_15__5__Impl : ( '}' ) ;
    public final void rule__Conduit__Group_15__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3615:1: ( ( '}' ) )
            // InternalMiec.g:3616:1: ( '}' )
            {
            // InternalMiec.g:3616:1: ( '}' )
            // InternalMiec.g:3617:2: '}'
            {
             before(grammarAccess.getConduitAccess().getRightCurlyBracketKeyword_15_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getRightCurlyBracketKeyword_15_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15__5__Impl"


    // $ANTLR start "rule__Conduit__Group_15_4__0"
    // InternalMiec.g:3627:1: rule__Conduit__Group_15_4__0 : rule__Conduit__Group_15_4__0__Impl rule__Conduit__Group_15_4__1 ;
    public final void rule__Conduit__Group_15_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3631:1: ( rule__Conduit__Group_15_4__0__Impl rule__Conduit__Group_15_4__1 )
            // InternalMiec.g:3632:2: rule__Conduit__Group_15_4__0__Impl rule__Conduit__Group_15_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Conduit__Group_15_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conduit__Group_15_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15_4__0"


    // $ANTLR start "rule__Conduit__Group_15_4__0__Impl"
    // InternalMiec.g:3639:1: rule__Conduit__Group_15_4__0__Impl : ( ',' ) ;
    public final void rule__Conduit__Group_15_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3643:1: ( ( ',' ) )
            // InternalMiec.g:3644:1: ( ',' )
            {
            // InternalMiec.g:3644:1: ( ',' )
            // InternalMiec.g:3645:2: ','
            {
             before(grammarAccess.getConduitAccess().getCommaKeyword_15_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getCommaKeyword_15_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15_4__0__Impl"


    // $ANTLR start "rule__Conduit__Group_15_4__1"
    // InternalMiec.g:3654:1: rule__Conduit__Group_15_4__1 : rule__Conduit__Group_15_4__1__Impl ;
    public final void rule__Conduit__Group_15_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3658:1: ( rule__Conduit__Group_15_4__1__Impl )
            // InternalMiec.g:3659:2: rule__Conduit__Group_15_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__Group_15_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15_4__1"


    // $ANTLR start "rule__Conduit__Group_15_4__1__Impl"
    // InternalMiec.g:3665:1: rule__Conduit__Group_15_4__1__Impl : ( ( rule__Conduit__ChannelsAssignment_15_4_1 ) ) ;
    public final void rule__Conduit__Group_15_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3669:1: ( ( ( rule__Conduit__ChannelsAssignment_15_4_1 ) ) )
            // InternalMiec.g:3670:1: ( ( rule__Conduit__ChannelsAssignment_15_4_1 ) )
            {
            // InternalMiec.g:3670:1: ( ( rule__Conduit__ChannelsAssignment_15_4_1 ) )
            // InternalMiec.g:3671:2: ( rule__Conduit__ChannelsAssignment_15_4_1 )
            {
             before(grammarAccess.getConduitAccess().getChannelsAssignment_15_4_1()); 
            // InternalMiec.g:3672:2: ( rule__Conduit__ChannelsAssignment_15_4_1 )
            // InternalMiec.g:3672:3: rule__Conduit__ChannelsAssignment_15_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Conduit__ChannelsAssignment_15_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConduitAccess().getChannelsAssignment_15_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__Group_15_4__1__Impl"


    // $ANTLR start "rule__Device__Group__0"
    // InternalMiec.g:3681:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3685:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalMiec.g:3686:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0"


    // $ANTLR start "rule__Device__Group__0__Impl"
    // InternalMiec.g:3693:1: rule__Device__Group__0__Impl : ( '(' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3697:1: ( ( '(' ) )
            // InternalMiec.g:3698:1: ( '(' )
            {
            // InternalMiec.g:3698:1: ( '(' )
            // InternalMiec.g:3699:2: '('
            {
             before(grammarAccess.getDeviceAccess().getLeftParenthesisKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0__Impl"


    // $ANTLR start "rule__Device__Group__1"
    // InternalMiec.g:3708:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3712:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalMiec.g:3713:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Device__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1"


    // $ANTLR start "rule__Device__Group__1__Impl"
    // InternalMiec.g:3720:1: rule__Device__Group__1__Impl : ( ( rule__Device__Group_1__0 )? ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3724:1: ( ( ( rule__Device__Group_1__0 )? ) )
            // InternalMiec.g:3725:1: ( ( rule__Device__Group_1__0 )? )
            {
            // InternalMiec.g:3725:1: ( ( rule__Device__Group_1__0 )? )
            // InternalMiec.g:3726:2: ( rule__Device__Group_1__0 )?
            {
             before(grammarAccess.getDeviceAccess().getGroup_1()); 
            // InternalMiec.g:3727:2: ( rule__Device__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43||(LA29_0>=58 && LA29_0<=60)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMiec.g:3727:3: rule__Device__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__2"
    // InternalMiec.g:3735:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3739:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalMiec.g:3740:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Device__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2"


    // $ANTLR start "rule__Device__Group__2__Impl"
    // InternalMiec.g:3747:1: rule__Device__Group__2__Impl : ( ( rule__Device__NameAssignment_2 ) ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3751:1: ( ( ( rule__Device__NameAssignment_2 ) ) )
            // InternalMiec.g:3752:1: ( ( rule__Device__NameAssignment_2 ) )
            {
            // InternalMiec.g:3752:1: ( ( rule__Device__NameAssignment_2 ) )
            // InternalMiec.g:3753:2: ( rule__Device__NameAssignment_2 )
            {
             before(grammarAccess.getDeviceAccess().getNameAssignment_2()); 
            // InternalMiec.g:3754:2: ( rule__Device__NameAssignment_2 )
            // InternalMiec.g:3754:3: rule__Device__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Device__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2__Impl"


    // $ANTLR start "rule__Device__Group__3"
    // InternalMiec.g:3762:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3766:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalMiec.g:3767:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Device__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3"


    // $ANTLR start "rule__Device__Group__3__Impl"
    // InternalMiec.g:3774:1: rule__Device__Group__3__Impl : ( ';' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3778:1: ( ( ';' ) )
            // InternalMiec.g:3779:1: ( ';' )
            {
            // InternalMiec.g:3779:1: ( ';' )
            // InternalMiec.g:3780:2: ';'
            {
             before(grammarAccess.getDeviceAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3__Impl"


    // $ANTLR start "rule__Device__Group__4"
    // InternalMiec.g:3789:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3793:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalMiec.g:3794:2: rule__Device__Group__4__Impl rule__Device__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Device__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4"


    // $ANTLR start "rule__Device__Group__4__Impl"
    // InternalMiec.g:3801:1: rule__Device__Group__4__Impl : ( 'capability' ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3805:1: ( ( 'capability' ) )
            // InternalMiec.g:3806:1: ( 'capability' )
            {
            // InternalMiec.g:3806:1: ( 'capability' )
            // InternalMiec.g:3807:2: 'capability'
            {
             before(grammarAccess.getDeviceAccess().getCapabilityKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getCapabilityKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4__Impl"


    // $ANTLR start "rule__Device__Group__5"
    // InternalMiec.g:3816:1: rule__Device__Group__5 : rule__Device__Group__5__Impl rule__Device__Group__6 ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3820:1: ( rule__Device__Group__5__Impl rule__Device__Group__6 )
            // InternalMiec.g:3821:2: rule__Device__Group__5__Impl rule__Device__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Device__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5"


    // $ANTLR start "rule__Device__Group__5__Impl"
    // InternalMiec.g:3828:1: rule__Device__Group__5__Impl : ( ( rule__Device__CapabilityAssignment_5 ) ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3832:1: ( ( ( rule__Device__CapabilityAssignment_5 ) ) )
            // InternalMiec.g:3833:1: ( ( rule__Device__CapabilityAssignment_5 ) )
            {
            // InternalMiec.g:3833:1: ( ( rule__Device__CapabilityAssignment_5 ) )
            // InternalMiec.g:3834:2: ( rule__Device__CapabilityAssignment_5 )
            {
             before(grammarAccess.getDeviceAccess().getCapabilityAssignment_5()); 
            // InternalMiec.g:3835:2: ( rule__Device__CapabilityAssignment_5 )
            // InternalMiec.g:3835:3: rule__Device__CapabilityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Device__CapabilityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getCapabilityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5__Impl"


    // $ANTLR start "rule__Device__Group__6"
    // InternalMiec.g:3843:1: rule__Device__Group__6 : rule__Device__Group__6__Impl rule__Device__Group__7 ;
    public final void rule__Device__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3847:1: ( rule__Device__Group__6__Impl rule__Device__Group__7 )
            // InternalMiec.g:3848:2: rule__Device__Group__6__Impl rule__Device__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Device__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__6"


    // $ANTLR start "rule__Device__Group__6__Impl"
    // InternalMiec.g:3855:1: rule__Device__Group__6__Impl : ( ( rule__Device__Group_6__0 )? ) ;
    public final void rule__Device__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3859:1: ( ( ( rule__Device__Group_6__0 )? ) )
            // InternalMiec.g:3860:1: ( ( rule__Device__Group_6__0 )? )
            {
            // InternalMiec.g:3860:1: ( ( rule__Device__Group_6__0 )? )
            // InternalMiec.g:3861:2: ( rule__Device__Group_6__0 )?
            {
             before(grammarAccess.getDeviceAccess().getGroup_6()); 
            // InternalMiec.g:3862:2: ( rule__Device__Group_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMiec.g:3862:3: rule__Device__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__6__Impl"


    // $ANTLR start "rule__Device__Group__7"
    // InternalMiec.g:3870:1: rule__Device__Group__7 : rule__Device__Group__7__Impl ;
    public final void rule__Device__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3874:1: ( rule__Device__Group__7__Impl )
            // InternalMiec.g:3875:2: rule__Device__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__7"


    // $ANTLR start "rule__Device__Group__7__Impl"
    // InternalMiec.g:3881:1: rule__Device__Group__7__Impl : ( ')' ) ;
    public final void rule__Device__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3885:1: ( ( ')' ) )
            // InternalMiec.g:3886:1: ( ')' )
            {
            // InternalMiec.g:3886:1: ( ')' )
            // InternalMiec.g:3887:2: ')'
            {
             before(grammarAccess.getDeviceAccess().getRightParenthesisKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__7__Impl"


    // $ANTLR start "rule__Device__Group_1__0"
    // InternalMiec.g:3897:1: rule__Device__Group_1__0 : rule__Device__Group_1__0__Impl rule__Device__Group_1__1 ;
    public final void rule__Device__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3901:1: ( rule__Device__Group_1__0__Impl rule__Device__Group_1__1 )
            // InternalMiec.g:3902:2: rule__Device__Group_1__0__Impl rule__Device__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Device__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_1__0"


    // $ANTLR start "rule__Device__Group_1__0__Impl"
    // InternalMiec.g:3909:1: rule__Device__Group_1__0__Impl : ( ( rule__Device__NetworkAssignment_1_0 )? ) ;
    public final void rule__Device__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3913:1: ( ( ( rule__Device__NetworkAssignment_1_0 )? ) )
            // InternalMiec.g:3914:1: ( ( rule__Device__NetworkAssignment_1_0 )? )
            {
            // InternalMiec.g:3914:1: ( ( rule__Device__NetworkAssignment_1_0 )? )
            // InternalMiec.g:3915:2: ( rule__Device__NetworkAssignment_1_0 )?
            {
             before(grammarAccess.getDeviceAccess().getNetworkAssignment_1_0()); 
            // InternalMiec.g:3916:2: ( rule__Device__NetworkAssignment_1_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==58) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMiec.g:3916:3: rule__Device__NetworkAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__NetworkAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceAccess().getNetworkAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_1__0__Impl"


    // $ANTLR start "rule__Device__Group_1__1"
    // InternalMiec.g:3924:1: rule__Device__Group_1__1 : rule__Device__Group_1__1__Impl rule__Device__Group_1__2 ;
    public final void rule__Device__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3928:1: ( rule__Device__Group_1__1__Impl rule__Device__Group_1__2 )
            // InternalMiec.g:3929:2: rule__Device__Group_1__1__Impl rule__Device__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__Device__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_1__1"


    // $ANTLR start "rule__Device__Group_1__1__Impl"
    // InternalMiec.g:3936:1: rule__Device__Group_1__1__Impl : ( ( rule__Device__EmbeddedAssignment_1_1 )? ) ;
    public final void rule__Device__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3940:1: ( ( ( rule__Device__EmbeddedAssignment_1_1 )? ) )
            // InternalMiec.g:3941:1: ( ( rule__Device__EmbeddedAssignment_1_1 )? )
            {
            // InternalMiec.g:3941:1: ( ( rule__Device__EmbeddedAssignment_1_1 )? )
            // InternalMiec.g:3942:2: ( rule__Device__EmbeddedAssignment_1_1 )?
            {
             before(grammarAccess.getDeviceAccess().getEmbeddedAssignment_1_1()); 
            // InternalMiec.g:3943:2: ( rule__Device__EmbeddedAssignment_1_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==59) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMiec.g:3943:3: rule__Device__EmbeddedAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__EmbeddedAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceAccess().getEmbeddedAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_1__1__Impl"


    // $ANTLR start "rule__Device__Group_1__2"
    // InternalMiec.g:3951:1: rule__Device__Group_1__2 : rule__Device__Group_1__2__Impl rule__Device__Group_1__3 ;
    public final void rule__Device__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3955:1: ( rule__Device__Group_1__2__Impl rule__Device__Group_1__3 )
            // InternalMiec.g:3956:2: rule__Device__Group_1__2__Impl rule__Device__Group_1__3
            {
            pushFollow(FOLLOW_29);
            rule__Device__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_1__2"


    // $ANTLR start "rule__Device__Group_1__2__Impl"
    // InternalMiec.g:3963:1: rule__Device__Group_1__2__Impl : ( ( rule__Device__HostAssignment_1_2 )? ) ;
    public final void rule__Device__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3967:1: ( ( ( rule__Device__HostAssignment_1_2 )? ) )
            // InternalMiec.g:3968:1: ( ( rule__Device__HostAssignment_1_2 )? )
            {
            // InternalMiec.g:3968:1: ( ( rule__Device__HostAssignment_1_2 )? )
            // InternalMiec.g:3969:2: ( rule__Device__HostAssignment_1_2 )?
            {
             before(grammarAccess.getDeviceAccess().getHostAssignment_1_2()); 
            // InternalMiec.g:3970:2: ( rule__Device__HostAssignment_1_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==60) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMiec.g:3970:3: rule__Device__HostAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__HostAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceAccess().getHostAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_1__2__Impl"


    // $ANTLR start "rule__Device__Group_1__3"
    // InternalMiec.g:3978:1: rule__Device__Group_1__3 : rule__Device__Group_1__3__Impl ;
    public final void rule__Device__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3982:1: ( rule__Device__Group_1__3__Impl )
            // InternalMiec.g:3983:2: rule__Device__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_1__3"


    // $ANTLR start "rule__Device__Group_1__3__Impl"
    // InternalMiec.g:3989:1: rule__Device__Group_1__3__Impl : ( 'device' ) ;
    public final void rule__Device__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:3993:1: ( ( 'device' ) )
            // InternalMiec.g:3994:1: ( 'device' )
            {
            // InternalMiec.g:3994:1: ( 'device' )
            // InternalMiec.g:3995:2: 'device'
            {
             before(grammarAccess.getDeviceAccess().getDeviceKeyword_1_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDeviceKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_1__3__Impl"


    // $ANTLR start "rule__Device__Group_6__0"
    // InternalMiec.g:4005:1: rule__Device__Group_6__0 : rule__Device__Group_6__0__Impl rule__Device__Group_6__1 ;
    public final void rule__Device__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4009:1: ( rule__Device__Group_6__0__Impl rule__Device__Group_6__1 )
            // InternalMiec.g:4010:2: rule__Device__Group_6__0__Impl rule__Device__Group_6__1
            {
            pushFollow(FOLLOW_30);
            rule__Device__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__0"


    // $ANTLR start "rule__Device__Group_6__0__Impl"
    // InternalMiec.g:4017:1: rule__Device__Group_6__0__Impl : ( ';' ) ;
    public final void rule__Device__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4021:1: ( ( ';' ) )
            // InternalMiec.g:4022:1: ( ';' )
            {
            // InternalMiec.g:4022:1: ( ';' )
            // InternalMiec.g:4023:2: ';'
            {
             before(grammarAccess.getDeviceAccess().getSemicolonKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getSemicolonKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__0__Impl"


    // $ANTLR start "rule__Device__Group_6__1"
    // InternalMiec.g:4032:1: rule__Device__Group_6__1 : rule__Device__Group_6__1__Impl rule__Device__Group_6__2 ;
    public final void rule__Device__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4036:1: ( rule__Device__Group_6__1__Impl rule__Device__Group_6__2 )
            // InternalMiec.g:4037:2: rule__Device__Group_6__1__Impl rule__Device__Group_6__2
            {
            pushFollow(FOLLOW_7);
            rule__Device__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__1"


    // $ANTLR start "rule__Device__Group_6__1__Impl"
    // InternalMiec.g:4044:1: rule__Device__Group_6__1__Impl : ( 'properties' ) ;
    public final void rule__Device__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4048:1: ( ( 'properties' ) )
            // InternalMiec.g:4049:1: ( 'properties' )
            {
            // InternalMiec.g:4049:1: ( 'properties' )
            // InternalMiec.g:4050:2: 'properties'
            {
             before(grammarAccess.getDeviceAccess().getPropertiesKeyword_6_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getPropertiesKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__1__Impl"


    // $ANTLR start "rule__Device__Group_6__2"
    // InternalMiec.g:4059:1: rule__Device__Group_6__2 : rule__Device__Group_6__2__Impl rule__Device__Group_6__3 ;
    public final void rule__Device__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4063:1: ( rule__Device__Group_6__2__Impl rule__Device__Group_6__3 )
            // InternalMiec.g:4064:2: rule__Device__Group_6__2__Impl rule__Device__Group_6__3
            {
            pushFollow(FOLLOW_6);
            rule__Device__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__2"


    // $ANTLR start "rule__Device__Group_6__2__Impl"
    // InternalMiec.g:4071:1: rule__Device__Group_6__2__Impl : ( '{' ) ;
    public final void rule__Device__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4075:1: ( ( '{' ) )
            // InternalMiec.g:4076:1: ( '{' )
            {
            // InternalMiec.g:4076:1: ( '{' )
            // InternalMiec.g:4077:2: '{'
            {
             before(grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_6_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__2__Impl"


    // $ANTLR start "rule__Device__Group_6__3"
    // InternalMiec.g:4086:1: rule__Device__Group_6__3 : rule__Device__Group_6__3__Impl rule__Device__Group_6__4 ;
    public final void rule__Device__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4090:1: ( rule__Device__Group_6__3__Impl rule__Device__Group_6__4 )
            // InternalMiec.g:4091:2: rule__Device__Group_6__3__Impl rule__Device__Group_6__4
            {
            pushFollow(FOLLOW_13);
            rule__Device__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__3"


    // $ANTLR start "rule__Device__Group_6__3__Impl"
    // InternalMiec.g:4098:1: rule__Device__Group_6__3__Impl : ( ( rule__Device__PropertiesAssignment_6_3 ) ) ;
    public final void rule__Device__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4102:1: ( ( ( rule__Device__PropertiesAssignment_6_3 ) ) )
            // InternalMiec.g:4103:1: ( ( rule__Device__PropertiesAssignment_6_3 ) )
            {
            // InternalMiec.g:4103:1: ( ( rule__Device__PropertiesAssignment_6_3 ) )
            // InternalMiec.g:4104:2: ( rule__Device__PropertiesAssignment_6_3 )
            {
             before(grammarAccess.getDeviceAccess().getPropertiesAssignment_6_3()); 
            // InternalMiec.g:4105:2: ( rule__Device__PropertiesAssignment_6_3 )
            // InternalMiec.g:4105:3: rule__Device__PropertiesAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Device__PropertiesAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getPropertiesAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__3__Impl"


    // $ANTLR start "rule__Device__Group_6__4"
    // InternalMiec.g:4113:1: rule__Device__Group_6__4 : rule__Device__Group_6__4__Impl rule__Device__Group_6__5 ;
    public final void rule__Device__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4117:1: ( rule__Device__Group_6__4__Impl rule__Device__Group_6__5 )
            // InternalMiec.g:4118:2: rule__Device__Group_6__4__Impl rule__Device__Group_6__5
            {
            pushFollow(FOLLOW_13);
            rule__Device__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__4"


    // $ANTLR start "rule__Device__Group_6__4__Impl"
    // InternalMiec.g:4125:1: rule__Device__Group_6__4__Impl : ( ( rule__Device__Group_6_4__0 )* ) ;
    public final void rule__Device__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4129:1: ( ( ( rule__Device__Group_6_4__0 )* ) )
            // InternalMiec.g:4130:1: ( ( rule__Device__Group_6_4__0 )* )
            {
            // InternalMiec.g:4130:1: ( ( rule__Device__Group_6_4__0 )* )
            // InternalMiec.g:4131:2: ( rule__Device__Group_6_4__0 )*
            {
             before(grammarAccess.getDeviceAccess().getGroup_6_4()); 
            // InternalMiec.g:4132:2: ( rule__Device__Group_6_4__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==32) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMiec.g:4132:3: rule__Device__Group_6_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Device__Group_6_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getDeviceAccess().getGroup_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__4__Impl"


    // $ANTLR start "rule__Device__Group_6__5"
    // InternalMiec.g:4140:1: rule__Device__Group_6__5 : rule__Device__Group_6__5__Impl ;
    public final void rule__Device__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4144:1: ( rule__Device__Group_6__5__Impl )
            // InternalMiec.g:4145:2: rule__Device__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group_6__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__5"


    // $ANTLR start "rule__Device__Group_6__5__Impl"
    // InternalMiec.g:4151:1: rule__Device__Group_6__5__Impl : ( '}' ) ;
    public final void rule__Device__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4155:1: ( ( '}' ) )
            // InternalMiec.g:4156:1: ( '}' )
            {
            // InternalMiec.g:4156:1: ( '}' )
            // InternalMiec.g:4157:2: '}'
            {
             before(grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_6_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__5__Impl"


    // $ANTLR start "rule__Device__Group_6_4__0"
    // InternalMiec.g:4167:1: rule__Device__Group_6_4__0 : rule__Device__Group_6_4__0__Impl rule__Device__Group_6_4__1 ;
    public final void rule__Device__Group_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4171:1: ( rule__Device__Group_6_4__0__Impl rule__Device__Group_6_4__1 )
            // InternalMiec.g:4172:2: rule__Device__Group_6_4__0__Impl rule__Device__Group_6_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Device__Group_6_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_6_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6_4__0"


    // $ANTLR start "rule__Device__Group_6_4__0__Impl"
    // InternalMiec.g:4179:1: rule__Device__Group_6_4__0__Impl : ( ',' ) ;
    public final void rule__Device__Group_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4183:1: ( ( ',' ) )
            // InternalMiec.g:4184:1: ( ',' )
            {
            // InternalMiec.g:4184:1: ( ',' )
            // InternalMiec.g:4185:2: ','
            {
             before(grammarAccess.getDeviceAccess().getCommaKeyword_6_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getCommaKeyword_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6_4__0__Impl"


    // $ANTLR start "rule__Device__Group_6_4__1"
    // InternalMiec.g:4194:1: rule__Device__Group_6_4__1 : rule__Device__Group_6_4__1__Impl ;
    public final void rule__Device__Group_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4198:1: ( rule__Device__Group_6_4__1__Impl )
            // InternalMiec.g:4199:2: rule__Device__Group_6_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group_6_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6_4__1"


    // $ANTLR start "rule__Device__Group_6_4__1__Impl"
    // InternalMiec.g:4205:1: rule__Device__Group_6_4__1__Impl : ( ( rule__Device__PropertiesAssignment_6_4_1 ) ) ;
    public final void rule__Device__Group_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4209:1: ( ( ( rule__Device__PropertiesAssignment_6_4_1 ) ) )
            // InternalMiec.g:4210:1: ( ( rule__Device__PropertiesAssignment_6_4_1 ) )
            {
            // InternalMiec.g:4210:1: ( ( rule__Device__PropertiesAssignment_6_4_1 ) )
            // InternalMiec.g:4211:2: ( rule__Device__PropertiesAssignment_6_4_1 )
            {
             before(grammarAccess.getDeviceAccess().getPropertiesAssignment_6_4_1()); 
            // InternalMiec.g:4212:2: ( rule__Device__PropertiesAssignment_6_4_1 )
            // InternalMiec.g:4212:3: rule__Device__PropertiesAssignment_6_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__PropertiesAssignment_6_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getPropertiesAssignment_6_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6_4__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalMiec.g:4221:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4225:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalMiec.g:4226:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalMiec.g:4233:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4237:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalMiec.g:4238:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalMiec.g:4238:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalMiec.g:4239:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalMiec.g:4240:2: ( rule__Property__NameAssignment_0 )
            // InternalMiec.g:4240:3: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalMiec.g:4248:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4252:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalMiec.g:4253:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalMiec.g:4260:1: rule__Property__Group__1__Impl : ( '=' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4264:1: ( ( '=' ) )
            // InternalMiec.g:4265:1: ( '=' )
            {
            // InternalMiec.g:4265:1: ( '=' )
            // InternalMiec.g:4266:2: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalMiec.g:4275:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4279:1: ( rule__Property__Group__2__Impl )
            // InternalMiec.g:4280:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalMiec.g:4286:1: rule__Property__Group__2__Impl : ( ( rule__Property__ValueAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4290:1: ( ( ( rule__Property__ValueAssignment_2 ) ) )
            // InternalMiec.g:4291:1: ( ( rule__Property__ValueAssignment_2 ) )
            {
            // InternalMiec.g:4291:1: ( ( rule__Property__ValueAssignment_2 ) )
            // InternalMiec.g:4292:2: ( rule__Property__ValueAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_2()); 
            // InternalMiec.g:4293:2: ( rule__Property__ValueAssignment_2 )
            // InternalMiec.g:4293:3: rule__Property__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Property__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__System__Group__0"
    // InternalMiec.g:4302:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4306:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalMiec.g:4307:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalMiec.g:4314:1: rule__System__Group__0__Impl : ( '(' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4318:1: ( ( '(' ) )
            // InternalMiec.g:4319:1: ( '(' )
            {
            // InternalMiec.g:4319:1: ( '(' )
            // InternalMiec.g:4320:2: '('
            {
             before(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalMiec.g:4329:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4333:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalMiec.g:4334:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalMiec.g:4341:1: rule__System__Group__1__Impl : ( 'system' ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4345:1: ( ( 'system' ) )
            // InternalMiec.g:4346:1: ( 'system' )
            {
            // InternalMiec.g:4346:1: ( 'system' )
            // InternalMiec.g:4347:2: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalMiec.g:4356:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4360:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalMiec.g:4361:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalMiec.g:4368:1: rule__System__Group__2__Impl : ( ( rule__System__NameAssignment_2 ) ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4372:1: ( ( ( rule__System__NameAssignment_2 ) ) )
            // InternalMiec.g:4373:1: ( ( rule__System__NameAssignment_2 ) )
            {
            // InternalMiec.g:4373:1: ( ( rule__System__NameAssignment_2 ) )
            // InternalMiec.g:4374:2: ( rule__System__NameAssignment_2 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_2()); 
            // InternalMiec.g:4375:2: ( rule__System__NameAssignment_2 )
            // InternalMiec.g:4375:3: rule__System__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalMiec.g:4383:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4387:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalMiec.g:4388:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalMiec.g:4395:1: rule__System__Group__3__Impl : ( ';' ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4399:1: ( ( ';' ) )
            // InternalMiec.g:4400:1: ( ';' )
            {
            // InternalMiec.g:4400:1: ( ';' )
            // InternalMiec.g:4401:2: ';'
            {
             before(grammarAccess.getSystemAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalMiec.g:4410:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4414:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalMiec.g:4415:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalMiec.g:4422:1: rule__System__Group__4__Impl : ( 'capability' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4426:1: ( ( 'capability' ) )
            // InternalMiec.g:4427:1: ( 'capability' )
            {
            // InternalMiec.g:4427:1: ( 'capability' )
            // InternalMiec.g:4428:2: 'capability'
            {
             before(grammarAccess.getSystemAccess().getCapabilityKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCapabilityKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // InternalMiec.g:4437:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4441:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // InternalMiec.g:4442:2: rule__System__Group__5__Impl rule__System__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__System__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // InternalMiec.g:4449:1: rule__System__Group__5__Impl : ( ( rule__System__CapabilityAssignment_5 ) ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4453:1: ( ( ( rule__System__CapabilityAssignment_5 ) ) )
            // InternalMiec.g:4454:1: ( ( rule__System__CapabilityAssignment_5 ) )
            {
            // InternalMiec.g:4454:1: ( ( rule__System__CapabilityAssignment_5 ) )
            // InternalMiec.g:4455:2: ( rule__System__CapabilityAssignment_5 )
            {
             before(grammarAccess.getSystemAccess().getCapabilityAssignment_5()); 
            // InternalMiec.g:4456:2: ( rule__System__CapabilityAssignment_5 )
            // InternalMiec.g:4456:3: rule__System__CapabilityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__System__CapabilityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getCapabilityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__System__Group__6"
    // InternalMiec.g:4464:1: rule__System__Group__6 : rule__System__Group__6__Impl rule__System__Group__7 ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4468:1: ( rule__System__Group__6__Impl rule__System__Group__7 )
            // InternalMiec.g:4469:2: rule__System__Group__6__Impl rule__System__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__System__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6"


    // $ANTLR start "rule__System__Group__6__Impl"
    // InternalMiec.g:4476:1: rule__System__Group__6__Impl : ( ( rule__System__Group_6__0 )? ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4480:1: ( ( ( rule__System__Group_6__0 )? ) )
            // InternalMiec.g:4481:1: ( ( rule__System__Group_6__0 )? )
            {
            // InternalMiec.g:4481:1: ( ( rule__System__Group_6__0 )? )
            // InternalMiec.g:4482:2: ( rule__System__Group_6__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_6()); 
            // InternalMiec.g:4483:2: ( rule__System__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==46) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // InternalMiec.g:4483:3: rule__System__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6__Impl"


    // $ANTLR start "rule__System__Group__7"
    // InternalMiec.g:4491:1: rule__System__Group__7 : rule__System__Group__7__Impl rule__System__Group__8 ;
    public final void rule__System__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4495:1: ( rule__System__Group__7__Impl rule__System__Group__8 )
            // InternalMiec.g:4496:2: rule__System__Group__7__Impl rule__System__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__System__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__7"


    // $ANTLR start "rule__System__Group__7__Impl"
    // InternalMiec.g:4503:1: rule__System__Group__7__Impl : ( ( rule__System__Group_7__0 )? ) ;
    public final void rule__System__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4507:1: ( ( ( rule__System__Group_7__0 )? ) )
            // InternalMiec.g:4508:1: ( ( rule__System__Group_7__0 )? )
            {
            // InternalMiec.g:4508:1: ( ( rule__System__Group_7__0 )? )
            // InternalMiec.g:4509:2: ( rule__System__Group_7__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_7()); 
            // InternalMiec.g:4510:2: ( rule__System__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMiec.g:4510:3: rule__System__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__7__Impl"


    // $ANTLR start "rule__System__Group__8"
    // InternalMiec.g:4518:1: rule__System__Group__8 : rule__System__Group__8__Impl ;
    public final void rule__System__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4522:1: ( rule__System__Group__8__Impl )
            // InternalMiec.g:4523:2: rule__System__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__8"


    // $ANTLR start "rule__System__Group__8__Impl"
    // InternalMiec.g:4529:1: rule__System__Group__8__Impl : ( ')' ) ;
    public final void rule__System__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4533:1: ( ( ')' ) )
            // InternalMiec.g:4534:1: ( ')' )
            {
            // InternalMiec.g:4534:1: ( ')' )
            // InternalMiec.g:4535:2: ')'
            {
             before(grammarAccess.getSystemAccess().getRightParenthesisKeyword_8()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__8__Impl"


    // $ANTLR start "rule__System__Group_6__0"
    // InternalMiec.g:4545:1: rule__System__Group_6__0 : rule__System__Group_6__0__Impl rule__System__Group_6__1 ;
    public final void rule__System__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4549:1: ( rule__System__Group_6__0__Impl rule__System__Group_6__1 )
            // InternalMiec.g:4550:2: rule__System__Group_6__0__Impl rule__System__Group_6__1
            {
            pushFollow(FOLLOW_34);
            rule__System__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__0"


    // $ANTLR start "rule__System__Group_6__0__Impl"
    // InternalMiec.g:4557:1: rule__System__Group_6__0__Impl : ( ';' ) ;
    public final void rule__System__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4561:1: ( ( ';' ) )
            // InternalMiec.g:4562:1: ( ';' )
            {
            // InternalMiec.g:4562:1: ( ';' )
            // InternalMiec.g:4563:2: ';'
            {
             before(grammarAccess.getSystemAccess().getSemicolonKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSemicolonKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__0__Impl"


    // $ANTLR start "rule__System__Group_6__1"
    // InternalMiec.g:4572:1: rule__System__Group_6__1 : rule__System__Group_6__1__Impl rule__System__Group_6__2 ;
    public final void rule__System__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4576:1: ( rule__System__Group_6__1__Impl rule__System__Group_6__2 )
            // InternalMiec.g:4577:2: rule__System__Group_6__1__Impl rule__System__Group_6__2
            {
            pushFollow(FOLLOW_7);
            rule__System__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__1"


    // $ANTLR start "rule__System__Group_6__1__Impl"
    // InternalMiec.g:4584:1: rule__System__Group_6__1__Impl : ( 'devices' ) ;
    public final void rule__System__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4588:1: ( ( 'devices' ) )
            // InternalMiec.g:4589:1: ( 'devices' )
            {
            // InternalMiec.g:4589:1: ( 'devices' )
            // InternalMiec.g:4590:2: 'devices'
            {
             before(grammarAccess.getSystemAccess().getDevicesKeyword_6_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getDevicesKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__1__Impl"


    // $ANTLR start "rule__System__Group_6__2"
    // InternalMiec.g:4599:1: rule__System__Group_6__2 : rule__System__Group_6__2__Impl rule__System__Group_6__3 ;
    public final void rule__System__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4603:1: ( rule__System__Group_6__2__Impl rule__System__Group_6__3 )
            // InternalMiec.g:4604:2: rule__System__Group_6__2__Impl rule__System__Group_6__3
            {
            pushFollow(FOLLOW_12);
            rule__System__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__2"


    // $ANTLR start "rule__System__Group_6__2__Impl"
    // InternalMiec.g:4611:1: rule__System__Group_6__2__Impl : ( '{' ) ;
    public final void rule__System__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4615:1: ( ( '{' ) )
            // InternalMiec.g:4616:1: ( '{' )
            {
            // InternalMiec.g:4616:1: ( '{' )
            // InternalMiec.g:4617:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__2__Impl"


    // $ANTLR start "rule__System__Group_6__3"
    // InternalMiec.g:4626:1: rule__System__Group_6__3 : rule__System__Group_6__3__Impl rule__System__Group_6__4 ;
    public final void rule__System__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4630:1: ( rule__System__Group_6__3__Impl rule__System__Group_6__4 )
            // InternalMiec.g:4631:2: rule__System__Group_6__3__Impl rule__System__Group_6__4
            {
            pushFollow(FOLLOW_13);
            rule__System__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__3"


    // $ANTLR start "rule__System__Group_6__3__Impl"
    // InternalMiec.g:4638:1: rule__System__Group_6__3__Impl : ( ( rule__System__DevicesAssignment_6_3 ) ) ;
    public final void rule__System__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4642:1: ( ( ( rule__System__DevicesAssignment_6_3 ) ) )
            // InternalMiec.g:4643:1: ( ( rule__System__DevicesAssignment_6_3 ) )
            {
            // InternalMiec.g:4643:1: ( ( rule__System__DevicesAssignment_6_3 ) )
            // InternalMiec.g:4644:2: ( rule__System__DevicesAssignment_6_3 )
            {
             before(grammarAccess.getSystemAccess().getDevicesAssignment_6_3()); 
            // InternalMiec.g:4645:2: ( rule__System__DevicesAssignment_6_3 )
            // InternalMiec.g:4645:3: rule__System__DevicesAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__System__DevicesAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getDevicesAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__3__Impl"


    // $ANTLR start "rule__System__Group_6__4"
    // InternalMiec.g:4653:1: rule__System__Group_6__4 : rule__System__Group_6__4__Impl rule__System__Group_6__5 ;
    public final void rule__System__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4657:1: ( rule__System__Group_6__4__Impl rule__System__Group_6__5 )
            // InternalMiec.g:4658:2: rule__System__Group_6__4__Impl rule__System__Group_6__5
            {
            pushFollow(FOLLOW_13);
            rule__System__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__4"


    // $ANTLR start "rule__System__Group_6__4__Impl"
    // InternalMiec.g:4665:1: rule__System__Group_6__4__Impl : ( ( rule__System__Group_6_4__0 )* ) ;
    public final void rule__System__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4669:1: ( ( ( rule__System__Group_6_4__0 )* ) )
            // InternalMiec.g:4670:1: ( ( rule__System__Group_6_4__0 )* )
            {
            // InternalMiec.g:4670:1: ( ( rule__System__Group_6_4__0 )* )
            // InternalMiec.g:4671:2: ( rule__System__Group_6_4__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_6_4()); 
            // InternalMiec.g:4672:2: ( rule__System__Group_6_4__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==32) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMiec.g:4672:3: rule__System__Group_6_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__System__Group_6_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__4__Impl"


    // $ANTLR start "rule__System__Group_6__5"
    // InternalMiec.g:4680:1: rule__System__Group_6__5 : rule__System__Group_6__5__Impl ;
    public final void rule__System__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4684:1: ( rule__System__Group_6__5__Impl )
            // InternalMiec.g:4685:2: rule__System__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_6__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__5"


    // $ANTLR start "rule__System__Group_6__5__Impl"
    // InternalMiec.g:4691:1: rule__System__Group_6__5__Impl : ( '}' ) ;
    public final void rule__System__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4695:1: ( ( '}' ) )
            // InternalMiec.g:4696:1: ( '}' )
            {
            // InternalMiec.g:4696:1: ( '}' )
            // InternalMiec.g:4697:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__5__Impl"


    // $ANTLR start "rule__System__Group_6_4__0"
    // InternalMiec.g:4707:1: rule__System__Group_6_4__0 : rule__System__Group_6_4__0__Impl rule__System__Group_6_4__1 ;
    public final void rule__System__Group_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4711:1: ( rule__System__Group_6_4__0__Impl rule__System__Group_6_4__1 )
            // InternalMiec.g:4712:2: rule__System__Group_6_4__0__Impl rule__System__Group_6_4__1
            {
            pushFollow(FOLLOW_12);
            rule__System__Group_6_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_6_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6_4__0"


    // $ANTLR start "rule__System__Group_6_4__0__Impl"
    // InternalMiec.g:4719:1: rule__System__Group_6_4__0__Impl : ( ',' ) ;
    public final void rule__System__Group_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4723:1: ( ( ',' ) )
            // InternalMiec.g:4724:1: ( ',' )
            {
            // InternalMiec.g:4724:1: ( ',' )
            // InternalMiec.g:4725:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_6_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6_4__0__Impl"


    // $ANTLR start "rule__System__Group_6_4__1"
    // InternalMiec.g:4734:1: rule__System__Group_6_4__1 : rule__System__Group_6_4__1__Impl ;
    public final void rule__System__Group_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4738:1: ( rule__System__Group_6_4__1__Impl )
            // InternalMiec.g:4739:2: rule__System__Group_6_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_6_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6_4__1"


    // $ANTLR start "rule__System__Group_6_4__1__Impl"
    // InternalMiec.g:4745:1: rule__System__Group_6_4__1__Impl : ( ( rule__System__DevicesAssignment_6_4_1 ) ) ;
    public final void rule__System__Group_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4749:1: ( ( ( rule__System__DevicesAssignment_6_4_1 ) ) )
            // InternalMiec.g:4750:1: ( ( rule__System__DevicesAssignment_6_4_1 ) )
            {
            // InternalMiec.g:4750:1: ( ( rule__System__DevicesAssignment_6_4_1 ) )
            // InternalMiec.g:4751:2: ( rule__System__DevicesAssignment_6_4_1 )
            {
             before(grammarAccess.getSystemAccess().getDevicesAssignment_6_4_1()); 
            // InternalMiec.g:4752:2: ( rule__System__DevicesAssignment_6_4_1 )
            // InternalMiec.g:4752:3: rule__System__DevicesAssignment_6_4_1
            {
            pushFollow(FOLLOW_2);
            rule__System__DevicesAssignment_6_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getDevicesAssignment_6_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6_4__1__Impl"


    // $ANTLR start "rule__System__Group_7__0"
    // InternalMiec.g:4761:1: rule__System__Group_7__0 : rule__System__Group_7__0__Impl rule__System__Group_7__1 ;
    public final void rule__System__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4765:1: ( rule__System__Group_7__0__Impl rule__System__Group_7__1 )
            // InternalMiec.g:4766:2: rule__System__Group_7__0__Impl rule__System__Group_7__1
            {
            pushFollow(FOLLOW_30);
            rule__System__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__0"


    // $ANTLR start "rule__System__Group_7__0__Impl"
    // InternalMiec.g:4773:1: rule__System__Group_7__0__Impl : ( ';' ) ;
    public final void rule__System__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4777:1: ( ( ';' ) )
            // InternalMiec.g:4778:1: ( ';' )
            {
            // InternalMiec.g:4778:1: ( ';' )
            // InternalMiec.g:4779:2: ';'
            {
             before(grammarAccess.getSystemAccess().getSemicolonKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSemicolonKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__0__Impl"


    // $ANTLR start "rule__System__Group_7__1"
    // InternalMiec.g:4788:1: rule__System__Group_7__1 : rule__System__Group_7__1__Impl rule__System__Group_7__2 ;
    public final void rule__System__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4792:1: ( rule__System__Group_7__1__Impl rule__System__Group_7__2 )
            // InternalMiec.g:4793:2: rule__System__Group_7__1__Impl rule__System__Group_7__2
            {
            pushFollow(FOLLOW_7);
            rule__System__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__1"


    // $ANTLR start "rule__System__Group_7__1__Impl"
    // InternalMiec.g:4800:1: rule__System__Group_7__1__Impl : ( 'properties' ) ;
    public final void rule__System__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4804:1: ( ( 'properties' ) )
            // InternalMiec.g:4805:1: ( 'properties' )
            {
            // InternalMiec.g:4805:1: ( 'properties' )
            // InternalMiec.g:4806:2: 'properties'
            {
             before(grammarAccess.getSystemAccess().getPropertiesKeyword_7_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getPropertiesKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__1__Impl"


    // $ANTLR start "rule__System__Group_7__2"
    // InternalMiec.g:4815:1: rule__System__Group_7__2 : rule__System__Group_7__2__Impl rule__System__Group_7__3 ;
    public final void rule__System__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4819:1: ( rule__System__Group_7__2__Impl rule__System__Group_7__3 )
            // InternalMiec.g:4820:2: rule__System__Group_7__2__Impl rule__System__Group_7__3
            {
            pushFollow(FOLLOW_6);
            rule__System__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__2"


    // $ANTLR start "rule__System__Group_7__2__Impl"
    // InternalMiec.g:4827:1: rule__System__Group_7__2__Impl : ( '{' ) ;
    public final void rule__System__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4831:1: ( ( '{' ) )
            // InternalMiec.g:4832:1: ( '{' )
            {
            // InternalMiec.g:4832:1: ( '{' )
            // InternalMiec.g:4833:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_7_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__2__Impl"


    // $ANTLR start "rule__System__Group_7__3"
    // InternalMiec.g:4842:1: rule__System__Group_7__3 : rule__System__Group_7__3__Impl rule__System__Group_7__4 ;
    public final void rule__System__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4846:1: ( rule__System__Group_7__3__Impl rule__System__Group_7__4 )
            // InternalMiec.g:4847:2: rule__System__Group_7__3__Impl rule__System__Group_7__4
            {
            pushFollow(FOLLOW_13);
            rule__System__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__3"


    // $ANTLR start "rule__System__Group_7__3__Impl"
    // InternalMiec.g:4854:1: rule__System__Group_7__3__Impl : ( ( rule__System__PropertiesAssignment_7_3 ) ) ;
    public final void rule__System__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4858:1: ( ( ( rule__System__PropertiesAssignment_7_3 ) ) )
            // InternalMiec.g:4859:1: ( ( rule__System__PropertiesAssignment_7_3 ) )
            {
            // InternalMiec.g:4859:1: ( ( rule__System__PropertiesAssignment_7_3 ) )
            // InternalMiec.g:4860:2: ( rule__System__PropertiesAssignment_7_3 )
            {
             before(grammarAccess.getSystemAccess().getPropertiesAssignment_7_3()); 
            // InternalMiec.g:4861:2: ( rule__System__PropertiesAssignment_7_3 )
            // InternalMiec.g:4861:3: rule__System__PropertiesAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__System__PropertiesAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getPropertiesAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__3__Impl"


    // $ANTLR start "rule__System__Group_7__4"
    // InternalMiec.g:4869:1: rule__System__Group_7__4 : rule__System__Group_7__4__Impl rule__System__Group_7__5 ;
    public final void rule__System__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4873:1: ( rule__System__Group_7__4__Impl rule__System__Group_7__5 )
            // InternalMiec.g:4874:2: rule__System__Group_7__4__Impl rule__System__Group_7__5
            {
            pushFollow(FOLLOW_13);
            rule__System__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__4"


    // $ANTLR start "rule__System__Group_7__4__Impl"
    // InternalMiec.g:4881:1: rule__System__Group_7__4__Impl : ( ( rule__System__Group_7_4__0 )* ) ;
    public final void rule__System__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4885:1: ( ( ( rule__System__Group_7_4__0 )* ) )
            // InternalMiec.g:4886:1: ( ( rule__System__Group_7_4__0 )* )
            {
            // InternalMiec.g:4886:1: ( ( rule__System__Group_7_4__0 )* )
            // InternalMiec.g:4887:2: ( rule__System__Group_7_4__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_7_4()); 
            // InternalMiec.g:4888:2: ( rule__System__Group_7_4__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==32) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMiec.g:4888:3: rule__System__Group_7_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__System__Group_7_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__4__Impl"


    // $ANTLR start "rule__System__Group_7__5"
    // InternalMiec.g:4896:1: rule__System__Group_7__5 : rule__System__Group_7__5__Impl ;
    public final void rule__System__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4900:1: ( rule__System__Group_7__5__Impl )
            // InternalMiec.g:4901:2: rule__System__Group_7__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_7__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__5"


    // $ANTLR start "rule__System__Group_7__5__Impl"
    // InternalMiec.g:4907:1: rule__System__Group_7__5__Impl : ( '}' ) ;
    public final void rule__System__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4911:1: ( ( '}' ) )
            // InternalMiec.g:4912:1: ( '}' )
            {
            // InternalMiec.g:4912:1: ( '}' )
            // InternalMiec.g:4913:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_7_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_7_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__5__Impl"


    // $ANTLR start "rule__System__Group_7_4__0"
    // InternalMiec.g:4923:1: rule__System__Group_7_4__0 : rule__System__Group_7_4__0__Impl rule__System__Group_7_4__1 ;
    public final void rule__System__Group_7_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4927:1: ( rule__System__Group_7_4__0__Impl rule__System__Group_7_4__1 )
            // InternalMiec.g:4928:2: rule__System__Group_7_4__0__Impl rule__System__Group_7_4__1
            {
            pushFollow(FOLLOW_6);
            rule__System__Group_7_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_7_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7_4__0"


    // $ANTLR start "rule__System__Group_7_4__0__Impl"
    // InternalMiec.g:4935:1: rule__System__Group_7_4__0__Impl : ( ',' ) ;
    public final void rule__System__Group_7_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4939:1: ( ( ',' ) )
            // InternalMiec.g:4940:1: ( ',' )
            {
            // InternalMiec.g:4940:1: ( ',' )
            // InternalMiec.g:4941:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_7_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7_4__0__Impl"


    // $ANTLR start "rule__System__Group_7_4__1"
    // InternalMiec.g:4950:1: rule__System__Group_7_4__1 : rule__System__Group_7_4__1__Impl ;
    public final void rule__System__Group_7_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4954:1: ( rule__System__Group_7_4__1__Impl )
            // InternalMiec.g:4955:2: rule__System__Group_7_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_7_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7_4__1"


    // $ANTLR start "rule__System__Group_7_4__1__Impl"
    // InternalMiec.g:4961:1: rule__System__Group_7_4__1__Impl : ( ( rule__System__PropertiesAssignment_7_4_1 ) ) ;
    public final void rule__System__Group_7_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4965:1: ( ( ( rule__System__PropertiesAssignment_7_4_1 ) ) )
            // InternalMiec.g:4966:1: ( ( rule__System__PropertiesAssignment_7_4_1 ) )
            {
            // InternalMiec.g:4966:1: ( ( rule__System__PropertiesAssignment_7_4_1 ) )
            // InternalMiec.g:4967:2: ( rule__System__PropertiesAssignment_7_4_1 )
            {
             before(grammarAccess.getSystemAccess().getPropertiesAssignment_7_4_1()); 
            // InternalMiec.g:4968:2: ( rule__System__PropertiesAssignment_7_4_1 )
            // InternalMiec.g:4968:3: rule__System__PropertiesAssignment_7_4_1
            {
            pushFollow(FOLLOW_2);
            rule__System__PropertiesAssignment_7_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getPropertiesAssignment_7_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7_4__1__Impl"


    // $ANTLR start "rule__Application__Group__0"
    // InternalMiec.g:4977:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4981:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalMiec.g:4982:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // InternalMiec.g:4989:1: rule__Application__Group__0__Impl : ( '(' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:4993:1: ( ( '(' ) )
            // InternalMiec.g:4994:1: ( '(' )
            {
            // InternalMiec.g:4994:1: ( '(' )
            // InternalMiec.g:4995:2: '('
            {
             before(grammarAccess.getApplicationAccess().getLeftParenthesisKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // InternalMiec.g:5004:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5008:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalMiec.g:5009:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // InternalMiec.g:5016:1: rule__Application__Group__1__Impl : ( 'application' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5020:1: ( ( 'application' ) )
            // InternalMiec.g:5021:1: ( 'application' )
            {
            // InternalMiec.g:5021:1: ( 'application' )
            // InternalMiec.g:5022:2: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // InternalMiec.g:5031:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5035:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalMiec.g:5036:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // InternalMiec.g:5043:1: rule__Application__Group__2__Impl : ( ( rule__Application__NameAssignment_2 ) ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5047:1: ( ( ( rule__Application__NameAssignment_2 ) ) )
            // InternalMiec.g:5048:1: ( ( rule__Application__NameAssignment_2 ) )
            {
            // InternalMiec.g:5048:1: ( ( rule__Application__NameAssignment_2 ) )
            // InternalMiec.g:5049:2: ( rule__Application__NameAssignment_2 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_2()); 
            // InternalMiec.g:5050:2: ( rule__Application__NameAssignment_2 )
            // InternalMiec.g:5050:3: rule__Application__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Application__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // InternalMiec.g:5058:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5062:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalMiec.g:5063:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // InternalMiec.g:5070:1: rule__Application__Group__3__Impl : ( ';' ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5074:1: ( ( ';' ) )
            // InternalMiec.g:5075:1: ( ';' )
            {
            // InternalMiec.g:5075:1: ( ';' )
            // InternalMiec.g:5076:2: ';'
            {
             before(grammarAccess.getApplicationAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Application__Group__4"
    // InternalMiec.g:5085:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5089:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalMiec.g:5090:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4"


    // $ANTLR start "rule__Application__Group__4__Impl"
    // InternalMiec.g:5097:1: rule__Application__Group__4__Impl : ( 'executed' ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5101:1: ( ( 'executed' ) )
            // InternalMiec.g:5102:1: ( 'executed' )
            {
            // InternalMiec.g:5102:1: ( 'executed' )
            // InternalMiec.g:5103:2: 'executed'
            {
             before(grammarAccess.getApplicationAccess().getExecutedKeyword_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getExecutedKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4__Impl"


    // $ANTLR start "rule__Application__Group__5"
    // InternalMiec.g:5112:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5116:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalMiec.g:5117:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__Application__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5"


    // $ANTLR start "rule__Application__Group__5__Impl"
    // InternalMiec.g:5124:1: rule__Application__Group__5__Impl : ( 'on' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5128:1: ( ( 'on' ) )
            // InternalMiec.g:5129:1: ( 'on' )
            {
            // InternalMiec.g:5129:1: ( 'on' )
            // InternalMiec.g:5130:2: 'on'
            {
             before(grammarAccess.getApplicationAccess().getOnKeyword_5()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getOnKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5__Impl"


    // $ANTLR start "rule__Application__Group__6"
    // InternalMiec.g:5139:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5143:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // InternalMiec.g:5144:2: rule__Application__Group__6__Impl rule__Application__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Application__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__6"


    // $ANTLR start "rule__Application__Group__6__Impl"
    // InternalMiec.g:5151:1: rule__Application__Group__6__Impl : ( ( rule__Application__Alternatives_6 ) ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5155:1: ( ( ( rule__Application__Alternatives_6 ) ) )
            // InternalMiec.g:5156:1: ( ( rule__Application__Alternatives_6 ) )
            {
            // InternalMiec.g:5156:1: ( ( rule__Application__Alternatives_6 ) )
            // InternalMiec.g:5157:2: ( rule__Application__Alternatives_6 )
            {
             before(grammarAccess.getApplicationAccess().getAlternatives_6()); 
            // InternalMiec.g:5158:2: ( rule__Application__Alternatives_6 )
            // InternalMiec.g:5158:3: rule__Application__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Application__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__6__Impl"


    // $ANTLR start "rule__Application__Group__7"
    // InternalMiec.g:5166:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5170:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // InternalMiec.g:5171:2: rule__Application__Group__7__Impl rule__Application__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Application__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__7"


    // $ANTLR start "rule__Application__Group__7__Impl"
    // InternalMiec.g:5178:1: rule__Application__Group__7__Impl : ( ';' ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5182:1: ( ( ';' ) )
            // InternalMiec.g:5183:1: ( ';' )
            {
            // InternalMiec.g:5183:1: ( ';' )
            // InternalMiec.g:5184:2: ';'
            {
             before(grammarAccess.getApplicationAccess().getSemicolonKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__7__Impl"


    // $ANTLR start "rule__Application__Group__8"
    // InternalMiec.g:5193:1: rule__Application__Group__8 : rule__Application__Group__8__Impl rule__Application__Group__9 ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5197:1: ( rule__Application__Group__8__Impl rule__Application__Group__9 )
            // InternalMiec.g:5198:2: rule__Application__Group__8__Impl rule__Application__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Application__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__8"


    // $ANTLR start "rule__Application__Group__8__Impl"
    // InternalMiec.g:5205:1: rule__Application__Group__8__Impl : ( 'capability' ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5209:1: ( ( 'capability' ) )
            // InternalMiec.g:5210:1: ( 'capability' )
            {
            // InternalMiec.g:5210:1: ( 'capability' )
            // InternalMiec.g:5211:2: 'capability'
            {
             before(grammarAccess.getApplicationAccess().getCapabilityKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCapabilityKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__8__Impl"


    // $ANTLR start "rule__Application__Group__9"
    // InternalMiec.g:5220:1: rule__Application__Group__9 : rule__Application__Group__9__Impl rule__Application__Group__10 ;
    public final void rule__Application__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5224:1: ( rule__Application__Group__9__Impl rule__Application__Group__10 )
            // InternalMiec.g:5225:2: rule__Application__Group__9__Impl rule__Application__Group__10
            {
            pushFollow(FOLLOW_28);
            rule__Application__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__9"


    // $ANTLR start "rule__Application__Group__9__Impl"
    // InternalMiec.g:5232:1: rule__Application__Group__9__Impl : ( ( rule__Application__CapabilityAssignment_9 ) ) ;
    public final void rule__Application__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5236:1: ( ( ( rule__Application__CapabilityAssignment_9 ) ) )
            // InternalMiec.g:5237:1: ( ( rule__Application__CapabilityAssignment_9 ) )
            {
            // InternalMiec.g:5237:1: ( ( rule__Application__CapabilityAssignment_9 ) )
            // InternalMiec.g:5238:2: ( rule__Application__CapabilityAssignment_9 )
            {
             before(grammarAccess.getApplicationAccess().getCapabilityAssignment_9()); 
            // InternalMiec.g:5239:2: ( rule__Application__CapabilityAssignment_9 )
            // InternalMiec.g:5239:3: rule__Application__CapabilityAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Application__CapabilityAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getCapabilityAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__9__Impl"


    // $ANTLR start "rule__Application__Group__10"
    // InternalMiec.g:5247:1: rule__Application__Group__10 : rule__Application__Group__10__Impl rule__Application__Group__11 ;
    public final void rule__Application__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5251:1: ( rule__Application__Group__10__Impl rule__Application__Group__11 )
            // InternalMiec.g:5252:2: rule__Application__Group__10__Impl rule__Application__Group__11
            {
            pushFollow(FOLLOW_28);
            rule__Application__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__10"


    // $ANTLR start "rule__Application__Group__10__Impl"
    // InternalMiec.g:5259:1: rule__Application__Group__10__Impl : ( ( rule__Application__Group_10__0 )? ) ;
    public final void rule__Application__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5263:1: ( ( ( rule__Application__Group_10__0 )? ) )
            // InternalMiec.g:5264:1: ( ( rule__Application__Group_10__0 )? )
            {
            // InternalMiec.g:5264:1: ( ( rule__Application__Group_10__0 )? )
            // InternalMiec.g:5265:2: ( rule__Application__Group_10__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_10()); 
            // InternalMiec.g:5266:2: ( rule__Application__Group_10__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==30) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==50) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalMiec.g:5266:3: rule__Application__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__10__Impl"


    // $ANTLR start "rule__Application__Group__11"
    // InternalMiec.g:5274:1: rule__Application__Group__11 : rule__Application__Group__11__Impl rule__Application__Group__12 ;
    public final void rule__Application__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5278:1: ( rule__Application__Group__11__Impl rule__Application__Group__12 )
            // InternalMiec.g:5279:2: rule__Application__Group__11__Impl rule__Application__Group__12
            {
            pushFollow(FOLLOW_28);
            rule__Application__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__11"


    // $ANTLR start "rule__Application__Group__11__Impl"
    // InternalMiec.g:5286:1: rule__Application__Group__11__Impl : ( ( rule__Application__Group_11__0 )? ) ;
    public final void rule__Application__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5290:1: ( ( ( rule__Application__Group_11__0 )? ) )
            // InternalMiec.g:5291:1: ( ( rule__Application__Group_11__0 )? )
            {
            // InternalMiec.g:5291:1: ( ( rule__Application__Group_11__0 )? )
            // InternalMiec.g:5292:2: ( rule__Application__Group_11__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_11()); 
            // InternalMiec.g:5293:2: ( rule__Application__Group_11__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==51) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalMiec.g:5293:3: rule__Application__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__11__Impl"


    // $ANTLR start "rule__Application__Group__12"
    // InternalMiec.g:5301:1: rule__Application__Group__12 : rule__Application__Group__12__Impl rule__Application__Group__13 ;
    public final void rule__Application__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5305:1: ( rule__Application__Group__12__Impl rule__Application__Group__13 )
            // InternalMiec.g:5306:2: rule__Application__Group__12__Impl rule__Application__Group__13
            {
            pushFollow(FOLLOW_28);
            rule__Application__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__12"


    // $ANTLR start "rule__Application__Group__12__Impl"
    // InternalMiec.g:5313:1: rule__Application__Group__12__Impl : ( ( rule__Application__Group_12__0 )? ) ;
    public final void rule__Application__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5317:1: ( ( ( rule__Application__Group_12__0 )? ) )
            // InternalMiec.g:5318:1: ( ( rule__Application__Group_12__0 )? )
            {
            // InternalMiec.g:5318:1: ( ( rule__Application__Group_12__0 )? )
            // InternalMiec.g:5319:2: ( rule__Application__Group_12__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_12()); 
            // InternalMiec.g:5320:2: ( rule__Application__Group_12__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==30) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMiec.g:5320:3: rule__Application__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__12__Impl"


    // $ANTLR start "rule__Application__Group__13"
    // InternalMiec.g:5328:1: rule__Application__Group__13 : rule__Application__Group__13__Impl ;
    public final void rule__Application__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5332:1: ( rule__Application__Group__13__Impl )
            // InternalMiec.g:5333:2: rule__Application__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__13"


    // $ANTLR start "rule__Application__Group__13__Impl"
    // InternalMiec.g:5339:1: rule__Application__Group__13__Impl : ( ')' ) ;
    public final void rule__Application__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5343:1: ( ( ')' ) )
            // InternalMiec.g:5344:1: ( ')' )
            {
            // InternalMiec.g:5344:1: ( ')' )
            // InternalMiec.g:5345:2: ')'
            {
             before(grammarAccess.getApplicationAccess().getRightParenthesisKeyword_13()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightParenthesisKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__13__Impl"


    // $ANTLR start "rule__Application__Group_10__0"
    // InternalMiec.g:5355:1: rule__Application__Group_10__0 : rule__Application__Group_10__0__Impl rule__Application__Group_10__1 ;
    public final void rule__Application__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5359:1: ( rule__Application__Group_10__0__Impl rule__Application__Group_10__1 )
            // InternalMiec.g:5360:2: rule__Application__Group_10__0__Impl rule__Application__Group_10__1
            {
            pushFollow(FOLLOW_39);
            rule__Application__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__0"


    // $ANTLR start "rule__Application__Group_10__0__Impl"
    // InternalMiec.g:5367:1: rule__Application__Group_10__0__Impl : ( ';' ) ;
    public final void rule__Application__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5371:1: ( ( ';' ) )
            // InternalMiec.g:5372:1: ( ';' )
            {
            // InternalMiec.g:5372:1: ( ';' )
            // InternalMiec.g:5373:2: ';'
            {
             before(grammarAccess.getApplicationAccess().getSemicolonKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getSemicolonKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__0__Impl"


    // $ANTLR start "rule__Application__Group_10__1"
    // InternalMiec.g:5382:1: rule__Application__Group_10__1 : rule__Application__Group_10__1__Impl rule__Application__Group_10__2 ;
    public final void rule__Application__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5386:1: ( rule__Application__Group_10__1__Impl rule__Application__Group_10__2 )
            // InternalMiec.g:5387:2: rule__Application__Group_10__1__Impl rule__Application__Group_10__2
            {
            pushFollow(FOLLOW_7);
            rule__Application__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__1"


    // $ANTLR start "rule__Application__Group_10__1__Impl"
    // InternalMiec.g:5394:1: rule__Application__Group_10__1__Impl : ( 'constraints' ) ;
    public final void rule__Application__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5398:1: ( ( 'constraints' ) )
            // InternalMiec.g:5399:1: ( 'constraints' )
            {
            // InternalMiec.g:5399:1: ( 'constraints' )
            // InternalMiec.g:5400:2: 'constraints'
            {
             before(grammarAccess.getApplicationAccess().getConstraintsKeyword_10_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getConstraintsKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__1__Impl"


    // $ANTLR start "rule__Application__Group_10__2"
    // InternalMiec.g:5409:1: rule__Application__Group_10__2 : rule__Application__Group_10__2__Impl rule__Application__Group_10__3 ;
    public final void rule__Application__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5413:1: ( rule__Application__Group_10__2__Impl rule__Application__Group_10__3 )
            // InternalMiec.g:5414:2: rule__Application__Group_10__2__Impl rule__Application__Group_10__3
            {
            pushFollow(FOLLOW_40);
            rule__Application__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__2"


    // $ANTLR start "rule__Application__Group_10__2__Impl"
    // InternalMiec.g:5421:1: rule__Application__Group_10__2__Impl : ( '{' ) ;
    public final void rule__Application__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5425:1: ( ( '{' ) )
            // InternalMiec.g:5426:1: ( '{' )
            {
            // InternalMiec.g:5426:1: ( '{' )
            // InternalMiec.g:5427:2: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_10_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__2__Impl"


    // $ANTLR start "rule__Application__Group_10__3"
    // InternalMiec.g:5436:1: rule__Application__Group_10__3 : rule__Application__Group_10__3__Impl rule__Application__Group_10__4 ;
    public final void rule__Application__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5440:1: ( rule__Application__Group_10__3__Impl rule__Application__Group_10__4 )
            // InternalMiec.g:5441:2: rule__Application__Group_10__3__Impl rule__Application__Group_10__4
            {
            pushFollow(FOLLOW_13);
            rule__Application__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__3"


    // $ANTLR start "rule__Application__Group_10__3__Impl"
    // InternalMiec.g:5448:1: rule__Application__Group_10__3__Impl : ( ( rule__Application__ConstraintsAssignment_10_3 ) ) ;
    public final void rule__Application__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5452:1: ( ( ( rule__Application__ConstraintsAssignment_10_3 ) ) )
            // InternalMiec.g:5453:1: ( ( rule__Application__ConstraintsAssignment_10_3 ) )
            {
            // InternalMiec.g:5453:1: ( ( rule__Application__ConstraintsAssignment_10_3 ) )
            // InternalMiec.g:5454:2: ( rule__Application__ConstraintsAssignment_10_3 )
            {
             before(grammarAccess.getApplicationAccess().getConstraintsAssignment_10_3()); 
            // InternalMiec.g:5455:2: ( rule__Application__ConstraintsAssignment_10_3 )
            // InternalMiec.g:5455:3: rule__Application__ConstraintsAssignment_10_3
            {
            pushFollow(FOLLOW_2);
            rule__Application__ConstraintsAssignment_10_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getConstraintsAssignment_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__3__Impl"


    // $ANTLR start "rule__Application__Group_10__4"
    // InternalMiec.g:5463:1: rule__Application__Group_10__4 : rule__Application__Group_10__4__Impl rule__Application__Group_10__5 ;
    public final void rule__Application__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5467:1: ( rule__Application__Group_10__4__Impl rule__Application__Group_10__5 )
            // InternalMiec.g:5468:2: rule__Application__Group_10__4__Impl rule__Application__Group_10__5
            {
            pushFollow(FOLLOW_13);
            rule__Application__Group_10__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_10__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__4"


    // $ANTLR start "rule__Application__Group_10__4__Impl"
    // InternalMiec.g:5475:1: rule__Application__Group_10__4__Impl : ( ( rule__Application__Group_10_4__0 )* ) ;
    public final void rule__Application__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5479:1: ( ( ( rule__Application__Group_10_4__0 )* ) )
            // InternalMiec.g:5480:1: ( ( rule__Application__Group_10_4__0 )* )
            {
            // InternalMiec.g:5480:1: ( ( rule__Application__Group_10_4__0 )* )
            // InternalMiec.g:5481:2: ( rule__Application__Group_10_4__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_10_4()); 
            // InternalMiec.g:5482:2: ( rule__Application__Group_10_4__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==32) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMiec.g:5482:3: rule__Application__Group_10_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Application__Group_10_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__4__Impl"


    // $ANTLR start "rule__Application__Group_10__5"
    // InternalMiec.g:5490:1: rule__Application__Group_10__5 : rule__Application__Group_10__5__Impl ;
    public final void rule__Application__Group_10__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5494:1: ( rule__Application__Group_10__5__Impl )
            // InternalMiec.g:5495:2: rule__Application__Group_10__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_10__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__5"


    // $ANTLR start "rule__Application__Group_10__5__Impl"
    // InternalMiec.g:5501:1: rule__Application__Group_10__5__Impl : ( '}' ) ;
    public final void rule__Application__Group_10__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5505:1: ( ( '}' ) )
            // InternalMiec.g:5506:1: ( '}' )
            {
            // InternalMiec.g:5506:1: ( '}' )
            // InternalMiec.g:5507:2: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_10_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_10_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10__5__Impl"


    // $ANTLR start "rule__Application__Group_10_4__0"
    // InternalMiec.g:5517:1: rule__Application__Group_10_4__0 : rule__Application__Group_10_4__0__Impl rule__Application__Group_10_4__1 ;
    public final void rule__Application__Group_10_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5521:1: ( rule__Application__Group_10_4__0__Impl rule__Application__Group_10_4__1 )
            // InternalMiec.g:5522:2: rule__Application__Group_10_4__0__Impl rule__Application__Group_10_4__1
            {
            pushFollow(FOLLOW_40);
            rule__Application__Group_10_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_10_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10_4__0"


    // $ANTLR start "rule__Application__Group_10_4__0__Impl"
    // InternalMiec.g:5529:1: rule__Application__Group_10_4__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_10_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5533:1: ( ( ',' ) )
            // InternalMiec.g:5534:1: ( ',' )
            {
            // InternalMiec.g:5534:1: ( ',' )
            // InternalMiec.g:5535:2: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_10_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCommaKeyword_10_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10_4__0__Impl"


    // $ANTLR start "rule__Application__Group_10_4__1"
    // InternalMiec.g:5544:1: rule__Application__Group_10_4__1 : rule__Application__Group_10_4__1__Impl ;
    public final void rule__Application__Group_10_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5548:1: ( rule__Application__Group_10_4__1__Impl )
            // InternalMiec.g:5549:2: rule__Application__Group_10_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_10_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10_4__1"


    // $ANTLR start "rule__Application__Group_10_4__1__Impl"
    // InternalMiec.g:5555:1: rule__Application__Group_10_4__1__Impl : ( ( rule__Application__ConstraintsAssignment_10_4_1 ) ) ;
    public final void rule__Application__Group_10_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5559:1: ( ( ( rule__Application__ConstraintsAssignment_10_4_1 ) ) )
            // InternalMiec.g:5560:1: ( ( rule__Application__ConstraintsAssignment_10_4_1 ) )
            {
            // InternalMiec.g:5560:1: ( ( rule__Application__ConstraintsAssignment_10_4_1 ) )
            // InternalMiec.g:5561:2: ( rule__Application__ConstraintsAssignment_10_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getConstraintsAssignment_10_4_1()); 
            // InternalMiec.g:5562:2: ( rule__Application__ConstraintsAssignment_10_4_1 )
            // InternalMiec.g:5562:3: rule__Application__ConstraintsAssignment_10_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__ConstraintsAssignment_10_4_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getConstraintsAssignment_10_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_10_4__1__Impl"


    // $ANTLR start "rule__Application__Group_11__0"
    // InternalMiec.g:5571:1: rule__Application__Group_11__0 : rule__Application__Group_11__0__Impl rule__Application__Group_11__1 ;
    public final void rule__Application__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5575:1: ( rule__Application__Group_11__0__Impl rule__Application__Group_11__1 )
            // InternalMiec.g:5576:2: rule__Application__Group_11__0__Impl rule__Application__Group_11__1
            {
            pushFollow(FOLLOW_41);
            rule__Application__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__0"


    // $ANTLR start "rule__Application__Group_11__0__Impl"
    // InternalMiec.g:5583:1: rule__Application__Group_11__0__Impl : ( ';' ) ;
    public final void rule__Application__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5587:1: ( ( ';' ) )
            // InternalMiec.g:5588:1: ( ';' )
            {
            // InternalMiec.g:5588:1: ( ';' )
            // InternalMiec.g:5589:2: ';'
            {
             before(grammarAccess.getApplicationAccess().getSemicolonKeyword_11_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getSemicolonKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__0__Impl"


    // $ANTLR start "rule__Application__Group_11__1"
    // InternalMiec.g:5598:1: rule__Application__Group_11__1 : rule__Application__Group_11__1__Impl rule__Application__Group_11__2 ;
    public final void rule__Application__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5602:1: ( rule__Application__Group_11__1__Impl rule__Application__Group_11__2 )
            // InternalMiec.g:5603:2: rule__Application__Group_11__1__Impl rule__Application__Group_11__2
            {
            pushFollow(FOLLOW_42);
            rule__Application__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__1"


    // $ANTLR start "rule__Application__Group_11__1__Impl"
    // InternalMiec.g:5610:1: rule__Application__Group_11__1__Impl : ( 'communicates' ) ;
    public final void rule__Application__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5614:1: ( ( 'communicates' ) )
            // InternalMiec.g:5615:1: ( 'communicates' )
            {
            // InternalMiec.g:5615:1: ( 'communicates' )
            // InternalMiec.g:5616:2: 'communicates'
            {
             before(grammarAccess.getApplicationAccess().getCommunicatesKeyword_11_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCommunicatesKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__1__Impl"


    // $ANTLR start "rule__Application__Group_11__2"
    // InternalMiec.g:5625:1: rule__Application__Group_11__2 : rule__Application__Group_11__2__Impl rule__Application__Group_11__3 ;
    public final void rule__Application__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5629:1: ( rule__Application__Group_11__2__Impl rule__Application__Group_11__3 )
            // InternalMiec.g:5630:2: rule__Application__Group_11__2__Impl rule__Application__Group_11__3
            {
            pushFollow(FOLLOW_7);
            rule__Application__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__2"


    // $ANTLR start "rule__Application__Group_11__2__Impl"
    // InternalMiec.g:5637:1: rule__Application__Group_11__2__Impl : ( 'with' ) ;
    public final void rule__Application__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5641:1: ( ( 'with' ) )
            // InternalMiec.g:5642:1: ( 'with' )
            {
            // InternalMiec.g:5642:1: ( 'with' )
            // InternalMiec.g:5643:2: 'with'
            {
             before(grammarAccess.getApplicationAccess().getWithKeyword_11_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getWithKeyword_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__2__Impl"


    // $ANTLR start "rule__Application__Group_11__3"
    // InternalMiec.g:5652:1: rule__Application__Group_11__3 : rule__Application__Group_11__3__Impl rule__Application__Group_11__4 ;
    public final void rule__Application__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5656:1: ( rule__Application__Group_11__3__Impl rule__Application__Group_11__4 )
            // InternalMiec.g:5657:2: rule__Application__Group_11__3__Impl rule__Application__Group_11__4
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__3"


    // $ANTLR start "rule__Application__Group_11__3__Impl"
    // InternalMiec.g:5664:1: rule__Application__Group_11__3__Impl : ( '{' ) ;
    public final void rule__Application__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5668:1: ( ( '{' ) )
            // InternalMiec.g:5669:1: ( '{' )
            {
            // InternalMiec.g:5669:1: ( '{' )
            // InternalMiec.g:5670:2: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_11_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__3__Impl"


    // $ANTLR start "rule__Application__Group_11__4"
    // InternalMiec.g:5679:1: rule__Application__Group_11__4 : rule__Application__Group_11__4__Impl rule__Application__Group_11__5 ;
    public final void rule__Application__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5683:1: ( rule__Application__Group_11__4__Impl rule__Application__Group_11__5 )
            // InternalMiec.g:5684:2: rule__Application__Group_11__4__Impl rule__Application__Group_11__5
            {
            pushFollow(FOLLOW_13);
            rule__Application__Group_11__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_11__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__4"


    // $ANTLR start "rule__Application__Group_11__4__Impl"
    // InternalMiec.g:5691:1: rule__Application__Group_11__4__Impl : ( ( rule__Application__CommunicatesWithAssignment_11_4 ) ) ;
    public final void rule__Application__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5695:1: ( ( ( rule__Application__CommunicatesWithAssignment_11_4 ) ) )
            // InternalMiec.g:5696:1: ( ( rule__Application__CommunicatesWithAssignment_11_4 ) )
            {
            // InternalMiec.g:5696:1: ( ( rule__Application__CommunicatesWithAssignment_11_4 ) )
            // InternalMiec.g:5697:2: ( rule__Application__CommunicatesWithAssignment_11_4 )
            {
             before(grammarAccess.getApplicationAccess().getCommunicatesWithAssignment_11_4()); 
            // InternalMiec.g:5698:2: ( rule__Application__CommunicatesWithAssignment_11_4 )
            // InternalMiec.g:5698:3: rule__Application__CommunicatesWithAssignment_11_4
            {
            pushFollow(FOLLOW_2);
            rule__Application__CommunicatesWithAssignment_11_4();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getCommunicatesWithAssignment_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__4__Impl"


    // $ANTLR start "rule__Application__Group_11__5"
    // InternalMiec.g:5706:1: rule__Application__Group_11__5 : rule__Application__Group_11__5__Impl rule__Application__Group_11__6 ;
    public final void rule__Application__Group_11__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5710:1: ( rule__Application__Group_11__5__Impl rule__Application__Group_11__6 )
            // InternalMiec.g:5711:2: rule__Application__Group_11__5__Impl rule__Application__Group_11__6
            {
            pushFollow(FOLLOW_13);
            rule__Application__Group_11__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_11__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__5"


    // $ANTLR start "rule__Application__Group_11__5__Impl"
    // InternalMiec.g:5718:1: rule__Application__Group_11__5__Impl : ( ( rule__Application__Group_11_5__0 )* ) ;
    public final void rule__Application__Group_11__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5722:1: ( ( ( rule__Application__Group_11_5__0 )* ) )
            // InternalMiec.g:5723:1: ( ( rule__Application__Group_11_5__0 )* )
            {
            // InternalMiec.g:5723:1: ( ( rule__Application__Group_11_5__0 )* )
            // InternalMiec.g:5724:2: ( rule__Application__Group_11_5__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_11_5()); 
            // InternalMiec.g:5725:2: ( rule__Application__Group_11_5__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==32) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMiec.g:5725:3: rule__Application__Group_11_5__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Application__Group_11_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_11_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__5__Impl"


    // $ANTLR start "rule__Application__Group_11__6"
    // InternalMiec.g:5733:1: rule__Application__Group_11__6 : rule__Application__Group_11__6__Impl ;
    public final void rule__Application__Group_11__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5737:1: ( rule__Application__Group_11__6__Impl )
            // InternalMiec.g:5738:2: rule__Application__Group_11__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_11__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__6"


    // $ANTLR start "rule__Application__Group_11__6__Impl"
    // InternalMiec.g:5744:1: rule__Application__Group_11__6__Impl : ( '}' ) ;
    public final void rule__Application__Group_11__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5748:1: ( ( '}' ) )
            // InternalMiec.g:5749:1: ( '}' )
            {
            // InternalMiec.g:5749:1: ( '}' )
            // InternalMiec.g:5750:2: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_11_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_11_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11__6__Impl"


    // $ANTLR start "rule__Application__Group_11_5__0"
    // InternalMiec.g:5760:1: rule__Application__Group_11_5__0 : rule__Application__Group_11_5__0__Impl rule__Application__Group_11_5__1 ;
    public final void rule__Application__Group_11_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5764:1: ( rule__Application__Group_11_5__0__Impl rule__Application__Group_11_5__1 )
            // InternalMiec.g:5765:2: rule__Application__Group_11_5__0__Impl rule__Application__Group_11_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group_11_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_11_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11_5__0"


    // $ANTLR start "rule__Application__Group_11_5__0__Impl"
    // InternalMiec.g:5772:1: rule__Application__Group_11_5__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_11_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5776:1: ( ( ',' ) )
            // InternalMiec.g:5777:1: ( ',' )
            {
            // InternalMiec.g:5777:1: ( ',' )
            // InternalMiec.g:5778:2: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_11_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCommaKeyword_11_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11_5__0__Impl"


    // $ANTLR start "rule__Application__Group_11_5__1"
    // InternalMiec.g:5787:1: rule__Application__Group_11_5__1 : rule__Application__Group_11_5__1__Impl ;
    public final void rule__Application__Group_11_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5791:1: ( rule__Application__Group_11_5__1__Impl )
            // InternalMiec.g:5792:2: rule__Application__Group_11_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_11_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11_5__1"


    // $ANTLR start "rule__Application__Group_11_5__1__Impl"
    // InternalMiec.g:5798:1: rule__Application__Group_11_5__1__Impl : ( ( rule__Application__CommunicatesWithAssignment_11_5_1 ) ) ;
    public final void rule__Application__Group_11_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5802:1: ( ( ( rule__Application__CommunicatesWithAssignment_11_5_1 ) ) )
            // InternalMiec.g:5803:1: ( ( rule__Application__CommunicatesWithAssignment_11_5_1 ) )
            {
            // InternalMiec.g:5803:1: ( ( rule__Application__CommunicatesWithAssignment_11_5_1 ) )
            // InternalMiec.g:5804:2: ( rule__Application__CommunicatesWithAssignment_11_5_1 )
            {
             before(grammarAccess.getApplicationAccess().getCommunicatesWithAssignment_11_5_1()); 
            // InternalMiec.g:5805:2: ( rule__Application__CommunicatesWithAssignment_11_5_1 )
            // InternalMiec.g:5805:3: rule__Application__CommunicatesWithAssignment_11_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__CommunicatesWithAssignment_11_5_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getCommunicatesWithAssignment_11_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_11_5__1__Impl"


    // $ANTLR start "rule__Application__Group_12__0"
    // InternalMiec.g:5814:1: rule__Application__Group_12__0 : rule__Application__Group_12__0__Impl rule__Application__Group_12__1 ;
    public final void rule__Application__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5818:1: ( rule__Application__Group_12__0__Impl rule__Application__Group_12__1 )
            // InternalMiec.g:5819:2: rule__Application__Group_12__0__Impl rule__Application__Group_12__1
            {
            pushFollow(FOLLOW_30);
            rule__Application__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12__0"


    // $ANTLR start "rule__Application__Group_12__0__Impl"
    // InternalMiec.g:5826:1: rule__Application__Group_12__0__Impl : ( ';' ) ;
    public final void rule__Application__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5830:1: ( ( ';' ) )
            // InternalMiec.g:5831:1: ( ';' )
            {
            // InternalMiec.g:5831:1: ( ';' )
            // InternalMiec.g:5832:2: ';'
            {
             before(grammarAccess.getApplicationAccess().getSemicolonKeyword_12_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getSemicolonKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12__0__Impl"


    // $ANTLR start "rule__Application__Group_12__1"
    // InternalMiec.g:5841:1: rule__Application__Group_12__1 : rule__Application__Group_12__1__Impl rule__Application__Group_12__2 ;
    public final void rule__Application__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5845:1: ( rule__Application__Group_12__1__Impl rule__Application__Group_12__2 )
            // InternalMiec.g:5846:2: rule__Application__Group_12__1__Impl rule__Application__Group_12__2
            {
            pushFollow(FOLLOW_7);
            rule__Application__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12__1"


    // $ANTLR start "rule__Application__Group_12__1__Impl"
    // InternalMiec.g:5853:1: rule__Application__Group_12__1__Impl : ( 'properties' ) ;
    public final void rule__Application__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5857:1: ( ( 'properties' ) )
            // InternalMiec.g:5858:1: ( 'properties' )
            {
            // InternalMiec.g:5858:1: ( 'properties' )
            // InternalMiec.g:5859:2: 'properties'
            {
             before(grammarAccess.getApplicationAccess().getPropertiesKeyword_12_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getPropertiesKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12__1__Impl"


    // $ANTLR start "rule__Application__Group_12__2"
    // InternalMiec.g:5868:1: rule__Application__Group_12__2 : rule__Application__Group_12__2__Impl rule__Application__Group_12__3 ;
    public final void rule__Application__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5872:1: ( rule__Application__Group_12__2__Impl rule__Application__Group_12__3 )
            // InternalMiec.g:5873:2: rule__Application__Group_12__2__Impl rule__Application__Group_12__3
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12__2"


    // $ANTLR start "rule__Application__Group_12__2__Impl"
    // InternalMiec.g:5880:1: rule__Application__Group_12__2__Impl : ( '{' ) ;
    public final void rule__Application__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5884:1: ( ( '{' ) )
            // InternalMiec.g:5885:1: ( '{' )
            {
            // InternalMiec.g:5885:1: ( '{' )
            // InternalMiec.g:5886:2: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_12_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12__2__Impl"


    // $ANTLR start "rule__Application__Group_12__3"
    // InternalMiec.g:5895:1: rule__Application__Group_12__3 : rule__Application__Group_12__3__Impl rule__Application__Group_12__4 ;
    public final void rule__Application__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5899:1: ( rule__Application__Group_12__3__Impl rule__Application__Group_12__4 )
            // InternalMiec.g:5900:2: rule__Application__Group_12__3__Impl rule__Application__Group_12__4
            {
            pushFollow(FOLLOW_13);
            rule__Application__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12__3"


    // $ANTLR start "rule__Application__Group_12__3__Impl"
    // InternalMiec.g:5907:1: rule__Application__Group_12__3__Impl : ( ( rule__Application__PropertiesAssignment_12_3 ) ) ;
    public final void rule__Application__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5911:1: ( ( ( rule__Application__PropertiesAssignment_12_3 ) ) )
            // InternalMiec.g:5912:1: ( ( rule__Application__PropertiesAssignment_12_3 ) )
            {
            // InternalMiec.g:5912:1: ( ( rule__Application__PropertiesAssignment_12_3 ) )
            // InternalMiec.g:5913:2: ( rule__Application__PropertiesAssignment_12_3 )
            {
             before(grammarAccess.getApplicationAccess().getPropertiesAssignment_12_3()); 
            // InternalMiec.g:5914:2: ( rule__Application__PropertiesAssignment_12_3 )
            // InternalMiec.g:5914:3: rule__Application__PropertiesAssignment_12_3
            {
            pushFollow(FOLLOW_2);
            rule__Application__PropertiesAssignment_12_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getPropertiesAssignment_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12__3__Impl"


    // $ANTLR start "rule__Application__Group_12__4"
    // InternalMiec.g:5922:1: rule__Application__Group_12__4 : rule__Application__Group_12__4__Impl rule__Application__Group_12__5 ;
    public final void rule__Application__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5926:1: ( rule__Application__Group_12__4__Impl rule__Application__Group_12__5 )
            // InternalMiec.g:5927:2: rule__Application__Group_12__4__Impl rule__Application__Group_12__5
            {
            pushFollow(FOLLOW_13);
            rule__Application__Group_12__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_12__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12__4"


    // $ANTLR start "rule__Application__Group_12__4__Impl"
    // InternalMiec.g:5934:1: rule__Application__Group_12__4__Impl : ( ( rule__Application__Group_12_4__0 )* ) ;
    public final void rule__Application__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5938:1: ( ( ( rule__Application__Group_12_4__0 )* ) )
            // InternalMiec.g:5939:1: ( ( rule__Application__Group_12_4__0 )* )
            {
            // InternalMiec.g:5939:1: ( ( rule__Application__Group_12_4__0 )* )
            // InternalMiec.g:5940:2: ( rule__Application__Group_12_4__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_12_4()); 
            // InternalMiec.g:5941:2: ( rule__Application__Group_12_4__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==32) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMiec.g:5941:3: rule__Application__Group_12_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Application__Group_12_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12__4__Impl"


    // $ANTLR start "rule__Application__Group_12__5"
    // InternalMiec.g:5949:1: rule__Application__Group_12__5 : rule__Application__Group_12__5__Impl ;
    public final void rule__Application__Group_12__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5953:1: ( rule__Application__Group_12__5__Impl )
            // InternalMiec.g:5954:2: rule__Application__Group_12__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_12__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12__5"


    // $ANTLR start "rule__Application__Group_12__5__Impl"
    // InternalMiec.g:5960:1: rule__Application__Group_12__5__Impl : ( '}' ) ;
    public final void rule__Application__Group_12__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5964:1: ( ( '}' ) )
            // InternalMiec.g:5965:1: ( '}' )
            {
            // InternalMiec.g:5965:1: ( '}' )
            // InternalMiec.g:5966:2: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_12_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_12_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12__5__Impl"


    // $ANTLR start "rule__Application__Group_12_4__0"
    // InternalMiec.g:5976:1: rule__Application__Group_12_4__0 : rule__Application__Group_12_4__0__Impl rule__Application__Group_12_4__1 ;
    public final void rule__Application__Group_12_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5980:1: ( rule__Application__Group_12_4__0__Impl rule__Application__Group_12_4__1 )
            // InternalMiec.g:5981:2: rule__Application__Group_12_4__0__Impl rule__Application__Group_12_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group_12_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_12_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12_4__0"


    // $ANTLR start "rule__Application__Group_12_4__0__Impl"
    // InternalMiec.g:5988:1: rule__Application__Group_12_4__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_12_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:5992:1: ( ( ',' ) )
            // InternalMiec.g:5993:1: ( ',' )
            {
            // InternalMiec.g:5993:1: ( ',' )
            // InternalMiec.g:5994:2: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_12_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCommaKeyword_12_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12_4__0__Impl"


    // $ANTLR start "rule__Application__Group_12_4__1"
    // InternalMiec.g:6003:1: rule__Application__Group_12_4__1 : rule__Application__Group_12_4__1__Impl ;
    public final void rule__Application__Group_12_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6007:1: ( rule__Application__Group_12_4__1__Impl )
            // InternalMiec.g:6008:2: rule__Application__Group_12_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_12_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12_4__1"


    // $ANTLR start "rule__Application__Group_12_4__1__Impl"
    // InternalMiec.g:6014:1: rule__Application__Group_12_4__1__Impl : ( ( rule__Application__PropertiesAssignment_12_4_1 ) ) ;
    public final void rule__Application__Group_12_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6018:1: ( ( ( rule__Application__PropertiesAssignment_12_4_1 ) ) )
            // InternalMiec.g:6019:1: ( ( rule__Application__PropertiesAssignment_12_4_1 ) )
            {
            // InternalMiec.g:6019:1: ( ( rule__Application__PropertiesAssignment_12_4_1 ) )
            // InternalMiec.g:6020:2: ( rule__Application__PropertiesAssignment_12_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getPropertiesAssignment_12_4_1()); 
            // InternalMiec.g:6021:2: ( rule__Application__PropertiesAssignment_12_4_1 )
            // InternalMiec.g:6021:3: rule__Application__PropertiesAssignment_12_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__PropertiesAssignment_12_4_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getPropertiesAssignment_12_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_12_4__1__Impl"


    // $ANTLR start "rule__Channel__Group__0"
    // InternalMiec.g:6030:1: rule__Channel__Group__0 : rule__Channel__Group__0__Impl rule__Channel__Group__1 ;
    public final void rule__Channel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6034:1: ( rule__Channel__Group__0__Impl rule__Channel__Group__1 )
            // InternalMiec.g:6035:2: rule__Channel__Group__0__Impl rule__Channel__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Channel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__0"


    // $ANTLR start "rule__Channel__Group__0__Impl"
    // InternalMiec.g:6042:1: rule__Channel__Group__0__Impl : ( '(' ) ;
    public final void rule__Channel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6046:1: ( ( '(' ) )
            // InternalMiec.g:6047:1: ( '(' )
            {
            // InternalMiec.g:6047:1: ( '(' )
            // InternalMiec.g:6048:2: '('
            {
             before(grammarAccess.getChannelAccess().getLeftParenthesisKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__0__Impl"


    // $ANTLR start "rule__Channel__Group__1"
    // InternalMiec.g:6057:1: rule__Channel__Group__1 : rule__Channel__Group__1__Impl rule__Channel__Group__2 ;
    public final void rule__Channel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6061:1: ( rule__Channel__Group__1__Impl rule__Channel__Group__2 )
            // InternalMiec.g:6062:2: rule__Channel__Group__1__Impl rule__Channel__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Channel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__1"


    // $ANTLR start "rule__Channel__Group__1__Impl"
    // InternalMiec.g:6069:1: rule__Channel__Group__1__Impl : ( ( rule__Channel__NameAssignment_1 ) ) ;
    public final void rule__Channel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6073:1: ( ( ( rule__Channel__NameAssignment_1 ) ) )
            // InternalMiec.g:6074:1: ( ( rule__Channel__NameAssignment_1 ) )
            {
            // InternalMiec.g:6074:1: ( ( rule__Channel__NameAssignment_1 ) )
            // InternalMiec.g:6075:2: ( rule__Channel__NameAssignment_1 )
            {
             before(grammarAccess.getChannelAccess().getNameAssignment_1()); 
            // InternalMiec.g:6076:2: ( rule__Channel__NameAssignment_1 )
            // InternalMiec.g:6076:3: rule__Channel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Channel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__1__Impl"


    // $ANTLR start "rule__Channel__Group__2"
    // InternalMiec.g:6084:1: rule__Channel__Group__2 : rule__Channel__Group__2__Impl rule__Channel__Group__3 ;
    public final void rule__Channel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6088:1: ( rule__Channel__Group__2__Impl rule__Channel__Group__3 )
            // InternalMiec.g:6089:2: rule__Channel__Group__2__Impl rule__Channel__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Channel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__2"


    // $ANTLR start "rule__Channel__Group__2__Impl"
    // InternalMiec.g:6096:1: rule__Channel__Group__2__Impl : ( ';' ) ;
    public final void rule__Channel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6100:1: ( ( ';' ) )
            // InternalMiec.g:6101:1: ( ';' )
            {
            // InternalMiec.g:6101:1: ( ';' )
            // InternalMiec.g:6102:2: ';'
            {
             before(grammarAccess.getChannelAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__2__Impl"


    // $ANTLR start "rule__Channel__Group__3"
    // InternalMiec.g:6111:1: rule__Channel__Group__3 : rule__Channel__Group__3__Impl rule__Channel__Group__4 ;
    public final void rule__Channel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6115:1: ( rule__Channel__Group__3__Impl rule__Channel__Group__4 )
            // InternalMiec.g:6116:2: rule__Channel__Group__3__Impl rule__Channel__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Channel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__3"


    // $ANTLR start "rule__Channel__Group__3__Impl"
    // InternalMiec.g:6123:1: rule__Channel__Group__3__Impl : ( 'connects' ) ;
    public final void rule__Channel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6127:1: ( ( 'connects' ) )
            // InternalMiec.g:6128:1: ( 'connects' )
            {
            // InternalMiec.g:6128:1: ( 'connects' )
            // InternalMiec.g:6129:2: 'connects'
            {
             before(grammarAccess.getChannelAccess().getConnectsKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getConnectsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__3__Impl"


    // $ANTLR start "rule__Channel__Group__4"
    // InternalMiec.g:6138:1: rule__Channel__Group__4 : rule__Channel__Group__4__Impl rule__Channel__Group__5 ;
    public final void rule__Channel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6142:1: ( rule__Channel__Group__4__Impl rule__Channel__Group__5 )
            // InternalMiec.g:6143:2: rule__Channel__Group__4__Impl rule__Channel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Channel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__4"


    // $ANTLR start "rule__Channel__Group__4__Impl"
    // InternalMiec.g:6150:1: rule__Channel__Group__4__Impl : ( '{' ) ;
    public final void rule__Channel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6154:1: ( ( '{' ) )
            // InternalMiec.g:6155:1: ( '{' )
            {
            // InternalMiec.g:6155:1: ( '{' )
            // InternalMiec.g:6156:2: '{'
            {
             before(grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__4__Impl"


    // $ANTLR start "rule__Channel__Group__5"
    // InternalMiec.g:6165:1: rule__Channel__Group__5 : rule__Channel__Group__5__Impl rule__Channel__Group__6 ;
    public final void rule__Channel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6169:1: ( rule__Channel__Group__5__Impl rule__Channel__Group__6 )
            // InternalMiec.g:6170:2: rule__Channel__Group__5__Impl rule__Channel__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Channel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__5"


    // $ANTLR start "rule__Channel__Group__5__Impl"
    // InternalMiec.g:6177:1: rule__Channel__Group__5__Impl : ( ( rule__Channel__ConnectsAssignment_5 ) ) ;
    public final void rule__Channel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6181:1: ( ( ( rule__Channel__ConnectsAssignment_5 ) ) )
            // InternalMiec.g:6182:1: ( ( rule__Channel__ConnectsAssignment_5 ) )
            {
            // InternalMiec.g:6182:1: ( ( rule__Channel__ConnectsAssignment_5 ) )
            // InternalMiec.g:6183:2: ( rule__Channel__ConnectsAssignment_5 )
            {
             before(grammarAccess.getChannelAccess().getConnectsAssignment_5()); 
            // InternalMiec.g:6184:2: ( rule__Channel__ConnectsAssignment_5 )
            // InternalMiec.g:6184:3: rule__Channel__ConnectsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Channel__ConnectsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getConnectsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__5__Impl"


    // $ANTLR start "rule__Channel__Group__6"
    // InternalMiec.g:6192:1: rule__Channel__Group__6 : rule__Channel__Group__6__Impl rule__Channel__Group__7 ;
    public final void rule__Channel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6196:1: ( rule__Channel__Group__6__Impl rule__Channel__Group__7 )
            // InternalMiec.g:6197:2: rule__Channel__Group__6__Impl rule__Channel__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Channel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__6"


    // $ANTLR start "rule__Channel__Group__6__Impl"
    // InternalMiec.g:6204:1: rule__Channel__Group__6__Impl : ( ',' ) ;
    public final void rule__Channel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6208:1: ( ( ',' ) )
            // InternalMiec.g:6209:1: ( ',' )
            {
            // InternalMiec.g:6209:1: ( ',' )
            // InternalMiec.g:6210:2: ','
            {
             before(grammarAccess.getChannelAccess().getCommaKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__6__Impl"


    // $ANTLR start "rule__Channel__Group__7"
    // InternalMiec.g:6219:1: rule__Channel__Group__7 : rule__Channel__Group__7__Impl rule__Channel__Group__8 ;
    public final void rule__Channel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6223:1: ( rule__Channel__Group__7__Impl rule__Channel__Group__8 )
            // InternalMiec.g:6224:2: rule__Channel__Group__7__Impl rule__Channel__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Channel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__7"


    // $ANTLR start "rule__Channel__Group__7__Impl"
    // InternalMiec.g:6231:1: rule__Channel__Group__7__Impl : ( ( rule__Channel__ConnectsAssignment_7 ) ) ;
    public final void rule__Channel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6235:1: ( ( ( rule__Channel__ConnectsAssignment_7 ) ) )
            // InternalMiec.g:6236:1: ( ( rule__Channel__ConnectsAssignment_7 ) )
            {
            // InternalMiec.g:6236:1: ( ( rule__Channel__ConnectsAssignment_7 ) )
            // InternalMiec.g:6237:2: ( rule__Channel__ConnectsAssignment_7 )
            {
             before(grammarAccess.getChannelAccess().getConnectsAssignment_7()); 
            // InternalMiec.g:6238:2: ( rule__Channel__ConnectsAssignment_7 )
            // InternalMiec.g:6238:3: rule__Channel__ConnectsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Channel__ConnectsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getConnectsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__7__Impl"


    // $ANTLR start "rule__Channel__Group__8"
    // InternalMiec.g:6246:1: rule__Channel__Group__8 : rule__Channel__Group__8__Impl rule__Channel__Group__9 ;
    public final void rule__Channel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6250:1: ( rule__Channel__Group__8__Impl rule__Channel__Group__9 )
            // InternalMiec.g:6251:2: rule__Channel__Group__8__Impl rule__Channel__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Channel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__8"


    // $ANTLR start "rule__Channel__Group__8__Impl"
    // InternalMiec.g:6258:1: rule__Channel__Group__8__Impl : ( ( rule__Channel__Group_8__0 )* ) ;
    public final void rule__Channel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6262:1: ( ( ( rule__Channel__Group_8__0 )* ) )
            // InternalMiec.g:6263:1: ( ( rule__Channel__Group_8__0 )* )
            {
            // InternalMiec.g:6263:1: ( ( rule__Channel__Group_8__0 )* )
            // InternalMiec.g:6264:2: ( rule__Channel__Group_8__0 )*
            {
             before(grammarAccess.getChannelAccess().getGroup_8()); 
            // InternalMiec.g:6265:2: ( rule__Channel__Group_8__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==32) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMiec.g:6265:3: rule__Channel__Group_8__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Channel__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getChannelAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__8__Impl"


    // $ANTLR start "rule__Channel__Group__9"
    // InternalMiec.g:6273:1: rule__Channel__Group__9 : rule__Channel__Group__9__Impl rule__Channel__Group__10 ;
    public final void rule__Channel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6277:1: ( rule__Channel__Group__9__Impl rule__Channel__Group__10 )
            // InternalMiec.g:6278:2: rule__Channel__Group__9__Impl rule__Channel__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__Channel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__9"


    // $ANTLR start "rule__Channel__Group__9__Impl"
    // InternalMiec.g:6285:1: rule__Channel__Group__9__Impl : ( '}' ) ;
    public final void rule__Channel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6289:1: ( ( '}' ) )
            // InternalMiec.g:6290:1: ( '}' )
            {
            // InternalMiec.g:6290:1: ( '}' )
            // InternalMiec.g:6291:2: '}'
            {
             before(grammarAccess.getChannelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__9__Impl"


    // $ANTLR start "rule__Channel__Group__10"
    // InternalMiec.g:6300:1: rule__Channel__Group__10 : rule__Channel__Group__10__Impl ;
    public final void rule__Channel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6304:1: ( rule__Channel__Group__10__Impl )
            // InternalMiec.g:6305:2: rule__Channel__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__10"


    // $ANTLR start "rule__Channel__Group__10__Impl"
    // InternalMiec.g:6311:1: rule__Channel__Group__10__Impl : ( ')' ) ;
    public final void rule__Channel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6315:1: ( ( ')' ) )
            // InternalMiec.g:6316:1: ( ')' )
            {
            // InternalMiec.g:6316:1: ( ')' )
            // InternalMiec.g:6317:2: ')'
            {
             before(grammarAccess.getChannelAccess().getRightParenthesisKeyword_10()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__10__Impl"


    // $ANTLR start "rule__Channel__Group_8__0"
    // InternalMiec.g:6327:1: rule__Channel__Group_8__0 : rule__Channel__Group_8__0__Impl rule__Channel__Group_8__1 ;
    public final void rule__Channel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6331:1: ( rule__Channel__Group_8__0__Impl rule__Channel__Group_8__1 )
            // InternalMiec.g:6332:2: rule__Channel__Group_8__0__Impl rule__Channel__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__Channel__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_8__0"


    // $ANTLR start "rule__Channel__Group_8__0__Impl"
    // InternalMiec.g:6339:1: rule__Channel__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Channel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6343:1: ( ( ',' ) )
            // InternalMiec.g:6344:1: ( ',' )
            {
            // InternalMiec.g:6344:1: ( ',' )
            // InternalMiec.g:6345:2: ','
            {
             before(grammarAccess.getChannelAccess().getCommaKeyword_8_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_8__0__Impl"


    // $ANTLR start "rule__Channel__Group_8__1"
    // InternalMiec.g:6354:1: rule__Channel__Group_8__1 : rule__Channel__Group_8__1__Impl ;
    public final void rule__Channel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6358:1: ( rule__Channel__Group_8__1__Impl )
            // InternalMiec.g:6359:2: rule__Channel__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_8__1"


    // $ANTLR start "rule__Channel__Group_8__1__Impl"
    // InternalMiec.g:6365:1: rule__Channel__Group_8__1__Impl : ( ( rule__Channel__ConnectsAssignment_8_1 ) ) ;
    public final void rule__Channel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6369:1: ( ( ( rule__Channel__ConnectsAssignment_8_1 ) ) )
            // InternalMiec.g:6370:1: ( ( rule__Channel__ConnectsAssignment_8_1 ) )
            {
            // InternalMiec.g:6370:1: ( ( rule__Channel__ConnectsAssignment_8_1 ) )
            // InternalMiec.g:6371:2: ( rule__Channel__ConnectsAssignment_8_1 )
            {
             before(grammarAccess.getChannelAccess().getConnectsAssignment_8_1()); 
            // InternalMiec.g:6372:2: ( rule__Channel__ConnectsAssignment_8_1 )
            // InternalMiec.g:6372:3: rule__Channel__ConnectsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Channel__ConnectsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getConnectsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_8__1__Impl"


    // $ANTLR start "rule__PresenceConstraint__Group__0"
    // InternalMiec.g:6381:1: rule__PresenceConstraint__Group__0 : rule__PresenceConstraint__Group__0__Impl rule__PresenceConstraint__Group__1 ;
    public final void rule__PresenceConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6385:1: ( rule__PresenceConstraint__Group__0__Impl rule__PresenceConstraint__Group__1 )
            // InternalMiec.g:6386:2: rule__PresenceConstraint__Group__0__Impl rule__PresenceConstraint__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__PresenceConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresenceConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PresenceConstraint__Group__0"


    // $ANTLR start "rule__PresenceConstraint__Group__0__Impl"
    // InternalMiec.g:6393:1: rule__PresenceConstraint__Group__0__Impl : ( ( rule__PresenceConstraint__OptionalAssignment_0 )? ) ;
    public final void rule__PresenceConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6397:1: ( ( ( rule__PresenceConstraint__OptionalAssignment_0 )? ) )
            // InternalMiec.g:6398:1: ( ( rule__PresenceConstraint__OptionalAssignment_0 )? )
            {
            // InternalMiec.g:6398:1: ( ( rule__PresenceConstraint__OptionalAssignment_0 )? )
            // InternalMiec.g:6399:2: ( rule__PresenceConstraint__OptionalAssignment_0 )?
            {
             before(grammarAccess.getPresenceConstraintAccess().getOptionalAssignment_0()); 
            // InternalMiec.g:6400:2: ( rule__PresenceConstraint__OptionalAssignment_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==61) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMiec.g:6400:3: rule__PresenceConstraint__OptionalAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PresenceConstraint__OptionalAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresenceConstraintAccess().getOptionalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PresenceConstraint__Group__0__Impl"


    // $ANTLR start "rule__PresenceConstraint__Group__1"
    // InternalMiec.g:6408:1: rule__PresenceConstraint__Group__1 : rule__PresenceConstraint__Group__1__Impl rule__PresenceConstraint__Group__2 ;
    public final void rule__PresenceConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6412:1: ( rule__PresenceConstraint__Group__1__Impl rule__PresenceConstraint__Group__2 )
            // InternalMiec.g:6413:2: rule__PresenceConstraint__Group__1__Impl rule__PresenceConstraint__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__PresenceConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PresenceConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PresenceConstraint__Group__1"


    // $ANTLR start "rule__PresenceConstraint__Group__1__Impl"
    // InternalMiec.g:6420:1: rule__PresenceConstraint__Group__1__Impl : ( 'needs' ) ;
    public final void rule__PresenceConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6424:1: ( ( 'needs' ) )
            // InternalMiec.g:6425:1: ( 'needs' )
            {
            // InternalMiec.g:6425:1: ( 'needs' )
            // InternalMiec.g:6426:2: 'needs'
            {
             before(grammarAccess.getPresenceConstraintAccess().getNeedsKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPresenceConstraintAccess().getNeedsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PresenceConstraint__Group__1__Impl"


    // $ANTLR start "rule__PresenceConstraint__Group__2"
    // InternalMiec.g:6435:1: rule__PresenceConstraint__Group__2 : rule__PresenceConstraint__Group__2__Impl ;
    public final void rule__PresenceConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6439:1: ( rule__PresenceConstraint__Group__2__Impl )
            // InternalMiec.g:6440:2: rule__PresenceConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PresenceConstraint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PresenceConstraint__Group__2"


    // $ANTLR start "rule__PresenceConstraint__Group__2__Impl"
    // InternalMiec.g:6446:1: rule__PresenceConstraint__Group__2__Impl : ( ( rule__PresenceConstraint__PropertyNameAssignment_2 ) ) ;
    public final void rule__PresenceConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6450:1: ( ( ( rule__PresenceConstraint__PropertyNameAssignment_2 ) ) )
            // InternalMiec.g:6451:1: ( ( rule__PresenceConstraint__PropertyNameAssignment_2 ) )
            {
            // InternalMiec.g:6451:1: ( ( rule__PresenceConstraint__PropertyNameAssignment_2 ) )
            // InternalMiec.g:6452:2: ( rule__PresenceConstraint__PropertyNameAssignment_2 )
            {
             before(grammarAccess.getPresenceConstraintAccess().getPropertyNameAssignment_2()); 
            // InternalMiec.g:6453:2: ( rule__PresenceConstraint__PropertyNameAssignment_2 )
            // InternalMiec.g:6453:3: rule__PresenceConstraint__PropertyNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PresenceConstraint__PropertyNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPresenceConstraintAccess().getPropertyNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PresenceConstraint__Group__2__Impl"


    // $ANTLR start "rule__OperationConstraint__Group__0"
    // InternalMiec.g:6462:1: rule__OperationConstraint__Group__0 : rule__OperationConstraint__Group__0__Impl rule__OperationConstraint__Group__1 ;
    public final void rule__OperationConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6466:1: ( rule__OperationConstraint__Group__0__Impl rule__OperationConstraint__Group__1 )
            // InternalMiec.g:6467:2: rule__OperationConstraint__Group__0__Impl rule__OperationConstraint__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__OperationConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraint__Group__0"


    // $ANTLR start "rule__OperationConstraint__Group__0__Impl"
    // InternalMiec.g:6474:1: rule__OperationConstraint__Group__0__Impl : ( ( rule__OperationConstraint__OptionalAssignment_0 )? ) ;
    public final void rule__OperationConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6478:1: ( ( ( rule__OperationConstraint__OptionalAssignment_0 )? ) )
            // InternalMiec.g:6479:1: ( ( rule__OperationConstraint__OptionalAssignment_0 )? )
            {
            // InternalMiec.g:6479:1: ( ( rule__OperationConstraint__OptionalAssignment_0 )? )
            // InternalMiec.g:6480:2: ( rule__OperationConstraint__OptionalAssignment_0 )?
            {
             before(grammarAccess.getOperationConstraintAccess().getOptionalAssignment_0()); 
            // InternalMiec.g:6481:2: ( rule__OperationConstraint__OptionalAssignment_0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==61) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMiec.g:6481:3: rule__OperationConstraint__OptionalAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationConstraint__OptionalAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationConstraintAccess().getOptionalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraint__Group__0__Impl"


    // $ANTLR start "rule__OperationConstraint__Group__1"
    // InternalMiec.g:6489:1: rule__OperationConstraint__Group__1 : rule__OperationConstraint__Group__1__Impl rule__OperationConstraint__Group__2 ;
    public final void rule__OperationConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6493:1: ( rule__OperationConstraint__Group__1__Impl rule__OperationConstraint__Group__2 )
            // InternalMiec.g:6494:2: rule__OperationConstraint__Group__1__Impl rule__OperationConstraint__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__OperationConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraint__Group__1"


    // $ANTLR start "rule__OperationConstraint__Group__1__Impl"
    // InternalMiec.g:6501:1: rule__OperationConstraint__Group__1__Impl : ( ( rule__OperationConstraint__PropertyNameAssignment_1 ) ) ;
    public final void rule__OperationConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6505:1: ( ( ( rule__OperationConstraint__PropertyNameAssignment_1 ) ) )
            // InternalMiec.g:6506:1: ( ( rule__OperationConstraint__PropertyNameAssignment_1 ) )
            {
            // InternalMiec.g:6506:1: ( ( rule__OperationConstraint__PropertyNameAssignment_1 ) )
            // InternalMiec.g:6507:2: ( rule__OperationConstraint__PropertyNameAssignment_1 )
            {
             before(grammarAccess.getOperationConstraintAccess().getPropertyNameAssignment_1()); 
            // InternalMiec.g:6508:2: ( rule__OperationConstraint__PropertyNameAssignment_1 )
            // InternalMiec.g:6508:3: rule__OperationConstraint__PropertyNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationConstraint__PropertyNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationConstraintAccess().getPropertyNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraint__Group__1__Impl"


    // $ANTLR start "rule__OperationConstraint__Group__2"
    // InternalMiec.g:6516:1: rule__OperationConstraint__Group__2 : rule__OperationConstraint__Group__2__Impl rule__OperationConstraint__Group__3 ;
    public final void rule__OperationConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6520:1: ( rule__OperationConstraint__Group__2__Impl rule__OperationConstraint__Group__3 )
            // InternalMiec.g:6521:2: rule__OperationConstraint__Group__2__Impl rule__OperationConstraint__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__OperationConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraint__Group__2"


    // $ANTLR start "rule__OperationConstraint__Group__2__Impl"
    // InternalMiec.g:6528:1: rule__OperationConstraint__Group__2__Impl : ( ( rule__OperationConstraint__OperationAssignment_2 ) ) ;
    public final void rule__OperationConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6532:1: ( ( ( rule__OperationConstraint__OperationAssignment_2 ) ) )
            // InternalMiec.g:6533:1: ( ( rule__OperationConstraint__OperationAssignment_2 ) )
            {
            // InternalMiec.g:6533:1: ( ( rule__OperationConstraint__OperationAssignment_2 ) )
            // InternalMiec.g:6534:2: ( rule__OperationConstraint__OperationAssignment_2 )
            {
             before(grammarAccess.getOperationConstraintAccess().getOperationAssignment_2()); 
            // InternalMiec.g:6535:2: ( rule__OperationConstraint__OperationAssignment_2 )
            // InternalMiec.g:6535:3: rule__OperationConstraint__OperationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OperationConstraint__OperationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationConstraintAccess().getOperationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraint__Group__2__Impl"


    // $ANTLR start "rule__OperationConstraint__Group__3"
    // InternalMiec.g:6543:1: rule__OperationConstraint__Group__3 : rule__OperationConstraint__Group__3__Impl ;
    public final void rule__OperationConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6547:1: ( rule__OperationConstraint__Group__3__Impl )
            // InternalMiec.g:6548:2: rule__OperationConstraint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationConstraint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraint__Group__3"


    // $ANTLR start "rule__OperationConstraint__Group__3__Impl"
    // InternalMiec.g:6554:1: rule__OperationConstraint__Group__3__Impl : ( ( rule__OperationConstraint__ValueAssignment_3 ) ) ;
    public final void rule__OperationConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6558:1: ( ( ( rule__OperationConstraint__ValueAssignment_3 ) ) )
            // InternalMiec.g:6559:1: ( ( rule__OperationConstraint__ValueAssignment_3 ) )
            {
            // InternalMiec.g:6559:1: ( ( rule__OperationConstraint__ValueAssignment_3 ) )
            // InternalMiec.g:6560:2: ( rule__OperationConstraint__ValueAssignment_3 )
            {
             before(grammarAccess.getOperationConstraintAccess().getValueAssignment_3()); 
            // InternalMiec.g:6561:2: ( rule__OperationConstraint__ValueAssignment_3 )
            // InternalMiec.g:6561:3: rule__OperationConstraint__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OperationConstraint__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationConstraintAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraint__Group__3__Impl"


    // $ANTLR start "rule__DeviceReference__Group__0"
    // InternalMiec.g:6570:1: rule__DeviceReference__Group__0 : rule__DeviceReference__Group__0__Impl rule__DeviceReference__Group__1 ;
    public final void rule__DeviceReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6574:1: ( rule__DeviceReference__Group__0__Impl rule__DeviceReference__Group__1 )
            // InternalMiec.g:6575:2: rule__DeviceReference__Group__0__Impl rule__DeviceReference__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__DeviceReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceReference__Group__0"


    // $ANTLR start "rule__DeviceReference__Group__0__Impl"
    // InternalMiec.g:6582:1: rule__DeviceReference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__DeviceReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6586:1: ( ( 'ref' ) )
            // InternalMiec.g:6587:1: ( 'ref' )
            {
            // InternalMiec.g:6587:1: ( 'ref' )
            // InternalMiec.g:6588:2: 'ref'
            {
             before(grammarAccess.getDeviceReferenceAccess().getRefKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDeviceReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceReference__Group__0__Impl"


    // $ANTLR start "rule__DeviceReference__Group__1"
    // InternalMiec.g:6597:1: rule__DeviceReference__Group__1 : rule__DeviceReference__Group__1__Impl ;
    public final void rule__DeviceReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6601:1: ( rule__DeviceReference__Group__1__Impl )
            // InternalMiec.g:6602:2: rule__DeviceReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceReference__Group__1"


    // $ANTLR start "rule__DeviceReference__Group__1__Impl"
    // InternalMiec.g:6608:1: rule__DeviceReference__Group__1__Impl : ( ( rule__DeviceReference__ReferenceAssignment_1 ) ) ;
    public final void rule__DeviceReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6612:1: ( ( ( rule__DeviceReference__ReferenceAssignment_1 ) ) )
            // InternalMiec.g:6613:1: ( ( rule__DeviceReference__ReferenceAssignment_1 ) )
            {
            // InternalMiec.g:6613:1: ( ( rule__DeviceReference__ReferenceAssignment_1 ) )
            // InternalMiec.g:6614:2: ( rule__DeviceReference__ReferenceAssignment_1 )
            {
             before(grammarAccess.getDeviceReferenceAccess().getReferenceAssignment_1()); 
            // InternalMiec.g:6615:2: ( rule__DeviceReference__ReferenceAssignment_1 )
            // InternalMiec.g:6615:3: rule__DeviceReference__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceReference__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceReferenceAccess().getReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceReference__Group__1__Impl"


    // $ANTLR start "rule__SelfReference__Group__0"
    // InternalMiec.g:6624:1: rule__SelfReference__Group__0 : rule__SelfReference__Group__0__Impl rule__SelfReference__Group__1 ;
    public final void rule__SelfReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6628:1: ( rule__SelfReference__Group__0__Impl rule__SelfReference__Group__1 )
            // InternalMiec.g:6629:2: rule__SelfReference__Group__0__Impl rule__SelfReference__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__SelfReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelfReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfReference__Group__0"


    // $ANTLR start "rule__SelfReference__Group__0__Impl"
    // InternalMiec.g:6636:1: rule__SelfReference__Group__0__Impl : ( 'self' ) ;
    public final void rule__SelfReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6640:1: ( ( 'self' ) )
            // InternalMiec.g:6641:1: ( 'self' )
            {
            // InternalMiec.g:6641:1: ( 'self' )
            // InternalMiec.g:6642:2: 'self'
            {
             before(grammarAccess.getSelfReferenceAccess().getSelfKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSelfReferenceAccess().getSelfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfReference__Group__0__Impl"


    // $ANTLR start "rule__SelfReference__Group__1"
    // InternalMiec.g:6651:1: rule__SelfReference__Group__1 : rule__SelfReference__Group__1__Impl ;
    public final void rule__SelfReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6655:1: ( rule__SelfReference__Group__1__Impl )
            // InternalMiec.g:6656:2: rule__SelfReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelfReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfReference__Group__1"


    // $ANTLR start "rule__SelfReference__Group__1__Impl"
    // InternalMiec.g:6662:1: rule__SelfReference__Group__1__Impl : ( ( rule__SelfReference__ReferenceAssignment_1 ) ) ;
    public final void rule__SelfReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6666:1: ( ( ( rule__SelfReference__ReferenceAssignment_1 ) ) )
            // InternalMiec.g:6667:1: ( ( rule__SelfReference__ReferenceAssignment_1 ) )
            {
            // InternalMiec.g:6667:1: ( ( rule__SelfReference__ReferenceAssignment_1 ) )
            // InternalMiec.g:6668:2: ( rule__SelfReference__ReferenceAssignment_1 )
            {
             before(grammarAccess.getSelfReferenceAccess().getReferenceAssignment_1()); 
            // InternalMiec.g:6669:2: ( rule__SelfReference__ReferenceAssignment_1 )
            // InternalMiec.g:6669:3: rule__SelfReference__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelfReference__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelfReferenceAccess().getReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfReference__Group__1__Impl"


    // $ANTLR start "rule__Model__ZonesAssignment_1_0"
    // InternalMiec.g:6678:1: rule__Model__ZonesAssignment_1_0 : ( ruleClassicalZone ) ;
    public final void rule__Model__ZonesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6682:1: ( ( ruleClassicalZone ) )
            // InternalMiec.g:6683:2: ( ruleClassicalZone )
            {
            // InternalMiec.g:6683:2: ( ruleClassicalZone )
            // InternalMiec.g:6684:3: ruleClassicalZone
            {
             before(grammarAccess.getModelAccess().getZonesClassicalZoneParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClassicalZone();

            state._fsp--;

             after(grammarAccess.getModelAccess().getZonesClassicalZoneParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ZonesAssignment_1_0"


    // $ANTLR start "rule__Model__ConduitsAssignment_1_1"
    // InternalMiec.g:6693:1: rule__Model__ConduitsAssignment_1_1 : ( ruleConduit ) ;
    public final void rule__Model__ConduitsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6697:1: ( ( ruleConduit ) )
            // InternalMiec.g:6698:2: ( ruleConduit )
            {
            // InternalMiec.g:6698:2: ( ruleConduit )
            // InternalMiec.g:6699:3: ruleConduit
            {
             before(grammarAccess.getModelAccess().getConduitsConduitParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConduit();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConduitsConduitParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConduitsAssignment_1_1"


    // $ANTLR start "rule__ClassicalZone__TrustedAssignment_0"
    // InternalMiec.g:6708:1: rule__ClassicalZone__TrustedAssignment_0 : ( ( 'trusted' ) ) ;
    public final void rule__ClassicalZone__TrustedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6712:1: ( ( ( 'trusted' ) ) )
            // InternalMiec.g:6713:2: ( ( 'trusted' ) )
            {
            // InternalMiec.g:6713:2: ( ( 'trusted' ) )
            // InternalMiec.g:6714:3: ( 'trusted' )
            {
             before(grammarAccess.getClassicalZoneAccess().getTrustedTrustedKeyword_0_0()); 
            // InternalMiec.g:6715:3: ( 'trusted' )
            // InternalMiec.g:6716:4: 'trusted'
            {
             before(grammarAccess.getClassicalZoneAccess().getTrustedTrustedKeyword_0_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getTrustedTrustedKeyword_0_0()); 

            }

             after(grammarAccess.getClassicalZoneAccess().getTrustedTrustedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__TrustedAssignment_0"


    // $ANTLR start "rule__ClassicalZone__PhysicalAssignment_1"
    // InternalMiec.g:6727:1: rule__ClassicalZone__PhysicalAssignment_1 : ( ( 'physical' ) ) ;
    public final void rule__ClassicalZone__PhysicalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6731:1: ( ( ( 'physical' ) ) )
            // InternalMiec.g:6732:2: ( ( 'physical' ) )
            {
            // InternalMiec.g:6732:2: ( ( 'physical' ) )
            // InternalMiec.g:6733:3: ( 'physical' )
            {
             before(grammarAccess.getClassicalZoneAccess().getPhysicalPhysicalKeyword_1_0()); 
            // InternalMiec.g:6734:3: ( 'physical' )
            // InternalMiec.g:6735:4: 'physical'
            {
             before(grammarAccess.getClassicalZoneAccess().getPhysicalPhysicalKeyword_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getPhysicalPhysicalKeyword_1_0()); 

            }

             after(grammarAccess.getClassicalZoneAccess().getPhysicalPhysicalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__PhysicalAssignment_1"


    // $ANTLR start "rule__ClassicalZone__NameAssignment_3"
    // InternalMiec.g:6746:1: rule__ClassicalZone__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ClassicalZone__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6750:1: ( ( RULE_ID ) )
            // InternalMiec.g:6751:2: ( RULE_ID )
            {
            // InternalMiec.g:6751:2: ( RULE_ID )
            // InternalMiec.g:6752:3: RULE_ID
            {
             before(grammarAccess.getClassicalZoneAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassicalZoneAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__NameAssignment_3"


    // $ANTLR start "rule__ClassicalZone__TargetAssignment_6"
    // InternalMiec.g:6761:1: rule__ClassicalZone__TargetAssignment_6 : ( ruleSecurityLevels ) ;
    public final void rule__ClassicalZone__TargetAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6765:1: ( ( ruleSecurityLevels ) )
            // InternalMiec.g:6766:2: ( ruleSecurityLevels )
            {
            // InternalMiec.g:6766:2: ( ruleSecurityLevels )
            // InternalMiec.g:6767:3: ruleSecurityLevels
            {
             before(grammarAccess.getClassicalZoneAccess().getTargetSecurityLevelsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityLevels();

            state._fsp--;

             after(grammarAccess.getClassicalZoneAccess().getTargetSecurityLevelsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__TargetAssignment_6"


    // $ANTLR start "rule__ClassicalZone__ComponentsAssignment_7_3"
    // InternalMiec.g:6776:1: rule__ClassicalZone__ComponentsAssignment_7_3 : ( ruleComponent ) ;
    public final void rule__ClassicalZone__ComponentsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6780:1: ( ( ruleComponent ) )
            // InternalMiec.g:6781:2: ( ruleComponent )
            {
            // InternalMiec.g:6781:2: ( ruleComponent )
            // InternalMiec.g:6782:3: ruleComponent
            {
             before(grammarAccess.getClassicalZoneAccess().getComponentsComponentParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getClassicalZoneAccess().getComponentsComponentParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__ComponentsAssignment_7_3"


    // $ANTLR start "rule__ClassicalZone__ComponentsAssignment_7_4_1"
    // InternalMiec.g:6791:1: rule__ClassicalZone__ComponentsAssignment_7_4_1 : ( ruleComponent ) ;
    public final void rule__ClassicalZone__ComponentsAssignment_7_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6795:1: ( ( ruleComponent ) )
            // InternalMiec.g:6796:2: ( ruleComponent )
            {
            // InternalMiec.g:6796:2: ( ruleComponent )
            // InternalMiec.g:6797:3: ruleComponent
            {
             before(grammarAccess.getClassicalZoneAccess().getComponentsComponentParserRuleCall_7_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getClassicalZoneAccess().getComponentsComponentParserRuleCall_7_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__ComponentsAssignment_7_4_1"


    // $ANTLR start "rule__ClassicalZone__CountermeasuresAssignment_8_3"
    // InternalMiec.g:6806:1: rule__ClassicalZone__CountermeasuresAssignment_8_3 : ( rulecounterMeasure ) ;
    public final void rule__ClassicalZone__CountermeasuresAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6810:1: ( ( rulecounterMeasure ) )
            // InternalMiec.g:6811:2: ( rulecounterMeasure )
            {
            // InternalMiec.g:6811:2: ( rulecounterMeasure )
            // InternalMiec.g:6812:3: rulecounterMeasure
            {
             before(grammarAccess.getClassicalZoneAccess().getCountermeasuresCounterMeasureParserRuleCall_8_3_0()); 
            pushFollow(FOLLOW_2);
            rulecounterMeasure();

            state._fsp--;

             after(grammarAccess.getClassicalZoneAccess().getCountermeasuresCounterMeasureParserRuleCall_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__CountermeasuresAssignment_8_3"


    // $ANTLR start "rule__ClassicalZone__CountermeasuresAssignment_8_4_1"
    // InternalMiec.g:6821:1: rule__ClassicalZone__CountermeasuresAssignment_8_4_1 : ( rulecounterMeasure ) ;
    public final void rule__ClassicalZone__CountermeasuresAssignment_8_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6825:1: ( ( rulecounterMeasure ) )
            // InternalMiec.g:6826:2: ( rulecounterMeasure )
            {
            // InternalMiec.g:6826:2: ( rulecounterMeasure )
            // InternalMiec.g:6827:3: rulecounterMeasure
            {
             before(grammarAccess.getClassicalZoneAccess().getCountermeasuresCounterMeasureParserRuleCall_8_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulecounterMeasure();

            state._fsp--;

             after(grammarAccess.getClassicalZoneAccess().getCountermeasuresCounterMeasureParserRuleCall_8_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__CountermeasuresAssignment_8_4_1"


    // $ANTLR start "rule__ClassicalZone__SubZonesAssignment_9_3"
    // InternalMiec.g:6836:1: rule__ClassicalZone__SubZonesAssignment_9_3 : ( ruleZone ) ;
    public final void rule__ClassicalZone__SubZonesAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6840:1: ( ( ruleZone ) )
            // InternalMiec.g:6841:2: ( ruleZone )
            {
            // InternalMiec.g:6841:2: ( ruleZone )
            // InternalMiec.g:6842:3: ruleZone
            {
             before(grammarAccess.getClassicalZoneAccess().getSubZonesZoneParserRuleCall_9_3_0()); 
            pushFollow(FOLLOW_2);
            ruleZone();

            state._fsp--;

             after(grammarAccess.getClassicalZoneAccess().getSubZonesZoneParserRuleCall_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__SubZonesAssignment_9_3"


    // $ANTLR start "rule__ClassicalZone__SubZonesAssignment_9_4_1"
    // InternalMiec.g:6851:1: rule__ClassicalZone__SubZonesAssignment_9_4_1 : ( ruleZone ) ;
    public final void rule__ClassicalZone__SubZonesAssignment_9_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6855:1: ( ( ruleZone ) )
            // InternalMiec.g:6856:2: ( ruleZone )
            {
            // InternalMiec.g:6856:2: ( ruleZone )
            // InternalMiec.g:6857:3: ruleZone
            {
             before(grammarAccess.getClassicalZoneAccess().getSubZonesZoneParserRuleCall_9_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleZone();

            state._fsp--;

             after(grammarAccess.getClassicalZoneAccess().getSubZonesZoneParserRuleCall_9_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicalZone__SubZonesAssignment_9_4_1"


    // $ANTLR start "rule__SecurityLevels__AccessControlAssignment_1"
    // InternalMiec.g:6866:1: rule__SecurityLevels__AccessControlAssignment_1 : ( ruleSecurityLevel ) ;
    public final void rule__SecurityLevels__AccessControlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6870:1: ( ( ruleSecurityLevel ) )
            // InternalMiec.g:6871:2: ( ruleSecurityLevel )
            {
            // InternalMiec.g:6871:2: ( ruleSecurityLevel )
            // InternalMiec.g:6872:3: ruleSecurityLevel
            {
             before(grammarAccess.getSecurityLevelsAccess().getAccessControlSecurityLevelEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityLevel();

            state._fsp--;

             after(grammarAccess.getSecurityLevelsAccess().getAccessControlSecurityLevelEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__AccessControlAssignment_1"


    // $ANTLR start "rule__SecurityLevels__UseControlAssignment_3"
    // InternalMiec.g:6881:1: rule__SecurityLevels__UseControlAssignment_3 : ( ruleSecurityLevel ) ;
    public final void rule__SecurityLevels__UseControlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6885:1: ( ( ruleSecurityLevel ) )
            // InternalMiec.g:6886:2: ( ruleSecurityLevel )
            {
            // InternalMiec.g:6886:2: ( ruleSecurityLevel )
            // InternalMiec.g:6887:3: ruleSecurityLevel
            {
             before(grammarAccess.getSecurityLevelsAccess().getUseControlSecurityLevelEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityLevel();

            state._fsp--;

             after(grammarAccess.getSecurityLevelsAccess().getUseControlSecurityLevelEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__UseControlAssignment_3"


    // $ANTLR start "rule__SecurityLevels__SystemIntegrityAssignment_5"
    // InternalMiec.g:6896:1: rule__SecurityLevels__SystemIntegrityAssignment_5 : ( ruleSecurityLevel ) ;
    public final void rule__SecurityLevels__SystemIntegrityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6900:1: ( ( ruleSecurityLevel ) )
            // InternalMiec.g:6901:2: ( ruleSecurityLevel )
            {
            // InternalMiec.g:6901:2: ( ruleSecurityLevel )
            // InternalMiec.g:6902:3: ruleSecurityLevel
            {
             before(grammarAccess.getSecurityLevelsAccess().getSystemIntegritySecurityLevelEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityLevel();

            state._fsp--;

             after(grammarAccess.getSecurityLevelsAccess().getSystemIntegritySecurityLevelEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__SystemIntegrityAssignment_5"


    // $ANTLR start "rule__SecurityLevels__DataConfidentialityAssignment_7"
    // InternalMiec.g:6911:1: rule__SecurityLevels__DataConfidentialityAssignment_7 : ( ruleSecurityLevel ) ;
    public final void rule__SecurityLevels__DataConfidentialityAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6915:1: ( ( ruleSecurityLevel ) )
            // InternalMiec.g:6916:2: ( ruleSecurityLevel )
            {
            // InternalMiec.g:6916:2: ( ruleSecurityLevel )
            // InternalMiec.g:6917:3: ruleSecurityLevel
            {
             before(grammarAccess.getSecurityLevelsAccess().getDataConfidentialitySecurityLevelEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityLevel();

            state._fsp--;

             after(grammarAccess.getSecurityLevelsAccess().getDataConfidentialitySecurityLevelEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__DataConfidentialityAssignment_7"


    // $ANTLR start "rule__SecurityLevels__RestrictedDataFlowAssignment_9"
    // InternalMiec.g:6926:1: rule__SecurityLevels__RestrictedDataFlowAssignment_9 : ( ruleSecurityLevel ) ;
    public final void rule__SecurityLevels__RestrictedDataFlowAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6930:1: ( ( ruleSecurityLevel ) )
            // InternalMiec.g:6931:2: ( ruleSecurityLevel )
            {
            // InternalMiec.g:6931:2: ( ruleSecurityLevel )
            // InternalMiec.g:6932:3: ruleSecurityLevel
            {
             before(grammarAccess.getSecurityLevelsAccess().getRestrictedDataFlowSecurityLevelEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityLevel();

            state._fsp--;

             after(grammarAccess.getSecurityLevelsAccess().getRestrictedDataFlowSecurityLevelEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__RestrictedDataFlowAssignment_9"


    // $ANTLR start "rule__SecurityLevels__TimelyResponseAssignment_11"
    // InternalMiec.g:6941:1: rule__SecurityLevels__TimelyResponseAssignment_11 : ( ruleSecurityLevel ) ;
    public final void rule__SecurityLevels__TimelyResponseAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6945:1: ( ( ruleSecurityLevel ) )
            // InternalMiec.g:6946:2: ( ruleSecurityLevel )
            {
            // InternalMiec.g:6946:2: ( ruleSecurityLevel )
            // InternalMiec.g:6947:3: ruleSecurityLevel
            {
             before(grammarAccess.getSecurityLevelsAccess().getTimelyResponseSecurityLevelEnumRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityLevel();

            state._fsp--;

             after(grammarAccess.getSecurityLevelsAccess().getTimelyResponseSecurityLevelEnumRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__TimelyResponseAssignment_11"


    // $ANTLR start "rule__SecurityLevels__ResourceAvailabilityAssignment_13"
    // InternalMiec.g:6956:1: rule__SecurityLevels__ResourceAvailabilityAssignment_13 : ( ruleSecurityLevel ) ;
    public final void rule__SecurityLevels__ResourceAvailabilityAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6960:1: ( ( ruleSecurityLevel ) )
            // InternalMiec.g:6961:2: ( ruleSecurityLevel )
            {
            // InternalMiec.g:6961:2: ( ruleSecurityLevel )
            // InternalMiec.g:6962:3: ruleSecurityLevel
            {
             before(grammarAccess.getSecurityLevelsAccess().getResourceAvailabilitySecurityLevelEnumRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityLevel();

            state._fsp--;

             after(grammarAccess.getSecurityLevelsAccess().getResourceAvailabilitySecurityLevelEnumRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityLevels__ResourceAvailabilityAssignment_13"


    // $ANTLR start "rule__CounterMeasure__NameAssignment_1"
    // InternalMiec.g:6971:1: rule__CounterMeasure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CounterMeasure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6975:1: ( ( RULE_ID ) )
            // InternalMiec.g:6976:2: ( RULE_ID )
            {
            // InternalMiec.g:6976:2: ( RULE_ID )
            // InternalMiec.g:6977:3: RULE_ID
            {
             before(grammarAccess.getCounterMeasureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCounterMeasureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__NameAssignment_1"


    // $ANTLR start "rule__CounterMeasure__CapabilityAssignment_4"
    // InternalMiec.g:6986:1: rule__CounterMeasure__CapabilityAssignment_4 : ( ruleSecurityLevels ) ;
    public final void rule__CounterMeasure__CapabilityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:6990:1: ( ( ruleSecurityLevels ) )
            // InternalMiec.g:6991:2: ( ruleSecurityLevels )
            {
            // InternalMiec.g:6991:2: ( ruleSecurityLevels )
            // InternalMiec.g:6992:3: ruleSecurityLevels
            {
             before(grammarAccess.getCounterMeasureAccess().getCapabilitySecurityLevelsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityLevels();

            state._fsp--;

             after(grammarAccess.getCounterMeasureAccess().getCapabilitySecurityLevelsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CounterMeasure__CapabilityAssignment_4"


    // $ANTLR start "rule__Conduit__TrustedAssignment_0"
    // InternalMiec.g:7001:1: rule__Conduit__TrustedAssignment_0 : ( ( 'trusted' ) ) ;
    public final void rule__Conduit__TrustedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7005:1: ( ( ( 'trusted' ) ) )
            // InternalMiec.g:7006:2: ( ( 'trusted' ) )
            {
            // InternalMiec.g:7006:2: ( ( 'trusted' ) )
            // InternalMiec.g:7007:3: ( 'trusted' )
            {
             before(grammarAccess.getConduitAccess().getTrustedTrustedKeyword_0_0()); 
            // InternalMiec.g:7008:3: ( 'trusted' )
            // InternalMiec.g:7009:4: 'trusted'
            {
             before(grammarAccess.getConduitAccess().getTrustedTrustedKeyword_0_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getTrustedTrustedKeyword_0_0()); 

            }

             after(grammarAccess.getConduitAccess().getTrustedTrustedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__TrustedAssignment_0"


    // $ANTLR start "rule__Conduit__PhysicalAssignment_1"
    // InternalMiec.g:7020:1: rule__Conduit__PhysicalAssignment_1 : ( ( 'physical' ) ) ;
    public final void rule__Conduit__PhysicalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7024:1: ( ( ( 'physical' ) ) )
            // InternalMiec.g:7025:2: ( ( 'physical' ) )
            {
            // InternalMiec.g:7025:2: ( ( 'physical' ) )
            // InternalMiec.g:7026:3: ( 'physical' )
            {
             before(grammarAccess.getConduitAccess().getPhysicalPhysicalKeyword_1_0()); 
            // InternalMiec.g:7027:3: ( 'physical' )
            // InternalMiec.g:7028:4: 'physical'
            {
             before(grammarAccess.getConduitAccess().getPhysicalPhysicalKeyword_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getPhysicalPhysicalKeyword_1_0()); 

            }

             after(grammarAccess.getConduitAccess().getPhysicalPhysicalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__PhysicalAssignment_1"


    // $ANTLR start "rule__Conduit__NameAssignment_3"
    // InternalMiec.g:7039:1: rule__Conduit__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Conduit__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7043:1: ( ( RULE_ID ) )
            // InternalMiec.g:7044:2: ( RULE_ID )
            {
            // InternalMiec.g:7044:2: ( RULE_ID )
            // InternalMiec.g:7045:3: RULE_ID
            {
             before(grammarAccess.getConduitAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__NameAssignment_3"


    // $ANTLR start "rule__Conduit__ConnectsAssignment_7"
    // InternalMiec.g:7054:1: rule__Conduit__ConnectsAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Conduit__ConnectsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7058:1: ( ( ( RULE_ID ) ) )
            // InternalMiec.g:7059:2: ( ( RULE_ID ) )
            {
            // InternalMiec.g:7059:2: ( ( RULE_ID ) )
            // InternalMiec.g:7060:3: ( RULE_ID )
            {
             before(grammarAccess.getConduitAccess().getConnectsClassicalZoneCrossReference_7_0()); 
            // InternalMiec.g:7061:3: ( RULE_ID )
            // InternalMiec.g:7062:4: RULE_ID
            {
             before(grammarAccess.getConduitAccess().getConnectsClassicalZoneIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getConnectsClassicalZoneIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getConduitAccess().getConnectsClassicalZoneCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__ConnectsAssignment_7"


    // $ANTLR start "rule__Conduit__ConnectsAssignment_8_1"
    // InternalMiec.g:7073:1: rule__Conduit__ConnectsAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Conduit__ConnectsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7077:1: ( ( ( RULE_ID ) ) )
            // InternalMiec.g:7078:2: ( ( RULE_ID ) )
            {
            // InternalMiec.g:7078:2: ( ( RULE_ID ) )
            // InternalMiec.g:7079:3: ( RULE_ID )
            {
             before(grammarAccess.getConduitAccess().getConnectsClassicalZoneCrossReference_8_1_0()); 
            // InternalMiec.g:7080:3: ( RULE_ID )
            // InternalMiec.g:7081:4: RULE_ID
            {
             before(grammarAccess.getConduitAccess().getConnectsClassicalZoneIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConduitAccess().getConnectsClassicalZoneIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getConduitAccess().getConnectsClassicalZoneCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__ConnectsAssignment_8_1"


    // $ANTLR start "rule__Conduit__TargetAssignment_12"
    // InternalMiec.g:7092:1: rule__Conduit__TargetAssignment_12 : ( ruleSecurityLevels ) ;
    public final void rule__Conduit__TargetAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7096:1: ( ( ruleSecurityLevels ) )
            // InternalMiec.g:7097:2: ( ruleSecurityLevels )
            {
            // InternalMiec.g:7097:2: ( ruleSecurityLevels )
            // InternalMiec.g:7098:3: ruleSecurityLevels
            {
             before(grammarAccess.getConduitAccess().getTargetSecurityLevelsParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityLevels();

            state._fsp--;

             after(grammarAccess.getConduitAccess().getTargetSecurityLevelsParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__TargetAssignment_12"


    // $ANTLR start "rule__Conduit__ComponentsAssignment_13_3"
    // InternalMiec.g:7107:1: rule__Conduit__ComponentsAssignment_13_3 : ( ruleComponent ) ;
    public final void rule__Conduit__ComponentsAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7111:1: ( ( ruleComponent ) )
            // InternalMiec.g:7112:2: ( ruleComponent )
            {
            // InternalMiec.g:7112:2: ( ruleComponent )
            // InternalMiec.g:7113:3: ruleComponent
            {
             before(grammarAccess.getConduitAccess().getComponentsComponentParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getConduitAccess().getComponentsComponentParserRuleCall_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__ComponentsAssignment_13_3"


    // $ANTLR start "rule__Conduit__ComponentsAssignment_13_4_1"
    // InternalMiec.g:7122:1: rule__Conduit__ComponentsAssignment_13_4_1 : ( ruleComponent ) ;
    public final void rule__Conduit__ComponentsAssignment_13_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7126:1: ( ( ruleComponent ) )
            // InternalMiec.g:7127:2: ( ruleComponent )
            {
            // InternalMiec.g:7127:2: ( ruleComponent )
            // InternalMiec.g:7128:3: ruleComponent
            {
             before(grammarAccess.getConduitAccess().getComponentsComponentParserRuleCall_13_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getConduitAccess().getComponentsComponentParserRuleCall_13_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__ComponentsAssignment_13_4_1"


    // $ANTLR start "rule__Conduit__CountermeasuresAssignment_14_3"
    // InternalMiec.g:7137:1: rule__Conduit__CountermeasuresAssignment_14_3 : ( rulecounterMeasure ) ;
    public final void rule__Conduit__CountermeasuresAssignment_14_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7141:1: ( ( rulecounterMeasure ) )
            // InternalMiec.g:7142:2: ( rulecounterMeasure )
            {
            // InternalMiec.g:7142:2: ( rulecounterMeasure )
            // InternalMiec.g:7143:3: rulecounterMeasure
            {
             before(grammarAccess.getConduitAccess().getCountermeasuresCounterMeasureParserRuleCall_14_3_0()); 
            pushFollow(FOLLOW_2);
            rulecounterMeasure();

            state._fsp--;

             after(grammarAccess.getConduitAccess().getCountermeasuresCounterMeasureParserRuleCall_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__CountermeasuresAssignment_14_3"


    // $ANTLR start "rule__Conduit__CountermeasuresAssignment_14_4_1"
    // InternalMiec.g:7152:1: rule__Conduit__CountermeasuresAssignment_14_4_1 : ( rulecounterMeasure ) ;
    public final void rule__Conduit__CountermeasuresAssignment_14_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7156:1: ( ( rulecounterMeasure ) )
            // InternalMiec.g:7157:2: ( rulecounterMeasure )
            {
            // InternalMiec.g:7157:2: ( rulecounterMeasure )
            // InternalMiec.g:7158:3: rulecounterMeasure
            {
             before(grammarAccess.getConduitAccess().getCountermeasuresCounterMeasureParserRuleCall_14_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulecounterMeasure();

            state._fsp--;

             after(grammarAccess.getConduitAccess().getCountermeasuresCounterMeasureParserRuleCall_14_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__CountermeasuresAssignment_14_4_1"


    // $ANTLR start "rule__Conduit__ChannelsAssignment_15_3"
    // InternalMiec.g:7167:1: rule__Conduit__ChannelsAssignment_15_3 : ( ruleChannel ) ;
    public final void rule__Conduit__ChannelsAssignment_15_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7171:1: ( ( ruleChannel ) )
            // InternalMiec.g:7172:2: ( ruleChannel )
            {
            // InternalMiec.g:7172:2: ( ruleChannel )
            // InternalMiec.g:7173:3: ruleChannel
            {
             before(grammarAccess.getConduitAccess().getChannelsChannelParserRuleCall_15_3_0()); 
            pushFollow(FOLLOW_2);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getConduitAccess().getChannelsChannelParserRuleCall_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__ChannelsAssignment_15_3"


    // $ANTLR start "rule__Conduit__ChannelsAssignment_15_4_1"
    // InternalMiec.g:7182:1: rule__Conduit__ChannelsAssignment_15_4_1 : ( ruleChannel ) ;
    public final void rule__Conduit__ChannelsAssignment_15_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7186:1: ( ( ruleChannel ) )
            // InternalMiec.g:7187:2: ( ruleChannel )
            {
            // InternalMiec.g:7187:2: ( ruleChannel )
            // InternalMiec.g:7188:3: ruleChannel
            {
             before(grammarAccess.getConduitAccess().getChannelsChannelParserRuleCall_15_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getConduitAccess().getChannelsChannelParserRuleCall_15_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conduit__ChannelsAssignment_15_4_1"


    // $ANTLR start "rule__Device__NetworkAssignment_1_0"
    // InternalMiec.g:7197:1: rule__Device__NetworkAssignment_1_0 : ( ( 'network' ) ) ;
    public final void rule__Device__NetworkAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7201:1: ( ( ( 'network' ) ) )
            // InternalMiec.g:7202:2: ( ( 'network' ) )
            {
            // InternalMiec.g:7202:2: ( ( 'network' ) )
            // InternalMiec.g:7203:3: ( 'network' )
            {
             before(grammarAccess.getDeviceAccess().getNetworkNetworkKeyword_1_0_0()); 
            // InternalMiec.g:7204:3: ( 'network' )
            // InternalMiec.g:7205:4: 'network'
            {
             before(grammarAccess.getDeviceAccess().getNetworkNetworkKeyword_1_0_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getNetworkNetworkKeyword_1_0_0()); 

            }

             after(grammarAccess.getDeviceAccess().getNetworkNetworkKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__NetworkAssignment_1_0"


    // $ANTLR start "rule__Device__EmbeddedAssignment_1_1"
    // InternalMiec.g:7216:1: rule__Device__EmbeddedAssignment_1_1 : ( ( 'embedded' ) ) ;
    public final void rule__Device__EmbeddedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7220:1: ( ( ( 'embedded' ) ) )
            // InternalMiec.g:7221:2: ( ( 'embedded' ) )
            {
            // InternalMiec.g:7221:2: ( ( 'embedded' ) )
            // InternalMiec.g:7222:3: ( 'embedded' )
            {
             before(grammarAccess.getDeviceAccess().getEmbeddedEmbeddedKeyword_1_1_0()); 
            // InternalMiec.g:7223:3: ( 'embedded' )
            // InternalMiec.g:7224:4: 'embedded'
            {
             before(grammarAccess.getDeviceAccess().getEmbeddedEmbeddedKeyword_1_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getEmbeddedEmbeddedKeyword_1_1_0()); 

            }

             after(grammarAccess.getDeviceAccess().getEmbeddedEmbeddedKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__EmbeddedAssignment_1_1"


    // $ANTLR start "rule__Device__HostAssignment_1_2"
    // InternalMiec.g:7235:1: rule__Device__HostAssignment_1_2 : ( ( 'host' ) ) ;
    public final void rule__Device__HostAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7239:1: ( ( ( 'host' ) ) )
            // InternalMiec.g:7240:2: ( ( 'host' ) )
            {
            // InternalMiec.g:7240:2: ( ( 'host' ) )
            // InternalMiec.g:7241:3: ( 'host' )
            {
             before(grammarAccess.getDeviceAccess().getHostHostKeyword_1_2_0()); 
            // InternalMiec.g:7242:3: ( 'host' )
            // InternalMiec.g:7243:4: 'host'
            {
             before(grammarAccess.getDeviceAccess().getHostHostKeyword_1_2_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getHostHostKeyword_1_2_0()); 

            }

             after(grammarAccess.getDeviceAccess().getHostHostKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__HostAssignment_1_2"


    // $ANTLR start "rule__Device__NameAssignment_2"
    // InternalMiec.g:7254:1: rule__Device__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Device__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7258:1: ( ( RULE_ID ) )
            // InternalMiec.g:7259:2: ( RULE_ID )
            {
            // InternalMiec.g:7259:2: ( RULE_ID )
            // InternalMiec.g:7260:3: RULE_ID
            {
             before(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__NameAssignment_2"


    // $ANTLR start "rule__Device__CapabilityAssignment_5"
    // InternalMiec.g:7269:1: rule__Device__CapabilityAssignment_5 : ( ruleSecurityLevels ) ;
    public final void rule__Device__CapabilityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7273:1: ( ( ruleSecurityLevels ) )
            // InternalMiec.g:7274:2: ( ruleSecurityLevels )
            {
            // InternalMiec.g:7274:2: ( ruleSecurityLevels )
            // InternalMiec.g:7275:3: ruleSecurityLevels
            {
             before(grammarAccess.getDeviceAccess().getCapabilitySecurityLevelsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityLevels();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getCapabilitySecurityLevelsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__CapabilityAssignment_5"


    // $ANTLR start "rule__Device__PropertiesAssignment_6_3"
    // InternalMiec.g:7284:1: rule__Device__PropertiesAssignment_6_3 : ( ruleProperty ) ;
    public final void rule__Device__PropertiesAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7288:1: ( ( ruleProperty ) )
            // InternalMiec.g:7289:2: ( ruleProperty )
            {
            // InternalMiec.g:7289:2: ( ruleProperty )
            // InternalMiec.g:7290:3: ruleProperty
            {
             before(grammarAccess.getDeviceAccess().getPropertiesPropertyParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getPropertiesPropertyParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__PropertiesAssignment_6_3"


    // $ANTLR start "rule__Device__PropertiesAssignment_6_4_1"
    // InternalMiec.g:7299:1: rule__Device__PropertiesAssignment_6_4_1 : ( ruleProperty ) ;
    public final void rule__Device__PropertiesAssignment_6_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7303:1: ( ( ruleProperty ) )
            // InternalMiec.g:7304:2: ( ruleProperty )
            {
            // InternalMiec.g:7304:2: ( ruleProperty )
            // InternalMiec.g:7305:3: ruleProperty
            {
             before(grammarAccess.getDeviceAccess().getPropertiesPropertyParserRuleCall_6_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getPropertiesPropertyParserRuleCall_6_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__PropertiesAssignment_6_4_1"


    // $ANTLR start "rule__Property__NameAssignment_0"
    // InternalMiec.g:7314:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7318:1: ( ( RULE_ID ) )
            // InternalMiec.g:7319:2: ( RULE_ID )
            {
            // InternalMiec.g:7319:2: ( RULE_ID )
            // InternalMiec.g:7320:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_0"


    // $ANTLR start "rule__Property__ValueAssignment_2"
    // InternalMiec.g:7329:1: rule__Property__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Property__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7333:1: ( ( ruleValue ) )
            // InternalMiec.g:7334:2: ( ruleValue )
            {
            // InternalMiec.g:7334:2: ( ruleValue )
            // InternalMiec.g:7335:3: ruleValue
            {
             before(grammarAccess.getPropertyAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_2"


    // $ANTLR start "rule__System__NameAssignment_2"
    // InternalMiec.g:7344:1: rule__System__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7348:1: ( ( RULE_ID ) )
            // InternalMiec.g:7349:2: ( RULE_ID )
            {
            // InternalMiec.g:7349:2: ( RULE_ID )
            // InternalMiec.g:7350:3: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__NameAssignment_2"


    // $ANTLR start "rule__System__CapabilityAssignment_5"
    // InternalMiec.g:7359:1: rule__System__CapabilityAssignment_5 : ( ruleSecurityLevels ) ;
    public final void rule__System__CapabilityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7363:1: ( ( ruleSecurityLevels ) )
            // InternalMiec.g:7364:2: ( ruleSecurityLevels )
            {
            // InternalMiec.g:7364:2: ( ruleSecurityLevels )
            // InternalMiec.g:7365:3: ruleSecurityLevels
            {
             before(grammarAccess.getSystemAccess().getCapabilitySecurityLevelsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityLevels();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getCapabilitySecurityLevelsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__CapabilityAssignment_5"


    // $ANTLR start "rule__System__DevicesAssignment_6_3"
    // InternalMiec.g:7374:1: rule__System__DevicesAssignment_6_3 : ( ruleDevice ) ;
    public final void rule__System__DevicesAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7378:1: ( ( ruleDevice ) )
            // InternalMiec.g:7379:2: ( ruleDevice )
            {
            // InternalMiec.g:7379:2: ( ruleDevice )
            // InternalMiec.g:7380:3: ruleDevice
            {
             before(grammarAccess.getSystemAccess().getDevicesDeviceParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getDevicesDeviceParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__DevicesAssignment_6_3"


    // $ANTLR start "rule__System__DevicesAssignment_6_4_1"
    // InternalMiec.g:7389:1: rule__System__DevicesAssignment_6_4_1 : ( ruleDevice ) ;
    public final void rule__System__DevicesAssignment_6_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7393:1: ( ( ruleDevice ) )
            // InternalMiec.g:7394:2: ( ruleDevice )
            {
            // InternalMiec.g:7394:2: ( ruleDevice )
            // InternalMiec.g:7395:3: ruleDevice
            {
             before(grammarAccess.getSystemAccess().getDevicesDeviceParserRuleCall_6_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getDevicesDeviceParserRuleCall_6_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__DevicesAssignment_6_4_1"


    // $ANTLR start "rule__System__PropertiesAssignment_7_3"
    // InternalMiec.g:7404:1: rule__System__PropertiesAssignment_7_3 : ( ruleProperty ) ;
    public final void rule__System__PropertiesAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7408:1: ( ( ruleProperty ) )
            // InternalMiec.g:7409:2: ( ruleProperty )
            {
            // InternalMiec.g:7409:2: ( ruleProperty )
            // InternalMiec.g:7410:3: ruleProperty
            {
             before(grammarAccess.getSystemAccess().getPropertiesPropertyParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getPropertiesPropertyParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__PropertiesAssignment_7_3"


    // $ANTLR start "rule__System__PropertiesAssignment_7_4_1"
    // InternalMiec.g:7419:1: rule__System__PropertiesAssignment_7_4_1 : ( ruleProperty ) ;
    public final void rule__System__PropertiesAssignment_7_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7423:1: ( ( ruleProperty ) )
            // InternalMiec.g:7424:2: ( ruleProperty )
            {
            // InternalMiec.g:7424:2: ( ruleProperty )
            // InternalMiec.g:7425:3: ruleProperty
            {
             before(grammarAccess.getSystemAccess().getPropertiesPropertyParserRuleCall_7_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getPropertiesPropertyParserRuleCall_7_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__PropertiesAssignment_7_4_1"


    // $ANTLR start "rule__Application__NameAssignment_2"
    // InternalMiec.g:7434:1: rule__Application__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7438:1: ( ( RULE_ID ) )
            // InternalMiec.g:7439:2: ( RULE_ID )
            {
            // InternalMiec.g:7439:2: ( RULE_ID )
            // InternalMiec.g:7440:3: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__NameAssignment_2"


    // $ANTLR start "rule__Application__ExecutedOnAssignment_6_0"
    // InternalMiec.g:7449:1: rule__Application__ExecutedOnAssignment_6_0 : ( ( RULE_ID ) ) ;
    public final void rule__Application__ExecutedOnAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7453:1: ( ( ( RULE_ID ) ) )
            // InternalMiec.g:7454:2: ( ( RULE_ID ) )
            {
            // InternalMiec.g:7454:2: ( ( RULE_ID ) )
            // InternalMiec.g:7455:3: ( RULE_ID )
            {
             before(grammarAccess.getApplicationAccess().getExecutedOnDeviceCrossReference_6_0_0()); 
            // InternalMiec.g:7456:3: ( RULE_ID )
            // InternalMiec.g:7457:4: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getExecutedOnDeviceIDTerminalRuleCall_6_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getExecutedOnDeviceIDTerminalRuleCall_6_0_0_1()); 

            }

             after(grammarAccess.getApplicationAccess().getExecutedOnDeviceCrossReference_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__ExecutedOnAssignment_6_0"


    // $ANTLR start "rule__Application__CapabilityAssignment_9"
    // InternalMiec.g:7468:1: rule__Application__CapabilityAssignment_9 : ( ruleSecurityLevels ) ;
    public final void rule__Application__CapabilityAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7472:1: ( ( ruleSecurityLevels ) )
            // InternalMiec.g:7473:2: ( ruleSecurityLevels )
            {
            // InternalMiec.g:7473:2: ( ruleSecurityLevels )
            // InternalMiec.g:7474:3: ruleSecurityLevels
            {
             before(grammarAccess.getApplicationAccess().getCapabilitySecurityLevelsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityLevels();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getCapabilitySecurityLevelsParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__CapabilityAssignment_9"


    // $ANTLR start "rule__Application__ConstraintsAssignment_10_3"
    // InternalMiec.g:7483:1: rule__Application__ConstraintsAssignment_10_3 : ( ruleConstraint ) ;
    public final void rule__Application__ConstraintsAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7487:1: ( ( ruleConstraint ) )
            // InternalMiec.g:7488:2: ( ruleConstraint )
            {
            // InternalMiec.g:7488:2: ( ruleConstraint )
            // InternalMiec.g:7489:3: ruleConstraint
            {
             before(grammarAccess.getApplicationAccess().getConstraintsConstraintParserRuleCall_10_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getConstraintsConstraintParserRuleCall_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__ConstraintsAssignment_10_3"


    // $ANTLR start "rule__Application__ConstraintsAssignment_10_4_1"
    // InternalMiec.g:7498:1: rule__Application__ConstraintsAssignment_10_4_1 : ( ruleConstraint ) ;
    public final void rule__Application__ConstraintsAssignment_10_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7502:1: ( ( ruleConstraint ) )
            // InternalMiec.g:7503:2: ( ruleConstraint )
            {
            // InternalMiec.g:7503:2: ( ruleConstraint )
            // InternalMiec.g:7504:3: ruleConstraint
            {
             before(grammarAccess.getApplicationAccess().getConstraintsConstraintParserRuleCall_10_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getConstraintsConstraintParserRuleCall_10_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__ConstraintsAssignment_10_4_1"


    // $ANTLR start "rule__Application__CommunicatesWithAssignment_11_4"
    // InternalMiec.g:7513:1: rule__Application__CommunicatesWithAssignment_11_4 : ( ( RULE_ID ) ) ;
    public final void rule__Application__CommunicatesWithAssignment_11_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7517:1: ( ( ( RULE_ID ) ) )
            // InternalMiec.g:7518:2: ( ( RULE_ID ) )
            {
            // InternalMiec.g:7518:2: ( ( RULE_ID ) )
            // InternalMiec.g:7519:3: ( RULE_ID )
            {
             before(grammarAccess.getApplicationAccess().getCommunicatesWithComponentCrossReference_11_4_0()); 
            // InternalMiec.g:7520:3: ( RULE_ID )
            // InternalMiec.g:7521:4: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getCommunicatesWithComponentIDTerminalRuleCall_11_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCommunicatesWithComponentIDTerminalRuleCall_11_4_0_1()); 

            }

             after(grammarAccess.getApplicationAccess().getCommunicatesWithComponentCrossReference_11_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__CommunicatesWithAssignment_11_4"


    // $ANTLR start "rule__Application__CommunicatesWithAssignment_11_5_1"
    // InternalMiec.g:7532:1: rule__Application__CommunicatesWithAssignment_11_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Application__CommunicatesWithAssignment_11_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7536:1: ( ( ( RULE_ID ) ) )
            // InternalMiec.g:7537:2: ( ( RULE_ID ) )
            {
            // InternalMiec.g:7537:2: ( ( RULE_ID ) )
            // InternalMiec.g:7538:3: ( RULE_ID )
            {
             before(grammarAccess.getApplicationAccess().getCommunicatesWithComponentCrossReference_11_5_1_0()); 
            // InternalMiec.g:7539:3: ( RULE_ID )
            // InternalMiec.g:7540:4: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getCommunicatesWithComponentIDTerminalRuleCall_11_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCommunicatesWithComponentIDTerminalRuleCall_11_5_1_0_1()); 

            }

             after(grammarAccess.getApplicationAccess().getCommunicatesWithComponentCrossReference_11_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__CommunicatesWithAssignment_11_5_1"


    // $ANTLR start "rule__Application__PropertiesAssignment_12_3"
    // InternalMiec.g:7551:1: rule__Application__PropertiesAssignment_12_3 : ( ruleProperty ) ;
    public final void rule__Application__PropertiesAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7555:1: ( ( ruleProperty ) )
            // InternalMiec.g:7556:2: ( ruleProperty )
            {
            // InternalMiec.g:7556:2: ( ruleProperty )
            // InternalMiec.g:7557:3: ruleProperty
            {
             before(grammarAccess.getApplicationAccess().getPropertiesPropertyParserRuleCall_12_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getPropertiesPropertyParserRuleCall_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__PropertiesAssignment_12_3"


    // $ANTLR start "rule__Application__PropertiesAssignment_12_4_1"
    // InternalMiec.g:7566:1: rule__Application__PropertiesAssignment_12_4_1 : ( ruleProperty ) ;
    public final void rule__Application__PropertiesAssignment_12_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7570:1: ( ( ruleProperty ) )
            // InternalMiec.g:7571:2: ( ruleProperty )
            {
            // InternalMiec.g:7571:2: ( ruleProperty )
            // InternalMiec.g:7572:3: ruleProperty
            {
             before(grammarAccess.getApplicationAccess().getPropertiesPropertyParserRuleCall_12_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getPropertiesPropertyParserRuleCall_12_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__PropertiesAssignment_12_4_1"


    // $ANTLR start "rule__Channel__NameAssignment_1"
    // InternalMiec.g:7581:1: rule__Channel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Channel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7585:1: ( ( RULE_ID ) )
            // InternalMiec.g:7586:2: ( RULE_ID )
            {
            // InternalMiec.g:7586:2: ( RULE_ID )
            // InternalMiec.g:7587:3: RULE_ID
            {
             before(grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__NameAssignment_1"


    // $ANTLR start "rule__Channel__ConnectsAssignment_5"
    // InternalMiec.g:7596:1: rule__Channel__ConnectsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Channel__ConnectsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7600:1: ( ( ( RULE_ID ) ) )
            // InternalMiec.g:7601:2: ( ( RULE_ID ) )
            {
            // InternalMiec.g:7601:2: ( ( RULE_ID ) )
            // InternalMiec.g:7602:3: ( RULE_ID )
            {
             before(grammarAccess.getChannelAccess().getConnectsComponentCrossReference_5_0()); 
            // InternalMiec.g:7603:3: ( RULE_ID )
            // InternalMiec.g:7604:4: RULE_ID
            {
             before(grammarAccess.getChannelAccess().getConnectsComponentIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getConnectsComponentIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getChannelAccess().getConnectsComponentCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__ConnectsAssignment_5"


    // $ANTLR start "rule__Channel__ConnectsAssignment_7"
    // InternalMiec.g:7615:1: rule__Channel__ConnectsAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Channel__ConnectsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7619:1: ( ( ( RULE_ID ) ) )
            // InternalMiec.g:7620:2: ( ( RULE_ID ) )
            {
            // InternalMiec.g:7620:2: ( ( RULE_ID ) )
            // InternalMiec.g:7621:3: ( RULE_ID )
            {
             before(grammarAccess.getChannelAccess().getConnectsComponentCrossReference_7_0()); 
            // InternalMiec.g:7622:3: ( RULE_ID )
            // InternalMiec.g:7623:4: RULE_ID
            {
             before(grammarAccess.getChannelAccess().getConnectsComponentIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getConnectsComponentIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getChannelAccess().getConnectsComponentCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__ConnectsAssignment_7"


    // $ANTLR start "rule__Channel__ConnectsAssignment_8_1"
    // InternalMiec.g:7634:1: rule__Channel__ConnectsAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Channel__ConnectsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7638:1: ( ( ( RULE_ID ) ) )
            // InternalMiec.g:7639:2: ( ( RULE_ID ) )
            {
            // InternalMiec.g:7639:2: ( ( RULE_ID ) )
            // InternalMiec.g:7640:3: ( RULE_ID )
            {
             before(grammarAccess.getChannelAccess().getConnectsComponentCrossReference_8_1_0()); 
            // InternalMiec.g:7641:3: ( RULE_ID )
            // InternalMiec.g:7642:4: RULE_ID
            {
             before(grammarAccess.getChannelAccess().getConnectsComponentIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getConnectsComponentIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getChannelAccess().getConnectsComponentCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__ConnectsAssignment_8_1"


    // $ANTLR start "rule__PresenceConstraint__OptionalAssignment_0"
    // InternalMiec.g:7653:1: rule__PresenceConstraint__OptionalAssignment_0 : ( ( 'optional' ) ) ;
    public final void rule__PresenceConstraint__OptionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7657:1: ( ( ( 'optional' ) ) )
            // InternalMiec.g:7658:2: ( ( 'optional' ) )
            {
            // InternalMiec.g:7658:2: ( ( 'optional' ) )
            // InternalMiec.g:7659:3: ( 'optional' )
            {
             before(grammarAccess.getPresenceConstraintAccess().getOptionalOptionalKeyword_0_0()); 
            // InternalMiec.g:7660:3: ( 'optional' )
            // InternalMiec.g:7661:4: 'optional'
            {
             before(grammarAccess.getPresenceConstraintAccess().getOptionalOptionalKeyword_0_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPresenceConstraintAccess().getOptionalOptionalKeyword_0_0()); 

            }

             after(grammarAccess.getPresenceConstraintAccess().getOptionalOptionalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PresenceConstraint__OptionalAssignment_0"


    // $ANTLR start "rule__PresenceConstraint__PropertyNameAssignment_2"
    // InternalMiec.g:7672:1: rule__PresenceConstraint__PropertyNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PresenceConstraint__PropertyNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7676:1: ( ( RULE_ID ) )
            // InternalMiec.g:7677:2: ( RULE_ID )
            {
            // InternalMiec.g:7677:2: ( RULE_ID )
            // InternalMiec.g:7678:3: RULE_ID
            {
             before(grammarAccess.getPresenceConstraintAccess().getPropertyNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPresenceConstraintAccess().getPropertyNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PresenceConstraint__PropertyNameAssignment_2"


    // $ANTLR start "rule__OperationConstraint__OptionalAssignment_0"
    // InternalMiec.g:7687:1: rule__OperationConstraint__OptionalAssignment_0 : ( ( 'optional' ) ) ;
    public final void rule__OperationConstraint__OptionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7691:1: ( ( ( 'optional' ) ) )
            // InternalMiec.g:7692:2: ( ( 'optional' ) )
            {
            // InternalMiec.g:7692:2: ( ( 'optional' ) )
            // InternalMiec.g:7693:3: ( 'optional' )
            {
             before(grammarAccess.getOperationConstraintAccess().getOptionalOptionalKeyword_0_0()); 
            // InternalMiec.g:7694:3: ( 'optional' )
            // InternalMiec.g:7695:4: 'optional'
            {
             before(grammarAccess.getOperationConstraintAccess().getOptionalOptionalKeyword_0_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getOperationConstraintAccess().getOptionalOptionalKeyword_0_0()); 

            }

             after(grammarAccess.getOperationConstraintAccess().getOptionalOptionalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraint__OptionalAssignment_0"


    // $ANTLR start "rule__OperationConstraint__PropertyNameAssignment_1"
    // InternalMiec.g:7706:1: rule__OperationConstraint__PropertyNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OperationConstraint__PropertyNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7710:1: ( ( RULE_ID ) )
            // InternalMiec.g:7711:2: ( RULE_ID )
            {
            // InternalMiec.g:7711:2: ( RULE_ID )
            // InternalMiec.g:7712:3: RULE_ID
            {
             before(grammarAccess.getOperationConstraintAccess().getPropertyNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationConstraintAccess().getPropertyNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraint__PropertyNameAssignment_1"


    // $ANTLR start "rule__OperationConstraint__OperationAssignment_2"
    // InternalMiec.g:7721:1: rule__OperationConstraint__OperationAssignment_2 : ( ruleOperation ) ;
    public final void rule__OperationConstraint__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7725:1: ( ( ruleOperation ) )
            // InternalMiec.g:7726:2: ( ruleOperation )
            {
            // InternalMiec.g:7726:2: ( ruleOperation )
            // InternalMiec.g:7727:3: ruleOperation
            {
             before(grammarAccess.getOperationConstraintAccess().getOperationOperationEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationConstraintAccess().getOperationOperationEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraint__OperationAssignment_2"


    // $ANTLR start "rule__OperationConstraint__ValueAssignment_3"
    // InternalMiec.g:7736:1: rule__OperationConstraint__ValueAssignment_3 : ( ruleValueOrReference ) ;
    public final void rule__OperationConstraint__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7740:1: ( ( ruleValueOrReference ) )
            // InternalMiec.g:7741:2: ( ruleValueOrReference )
            {
            // InternalMiec.g:7741:2: ( ruleValueOrReference )
            // InternalMiec.g:7742:3: ruleValueOrReference
            {
             before(grammarAccess.getOperationConstraintAccess().getValueValueOrReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValueOrReference();

            state._fsp--;

             after(grammarAccess.getOperationConstraintAccess().getValueValueOrReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationConstraint__ValueAssignment_3"


    // $ANTLR start "rule__DeviceReference__ReferenceAssignment_1"
    // InternalMiec.g:7751:1: rule__DeviceReference__ReferenceAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DeviceReference__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7755:1: ( ( RULE_STRING ) )
            // InternalMiec.g:7756:2: ( RULE_STRING )
            {
            // InternalMiec.g:7756:2: ( RULE_STRING )
            // InternalMiec.g:7757:3: RULE_STRING
            {
             before(grammarAccess.getDeviceReferenceAccess().getReferenceSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeviceReferenceAccess().getReferenceSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceReference__ReferenceAssignment_1"


    // $ANTLR start "rule__SelfReference__ReferenceAssignment_1"
    // InternalMiec.g:7766:1: rule__SelfReference__ReferenceAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SelfReference__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7770:1: ( ( RULE_STRING ) )
            // InternalMiec.g:7771:2: ( RULE_STRING )
            {
            // InternalMiec.g:7771:2: ( RULE_STRING )
            // InternalMiec.g:7772:3: RULE_STRING
            {
             before(grammarAccess.getSelfReferenceAccess().getReferenceSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelfReferenceAccess().getReferenceSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfReference__ReferenceAssignment_1"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // InternalMiec.g:7781:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7785:1: ( ( RULE_BOOL ) )
            // InternalMiec.g:7786:2: ( RULE_BOOL )
            {
            // InternalMiec.g:7786:2: ( RULE_BOOL )
            // InternalMiec.g:7787:3: RULE_BOOL
            {
             before(grammarAccess.getBooleanValueAccess().getValueBOOLTerminalRuleCall_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getBooleanValueAccess().getValueBOOLTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalMiec.g:7796:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7800:1: ( ( RULE_STRING ) )
            // InternalMiec.g:7801:2: ( RULE_STRING )
            {
            // InternalMiec.g:7801:2: ( RULE_STRING )
            // InternalMiec.g:7802:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__FloatValue__ValueAssignment"
    // InternalMiec.g:7811:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7815:1: ( ( RULE_FLOAT ) )
            // InternalMiec.g:7816:2: ( RULE_FLOAT )
            {
            // InternalMiec.g:7816:2: ( RULE_FLOAT )
            // InternalMiec.g:7817:3: RULE_FLOAT
            {
             before(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__ValueAssignment"


    // $ANTLR start "rule__IntegerValue__ValueAssignment"
    // InternalMiec.g:7826:1: rule__IntegerValue__ValueAssignment : ( RULE_SINT ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiec.g:7830:1: ( ( RULE_SINT ) )
            // InternalMiec.g:7831:2: ( RULE_SINT )
            {
            // InternalMiec.g:7831:2: ( RULE_SINT )
            // InternalMiec.g:7832:3: RULE_SINT
            {
             before(grammarAccess.getIntegerValueAccess().getValueSINTTerminalRuleCall_0()); 
            match(input,RULE_SINT,FOLLOW_2); 
             after(grammarAccess.getIntegerValueAccess().getValueSINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0300010004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0300010004000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0300000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1C00080000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1C00080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2020000000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2020000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00C00000000001E0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000020L});

}