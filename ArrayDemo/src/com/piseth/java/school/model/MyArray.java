package com.piseth.java.school.model;

public class MyArray {
	private int length;
	private int[] value;
	
	public MyArray() {
		this.length = 0;
		this.value = new int[0];
	}
	
	// Only Even number
	public void push(int element) {  
		if(element % 2 != 0) {
			throw new RuntimeException("Not even number!");
		}
		
		int[] newArray = new int[length + 1];
		
		for(int i = 0; i < length; i++) { // 1 : index: 0
			newArray[i] = value[i];
		}
		newArray[length] = element;
		length++;
		value = newArray;
		
	}

	public int getLength() {
		return length;
	}

	public int[] getValue() {
		return value;
	}
	
	

}
