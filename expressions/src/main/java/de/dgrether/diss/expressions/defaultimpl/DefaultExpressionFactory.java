package de.dgrether.diss.expressions.defaultimpl;

import de.dgrether.diss.expressions.Addition;
import de.dgrether.diss.expressions.Constant;
import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.expressions.ExpressionFactory;

public class DefaultExpressionFactory implements ExpressionFactory {

	@Override
	public Constant createConstant(int c) {
		return new ConstantImpl(c);
	}

	@Override
	public Addition createAddition(Expression left, Expression right) {
		return new AdditionImpl(left, right);
	}

}
