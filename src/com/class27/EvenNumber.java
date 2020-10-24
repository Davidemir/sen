package com.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenNumber {
	
	public static void main(String[] args) {
		
		/*
		 * Create an arrayList of even numbers from 1 to 50. Using Iterator remove any
		 * number that is divisible by 5 from that arrayList.
		 */
		
		List<Integer> even = new ArrayList<>();
		//storing only even number using for loop
		for(int i =1; i<=50; i++) {
			if(i%2==0) {
				even.add(i);
			}
		}
		System.out.println(even);
		
		//removing number that are divisible by 5 using Iterator
		Iterator<Integer> it = even.iterator();
		while(it.hasNext()) {
			if(it.next()%5==0) {
				it.remove();
			}
		}
		
		System.out.println(even);
	}

}
