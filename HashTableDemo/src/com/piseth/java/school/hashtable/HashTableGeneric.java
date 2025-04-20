package com.piseth.java.school.hashtable;

public class HashTableGeneric<K,V> {
	
	private Entry<K,V>[] table;
	private static final int INITIAL_SIZE = 10;
	private static final double LOAD_THRESHOLD = 0.7;
	private int counter;
	private final Entry<K,V> DELETED = new Entry("#DELETED#", "#DELETED#");
	
	public HashTableGeneric() {
		this.table = new Entry[INITIAL_SIZE];
		counter = 0;
	}
	
	private int hash(K key, int tableSize) {  // key = "dara";  155%10 = 5
		int hashValue = 0;
		for(int i = 0; i< key.toString().length(); i++) {
			hashValue = (hashValue + key.toString().charAt(i) * i) % tableSize;
		}
		//System.out.println("Hash Value: "+ hashValue);  ab , ba
		return hashValue;
	}
	
	public V get(K key) {
		int index = hash(key, table.length);
		
		while(table[index] != null) {
			if(table[index].key.equals(key)) {
				return table[index].value;
			}
			index = (index + 1) % table.length;
		}
		
		return null;
	}
	
	public void remove(K key) {
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
	
	public void put(K key, V value) {
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
		Entry<K,V>[] newTable = new Entry[newSize];
		
		// rehash, re-input
		for(Entry<K,V> entry : this.table) {
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
	
	private static class Entry<K,V>{ // Generics in Java
		K key;
		V value;
		
		Entry(K key, V value){
			this.key = key;
			this.value = value;
		}
		
	}

}
