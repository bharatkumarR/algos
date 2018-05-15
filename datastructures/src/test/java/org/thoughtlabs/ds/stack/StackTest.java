package org.thoughtlabs.ds.stack;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

	@Test
	public void verifyStackNodePushesAlwaysToTopAndPopFromTop() {
		StackNode<Integer> stack = new StackNode<>();
		for (int i = 0; i < 100; i++) {
			stack.push(i);
		}
		for (int i = 99; i >= 0; i--) {
			Assert.assertTrue(i == stack.pop());
		}
	}

	@Test
	public void verifyStackArrayPushesAlwaysToTopAndPopFromTop() {
		StackNode<Integer> stack = new StackNode<>();
		for (int i = 0; i < 100; i++) {
			stack.push(i);
		}
		for (int i = 99; i >= 0; i--) {
			Assert.assertTrue(i == stack.pop());
		}
	}

}
