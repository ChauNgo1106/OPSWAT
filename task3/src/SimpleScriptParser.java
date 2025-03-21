// Generated from ./SimpleScript.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WORD=6, NUMBER=7, WHITESPACE=8;
	public static final int
		RULE_script = 0, RULE_command = 1, RULE_printCmd = 2, RULE_addCmd = 3, 
		RULE_substractCmd = 4, RULE_exitCmd = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "command", "printCmd", "addCmd", "substractCmd", "exitCmd"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'result'", "'add'", "'substract'", "'exit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WORD", "NUMBER", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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
	public String getGrammarFileName() { return "SimpleScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			command();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public PrintCmdContext printCmd() {
			return getRuleContext(PrintCmdContext.class,0);
		}
		public AddCmdContext addCmd() {
			return getRuleContext(AddCmdContext.class,0);
		}
		public SubstractCmdContext substractCmd() {
			return getRuleContext(SubstractCmdContext.class,0);
		}
		public ExitCmdContext exitCmd() {
			return getRuleContext(ExitCmdContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				printCmd();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				addCmd();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				substractCmd();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(17);
				exitCmd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintCmdContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(SimpleScriptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SimpleScriptParser.WORD, i);
		}
		public PrintCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).enterPrintCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).exitPrintCmd(this);
		}
	}

	public final PrintCmdContext printCmd() throws RecognitionException {
		PrintCmdContext _localctx = new PrintCmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_printCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(21);
					match(WORD);
					}
					}
					setState(24); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				}
				break;
			case T__1:
				{
				setState(26);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddCmdContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SimpleScriptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SimpleScriptParser.NUMBER, i);
		}
		public AddCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).enterAddCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).exitAddCmd(this);
		}
	}

	public final AddCmdContext addCmd() throws RecognitionException {
		AddCmdContext _localctx = new AddCmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__2);
			setState(30);
			match(NUMBER);
			setState(31);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubstractCmdContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SimpleScriptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SimpleScriptParser.NUMBER, i);
		}
		public SubstractCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substractCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).enterSubstractCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).exitSubstractCmd(this);
		}
	}

	public final SubstractCmdContext substractCmd() throws RecognitionException {
		SubstractCmdContext _localctx = new SubstractCmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_substractCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__3);
			setState(34);
			match(NUMBER);
			setState(35);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExitCmdContext extends ParserRuleContext {
		public ExitCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).enterExitCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).exitExitCmd(this);
		}
	}

	public final ExitCmdContext exitCmd() throws RecognitionException {
		ExitCmdContext _localctx = new ExitCmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exitCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\b(\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0002\u0001\u0002\u0004"+
		"\u0002\u0017\b\u0002\u000b\u0002\f\u0002\u0018\u0001\u0002\u0003\u0002"+
		"\u001c\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000&\u0000\f\u0001"+
		"\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u0014\u0001"+
		"\u0000\u0000\u0000\u0006\u001d\u0001\u0000\u0000\u0000\b!\u0001\u0000"+
		"\u0000\u0000\n%\u0001\u0000\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r"+
		"\u0001\u0001\u0000\u0000\u0000\u000e\u0013\u0003\u0004\u0002\u0000\u000f"+
		"\u0013\u0003\u0006\u0003\u0000\u0010\u0013\u0003\b\u0004\u0000\u0011\u0013"+
		"\u0003\n\u0005\u0000\u0012\u000e\u0001\u0000\u0000\u0000\u0012\u000f\u0001"+
		"\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0003\u0001\u0000\u0000\u0000\u0014\u001b\u0005"+
		"\u0001\u0000\u0000\u0015\u0017\u0005\u0006\u0000\u0000\u0016\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001c\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0005\u0002\u0000\u0000\u001b\u0016\u0001"+
		"\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u0005\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005\u0003\u0000\u0000\u001e\u001f\u0005"+
		"\u0007\u0000\u0000\u001f \u0005\u0007\u0000\u0000 \u0007\u0001\u0000\u0000"+
		"\u0000!\"\u0005\u0004\u0000\u0000\"#\u0005\u0007\u0000\u0000#$\u0005\u0007"+
		"\u0000\u0000$\t\u0001\u0000\u0000\u0000%&\u0005\u0005\u0000\u0000&\u000b"+
		"\u0001\u0000\u0000\u0000\u0003\u0012\u0018\u001b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}