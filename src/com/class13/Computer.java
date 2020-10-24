package com.class13;

public class Computer {
	
	//define features/ attributes / state
	String monitor, brand, name, mouse;
	boolean keyword;
	int size, memory, screen, ram;

	
	//define features/ actions==method();
	
	void playGames() {//=>method header
		//method body
		System.out.println("I can play own my "+name);
	}
	
	
	void javaCoding() {
		System.out.println("I can do Java coding on my "+name);
	}
	
	void watchMovie() {
		System.out.println("I can watch movie on my "+name);
	}
	
	 //////////////////////////////////////////////
	//////////////////////////////////////////////
	public static void main(String[] args) {       //==>using main method for code execution.
				                                   //==>IF YOU WANT code execution U MUST WRITE INSIDE THE MAIN METHOD.
   //////////////////////////////////////////////	
  //////////////////////////////////////////////	
		
		Computer comp1 = new Computer();
		comp1.brand ="Apple";
		comp1.name ="Macbook Pro";
		comp1.memory = 250;
		
		//print I have Apple Macbook Pro
		System.out.println("I have "+comp1.brand+" "+comp1.name);
		
		
		//accessing behavior of first object
		comp1.javaCoding();
		comp1.watchMovie();
		
		System.out.println("..... Creating second Object of a Computer type .....");
		
		Computer comp2 = new Computer(); //we built in individual Computer Objects.
		comp2.brand ="Dell";
		comp2.name = "420";
		comp2.memory =125;
		
		
		//accessing behavior of second object
		comp2.javaCoding();
		comp2.watchMovie();
		comp2.playGames();
		
		
		
	}
	
}
