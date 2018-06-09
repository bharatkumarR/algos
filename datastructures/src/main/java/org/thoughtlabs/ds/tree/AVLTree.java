package org.thoughtlabs.ds.tree;

public class AVLTree<E> extends BinaryTree<E> {

	public TreeNode<E> root;

	public TreeNode<E> rightRotate(TreeNode<E> root) {
		TreeNode<E> newRoot = root.getLeft();
		root.setLeft(newRoot.getRight());
		newRoot.setRight(root);
		return newRoot;
	}

	public TreeNode<E> leftRotate(TreeNode<E> root) {
		TreeNode<E> newRoot = root.getRight();
		root.setRight(newRoot.getLeft());
		newRoot.setLeft(root);
		return newRoot;
	}

	public TreeNode<E> leftRightRotate(TreeNode<E> root) {
		root.setLeft(leftRotate(root.getLeft()));
		return rightRotate(root);
	}

	public TreeNode<E> rightLeftRotate(TreeNode<E> root) {
		root.setRight(rightRotate(root.getRight()));
		return leftRotate(root);
	}

	public int height(TreeNode<E> node) {
		if (node == null) {
			return 0;
		}
		int leftHeight = height(node.getLeft());
		int rightHeight = height(node.getRight());
		if (leftHeight > rightHeight) {
			return leftHeight + 1;
		}
		return rightHeight + 1;
	}

	public void add(E e) {
		this.root = insert(root, e);
	}

	public TreeNode<E> insert(TreeNode<E> node, E e) {

		if (node == null) {
			return new TreeNode<>(e);
		}

		if (MyComparator.get(node.getElement()).isGreaterThan(e)) {
			node.setLeft(insert(node.getLeft(), e));
		} else {
			node.setRight(insert(node.getRight(), e));
		}

		int leftHeight = height(node.getLeft());
		int rightHeight = height(node.getRight());

		int balance = leftHeight - rightHeight;
		if (balance > 1 && MyComparator.get(e).isLessThan(node.getLeft().getElement())) {
			return rightRotate(node);
		} else if (balance > 1 && MyComparator.get(e).isGreaterThan(node.getLeft().getElement())) {
			return leftRightRotate(node);
		} else if (balance < -1 && MyComparator.get(e).isGreaterThan(node.getRight().getElement())) {
			return leftRotate(node);
		} else if (balance < -1 && MyComparator.get(e).isLessThan(node.getRight().getElement())) {
			return rightLeftRotate(node);
		}
		return node;
	}

	@Override
	protected TreeNode<E> getRoot() {
		return this.root;
	}

}
