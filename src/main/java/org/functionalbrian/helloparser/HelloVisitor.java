// Generated from /Users/bforeste/software/antlr/AntlrPlay/build/resources/main/Hello.g4 by ANTLR 4.9.2
package org.functionalbrian.helloparser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#testOne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestOne(HelloParser.TestOneContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#testTwo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestTwo(HelloParser.TestTwoContext ctx);
}