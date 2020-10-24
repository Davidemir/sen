package com.class05;

import java.util.Scanner;

public class LogicalCommissionExamples {

	public static void main(String[] args) {
		
		
		/*
		 * ask user to enter daily sales
		 * based on the sales range we want to give commission to the person
		 * if sales is sales is <100-->commission is 10%
		 * if sales if between 100-200--> commission of 20%
		 * etc...
		 */
		
		Scanner scan;// to import Scanner short way==> ctrl+shift+o,  for mac==> command+shift+o
		double salesAmount;
		double commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		salesAmount=scan.nextDouble();
		
		if(salesAmount>=1 && salesAmount<100) {
			//let's give user %10 commission of a sale
			commission=salesAmount*0.1;
		}else if(salesAmount>=100 && salesAmount<200) {
			//let's give user %20 commission of a sale
			commission=salesAmount*0.2;
		}else if(salesAmount>=200 && salesAmount<500) {
			//let's give user %30 commission of a sale
			commission=salesAmount*0.3;
		}else if(salesAmount>=500) {
			//let's give user %50 commission of a sale
			commission=salesAmount*0.5;
		}else {
			commission=0;
		}
		
        System.out.println("Based on the sales your commission is "+commission);
        //not: if u dont write System.out.println("Based on the sales your commission is "+commission);
        //system will not work .//system work with sout..
	}

}
