package com.class30;

public class ExceptionIntro {//run time yaptigimizda bu yontemi kullaniriz.
	public static void main(String[] args) {
        //first example
		int a=20;
		int b=0;
		//System.out.println(a/b);
		
		System.out.println("Code after an exception");
		System.out.println("Continues code");
		
		
		//second example
		int[] array= {10,20,30};
		System.out.println(array[3]);
		
		ArithmeticException exception=new ArithmeticException();
		throw(exception);
		
	}
}