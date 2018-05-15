package org.thoughtlabs.ds.list;

import java.util.Iterator;

public class SingleLinkedList<E> implements Iterable<E> {

	private SingleNode<E> head;
	private SingleNode<E> tail;
	private int count;

	public void add(E element) {
		SingleNode<E> node = new SingleNode<>(element);
		if (count == 0) {
			head = node;
		} else {
			tail.setNext(node);
		}
		tail = node;
		count++;
	}

	public void addFirst(E element) {
		SingleNode<E> node = new SingleNode<>(element);
		node.setNext(this.head);
		this.head = node;
		count++;

		if (count == 1) {
			this.tail = this.head;
		}
	}

	public void remove() {
		if (tail != null) {
			if (tail == head) {
				tail.setElement(null);
				tail = null;
				head = null;
			} else {
				SingleNode<E> temp = head;
				while (temp.getNext() != tail) {
					temp = temp.getNext();
				}
				temp.setNext(null);
				tail.setElement(null);
				tail = temp;
			}
			count--;
		}
	}

	public void removeFirst() {
		if (head != null) {
			head = head.getNext();
			if (head == null) {
				tail = null;
			}
			count--;
		}
	}

	@Override
	public Iterator<E> iterator() {
		return new SingleListIterator<>(head);
	}
}
