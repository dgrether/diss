package de.dgrether.diss;

import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.expressions.defaultimpl.ConstantImpl;
import de.dgrether.diss.negation.Negation;
import de.dgrether.diss.negation.defaultimpl.NegationImpl;

/**
 * @author dgrether
 */
public class SimpleNegationCalculator extends SimpleCalculator {
	
	public int calculate() {
		int add = super.calculate();
		Expression c = new ConstantImpl(add);
		Negation neg = new NegationImpl(c);
		return neg.eval();
	}
}
