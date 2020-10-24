package com.class30;

public class UncheckedException {
	//public static void main(String[] args) {

		
//		System.out.println("Beginning of the code");
//		int a=20;
//		int b=0;
//		
//		
//	    System.out.println(a/b);//hata burda .new ArithmeticException();
//		
//		System.out.println("End of the code");
//		
		
		//duzeltmek icin soyle yapariz:
		
		
		public static void main(String[] args) {

			
			System.out.println("Beginning of the code");
			int a=20;
			int b=0;
			
			try {//try catch blok unu kullaniriz .
				System.out.println("I am code inside try block");
				System.out.println(a/b);//new ArithmeticException();
				System.out.println("I am continues code inside try block");
				
			}catch(ArithmeticException e) {//ArithmeticException e=new ArithmeticException();
				
				System.out.println("I am code inside catch block");
				//first way:
				//e.printStackTrace();//--> details of where in the code exceptions occurd, 
				                            //name of the exception & detailed message
				//System.out.println(e);//-->name of the exception and message
				
				//second way:
				System.out.println(e.getMessage());//message of the exception
			}
			
			System.out.println("End of the code");
	}
}