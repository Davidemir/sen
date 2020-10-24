package com.class30;

public class RecapException {

	public static void main(String[] args) throws InterruptedException  {
		
		int num=1;  // int num="1";-->this is not exception .it is syntax error.
		
		//runtime - unchecked exception
		int[] nums= {12,13};// nums must be between try and catch block
		
		try {
			System.out.println(nums[2]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("trying to access element ouside of the boundary");
		}
		//compile time - checked
		Thread.sleep(5000);//exception .for solve the issue  1:add throws InterruptedException or  2:add try  catch block
		System.out.println("End of the code");
	}
}
