package com.piseth.java.school.bigo.rule;

public class Rule4DropNonDominant {

	public static void main(String[] args) {
		int[] items = {2,4,5,6};
		//(2,2), (2,4),(2,5),(2,6)
		//(4,2),(4,4),
		
		
		
		//2
		//4
		//5
		//6
		
		//4
		//6
		//7
		
		printAllNumbersAndPairSum(items);
		
		System.out.println();
		
	}
	
	
	
	public static void printAllNumbersAndPairSum(int[] items) {
		for(int x : items) {
			System.out.println(x); // O(n)
		}
		
		for(int x : items) {
			for(int y : items) {
				System.out.println(x + y); //O(n^2)
			}
		}
	}
	
	// BIG O(n + n^2)
	// big O(n^2)
	

}
