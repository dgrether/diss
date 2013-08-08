package de.dgrether.diss.debug.expressions;

import de.dgrether.diss.expressions.Constant;

public class DebugConstant implements Constant {

	private Constant delegate;

	public DebugConstant(Constant delegate) {
		this.delegate = delegate;
	}

	@Override
	public int eval() {
		System.out.println("Evaluating Constant value: " + this.delegate.print());
		return this.delegate.eval();
	}

	@Override
	public String print() {
		return delegate.print();
	}

}
