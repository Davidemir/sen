package com.class25;

public interface Bank {
	//by default compiler will add public abstract to the methods
	//therefore u dont need u write public abstract
	void haveChecking();
	void haveSavings();

}

interface Trustable{//we can create another interface
	//by default compiler will add public abstract to the methods
	//therefore u dont need u write public abstract
	void trust();
}

class Finance{
	public void financing() {
		System.out.println("Final transactions must happen");
	}
}
class BOA extends Finance implements Bank, Trustable{//for second interface use comma ,

	@Override
	public void haveChecking() {
		System.out.println("Bank of America has a checking account");
		
	}

	@Override
	public void haveSavings() {
		System.out.println("Bank of America has a savings account");
		
	}

	@Override
	public void trust() {
		System.out.println("You can trust Bank of America with your money");
		
	}
	
}

class CapitalOne extends Finance implements Bank, Trustable{//for second interface use comma ,

	@Override
	public void haveChecking() {
		System.out.println("Capital One Bank has a checking account");
		
	}

	@Override
	public void haveSavings() {
		System.out.println("Capital One Bank has a savings account");
		
	}

	@Override
	public void trust() {
		System.out.println("You can trust Capital One Bank with your money");
		
	}
	
}

class ChildCapitalOne extends CapitalOne{
	
}