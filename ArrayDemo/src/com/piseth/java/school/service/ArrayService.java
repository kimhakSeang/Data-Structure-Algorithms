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
	
	public String[] removeElementBySpecificIndex2(String[] arr, int indexToRemove) {
		// Validate index to remove 
		if(indexToRemove < 0 || indexToRemove > arr.length - 1) {
			throw new RuntimeException("Index out of range");
		}		
		
		String[] newArr = new String[arr.length - 1];
		
		for(int i = 0; i < indexToRemove; i++) {
			newArr[i] = arr[i];
		}
		
		// shift left
		for(int i = indexToRemove; i < newArr.length; i++) {
			newArr[i] = arr[i + 1];
		}
		
		return newArr;
		
	}
	
	public String[] removeElementBySpecificIndex(String[] arr, int indexToRemove) {
		// Validate index to remove 
		if(indexToRemove < 0 || indexToRemove > arr.length - 1) {
			throw new RuntimeException("Index out of range");
		}		
		
		String[] newArr = new String[arr.length - 1];
		
		for(int i = 0; i < newArr.length; i++) {
			if(i < indexToRemove) {
				newArr[i] = arr[i]; 
			}else {
				newArr[i] = arr[i + 1];
			}
		}
		
		return newArr;
		
	}
	
	public String pop(String[] arr) {
		int lastIndex = arr.length - 1;
		
		String lastElement = arr[lastIndex];
		arr = removeElementBySpecificIndex(arr, lastIndex);
		
		return lastElement;
	}
	
	public String[] pop2(String[] arr) {
		int lastIndex = arr.length - 1;
		
		String lastElement = arr[lastIndex];
		arr = removeElementBySpecificIndex(arr, lastIndex);
		System.out.println("Last Element: " + lastElement); //
		
		return arr;
	}
	
	
	
	
	
	
	

}
