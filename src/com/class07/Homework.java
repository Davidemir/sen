package com.class07;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		/*
		 * Task 2
		 * 
		 * Write a program to ям?nd largest of three double values using if-else..if (Nested if) 
		 * and logical operators provided by a user (numbers must be distinct)
		 */
		
		// 1. way
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers for Nested If Task");
		double d1=scan.nextDouble();
		double d2=scan.nextDouble();
		double d3=scan.nextDouble();
		
		if(d1>d2) {
			
			if(d1>d3) {//meaning==>d1>d2  && d1>d3
				System.out.println("Largest number is first - "+d1);
			}else {//meaning==> d1>d2  but d1<d3
				System.out.println("Largest number is third - "+d3);
			}
		}else {//assuming(varsaymak)==> d2>d1
			
			if(d2>d3) {//meaning d2>d1  && d2>d3 ====> d2=largest
				System.out.println("The largest number is second - "+d2);
			}else {//meaning d2>d1 but d2<d3
				System.out.println("Largest number is third - "+d3);
			}
			
		}
		
		// 2.way
		double no1=3.6;
		double no2=3.7;
		double no3=3.8;
		
		if(no1>no2  && no1>no3) {
			System.out.println("The largest number is "+no1);
		}else if(no2>no1 && no2>no3) {
			System.out.println("The largest number is "+no2);
		}else {
			System.out.println("The largest number is "+no3);
		}
		
		
		// 3.way
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers for Nested If Task");
		double num1=scan1.nextDouble();
		double num2=scan1.nextDouble();
		double num3=scan1.nextDouble();
		
		if(num1>num2  && num1>num3) {
			System.out.println("The largest number is "+num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println("The largest number is "+num2);
		}else {
			System.out.println("The largest number is "+num3);
		}
		
		
		// 4. way
		
		
		Scanner scan3=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers for Nested If Task");
		double n1=scan3.nextDouble();
		double n2=scan3.nextDouble();
		double n3=scan3.nextDouble();
		
		
	if(n1!=n2 && n2!=n3)	{ //and if u write if(n1!=n2 || n2!=n3) program still will work.
		
		if(n1>n3) {
			
			if(n1>n2) {//meaning==>d1>d2  && d1>d3
				System.out.println("Largest number is first - "+n1);
			}else {//meaning==> d1>d2  but d1<d3
				System.out.println("Largest number is third - "+n3);
			}
		}else {//assuming(varsaymak)==> d2>d1
			
			if(n2>n3) {//meaning d2>d1  && d2>d3 ====> d2=largest
				System.out.println("The largest number is second - "+n2);
			}else {//meaning d2>d1 but d2<d3
				System.out.println("Largest number is third - "+n3);
			}
			
		}
		
	}else {
		System.out.println("Numbers are equal");
	}
	
	
	//5.way
	
	Scanner scan4=new Scanner(System.in);
	System.out.println("Please enter 3 distinct numbers for Nested If Task");
	double nn1=scan4.nextDouble();
	double nn2=scan4.nextDouble();
	double nn3=scan4.nextDouble();
	
	
if(nn1!=nn2 || nn2!=nn3)	{ //and if u write if(n1!=n2 || n2!=n3) program still will work.
	
	if(nn1>nn3) {
		
		if(nn1>nn3) {//meaning==>d1>d2  && d1>d3
			System.out.println("Largest number is first - "+nn1);
		}else {//meaning==> d1>d2  but d1<d3
			System.out.println("Largest number is third - "+nn3);
		}
	}else {//assuming(varsaymak)==> d2>d1
		
		if(nn2>nn3) {//meaning d2>d1  && d2>d3 ====> d2=largest
			System.out.println("The largest number is second - "+nn2);
		}else {//meaning d2>d1 but d2<d3
			System.out.println("Largest number is third - "+nn3);
		}
		
	}
	
}else {
	System.out.println("Numbers are equal");
}
		
  }

}
