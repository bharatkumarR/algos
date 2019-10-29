package org.thoughtlabs.ds.tree.problems;

public class Node<E> {
	
	private Node<E> left;
	private Node<E> right;
	private E data;
	
	public Node(E data) {
		super();
		this.data = data;
	}
	
	public Node(Node<E> left, Node<E> right, E data) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}
	
	public void setLeft(Node<E> left) {
		this.left = left;
	}

	public void setRight(Node<E> right) {
		this.right = right;
	}

	public Node<E> getLeft() {
		return left;
	}
	public Node<E> getRight() {
		return right;
	}
	public E getData() {
		return data;
	}
	
	public static void printBordersOfTree(Node<Integer> node) {
		System.out.println();
		printRightNodesExceptLeaf(node);
		System.out.println();
		printLeafNodes(node);
		System.out.println();
		printLeftNodesExceptLeaf(node);
	}

	private static void printLeafNodes(Node<Integer> node) {
		if(node == null) {
			return;
		}
		if(node.getLeft() == null && node.getRight() == null) {
			System.out.print(node.getData() + "  ");
		}
		printLeafNodes(node.getRight());
		printLeafNodes(node.getLeft());
	}

	private static void printLeftNodesExceptLeaf(Node<Integer> node) {
		if(node == null || (node.getLeft() == null && node.getRight() == null )) {
			return;
		}
		printLeftNodesExceptLeaf(node.getLeft());
		System.out.print(node.getData() + "  ");
	}

	private static void printRightNodesExceptLeaf(Node<Integer> node) {
		if(node == null || (node.getLeft() == null && node.getRight() == null )) {
			return;
		}
		System.out.print(node.getData() + "  ");
		printRightNodesExceptLeaf(node.getRight());
	}

}
