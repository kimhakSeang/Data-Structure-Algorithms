package com.piseth.java.school;

public class LinkedListDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListExample list = new LinkedListExample();
		list.addAtEnd(10);
		list.addAtEnd(20);
		list.addAtEnd(30);
		
		list.printList();
		
		list.addAtBeginning(5);
		list.printList();
		
		list.addAfter(20, 25);
		list.printList();
		
		list.removeAtBeginning();
		list.printList();
		
		list.removeAtEnd();
		list.printList();
		
		list.removeByValue(20);
		list.printList();

	}

}
