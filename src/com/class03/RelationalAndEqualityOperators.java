package com.class03;

public class RelationalAndEqualityOperators {

	public static void main(String[] args) {
		//the result of RelationalAndEqualityOperators always will be BOOLEAN VALUE-->true or false
		
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);//true
		System.out.println(num1<num2);//false
		boolean b12 = num1>num2;
		System.out.println(b12);
		
		double d=1.99;
		double d1=2.99;
		
		System.out.println(d>d1);//FALSE
		System.out.println(d<d1);//TRUE
		
		System.out.println("----OR----BUT IF U WRITE BOOLEAN IT IS BETTER....");
		
		boolean b=d>d1;
		System.out.println(b);//false
		
		boolean b1= d<d1;
		boolean b2= d==d1;
		boolean b3= d!=d1;
		System.out.println(b1);//true
		System.out.println(b2);//false
		System.out.println(b3);//true
		
	}

}
