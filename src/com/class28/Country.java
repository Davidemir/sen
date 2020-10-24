package com.class28;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Country {
	/*
	 * Create a Set collection in which you need to add names of the countries. In
	 * this set we want all objects to be sorted in alphabetical order. Using 2
	 * different ways retrieve all elements from set.
	 */
	public static void main(String[] args) {
		
		Set<String> name = new TreeSet<>();
        name.add("Canada");
        name.add("USA");
        name.add("Netherlands");
        
        for(String str : name) {
        	System.out.println(str);
        }
        
        Iterator<String> it = name.iterator();
        while(it.hasNext()) {
        String s = it.next();
        }
        
        System.out.println(name);
        
	}
	
}
