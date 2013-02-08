package de.dgrether.diss.negation;

import de.dgrether.diss.expressions.Addition;
import de.dgrether.diss.expressions.Constant;
import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.expressions.ExpressionFactory;
import de.dgrether.diss.negation.defaultimpl.NegationImpl;

public class NegationExpressionFactoryImpl implements NegationExpressionFactory{

	private ExpressionFactory delegate;

	public NegationExpressionFactoryImpl(ExpressionFactory delegate){
		this.delegate = delegate;
	}
	
	@Override
	public Constant createConstant(int c) {
		return delegate.createConstant(c);
	}

	@Override
	public Addition createAddition(Expression left, Expression right) {
		return delegate.createAddition(left, right);
	}

	@Override
	public Negation createNegation(Expression exp) {
		return new NegationImpl(exp);
	}
	
	

}
