package org.thoughtlabs.ds.graph;

import org.thoughtlabs.ds.list.DoublyLinkedList;

public class GraphNode<E> {

	private E element;
	private DoublyLinkedList<GraphNode<E>> adjacentList = new DoublyLinkedList<>();

	public GraphNode() {

	}

	public GraphNode(E element) {
		this.element = element;
	}

	protected E getElement() {
		return element;
	}

	protected void setElement(E element) {
		this.element = element;
	}

	protected DoublyLinkedList<GraphNode<E>> getAdjacentList() {
		return adjacentList;
	}

	protected void setAdjacentList(DoublyLinkedList<GraphNode<E>> adjacentList) {
		this.adjacentList = adjacentList;
	}

}
