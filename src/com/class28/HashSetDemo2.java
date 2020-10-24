package com.class28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		//create a collection that will store Sweets type of Object and 
		// I do not care about the order as long as I do not have duplicate objects
		
		Set<Sweets> sweetSet=new HashSet<>();//ayni seyin iki kere yazilmasini istemiyorsak ve siralama onemli degilse:HashSet kullan.
		
		Sweets sweet=new Sweets("Cake");
		sweetSet.add(sweet);
		
		sweetSet.add(new Sweets("Cookies"));
		sweetSet.add(new Sweets("Ice Cream"));
		sweetSet.add(new Sweets("Baklava"));
		sweetSet.add(new Sweets("Macaroons"));
		sweetSet.add(new Sweets("Chocolate"));
		sweetSet.add(sweet);
		
		System.out.println(sweetSet.size());//6   iki tane sweet var sadece birini aliriz o yuzden 6
		
		//how do we print name of each sweet?
		System.out.println("................ 1 way: enhance loop ..............");
		
		for(Sweets element:sweetSet) {
			System.out.println(element.name);
		}
		
		System.out.println("................ 2 way: iterator ..............");
		
		Iterator<Sweets> it=sweetSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().name);
        }
	}
}