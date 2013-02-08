package de.dgrether.diss.negation;

import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.expressions.ExpressionFactory;

public interface NegationExpressionFactory extends ExpressionFactory {

	Negation createNegation(Expression exp);
	
}
