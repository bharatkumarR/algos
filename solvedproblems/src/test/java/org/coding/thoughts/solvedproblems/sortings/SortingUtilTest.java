package org.coding.thoughts.solvedproblems.sortings;

import org.junit.Assert;
import org.junit.Test;

public class SortingUtilTest {

	@Test
	public void verifyBubbleSort() {
		int[] array = new int[] { 5, 2, 6, 1, 0, 9 };
		SortingUtil.bubbleSort(array);
		int[] expectedArray = new int[] { 0, 1, 2, 5, 6, 9 };
		boolean isArraySorted = assertArrayOrder(array, expectedArray);
		Assert.assertTrue(isArraySorted);
	}

	@Test
	public void verifyInsertionSort() {
		int[] array = new int[] { 5, 2, 6, 1, 0, 9 };
		SortingUtil.insertionSort(array);
		int[] expectedArray = new int[] { 0, 1, 2, 5, 6, 9 };
		boolean isArraySorted = assertArrayOrder(array, expectedArray);
		Assert.assertTrue(isArraySorted);
	}

	@Test
	public void verifySelectionSort() {
		int[] array = new int[] { 5, 2, 6, 1, 0, 9 };
		SortingUtil.selectionSort(array);
		int[] expectedArray = new int[] { 0, 1, 2, 5, 6, 9 };
		boolean isArraySorted = assertArrayOrder(array, expectedArray);
		Assert.assertTrue(isArraySorted);
		System.out.println(7 / 2);
	}

	@Test
	public void verifyMergeSort() {
		int[] array = new int[] { 5, 2, 6, 1, 0, 9 };
		SortingUtil.mergeSort(array);
		int[] expectedArray = new int[] { 0, 1, 2, 5, 6, 9 };
		boolean isArraySorted = assertArrayOrder(array, expectedArray);
		Assert.assertTrue(isArraySorted);
		System.out.println(7 / 2);
	}

	private boolean assertArrayOrder(int[] array, int[] expectedArray) {
		boolean isArraySorted = true;
		for (int i = 0; i < expectedArray.length; i++) {
			if (expectedArray[i] != array[i]) {
				isArraySorted = false;
			}
		}
		return isArraySorted;
	}

}
