package org.thoughtlabs.ds.list;


public class SingleNode<E> {
	
	private E element;
	private SingleNode<E> next;
	
	public SingleNode(){}
	
	public SingleNode(E element) {
		this(element,null);
	}
	
	public SingleNode(E element, SingleNode<E> next) {
		this.element =  element;
		this.next =  next;
	}
	
	public void setElement(E element) {
		this.element = element;
	}
	
	public E getElement() {
		return element;
	}
	
	public void setNext(SingleNode<E> next) {
		this.next =  next;
	}
	
	public SingleNode<E> getNext(){
		return next;
	}

}
