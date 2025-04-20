package com.piseth.java.school.hashtable;

import java.util.ArrayList;

public class HashTableArrayList {
	
	//private Entry[] table;
	private ArrayList<Entry> table;
	private static final int INITIAL_SIZE = 10;
	private final Entry DELETED = new Entry("#DELETED#", "#DELETED#");
	
	public HashTableArrayList() {
		//this.table = new Entry[INITIAL_SIZE];
		this.table = new ArrayList<>(INITIAL_SIZE);
		// Add null value
		for(int i = 0; i< INITIAL_SIZE; i++) {
			table.add(null);
		}
		
	}
	
	private int hash(String key, int tableSize) {  // key = "dara";  155%10 = 5
		int hashValue = 0;
		for(int i = 0; i< key.length(); i++) {
			hashValue = (hashValue + key.charAt(i) * i) % tableSize;
		}
		//System.out.println("Hash Value: "+ hashValue);  ab , ba
		return hashValue;
	}
	
	public String get(String key) {
		int index = hash(key, table.size());
		
		while(table.get(index) != null) { // table.get(index) != null
			if(table.get(index).key.equals(key)) {
				return table.get(index).value;
			}
			index = (index + 1) % table.size();
		}
		
		return null;
	}
	
	public void remove(String key) {
		int index = hash(key, table.size());
		
		while(table.get(index) != null) {
			if(table.get(index).key.equals(key)) {
				//table.get(index) = DELETED; // table[index] = DELETE;
				table.set(index, DELETED);
				return;
			}
			index = (index + 1) % table.size();
		}
		
	}
	
	public void put(String key, String value) {
		
		// Find index
		int index = hash(key, table.size());
		
		// Find firstDeletedIndex
		int firstDeletedIndex = -1; // for reuse slot
		
		// In case there is hash collision
		// Linear Probing
		while(table.get(index) != null) {
			if(table.get(index) == DELETED) {
				if(firstDeletedIndex == -1) {
					firstDeletedIndex = index; // Mark as deleted slot
				}
			}else if(table.get(index).key.equals(key)) {
				table.get(index).value = value; // Update existing value
				return;
			}
			index = (index + 1) % table.size(); 
		}
		
		if(firstDeletedIndex != -1) {
			//table[firstDeletedIndex] = new Entry(key,value);
			table.set(firstDeletedIndex, new Entry(key,value));
		}else {
			//table.get(index) = new Entry(key,value); // Add new Entry
			table.set(index, new Entry(key,value));
		}
				
	}
	
	private static class Entry{
		String key;
		String value;
		
		Entry(String key, String value){
			this.key = key;
			this.value = value;
		}
		
	}

}
