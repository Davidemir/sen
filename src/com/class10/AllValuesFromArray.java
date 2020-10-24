package com.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		
		/*
		 * To print all values from an array we can use for loop using following syntax
           for ( int i=0; i < array.length; i++ ) { 
           System.out.println( array[i] ); 
           } 
		 */
		char[] grades= { 'A', 'B', 'C', 'D', 'E', 'F'};
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		System.out.println("..................");
		
		String[] animals= {"Cat","Dog","Cow","Snake","Elephant"};
		
		//====FIRST WAY====
		//how many element it has?
		System.out.println(animals.length);
		
		//I wanna print all values by one by
		for (int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
		System.out.println("...........................");
		
		//====SECOND WAY====
		//how many element is has?
		int size=animals.length;
		System.out.println(size);
		
		//I wanna print all values by one by
		for (int i=0; i<size; i++) {
			System.out.print(animals[i]+" ");
		}

		System.out.println("...................");
		//create an array to store 5 double values, print all elements
		double[] num= {1.5,  2.5,  3.5,  4.5,  5.5};
		
		//how many element is has?
		int size1=num.length;
		System.out.println(size1);
		
		for (int i=0; i<size1; i++) {
			System.out.println(num[i]+" ");
		}
	}

}
