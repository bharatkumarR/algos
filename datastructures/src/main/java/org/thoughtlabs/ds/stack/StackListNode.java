package org.thoughtlabs.ds.stack;

import org.thoughtlabs.ds.list.DoublyLinkedList;

public class StackListNode<E> {

	private DoublyLinkedList<E> doublyLinkedList = new DoublyLinkedList<>();

	public void push(E element) {
		doublyLinkedList.add(element);
	}

	public E pop() {
		return doublyLinkedList.remove();
	}

}
