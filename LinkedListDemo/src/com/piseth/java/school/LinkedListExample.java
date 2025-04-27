package com.piseth.java.school;

public class LinkedListExample {
	
	Node head;
	
	// add new node at the end
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		// 10 -> 20 -> 30
		//append 45 => 
		// 10 -> 20 -> 30 ->45->null
		Node last = head;
		
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = newNode;
	}
	
	public void printList() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	// Add at the beginning
	
	public void addAtBeginning(int data) {
		
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
	}
	
	public void addAfter(int prevData, int newData) {
		
		Node current = head;
		
		// Find the previous node
		while(current != null && current.data != prevData) {
			current = current.next;
		}
		
		if(current == null) {
			System.out.println("Node with data ="+ prevData + " not found!");
			return;
		}
		
		//
		Node newNode = new Node(newData);
		newNode.next = current.next;
		current.next = newNode;
	}
	
	// remove at the beginning
	public void removeAtBeginning() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		head = head.next;
	}
	
	// node.next.next = null
	// remove at end
	
	public void removeAtEnd() {
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		// In case there is only one node
		if(head.next == null) {
			head = null;
			return;
		}
		
		// Find the second last node
		Node secondLast = head;
		while(secondLast.next.next != null) {
			secondLast = secondLast.next;
		}
		
		secondLast.next = null;
	}
	
	// remove specific node by value
	public void removeByValue(int value) {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		if(head.data == value) {
			head = head.next;
			return;
		}
		// 10 -> 20 -> 30
		// current = 10
		// current.next = 20
		Node current = head;
		while(current.next != null && current.next.data != value) {
			current = current.next;
		}
		
		if(current.next == null) {
			System.out.println("Node with data ="+ value + " not found!");
			return;
		}
		// current.next.data = 20
		current.next = current.next.next;
	}
	

}
