package com.class26;

public class Account {
	
	/*
	 * Encapsulaton - process of wrapping variable and method in a single unit (Class) 
	 * Best example of Encapsulation is a class 
	 * To create a tighlty encapsulated class we need;
	 *  1. create a private data members (variables) 
	 *  2. create public methods to access those variables (getters and setter)
	 */
	
	
	
	//for tighly encapsulated class 1. we create private data members (variables) 
	//and me made method hidding with private also.
	private long accountNumber;
	private double balance;
	
	
	
	/*normally we can not access with private accesss modifier another class or package
	 * but 2. we create public methods to access those variables (getters and setter)
	 * we can access private variables with our own methods in another class.
	 */
	
	//*****************getters = give read only access ***********************
	
	public long getAccountNum() {
		return accountNumber;
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	//*****************setters = give write access***********************
	
	public void setAccountNumber(long accountNumber) {
		////converts given value(it can be int , long..) to String ==> value of
		if(String.valueOf(accountNumber).length()==9) {
		   this.accountNumber = accountNumber;	
		}
		
	}
	
	public void setBalance(int amount) {
		if(amount>0) {
			balance = balance + amount;
		}
		
	}
}
