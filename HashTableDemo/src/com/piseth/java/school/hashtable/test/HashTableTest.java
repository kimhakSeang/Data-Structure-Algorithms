package com.piseth.java.school.hashtable.test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.piseth.java.school.hashtable.HashTable;

public class HashTableTest {
	
	private HashTable hashTable;

	@BeforeEach
	void setUp() {
		hashTable = new HashTable();
	}
	
	@Test
	void testPutAndGet() {
		// given
		
		// when
		
		hashTable.put("iphone", "This is my iphone");
		
		String value = hashTable.get("iphone");
		
		assertEquals("This is my iphone", value);
	}
	
	@Test
	void testUpdate() {
		hashTable.put("iphone", "This is my iphone");
		hashTable.put("iphone", "My iphone is updated");
		
		//String value = hashTable.get("iphone");
		
		assertEquals("My iphone is updated", hashTable.get("iphone"));
		
	}
	
	@Test
	void testNonExistedKey() {
		String value = hashTable.get("iphone");  // iphone key is not added yet
		assertNull(value);
		
	}
	
	@Test
	void testRemove() {
		// given
		String key = "iphone";
		// when
		hashTable.put(key, "This is my iphone");
		hashTable.remove(key);
		String value = hashTable.get(key);
		
		// then
		//assertEquals(null, value);
		assertNull(value);
		
		
	}
	
	@Test
	void testRemoveHasCollision() {
		// given
		String key1 = "iphone";
		String key2 = "iphonex";
		// when
		hashTable.put(key1, "This is my iphone");
		hashTable.put(key2, "My phone");
		hashTable.remove(key2);
		//hashTable.remove(key1);
		String value = hashTable.get(key2);
		
		// then
		//assertEquals("My phone", value);
		assertNull(value);
		
		
	}
	
	@Test
	void testRemoveNonExistKey() {
		// given
		String key = "iphone";
		// when
		hashTable.put(key, "This is my iphone");
		hashTable.remove("dara");
		String value = hashTable.get(key);
		
		// then
		assertEquals("This is my iphone", value);
		
		
	}
	
	@Test
	void testReuseDeletedSlot() {
		
		// given 
		String key = "iphone";
		
		hashTable.put(key, "This is my iphone");
		hashTable.remove(key);
		hashTable.put(key, "This is my NEW iphone");
		
		String value = hashTable.get(key);
		
		assertEquals("This is my NEW iphone", value);

	}
	
	@Test
	void testCollisionHandling() {
		// given
		String key1 = "ab"; // 1+2 = 3
		String key2 = "ba"; // 2+1 = 3
		
		// when
		hashTable.put(key1, "First Element");
		hashTable.put(key2, "Second Element");
		
		// then
		assertEquals("First Element", hashTable.get(key1));
		assertEquals("Second Element", hashTable.get(key2));
	}
	
	@Test
	void testResize() {
		for(int i =1; i<=8; i++) {
			hashTable.put("key"+i, "value"+i);
		}
		
		for(int i =1; i<=8; i++) {
			assertEquals("value"+i, hashTable.get("key"+i));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
