package com.solvd.bookingsystem.linkedlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedListClass<E> {
	private static Logger log = LogManager.getLogger(LinkedListClass.class.getName());

	private int size = 0;
	private NodeClass<E> head;// by default a null value

	public LinkedListClass() {

	}

	public int getSize() {
		return size;
	}

	private void incrementSize() {
		size++;
	}

	// adding elements to the list
	public void addData(E data) {

		NodeClass<E> newNode = new NodeClass<>();
		newNode.setData(data);
		// newNode.setNext(null);

		// checking if the head is null
		if (head == null) {
			head = newNode;
			incrementSize();
			// newly created node is the head here, if head is null
		} else {
			NodeClass<E> node = head;// new temporary node which holds the data and it refers to head node
			while (node.getNext() != null) {
				node = node.getNext();// jumping between nodes until it is null
			}
			node.setNext(newNode);
			incrementSize();
		}

	}

	// adding an element at first index
	public void addAtFirst(E data) {
		NodeClass<E> node = new NodeClass<>();
		node.setData(data);
		node.setNext(head);// previous head
		head = node;// node is the head now
		incrementSize();
	}

	// adding at any index value
	public void addAtAny(int index, E data) {
		NodeClass<E> node = new NodeClass<>();
		node.setData(data);
		node.setNext(null);

		if (index == 0) {
			addAtFirst(data);
		} else {

			NodeClass<E> current = head;
			// looping to the specified index
			for (int i = 1; i < index; i++) {
				current = current.getNext();
			}
			node.setNext(current.getNext());
			current.setNext(node);
		}
		incrementSize();
	}

	// size of the list
	public int size() {
		return getSize();
	}

	// printing the list to console
	public void printList() {
		NodeClass<E> node = head;
		while (node.getNext() != null) {
			log.info("List: " + node.getData());
			node = node.getNext();
		}
		log.info("List: " + node.getData());// for the last element to be printed
	}

}
