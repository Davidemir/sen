package com.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Drinks {

	public static void main(String[] args) {

		/*
		 * Create an arrayList of drinks. If any drink has letter “a” or “e” replace it
		 * with water.
		 */
		
		List<String> drink = new ArrayList<>();
		drink.add("orance juice");
		drink.add("ayran");
		drink.add("cola");
		drink.add("coffee");
		
		//replace element ==> set(int index, String element);
		
		for(int i= 0; i<drink.size(); i++) {
			if(drink.get(i).contains("a") || drink.get(i).contains("e")) {
				drink.set(i, "water");
			}
		}
		
		System.out.println(drink);

	}

}
