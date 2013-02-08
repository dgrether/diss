package de.dgrether.diss.expressions.defaultimpl;

import de.dgrether.diss.expressions.Addition;
import de.dgrether.diss.expressions.Expression;

public class AdditionImpl extends AbstractBinary implements Addition {

	public AdditionImpl(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int eval() {
		return getLeft().eval() + getRight().eval();
	}

	@Override
	public String print() {
		return this.getLeft().print() + " + " + this.getRight().print();
	}
	
}