package com.class27;

import java.util.ArrayList;
import java.util.List;

/*
 * NOTE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * if u see the Object type question:
 * first create instance variable 
 * second create Constructor and initilaze instance variable to local variable
 * third when u create Collection and then create to add method;
 * it must like below type
 * for example ilist.add(new Instructor("Asel", "Umurzakova"));
 */
class Instructor{
	String name;
	String lastName;

	public Instructor(String name,String lastName ) {
		this.name=name;
		this.lastName=lastName;
	}
	
	public void display() {
		System.out.println("Instructors full name is "+name+" "+lastName);
	}
}
public class InstructorListExample {

	public static void main(String[] args) {
		// create a list that will hold 4 instructors
		List<Instructor> ilist = new ArrayList<>();
		//first way: long way
//		Instructor i1 =new Instructor("Asel", "Umurzakova");
//		Instructor i2 = new Instructor("Diego", "Juarez");
//		Instructor i3 =new Instructor("Mohammad", "Shokriyan");
//		Instructor i4 =new Instructor("Weqas", "Haq");
//		
//		ilist.add(i1);
//		ilist.add(i2);
//		ilist.add(i3);
//		ilist.add(i4);
		
		//second way: short way
		ilist.add(new Instructor("Weqas", "Haq"));
		ilist.add(new Instructor("Asel", "Umurzakova"));
		ilist.add(new Instructor("Diego", "Juarez"));
		ilist.add(new Instructor("Mohammad", "Shokriyan"));
		
		

		for (Instructor i : ilist) {
			System.out.println(i.lastName);
			i.display();
		}
		

	}

}
