package com.class05;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		
		/*
		 * Write a program that will read three inputs of scores 
		 * (quiz, mid term, and final scores) 
		 * and determine the grade based on the following rules: 
		 *  if the average score >=90 → grade=A 
		 *  if the average score >= 70 and <90 → grade=B 
		 *  if the average score>=50 and <70 → grade=C 
		 *  if the average score<50 → grade=F
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the quiz score");
		int quiz=scan.nextInt();
		
		System.out.println("Please enter the mid term score");
		int midTerm=scan.nextInt();
		
		System.out.println("Please enter the final score");
		int finalScore=scan.nextInt();
		
		int average=(quiz+midTerm+finalScore)/3;
		char grade;
		
		
		if(average>=90) {
			grade='A';
		}else if(average>=70 && average<90) {
			grade='B';
		}else if(average>=50 && average<70) {
			grade='C';
		}else if(average<50) {
			grade='F';
		}else {
			grade='X';
		}
		
		System.out.println("My average is "+average+" and my grade is "+ grade);
		
		
		
		// or other way:
		
		Scanner scan1;
		int quiz1, midTerm1,finals1,average1;
		
		System.out.println("Please enter your quiz score");
		scan1=new Scanner(System.in);
		
		quiz1=scan.nextInt();
		
		System.out.println("Please enter your midTerm score");
		midTerm1=scan.nextInt();
		
		System.out.println("Please enter your final score");
		finals1=scan.nextInt();
		
		average1=((quiz1+midTerm1+finals1)/3);
		
		if(average1>=90) {
			System.out.println("Your grade is A");
		}else if(average1>=70  && average1<90) {
			System.out.println("Your grade is B");
		}else if(average1>=50  && average1<70) {
			System.out.println("Your grade is C");
		}else if(average1<50) {
			System.out.println("Your grade is F");	
		}else  {
			System.out.println("UnKnown");
	    }
		
		
		/*
		 * Write a program to determine the classMode.
		 * If there is no rain → classMode = "In Class", 
		 * otherwise classMode → "Online".
		 */
		
		Scanner input;
		boolean rain;
		String classMode;
		
		input=new Scanner(System.in);
		System.out.println("Please enter the value");
		rain=input.nextBoolean();
		
		if(!rain) {
			classMode="In Class";
		}else {
			classMode="Online";
		}
		
		System.out.println("Today our lesson is "+classMode);
		
		
	}
	
	

}
