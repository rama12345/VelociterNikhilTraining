package com.velociter.nikhil.chapter6.Exercise4;

import java.util.Scanner;

public class LinkedListRunner {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of linklist");
		int size = scanner.nextInt();
		System.out.println("Enter the integer data in linklist");
		int a1 = scanner.nextInt();
		
		Node head = new Node(a1);
		list.addToTheLast(head);// add head to linkedlist
		for (int i = 1; i < size; i++) { // add remaining nodes
			int nodes = scanner.nextInt();
			list.addToTheLast(new Node(nodes));
		}
		System.out.println("Before reversing");
		list.printlist(head);
		Node head2 = null;
		System.out.println("After reversing");
		head2 = list.reverse(head);
		list.printlist(head2);

	}
}
