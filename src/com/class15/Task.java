package com.class15;

public class Task {
	
	/*
	 * 1. Create a method createEmail(). Based on provided users name, lastName and
	 * email type, your method should return complete email Address. Example:
	 * johnsnow@gmail.com or johnsnow@yahoo.com*
	 */
	
	String createEmail(String userName, String lastName, String emailType) {
		String emailAdress = userName + lastName + emailType;
		return emailAdress;
	}
	
	
	
	
	
	
	/*
	 * Write a method to return whether given number is prime or not?
	 */
	
	boolean isPrime(int num) {
		boolean prime = true;
		
		if(num<=1) {
			prime = false;
		}else {
			for (int i=2; i<num; i++) {
				if(num%i==0) {
					prime = false;
					break;
				}
			}
		}
		return prime;
	}

	
	
	
	/*
	 *3.  Create class Student that will have a method getGrade. 
	 *Your method should accept the score of a student and return a grade: 
	 *score > 90 - A 
	 *score > 80 - B 
	 *score > 70 - C 
	 *score > 50 - D 
	 *anything else - F
	 */
	
	char getGrade(int score) {
		char grade;
		
		if(score>90) {
			grade = 'A';
		}else if(score>80) {
			grade = 'B';
		}else if(score>70) {
			grade = 'C';
		}else if(score>50) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		return grade;
	}
	
	
	public static void main(String[] args) {
		
		Task task = new Task();
		String email = task.createEmail("john", "snow", "@yahoo.com");
		System.out.println(email);
		
		System.out.println(task.getGrade(90));
		
		boolean prime = task.isPrime(27);
		System.out.println(prime);
	}
	

}
