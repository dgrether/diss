package de.dgrether.diss.expressions;

public interface Binary extends Expression {
	Expression getLeft();
	Expression getRight();
}