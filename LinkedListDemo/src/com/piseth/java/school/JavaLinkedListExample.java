package com.piseth.java.school;

import java.util.LinkedList;

public class JavaLinkedListExample {
	public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.addFirst("Mango");
        list.addLast("Orange");

        System.out.println(list); // Output: [Mango, Apple, Banana, Orange]

        list.removeFirst();
        list.removeLast();

        System.out.println(list); // Output: [Apple, Banana]
    }
}
