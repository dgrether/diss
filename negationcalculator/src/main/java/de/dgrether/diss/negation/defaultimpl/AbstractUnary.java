package de.dgrether.diss.negation.defaultimpl;

import de.dgrether.diss.expressions.Expression;
import de.dgrether.diss.negation.Unary;

public abstract class AbstractUnary implements Unary {

	private Expression body;
	
	public AbstractUnary(Expression body){
		this.body = body;
	}
	
	Expression getBody(){
		return this.body;
	}
}
