package org.thoughtlabs.ds.tree;

public class TreeNode<E> {

	private E element;
	private TreeNode<E> left;
	private TreeNode<E> right;

	public TreeNode(E element) {
		this.element = element;
	}

	public TreeNode(TreeNode<E> left, E element, TreeNode<E> right) {
		this(element);
		this.left = left;
		this.right = right;
	}

	public E getElement() {
		return element;
	}

	public TreeNode<E> getLeft() {
		return left;
	}

	public TreeNode<E> getRight() {
		return right;
	}

	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}

	public void setRight(TreeNode<E> right) {
		this.right = right;
	}

}
