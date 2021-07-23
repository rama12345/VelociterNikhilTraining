package com.velociter.nikhil.chapter6.Exercise5;

public class LinkedList {
	Node head;

	// function to insert the data
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node node1 = head;
			while (node1.next != null) {
				node1 = node1.next;
			}
			node1.next = node;
		}
	}

	// to delete the data from list
	public void delete(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node node = head;
			Node node1 = null;
			for (int i = 0; i < index - 1; i++) {
				node = node.next;
			}
			node1 = node.next;
			node.next = node1.next;
			System.out.println("Deleted Item is : " + node1.data);
		}
	}

	// print the list of data
	public void show() {
		Node node = head;

		while (node.next != null) {
			System.out.print(node.data + "-> ");
			node = node.next;
		}
		System.out.println(node.data);
	}

	// insert the value at the start
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	// insert the value
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;

		Node node1 = head;
		for (int i = 0; i < index - 1; i++) {
			node1 = node1.next;
		}
		node.next = node1.next;
		node1.next = node;
	}
}