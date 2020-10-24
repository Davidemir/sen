package com.class30;

public class ThrowsExample {

	static String name="John";
	
	public static void main(String[] args){
		
		callingMore();
	}
	
	
	public static void studentSleeping() throws InterruptedException  {
		
		System.out.println("Student is "+name+" is sleeping");
		Thread.sleep(3000);
	}                              
	//throws associated check exception
	public static void callingSleepingStudent() throws InterruptedException  {
		studentSleeping();
	}
	
	
	public static void callingMore() {
		try {
			callingSleepingStudent();
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
	}
}
