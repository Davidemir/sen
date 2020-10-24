package com.class16;

//class USA {//we make usa default class
	//in that time Mexico class can not reach to USA class coz USA class is default but
	//if we make public class it will be reach it.
	
public class USA {

	private String capitalCity = "Washington DC";
	public String mainState = "New York";
	protected String school = "Syntax";
	String name = "Dave"; //if u dont anything it is default
	
	public static void main(String[] args) {
		
		USA us = new USA();
		System.out.println(us.capitalCity);
		System.out.println(us.mainState);
		System.out.println(us.school);
		System.out.println(us.name);
	}
}
