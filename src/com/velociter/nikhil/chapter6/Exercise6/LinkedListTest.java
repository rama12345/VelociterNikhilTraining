package com.velociter.nikhil.chapter6.Exercise6;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		//insert the data into list 
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.show();
		LinkedList list1 = new LinkedList();
		list1.insert(10);
		list1.insert(20);
		list1.insert(30);
		list1.insert(40);
		list1.show();
		System.out.println(list.equals(list1));
		LinkedList list2 = list;
		System.out.println(list.equals(list2));
	}

}
