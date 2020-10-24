package com.class25;

public class DrivableTest {

	public static void main(String[] args) {
		
		Drivable obj = new Toyota();
        obj.drive();
//      Drivable.DRIVE_FAST = false; CE ==> final value can NOT be reassigned(reassigned means ==>change).
        
        Toyota toyota = new Toyota();
        toyota.drive();//from Toyota class
        toyota.stop();//from parent class (Cars )
	}

}
