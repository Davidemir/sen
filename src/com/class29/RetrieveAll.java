package com.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RetrieveAll {

	public static void main(String[] args) {
		//Lets create a map of a classroom in which we will store objects and it's quantities
		
		Map<String, Integer> classRoom=new HashMap<>();
		              //key    +   value-->Entry
		classRoom.put("Instructor", 3);//Entry
		classRoom.put("Student", 80);//Entry
		classRoom.put("Tables", 20);//Entry
		classRoom.put("Chairs", 80);//Entry
		
		System.out.println(classRoom);
		//note:every Entry Object must be unique, and it has not duplicate therefore we must use Set collection
		//methodname is entrySet() and it will return Set<Entry>
		
		Set<Entry<String, Integer>> entrySet=classRoom.entrySet();
		
		System.out.println("---------using for each loop to get all entry objects");
		//note every object of Entry has a getKey(); and getValue();
		for(Entry<String, Integer> entry:entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("---------using iterator to get all entry objects");
		
		Iterator<Entry<String, Integer>> entryIterator=entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> ent=entryIterator.next();
			String entry=ent.getKey()+"----"+ent.getValue();
			System.out.println(entry);
		}
	}
}
