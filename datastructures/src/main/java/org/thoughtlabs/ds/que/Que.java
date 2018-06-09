package org.thoughtlabs.ds.que;

import org.thoughtlabs.ds.list.SingleNode;

public class Que<E> {

	private SingleNode<E> head;

	public void enQue(E element) {
		if (head == null) {
			head = new SingleNode<>(element);
		} else {
			SingleNode<E> temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(new SingleNode<>(element));
		}
	}

	public E deQue() {
		if (head == null) {
			return null;
		}
		SingleNode<E> currentHead = head;
		head = head.getNext();
		currentHead.setNext(null);
		return currentHead.getElement();
	}

	public boolean isNotEmpty() {
		return head != null;
	}

}
