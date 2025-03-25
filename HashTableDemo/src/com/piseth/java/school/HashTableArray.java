package com.piseth.java.school;

import java.util.Arrays;

public class HashTableArray {

	/**
	 
	 K, V
	 key: String
	 Value: String
	 
	 method:
	 +put(key, value)
	 +get(key)
	 +remove(key)
	 -hash(key)
	 
	 
	 */
	
	private final static int SIZE = 3; // [0,9]
	private Entry[] table;
	private final Entry DELETED = new Entry("DELETED", null);
	
	public HashTableArray() {
		this.table = new Entry[SIZE];
	}
	
	private int hash(String key) {  // key = "dara";  155%10 = 5
		int hashValue = 0;
		for(int i = 0; i< key.length(); i++) {
			hashValue = (hashValue + key.charAt(i) * i) % SIZE;
		}
		System.out.println("Hash Value: "+ hashValue);
		return hashValue;
	}
	
	public void put(String key, String value) {
		int index = hash(key);
		// Fix hash collision
		// Linear probing [0,2]
		
		while(table[index] != null && !table[index].key.equals(key)) {
			index = (index + 1) % SIZE;
		}
		
		this.table[index] = new Entry(key, value);
	}
	
	public String get(String key) {
		int index = hash(key);
		
		while(table[index] != null) {
			if(table[index].key.equals(key)) {
				return table[index].value;
			}
			index = (index + 1) % SIZE;
		}
		return null;
	}
	
	public void remove(String key) {
		int index = hash(key);
		System.out.println("Index to remove before collision" + index);
		
		while(table[index] != null) {
			if(table[index].key.equals(key)) {
				this.table[index] = DELETED;
				return;
			}
			index = (index + 1) % SIZE;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static class Entry{
		String key;
		String value;
		
		Entry(String key, String value){
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Entry [key=" + key + ", value=" + value + "]";
		}
		
	}
	
	public void print() {
		System.out.println(Arrays.toString(this.table));
	}
	
	
	// SOLID principles
}
