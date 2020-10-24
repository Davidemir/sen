package com.class09;

public class NestedLoop {

	public static void main(String[] args) {
		
		/*
		 * outer loop is true and also inner loop is true therefore both of them will
		 * executed.first outer loop is true will executed and then all of inner loop
		 * will executed till inner loop is false. second outer loop is true will
		 * executed and then all of inner loop will executed till inner loop is false.
		 * third outer loop is true will executed and then all of inner loop will
		 * executed till inner loop is false.
		 */
		
		for (int i=1; i<=3; i++) {
			System.out.println("I am OUTER LOOP"); // outer loop
			
			for (int j=1; j<=3; j++) {
				System.out.println("I am inner loop");//inner loop
			}
			
			/*
			 * execute will be 
			 * I am OUTER LOOP -1 iterator
			 * I am inner loop 
			 * I am inner loop 
			 * I am inner loop 
			 * I am OUTER LOOP 2 iterator
			 * I am inner loop 
			 * I am inner loop 
			 * I am inner loop 
			 * I am OUTER LOOP 3 iterator
			 * I am inner loop 
			 * I am inner loop 
			 * I am inner loop
			 */
		}
		
		System.out.println("................................");
		
		for (int i=0; i<=5; i++) {//outer loop
			System.out.println(i+" outer loop");
			
			for (int j=0; j<=5; j++) {
				System.out.println(j);//inner loop
			}
		/*
		 * execute will be 0(OUTER LOOP )0 1 2 3 4 5
		 *                 1(OUTER LOOP )0 1 2 3 4 5
		 *                 2(OUTER LOOP )0 1 2 3 4 5
		 *                 3(OUTER LOOP )0 1 2 3 4 5
		 *                 4(OUTER LOOP )0 1 2 3 4 5
		 *                 5(OUTER LOOP )0 1 2 3 4 5
		 */
			
		}
		
        System.out.println("................................");
		
		for (int i=0; i<=5; i++) {//outer loop
			
			
			for (int j=0; j<=5; j++) {
				System.out.println(i+" "+j);//inner loop
			}
			
			/*FIRST we will start outer loop 0 AND then we will write inner loop by one by with 0
			 *(outer loop) 0 0 (inner loop)
			 *(outer loop) 0 1 (inner loop)
			 *(outer loop) 0 2 (inner loop)
			 *(outer loop) 0 3 (inner loop)
			 *(outer loop) 0 4 (inner loop)
			 *(outer loop) 0 5 (inner loop)
			 *
			 *SECOND we will start outer loop 1 AND then we will write inner loop by one by with 1
			 *(outer loop) 1 0 (inner loop)
			 *(outer loop) 1 1 (inner loop)
			 *(outer loop) 1 2 (inner loop)
			 *(outer loop) 1 3 (inner loop)
			 *(outer loop) 1 4 (inner loop)
			 *(outer loop) 1 5 (inner loop)
			 *
			 **THIRD we will start outer loop 2 AND then we will write inner loop by one by with 2
			 *(outer loop) 2 0 (inner loop)
			 *(outer loop) 2 1 (inner loop)
			 *(outer loop) 2 2 (inner loop)
			 *(outer loop) 2 3 (inner loop)
			 *(outer loop) 2 4 (inner loop)
			 *(outer loop) 2 5 (inner loop)
			 *
			 **FORTH we will start outer loop 3 AND then we will write inner loop by one by with 3
			 *(outer loop) 3 0 (inner loop)
			 *(outer loop) 3 1 (inner loop)
			 *(outer loop) 3 2 (inner loop)
			 *(outer loop) 3 3 (inner loop)
			 *(outer loop) 3 4 (inner loop)
			 *(outer loop) 3 5 (inner loop)
			 * 
			 * FIFTH we will start outer loop 4 AND then we will write inner loop by one by with 4
			 *(outer loop) 4 0 (inner loop)
			 *(outer loop) 4 1 (inner loop)
			 *(outer loop) 4 2 (inner loop)
			 *(outer loop) 4 3 (inner loop)
			 *(outer loop) 4 4 (inner loop)
			 *(outer loop) 4 5 (inner loop)
			 *
			 **SIXTH we will start outer loop 5 AND then we will write inner loop by one by with 5
			 *(outer loop) 5 0 (inner loop)
			 *(outer loop) 5 1 (inner loop)
			 *(outer loop) 5 2 (inner loop)
			 *(outer loop) 5 3 (inner loop)
			 *(outer loop) 5 4 (inner loop)
			 *(outer loop) 5 5 (inner loop)
			 * 
			 */
		}
	}

}
