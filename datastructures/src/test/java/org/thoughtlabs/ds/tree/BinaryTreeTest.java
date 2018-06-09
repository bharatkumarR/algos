package org.thoughtlabs.ds.tree;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

	private int startVal;

	@Test
	public void addShouldAdddValuesAsBalanced() {
		startVal = 1;
		BinaryTree<Integer> tree = new BinaryTree<>();
		for (int i = 1; i < 16; i++) {
			tree.add(i);
		}
		tree.levelOrderTraversal((val) -> Assert.assertTrue(startVal++ == val));
	}

	@Test
	public void verifyPreOrderTraversal() {
		startVal = 0;
		int[] expectedArray = new int[] { 1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15 };
		BinaryTree<Integer> tree = new BinaryTree<>();
		for (int i = 1; i < 16; i++) {
			tree.add(i);
		}
		tree.preOrderTraversal((val) -> Assert.assertTrue(expectedArray[startVal++] == val));
	}

	@Test
	public void verifyPreOrderTraversalLoop() {
		startVal = 0;
		int[] expectedArray = new int[] { 1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15 };
		BinaryTree<Integer> tree = new BinaryTree<>();
		for (int i = 1; i < 16; i++) {
			tree.add(i);
		}
		tree.preOrderTraversalLoop((val) -> Assert.assertTrue(expectedArray[startVal++] == val));
	}

	@Test
	public void verifyPostOrderTraversal() {
		startVal = 0;
		int[] expectedArray = new int[] { 8, 9, 4, 10, 11, 5, 2, 12, 13, 6, 14, 15, 7, 3, 1 };
		BinaryTree<Integer> tree = new BinaryTree<>();
		for (int i = 1; i < 16; i++) {
			tree.add(i);
		}
		tree.postOrderTraversal((val) -> Assert.assertTrue(expectedArray[startVal++] == val));
	}

	@Test
	public void verifyPostOrderTraversalLoop() {
		startVal = 0;
		int[] expectedArray = new int[] { 8, 9, 4, 10, 11, 5, 2, 12, 13, 6, 14, 15, 7, 3, 1 };
		BinaryTree<Integer> tree = new BinaryTree<>();
		for (int i = 1; i < 16; i++) {
			tree.add(i);
		}
		tree.postOrderTraversalLoop((val) -> Assert.assertTrue(expectedArray[startVal++] == val));
	}

	@Test
	public void verifyInOrderTraversal() {
		startVal = 0;
		int[] expectedArray = new int[] { 8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15 };
		BinaryTree<Integer> tree = new BinaryTree<>();
		for (int i = 1; i < 16; i++) {
			tree.add(i);
		}
		tree.inOrderTraversal((val) -> Assert.assertTrue(expectedArray[startVal++] == val));
	}

	@Test
	public void verifyInOrderTraversalLoop() {
		startVal = 0;
		int[] expectedArray = new int[] { 8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15 };
		BinaryTree<Integer> tree = new BinaryTree<>();
		for (int i = 1; i < 16; i++) {
			tree.add(i);
		}
		tree.inOrderTraversalLoop((val) -> Assert.assertTrue(expectedArray[startVal++] == val));
	}

}