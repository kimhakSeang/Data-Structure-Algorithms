package com.piseth.java.school.hashtable.hashmap;

import java.util.HashMap;

import com.piseth.java.school.hashtable.HashTable;
import com.piseth.java.school.hashtable.HashTableGeneric;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("banana", 5);
		map.put("orange", 4);
		
		System.out.println(map);
		
		
		//HashTable hashtable = new HashTable();
		//hashtable.put("dara", 5);
		
		HashTableGeneric<String, Integer> hashtable = new  HashTableGeneric<>();
		hashtable.put("Dara", 5);
		
		System.out.println(hashtable.get("Dara"));

	}

}
