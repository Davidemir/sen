package com.class13;

public class DogSecondWAY {
	
	/* Create a Dog Class and create 3 different objects of it: 
	 * Husky, Bulldog, Labrador with speciﬁc attributes and behaviors
	 */

	String color, name;
	int breed;//(dogurmak)
	
	// normally we write methods in Dog class but if we want we can write in object .
	//and it will come after main method blocks
	
//	void bark() {
//		System.out.println(name+" can bark");
//	}
	
//	void run() {
//		System.out.println(name+" can run");
//	}
	
//	void play() {
//		System.out.println(name+" can play");
//	}
	
	public static void main(String[] args) {
		
		DogSecondWAY dog1 = new DogSecondWAY();
		dog1.name = "Husky";
		dog1.color = "Grey";
		dog1.breed = 8;
		
		dog1.bark();
		dog1.run();
		dog1.play();
		
		System.out.println(".................................");
		
		DogSecondWAY dog2 = new DogSecondWAY();
		dog2.name = "Bulldog";
		dog2.color = "Black";
		dog2.breed = 2;
		
		dog2.bark();
		dog2.run();
		dog2.play();
		
		System.out.println(".................................");
		
		DogSecondWAY dog3 = new DogSecondWAY();
		dog3.name = "Labrador";
		dog3.color = "white";
		dog3.breed = 5;
		
		dog3.bark();
		dog3.run();
		dog3.play();
		
		
	}
	// normally we write methods in Dog class but if we want we can write in object .
	//and it will come after main method blocks
	void bark() {
		System.out.println(name+" can bark");
	}
	
	void run() {
		System.out.println(name+" can run");
	}
	
	void play() {
		System.out.println(name+" can play");
	}
}
