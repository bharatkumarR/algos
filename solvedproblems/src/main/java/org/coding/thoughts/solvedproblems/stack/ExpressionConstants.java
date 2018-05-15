package org.coding.thoughts.solvedproblems.stack;

public enum ExpressionConstants {
	PLUS {

		@Override
		public int perform(Integer i1, Integer i2) {
			return i1 + i2;
		}
	},
	MINUS {

		@Override
		public int perform(Integer i1, Integer i2) {
			return i1 - i2;
		}
	},
	MULTIPLY {

		@Override
		public int perform(Integer i1, Integer i2) {
			return i1 * i2;
		}
	},
	DIVIDEDBY {

		@Override
		public int perform(Integer i1, Integer i2) {
			return i1 / i2;
		}
	};

	public static ExpressionConstants get(char expression) {
		switch (expression) {
			case '+':
				return ExpressionConstants.PLUS;
			case '-':
				return ExpressionConstants.MINUS;
			case '*':
				return ExpressionConstants.MULTIPLY;
			case '/':
				return ExpressionConstants.DIVIDEDBY;
			default:
				return null;
		}
	}

	public abstract int perform(Integer i1, Integer i2);
}