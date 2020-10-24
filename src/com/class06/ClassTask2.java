package com.class06;

import java.util.Scanner;

public class ClassTask2 {
	
	public static void main(String[] args) {
		
		/*
		 * ask user to enter boolean value for sale
		 * if no sale-->I am not shopping
		 * if sale-->check the price of item
		 * based on amount we will have to calculate the price after discount
		 * if price<20-->apply 10%
		 * if price between 20-100-->20%
		 * if price between 100-500-->30;
		 * anything-->50;
		 * "After discount__ the price of the item reduce from__ to__
		 */
		
		Scanner input;
		boolean sales;
		double discount;
		double price;
		double finalPrice;
		
		input=new Scanner(System.in);
		System.out.println("Is there a sales going on? True or False");
		sales=input.nextBoolean();
		
		
		if(!sales) {
			System.out.println("I am not shopping");
		}else {
			System.out.println("What is the actual price?");
		    price=input.nextDouble();
		    
		    //not: u can write finalPrice after every discount OR U CAN WRITE ONLY ONE TIME AFTER ELSE BLOCK
			 if(price<20) {
				 discount=price*0.10;
				// finalPrice=price-discout; 
			 }else if(price>=20 && price<100) {
				 discount=price*0.20;
				// finalPrice=price-discout;  
			 }else if(price>=100 && price<500) {
				 discount=price*0.30;
				 //finalPrice=price-discout;
			 }else {
				 discount=price*0.50;
				// finalPrice=price-discout;
			 }
			 
			 finalPrice=price-discount;
			 System.out.println("After discount "+discount+" the price of the item reduce from "+price+" to "+finalPrice);
		}
	}

}
