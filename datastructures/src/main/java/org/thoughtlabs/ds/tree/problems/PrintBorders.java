package org.thoughtlabs.ds.tree.problems;

import java.util.LinkedList;
import java.util.Queue;

public class PrintBorders {
	
	public static void main(String[] args) {
		Node<Integer> node = new Node<Integer>(1);
		int left = 2, right= 3;
		Queue<Node<Integer>> que = new LinkedList<>();
		que.add(node);
		while (left < 19) {
			Node<Integer> temp = que.poll();
			temp.setLeft(new Node<Integer>(left));
			temp.setRight(new Node<Integer>(right));
			que.add(temp.getLeft());
			que.add(temp.getRight());
			left = right + 1;
			right = left +1;
		}
		Node.printBordersOfTree(node);
	}

}
