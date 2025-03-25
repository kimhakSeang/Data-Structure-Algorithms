package com.piseth.java.school;

import java.util.Arrays;

public class HashTableDemo {

	public static void main(String[] args) {
		HashTableArray hashTable = new HashTableArray();
		hashTable.put("iphone", "This is my iphone");
		//hashTable.put("dara", "Dara is my friend");
		hashTable.put("iphonex", "New Iphone");
		
		//hashTable.put("iphone", "This is my new iphone");
		
		
		//System.out.println(hashTable);
		
		hashTable.print();
		
		//String value = hashTable.get("iphone"); // ok
	String value = hashTable.get("iphonex"); // hash collision
		//String value = hashTable.get("dara"); // not found
		System.out.println("Value= " + value);
		
		hashTable.remove("iphone");
		hashTable.print();
		
		hashTable.remove("iphonex");
		hashTable.print();
		
		
		
		
	}

}
