package com.solvd.bookingsystem.linkedlist;

public class NodeClass<E> {

	private E data;
	private NodeClass<E> next;

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public NodeClass<E> getNext() {
		return next;
	}

	public void setNext(NodeClass<E> next) {
		this.next = next;
	}

}
