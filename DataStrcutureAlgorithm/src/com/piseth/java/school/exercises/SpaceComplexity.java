package com.piseth.java.school.exercises;

public class SpaceComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Space Complexity
	public void doSomething(int[] items) {
		for(int i = 0; i< items.length ; i++) { // O(1)
			System.out.println("Test");
		}
	}
	
	// Big O(1)
	
	public String[] getStringNTime(int n) {
		String[] items = new String[n]; // O(n)
		for(int i = 0; i< n; i++) { // O(1)
			items[i] = "Hello Dara";
		}
		return items;
	}

	// BIG O(n)
}
