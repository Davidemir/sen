package com.class05;

import java.util.Scanner;

public class Task1 {
	
		public static void main(String[] args) {
			
			/*
			 * Write a program that will print whether it is a weekend or weekday
			 * If any day from 1-5 → output "It is a weekday?, 
			 * anyday from 6-7 → output "It is a weekend?, 
			 * any other day → output “Invalid day?
			 */
			
			//first we did with Scanner
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter the day!!!");
			int day=scan.nextInt();
			
			if(day==1 || day==2 || day==3 || day==4 || day==5) {
				System.out.println("It is a weekday");
			}else if(day==6 || day==7) {
				System.out.println("It is a weekend");
			}else {
				System.out.println("Invalid day");
			}
			
			//second we did with if statement
			
			int day1=6;
			
			if(day1==1 || day1==2 || day1==3 || day1==4 || day1==5) {
				System.out.println("It is a weekday");
			}else if(day1==6 || day1==7) {
				System.out.println("It is a weekend");
			}else {
				System.out.println("Invalid day");
			}
			
			//third we did with String
			
			String weekDay="Friday";
			
			if(weekDay.equals("Monday") || weekDay.equals("Tuesday") || weekDay.equals("Wednesday") 
					|| weekDay.equals("Thursday") || weekDay.equals("Friday")) {
				System.out.println("It is a weekday");
			}else if(weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
				System.out.println("It is a weekend");
			}else {
				System.out.println("Invalid day");
			}
			
			
			/*
			 * Prompt the user to enter person heights in feet. 
			 * Person should be classi�?ed as one of the following: 
			 * • short (under 5 feet) 
			 * • medium(5 to 6 feet) 
			 * • tall (6 feet and over) 
			 */
			
			//first we did with Scanner
			
			Scanner input=new Scanner(System.in);
			System.out.println("Please enter the height!!!");
			int height=input.nextInt();
		
			
			if(height<5) {
				System.out.println("Short");
			}else if(height==5 || height==6) {
				System.out.println("Medium");
			}else if(height>=6) {
				System.out.println("Tall");
			}else {
				 System.out.println("It is not valid size");
			}
			
			
			//second we did with if statement
            int height1=8;
			
			if(height1<5) {
				System.out.println("Short");
			}else if(height1==5 || height1==6) {
				System.out.println("Medium");
			}else if(height1>=6) {
				System.out.println("Tall");
			}else {
				 System.out.println("It is not valid size");
			}
		}

		
		


}
