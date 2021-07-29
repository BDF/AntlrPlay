package org.functionalbrian.antlr.util;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ParserRuleContext;
import org.functionalbrian.helloparser.HelloLexer;
import org.functionalbrian.helloparser.HelloParser;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import javax.print.PrintException;
import java.io.IOException;

public class QuickTest {
	ParserUtil<HelloParser, HelloLexer> parserUtil;

	@Before
	public void before() {
		HelloParser embaseLanguageParser = new HelloParser(null);
		HelloLexer ell = new HelloLexer(null);
 		parserUtil = new ParserUtil<>(embaseLanguageParser, ell);
	}

	@Test
	public void why() throws PrintException, IOException {
		String testString = "testing<br";
		HelloParser elp = parserUtil.parseString(testString);
		ParserRuleContext work = elp.testOne();
		Trees.save(work, elp, testString.substring(0, Math.min(10, testString.length())).replaceAll("[\\s\\/]+", "") + ".ps");

	}

	@Test
	public void why2() throws PrintException, IOException {
		String testString = "testing<br";
		HelloParser elp = parserUtil.parseString(testString);
		ParserRuleContext work = elp.testTwo();
		Trees.save(work, elp, testString.substring(0, Math.min(10, testString.length())).replaceAll("[\\s\\/]+", "") + ".ps");
	}


	private void writePS(String testString) throws IOException, PrintException {
		HelloParser elp = parserUtil.parseString(testString);
		ParserRuleContext work = elp.testOne();
		Trees.save(work, elp, testString.substring(0, Math.min(10, testString.length())).replaceAll("[\\s\\/]+", "") + ".ps");
	}
}
