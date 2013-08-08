package de.dgrether.diss.debug;

import de.dgrether.diss.debug.expressions.DebugAddition;
import de.dgrether.diss.debug.expressions.DebugConstant;
import de.dgrether.diss.expressions.Constant;
import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.expressions.defaultimpl.AdditionImpl;
import de.dgrether.diss.expressions.defaultimpl.ConstantImpl;
import de.dgrether.diss.negation.debug.DebugNegation;
import de.dgrether.diss.negation.defaultimpl.NegationImpl;

/**
 * @author dgrether
 */
public class SimpleDebugCalculator {

	public int calculate() {
		Constant a = new ConstantImpl(17);
		Constant b = new ConstantImpl(4);
		DebugConstant a1 = new DebugConstant(a);
		DebugConstant b1 = new DebugConstant(b);
		Expression add = new DebugAddition(new AdditionImpl(a1, b1));
		Expression neg = new DebugNegation(new NegationImpl(add));
		return neg.eval();
	}
}
