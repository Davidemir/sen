package com.class17;

public class Human {
	
	//instance variables
	String name;
	String lastName;
	
	
	//static variables belongs to class(class Human)//common properties
	static int eyes = 2;
	static int nose = 1;
	static boolean brain = true;
	
	public static void main(String[] args) {
		
		Human human1 = new Human();
		human1.name = "John";
		human1.lastName = "Smith";
		
		
		System.out.println("first way(static variable output)");
		
		System.out.println(Human.eyes);//static variables belongs to class(class Human)==>this is preferred way
		System.out.println(Human.nose);
		System.out.println(Human.brain);
		
		System.out.println("second way(static variable output)");
		System.out.println(human1.eyes);//but u can uses human1 also ==>this is NOT preferred way
		System.out.println(human1.nose);
		System.out.println(human1.brain);
		
		System.out.println("third way(static variable output)");
		
		System.out.println(eyes);//==>this is NOT preferred way
		System.out.println(nose);
		System.out.println(brain);
		
		
		Human human2 = new Human();
		human2.name = "Jimmy";
		human2.lastName = "Miller";
		human2.lastName = "Iron";
		
		System.out.println(Human.eyes);
		System.out.println(Human.nose);
		System.out.println(Human.brain);
		
		
		System.out.println(eyes);
		System.out.println(nose);
		System.out.println(brain);
		
		System.out.println(human1.lastName);
		System.out.println(human2.lastName);
	}

}
