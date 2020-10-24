package com.class25;

public interface Drivable {
	//public static final variables(constant variable)
	public static final boolean DRIVE_FAST = true;//constant variables (DRIVE_FAST) are written using upper case.
	//it is optional u can write lower case also but upper case is better.
	
    //public abstract void drive();
	//by default compiler will add public abstract to the methods
	//therefore u dont need u write public abstract
	void drive();

}

class Cars{
	
	public void stop() {
		System.out.println("Car stops by pressing breaks");
	}
}
class Toyota extends Cars implements Drivable { 
	/*use to interface we can achieve multiple class and inheritances(it means one child has multiple parents)
	 * Cars is parent class and Toyota is child class therefore we can extends Toyota to Cars.
	 *  
	 * if wanna create relationship class between interface use the implements keyword.
	 * and compile give an error. click on the left u will see
	 * add unimplemented methods and click on it , it will be fixed.
	 */
		
	@Override
	public void drive() {
		System.out.println("Toyota can drive");
		
	} 

	
	
}