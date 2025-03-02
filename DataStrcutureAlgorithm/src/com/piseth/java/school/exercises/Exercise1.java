package com.piseth.java.school.exercises;

public class Exercise1 {

	public static void main(String[] args) {
		
	}
	
	
	public static int sampleBigOCalculation(int[] boxes) {
		int a = 20; // O(1)
		a = 40 + 5; // O(1)
		
		for(int i=0; i<boxes.length; i++) { // O(n)
			otherMethod(); // O(n)
			boolean help = true; // O(n)
			a++; // O(n)
		}
		return a; // O(1)
	}
	
	// BIG O(3 + 4n)
	// O(n)
	
	public static void otherMethod() {
		
	}
	
	
}
