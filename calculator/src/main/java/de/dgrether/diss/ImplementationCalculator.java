package de.dgrether.diss;

import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.expressions.defaultimpl.AdditionImpl;
import de.dgrether.diss.expressions.defaultimpl.ConstantImpl;

public class ImplementationCalculator {

	
	public int calculate() {
		Expression a = new ConstantImpl(5);
		Expression b = new ConstantImpl(3);
		Expression add = new AdditionImpl(a, b);
		int result = add.eval();
		System.out.println("Result " + result);
		return result;
	}
}
