package com.class20;

public class Employee {
	
	//Employee class is a grandparent class
	
	
	public static String companyName;//public ==> accesible though entire project
	int salary;//default ==> accesible within same package
	protected int employeeId;// protected ==> accesible within same package or different package only via Inheritance
	private String employeeSsn;//private ==> accesible within only same class
	
	
	void work() {
		System.out.println("I work in "+companyName+" company");
	}
	
	
    void getPaid() {
		System.out.println("I get paid "+salary);
	}

	protected void empId() {
		System.out.println("My employee id is "+employeeId);
	}
}
