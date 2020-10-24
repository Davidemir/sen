package com.class11;

public class SmallestNumber {

	public static void main(String[] args) {
		
		//create an array of integers and find SMALLEST NUMBER
		System.out.println("First way with for loop");
		
		int[] number = { 2 ,3 ,5 , 17, -34 , -120, 100};
        int smallest = number[0];
        
        for (int i=0; i<number.length; i++) {
        	if(number[i]<smallest) {
        		smallest=number[i];
        	}
        }
        
        System.out.println(smallest);
        
        System.out.println("Second way with ADVANCED LOOP");
        
        int[] numbers = { 2 ,3 ,5 , 17, -34 , -120, 100};
        int smallesT = numbers[0];
        
        for (int num : numbers) {
        	if(num<smallesT) {
        		smallesT=num;
        	}
        }
        System.out.println(smallesT);
	}

}
