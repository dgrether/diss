package de.dgrether.diss;

import de.dgrether.diss.debug.SimpleDebugCalculator;

/**
 * @author dgrether
 */
public class SimpleMain {

	public static void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();
		System.out.println("Result: " + calculator.calculate());
		
		SimpleNegationCalculator negCalculator = new SimpleNegationCalculator();
		System.out.println("Result: " + negCalculator.calculate());
	
		SimpleDebugCalculator dbCalculator = new SimpleDebugCalculator();
		System.out.println("Result: " + dbCalculator.calculate());
	
	}

}
