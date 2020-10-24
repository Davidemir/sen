package com.class24;

public abstract class  Phone { //{}==>it means define
	
	public void makeCall() {//==>implemented methods coz it has a body {}    ==>define method
		System.out.println("Make call");//==>it is implement
	}
	
	public void sendText() {//==>implemented methods coz it has a body {}    ==>define method
		System.out.println("Send Text");//==>it is implement
	}

	public abstract void  takePictures();//==>unimplemented methods coz there is NO body {}  ==>undefine method
	/*
	 * if ur method is unimplemented methods (undefined method) we must add abstract keyword
	 * we have undefined method and our class(Phone) will not completed.Any time ur class
	 * will not completed compile will inforce u can make abstract class 
	 * class Phone will be  abstract class Phone
	 */
	
	public abstract void playGames();//==>unimplemented methods coz there is NO body {}  ==>undefine method
}

class Iphone extends Phone {//concrete class:child class will provide all implementions from abstract class
	
	/*
	 * compile will give an error. Compile say if u wanna a class that extends Phone
	 * if u wanna type of Phone u must provide  unimplemented Parent class methods
	 * click on the left, it shows u and when u click on add add unimplement methods it comes automatically.
	 */

	@Override
	public void takePictures() {
		System.out.println("Iphone takes pictures");//==> we add the implement
		
	}

	@Override
	public void playGames() {
		System.out.println("Play games on Iphone");//==> we add the implement
		
	}

}


class Samsung extends Phone {//concrete class:child class will provide all implementions  from abstract class

	/*
	 * compile will give an error. Compile say if u wanna a class that extends Phone
	 * if u wanna type of Phone u must provide  unimplement Parent class methods
	 * click on the left, it shows u and when u click on add add unimplement methods it comes automatically.
	 */
	
	@Override
	public void takePictures() {
		System.out.println("Samsung takes pictures");//==> we add the implement
		
	}

	@Override
	public void playGames() {
		System.out.println("Play games on Samsung");//==> we add the implement
		
	}
	
	
}
