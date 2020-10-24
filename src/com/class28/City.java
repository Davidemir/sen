package com.class28;

import java.util.*;

public class City {
	
	/*
	 * Create a Set of cities in which you want to make sure that insertion order is
	 * maintained. Using Iterator remove any city that starts with “A”;
	 */

	public static void main(String[] args) {
		
		Set<String> city = new LinkedHashSet<>();
		city.add("Amsterdam");
		city.add("Izmir");
		city.add("Ankara");
		city.add("Alberta");
		
		
		Iterator<String> it = city.iterator();
        while(it.hasNext()) {
        	if(it.next().endsWith("a")) {
        		it.remove();
        	}
        }
        
        System.out.println(city);
	}

}
