package com.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Word {

	public static void main(String[] args) {
		
		/*
		 * Create an arrayList of words. Remove every word that ends with “e”. Use
		 * iterator
		 */
		
		List<String> word = new ArrayList<String>();
		word.add("Home");
		word.add("Car");
		word.add("Shape");
		word.add("Hate");
		word.add("Miss");
		
		Iterator<String> it = word.iterator();
		while(it.hasNext()) {
		     if(it.next().endsWith("e")) {
			  it.remove();
		     }
		}
        System.out.println(word);
	}

}
