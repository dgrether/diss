package de.dgrether.diss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author dgrether
 */
public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(new String[] {"./src/main/config/advanced_calculator.xml"});
//		ApplicationContext context = new FileSystemXmlApplicationContext(new String[] {"./src/main/config/debug_calculator.xml"});
		Calculator calc = context.getBean(Calculator.class);
		System.out.println("Result: " + calc.calculate());
	}
}
