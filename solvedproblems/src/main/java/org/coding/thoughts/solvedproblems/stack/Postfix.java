package org.coding.thoughts.solvedproblems.stack;

import org.thoughtlabs.ds.stack.StackNode;

public class Postfix {

	public static Integer calculator(char[] expression) {
		StackNode<Integer> stack = new StackNode<>();
		for (char i : expression) {
			ExpressionConstants expressionConstants = ExpressionConstants.get(i);
			if (expressionConstants == null) {
				stack.push(Character.getNumericValue(i));
			} else {
				Integer pop = stack.pop();
				Integer pop2 = stack.pop();
				int perform = expressionConstants.perform(pop2, pop);
				stack.push(perform);
			}
		}
		return stack.pop();
	}

}
