package com.class04;

public class NestedIfMore {

	public static void main(String[] args) {
		
		/*
		 * check age,if age is less than 16-->you are so young to drive
		 * otherwise u are eligible to drive 
		 * and if u are older than 18--> u can get drive lessons
		 * if not u can get learner permit
		 */
		
		int age=20;
		
		if(age<16) {//outer if
			System.out.println("You are so young to drive");
			
		}else {
			System.out.println("You are eligible to drive");
			
			if(age>=18) {//inner if
				System.out.println("You can get driver alone");
			}else {
				System.out.println("You can get learner permit");
			}
			
		}
		
		
		System.out.println("***********************************");
		
		/*
		 * We need to check if student completed the quiz
		 * if yes=>good job, if not=> not good
		 * if they completed we will check score:
		 * if more than 90=>u got an A
		 * if more than 80=>u got a B
		 * anything below=> u should study more
		 */

		boolean quiz=true;
		int score=89;
		
		if(quiz==true) {//outer if
			System.out.println("Good job");
			
			if(score>=90) {//inner if
				System.out.println("You got an A");
			}else if(score>80){
				System.out.println("You got a B");
			}else {
				System.out.println("U should study more");
			}
			
		}else {
			System.out.println(" NOT good job");
		}
	}

}
