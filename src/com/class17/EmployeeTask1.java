package com.class17;

public class EmployeeTask1 {
	
	/* 1. Create a Class called Employee: 
	 * ● Create three variables eID , salary and set the CEO to "Sumair" 
	 * ● Create two objects of the class Employee 
	 * ● Set the value of eID, salary for each of the objects 
	 * ● Print out the eID , salary and CEO for each of the objects 
	 */

	//instance variables
	int eID = 12345;
	int salary = 500000;
	
	static String CEO = "Sumair";//static variable
	
	
	public static void main(String[] args) {
		
		EmployeeTask1 emp1 = new EmployeeTask1();
		System.out.println(emp1.eID);
		System.out.println(emp1.salary);
		System.out.println(EmployeeTask1.CEO);//it is static variable therefore we must use class name.variableName
		//or we can only use name 
		System.out.println(CEO);
		
		EmployeeTask1 emp2 = new EmployeeTask1();
		System.out.println("Chancing Employee info");
		emp2.eID = 54321;
		System.out.println(emp2.eID);
		
		emp2.salary = 1000000;
		System.out.println(emp2.salary);
		
		//we will not change CEO name 
		System.out.println(CEO);
		
		
		
	}

}
