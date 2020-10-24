package com.class13;

public class Phone {
	
	/*
	 * Create a Class "Phone". Create 3 Objects of it: iPhone, Samsung, Nokia with
	 * speciﬁc attributes and behaviors.
	 */
	
	String brand, name; 
	boolean camera;
	int size, screen;
	
	void playGames() {
		System.out.println("I can play games with my "+brand);
	}
	
	void talk() {
		System.out.println("I can talk with my "+brand);
	}
	
	void watchMovie() {
		System.out.println("I can watch movie with my "+brand);
	}
	
	
	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		phone1.brand = "Iphone";
		phone1.name = "XS";
		phone1.size = 64;
		
		phone1.playGames();
		phone1.talk();
		phone1.watchMovie();
		
		System.out.println(".....................................");
		
		Phone phone2 = new Phone();
		phone2.brand = "Samsung";
		phone2.name = "XSss";
		phone2.size = 32;
		
		phone2.playGames();
		phone2.talk();
		phone2.watchMovie();
		
		System.out.println(".....................................");
		
		Phone phone3 = new Phone();
		phone3.brand = "Nokia";
		phone3.name = "3310";
		phone3.size = 4;
		
		phone3.playGames();
		phone3.talk();
		phone3.watchMovie();
		
		System.out.println(".....................................");
		// I have iphone 64 gb xs
		// I have samsung 32 gb xsss
		// I have nokia 4 gb 3310
		
		System.out.println("I have "+phone1.brand+" "+phone1.size+" gb "+phone1.name);
		System.out.println("I have "+phone2.brand+" "+phone2.size+" gb "+phone2.name);
		System.out.println("I have "+phone3.brand+" "+phone3.size+" gb "+phone3.name);
	}
}
