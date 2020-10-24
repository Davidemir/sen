package com.class22;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.salary = 80000;
		emp.getPaid();
		//parent class can not access child class but child class can access parent class.
		
		
		FullTime full = new FullTime();
		full.salary = 90000;//child class can access parent class.
		full.bonus = 10000;
		full.getPaid();
		
	}

}
