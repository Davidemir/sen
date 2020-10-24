package com.class30;

public class CheckedException {
	//how would u handle it? ==> throws keyword and write exception type(in here is InterruptedException)
        public static void main(String[] args) throws InterruptedException{
       
		System.out.println("Begin of your code");
		
		Thread.sleep(10000); //checked exception
		System.out.println("End of your code");

			
	}
}
