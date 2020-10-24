package com.class21;

public class MethodOverLoading {
	
	//By changing number of parameters (different amount of parameters)
	public void add(int num1, int num2) {//add(int num1, int num2) = mehtod name +parameters --> method signature
		System.out.println(num1+num2);
	}

	
//	public int add(int num1, int num2) { compiler will give an error coz method signature is the same with top example
//		return num1+num2;
//	}
	
//	protected int add(int num1, int num2) { compiler will give an error coz method signature is the same with top example
//	return num1+num2;
//}
	/*
	 * In method overloading METHOD SIGNATURE MUST BE DIFFERENT
	 * Overloading is not possible by changing return type of the method or access modifier
	 * since compiler looks only at the method signature.
	 */
	
	
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	
	
	//By changing the data type (different type of parameters)
	public void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	
	public void add(int num1, double num2) {
		System.out.println(num1+num2);
	}
	
	
	public void add(double num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		obj.add(12, 13);
		obj.add(12, 13, 14);
		obj.add(12.09, 12.01);
		obj.add(3, 4.5);
		obj.add(6.9, 8);
		
		
		String str = "Hello";
		System.out.println(str.substring(3));
		System.out.println(str.substring(1, 3));
	}
}
