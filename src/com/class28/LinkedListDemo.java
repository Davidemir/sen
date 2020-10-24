package com.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//create  linked list of String object
		LinkedList<String> llist=new LinkedList<>();
		//adding elements
		llist.add("Hello");
		llist.add("Bye");
		llist.add("Hello");//we can make duplicate
		llist.add("Bye");//we can make duplicate
		
		llist.add(0, "How are you?");//if we wanna change value we can use ==>add(int index, String element) also
		//it like set or replace
		
		System.out.println(llist.size());
		
		//add more elements
		llist.add("Hello1");
		llist.add("Bye1");
		
		//retrieve
		System.out.println(llist.get(1));
		
		//update/replace ==> set
		llist.set(2, "Hi");
		System.out.println(llist);
		
		
		System.out.println(".........................");
		
		// how to retrieve all values from linked list

		System.out.println("--------------1 way: for loop............");
		for (int i = 0; i < llist.size(); i++) {
			System.out.println(llist.get(i));
		}

		System.out.println("--------------2 way:enhanse loop............");
		for (String el : llist) {
			System.out.println(el);
		}

		System.out.println("--------------3 way:iterator..............");
		Iterator<String> it = llist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
