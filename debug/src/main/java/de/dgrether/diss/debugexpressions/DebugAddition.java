package de.dgrether.diss.debugexpressions;

import de.dgrether.diss.expressions.Addition;
import de.dgrether.diss.expressions.Expression;

public class DebugAddition implements Addition {

	private Addition delegate;

	public int eval() {
		System.out.println("Evaluating Addition " + this.print());
		return delegate.eval();
	}

	public String print() {
		return delegate.print();
	}

	public Expression getLeft() {
		return delegate.getLeft();
	}

	public Expression getRight() {
		return delegate.getRight();
	}

	public DebugAddition(Addition add) {
		this.delegate = add;
	}


}
