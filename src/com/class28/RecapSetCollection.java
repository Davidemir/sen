package com.class28;

import java.util.*;//this is short way and we can use it for all import.

public class RecapSetCollection {

	public static void main(String[] args) {
		Set<Double> set=new LinkedHashSet<>();
		set.add(99.99);
		set.add(90.99);
		set.add(9.99);
		set.add(59.99);
		set.add(39.99);
		set.add(19.99);
		
		//remove numbers less than 50
		
		//note for remove use iterator..
		//iterator access retrieving element AND it can REMOVE it
		Iterator<Double> iterator=set.iterator();
		while(iterator.hasNext()){
			if(iterator.next()<50) {
				iterator.remove();
			}
		}

		System.out.println("....................");
		//enhance loop access only retrieving element but it can not remove it
		for(Double d1:set){
			System.out.println(d1);
		}
		
		System.out.println("///////////////////////////////////////////////////////////");
		
//		How can you remove all duplicates from ArrayList?
		
		List<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set<String> hset = new HashSet<>();
		hset.addAll(aList);
		System.out.println(hset);
		
		//if u wanna remove everything use ==> clear
		aList.clear();
		System.out.println(aList);
		
		//if u wanna add names again ==>addAll
		hset.addAll(aList);
		System.out.println(hset);
		
		//How can I remove/access/update just 1 value from the Set collection ==> //convert to ArrayList
		Set<String> lset=new LinkedHashSet<>();//LinkedHashSet==> keep the order
		lset.add("Morning");
		lset.add("Noon");
		lset.add("Evening");
		lset.add("Jasmine");
		lset.add("Night");
		//convert to ArrayList
		List<String> myList=new ArrayList<>();
		myList.addAll(lset);
		String element = myList.get(2);//for remove==>.remove(int index);/ for update==> set(int index, String element)
		System.out.println(element);
		
		//another way to create an Object of ArrayList by passing values to the constructor
		List<String> myList1 = new ArrayList<>(lset);

	}
}