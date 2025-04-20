package com.piseth.java.school.hashtable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.piseth.java.school.HashTableArray;

public class HableTableArrayListDemo {

	public static void main(String[] args) {
		HashTableArrayList hashTable = new HashTableArrayList();
		
		hashTable.put("iphone", "Iphone");
		//hashTable.put("iphonex", "my iphone");
		hashTable.put("oppo", "CC");
		
		//hashTable.print();
		
		System.out.println("Key iphone:"+ hashTable.get("iphone"));
		System.out.println("Key iphonex:"+ hashTable.get("iphonex"));
		
		System.out.println("-----After Delete some element-----");
		hashTable.remove("iphone");
		//hashTable.print();
		
		/*
		System.out.println("------- Add iphonex which has hash value = 8 -----");
		hashTable.put("iphonex", "my iphone");
		hashTable.print();
		
		*/
		
		System.out.println("Key iphone:"+ hashTable.get("#DELETED#"));
		
		for(int i =0; i<=9; i++) {
			hashTable.put("key"+i, "value"+i);
		}
		
		System.out.println(hashTable.get("key"+8));
		
		
	}

}
