package com.class26;

public class AccountTest {

	public static void main(String[] args) {
		
		Account ac = new Account();
		ac.setAccountNumber(3456789);//0 ==> coz our number less than 9
		long accountNum = ac.getAccountNum();
		System.out.println(accountNum);
		
		ac.setBalance(-200);//0.0 ==>coz our balance less than 0
		double balance = ac.getBalance();
		System.out.println(balance);

		int num =123;//it will be "123"
		String.valueOf(num);//converts given value to String
	}

}
