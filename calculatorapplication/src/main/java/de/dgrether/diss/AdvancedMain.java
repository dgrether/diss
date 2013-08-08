package de.dgrether.diss;

import de.dgrether.diss.debug.expressions.DebugExpressionFactory;
import de.dgrether.diss.expressions.ExpressionFactory;
import de.dgrether.diss.expressions.defaultimpl.DefaultExpressionFactory;
import de.dgrether.diss.negation.NegationExpressionFactoryImpl;
import de.dgrether.diss.negation.debug.NegationDebugExpressionFactoryImpl;

public class AdvancedMain {

	public static void main(String[] args) {
		AdvancedCalculator calculator = new AdvancedCalculator();
		int result;
		
		System.out.println("default...");
		result = calculator.calculate();
		System.out.println("Result " + result);
		System.out.println();
		
		System.out.println("default debug...");
		ExpressionFactory defaultDebugFac = new DebugExpressionFactory(calculator.getFactory());
		calculator.setFactory(defaultDebugFac);
		result =  calculator.calculate();
		System.out.println("Result " + result);
		System.out.println();
		
		System.out.println("negation works with default debug...");
		AdvancedNegationCalculator negCalculator = new AdvancedNegationCalculator(calculator);
		result = negCalculator.calculate();
		System.out.println("Result " + result);
		System.out.println();
		
		System.out.println("negation without debug");
		negCalculator.setFactory(new NegationExpressionFactoryImpl(new DefaultExpressionFactory()));
		result = negCalculator.calculate();
		System.out.println("Result " + result);
		System.out.println();
//
		System.out.println("of course default still works with new factory...");
		result = calculator.calculate();
		System.out.println("Result " + result);
		System.out.println();
		//		
		System.out.println("negation works with default & negation debug...");
		NegationDebugExpressionFactoryImpl negExpFac = new NegationDebugExpressionFactoryImpl(new NegationExpressionFactoryImpl(defaultDebugFac));
		negCalculator.setFactory(negExpFac);
		result = negCalculator.calculate();
		System.out.println("Result " + result);
		System.out.println();
	}
	
	
}
