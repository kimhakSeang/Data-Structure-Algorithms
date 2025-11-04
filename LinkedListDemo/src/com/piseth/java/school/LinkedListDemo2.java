package com.piseth.java.school;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListExample list1 = new LinkedListExample();
		list1.addAtEnd(20);
		list1.addAtEnd(30);
		list1.addAtEnd(40);
		
		LinkedListExample list2 = new LinkedListExample();
		list2.addAtEnd(15);
		
		//list1.me
		//Node mergedList = LinkedListExample.mergeUnsortedList(list1.head, list2.head);
		Node mergedList = LinkedListExample.mergeSortedList(list1.head, list2.head);
		
		LinkedListExample.printList2(mergedList);
	}

}
