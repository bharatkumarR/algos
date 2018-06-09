package org.thoughtlabs.ds.tree;

public class MyComparator<T> {

	private T t;

	public MyComparator(T t) {
		this.t = t;
	}

	public static <E> MyComparator<E> get(E e) {
		return new MyComparator<E>(e);
	}

	@SuppressWarnings("unchecked")
	public boolean isGreaterThan(T e) {
		Comparable<T> t = (Comparable<T>) this.t;
		return t.compareTo(e) > 0;
	}

	@SuppressWarnings("unchecked")
	public boolean isLessThan(T e) {
		Comparable<T> t = (Comparable<T>) this.t;
		return t.compareTo(e) < 0;
	}

}
