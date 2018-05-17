package org.thoughtlabs.ds.tree;

import java.util.function.Consumer;

import org.thoughtlabs.ds.que.QueNode;
import org.thoughtlabs.ds.stack.StackNode;

public class BinaryTree<E> {

	private TreeNode<E> root;

	public void add(E element) {
		if (root == null) {
			root = new TreeNode<>(element);
		} else {
			TreeNode<E> treeNode = new TreeNode<>(element);
			QueNode<TreeNode<E>> que = new QueNode<>();
			que.enQue(root);
			while (que.isNotEmpty()) {
				TreeNode<E> deQue = que.deQue();
				if (deQue.getLeft() != null) {
					que.enQue(deQue.getLeft());
				} else {
					deQue.setLeft(treeNode);
					break;
				}
				if (deQue.getRight() != null) {
					que.enQue(deQue.getRight());
				} else {
					deQue.setRight(treeNode);
					break;
				}
			}
		}
	}

	public void preOrderTraversal(Consumer<E> consumer) {
		preOrderTraversal(root, consumer);
	}

	public void preOrderTraversalLoop(Consumer<E> consumer) {
		preOrderTraversalLoop(root, consumer);
	}

	public void inOrderTraversal(Consumer<E> consumer) {
		inOrderTraversal(root, consumer);
	}

	public void inOrderTraversalLoop(Consumer<E> consumer) {
		inOrderTraversalLoop(root, consumer);
	}

	public void postOrderTraversal(Consumer<E> consumer) {
		postOrderTraversal(root, consumer);
	}

	public void postOrderTraversalLoop(Consumer<E> consumer) {
		postOrderTraversalLoop(root, consumer);
	}

	public void preOrderTraversal(TreeNode<E> node, Consumer<E> consumer) {
		if (node != null) {
			consumer.accept(node.getElement());
			preOrderTraversal(node.getLeft(), consumer);
			preOrderTraversal(node.getRight(), consumer);
		}
	}

	public void inOrderTraversal(TreeNode<E> node, Consumer<E> consumer) {
		if (node != null) {
			inOrderTraversal(node.getLeft(), consumer);
			consumer.accept(node.getElement());
			inOrderTraversal(node.getRight(), consumer);
		}
	}

	public void postOrderTraversal(TreeNode<E> node, Consumer<E> consumer) {
		if (node != null) {
			postOrderTraversal(node.getLeft(), consumer);
			postOrderTraversal(node.getRight(), consumer);
			consumer.accept(node.getElement());
		}
	}

	public void preOrderTraversalLoop(TreeNode<E> node, Consumer<E> consumer) {
		if (node != null) {
			StackNode<TreeNode<E>> stack = new StackNode<>();
			while (true) {
				while (node != null) {
					consumer.accept(node.getElement());
					stack.push(node);
					node = node.getLeft();
				}
				if (stack.isNotEmpty()) {
					node = stack.pop().getRight();
				} else {
					break;
				}
			}
		}
	}

	public void inOrderTraversalLoop(TreeNode<E> node, Consumer<E> consumer) {
		if (node != null) {
			StackNode<TreeNode<E>> stack = new StackNode<>();
			while (true) {
				while (node != null) {
					stack.push(node);
					node = node.getLeft();
				}
				if (stack.isNotEmpty()) {
					node = stack.pop();
					consumer.accept(node.getElement());
					node = node.getRight();
				} else {
					break;
				}
			}
		}
	}

	public void postOrderTraversalLoop(TreeNode<E> node, Consumer<E> consumer) {
		if (node != null) {
			StackNode<TreeNode<E>> stack = new StackNode<>();
			while (true) {
				if (node != null) {
					if (node.getRight() != null) {
						stack.push(node.getRight());
					}
					stack.push(node);
					node = node.getLeft();
				} else {
					if (!stack.isNotEmpty()) {
						break;
					}
					node = stack.pop();
					if (stack.isNotEmpty() && node.getRight() == stack.top()) {
						stack.pop();
						stack.push(node);
						node = node.getRight();
					} else {
						consumer.accept(node.getElement());
						node = null;
					}
				}
			}
		}
	}

	public void levelOrderTraversal(Consumer<E> consumer) {
		levelOrderTraversal(root, consumer);
	}

	public void levelOrderTraversal(TreeNode<E> node, Consumer<E> consumer) {
		if (node != null) {
			QueNode<TreeNode<E>> que = new QueNode<>();
			que.enQue(node);
			while (que.isNotEmpty()) {
				TreeNode<E> deQue = que.deQue();
				consumer.accept(deQue.getElement());
				if (deQue.getLeft() != null) {
					que.enQue(deQue.getLeft());
				}
				if (deQue.getRight() != null) {
					que.enQue(deQue.getRight());
				}
			}
		}
	}

}
