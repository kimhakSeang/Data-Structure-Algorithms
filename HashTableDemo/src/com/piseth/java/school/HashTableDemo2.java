package com.piseth.java.school;

import java.util.Arrays;

public class HashTableDemo2 {

	public static void main(String[] args) {
		HashTableArray hashTable = new HashTableArray();
		hashTable.put("iphone", "This is my iphone");
		//hashTable.put("dara", "Dara is my friend");
		hashTable.put("iphonex", "New Iphone");
		
		//hashTable.put("iphone", "This is my new iphone");
		
		
		hashTable.print();
		
		// size = 3 [0,2]
		// iphone hash = 2
		//iphonex has = 2 + 1 %3
		System.out.println("===========");
		hashTable.put("oppo", "My Oppo");
		hashTable.print();
		
		System.out.println("===== After Remove 1 element======");
		hashTable.remove("iphonex");
		hashTable.print();
		
		
		System.out.println("======= add one more element");
		hashTable.put("oppo2", "My Oppo2");
		hashTable.print();
		
		System.out.println("End");
		
		// slot
	}

}
