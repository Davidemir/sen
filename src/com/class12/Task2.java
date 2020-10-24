package com.class12;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that reads two people's ям?rst names 
		 * and if they expecting boy or girl? 
		 * Based on the input suggests a name for a baby: 
		 * 
		 * NOTE: baby name must be half of father s name and half of mother s name
		 * 
		 * Example Output: Mother's first name? Mary 
		 * Father's first name? Daniel 
		 * Boy or Girl? boy 
		 * Suggested baby name: DANRY
		 * 
		 * Example Output: Mother's first name? Mary 
		 * Father's first name? Daniel 
		 * Boy or Girl? girl 
		 * Suggested baby name: MAIEL
		 */

		Scanner scan;
		String motherName, fatherName, gender, babyName;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter mother's name?");
		motherName=scan.nextLine();
		
		System.out.println("Please enter father's name?");
		fatherName=scan.nextLine();
		
		System.out.println("Please enter expected gender?");
		gender=scan.nextLine();
		
		if(gender.equalsIgnoreCase("boy")) {
			babyName = fatherName.substring(0, fatherName.length()/2)
					+motherName.substring(motherName.length()/2);
			
		}else if(gender.equalsIgnoreCase("girl")) {
			babyName = motherName.substring(0, motherName.length()/2)
					+fatherName.substring(fatherName.length()/2);
			
		}else {
			babyName = "No suggestion";
		}
		System.out.println(babyName.toUpperCase());
	}

}
