package com.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		
		/*ask user to enter their gender F or M
		 * based on the input provide
		 * if F-->Female
		 * if M-->Male
		 * otherwise-->unknown
		 */
		
		/*
		 * NOT: for char(Scanner) -->next().charAt(0); 
		 * 
		 * $$$$   Switch case check only equality $$$$
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the gender: F or M");
		char gender=scan.next().charAt(0);
		String userGender;
		
		
		
		//switch work only with byte, short, int, char, String
		switch(gender) {
		 
		case 'F'://'F' meaning female case.if u dont write 'F' OR  'M' execute will be Unknown.
			userGender="Female";
		    break;
		
		case 'M':
			userGender="Male";
			break;
		
		default:
			userGender="Unknown";
		}
		
		System.out.println("Your gender is "+userGender);
		
	}

}
