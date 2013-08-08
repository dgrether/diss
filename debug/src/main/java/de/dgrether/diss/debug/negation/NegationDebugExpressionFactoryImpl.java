package de.dgrether.diss.debug.negation;

import de.dgrether.diss.expressions.Addition;
import de.dgrether.diss.expressions.Constant;
import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.negation.Negation;
import de.dgrether.diss.negation.NegationExpressionFactory;

public class NegationDebugExpressionFactoryImpl implements NegationExpressionFactory{

	private NegationExpressionFactory delegate;

	public NegationDebugExpressionFactoryImpl(NegationExpressionFactory delegate){
		this.delegate = delegate;
	}
	
	public Constant createConstant(int c) {
		return delegate.createConstant(c);
	}

	public Addition createAddition(Expression left, Expression right) {
		return delegate.createAddition(left, right);
	}

	public Negation createNegation(Expression exp) {
		return new DebugNegation(delegate.createNegation(exp));
	}
	
}
