package org.thoughtlabs.ds.stack;

public class StackArrayList<E> {

	private Object[] elements = new Object[20];
	private int currentIndex;

	public void push(E element) {
		if (currentIndex >= elements.length) {
			regrowArray();
		}
		elements[currentIndex++] = element;
	}

	@SuppressWarnings("unchecked")
	public E pop() {
		E temp = (E) elements[currentIndex];
		elements[currentIndex--] = null;
		return temp;
	}

	private void regrowArray() {
		Object[] temp = new Object[elements.length + 20];
		for (int i = 0; i < elements.length; i++) {
			temp[i] = elements[i];
		}
		elements = temp;
	}

}
