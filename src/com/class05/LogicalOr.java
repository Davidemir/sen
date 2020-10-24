package com.class05;

public class LogicalOr {
	
    /*LOGICAL OR ( || )
     * if(true or true)-->true
     * if(true or false)-->true
     * if(false or true)-->true
     * if(false or false)-->false
     */
	public static void main(String[] args) {
		
		/*
		 * 7 days a week
		 * if days is 2 or 4-->SDLC class
		 * if days is 6 or 7---> Java class
		 * if days is 1 or 5--> No class
		 * if days is =3-->review class
		 */
		
		int day=5;
		  //false OR false-->false
		if(day==2 || day==4) {
			System.out.println("SDLC class");
			//false OR false-->false
		}else if(day==6 || day==7) {
			System.out.println("Java class");
			//false OR true-->true
		}else if(day==1 || day==5) {
			System.out.println("No class");
		}else if(day==3) {
			System.out.println("Review class");
		}else {
			System.out.println("Not a valid day");
		}
		
		
		/*
		 * 7 days a week
		 * if days is tuesday or Thursday-->SDLC class
		 * if days is Saturday or Sunday---> Java class
		 * if days is Monday or Friday--> No class
		 * if days is =Wednesday-->review class
		 */
		
		
		//NOT : FOR String values we are using variableName.equals("")
		
		String weekDay="Sunday";
		
		if(weekDay.equals("Tuesday") || weekDay.equals("Thurday")) {
			System.out.println("SDLC class");
		}else if(weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java class");
		}else if(weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("No class");
		}else if(weekDay.equals("Wednesday")) {
			System.out.println("Review class");
		}else {
			System.out.println("Not a valid day");
		}
				
	}
}
