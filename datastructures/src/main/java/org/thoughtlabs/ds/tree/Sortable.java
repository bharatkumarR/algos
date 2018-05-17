package org.thoughtlabs.ds.tree;

public interface Sortable {

	boolean isGreaterThan(Object e);

	boolean islessThan(Object e);

	boolean isEqualTo(Object e);

	default boolean isGreaterThanOrEqual(Object e) {
		return isGreaterThan(e) || isEqualTo(e);
	}

	default boolean isLesserThanOrequal(Object e) {
		return islessThan(e) || isEqualTo(e);
	}

}
