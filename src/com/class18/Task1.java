package com.class18;

public class Task1 {
	
	/*
	 * Write a program that will have a private constructor class 
	 * and create 2 objects of this class: 
	 * 1 - inside same class; 
	 * 2 - from outside the class and observe result.
	 * 3 - from different class inside different package.
	 */

	public Task1() {
		System.out.println("I m public constructor");
	}
	
	//NOTE : we cannot use NON access modifiers( static, final, abstract) with the constructors
	
//	static public Task1(boolean b) {
//		System.out.println("I m public constructor");
//	}
	
	Task1(String str){//default constructor
		System.out.println("I m default constructor");
	}
	
	protected Task1(int num){
		System.out.println("I m protected constructor");
	}
	
	private Task1(int num, int num2){
		System.out.println("I m private constructor");
	}
	
	
	public static void main(String[] args) {
		
		Task1 task1 = new Task1();
		Task1 task2 = new Task1("hello");
		Task1 task3 = new Task1(3);
		Task1 task4 = new Task1(3, 5);
			
		
	}
}
