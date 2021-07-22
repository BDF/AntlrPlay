package org.functionalbrian.antlr.util;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;

public class TestToken implements Token {

	private final String text;
	private final int typeCode;

	public TestToken(String text, int typeCode) {
		this.text = text;
		this.typeCode = typeCode;
	}

	@Override
	public String getText() {
		return text;
	}


	@Override
	public int getType() {
		return typeCode;
	}


	@Override
	public int getLine() {
		return 0;
	}

	@Override
	public int getCharPositionInLine() {
		return 0;
	}


	@Override
	public int getChannel() {
		return 0;
	}


	@Override
	public int getTokenIndex() {
		return 0;
	}

	@Override
	public int getStartIndex() {
		return 0;
	}

	@Override
	public int getStopIndex() {
		return 0;
	}

	@Override
	public TokenSource getTokenSource() {
		return null;
	}

	@Override
	public CharStream getInputStream() {
		return null;
	}
}
