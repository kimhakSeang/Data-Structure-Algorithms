package com.piseth.java.school.hashtable.arraylist.demo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); // dynamic array
		
		//String[] names = new String[5]; // static array 
		//names[0]
		
		
		// Add element
		list.add("Dara");
		list.add("Thida");
		System.out.println(list);
		
		// Access specific element
		System.out.println(list.get(1));
		
		// Update element
		list.set(1, "Sovann");
		System.out.println(list);
	}

}
