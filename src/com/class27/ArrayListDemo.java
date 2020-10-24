package com.class27;

import java.util.ArrayList;//dont forget to import

public class ArrayListDemo {
	
	public static void main(String[] args) {
		                                         //we store String inside angle brackets
		ArrayList<String> arrayList= new ArrayList<String>();
		//to store values inside you collection ==> add
		arrayList.add("John");
		arrayList.add("Jane");
		arrayList.add("Jack");
		
		
		//to retrieve the value from arrayList  ==> get(int index)
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
		
		
		//add more values
		arrayList.add("James");
		arrayList.add("John");//we can write duplicate
		arrayList.add("Jane");//we can write duplicate
		
		
		//How many elements inside the arrayList?  ==> size();
		int size = arrayList.size();
		System.out.println(size);
		
		
		
		
		System.out.println("................................");
		
//		ArrayList<int> numList= new ArrayList<>(); ==>CE coz we can not use primitive type inside 
		//arrayList but we can use Object
		
		
		//creating an Object of ArrayList that will hold numeric values
		ArrayList<Integer> numArrList= new ArrayList<>();//we use the object(Integer, Long,..) it works
		//to store values inside you collection ==> add
		numArrList.add(100);
		numArrList.add(200);
		numArrList.add(300);
		
		
		//update the values ==> set(int index, Integer element);
		numArrList.set(0, 1000);
		
		//how can u show all number together? ==> like this [1000, 200, 300]
		System.out.println(numArrList);
		
		//retrieving values ==>get(int index)
		System.out.println(numArrList.get(0));
		System.out.println(numArrList.get(1));
		System.out.println(numArrList.get(2));
	
		System.out.println("...............................");
		
		//how can we call by one by:
		//first with for loop
		//note why we start to int num =0; coz index start 0
		//int num = control or counter ==> control number of iterations(TEKRARLAMA) for the loop
		for(int num=0; num<numArrList.size(); num++) {
			System.out.println(numArrList.get(num));
		}
		
		System.out.println("...............................");
		
		//second with enhance/advance loop
		for(Integer num:numArrList) {
			System.out.println(num);
		}
	}

}
