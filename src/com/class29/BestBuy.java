package com.class29;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BestBuy{

	//Create a map of Best Buy store. Place item id and item name into it.
	//Example (7664847 = Printer, 7879885= TV etc ) 
	//Retrieve all keys and values from a Best Buy map using EntrySet.

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(3456, "Mac Laptop");
		map.put(6746, "HP Printer");
		map.put(3468, "Dell Screen");
		map.put(8753, "Samsung TV");
		map.put(1765, "Sony Camera");

		System.out.println(map);
		
		// to retrieve key - values using entry set
		Set<Entry<Integer, String>> set = map.entrySet();
		for (Entry<Integer, String> entry : set) {
			String element = entry.getKey() + "==" + entry.getValue();// 1765+Sony Camera=
			System.out.println(element);
		}

		System.out.println("-- Retrieving key and value using iterator");
		Iterator<Entry<Integer, String>> entryIterator = map.entrySet().iterator();
		while (entryIterator.hasNext()) {
			Entry<Integer, String> singleEntry = entryIterator.next();
			System.out.println(singleEntry.getKey() +"---" +singleEntry.getValue());
			
			//OR//
			//Integer key = singleEntry.getKey();// Integer
			//String value = singleEntry.getValue();
			//System.out.println(key.toString() + "---" + value);
		}
	}
}