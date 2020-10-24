package com.class06;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		
		Scanner input;
		String country, language;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=input.nextLine();
		
		switch (country) {//we write country in switch case
		
		case "Turkey"://and we write country name in case
			language="Turkish";
			break;
		case "Canada":
			language="English and French";
			break;
		case "USA":
			language="English";
			break;
		case "Italy":
			language="Italian";
			break;
		default:
			language="Unknown";
		}
		
		System.out.println(" Your counrty is "+country+" and your language is "+language);
		
		
		
		
		/*
	      * Allow user to enter grade and then provide explanation: 
	      * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
	      * At the end your program should print which grade was entered by a user with explanation.
	      */

	      Scanner scan;
	      char grade;
	      String gradeDegree;
	      scan=new Scanner(System.in);
	      System.out.println("Please enter the grade");
	      grade=scan.next().charAt(0);
	      
	      switch (grade) {
	      
	      case 'A':
	    	  gradeDegree="Excellent";
	    	  break;
	      case 'B':
	    	  gradeDegree="Good";
	    	  break;
	      case 'C':
	    	  gradeDegree="Average";
	    	  break;
	      case 'D':
	    	  gradeDegree="Bad";
	    	  break;
	      default:
	    	  gradeDegree="Not Acceptable";
	    	  
	    	  
	      }
	      
	      System.out.println(" Entered grade is "+grade+" and the meaning is "+gradeDegree);
	      
	      
	      /*
	       * Using scanner class create calculator.
	       * Allow user to enter 2 numbers and operator(+,-,*,/).
	       * Based on operator provide the result to user.
	       */
	      
	      Scanner scan2;
	      int num1,num2,total;
	      char op;
	      
	      total=0;
	      
	      scan2=new Scanner(System.in);
	      System.out.println("Enter write first number");
	      num1=scan.nextInt();
	      
	      System.out.println("Please write operator");
	      op=scan.next().charAt(0);
	      
	      System.out.println("Please write second number");
	      num2=scan.nextInt();
	      
	      switch (op) {
	      
	      case '+':
	    	  total=num1+num2;
	    	  break;
	      case '-':
	    	  total=num1-num2;
	    	  break;
	      case '*':
	    	  total=num1*num2;
	    	  break;
	      case '/':
	    	  total=num1/num2;
	    	  break;
	      default:
	    	  System.out.println("Wrong operator");
	      }
	      
	      System.out.println(total);
	}
	
	    
	     
}
