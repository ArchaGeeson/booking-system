package com.solvd.bookingsystem.linkedlist;

public class NodeClass<T> {

	private T data;
	private NodeClass<T> next;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public NodeClass<T> getNext() {
		return next;
	}

	public void setNext(NodeClass<T> next) {
		this.next = next;
	}

}
