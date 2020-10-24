package com.class04;

public class IfElseRecap {
	
	public static void main(String[] args) {
		
		/*Class schedule
		 * if tuesday-->sdlc
		 * if wednesday-->java review
		 * if thursday-->sdlc
		 * if saturday-->java coding
		 * if sunday-->my favourite Java coding
		 */
		
		int day=4;
		
		if(day==2) {
			System.out.println("SDLC Class");
		}else if(day==3) {
			System.out.println("Java Review");
		}else if(day==4) {
			System.out.println("SDLC Class");
		}
		else if(day==6) {
			System.out.println("Java Coding");
		}
		else if(day==7) {
			System.out.println("My favourite Java coding");
		}else {
			System.out.println("There is no lesson");
		}
		
	}

}
