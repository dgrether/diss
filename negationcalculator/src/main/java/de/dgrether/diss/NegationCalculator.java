package de.dgrether.diss;

import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.expressions.ExpressionFactory;
import de.dgrether.diss.negation.NegationExpressionFactory;
import de.dgrether.diss.negation.NegationExpressionFactoryImpl;

public class NegationCalculator implements Calculator {
	
	private NegationExpressionFactory factory;
	private AddCalculator delegate;
	
	public NegationCalculator(AddCalculator delegate){
		this.delegate = delegate;
		setFactory(new NegationExpressionFactoryImpl(delegate.getFactory()));
	}
	
	public int calculate() {
		int add = this.delegate.calculate();
		Expression c = this.factory.createConstant(add);
		Expression neg = this.factory.createNegation(c);
		return neg.eval();
	}
	
	public NegationExpressionFactory getFactory() {
		return factory;
	}

	public void setFactory(ExpressionFactory factory) {
		this.factory = (NegationExpressionFactory)factory;
		this.delegate.setFactory(factory);
	}

}
