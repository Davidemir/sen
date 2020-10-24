package com.class15;

public class TestAllMethods {

	public static void main(String[] args) {
		
		//find the largest from 300 and 500
		//then identify is largest number is odd

		AllMethods obj = new AllMethods();
		int large = obj.largestNum(300, 500);
		System.out.println(large);
		boolean odd = obj.isOdd(large);
		System.out.println(odd);
		
		//call method weekDayName
		//if(tuesday, wednesday, thursday ,sunday)==> I m learning Java
		String day = obj.weekDayName(5);
		if(day.equals("Tuesday")  ||  day.equals("Wednesday")  ||  day.equals("Thursday")  
				|| day.equals("Sunday")) {
			System.out.println("I' m learning Java");
		}else {
			System.out.println("I' m practicing at Java");
		}
	}

}
