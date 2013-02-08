package de.dgrether.diss.negation.defaultimpl;

import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.negation.Negation;

public class NegationImpl extends AbstractUnary implements Negation {

	public NegationImpl(Expression body) {
		super(body);
	}

	@Override
	public int eval() {
		return - this.getBody().eval();
	}

	@Override
	public String print() {
		return "- (" + this.getBody().print() + ")";
	}

}
