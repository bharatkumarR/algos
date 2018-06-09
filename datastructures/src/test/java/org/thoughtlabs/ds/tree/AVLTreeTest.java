package org.thoughtlabs.ds.tree;

import java.util.function.Consumer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AVLTreeTest {

	private int i;

	@Before
	public void setup() {
		i = 0;
	}

	@Test
	public void testAVLLeftRotation() {
		AVLTree<Integer> avl = new AVLTree<>();
		avl.add(1);
		avl.add(2);
		avl.add(3);
		int[] expected = { 2, 1, 3 };
		Consumer<Integer> consumer = val -> {
			Assert.assertTrue(expected[i++] == val);
		};
		avl.levelOrderTraversal(consumer);

	}

	@Test
	public void testAVLRightRotation() {
		AVLTree<Integer> avl = new AVLTree<>();
		avl.add(3);
		avl.add(2);
		avl.add(1);
		int[] expected = { 2, 1, 3 };
		Consumer<Integer> consumer = val -> {
			Assert.assertTrue(expected[i++] == val);
		};
		avl.levelOrderTraversal(consumer);
	}

	@Test
	public void testAVLLeftRightRotation() {
		AVLTree<Integer> avl = new AVLTree<>();
		avl.add(1);
		avl.add(3);
		avl.add(2);
		int[] expected = { 2, 1, 3 };
		Consumer<Integer> consumer = val -> {
			Assert.assertTrue(expected[i++] == val);
		};
		avl.levelOrderTraversal(consumer);
	}

	@Test
	public void testAVLRightLeftRotation() {
		AVLTree<Integer> avl = new AVLTree<>();
		avl.add(3);
		avl.add(5);
		avl.add(4);
		int[] expected = { 4, 3, 5 };
		Consumer<Integer> consumer = val -> {
			Assert.assertTrue(expected[i++] == val);
		};
		avl.levelOrderTraversal(consumer);
	}

	@Test
	public void testAVL() {
		AVLTree<Integer> avl = new AVLTree<>();
		avl.add(10);
		avl.add(20);
		avl.add(30);
		avl.add(40);
		avl.add(50);
		avl.add(25);
		int[] expected = { 30, 20, 40, 10, 25, 50 };
		Consumer<Integer> consumer = val -> {
			Assert.assertTrue(expected[i++] == val);
		};
		avl.levelOrderTraversal(consumer);
	}

}
