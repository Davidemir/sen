package com.class08;

public class ForLoop {

	public static void main(String[] args) {
		
		/*======FOR LOOP======
		 * If we do not know number of iterations WHILE loop is BEST choice for the loop
		 * When we know in advance how many time we want to repeat block of code BEST choice will be FOR LOOP
		 * 1. we initialize and declare variable, 2. we check in the condition then after check the condition
		 * if the condition is TRUE 3. the block of code inside the loop will get executed 
		 * only one block of code executed then 4. your implementation(increment/decrement) will happen
		 * after we do the implemantation 5.we test our condition ,
		 * after the test condition again 6. the block of code get executed.
		 * only block of code get executed only then 7.we will get implement
		 * initialize; test condition; increment/decrement everything Must be together inside the parantesis
		 * NOT: U dont need to change initalize variable every time coz u write inside the parantesis
		 * ==>for example:for (int i[U dont need to change initalize variable.u always can use i]=a;...........)
		 */
		

		//Say good morning 5 times( we know how many times we will write==> 5 times therefore we use for loop)
		
	 //FIRST       SECOND (if is true,get execute 3.)      //FORTH
		//initialize;    test condition;        increment/decrement
		for (int i=0;       i<=4;              i++) {
			System.out.println("Good morning");//THIRD
		}
		
		System.out.println("......................................");
		
		//print numbers from 1-10(1 to 10);
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("......................................");
		//print numbers from 10-1(1o to 1);
		
		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		//print numbers 0-50 jump 5 like 0,5,10,15,20;
		System.out.println("......................................");
		
		for (int i=0; i<=50; i+=5) {
			System.out.println(i);
		}
	}
}
