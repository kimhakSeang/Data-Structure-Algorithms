package com.piseth.java.school;

public class Sample3 {

	public static void main(String[] args) {
		String[] names = new String[] {"Nita","Piseth","Dara","Thida","Dara",
				"Thida","Dara","Thida","Dara","Thida","Dara","Thida"};
		
		printFirstItems(names);
	}
	
	
	public static void printFirstItems(String[] names) {
		
		System.out.println(names[0]); // O(1)
		System.out.println(names[1]); // O(1)
		// Big O(1) : Constant
	}
	//O(1+1) => O(1)
	
	// Rule Book : 4 rules
	
}
