package com.class21;

public class MethodReturnTypeWithOverLoading {
	
	/*
	 * Method overloading is having same method name within SAME class by having
	 * different number of parameters of different type of parameters
	 * 
	 * There are two ways to overload the method in java: 
	 * 1. By changing number of parameters (different amount of paramters)
	 * 2. By changing the data type (different type of parameters)
	 */
	
	
	//By changing number of parameters (different amount of parameters)
	public int add(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}

	
	public int add(int num1, int num2, int num3) {
		int sum = num1+num2+num3;
		return sum; 
	}
	
	
	//By changing the data type (different type of parameters)
	public double add(double num1, double num2) {
		double sum = num1+num2;
		return sum;
	}
	
	public double add(int num1, double num2) {
		double sum = num1+num2;//we must use double return type coz double larger than int
		return sum;
	}
	
	
	public double add(double num1, int num2) {
		double sum = num1+num2; //we must double retrun type coz double larger than int
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		MethodReturnTypeWithOverLoading obj = new MethodReturnTypeWithOverLoading();
		int i = obj.add(10, 12);
		System.out.println("first way "+i);
		//or
		System.out.println("second way "+obj.add(10, 12));
		
		System.out.println(obj.add(10, 12, 13));
		
		System.out.println(obj.add(3.6, 5.7));
		
		System.out.println(obj.add(16, 9.6));
		
		System.out.println(obj.add(2.7, 66));
		
		
	}
}
