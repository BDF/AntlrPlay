package org.functionalbrian.antlr.util;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ListTokenSource;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.Tree;
import org.junit.Assert;

import javax.print.PrintException;
import java.io.IOException;
import java.util.BitSet;
import java.util.List;

public class ParserUtil<P extends  Parser, L extends Lexer> {

	private final P parser;
	private final L lexer;

	public ParserUtil() {
		parser = null;
		lexer = null;
	}

	public ParserUtil(P parser, L lexer) {
		this.parser = parser;
		this.lexer = lexer;
	}

	public P parseString(String input) {
		final CharStream cs = CharStreams.fromString(input);
		lexer.setInputStream(cs);
		P p = parseGivenTokens(lexer.getAllTokens());
		return p;
	}

	public class FailOnErrorListener extends BaseErrorListener {

		@Override
		public void syntaxError(Recognizer<?, ?> recognizer,
								Object offendingSymbol,
								int line,
								int charPositionInLine,
								String msg,
								RecognitionException e) {
			Assert.fail();
		}

		@Override
		public void reportAmbiguity(Parser recognizer,
									DFA dfa,
									int startIndex,
									int stopIndex,
									boolean exact,
									BitSet ambigAlts,
									ATNConfigSet configs)
		{
			Assert.fail();
		}
	}

	public P parseGivenTokens(List<? extends Token> tokens) {
		ListTokenSource lts = new ListTokenSource(tokens);
		CommonTokenStream cts = new CommonTokenStream(lts);

		parser.setBuildParseTree(true);
		parser.setTrace(true);
		parser.setInputStream(cts);

		parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
		parser.addErrorListener(new DiagnosticErrorListener());
		parser.addErrorListener(new FailOnErrorListener());

		return parser;
	}

	public  void writePostScript(Tree prc, String name) {
		try {
			Trees.save(prc, parser, "testing.ps");
		} catch (IOException | PrintException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

}
