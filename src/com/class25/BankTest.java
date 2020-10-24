package com.class25;

public class BankTest {

	public static void main(String[] args) {
		
		ChildCapitalOne obj = new ChildCapitalOne();
		obj.haveChecking();
		obj.haveSavings();
		obj.trust();
		obj.financing();
		
        System.out.println("........................");
        
		CapitalOne obj1 = new CapitalOne();
		obj1.haveChecking();
		obj1.haveSavings();
		obj1.trust();
		obj1.financing();
	}

}
