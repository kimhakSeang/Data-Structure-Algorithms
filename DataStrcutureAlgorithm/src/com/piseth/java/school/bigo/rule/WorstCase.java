package com.piseth.java.school.bigo.rule;

public class WorstCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[] {"Dina","Nita","Dara","Thida","Piseth"};
		findName(names);
	}
	
	public static void findName(String[] names) {
		
		for(int i =0; i<names.length; i++) {
			System.out.println("running: " + (i+1) );
			if(names[i] == "Piseth") {
				System.out.println("Found Piseth");
				break;
			}
		}
		
	}
	// BIG O(n)

}
