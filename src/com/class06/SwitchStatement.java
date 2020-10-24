package com.class06;

public class SwitchStatement {

	public static void main(String[] args) {

		/*
		 * SWITCH CASE  similar to if else
		 * 
		 * Switch case improves redability and it is faster
		 * 
		 * switch case is a value base, if else is a condition base
		 
		 * Limitation of switch: 
		 * 1. switch work only with byte, short, int, char, String
		 * 2. no relational or logical operators can be used 
		 * 3. data type of variable and case MUST be same 
		 * 4. duplicate cases are not allowed 
		 * 5. default is optional and it is similar as else block 
		 * 6. we need break --> to stop 
		 * 
		 * NOT: IF Statement works by one by, SWITCH Case work result . Therefore Switch Case is
		 * faster than if Statement.
		 *  
		 * $$$ Switch case check only equality
		 */

		
		
		/*
		 * 7 weekdays if day==1-->monday if day==2-->tuesday 
		 */

		int day = 6;
		String weekDay;

		if (day == 1) {
			weekDay = "Monday";
		} else if (day == 2) {
			weekDay = "Tuesday";
		} else if (day == 3) {
			weekDay = "Wednesday";
		} else if (day == 4) {
			weekDay = "Thursday";
		} else if (day == 5) {
			weekDay = "Friday";
		} else if (day == 6) {
			weekDay = "Saturday";
		} else if (day == 7) {
			weekDay = "Sunday";
		} else {
			weekDay = "Invalid";
		}

		System.out.println(weekDay);

		// NOT WE USE BREAK; for stop .if we will not use to break; system will work but
		// result will be invalid.
		// first it will come to day and the it will be continue.

		day = 5;

		switch (day) {// switch case like else if

		case 1:// meaning--> day=1
			weekDay = "Monday";
			break;
		case 2:
			weekDay = "Tuesday";
			break;
		case 3:
			weekDay = "Wednesday";
			break;
		case 4:
			weekDay = "Thursday";
			break;
		case 5:
			weekDay = "Friday";
			break;
		case 6:
			weekDay = "Saturday";
			break;
		case 7:
			weekDay = "Sunday";
			break;
		default:// it like else block
			weekDay = "Invalid day";
		}
		System.out.println(weekDay);

		/*
		 * NOT WE USE BREAK; for stop .if we will not use to break; system will work but
		 * result will be invalid. first it will come to day and the it will be
		 * continue.
		 */
		day = 5;

		switch (day) {// switch case like else if

		case 1:// meaning--> day=1
			weekDay = "Monday";
			// break;
		case 2:
			weekDay = "Tuesday";
			// break;
		case 3:
			weekDay = "Wednesday";
			// break;
		case 4:
			weekDay = "Thursday";
			// break;
		case 5:
			weekDay = "Friday";
			// break;
		case 6:
			weekDay = "Saturday";
			// break;
		case 7:
			weekDay = "Sunday";
			// break;
		default:// it like else block
			weekDay = "Invalid day";
		}
		System.out.println(weekDay);

	}

}
