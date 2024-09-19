// Generated from /home/nwb/Source/Repos/be-local-graph-java-04/src/main/antlr4/info/project_act/tessellation/html/HTMLLexer.g4 by ANTLR 4.13.1

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLLexer extends Lexer {
    public static final int
            HTML_COMMENT = 1, HTML_CONDITIONAL_COMMENT = 2, XML = 3, CDATA = 4, DTD = 5, SCRIPTLET = 6,
            SEA_WS = 7, SCRIPT_OPEN = 8, STYLE_OPEN = 9, TAG_OPEN = 10, HTML_TEXT = 11, TAG_CLOSE = 12,
            TAG_SLASH_CLOSE = 13, TAG_SLASH = 14, TAG_EQUALS = 15, TAG_NAME = 16, TAG_WHITESPACE = 17,
            SCRIPT_BODY = 18, SCRIPT_SHORT_BODY = 19, STYLE_BODY = 20, STYLE_SHORT_BODY = 21,
            ATTVALUE_VALUE = 22, ATTRIBUTE = 23;
    public static final int
            TAG = 1, SCRIPT = 2, STYLE = 3, ATTVALUE = 4;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\u0004\u0000\u0017\u017b\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff" +
                    "\uffff\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002" +
                    "\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002" +
                    "\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002" +
                    "\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002" +
                    "\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e" +
                    "\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011" +
                    "\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014" +
                    "\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017" +
                    "\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a" +
                    "\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d" +
                    "\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000" +
                    "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000" +
                    "N\b\u0000\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000" +
                    "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0005\u0001\\\b\u0001\n\u0001\f\u0001_\t\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0001\u0002\u0005\u0002k\b\u0002\n\u0002\f\u0002n\t\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0005\u0003}\b\u0003\n\u0003\f\u0003\u0080\t\u0003\u0001" +
                    "\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0004\u0005\u0004\u008a\b\u0004\n\u0004\f\u0004\u008d\t\u0004" +
                    "\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005" +
                    "\u0005\u0005\u0095\b\u0005\n\u0005\f\u0005\u0098\t\u0005\u0001\u0005\u0001" +
                    "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a0" +
                    "\b\u0005\n\u0005\f\u0005\u00a3\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005" +
                    "\u00a7\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00ab\b\u0006\u0001" +
                    "\u0006\u0004\u0006\u00ae\b\u0006\u000b\u0006\f\u0006\u00af\u0001\u0007" +
                    "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
                    "\u0001\u0007\u0001\u0007\u0005\u0007\u00bb\b\u0007\n\u0007\f\u0007\u00be" +
                    "\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001" +
                    "\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00cc\b\b\n" +
                    "\b\f\b\u00cf\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001" +
                    "\t\u0001\t\u0001\n\u0004\n\u00da\b\n\u000b\n\f\n\u00db\u0001\u000b\u0001" +
                    "\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f" +
                    "\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001" +
                    "\u000f\u0001\u000f\u0005\u000f\u00ef\b\u000f\n\u000f\f\u000f\u00f2\t\u000f" +
                    "\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011" +
                    "\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013" +
                    "\u0003\u0013\u0100\b\u0013\u0001\u0014\u0003\u0014\u0103\b\u0014\u0001" +
                    "\u0015\u0005\u0015\u0106\b\u0015\n\u0015\f\u0015\u0109\t\u0015\u0001\u0015" +
                    "\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015" +
                    "\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016" +
                    "\u0005\u0016\u0118\b\u0016\n\u0016\f\u0016\u011b\t\u0016\u0001\u0016\u0001" +
                    "\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0005" +
                    "\u0017\u0124\b\u0017\n\u0017\f\u0017\u0127\t\u0017\u0001\u0017\u0001\u0017" +
                    "\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017" +
                    "\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0005\u0018\u0135\b\u0018" +
                    "\n\u0018\f\u0018\u0138\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001" +
                    "\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0005\u0019\u0141\b\u0019\n" +
                    "\u0019\f\u0019\u0144\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001" +
                    "\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003" +
                    "\u001a\u014f\b\u001a\u0001\u001b\u0004\u001b\u0152\b\u001b\u000b\u001b" +
                    "\f\u001b\u0153\u0001\u001b\u0003\u001b\u0157\b\u001b\u0001\u001c\u0003" +
                    "\u001c\u015a\b\u001c\u0001\u001d\u0001\u001d\u0004\u001d\u015e\b\u001d" +
                    "\u000b\u001d\f\u001d\u015f\u0001\u001e\u0004\u001e\u0163\b\u001e\u000b" +
                    "\u001e\f\u001e\u0164\u0001\u001e\u0003\u001e\u0168\b\u001e\u0001\u001f" +
                    "\u0001\u001f\u0005\u001f\u016c\b\u001f\n\u001f\f\u001f\u016f\t\u001f\u0001" +
                    "\u001f\u0001\u001f\u0001 \u0001 \u0005 \u0175\b \n \f \u0178\t \u0001" +
                    " \u0001 \rO]l~\u008b\u0096\u00a1\u00bc\u00cd\u0107\u0119\u0125\u0136\u0000" +
                    "!\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f\u0006\u0011" +
                    "\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e" +
                    "!\u000f#\u0010%\u0011\'\u0000)\u0000+\u0000-\u0000/\u00121\u00133\u0014" +
                    "5\u00157\u00169\u0017;\u0000=\u0000?\u0000A\u0000C\u0000E\u0000\u0005" +
                    "\u0000\u0001\u0002\u0003\u0004\u000b\u0002\u0000\t\t  \u0001\u0000<<\u0003" +
                    "\u0000\t\n\r\r  \u0003\u000009AFaf\u0001\u000009\u0002\u0000-.__\u0003" +
                    "\u0000\u00b7\u00b7\u0300\u036f\u203f\u2040\b\u0000::AZaz\u2070\u218f\u2c00" +
                    "\u2fef\u3001\u8000\ud7ff\u8000\uf900\u8000\ufdcf\u8000\ufdf0\u8000\ufffd" +
                    "\u0007\u0000##+;==??AZ__az\u0002\u0000\"\"<<\u0002\u0000\'\'<<\u018e\u0000" +
                    "\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000" +
                    "\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r" +
                    "\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011" +
                    "\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015" +
                    "\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019" +
                    "\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0001\u001d" +
                    "\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0001!\u0001" +
                    "\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000" +
                    "\u0000\u0002/\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0003" +
                    "3\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u00047\u0001" +
                    "\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0005G\u0001\u0000\u0000" +
                    "\u0000\u0007V\u0001\u0000\u0000\u0000\tc\u0001\u0000\u0000\u0000\u000b" +
                    "q\u0001\u0000\u0000\u0000\r\u0085\u0001\u0000\u0000\u0000\u000f\u00a6" +
                    "\u0001\u0000\u0000\u0000\u0011\u00ad\u0001\u0000\u0000\u0000\u0013\u00b1" +
                    "\u0001\u0000\u0000\u0000\u0015\u00c3\u0001\u0000\u0000\u0000\u0017\u00d4" +
                    "\u0001\u0000\u0000\u0000\u0019\u00d9\u0001\u0000\u0000\u0000\u001b\u00dd" +
                    "\u0001\u0000\u0000\u0000\u001d\u00e1\u0001\u0000\u0000\u0000\u001f\u00e6" +
                    "\u0001\u0000\u0000\u0000!\u00e8\u0001\u0000\u0000\u0000#\u00ec\u0001\u0000" +
                    "\u0000\u0000%\u00f3\u0001\u0000\u0000\u0000\'\u00f7\u0001\u0000\u0000" +
                    "\u0000)\u00f9\u0001\u0000\u0000\u0000+\u00ff\u0001\u0000\u0000\u0000-" +
                    "\u0102\u0001\u0000\u0000\u0000/\u0107\u0001\u0000\u0000\u00001\u0119\u0001" +
                    "\u0000\u0000\u00003\u0125\u0001\u0000\u0000\u00005\u0136\u0001\u0000\u0000" +
                    "\u00007\u0142\u0001\u0000\u0000\u00009\u014e\u0001\u0000\u0000\u0000;" +
                    "\u0151\u0001\u0000\u0000\u0000=\u0159\u0001\u0000\u0000\u0000?\u015b\u0001" +
                    "\u0000\u0000\u0000A\u0162\u0001\u0000\u0000\u0000C\u0169\u0001\u0000\u0000" +
                    "\u0000E\u0172\u0001\u0000\u0000\u0000GH\u0005<\u0000\u0000HI\u0005!\u0000" +
                    "\u0000IJ\u0005-\u0000\u0000JK\u0005-\u0000\u0000KO\u0001\u0000\u0000\u0000" +
                    "LN\t\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000" +
                    "OP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000" +
                    "\u0000QO\u0001\u0000\u0000\u0000RS\u0005-\u0000\u0000ST\u0005-\u0000\u0000" +
                    "TU\u0005>\u0000\u0000U\u0006\u0001\u0000\u0000\u0000VW\u0005<\u0000\u0000" +
                    "WX\u0005!\u0000\u0000XY\u0005[\u0000\u0000Y]\u0001\u0000\u0000\u0000Z" +
                    "\\\t\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000" +
                    "\u0000]^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0001\u0000" +
                    "\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005]\u0000\u0000ab\u0005>\u0000" +
                    "\u0000b\b\u0001\u0000\u0000\u0000cd\u0005<\u0000\u0000de\u0005?\u0000" +
                    "\u0000ef\u0005x\u0000\u0000fg\u0005m\u0000\u0000gh\u0005l\u0000\u0000" +
                    "hl\u0001\u0000\u0000\u0000ik\t\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000" +
                    "kn\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000" +
                    "\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005>\u0000" +
                    "\u0000p\n\u0001\u0000\u0000\u0000qr\u0005<\u0000\u0000rs\u0005!\u0000" +
                    "\u0000st\u0005[\u0000\u0000tu\u0005C\u0000\u0000uv\u0005D\u0000\u0000" +
                    "vw\u0005A\u0000\u0000wx\u0005T\u0000\u0000xy\u0005A\u0000\u0000yz\u0005" +
                    "[\u0000\u0000z~\u0001\u0000\u0000\u0000{}\t\u0000\u0000\u0000|{\u0001" +
                    "\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000" +
                    "\u0000~|\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080" +
                    "~\u0001\u0000\u0000\u0000\u0081\u0082\u0005]\u0000\u0000\u0082\u0083\u0005" +
                    "]\u0000\u0000\u0083\u0084\u0005>\u0000\u0000\u0084\f\u0001\u0000\u0000" +
                    "\u0000\u0085\u0086\u0005<\u0000\u0000\u0086\u0087\u0005!\u0000\u0000\u0087" +
                    "\u008b\u0001\u0000\u0000\u0000\u0088\u008a\t\u0000\u0000\u0000\u0089\u0088" +
                    "\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u008c" +
                    "\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008e" +
                    "\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f" +
                    "\u0005>\u0000\u0000\u008f\u000e\u0001\u0000\u0000\u0000\u0090\u0091\u0005" +
                    "<\u0000\u0000\u0091\u0092\u0005?\u0000\u0000\u0092\u0096\u0001\u0000\u0000" +
                    "\u0000\u0093\u0095\t\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000" +
                    "\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000" +
                    "\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000" +
                    "\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009a\u0005?\u0000\u0000\u009a" +
                    "\u00a7\u0005>\u0000\u0000\u009b\u009c\u0005<\u0000\u0000\u009c\u009d\u0005" +
                    "%\u0000\u0000\u009d\u00a1\u0001\u0000\u0000\u0000\u009e\u00a0\t\u0000" +
                    "\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000" +
                    "\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000" +
                    "\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000" +
                    "\u0000\u0000\u00a4\u00a5\u0005%\u0000\u0000\u00a5\u00a7\u0005>\u0000\u0000" +
                    "\u00a6\u0090\u0001\u0000\u0000\u0000\u00a6\u009b\u0001\u0000\u0000\u0000" +
                    "\u00a7\u0010\u0001\u0000\u0000\u0000\u00a8\u00ae\u0007\u0000\u0000\u0000" +
                    "\u00a9\u00ab\u0005\r\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa" +
                    "\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac" +
                    "\u00ae\u0005\n\u0000\u0000\u00ad\u00a8\u0001\u0000\u0000\u0000\u00ad\u00aa" +
                    "\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00ad" +
                    "\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u0012" +
                    "\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005<\u0000\u0000\u00b2\u00b3\u0005" +
                    "s\u0000\u0000\u00b3\u00b4\u0005c\u0000\u0000\u00b4\u00b5\u0005r\u0000" +
                    "\u0000\u00b5\u00b6\u0005i\u0000\u0000\u00b6\u00b7\u0005p\u0000\u0000\u00b7" +
                    "\u00b8\u0005t\u0000\u0000\u00b8\u00bc\u0001\u0000\u0000\u0000\u00b9\u00bb" +
                    "\t\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be\u0001" +
                    "\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001" +
                    "\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc\u0001" +
                    "\u0000\u0000\u0000\u00bf\u00c0\u0005>\u0000\u0000\u00c0\u00c1\u0001\u0000" +
                    "\u0000\u0000\u00c1\u00c2\u0006\u0007\u0000\u0000\u00c2\u0014\u0001\u0000" +
                    "\u0000\u0000\u00c3\u00c4\u0005<\u0000\u0000\u00c4\u00c5\u0005s\u0000\u0000" +
                    "\u00c5\u00c6\u0005t\u0000\u0000\u00c6\u00c7\u0005y\u0000\u0000\u00c7\u00c8" +
                    "\u0005l\u0000\u0000\u00c8\u00c9\u0005e\u0000\u0000\u00c9\u00cd\u0001\u0000" +
                    "\u0000\u0000\u00ca\u00cc\t\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000" +
                    "\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000" +
                    "\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000" +
                    "\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005>\u0000\u0000" +
                    "\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0006\b\u0001\u0000\u00d3" +
                    "\u0016\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005<\u0000\u0000\u00d5\u00d6" +
                    "\u0001\u0000\u0000\u0000\u00d6\u00d7\u0006\t\u0002\u0000\u00d7\u0018\u0001" +
                    "\u0000\u0000\u0000\u00d8\u00da\b\u0001\u0000\u0000\u00d9\u00d8\u0001\u0000" +
                    "\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000" +
                    "\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u001a\u0001\u0000" +
                    "\u0000\u0000\u00dd\u00de\u0005>\u0000\u0000\u00de\u00df\u0001\u0000\u0000" +
                    "\u0000\u00df\u00e0\u0006\u000b\u0003\u0000\u00e0\u001c\u0001\u0000\u0000" +
                    "\u0000\u00e1\u00e2\u0005/\u0000\u0000\u00e2\u00e3\u0005>\u0000\u0000\u00e3" +
                    "\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0006\f\u0003\u0000\u00e5\u001e" +
                    "\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005/\u0000\u0000\u00e7 \u0001\u0000" +
                    "\u0000\u0000\u00e8\u00e9\u0005=\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000" +
                    "\u0000\u00ea\u00eb\u0006\u000e\u0004\u0000\u00eb\"\u0001\u0000\u0000\u0000" +
                    "\u00ec\u00f0\u0003-\u0014\u0000\u00ed\u00ef\u0003+\u0013\u0000\u00ee\u00ed" +
                    "\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee" +
                    "\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1$\u0001" +
                    "\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0007" +
                    "\u0002\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0006" +
                    "\u0010\u0005\u0000\u00f6&\u0001\u0000\u0000\u0000\u00f7\u00f8\u0007\u0003" +
                    "\u0000\u0000\u00f8(\u0001\u0000\u0000\u0000\u00f9\u00fa\u0007\u0004\u0000" +
                    "\u0000\u00fa*\u0001\u0000\u0000\u0000\u00fb\u0100\u0003-\u0014\u0000\u00fc" +
                    "\u0100\u0007\u0005\u0000\u0000\u00fd\u0100\u0003)\u0012\u0000\u00fe\u0100" +
                    "\u0007\u0006\u0000\u0000\u00ff\u00fb\u0001\u0000\u0000\u0000\u00ff\u00fc" +
                    "\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u00fe" +
                    "\u0001\u0000\u0000\u0000\u0100,\u0001\u0000\u0000\u0000\u0101\u0103\u0007" +
                    "\u0007\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103.\u0001\u0000" +
                    "\u0000\u0000\u0104\u0106\t\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000" +
                    "\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000" +
                    "\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000" +
                    "\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010b\u0005<\u0000\u0000" +
                    "\u010b\u010c\u0005/\u0000\u0000\u010c\u010d\u0005s\u0000\u0000\u010d\u010e" +
                    "\u0005c\u0000\u0000\u010e\u010f\u0005r\u0000\u0000\u010f\u0110\u0005i" +
                    "\u0000\u0000\u0110\u0111\u0005p\u0000\u0000\u0111\u0112\u0005t\u0000\u0000" +
                    "\u0112\u0113\u0005>\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114" +
                    "\u0115\u0006\u0015\u0003\u0000\u01150\u0001\u0000\u0000\u0000\u0116\u0118" +
                    "\t\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u011b\u0001" +
                    "\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u0119\u0117\u0001" +
                    "\u0000\u0000\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0119\u0001" +
                    "\u0000\u0000\u0000\u011c\u011d\u0005<\u0000\u0000\u011d\u011e\u0005/\u0000" +
                    "\u0000\u011e\u011f\u0005>\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000" +
                    "\u0120\u0121\u0006\u0016\u0003\u0000\u01212\u0001\u0000\u0000\u0000\u0122" +
                    "\u0124\t\u0000\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u0127" +
                    "\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0125\u0123" +
                    "\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0125" +
                    "\u0001\u0000\u0000\u0000\u0128\u0129\u0005<\u0000\u0000\u0129\u012a\u0005" +
                    "/\u0000\u0000\u012a\u012b\u0005s\u0000\u0000\u012b\u012c\u0005t\u0000" +
                    "\u0000\u012c\u012d\u0005y\u0000\u0000\u012d\u012e\u0005l\u0000\u0000\u012e" +
                    "\u012f\u0005e\u0000\u0000\u012f\u0130\u0005>\u0000\u0000\u0130\u0131\u0001" +
                    "\u0000\u0000\u0000\u0131\u0132\u0006\u0017\u0003\u0000\u01324\u0001\u0000" +
                    "\u0000\u0000\u0133\u0135\t\u0000\u0000\u0000\u0134\u0133\u0001\u0000\u0000" +
                    "\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000" +
                    "\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000\u0000" +
                    "\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013a\u0005<\u0000\u0000" +
                    "\u013a\u013b\u0005/\u0000\u0000\u013b\u013c\u0005>\u0000\u0000\u013c\u013d" +
                    "\u0001\u0000\u0000\u0000\u013d\u013e\u0006\u0018\u0003\u0000\u013e6\u0001" +
                    "\u0000\u0000\u0000\u013f\u0141\u0005 \u0000\u0000\u0140\u013f\u0001\u0000" +
                    "\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000" +
                    "\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0001\u0000" +
                    "\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0146\u00039\u001a" +
                    "\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0006\u0019\u0003" +
                    "\u0000\u01488\u0001\u0000\u0000\u0000\u0149\u014f\u0003C\u001f\u0000\u014a" +
                    "\u014f\u0003E \u0000\u014b\u014f\u0003;\u001b\u0000\u014c\u014f\u0003" +
                    "?\u001d\u0000\u014d\u014f\u0003A\u001e\u0000\u014e\u0149\u0001\u0000\u0000" +
                    "\u0000\u014e\u014a\u0001\u0000\u0000\u0000\u014e\u014b\u0001\u0000\u0000" +
                    "\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014d\u0001\u0000\u0000" +
                    "\u0000\u014f:\u0001\u0000\u0000\u0000\u0150\u0152\u0003=\u001c\u0000\u0151" +
                    "\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153" +
                    "\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154" +
                    "\u0156\u0001\u0000\u0000\u0000\u0155\u0157\u0005 \u0000\u0000\u0156\u0155" +
                    "\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157<\u0001" +
                    "\u0000\u0000\u0000\u0158\u015a\u0007\b\u0000\u0000\u0159\u0158\u0001\u0000" +
                    "\u0000\u0000\u015a>\u0001\u0000\u0000\u0000\u015b\u015d\u0005#\u0000\u0000" +
                    "\u015c\u015e\u0007\u0003\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000" +
                    "\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000" +
                    "\u015f\u0160\u0001\u0000\u0000\u0000\u0160@\u0001\u0000\u0000\u0000\u0161" +
                    "\u0163\u0007\u0004\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163" +
                    "\u0164\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164" +
                    "\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000\u0166" +
                    "\u0168\u0005%\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0167\u0168" +
                    "\u0001\u0000\u0000\u0000\u0168B\u0001\u0000\u0000\u0000\u0169\u016d\u0005" +
                    "\"\u0000\u0000\u016a\u016c\b\t\u0000\u0000\u016b\u016a\u0001\u0000\u0000" +
                    "\u0000\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000" +
                    "\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0170\u0001\u0000\u0000" +
                    "\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0171\u0005\"\u0000\u0000" +
                    "\u0171D\u0001\u0000\u0000\u0000\u0172\u0176\u0005\'\u0000\u0000\u0173" +
                    "\u0175\b\n\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175\u0178" +
                    "\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177" +
                    "\u0001\u0000\u0000\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u0176" +
                    "\u0001\u0000\u0000\u0000\u0179\u017a\u0005\'\u0000\u0000\u017aF\u0001" +
                    "\u0000\u0000\u0000$\u0000\u0001\u0002\u0003\u0004O]l~\u008b\u0096\u00a1" +
                    "\u00a6\u00aa\u00ad\u00af\u00bc\u00cd\u00db\u00f0\u00ff\u0102\u0107\u0119" +
                    "\u0125\u0136\u0142\u014e\u0153\u0156\u0159\u015f\u0164\u0167\u016d\u0176" +
                    "\u0006\u0005\u0002\u0000\u0005\u0003\u0000\u0005\u0001\u0000\u0004\u0000" +
                    "\u0000\u0005\u0004\u0000\u0000\u0001\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE", "TAG", "SCRIPT", "STYLE", "ATTVALUE"
    };

    static {
        RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
    }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public HTMLLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", "SCRIPTLET",
                "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", "TAG_CLOSE",
                "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE",
                "HEXDIGIT", "DIGIT", "TAG_NameChar", "TAG_NameStartChar", "SCRIPT_BODY",
                "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", "ATTVALUE_VALUE",
                "ATTRIBUTE", "ATTCHARS", "ATTCHAR", "HEXCHARS", "DECCHARS", "DOUBLE_QUOTE_STRING",
                "SINGLE_QUOTE_STRING"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, "'<'", null,
                "'>'", "'/>'", "'/'", "'='"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD",
                "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT",
                "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME",
                "TAG_WHITESPACE", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY",
                "ATTVALUE_VALUE", "ATTRIBUTE"
        };
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "HTMLLexer.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}