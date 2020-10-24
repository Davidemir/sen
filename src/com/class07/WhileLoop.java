package com.class07;

public class WhileLoop {
	
	/* ===== WHILE LOOP =====
	 * 
	 * Loops: - to repeat same block of code
	 * LOOPS helps us to eleminate redundancy in our code.
	 * First declare and initialize value second write while(){ //condition MUST be
	 * true } third write increment/decrement.if u dont write execute will be
	 * infinitive. in while loop increment or decrement like break;(switch
	 * case)(break makes stop) it makes limited.
	 * 
	 * while loop syntax=
	 * 1.initialize variable (should be outside of the loop)
	 * 2.while(test variable--> true) {
	 * 3.code; 
	 * 4.variable increment or decrement; }
	 */
	
	public static void main(String[] args) {
		
		 int time=8;
         
         if(time<12) { //condition is true
       	  System.out.println("Good morning"); // code executes 1 time
         }
         System.out.println(".......While Loop......."); 
         
               //8<12
               //9<12
               //10<12
               //11<12
               //12!<12 therefore we can not write coz till true we can write
         while(time<12) {//while condition is true
       	  System.out.println("Good morning");// code executes infitively= infinitive loop(unlimited loop)
       	  time++;// increment 8 between 12( 8,9,10,11)==> 4 times
       	           
       	  
         }
		
         
         System.out.println(".....I want to print Good  Afternoon 5 times........");
         
         int i=1;
         
         while(i<=5) {//or i<6
        	 System.out.println("Good afternoon");
        	 i++;
         }
         System.out.println("Outside of while loop");
         
         System.out.println(".....I want to print Good  night 15 times........");
         
         int a=-1;
         
         while(a<14) {//a<=13
        	 System.out.println("Good night");
        	 a++;
         }
         
         System.out.println(".....I want to print Hi 3 times........");
         
         int b=20;
         
         while(b<=22) {//or b<23
        	 System.out.println("Hi");
        	 b++;
         }
	}
}
