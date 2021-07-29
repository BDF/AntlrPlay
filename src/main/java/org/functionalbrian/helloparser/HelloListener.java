// Generated from /Users/bforeste/software/antlr/AntlrPlay/build/resources/main/Hello.g4 by ANTLR 4.9.2
package org.functionalbrian.helloparser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#testOne}.
	 * @param ctx the parse tree
	 */
	void enterTestOne(HelloParser.TestOneContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#testOne}.
	 * @param ctx the parse tree
	 */
	void exitTestOne(HelloParser.TestOneContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#testTwo}.
	 * @param ctx the parse tree
	 */
	void enterTestTwo(HelloParser.TestTwoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#testTwo}.
	 * @param ctx the parse tree
	 */
	void exitTestTwo(HelloParser.TestTwoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#testTre}.
	 * @param ctx the parse tree
	 */
	void enterTestTre(HelloParser.TestTreContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#testTre}.
	 * @param ctx the parse tree
	 */
	void exitTestTre(HelloParser.TestTreContext ctx);
}