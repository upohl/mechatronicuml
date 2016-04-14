package org.muml.cbs.dependencylanguage.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDependencyModelLanguageLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=8;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_MINORMAXKEYWORD=11;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_NUMBER=9;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalDependencyModelLanguageLexer() {;} 
    public InternalDependencyModelLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDependencyModelLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:11:7: ( 'or' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:11:9: 'or'
            {
            match("or"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:12:7: ( 'and' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:12:9: 'and'
            {
            match("and"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:13:7: ( '||' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:13:9: '||'
            {
            match("||"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:14:7: ( '&&' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:14:9: '&&'
            {
            match("&&"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:15:7: ( 'disable' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:15:9: 'disable'
            {
            match("disable"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:16:7: ( 'null' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:16:9: 'null'
            {
            match("null"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:17:7: ( 'ns' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:17:9: 'ns'
            {
            match("ns"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18:7: ( '\\u00B5s' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18:9: '\\u00B5s'
            {
            match("\u00B5s"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:19:7: ( 'ms' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:19:9: 'ms'
            {
            match("ms"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:20:7: ( 's' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:20:9: 's'
            {
            match('s'); 

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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:21:7: ( 'min' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:21:9: 'min'
            {
            match("min"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:22:7: ( 'h' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:22:9: 'h'
            {
            match('h'); 

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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:23:7: ( 'D' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:23:9: 'D'
            {
            match('D'); 

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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:24:7: ( '==' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:24:9: '=='
            {
            match("=="); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:25:7: ( '<>' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:25:9: '<>'
            {
            match("<>"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:26:7: ( '<' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:26:9: '<'
            {
            match('<'); 

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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:27:7: ( '<=' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:27:9: '<='
            {
            match("<="); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:28:7: ( '>=' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:28:9: '>='
            {
            match(">="); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:29:7: ( '>' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:29:9: '>'
            {
            match('>'); 

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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:30:7: ( 'since exactly' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:30:9: 'since exactly'
            {
            match("since exactly"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:31:7: ( 'strictly short than' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:31:9: 'strictly short than'
            {
            match("strictly short than"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:32:7: ( 'shorter than' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:32:9: 'shorter than'
            {
            match("shorter than"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:33:7: ( 'strictly longer than' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:33:9: 'strictly longer than'
            {
            match("strictly longer than"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:34:7: ( 'longer than' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:34:9: 'longer than'
            {
            match("longer than"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:35:7: ( 'entering state' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:35:9: 'entering state'
            {
            match("entering state"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:36:7: ( 'leaving state' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:36:9: 'leaving state'
            {
            match("leaving state"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:37:7: ( 'is active' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:37:9: 'is active'
            {
            match("is active"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:38:7: ( 'is inactive' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:38:9: 'is inactive'
            {
            match("is inactive"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:39:7: ( 'consuming' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:39:9: 'consuming'
            {
            match("consuming"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:40:7: ( 'sending' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:40:9: 'sending'
            {
            match("sending"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:41:7: ( '++' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:41:9: '++'
            {
            match("++"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:42:7: ( '--' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:42:9: '--'
            {
            match("--"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:43:7: ( ':=' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:43:9: ':='
            {
            match(":="); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:44:7: ( '+=' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:44:9: '+='
            {
            match("+="); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:45:7: ( '-=' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:45:9: '-='
            {
            match("-="); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:46:7: ( '+' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:46:9: '+'
            {
            match('+'); 

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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:47:7: ( '-' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:47:9: '-'
            {
            match('-'); 

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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:48:7: ( '*' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:48:9: '*'
            {
            match('*'); 

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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:49:7: ( '/' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:49:9: '/'
            {
            match('/'); 

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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:50:7: ( '%' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:50:9: '%'
            {
            match('%'); 

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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:51:7: ( 'not' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:51:9: 'not'
            {
            match("not"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:52:7: ( 'self' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:52:9: 'self'
            {
            match("self"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:53:7: ( 'first' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:53:9: 'first'
            {
            match("first"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:54:7: ( 'last' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:54:9: 'last'
            {
            match("last"); 


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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:55:7: ( 'prev' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:55:9: 'prev'
            {
            match("prev"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:56:7: ( 'next' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:56:9: 'next'
            {
            match("next"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:57:7: ( ';' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:57:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:58:7: ( 'synchronize' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:58:9: 'synchronize'
            {
            match("synchronize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:59:7: ( 'with' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:59:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:60:7: ( ',' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:60:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:61:7: ( 'using' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:61:9: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:62:7: ( '[' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:62:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:63:7: ( ']' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:63:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:64:7: ( 'of type' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:64:9: 'of type'
            {
            match("of type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:65:7: ( 'forbid state combination' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:65:9: 'forbid state combination'
            {
            match("forbid state combination"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:66:7: ( 'bound states' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:66:9: 'bound states'
            {
            match("bound states"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:67:7: ( 'by' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:67:9: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:68:7: ( 'on' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:68:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:69:7: ( '{' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:69:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:70:7: ( '}' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:70:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:71:7: ( 'if' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:71:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:72:7: ( 'assign' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:72:9: 'assign'
            {
            match("assign"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:73:7: ( 'reset clocks' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:73:9: 'reset clocks'
            {
            match("reset clocks"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:74:7: ( 'merge variable' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:74:9: 'merge variable'
            {
            match("merge variable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:75:7: ( 'into variable' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:75:9: 'into variable'
            {
            match("into variable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:76:7: ( 'merge variables' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:76:9: 'merge variables'
            {
            match("merge variables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:77:7: ( 'into hybridport' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:77:9: 'into hybridport'
            {
            match("into hybridport"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:78:7: ( 'merge clocks' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:78:9: 'merge clocks'
            {
            match("merge clocks"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:79:7: ( 'into' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:79:9: 'into'
            {
            match("into"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:80:7: ( '.' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:80:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:81:7: ( 'transition' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:81:9: 'transition'
            {
            match("transition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:82:7: ( 'combination' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:82:9: 'combination'
            {
            match("combination"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:83:7: ( '(' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:83:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:84:7: ( ')' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:84:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:85:7: ( 'when counted' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:85:9: 'when counted'
            {
            match("when counted"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:86:7: ( 'times' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:86:9: 'times'
            {
            match("times"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:87:7: ( 'delayed by' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:87:9: 'delayed by'
            {
            match("delayed by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:88:7: ( 'state combination' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:88:9: 'state combination'
            {
            match("state combination"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:89:7: ( 'between' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:89:9: 'between'
            {
            match("between"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:90:7: ( 'clock' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:90:9: 'clock'
            {
            match("clock"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:91:7: ( 'for' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:91:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:92:7: ( 'while' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:92:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:93:7: ( 'do' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:93:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:94:7: ( ');' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:94:9: ');'
            {
            match(");"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:95:7: ( 'else' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:95:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:96:7: ( 'elseif' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:96:9: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:97:8: ( 'return' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:97:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:98:8: ( '->' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:98:10: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:99:8: ( 'enable' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:99:10: 'enable'
            {
            match("enable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:100:8: ( 'INIT' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:100:10: 'INIT'
            {
            match("INIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:101:8: ( 'INFINITE' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:101:10: 'INFINITE'
            {
            match("INFINITE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:102:8: ( 'const' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:102:10: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18623:13: ( RULE_INT '.' RULE_INT )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18623:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18625:14: ( ( 'true' | 'false' ) )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18625:16: ( 'true' | 'false' )
            {
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18625:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18625:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18625:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18627:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ ( '(' ( '0' .. '9' )+ ')-->' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ )? )? )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18627:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ ( '(' ( '0' .. '9' )+ ')-->' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ )? )?
            {
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18627:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18627:11: '^'
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

            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18627:40: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ ( '(' ( '0' .. '9' )+ ')-->' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18627:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ ( '(' ( '0' .. '9' )+ ')-->' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ )?
                    {
                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18627:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:
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
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18627:75: ( '(' ( '0' .. '9' )+ ')-->' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='(') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18627:76: '(' ( '0' .. '9' )+ ')-->' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
                            {
                            match('('); 
                            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18627:80: ( '0' .. '9' )+
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
                            	    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18627:81: '0' .. '9'
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

                            match(")-->"); 

                            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18627:99: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
                            int cnt5=0;
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:
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
                            	    if ( cnt5 >= 1 ) break loop5;
                                        EarlyExitException eee =
                                            new EarlyExitException(5, input);
                                        throw eee;
                                }
                                cnt5++;
                            } while (true);


                            }
                            break;

                    }


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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_MINORMAXKEYWORD"
    public final void mRULE_MINORMAXKEYWORD() throws RecognitionException {
        try {
            int _type = RULE_MINORMAXKEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18629:22: ( ( 'maxMessageDelay' | 'minMessageDelay' ) )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18629:24: ( 'maxMessageDelay' | 'minMessageDelay' )
            {
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18629:24: ( 'maxMessageDelay' | 'minMessageDelay' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='m') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='a') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='i') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18629:25: 'maxMessageDelay'
                    {
                    match("maxMessageDelay"); 


                    }
                    break;
                case 2 :
                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18629:43: 'minMessageDelay'
                    {
                    match("minMessageDelay"); 


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
    // $ANTLR end "RULE_MINORMAXKEYWORD"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18631:10: ( ( '0' .. '9' )+ )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18631:12: ( '0' .. '9' )+
            {
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18631:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18631:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18633:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18633:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18633:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18633:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18633:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18633:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18633:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18633:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18633:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18633:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18633:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18635:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18635:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18635:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18635:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18637:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18637:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18637:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18637:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18637:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18637:41: ( '\\r' )? '\\n'
                    {
                    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18637:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18637:41: '\\r'
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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18639:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18639:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18639:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18641:16: ( . )
            // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:18641:18: .
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
        // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | RULE_NUMBER | RULE_BOOLEAN | RULE_ID | RULE_MINORMAXKEYWORD | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=102;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:514: T__98
                {
                mT__98(); 

                }
                break;
            case 86 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:520: T__99
                {
                mT__99(); 

                }
                break;
            case 87 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:526: T__100
                {
                mT__100(); 

                }
                break;
            case 88 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:533: T__101
                {
                mT__101(); 

                }
                break;
            case 89 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:540: T__102
                {
                mT__102(); 

                }
                break;
            case 90 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:547: T__103
                {
                mT__103(); 

                }
                break;
            case 91 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:554: T__104
                {
                mT__104(); 

                }
                break;
            case 92 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:561: T__105
                {
                mT__105(); 

                }
                break;
            case 93 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:568: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 94 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:580: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 95 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:593: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 96 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:601: RULE_MINORMAXKEYWORD
                {
                mRULE_MINORMAXKEYWORD(); 

                }
                break;
            case 97 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:622: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 98 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:631: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 99 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:643: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 100 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:659: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 101 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:675: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 102 :
                // ../org.muml.cbs.dependencylanguage.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalDependencyModelLanguage.g:1:683: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\2\64\2\60\2\64\1\60\1\64\1\112\1\113\1\114\1\60\1\120\1\122\4\64\1\137\1\143\1\60\1\uffff\1\150\1\uffff\2\64\1\uffff\1\64\1\uffff\1\64\2\uffff\1\64\2\uffff\1\64\1\uffff\1\64\1\uffff\1\u0080\1\64\1\u0082\1\60\1\uffff\2\60\2\uffff\1\u0087\1\64\1\u0089\1\uffff\2\64\2\uffff\2\64\1\u008e\1\64\1\u0090\2\64\1\uffff\1\u0093\10\64\11\uffff\6\64\1\u00a5\3\64\15\uffff\4\64\1\uffff\2\64\1\uffff\1\64\2\uffff\1\64\1\u00b3\1\64\2\uffff\1\64\1\uffff\2\64\3\uffff\1\64\2\uffff\1\u0082\5\uffff\1\u00bc\3\64\1\uffff\1\64\1\uffff\1\u00c1\1\64\1\uffff\1\u00c4\17\64\2\uffff\5\64\1\u00dc\7\64\1\uffff\10\64\1\uffff\3\64\1\u00ef\1\uffff\1\u00f0\1\64\1\uffff\7\64\1\u00f9\3\64\1\u00fd\2\64\1\u0101\2\uffff\1\u0103\5\64\1\uffff\1\64\1\u010b\1\u010c\10\64\1\u0115\1\64\1\u0117\4\64\2\uffff\10\64\1\uffff\3\64\1\uffff\3\64\3\uffff\1\64\1\u012d\1\64\1\u012f\1\u0130\1\64\1\u0115\3\uffff\1\u0132\1\u0133\5\64\1\uffff\1\u0139\1\uffff\1\64\1\u013b\3\64\1\uffff\1\64\1\uffff\1\64\1\uffff\6\64\1\u0149\1\u014a\2\uffff\1\64\1\uffff\1\64\2\uffff\1\64\3\uffff\1\64\1\uffff\1\u014f\1\64\1\uffff\1\64\1\uffff\1\u0152\2\64\2\uffff\3\64\1\u0159\1\64\1\uffff\2\64\2\uffff\2\64\1\uffff\1\u015f\1\uffff\2\64\2\uffff\1\64\1\uffff\2\64\2\uffff\1\64\1\uffff\3\64\1\uffff\1\64\1\u016b\1\64\1\uffff\1\64\1\uffff\1\64\1\uffff\1\u0172\2\64\1\uffff\1\64\1\uffff\1\64\2\uffff\1\64\1\uffff\1\64\1\u017a\1\64\1\uffff\1\64\1\u017e\1\u017f\1\uffff\1\64\1\uffff\1\64\2\uffff\1\64\1\uffff\2\64\1\u0188\1\64\4\uffff";
    static final String DFA18_eofS =
        "\u018a\uffff";
    static final String DFA18_minS =
        "\1\0\1\146\1\156\1\174\1\46\2\145\1\163\1\141\3\60\3\75\1\141\1\154\1\146\1\154\1\53\1\55\1\75\1\uffff\1\52\1\uffff\1\141\1\162\1\uffff\1\150\1\uffff\1\163\2\uffff\1\145\2\uffff\1\145\1\uffff\1\151\1\uffff\1\73\1\116\1\56\1\101\1\uffff\2\0\2\uffff\1\50\1\40\1\50\1\uffff\1\144\1\163\2\uffff\1\163\1\154\1\50\1\154\1\50\1\164\1\170\1\uffff\1\50\1\156\1\162\1\170\1\156\1\141\1\157\1\154\1\156\11\uffff\1\156\1\141\1\163\1\141\1\163\1\40\1\50\1\164\1\155\1\157\15\uffff\2\162\1\154\1\145\1\uffff\1\164\1\145\1\uffff\1\151\2\uffff\1\165\1\50\1\164\2\uffff\1\163\1\uffff\1\141\1\155\3\uffff\1\106\2\uffff\1\56\5\uffff\1\50\1\151\2\141\1\uffff\1\154\1\uffff\1\50\1\164\1\uffff\1\50\1\147\1\115\1\143\1\151\1\164\1\162\1\144\1\146\1\143\1\147\1\166\1\164\1\145\1\142\1\145\1\141\1\uffff\1\157\1\163\1\142\1\143\1\163\1\50\1\163\1\166\1\150\1\156\1\154\2\156\1\uffff\1\167\1\145\1\165\1\156\2\145\1\124\1\111\1\uffff\1\147\1\142\1\171\1\50\1\uffff\1\50\1\145\1\uffff\3\145\1\143\1\145\1\164\1\151\1\50\1\150\1\145\1\151\1\50\1\162\1\154\1\50\2\uffff\1\40\1\164\1\151\1\153\1\164\1\151\1\uffff\1\145\2\50\1\40\1\145\1\147\1\144\1\145\1\164\1\162\1\163\1\50\1\163\1\50\1\116\1\156\1\154\1\145\2\uffff\1\163\1\40\1\163\1\40\1\164\1\40\1\145\1\156\1\uffff\2\162\1\156\1\uffff\1\151\1\145\1\146\1\uffff\1\150\1\uffff\1\155\1\50\1\156\2\50\1\144\1\50\3\uffff\2\50\1\40\1\145\1\40\1\156\1\151\1\uffff\1\50\1\uffff\1\111\1\50\1\145\1\144\1\163\1\143\1\163\1\uffff\1\154\1\uffff\1\162\1\147\1\157\1\40\1\147\1\156\2\50\2\uffff\1\151\1\uffff\1\141\2\uffff\1\40\3\uffff\1\156\1\uffff\1\50\1\164\1\uffff\1\124\1\uffff\1\50\1\40\2\141\1\uffff\1\141\1\171\1\40\1\50\1\156\1\uffff\1\40\1\147\2\uffff\1\156\1\164\1\uffff\1\50\1\uffff\1\151\1\105\2\uffff\1\147\1\162\1\147\1\40\2\uffff\1\151\1\uffff\1\40\1\147\1\151\1\uffff\1\157\1\50\1\145\1\151\1\145\1\154\1\172\1\uffff\1\50\1\157\1\156\1\uffff\1\104\1\141\1\104\2\uffff\1\145\1\uffff\1\156\1\50\1\145\1\142\1\145\2\50\1\uffff\3\154\2\uffff\1\141\1\145\1\141\1\171\1\163\1\171\4\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\162\1\163\1\174\1\46\1\157\1\165\2\163\3\172\1\75\1\76\1\75\1\157\1\156\1\163\1\157\1\75\1\76\1\75\1\uffff\1\57\1\uffff\1\157\1\162\1\uffff\1\151\1\uffff\1\163\2\uffff\1\171\2\uffff\1\145\1\uffff\1\162\1\uffff\1\73\1\116\1\71\1\172\1\uffff\2\uffff\2\uffff\1\172\1\40\1\172\1\uffff\1\144\1\163\2\uffff\1\163\1\154\1\172\1\154\1\172\1\164\1\170\1\uffff\1\172\1\156\1\162\1\170\1\156\1\162\1\157\2\156\11\uffff\1\156\1\141\1\163\1\164\1\163\1\40\1\172\1\164\1\156\1\157\15\uffff\2\162\1\154\1\145\1\uffff\1\164\1\151\1\uffff\1\151\2\uffff\1\165\1\172\1\164\2\uffff\1\164\1\uffff\1\165\1\155\3\uffff\1\111\2\uffff\1\71\5\uffff\1\172\1\151\2\141\1\uffff\1\154\1\uffff\1\172\1\164\1\uffff\1\172\1\147\1\115\1\143\1\151\1\164\1\162\1\144\1\146\1\143\1\147\1\166\1\164\1\145\1\142\1\145\1\151\1\uffff\1\157\1\163\1\142\1\143\1\163\1\172\1\163\1\166\1\150\1\156\1\154\2\156\1\uffff\1\167\1\145\1\165\1\156\2\145\1\124\1\111\1\uffff\1\147\1\142\1\171\1\172\1\uffff\1\172\1\145\1\uffff\3\145\1\143\1\145\1\164\1\151\1\172\1\150\1\145\1\151\1\172\1\162\1\154\1\172\2\uffff\1\172\1\165\1\151\1\153\1\164\1\151\1\uffff\1\145\2\172\1\40\1\145\1\147\1\144\1\145\1\164\1\162\1\163\1\172\1\163\1\172\1\116\1\156\1\154\1\145\2\uffff\1\163\1\40\1\163\1\40\1\164\1\40\1\145\1\156\1\uffff\2\162\1\156\1\uffff\1\151\1\145\1\146\1\uffff\1\166\1\uffff\1\155\1\172\1\156\2\172\1\144\1\172\3\uffff\2\172\1\40\1\145\1\40\1\156\1\151\1\uffff\1\172\1\uffff\1\111\1\172\1\145\1\144\1\163\1\166\1\163\1\uffff\1\154\1\uffff\1\162\1\147\1\157\1\40\1\147\1\156\2\172\2\uffff\1\151\1\uffff\1\141\2\uffff\1\40\3\uffff\1\156\1\uffff\1\172\1\164\1\uffff\1\124\1\uffff\1\172\1\40\2\141\1\uffff\1\141\1\171\1\40\1\172\1\156\1\uffff\1\40\1\147\2\uffff\1\156\1\164\1\uffff\1\172\1\uffff\1\151\1\105\2\uffff\1\147\1\162\1\147\1\40\2\uffff\1\151\1\uffff\1\40\1\147\1\151\1\uffff\1\157\1\172\1\145\1\151\1\145\1\163\1\172\1\uffff\1\172\1\157\1\156\1\uffff\1\104\1\141\1\104\2\uffff\1\145\1\uffff\1\156\1\172\1\145\1\142\1\145\2\172\1\uffff\3\154\2\uffff\1\141\1\145\1\141\1\171\1\163\1\171\4\uffff";
    static final String DFA18_acceptS =
        "\26\uffff\1\46\1\uffff\1\50\2\uffff\1\57\1\uffff\1\62\1\uffff\1\64\1\65\1\uffff\1\73\1\74\1\uffff\1\106\1\uffff\1\111\4\uffff\1\137\2\uffff\1\145\1\146\3\uffff\1\137\2\uffff\1\3\1\4\7\uffff\1\10\11\uffff\1\12\1\14\1\15\1\16\1\17\1\21\1\20\1\22\1\23\12\uffff\1\37\1\42\1\44\1\40\1\43\1\130\1\45\1\41\1\46\1\143\1\144\1\47\1\50\4\uffff\1\57\2\uffff\1\62\1\uffff\1\64\1\65\3\uffff\1\73\1\74\1\uffff\1\106\2\uffff\1\111\1\124\1\112\1\uffff\1\141\1\135\1\uffff\1\142\1\145\1\1\1\66\1\72\4\uffff\1\123\1\uffff\1\7\2\uffff\1\11\21\uffff\1\75\15\uffff\1\71\10\uffff\1\2\4\uffff\1\51\2\uffff\1\13\17\uffff\1\33\1\34\6\uffff\1\121\22\uffff\1\6\1\56\10\uffff\1\52\3\uffff\1\54\3\uffff\1\125\1\uffff\1\105\7\uffff\1\55\1\61\1\113\7\uffff\1\136\1\uffff\1\132\7\uffff\1\24\1\uffff\1\116\10\uffff\1\101\1\103\1\uffff\1\134\1\uffff\1\120\1\53\1\uffff\1\122\1\63\1\70\1\uffff\1\77\2\uffff\1\114\1\uffff\1\76\4\uffff\1\104\5\uffff\1\30\2\uffff\1\131\1\126\2\uffff\1\67\1\uffff\1\127\2\uffff\1\5\1\115\4\uffff\1\26\1\36\1\uffff\1\32\3\uffff\1\117\7\uffff\1\31\3\uffff\1\133\3\uffff\1\25\1\27\1\uffff\1\35\7\uffff\1\107\3\uffff\1\60\1\110\6\uffff\1\137\1\102\1\100\1\137";
    static final String DFA18_specialS =
        "\1\2\54\uffff\1\0\1\1\u015b\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\60\1\55\2\60\1\30\1\4\1\56\1\47\1\50\1\26\1\23\1\35\1\24\1\45\1\27\12\52\1\25\1\33\1\15\1\14\1\16\2\60\3\54\1\13\4\54\1\51\21\54\1\37\1\60\1\40\1\53\1\54\1\60\1\2\1\41\1\22\1\5\1\20\1\31\1\54\1\12\1\21\2\54\1\17\1\10\1\6\1\1\1\32\1\54\1\44\1\11\1\46\1\36\1\54\1\34\3\54\1\42\1\3\1\43\67\60\1\7\uff4a\60",
            "\1\62\7\uffff\1\63\3\uffff\1\61",
            "\1\65\4\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\72\3\uffff\1\71\5\uffff\1\73",
            "\1\77\11\uffff\1\76\3\uffff\1\75\1\uffff\1\74",
            "\1\100",
            "\1\104\3\uffff\1\103\3\uffff\1\102\11\uffff\1\101",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\110\2\64\1\107\1\105\12\64\1\106\4\64\1\111\1\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\115",
            "\1\117\1\116",
            "\1\121",
            "\1\125\3\uffff\1\124\11\uffff\1\123",
            "\1\127\1\uffff\1\126",
            "\1\131\7\uffff\1\132\4\uffff\1\130",
            "\1\134\2\uffff\1\133",
            "\1\135\21\uffff\1\136",
            "\1\140\17\uffff\1\141\1\142",
            "\1\144",
            "",
            "\1\146\4\uffff\1\147",
            "",
            "\1\154\7\uffff\1\152\5\uffff\1\153",
            "\1\155",
            "",
            "\1\160\1\157",
            "",
            "\1\162",
            "",
            "",
            "\1\167\11\uffff\1\165\11\uffff\1\166",
            "",
            "",
            "\1\172",
            "",
            "\1\175\10\uffff\1\174",
            "",
            "\1\177",
            "\1\u0081",
            "\1\u0083\1\uffff\12\u0084",
            "\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\0\u0085",
            "\0\u0085",
            "",
            "",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0088",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u008f",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0099\20\uffff\1\u0098",
            "\1\u009a",
            "\1\u009c\1\uffff\1\u009b",
            "\1\u009d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a2\22\uffff\1\u00a1",
            "\1\u00a3",
            "\1\u00a4",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00a6",
            "\1\u00a8\1\u00a7",
            "\1\u00a9",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af\3\uffff\1\u00b0",
            "",
            "\1\u00b1",
            "",
            "",
            "\1\u00b2",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00b4",
            "",
            "",
            "\1\u00b5\1\u00b6",
            "",
            "\1\u00b7\23\uffff\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "",
            "\1\u00bb\2\uffff\1\u00ba",
            "",
            "",
            "\1\u0083\1\uffff\12\u0084",
            "",
            "",
            "",
            "",
            "",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00c2",
            "",
            "\1\64\7\uffff\12\64\7\uffff\14\64\1\u00c3\15\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4\7\uffff\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\u00db\30\64",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00fe",
            "\1\u00ff",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0100\21\64",
            "",
            "",
            "\1\u0102\7\uffff\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0105\1\u0104",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0116",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "",
            "",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "",
            "\1\u012b\15\uffff\1\u012a",
            "",
            "\1\u012c",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u012e",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0131",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u013a",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u0140\22\uffff\1\u013f",
            "\1\u0141",
            "",
            "\1\u0142",
            "",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u014b",
            "",
            "\1\u014c",
            "",
            "",
            "\1\u014d",
            "",
            "",
            "",
            "\1\u014e",
            "",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0150",
            "",
            "\1\u0151",
            "",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u015a",
            "",
            "\1\u015b",
            "\1\u015c",
            "",
            "",
            "\1\u015d",
            "\1\u015e",
            "",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0160",
            "\1\u0161",
            "",
            "",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "",
            "",
            "\1\u0166",
            "",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "\1\u016a",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u0170\6\uffff\1\u016f",
            "\1\u0171",
            "",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0173",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "",
            "",
            "\1\u0178",
            "",
            "\1\u0179",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\7\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "",
            "",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0189",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    static class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | RULE_NUMBER | RULE_BOOLEAN | RULE_ID | RULE_MINORMAXKEYWORD | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_45 = input.LA(1);

                        s = -1;
                        if ( ((LA18_45>='\u0000' && LA18_45<='\uFFFF')) ) {s = 133;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_46 = input.LA(1);

                        s = -1;
                        if ( ((LA18_46>='\u0000' && LA18_46<='\uFFFF')) ) {s = 133;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='o') ) {s = 1;}

                        else if ( (LA18_0=='a') ) {s = 2;}

                        else if ( (LA18_0=='|') ) {s = 3;}

                        else if ( (LA18_0=='&') ) {s = 4;}

                        else if ( (LA18_0=='d') ) {s = 5;}

                        else if ( (LA18_0=='n') ) {s = 6;}

                        else if ( (LA18_0=='\u00B5') ) {s = 7;}

                        else if ( (LA18_0=='m') ) {s = 8;}

                        else if ( (LA18_0=='s') ) {s = 9;}

                        else if ( (LA18_0=='h') ) {s = 10;}

                        else if ( (LA18_0=='D') ) {s = 11;}

                        else if ( (LA18_0=='=') ) {s = 12;}

                        else if ( (LA18_0=='<') ) {s = 13;}

                        else if ( (LA18_0=='>') ) {s = 14;}

                        else if ( (LA18_0=='l') ) {s = 15;}

                        else if ( (LA18_0=='e') ) {s = 16;}

                        else if ( (LA18_0=='i') ) {s = 17;}

                        else if ( (LA18_0=='c') ) {s = 18;}

                        else if ( (LA18_0=='+') ) {s = 19;}

                        else if ( (LA18_0=='-') ) {s = 20;}

                        else if ( (LA18_0==':') ) {s = 21;}

                        else if ( (LA18_0=='*') ) {s = 22;}

                        else if ( (LA18_0=='/') ) {s = 23;}

                        else if ( (LA18_0=='%') ) {s = 24;}

                        else if ( (LA18_0=='f') ) {s = 25;}

                        else if ( (LA18_0=='p') ) {s = 26;}

                        else if ( (LA18_0==';') ) {s = 27;}

                        else if ( (LA18_0=='w') ) {s = 28;}

                        else if ( (LA18_0==',') ) {s = 29;}

                        else if ( (LA18_0=='u') ) {s = 30;}

                        else if ( (LA18_0=='[') ) {s = 31;}

                        else if ( (LA18_0==']') ) {s = 32;}

                        else if ( (LA18_0=='b') ) {s = 33;}

                        else if ( (LA18_0=='{') ) {s = 34;}

                        else if ( (LA18_0=='}') ) {s = 35;}

                        else if ( (LA18_0=='r') ) {s = 36;}

                        else if ( (LA18_0=='.') ) {s = 37;}

                        else if ( (LA18_0=='t') ) {s = 38;}

                        else if ( (LA18_0=='(') ) {s = 39;}

                        else if ( (LA18_0==')') ) {s = 40;}

                        else if ( (LA18_0=='I') ) {s = 41;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 42;}

                        else if ( (LA18_0=='^') ) {s = 43;}

                        else if ( ((LA18_0>='A' && LA18_0<='C')||(LA18_0>='E' && LA18_0<='H')||(LA18_0>='J' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='g'||(LA18_0>='j' && LA18_0<='k')||LA18_0=='q'||LA18_0=='v'||(LA18_0>='x' && LA18_0<='z')) ) {s = 44;}

                        else if ( (LA18_0=='\"') ) {s = 45;}

                        else if ( (LA18_0=='\'') ) {s = 46;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 47;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='$')||(LA18_0>='?' && LA18_0<='@')||LA18_0=='\\'||LA18_0=='`'||(LA18_0>='~' && LA18_0<='\u00B4')||(LA18_0>='\u00B6' && LA18_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}