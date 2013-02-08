package de.dgrether.diss.expressions.defaultimpl;

import de.dgrether.diss.expressions.Constant;

public class ConstantImpl implements Constant {

	private int val;
	
	public ConstantImpl(int v){
		this.val = v;
	}
	
	@Override
	public int eval() {
		return this.val;
	}

	@Override
	public String print() {
		return Integer.toString(this.val);
	}

}
