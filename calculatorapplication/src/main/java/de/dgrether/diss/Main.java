package de.dgrether.diss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import de.dgrether.diss.debugexpressions.DebugExpressionFactory;
import de.dgrether.diss.expressions.ExpressionFactory;
import de.dgrether.diss.expressions.defaultimpl.DefaultExpressionFactory;
import de.dgrether.diss.negation.NegationExpressionFactoryImpl;
import de.dgrether.diss.negation.debug.NegationDebugExpressionFactoryImpl;

public class Main {

	public static void main(String[] args) {
//		ApplicationContext context = new FileSystemXmlApplicationContext(new String[] {"./src/main/config/addCalculator.xml"});
		ApplicationContext context = new FileSystemXmlApplicationContext(new String[] {"./src/main/config/debugCalculator.xml"});
		Calculator calc = context.getBean(Calculator.class);
		System.out.println("Result: " + calc.calculate());
	}
	
	public static void mainOld(String[] args) {
		AddCalculator calculator = new AddCalculator();
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
		NegationCalculator negCalculator = new NegationCalculator(calculator);
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
