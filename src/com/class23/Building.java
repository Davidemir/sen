package com.class23;

public class Building {
	
	String address;
	int floor;
	
	Building(String address, int floor){
		this.address = address;
		this.floor = floor;
	}

}


class Room extends Building{
	
	int roomNumber;
	
	Room(String address, int floor, int roomNumber){
		super(address, floor);//==> for parent class contructor
		this.roomNumber = roomNumber;//==> for child class contructor.
	}
	
	public void displayInfo() {
		System.out.println("Our address is "+address+" "+floor+" floor " +" room number is "+roomNumber);
	}
}

