package com.class27;

import java.util.ArrayList;//for all import ctrl +shift +o(not zero)

public class ArrayListTypesGenericOrNonGeneric {
	
	public static void main(String[] args) {
		
		/*
		 * Create a generic ArrayList that will store 5 names into it. 
		 * Find out whether the given ArrayList is empty or not? 
		 * Check whether the specific name is present in an ArrayList or not? 
		 * Find the size of your arrayList and print all values from that
		 */
		
		//ArrayList can Generic or non-Generic;
		//1. Generic ArrayList :has a return type. (inside angle bracket must be return type)
		//Lots of time we use generic arraylist.
		 ArrayList <String> arrName = new ArrayList<>();//or new ArrayList<String>();
		 arrName.add("Ali");
		 arrName.add("Mehmet");
		 arrName.add("Diyar");
		 arrName.add("Roj");
		 arrName.add("Yad");
//		 arrName.add(i); not possible CE
		 
		 if(!arrName.isEmpty()) {
			 
			 for(String name : arrName) {
				 System.out.println(name);
			 }
			 
			 System.out.println(arrName.size());
			 
		} 
		 
		 
		 
		 //2. non - Generic ArrayList: it has not return type(there is no angle brackets)
		 //therefore we can write different type values
		 ArrayList  alist = new ArrayList();
		 alist.add("Hello");
		 alist.add(100);
		 alist.add(10.10);
		 alist.add(true);
		 alist.add('c');
		 //int y = alist.get(1)+alist.get(2); ==>CE ask to type casting coz one is int value second is double value
		 
		 //Can u show me entire collection I just created?(how can u show all value together?)
		 System.out.println(alist);
		 
	}
}
