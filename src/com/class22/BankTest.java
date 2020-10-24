package com.class22;

public class BankTest extends Bank{
	
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.money = 900;
		double fee = bank.chargeFee();
		System.out.println("Bank fee :"+fee);
		
		
		CIBC cibc = new CIBC();
		cibc.money = 900;
		double cibcFee = cibc.chargeFee();
		System.out.println("CIBC fee :"+cibcFee);
		
		
	}

}
