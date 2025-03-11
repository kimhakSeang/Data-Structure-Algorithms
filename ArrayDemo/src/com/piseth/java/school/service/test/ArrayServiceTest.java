package com.piseth.java.school.service.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.piseth.java.school.service.ArrayService;

public class ArrayServiceTest {
	
	private ArrayService arrayService = new ArrayService();

	@Test
	void push() {
		// given
		String[] items = {"A","B","C"};
		String newElement = "E";
		
		String[] expectedArray = {"A","B","C","E"};
		
		// when
		String[] newArray = arrayService.push(items, newElement);
		// then
		
		//assertEquals(expectedArray, newArray);
		assertArrayEquals(expectedArray, newArray);
	}
	
	@Test
	void addToSpecificIndex() {
		// given
		String[] items = {"A","B","C","D","E"};
		String newElement = "F";
		int indexToAdd = 2;
		
		String[] expectedArray = {"A","B","F","C","D","E"};
		//String[] expectedArray = {"A","B","C","F","D","E"}; error, wrong index
		
		// when
		String[] newArray = arrayService.addToSpecificIndex(items, newElement, indexToAdd);
		
		// then
		assertArrayEquals(expectedArray, newArray);
	}
	
	@Test
	void addToSpecificIndexFirst() {
		// given
		String[] items = {"A","B","C","D","E"};
		String newElement = "F";
		int indexToAdd = 0;
		
		String[] expectedArray = {"F","A","B","C","D","E"};
		
		// when
		String[] newArray = arrayService.addToSpecificIndex(items, newElement, indexToAdd);
		
		// then
		assertArrayEquals(expectedArray, newArray);
	}
	
	@Test
	void removeElementBySpecificIndex() {
		// given
		String[] items = {"A","B","C","D","E"};
		int indexToRemove = 3;
		
		String[] expectedArray = {"A","B","C","E"};
		
		// when
		String[] newArray = arrayService.removeElementBySpecificIndex(items, indexToRemove);
		// then
		
		assertArrayEquals(expectedArray, newArray);
	}
	
	@Test
	void removeElementBySpecificIndexError_indexGreterThanArrayLength() {
		// given
		String[] items = {"A","B","C","D","E"};
		int indexToRemove = 5;
		
		String[] expectedArray = {"A","B","C","E"};
		
		// when
		RuntimeException exception = assertThrows(RuntimeException.class, () -> arrayService.removeElementBySpecificIndex(items, indexToRemove));
		// then
		
		assertEquals("Index out of range", exception.getMessage());
	}
	
	@Test
	void removeElementBySpecificIndexError_IndexLessThanZero() {
		// given
		String[] items = {"A","B","C","D","E"};
		int indexToRemove = -1;
		
		String[] expectedArray = {"A","B","C","E"};
		
		// when
		RuntimeException exception = assertThrows(RuntimeException.class, () -> arrayService.removeElementBySpecificIndex(items, indexToRemove));
		// then
		
		assertEquals("Index out of range", exception.getMessage());
	}
	
	@Test
	void pop() {
		// given
		String[] items = {"A","B","C","D","E"};
		
		String[] expectedArray = {"A","B","C","D"};
		// when
		String lastElement = arrayService.pop(items);
		// then
		assertEquals("E", lastElement);
		//assertEquals(4, items.length);
		
		// get last element
		// remove last element from array
		
		//Stack
		// Queue
		
	}
	
}
