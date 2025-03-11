package com.piseth.java.school.service.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.piseth.java.school.model.MyArray;

public class MyArrayTest {

	@Test
	void pushOneValue() {
		// given
		MyArray array = new MyArray();
		// when
		array.push(2);
		
		// then
		assertEquals(1, array.getLength());
	}
	
	@Test
	void pushMultipleValue() {
		// given
		MyArray array = new MyArray();
		int[] expectedArray = {2,4};
		// when
		array.push(2);
		array.push(4);
		
		// then
		assertEquals(2, array.getLength());
		assertArrayEquals(expectedArray, array.getValue());
		assertEquals(array.getLength(), array.getValue().length);
	}
	
	@Test
	void pushOneValueButNotEvenNumber() {
		// given
		MyArray array = new MyArray();
		// when
		
		RuntimeException exception = assertThrows(RuntimeException.class, () -> array.push(3));
		
		// then
		assertEquals("Not even number!", exception.getMessage());
	}
	
}
