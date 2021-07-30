// Generated from /Users/bforeste/software/antlr/AntlrPlay/build/resources/main/Hello.g4 by ANTLR 4.9.2
package org.functionalbrian.helloparser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TERM=1, BR_OP2=2, BR_OP3=3, BR_OP=4, LT=5;
	public static final int
		RULE_testOne = 0, RULE_testTwo = 1, RULE_testTre = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"testOne", "testTwo", "testTre"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TERM", "BR_OP2", "BR_OP3", "BR_OP", "LT"
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TestOneContext extends ParserRuleContext {
		public TerminalNode TERM() { return getToken(HelloParser.TERM, 0); }
		public TerminalNode BR_OP() { return getToken(HelloParser.BR_OP, 0); }
		public TestOneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testOne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTestOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTestOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTestOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestOneContext testOne() throws RecognitionException {
		TestOneContext _localctx = new TestOneContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_testOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(TERM);
			setState(7);
			match(BR_OP);
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

	public static class TestTwoContext extends ParserRuleContext {
		public TerminalNode TERM() { return getToken(HelloParser.TERM, 0); }
		public TerminalNode BR_OP2() { return getToken(HelloParser.BR_OP2, 0); }
		public TestTwoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testTwo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTestTwo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTestTwo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTestTwo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestTwoContext testTwo() throws RecognitionException {
		TestTwoContext _localctx = new TestTwoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_testTwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			match(TERM);
			setState(10);
			match(BR_OP2);
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

	public static class TestTreContext extends ParserRuleContext {
		public TerminalNode TERM() { return getToken(HelloParser.TERM, 0); }
		public TerminalNode BR_OP3() { return getToken(HelloParser.BR_OP3, 0); }
		public TestTreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testTre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTestTre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTestTre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTestTre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestTreContext testTre() throws RecognitionException {
		TestTreContext _localctx = new TestTreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_testTre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(TERM);
			setState(13);
			match(BR_OP3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\22\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2"+
		"\16\2\b\3\2\2\2\4\13\3\2\2\2\6\16\3\2\2\2\b\t\7\3\2\2\t\n\7\6\2\2\n\3"+
		"\3\2\2\2\13\f\7\3\2\2\f\r\7\4\2\2\r\5\3\2\2\2\16\17\7\3\2\2\17\20\7\5"+
		"\2\2\20\7\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}