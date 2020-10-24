package com.class19;

public class Country {
	
	public String country, capital;
	int population;
	
	
	//We can use Access Modifiers( public, protected, default, private) with the constructors
	public Country(){
		System.out.println("I am  non argument constructor");	
	}
	
	private Country(String Country, String cap, int pop){
		country = Country;
		capital = cap;	
		population = pop;
	}

	
	public void displayInfo() {
		System.out.println(country+" "+capital+" "+population);
	}
	public static void main(String[] args) {
		
		Country co1 = new Country("Canada", "Ottawa",36);
		Country co2 = new Country("Italy", "Roma",60);
		Country co3 = new Country();
		
		
		co1.displayInfo();
		co2.displayInfo();
		co3.displayInfo();
		
		
		
		
		
	}
}
