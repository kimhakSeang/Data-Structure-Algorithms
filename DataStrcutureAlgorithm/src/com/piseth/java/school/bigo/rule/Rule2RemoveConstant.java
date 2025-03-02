package com.piseth.java.school.bigo.rule;

public class Rule2RemoveConstant {

	public static void main(String[] args) {
		int[] items = {2,4,6,7,10};
		printFirstItemThenFirstHalfThenSayHello100Times(items);
	}
	
	public static void printFirstItemThenFirstHalfThenSayHello100Times(int[] items) {
		System.out.println(items[0]); // O(1)
		
		int middleIndex = (int)Math.floor(items.length/2.0); // O(1)
		int index = 0; // O(1)
		while(index < middleIndex) { 
			System.out.println(items[index]); // O(n/2)
			index++;// O(n/2)
		}
		
		for(int i =0; i<100; i++) { 
			System.out.println("Hello Cambodia");// O(100)
		}
		
		
	}
	// BIG O(3+2*n/2 + 100) 
	// BIG O(n)
	
	public static void compressBoxTwice(int[] boxes) {
		for(int x : boxes) {
			System.out.println(x); // O(n)
		}
		
		for(int x : boxes) {
			System.out.println(x +"#"); // O(n)
		}
	}
	
	//Big O(2n) => O(n)

}
