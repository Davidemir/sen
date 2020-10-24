package com.class06;

import java.util.Scanner;

public class ScannerSwitch {
	
	public static void main(String[] args) {
		
		/*
		 * ask user where they are from
         * based on the counrty we will specify favourite food
         */
		
		String country, foodName;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter the country");
		country=scan.nextLine();
		
		
		switch(country) {
		
		case "Turkey"://we write the string variable(country and foodName .THerefore in case we must write String varibale..
			foodName="Kebap";
			break;
		case "Ethiopia":
			foodName="Tibs";
			break;
		case "Morocco":
			foodName="Tajin";
		    break;
		case "Kazakhstan":
			foodName="Kumis";
			break;
		case "Pakistan":
			foodName="Beryani";
				break;
		case "Russia":
			foodName="Caviar";
			break;
		default:
			foodName="Unknown";
		}
		
		System.out.println("You are from "+country+" and your favourite food is "+foodName);
	}

}
