package com.class29;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		 //key + value = Entry
		HashMap<Integer, String> map=new HashMap<>();
		//to store key+value pair into map
		map.put(101, "John");//instead of add we use put
		map.put(102, "Jack");
		map.put(103, "Jane");
		map.put(104, "Jenny");
		 //104-->key  jenny-->value type
		//key must be unique , value type can be duplicate.
		System.out.println(map);
		
		//how to verify if there any elements inside map
				boolean flag=map.isEmpty();
				if (!flag) {
					int size=map.size();
					System.out.println(size);
	}
		//I want to Add more Entry Objects
		//map.put("105", "John");--> CE: key and value type must be matched.we used int value for key in here
				//we use String CE
				
		//adding duplicate values --> OK
		map.put(105, "John");
		System.out.println(map);
		
		//adding duplicate keys--> Override, we cannot have duplicate keys
		map.put(102, "Hasan");//value was Jack but now it will be Hasan
				System.out.println(map);
				
		//how to access a value
		String mapElement=map.get(105);
		System.out.println(mapElement);
		
		
		//to replace or update the value
		map.replace(103, "Zeynep");
		System.out.println(map);
				
		
		//how to remove an Object from a map
		map.remove(101);
		System.out.println(map);
		
		System.out.println("----------------------------");
		
		//how to verify if certain key is exist		
		boolean flag1=map.containsKey(103);//it has 103 key therefore ===> true
		System.out.println(flag1);
		if(flag1) {
			map.replace(103, "Seval");//jane will be seval
		}else {
			map.put(103, "Seval");
		}
		
		
		boolean flag2=map.containsKey(200);////it has NOT 200 key therefore ===> false
		System.out.println(flag2);
		if(flag2) {
			map.replace(200, "Ali");
		}else {
			map.put(200, "Ali");
		}
		
		//how to verify if certain value is exist
		boolean contains=map.containsValue("Seval");//it has Seval value therefore ===> true
		System.out.println(contains);
		System.out.println(map);
	
	
	}
}