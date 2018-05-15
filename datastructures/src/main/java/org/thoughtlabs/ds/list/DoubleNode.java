package org.thoughtlabs.ds.list;

public class DoubleNode<E> {

	private DoubleNode<E> prev;
	private DoubleNode<E> next;
	private E element;

	public DoubleNode() {
	}

	public DoubleNode(DoubleNode<E> prev, E element, DoubleNode<E> next) {
		this.prev = prev;
		this.element = element;
		this.next = next;
	}

	public DoubleNode(E element) {
		this(null, element, null);
	}

	public DoubleNode<E> getPrev() {
		return prev;
	}

	public void setPrev(DoubleNode<E> prev) {
		this.prev = prev;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public void setNext(DoubleNode<E> next) {
		this.next = next;
	}

	public DoubleNode<E> getNext() {
		return next;
	}

}
