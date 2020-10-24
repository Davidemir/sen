package com.class29;

import java.util.*;

public class RetrieveAllKeysAndValues {

	public static void main(String[] args) {
		// Create a map of a person(name,lastName, address, city, state)

		Map<String, String> personMap = new LinkedHashMap<>();// alfabetik siralama olmaz fakat yazdigimiz siralamayi
		// takip eder. (preserve my order)
		// Map<String, String> personMap=new HashMap<>();alfabetik siralama olmaz.VE
		// YAZDIGIMIZ SIRALAMAYI DA TAKIP ETMEZ.
		// (NOT preserve my order)

		// Map<String, String> personMap=new TreeMap<>();alfabetik siralama OLUR

		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");

		System.out.println(personMap);

		// how to retrieve a specific value?
		String value = personMap.get("State");
		System.out.println(value);

		
		// how to retrieve all keys and all values?
		Set<String> keys = personMap.keySet();// if there is no duplicate for key use keySet and it will return Set
		
		System.out.println("-----first way :Printing all KEYS using loop-------------");
		for (String key : keys) {
			System.out.println(key);
		}
		
		System.out.println("-----second way :Printing all KEYS using iterator-------------");
		Iterator<String> keysIterator1 = keys.iterator();
		while (keysIterator1.hasNext()) {
			System.out.println(keysIterator1.next());

		}

		System.out.println("-----first way :Printing all VALUES using loop -------------");

		Collection<String> values = personMap.values();// if there is a duplicate for value use values and it will
														// return Collection
		for (String val : values) {
			System.out.println(val);
		}
		System.out.println("-----second way :Printing all VALUES  using iterator-------------");
		Iterator<String> valuesIterator = values.iterator();
		while (valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());

		}

		// how can I retrieve and print values key:value
		// FIRSY WAY:
		System.out.println("-----Printing all KEYS AND VALUE with using loop-------------");
		// how can I retrieve and print values key:value using for loop
		for (String key : keys) {
			System.out.println(key + ":" + personMap.get(key));
			                 //key for all keys, personMap.get(key)) for all values
			//note:personMap.get(key)) means: for example if we wanna learn name ==> get(name);
			//it will shows us name  when we use get(key) it will shows use all key
			//name: ...., lastname:...., state: ...... 
		}

		// SECOND WAY:
		System.out.println("-----Printing all KEYS AND VALUE with using iterator-------------");
		// how can I retrieve and print values key:value using iterator
		Iterator<String> keysIterator = keys.iterator();
		while (keysIterator.hasNext()) {
//			 System.out.println(keysIterator.next()+":"+ personMap.get(keysIterator.next())); CE
			String mapKey = keysIterator.next();//for all keys
			String mapValue = personMap.get(mapKey);//for all values

			System.out.println(mapKey + "_" + mapValue);
		}

	}
}