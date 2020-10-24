package com.class02;

public class StringExample {
	
	public static void main(String[] args) {
		//String is class that represent sequence of character inclosed within " "
		
		String name="Jane";
		String address="123 Test Drive";
		String salary="$150.000 US DOLAR";
		//String phoneNumber=11324545478;//comple give an error.first the value is int value.if we want to
		//use that value we must use the double quates (" ").
		String phoneNumber="11324545478";//-->we must use the double quates (" ")it works.
		String space=" ";
		String birthDate="12/12/1990";
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(salary);
		System.out.println(phoneNumber);
		System.out.println(space);//result we be empty
		System.out.println(birthDate);
	}

}
