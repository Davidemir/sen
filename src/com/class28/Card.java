package com.class28;

public abstract class Card {

	/*
	 * Create a Card class that will have implemented and unimplemented methods and
	 * a constructor that will initializes credit card type. Create 3 subclasses of
	 * a Card card. Create 3 objects of different card and store them into
	 * LinkedList. Using for loop/advanced for loop/ iterator access all methods of
	 * the class.
	 */
	String cardType;

	Card(String cardType) {
		this.cardType = cardType;
	}

	public abstract void creditLimit();

	public void cashBack() {
		System.out.println(cardType + " gives cash back of %3");
	}
}

class Visa extends Card {
	Visa(String cardType) {
		super(cardType);
	}

	@Override
	public void creditLimit() {
		System.out.println("Credit limit of the " + cardType + " is $2500");
	}
}

class AX extends Card {
	AX(String cardType) {
		super(cardType);
	}

	@Override
	public void creditLimit() {
		System.out.println("Credit limit of the " + cardType + " is $2000");
	}
}

class Master extends Card {
	Master(String cardType) {
		super(cardType);
	}

	@Override
	public void creditLimit() {
		System.out.println("Credit limit of the " + cardType + " is $1500");
	}
}
