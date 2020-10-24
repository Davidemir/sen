package com.class11;

public class SumNumber {

	public static void main(String[] args) {


		/*
		 * Create an array on integers and calculate the sum of all elements in an array.
		 */
		System.out.println("First way with for loop");
		
		int[] nums = { 20, 12, 3, 53};
		int sum=0;
		
		for (int i=0; i<nums.length; i++) {
		 sum=sum+nums[i];
		 //System.out.println(sum); //if u write inside the for loop it will sum by one by 
		 //therefore write outside the the for loop.
		}
		 System.out.println(sum);
		 
		 System.out.println("Second way with for each loop/advanced loop/enhanced loop");
		 
		 int[] num = {20, 12, 3, 53};
		 int sum1=0;
		 
		 for (int number : num) {
			 sum1=sum1+number;
				 
		 }
		 System.out.println(sum1);
	 }
		 
}


