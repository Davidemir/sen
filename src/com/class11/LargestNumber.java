package com.class11;

public class LargestNumber {

	public static void main(String[] args) {
		
		//create an array of integers and find LARGEST NUMBER
		System.out.println("First way with ADVANCED LOOP");
		int[] number = { 2 ,3 ,5 , 17, -34 , -120, 100};
		int largest=number[0];
		
		for (int num : number) {
			if(num>largest) {
				largest=num;
			}
		}
		System.out.println(largest);

		
		System.out.println("Second way with for loop");
		
	    int[] numbeR = { 2 ,3 ,5 , 17, -34 , -120, 100};
	    int largesT=number[0];
	    
	    for (int i=0; i<numbeR.length; i++) {
	    	if(numbeR[i]>largesT) {
	    		largesT=numbeR[i];
	    	}
	    }
	    
	    System.out.println(largesT);
	}

}
