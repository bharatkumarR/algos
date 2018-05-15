package org.thoughtlabs.ds.stack;

import org.thoughtlabs.ds.list.SingleNode;

public class StackNode<E> {

	private SingleNode<E> head;

	public void push(E element) {
		SingleNode<E> node = new SingleNode<>(element, head);
		this.head = node;
	}

	public E pop() {
		if (head != null) {
			E element = head.getElement();
			head = head.getNext();
			return element;
		}
		return null;
	}

	public E top() {
		return head.getElement();
	}
}
