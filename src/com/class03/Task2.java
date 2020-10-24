package com.class03;

public class Task2 {

	public static void main(String[] args) {
		
	/*
	 * Create a Java program and name it Double Comparison
	 *  Declare 2 double values and if value of ï¬?rst variable is higher then 
	 *  print â€œDouble value __ is larger than __ .â€? 
	 *  Otherwise print...
	 */
		
		double d=23.89;
		double d1=11.99;
		
		if(d>d1) {
			System.out.println("Double value "+d+" is larger than "+d1);
		}else {
			System.out.println("Double value "+d1+" is larger than "+d);
		}
		
		/*
		 * Create a Java program and name it Temperature Check. 
		 * Create variable to store temperature. 
		 * Your program should check if temperature is below 32 then it should
		 *  print â€œWater will freeze with temperature __â€?, 
		 *  otherwise â€œWater will NOT freeze with temperature __â€?. 
		 */

		int temperatureCheck=32;
		
		if(temperatureCheck<32) {
			System.out.println("Water will freeze with temperature "+temperatureCheck);
		}else {
			System.out.println("Water will NOT freeze with temperature "+temperatureCheck);
		}
	}

}
