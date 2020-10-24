package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		
		//how many elements u have? ==> use the variable.length
		System.out.println(nums.length);
		
		
		
		//Another way declare and initialize an array is 
		
		              //array[0]  array[1]  array[2]  array[3]
		String[] array= {"Winter", "Fall", "Summer", "Spring"};
		
		//I was born in Summer 
		//how many elements u have?
		System.out.println("I was born in "+array[2]);
		
		//array.lenght will return an integer
		int arraySize=array.length;
		System.out.println(arraySize);
		
		
		int[] score= {80 , 90 , 70 , 100 , 99};
		
	}

}
