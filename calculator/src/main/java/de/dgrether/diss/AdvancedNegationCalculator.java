package de.dgrether.diss;

import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.negation.NegationExpressionFactory;
import de.dgrether.diss.negation.NegationExpressionFactoryImpl;

public class AdvancedNegationCalculator implements Calculator {
	
	private NegationExpressionFactory factory;
	private AdvancedCalculator delegate;
	
	public AdvancedNegationCalculator(AdvancedCalculator delegate){
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

	public void setFactory(NegationExpressionFactory factory) {
		this.factory = factory;
		this.delegate.setFactory(factory);
	}

}
