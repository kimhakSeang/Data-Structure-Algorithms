package com.piseth.java.school.application;

public class TaskPrinterApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TaskPrinter printer = new TaskPrinter();
		printer.addTask("Students Report", 10);
		printer.addTask("Payment Invoice", 2);
		printer.addTask("New Student Enroll", 25);
		printer.addTask("Monthly Report", 2);
		
		printer.cancelTask("Payment Invoice");
		
		
		printer.displayTasks();
		System.out.println("==========");
		/*
		printer.printNextTask();
		printer.printNextTask();
		printer.printNextTask();
		printer.printNextTask();
		printer.printNextTask();
		*/
		
		// array list 
		// create new array then copy them to new array
		// 
		

	}

}
