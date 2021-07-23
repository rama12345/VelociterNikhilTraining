package com.velociter.nikhil.chapter6.Exercise5;

public class LinkedListRunner {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.show();
		list.insertAt(4, 88);
		list.insertAtStart(8);
//		lit.delete(4);
		list.show();
	}
}
