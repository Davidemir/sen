package com.class04;

public class NestedIfPractice {

	public static void main(String[] args) {
		
		boolean isFriday=false;
		int day=13;
		
		//if today is friday only day I want to check if it day is 13
		
		if(isFriday) {
			System.out.println("Today is Friday");
		}else {
			System.out.println("Today is  NOT Friday");
		}
		
		
		System.out.println("***********************************");
		
		boolean isFriday1=true;
		int day1=13;
		
		//if today is friday only day I want to check if it day is 13
		
		if(isFriday1) {
			System.out.println("Today is Friday");
			
			if(day==13) {
				System.out.println(" I will watch scary movie");
			}//after inner if close the block.({}).if u dont close the block execute will be problem.
			
		}else {
			System.out.println("Today is  NOT Friday");
		}
			
		System.out.println("***********************************");
		
		boolean isFriday2=true;
		int day2=15;
		
		//if today is friday only day I want to check if it day is 13
		
		if(isFriday2) {
			System.out.println("Today is Friday");
			
			if(day2==13) {
				System.out.println(" I will watch scary movie");
			}//after inner if close the block.({}).if u dont close the block execute will be problem.
			
		}else {
			System.out.println("Today is  NOT Friday");
		}
		
		System.out.println("**************************************");
		
		boolean isFriday3=true;
		int day3=15;
		
		//if today is friday only day I want to check if it day is 13
		
		if(isFriday3) {
			System.out.println("Today is Friday");
			
			if(day3==13) {
				System.out.println(" I will watch scary movie");
			}else {
				System.out.println("I will watch comedy");
			}//after inner if close the block.({}).if u dont close the block execute will be problem.
			
		}else {
			System.out.println("Today is  NOT Friday");
		}
		
		System.out.println("**************************************");
		
		boolean isFriday4=false;
		int day4=15;
		
		//if today is friday only day I want to check if it day is 13
		
		if(isFriday4) {
			System.out.println("Today is Friday");
			
			if(day4==13) {
				System.out.println(" I will watch scary movie");
			}else {
				System.out.println("I will watch comedy");
			}//after inner if close the block.({}).if u dont close the block execute will be problem.
			
		}else {
			System.out.println("Today is  NOT Friday");
		}
    }
}
  

