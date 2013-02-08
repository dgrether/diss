package de.dgrether.diss.debugexpressions;

import de.dgrether.diss.expressions.Addition;
import de.dgrether.diss.expressions.Constant;
import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.expressions.ExpressionFactory;

public class DebugExpressionFactory implements ExpressionFactory {

	private ExpressionFactory delegate;

	public DebugExpressionFactory(ExpressionFactory delegate){
		this.delegate = delegate;
	}
	
	@Override
	public Constant createConstant(int c) {
		Constant cons = this.delegate.createConstant(c);
		return new DebugConstant(cons);
	}

	@Override
	public Addition createAddition(Expression left, Expression right) {
		Addition add = this.delegate.createAddition(left, right);
		return new DebugAddition(add);
	}


}
