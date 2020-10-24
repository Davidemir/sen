package com.class22;

public class Employee {//parent class

	public int salary;

	public void getPaid() {// overriden (parent class)
		System.out.println("Employee gets paid " + salary);
	}
}


class FullTime extends Employee {//child class

	int bonus;

	public void getPaid() {// overriding(child class) coz parent class and child class are the same
		System.out.println("Full time Employee gets paid " + salary + " and bonus");
	}

}
