package org.coding.thoughts.solvedproblems.stack;

import org.coding.thoughts.solvedproblems.stack.Postfix;
import org.junit.Assert;
import org.junit.Test;

public class PostfixTest {

	@Test
	public void verifyExpressionCalculatorisCalcualatedProperly() {
		Assert.assertTrue(46 == Postfix.calculator("567*+1-".toCharArray()));
		Assert.assertTrue(76 == Postfix.calculator("56+7*1-".toCharArray()));
	}

}
