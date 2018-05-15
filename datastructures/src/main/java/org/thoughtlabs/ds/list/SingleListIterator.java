package org.thoughtlabs.ds.list;

import java.util.Iterator;

public class SingleListIterator<E> implements Iterator<E> {

	private SingleNode<E> current;

	public SingleListIterator(SingleNode<E> current) {
		this.current = current;
	}

	@Override
	public boolean hasNext() {
		return current != null && current.getNext() != null;
	}

	@Override
	public E next() {
		E element = current.getElement();
		current = current.getNext();
		return element;
	}

}
