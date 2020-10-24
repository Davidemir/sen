package InterviewQuestions;


import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		/*
		 * Write a java program to find the second largest number in the array? 
		 * Maximum and minimum number in the array?
		 */

		int[] array = { 100, -90, 8787, 898, 0, 1 };
		
		//first way (EASIEST WAY)
		Arrays.sort(array);//we use that method for find the lowest to largest number
		int min=array[0];
		int max=array[array.length-1];
		
		System.out.println(min);
		System.out.println(max);
		
		
		//second way
		
		int[] myArray = { 100, -90, 8787, 898, 0, 1 };
		int largest = myArray[0];
		int smallest = myArray[0];
		
		for (int i=0; i<myArray.length; i++) {
			
			if(myArray[i] > largest) {
				largest = myArray[i];
			}
				
			if(myArray[i] < smallest) {
				smallest = myArray[i];
			}
		}
		
		System.out.println("The smallest value in the array is "+smallest);
		System.out.println("The largest value in the array is "+largest);
		
		
		System.out.println("...............................................");
		
		int[] nums = { 100, -90, 8787, 898, 0, 1, -90, 8787};
		int large=nums[0];
		int secondLarge=nums[0];
		
		for(int i=0; i<nums.length; i++) {
			
			if (nums[i]>large) {
				secondLarge=large;
				large=nums[i];
			}else if(nums[i]>secondLarge && nums[i]<large ) {
				secondLarge=nums[i];
			}
		}
		
		System.out.println("The 2 largest value in the array is " + secondLarge);
		System.out.println("The largest value in the array is " + large);
	}

}
