package de.dgrether.diss.expressions.defaultimpl;

import de.dgrether.diss.expressions.Binary;
import de.dgrether.diss.expressions.Expression;

abstract class AbstractBinary implements Binary {
	private Expression left;
	private Expression right;

	public AbstractBinary(Expression left, Expression right){
		this.left = left;
		this.right = right;
	}
	
	public Expression getLeft(){
		return this.left;
	}
	
	public Expression getRight(){
		return this.right;
	}
}