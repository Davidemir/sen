package com.class28;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//lets create a collection of veggies where I do not want to have duplicates
		//hset order of the elements is not preserved
		HashSet<String> hset=new HashSet<>();
		//storing values into hashset
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zuccini");
		hset.add("carrot");
		hset.add("zuccini");
		
		//we have 2 zuccini and set collections can not accept duplicate therefore it will accept
		//only one zuccini and size will be 5
		System.out.println(hset.size());
		
		System.out.println(hset);
		
		
		
		//NOT: they do not have any methods to retrieve elements from the collection ==>.get();, .set();
				//  we can not use .get();, .set();
				
		
		
		// how can we retrieve all elements?
		
		// first way: iterator
		Iterator<String> it = hset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------");

		
		// second way: enhanced for loop
		for (String el : hset) {
			System.out.println(el);
		}
		
		//NOTE there is no index therefore we cannot use for loop(regular loop)
	}
}