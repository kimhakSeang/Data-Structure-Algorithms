package com.piseth.java.school.hashtable;

public class HableTableDemo {

	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		
		hashTable.put("iphone", "Iphone");
		//hashTable.put("iphonex", "my iphone");
		hashTable.put("oppo", "CC");
		
		hashTable.print();
		
		System.out.println("Key iphone:"+ hashTable.get("iphone"));
		System.out.println("Key iphonex:"+ hashTable.get("iphonex"));
		
		System.out.println("-----After Delete some element-----");
		hashTable.remove("iphone");
		hashTable.print();
		
		/*
		System.out.println("------- Add iphonex which has hash value = 8 -----");
		hashTable.put("iphonex", "my iphone");
		hashTable.print();
		
		*/
		
		System.out.println("Key iphone:"+ hashTable.get("#DELETED#"));
		
		
	}

}
