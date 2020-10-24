package com.class04;

public class NestedIf { // meaning: if statement inside another if statement
	
	public static void main(String[] args) {
		
		boolean b=true;
		boolean classToday=true;
		//not: EVERY INNER IF DEPENDECY OF OUTER IF...
		
		//not: if outer is true,check the inner if.if ur inner if is true it will be executed.
		if (b) {//-->outer if
			   System.out.println("Hello");
			
			   if( classToday ) {//inner if
				 System.out.println("Hello my friends");
			}
		}else  {
			   System.out.println(" Bye");
		
		System.out.println("I am continue code");
	    }
		
		System.out.println("*************************************");
		
		boolean b1=true;
		boolean classToday1=false;
		//not: EVERY INNER IF DEPENDECY OF OUTER IF...
		
		//not: if outer if is true,check the inner if.if ur inner is false it will not be executed.
		if (b1) {//-->outer if
			   System.out.println("Hello");
			
			   if( classToday1 ) {//inner if
				 System.out.println("Hello my friends");
			}
		}else  {
			   System.out.println("Bye");
		
		System.out.println("I am continue code");
	    }
		
		System.out.println("*************************************");
		
		boolean b2=false;
		boolean classToday2=true;//  classToday2=true result will not change
		//not: EVERY INNER IF DEPENDECY OF OUT IF...
		
		//not: if outer if is false,you can NOT CHECK INNER IF.
		if (b2) {//-->outer if
			   System.out.println("Hello");
			
			   if( classToday2 ) {//inner if
				 System.out.println("Hello my friends");
			}
		}else  {
			   System.out.println("Bye");
		
		System.out.println("I am continue code");
	    }
    }
}

	
		    
			
			
		
				


