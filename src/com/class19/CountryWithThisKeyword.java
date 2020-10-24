package com.class19;

public class CountryWithThisKeyword {
	
	public String country, capital;
	int population;
	
	
	//We can use Access Modifiers( public, protected, default, private) with the constructors
	public CountryWithThisKeyword(){
		System.out.println("I am  non argument constructor");	
	}
	
	private CountryWithThisKeyword(String country, String capital, int population){
		
//		country = country;
//		capital = capital;	
//		population = population;
		
		
//		public void displayInfo() {
//			System.out.println(country+" "+capital+" "+population);
//		} ==> why output will be null? ===> coz in this method we used instances variables but we did not initialize 
//		
		/* when our instance variables and (Counstructor) local variables name as same output will be :
		 * null null 0 
		 * null null 0 
		 * null null 0
		 */
		
		//if we wanna use instance variables and (Counstructor) local variables name as same we must use this keyword.
		//(this.instance variableName = local variableName )
		
		this.country = country;
		this.capital = capital;	
		this.population = population;
		
	}

	
	public void displayInfo() {
		System.out.println(country+" "+capital+" "+population);//this method we used instances variables
		//and initialize with this keyword.therefore compile will not confused.
	}
	public static void main(String[] args) {
		
		CountryWithThisKeyword co1 = new CountryWithThisKeyword("Canada", "Ottawa",36);
		CountryWithThisKeyword co2 = new CountryWithThisKeyword("Italy", "Roma",60);
		CountryWithThisKeyword co3 = new CountryWithThisKeyword();
		
		
		co1.displayInfo();
		co2.displayInfo();
		co3.displayInfo();
		
		
		
		
		
	}
}
