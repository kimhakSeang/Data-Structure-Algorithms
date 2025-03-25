package com.piseth.java.school.hashtable;

import java.util.Arrays;

public class HashTable {
	
	private Entry[] table;
	private static final int INITIAL_SIZE = 10;
	private static final double LOAD_THRESHOLD = 0.7;
	private int counter;
	private final Entry DELETED = new Entry("#DELETED#", "#DELETED#");
	
	public HashTable() {
		this.table = new Entry[INITIAL_SIZE];
		counter = 0;
	}
	
	/*
	private int hash(String key, int tableSize) {
		int index = key.hashCode() % tableSize;
		System.out.println("hash value: " + index);
		return index;
	}
	*/
	private int hash(String key, int tableSize) {  // key = "dara";  155%10 = 5
		int hashValue = 0;
		for(int i = 0; i< key.length(); i++) {
			hashValue = (hashValue + key.charAt(i) * i) % tableSize;
		}
		System.out.println("Hash Value: "+ hashValue);
		return hashValue;
	}
	
	public String get(String key) {
		int index = hash(key, table.length);
		
		while(table[index] != null) {
			if(table[index].key.equals(key)) {
				return table[index].value;
			}
			index = (index + 1) % table.length;
		}
		
		return null;
	}
	
	public void remove(String key) {
		int index = hash(key, table.length);
		
		while(table[index] != null) {
			if(table[index].key.equals(key)) {
				table[index] = DELETED;
				counter--;
				return;
			}
			index = (index + 1) % table.length;
		}
		
	}
	
	public void put(String key, String value) {
		// Check if need to increase size
		if(counter >= table.length * LOAD_THRESHOLD) {
			resize();
		}
		// Find index
		int index = hash(key, table.length);
		
		// Find firstDeletedIndex
		int firstDeletedIndex = -1; // for reuse slot
		
		// In case there is hash collision
		// Linear Probing
		while(table[index] != null) {
			if(table[index] == DELETED) {
				if(firstDeletedIndex == -1) {
					firstDeletedIndex = index; // Mark as deleted slot
				}
			}else if(table[index].key.equals(key)) {
				table[index].value = value; // Update existing value
				return;
			}
			index = (index + 1) % table.length; 
		}
		
		if(firstDeletedIndex != -1) {
			table[firstDeletedIndex] = new Entry(key,value);
		}else {
			table[index] = new Entry(key,value); // Add new Entry
		}
		
		// increase counter
		counter++;
		
				
	}
	
	private void resize() {
		int newSize = table.length * 2;
		Entry[] newTable = new Entry[newSize];
		
		// rehash, re-input
		for(Entry entry : this.table) {
			if(entry != null && entry != DELETED) {
				int index = hash(entry.key, newSize);
				// fix hash collision by linear probing
				while(newTable[index] != null) {
					index = (index + 1) % newSize;
				}
				newTable[index] =  entry; // new Entry(entry.key,entry.value);
			}
		}
		this.table = newTable; // Update Reference
		System.out.println("New Size: " + newSize);
		
	}
	
	public void print() {
		System.out.println(Arrays.toString(table));
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
	
	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		
		hashTable.put("aa", "AA");
		hashTable.put("bb", "BB");
		hashTable.put("cc", "CC");
		
		hashTable.print();
		
		// Test Resize
		/*
		for(int i = 0; i< 10; i++) {
			hashTable.put("key"+i, "Value"+i);
		}
		
		hashTable.print();
		*/
		
	}

}
