package com.class13;

public class Dog {
	
	//Variables and methods defined inside the class are class members
	
	
	/* Create a Dog Class and create 3 different objects of it: 
	 * Husky, Bulldog, Labrador with speciﬁc attributes and behaviors
	 */

	String color, name;
	int breed;//(dogurmak)
	
	
	void bark() {
		System.out.println(name+" can bark");
	}
	
	void run() {
		System.out.println(name+" can run");
	}
	
	void play() {
		System.out.println(name+" can play");
	}
	
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.name = "Husky";
		dog1.color = "Grey";
		dog1.breed = 8;
		
		dog1.bark();
		dog1.run();
		dog1.play();
		
		System.out.println(".................................");
		
		Dog dog2 = new Dog();
		dog2.name = "Bulldog";
		dog2.color = "Black";
		dog2.breed = 2;
		
		dog2.bark();
		dog2.run();
		dog2.play();
		
		System.out.println(".................................");
		
		Dog dog3 = new Dog();
		dog3.name = "Labrador";
		dog3.color = "white";
		dog3.breed = 5;
		
		dog3.bark();
		dog3.run();
		dog3.play();
		
		
	}
}
