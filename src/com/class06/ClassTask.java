package com.class06;

import java.util.Scanner;

public class ClassTask {
	
	public static void main(String[] args) {
		
	
	/*
	 * Ask user to the month they were born based on the month define the season
	 *	if user is born in dec, jan, feb --> winter
	 * 	if user is born in marc,apr,may-->spring
	 *  if user is born in june,july,aug--> summmer
	 *  if user is born in sep,oct,nov--> fall
	 *  otherwise-->unknown
	 *  at the enf of the program "You were born in__" 
	 */
	
	 Scanner scan;
	 String month;
	 String word;
	 String season;
	 
	 scan=new Scanner(System.in);
	 System.out.println("Please enter the month");
	 month=scan.next();
	 
	 word="You were born in ";
	 
	 if(month.equals("December") || month.equals("January") || month.equals("February")) {
		 season="Winter";
	 }else if(month.equals("March") || month.equals("April") || month.equals("May")) {
		 season="Spring";
	 }else if(month.equals("June") || month.equals("July") || month.equals("August")) {
		 season="Summer";
	 }else if(month.equals("September") || month.equals("October") || month.equals("November")) {
		 season="Fall";
	 }else {
		 season="Unknown";
	 }
	  
	 System.out.println(word+season);
	 
	}
}
