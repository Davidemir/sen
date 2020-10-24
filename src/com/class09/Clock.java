package com.class09;

public class Clock {

	public static void main(String[] args) {
		
		// 24 hours(h), 60 minutes(m)
		//hours control the outer loop, minutes control the inner loop
		
		for (int h=0; h<24; h++) {
			
			for (int m=0; m<60; m++) {
				
				if(m<10) {
					System.out.println(h+" :0 "+m);
				}else
				System.out.println(h+" : "+m);
			}
		}

	}

}
