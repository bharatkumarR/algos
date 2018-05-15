package org.thoughtlabs.ds.list;

public class DoublyLinkedList<E> {

	private DoubleNode<E> head;
	private DoubleNode<E> tail;
	private int count;

	public void add(E element) {
		DoubleNode<E> node = new DoubleNode<>(element);
		if (count == 0) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrev(tail);
		}
		tail = node;
		count++;
	}

	public void addFirst(E element) {
		DoubleNode<E> node = new DoubleNode<>(element);
		node.setNext(this.head);
		this.head.setPrev(node);
		this.head = node;
		count++;

		if (count == 1) {
			this.tail = this.head;
		}
	}

	public E remove() {
		E element = null;
		if (tail != null) {
			if (tail == head) {
				element = tail.getElement();
				tail.setElement(null);
				tail = null;
				head = null;
			} else {
				DoubleNode<E> temp = tail.getPrev();
				temp.setNext(null);
				element = tail.getElement();
				tail.setElement(null);
				tail = temp;
			}
			count--;
		}
		return element;
	}

	public void removeFirst() {
		if (head != null) {
			head = head.getNext();
			if (head == null) {
				tail = null;
			} else {
				head.setPrev(null);
			}
			count--;
		}
	}

}
