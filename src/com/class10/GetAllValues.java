package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		
		String[] animals= {"Cat","Cow","Snake","Dog", "Elephant"};
		
		//I want to print all values from an array
		//when value is Dog==> I love dogs
		
		for (int i=0; i<animals.length; i++) {
			
			if(animals[i].equals("Dog")) {
				System.out.println(" I love dogs");
			}else {
				System.out.println(animals[i]);
			}
			
		}

	}

}
