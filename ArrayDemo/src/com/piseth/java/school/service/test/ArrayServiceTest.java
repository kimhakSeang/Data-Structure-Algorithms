package com.piseth.java.school.service.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
