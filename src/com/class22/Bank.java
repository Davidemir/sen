package com.class22;

// NOTE : WE CAN WRITE TWO CLASS IN THE SAME BODY
//child class must start class ... when u write public class it will give an error
public class Bank {// parent class
	
	double money;

	public double chargeFee() {//overriden
		double fee = 0;
		if (money < 1000) {
			fee = money * 0.1;
		} else {
			fee = 0;
		}
		return fee;
	}
}

class CIBC extends Bank{//child class
	@Override//optional to verify that you are actually overriding
	//when we write @Override it shows to us it can be overriding or not
	public double chargeFee() {//overriding
		double fee = 0;
		if(money<1000) {
			fee = money*0.05;
		}else {
			fee = 0;
		}
		return fee;
	
    }
	
  }


