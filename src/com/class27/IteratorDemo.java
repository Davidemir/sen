package com.class27;

import java.util.ArrayList;
import java.util.Iterator; //note: ctrl + shift + o ==> for all import also

public class IteratorDemo {
	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<>();
		strList.add("Sveta");
		strList.add("Sasha");
		strList.add("Mohamad");
		strList.add("Alli");
		strList.add("Zeynep");
		
		//retrieve values from an ArrayList
		//1 way :  for loop
		for (int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		//2.way: enhanced for loop
		for (String name:strList) {
			System.out.println(name);
		}
		//3 way: Iterator
		Iterator<String>it=strList.iterator();
		while(it.hasNext()) {
			it.next();
		}
		System.out.println(strList);
	}
}