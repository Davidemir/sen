package com.class07;

public class Task {

	public static void main(String[] args) {
		
		/*
		 * Create a boolean variable workDay and assign true create int variable day and
		 * assign it to 1 
		 * â—? As long as it is workDay print â€œI need a day offâ€? and increase day. 
		 * â—? Once day is 6 or 7 print â€œI do not need a day off any moreâ€?
		 */

		boolean workDay=true;
		int day=1;
		
		while(workDay) {
			
			if(day==6 || day==7) {//break;
				workDay=false;//when the day reach 6 it will be false. we add the workDay=false; if we
				//dont add it execute will be infinitive.
				System.out.println("I do not need a day off any more");
				
			}else {
				System.out.println("I need a day off");
			}
			day++;
		}
	}

}
