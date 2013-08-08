package de.dgrether.diss.debug.negation;

import de.dgrether.diss.negation.Negation;

public class DebugNegation implements Negation {

	private Negation delegate;
	
	public DebugNegation(Negation delegate){
		this.delegate = delegate;
	}
	
	@Override
	public int eval() {
		System.out.println("Evaluating Negation " + this.delegate.print());
		return this.delegate.eval();
	}

	@Override
	public String print() {
		return this.delegate.print();
	}

}
