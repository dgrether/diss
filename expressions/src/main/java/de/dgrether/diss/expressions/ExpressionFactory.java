package de.dgrether.diss.expressions;

public interface ExpressionFactory {

	public Constant createConstant(int c);
	
	public Addition createAddition(Expression left, Expression right);
	
}
