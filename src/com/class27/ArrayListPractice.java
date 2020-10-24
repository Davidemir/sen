package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		//Lets create an ArrayList to store numbers	
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);//index=3, size =4
		
		int size=numbers.size();
		System.out.println(size);//4
		
		//add more
		numbers.add(10000);
		
		//remove ==> remove(int index);
		//first way: remove 1000
		numbers.remove(3);
		System.out.println(numbers);
		
		//second way: remove 1000
		numbers.remove(size-1);//4-1 = 3(size)   
		System.out.println(numbers);
		
		//remove 10
		numbers.remove(1);
		System.out.println(numbers);
		
		//retrieve value from an arrayList
		int element=numbers.get(0);
		System.out.println(element);
		
		//1. for loop
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("-------------------------");
		
		//2. advanced loop	
		for(int num:numbers) {
			System.out.println(num);
		}
		System.out.println("-------------------------");
		
		//I want to get values backward
		for(int i=numbers.size()-1; i>=0; i--) {
			System.out.println(numbers.get(i));
		}
		System.out.println("-------------------------");
		
		//3 using Iterator
		Iterator<Integer>iterator=numbers.iterator();
		
		while(iterator.hasNext()) {//if we dont know to how many element it has use the while loop
			System.out.println(iterator.next());
		}
		
		
		
	}
}
