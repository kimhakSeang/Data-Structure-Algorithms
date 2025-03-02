package com.piseth.java.school.service;

import java.util.Arrays;

public class ArrayService {
	
	public static void main(String[] args) {
		
		String[] names = {"Dara","Piseth","Thida"};
		
		//String[] names = new String[4];
		//names[2] = "Dara";
		
		System.out.println(Arrays.toString(names));
		
		//Look up
		//String name = names[2]; // O(1)
		//System.out.println(name);
		
		// push  : add new element at the end of array
		
		//names = push(names, "Lida");
		System.out.println("---- After Pushing new item ---");
		System.out.println(Arrays.toString(names));
		
		
		
	}
	
	// add new element at the end of array
	public String[] push(String[] names, String newItem) {
		String[] newArray = new String[names.length+1];
		// Copy old data
		for(int i =0; i < names.length; i++) {
			newArray[i] = names[i];
		}
		// Assign new data
		newArray[names.length] = newItem;
		// point to new array
		//names = newArray;
		return newArray;
		
	}
	
	public String[] addToSpecificIndex(String[] arr, String newItem, int indexToAdd) {
		String[] newArray = new String[arr.length+1]; // initialize capacity
		
		// step 1: keep same
		for(int i =0; i< indexToAdd; i++) {
			newArray[i] = arr[i];
		}
		
		// step 2: assign new value
		newArray[indexToAdd] = newItem;
		
		// step 3: shift right 
		for(int i = indexToAdd + 1; i < newArray.length; i++ ) {
			newArray[i] = arr[i-1];
		}
		
		return newArray;
	}
	
	
	
	
	
	
	

}
