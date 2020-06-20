package com.rd.interview;

public interface RuleI<I, O> {
	boolean matches(I input);
	O process(I input);
}
