package com.piseth.java.school;

import java.util.HashSet;

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
	
	public void reverse() {
		if(head == null || head.next == null) {
			return; // Nothing to reverse
		}
		
		Node prev = null;
		Node current = head;
		Node next = null;
		
		// 10->20->30->null  => 30->20 ->10->null
		
		while(current != null) {
			next = current.next; // store next node
			current.next = prev; // reverse the link
			prev = current; 	// move prev forward 
			current = next;		// move current forward
		}
		
		head = prev;
		
		// next = 20
		// 10->null *
		// prev = 10
		// current = 20
		
		
		// next = 30
		// 20->10 *
		// prev = 20
		// current = 30
		
		// next = null
		// 30->20 *
		// prev = 30
		// current = null
		
		
		// 10->null, 20->10, 30->20
		
		
	}
	
	public Node findMiddle() {
		if(head == null) {
			System.out.println("List is empty.");
			return null;
		}
		
		Node slow = head;
		Node fast = head;
		
		while( fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle node value =" + slow.data);
		return slow;
	}
	
	
	public Node findNthNodeFromEnd(int n) {
		if(head == null) {
			System.out.println("List is empty.");
			return null;
		}
		
		Node first = head;
		Node second = head;
		
		// Move first pointer n step ahead
		for(int i = 0; i < n; i++) {
			if(first == null) {
				System.out.println("List has fewer than " + n + " nodes.");
				return null;
			}
			first = first.next;
		}
		
		// Move both pointer until first reach end
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		System.out.println("The " + n + " th node from End is: "+ second.data);
		return second;
	}
	
	public void removeDuplicateSorted() {
		//10->20->20->30->40->null
		Node current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next; // Skip Duplicate
			}else {
				current = current.next; // Move forward only if no duplicate
			}
		}
	}
	
	public void removeDuplicateUnorderedList() {
		if(head == null) {
			return;
		}
		
		HashSet<Integer> set = new HashSet<>();
		Node current = head;
		Node prev = null;
		
		while(current != null) {
			if(set.contains(current.data)) {
				// remove duplicate
				prev.next = current.next; 
			}else {
				set.add(current.data);
				prev = current;
			}
			current = current.next;
		}
		// 10->20->10->40->40->50->null
		
		// * set : [10, 20]
		
		// add 10 to the set
		// prev = 10
		// current = 20
		
		// add 20 to set
		// prev = 20
		// current = 10
		
		
		// 10->20->10->40
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
