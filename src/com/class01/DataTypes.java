package com.class01;

public class DataTypes {
	
	public static void main(String[] args) {
		
		//====NUMERIC(WHOLE NUMBER/INTEGRAL) ===
		// byte= -128 to 127 (3 number)
		byte b=10;
		byte b1=-128;
		//byte b2=128;//compiler will give an error.coz it is larger number than byte num.
		
		
		//short = -32768 to 32767 (5 number)
		short s=6566;
		short s1=-32768;
		//short s2=32768;//compiler will give an error.coz it is larger number than short num.
		
		
		//int = -2147483648 to 2147483647 (10 number)

		int i=345637;
		int i1=23242922;
		//int i2=2147483648;//compiler will give an error.coz it is larger number than int num.
		
		// long =  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (19 number) 
		//U CAN WRITE l or L .it is not problem.
		long l=12345678901234l;// if u dont write the l after the number compile give an error.
		long l1=-1234567890987654L;
		//long l2=123456789987654432112l;//compiler will give an error.coz it is larger number than int num.

		
		//=====NON NUMERIC (FLOATING POINTS)
		//LOTS OF TIME WE USE SELECT THE DOUBLE...
		
		float f=12.78F; // if u dont write the f or F after the number compile give an error.
		float f1=15.5f;
		
		double d=14.12345678;
		
		boolean hungry=true;
		boolean rain=false;
		
		//To store single character
		char container='A';
		
		
		System.out.println(d);
		
		
		
	}

}
