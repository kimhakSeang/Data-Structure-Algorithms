package com.piseth.java.school.service;

public class StringAndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Dara";
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));
		
		System.out.println(name.length());
		
		// Reverse String "Welcome to Cambodia"
		
		// aidobmac ot emocleW
		
		String welcomeText = "Welcome to Cambodia";
		
		
		String text = reverseString(welcomeText);
		System.out.println(text);

	}
	
	public static String reverseString(String name) {
		String reverseText = "";
		for(int i = name.length() - 1; i >= 0 ; i--) {
			reverseText += name.charAt(i);
		}
		return reverseText;
	}

}
