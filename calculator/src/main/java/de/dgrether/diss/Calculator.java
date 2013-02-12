package de.dgrether.diss;

import de.dgrether.diss.expressions.ExpressionFactory;

public interface Calculator {
	
	public int calculate();

	public ExpressionFactory getFactory();

	public void setFactory(ExpressionFactory factory);
}
