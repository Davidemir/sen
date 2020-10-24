package com.class11;

public class Recap {

	public static void main(String[] args) {
		
		//let's create an array of names thats will hold 6 elements and retrieve all values
		
		System.out.println("==>FIRST WAY ==> create an array using new keyword");
		 
		String[] names = new String[5];
		names[0]="Asel";
		names[1]="David";
		names[2]="Halo";
		names[3]="Efe";
		names[4]="Weqas";
	//	names[5]="Shiva"; // will get an runtime exception when trying to access it.
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("==>SECOND WAY==> create an array using array literal");
		
		
		String[] name= { "Asel","David","Halo","Efe","Weqas"};
		
		for (int i=0; i<=name.length-1; i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("==>THIRD WAY==>retrieve array using: advanced for loop, for each loop, enhanced for loop");
	
		String[] nameS = { "Asel", "David", "Halo", "Efe", "Weqas" };

		for (String developer : nameS) {
			System.out.println(developer);

		}
	
	}

}
