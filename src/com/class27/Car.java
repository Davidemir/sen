package com.class27;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Car {

	public static void main(String[] args) {
		
		//Create an arraylist of cars and retrieve all values using 3 diffrent ways
		
		
//		ArrayList<String> car = new ArrayList<String>(); both of true
		List<String> car = new ArrayList<String>();//we create object of child child class reference to Parent Class
		//List is parent class, arraylist is child class
 
		car.add("Toyota");
		car.add("BMW");
		car.add("Acura");
		
		System.out.println("...........first way: for loop...........");
		for(int i=0; i<car.size(); i++) {
			System.out.println(car.get(i));
		}
		
		System.out.println("...........second way: enhanced loop...........");
		for(String auto : car) {
			System.out.println(auto);
		}
		
		System.out.println("...........third way: iterator...........");
		Iterator<String> a = car.iterator();//we dont  use new 
		
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
	}

}
