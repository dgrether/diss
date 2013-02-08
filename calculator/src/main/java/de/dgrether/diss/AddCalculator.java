package de.dgrether.diss;

import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.expressions.ExpressionFactory;
import de.dgrether.diss.expressions.defaultimpl.DefaultExpressionFactory;

public class AddCalculator implements Calculator {

	private ExpressionFactory factory = new DefaultExpressionFactory();;
	
	public AddCalculator(){}
	
	public int calculate(){
		Expression a = this.factory.createConstant(17);
		Expression b = this.factory.createConstant(4);
		Expression add = this.factory.createAddition(a, b);
		return add.eval();
	}

	public ExpressionFactory getFactory() {
		return factory;
	}

	public void setFactory(ExpressionFactory factory) {
		this.factory = factory;
	}
	
}
