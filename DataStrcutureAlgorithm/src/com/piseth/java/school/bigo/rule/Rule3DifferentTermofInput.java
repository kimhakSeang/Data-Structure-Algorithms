package com.piseth.java.school.bigo.rule;

public class Rule3DifferentTermofInput {

	public static void main(String[] args) {
		int[] items = {2,4,5,6};
		//(2,2), (2,4),(2,5),(2,6)
		//(4,2),(4,4),
		
		printPairOfElement(items);
	}
	
	
	
	public static void compressBoxTwice(int[] boxes, int[] boxes2) {
		for(int x : boxes) {
			System.out.println(x); // O(n)
		}
		
		for(int x : boxes2) {
			System.out.println(x +"#"); // O(m)
		}
	}
	
	//Big O(a+b)
	
	// print all pair of element in array
	
	public static void printPairOfElement(int[] items) {
		for(int i = 0; i< items.length; i++) { // O(n)
			for(int j=0; j <items.length; j++) { // O(n)
				System.out.println(items[i] + "," + items[j]);
			}
		}
	}
	// => BIG O(n^2)

}
