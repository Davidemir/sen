package com.class06;

import java.util.Scanner;

public class Recap {
	
	public static void main(String[] args) {
		
		/*
		 * declare the time(1-24)
		 * based on the time identify whether it morning,afternoon,evening,or night
		 * if 1-11-->morning;
		 * if 12-15-->noon;
		 * if 16-20-->evening;
		 * if >20--> night;
		 */
		
		int time=10;
		String timeOfDate;
		
		if(time>=1 && time<=11) {
			timeOfDate="Morning";
		}else if(time>=12 && time<=15) {
			timeOfDate="Noon";
		}else if(time>=16 && time<=20) {
			timeOfDate="Evening";
		}else if(time>=20 && time<=24) {
			timeOfDate="night";
		}else {
			timeOfDate="Invalid time";
		}
		
		System.out.println("The time of date is "+timeOfDate);
		
		
		
		//second way with Scanner
		
		Scanner input=new Scanner(System.in);
	    System.out.println("Please enter the time");
	    int time1=input.nextInt();
	    
	    String timeOfDate1;
	    
	    if(time1>=1 && time1<=11) {
			timeOfDate1="Morning";
		}else if(time1>=12 && time1<=15) {
			timeOfDate1="Noon";
		}else if(time1>=16 && time1<=20) {
			timeOfDate1="Evening";
		}else if(time1>=20 && time1<=24) {
			timeOfDate1="night";
		}else {
			timeOfDate1="Invalid time";
		}
		
		System.out.println("The time of date is "+timeOfDate1);
	}
	
	     /*
	      * In Java all local variables MUST be initialized before using them !!!!
	      * Default value of:
	      * int --> 0
	      * double --> 0.0
	      * boolean --> false
	      * String --> null
	      */
	     

}
