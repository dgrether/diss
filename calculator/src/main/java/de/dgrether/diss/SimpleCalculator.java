package de.dgrether.diss;

import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.expressions.defaultimpl.AdditionImpl;
import de.dgrether.diss.expressions.defaultimpl.ConstantImpl;

public class SimpleCalculator {

	public int calculate() {
		Expression a = new ConstantImpl(5);
		Expression b = new ConstantImpl(3);
		Expression add = new AdditionImpl(a, b);
		return add.eval();
	}
}
