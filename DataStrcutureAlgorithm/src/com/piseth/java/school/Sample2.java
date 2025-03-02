package com.piseth.java.school;

public class Sample2 {

	public static void main(String[] args) {
		String[] names = new String[] {"Nita","Piseth","Dara","Thida"};
		/*String[] names = new String[] {"Nita","Piseth","Dara","Thida",
				"Dara","Thida","Dara","Thida","Dara",
				"Thida","Dara","Thida","Dara","Thida",
				"Dara","Thida","Dara","Thida","Dara",
				"Thida","Dara","Thida","Dara","Thida",
				"Dara","Thida","Dara","Thida","Dara",
				"Thida","Dara","Thida","Dara",
				"Thida","Dara","Thida","Dara","Thida"};
				*/
//		String[] names = new String[1_000_000]; 
//		for(int i = 0; i< 1_000_000; i++) {
//			names[i] = "Some name "+ i;
//		}
		findName(names);
	}
	
	
	// Find Piseth
	public static void findName(String[] names) {
		
		for(int i =0; i<names.length; i++) {
			System.out.println("running" );
			if(names[i] == "Piseth") {
				System.out.println("Found Piseth");
			}
		}
		
	}
	
	//Big O(n)
	// Big O depend on number of input
	//O(n)

}
