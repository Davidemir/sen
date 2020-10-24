package com.class28;

import java.util.*;//* hepsinin yerine gecer(LinkedList,ArrayList,Iterator)

class Sweets{
	String name;
	
	public Sweets(String name) {
		this.name=name;
	}
	
	public void iLove() {
		System.out.println("I love "+name);
	}
}
public class LinkedListDemo2 {

	public static void main(String[] args) {
		//create a list of Sweets Objects
		List<Sweets> sweetList=new LinkedList<>();
		sweetList.add(new Sweets("Chocolate"));//0
		sweetList.add(new Sweets("Cake"));//1
		sweetList.add(new Sweets("Cookies"));//2
		sweetList.add(new Sweets("Macaroons"));
		
		//lets display name of each sweet object
		for(Sweets element: sweetList) {
			System.out.println(element.name);
			element.iLove();
		}
		
		System.out.println("...............................");
		
		//retrieving 1 element and accessing method (2 steps)
		Sweets mySweet=sweetList.get(2);
		mySweet.iLove();
		
		//retrieving 1 element and accessing method (2 steps)
		sweetList.get(2).iLove();
		String nameOfTheSweet=sweetList.get(2).name;//we must use String coz we are accessing name.name is String
		System.out.println(nameOfTheSweet);
		
		System.out.println("...............................");
		
		String str="Hello 123 ";
		//"Hello 123 "--> "Hello 456 " --> "Hello 456"
		str.replace("123", "456").trim();//==> it will replace the number.
		
		Integer num=100; 
		               //int convert to String
		String newNumber1=num.toString().replace("100", "200");
		System.out.println(newNumber1);
		
					//100--> "100"----> "200" ------> number was 100 after that we convert to String      
		            //and then we replace it lenght is 3
		int newNumber2=num.toString().replace("100", "200").length();//when we add length it is it not String
		System.out.println(newNumber2);
		
	}
}
