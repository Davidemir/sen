package com.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		/*
		 * break & continue keyword can be used inside ANY loop .Mostly it will used
		 * within if statement. 
		 
		 
		 * break -> exits/break the loop.it likes switch case break.
		 * in break when we have if statement and after if we write the break 
		 * we must only check the inside if i value not inside the for loop value.
		 * for example==>for (int i=0; i<10; i++) {
			                 if(i==7) {
				             break;
				             }
			                 System.out.println(i);
			                 
			in this example we used to break therefore for us only if statement value important. 
			we will not check the i<10 we dont care that value. we will check inside if if statement i value
			and value==> i==7 and also we will execute till 7 but 7 will not include the execute.
			
	
		 * continue -> skips current iteration
		 * in continue when we have if statement and after if we write the continue
		 * we must  check the inside for loop i value and if i value 
		 * for example==>for (int i=0; i<10; i++) {
			                 if(i==7) {
				             continue;
				             }
			                 System.out.println(i);
			                 
			in this example we used to continue therefore for us for loop and  if statement value are important. 
			we will  check for loop value ==> i<10  we will  check if statement i value ==> i==7 
			and also we will execute till 10 (10 IS NOT INCLUDE) and also 7 will not include the execute.
		 *  
		 */
		System.out.println("......break;.............");
		
		for (int i=0; i<10; i++) {
			if(i==7) {
				break;//meaning execute till 7(7 IS NOT INCLUDE) 
				      //output==>0,1,3,4,5,6
			}
			System.out.println(i);
		}
		
		System.out.println("I m outside of the loop");
		
		
		System.out.println("......break;.............");

		for (int i = 1; i <= 5; i++) {
			if (i == 3 || i == 4) {
				break;// meaning execute till 3 OR 4 (3 and 4 ARE NOT INCLUDE)
						// output==>1,2
			}
			System.out.println(i);
		}
		
		
		System.out.println("......continue;.....................");
		//continue==>it will skip CURRENT iteration.
		
		for (int i=1; i<=5; i++) {
			if(i==2) {
				continue;//meaning execute till 5(5 IS INCLUDE) but dont include 2
				         //OUTPUT==>1,3,4,5 
			}
			System.out.println(i);
			
			
		}
		

		System.out.println("......continue;....................."); 
		
		for (int i=1; i<=5; i++) {
			if(i==3 || i==4) {
				continue;//meaning execute till 5(5 IS INCLUDE) but dont include 3 and 4
				      //output==>1,2,5
			}
			System.out.println(i);
		}
		
		System.out.println(".......continue;...................."); 
		
		// I want to print nums from 1 to 20 except 5,6,7(dont include 5,6,7)
		
		for (int i=1; i<=20; i++) {
			if(i==5 || i==6 || i==7) {
				//if(i==5 && i==6 && i==7)we can not use and(&&) coz all condition must be true for and.
				//in this example i==5, i==6, i==7 it is impossible tehrefore we used OR(||)
				break;
			}
			
			System.out.println(i);
		}
		
		
	}

}
