package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ListInfo {

	/*  ============================ LIST COLLECTIONS =====================================
	              korumak
	 * List is an keep/preserve the order collection that can contain duplicate elements.
	 * List is one of the most used Collection type.
	 * Elements can be inserted or accessed by their position in the list, using a zero-based index.
	 * List: 3 classes that implements it: ArrayList, LinkedList, Vector ==> child class
	 */
	
	
	/*
	 * =================== ArrayList ========================= 
	 * 1. ArrayList is a class which implements the List interface of collection framework. 
	 * 2. ArrayList is dynamic data structure You can add and remove the elements from
	 * ArrayList and ArrayList adjust its size automatically. 
	 * 3. ArrayList can contain the duplicate elements. 
	 * 4. It implements all optional list operations, and permits all elements, including null. 
	 * 5. ArrayList contains only objects (with the help of wrapper classes we are able to store numeric,
	 * boolean and char type of values)
	 * 
	 * 
	 * =============== Methods of ArrayList ==================== 
	 * add( Object o) ,
	 * add(int index, Object o) , remove(Object o) , remove(int index) set(int
	 * index, Object o)==>for update, int indexOf(Object o) ==>If the element is not
	 * found in the list then this method returns the value -1. Object get(int
	 * index) =>for retrieve element int size(), boolean contains(Object o), clear()
	 * 
	 * 
	 * ==================== Generic vs Non-Generic ArrayList ====================
	 * Java collection was non-generic before JDK 1.5. Since 1.5, it is generic. 
	 * 1. Generic ArrayList :has a return type. (inside angle bracket must be return type) 
	 * 
	 * for example : ArrayList <String> arrName = new ArrayList<>(); 
	 *
	 *note: we can use only data type values Lots of time we use generic arraylist.
	 * 
	 * 
	 * 2. non - Generic ArrayList: it has not return type(there is no angle brackets) 
	 * 
	 * for example : ArrayList arrName = new ArrayList(); 
	 * 
	 * note: we can use all data type values inside non generic ArrayList
	 * 
	 * 
	 * ========================== How to loop ArrayList in Java ============================ 
	 * for example : 
	 * ArrayList<Integer> numbers=new ArrayList<>(); 
	 * numbers.add(1); 
	 * numbers.add(10); 
	 * numbers.add(100);
	 * numbers.add(1000);
	 * 
	 * 1.for loop : 
	 * for(int i=0; i<numbers.size(); i++) {
	 * System.out.println(numbers.get(i));
	 *  }
	 * 
	 * 
	 * 2.enhance loop: 
	 * for(int num:numbers) { 
	 * System.out.println(num); 
	 * }
	 * 
	 * 3.iterator: 
	 * Iterator<Integer>iterator=numbers.iterator();
	 * while(iterator.hasNext()) {//if we dont know to how many element it has use the while loop 
	 * System.out.println(iterator.next()); 
	 * }
	 * 
	 * note :I want to get values backward
	 * 
	 * for(int i=numbers.size()-1; i>=0; i--) { 
	 * System.out.println(numbers.get(i));
	 * }
	 * 
	 * 
	 * ======================ArrayList vs Array============== 
	 * 1. Array is fixed in size--> static array while arraylist is dynamic array!
	 * 
	 * 2. Array contains primitives and non primitives, while ArrayList contains
	 * only objects (with the help of wrapper classes we are able to store numeric,
	 * boolean and char type of values)
	 * 
	 * 
	 * 3. You can use length variable to calculate length of an array but size() 
	 * method to calculate size of ArrayList.
	 * 
	 * 4. Array use assignment operator to store elements but ArrayList use add() to insert elements.
	 * 
	 * 5. Array can be multi dimensional , while ArrayList is always single dimensional
	 */
	
	
	/*===========================ITERATOR================================
	 * ==>Iterator is an interface that help to iterate/traverse through collections/through 
	 * each element inside the collection(List, set and queue)inside iterator have 3 methots:
	 * 
     1. hasNext(); ==> returns boolean if there is a next element in the collection
     2. next();==> returns that next element
     3. remove(); ==> removes that next element
     
     Each collection will have an access to the iterator method that will be returning 1 object of iterator type.
     
     best way to remove an element from a collection --> Iterator
	 */
	
	
	
	
	/*
	 * ======================= LinkedList ============================= 
	 * LinkedList is a class which implements the List interface of collection framework.
	 * Like ArrayList, LinkedList also can contain duplicate elements and also maintain
	 * the insertion order. We can declare the LinkedList same like ArrayList and
	 * perform operations like insertion and deletion are same like ArrayList
	 * 
	 * The only difference in LinkedList and ArrayList is, LinkedList stores
	 * elements in a doubly-linked list data structure while ArrayList stores
	 * elements in a backing array
	 * 
	 * Linkedlist is best choice for Adding and removing operations
	 * 
	 */
	
	
	/*
	 * ========================= ArrayList vs LinkedList ===========================
	 * 
	 * 1. ArrayList uses dynamic array while linked list used doubly linked list 
	 * 
	 * 2.ArrayList is the best options for retrieving while Linkedlist is best choice
	 * for Adding and removing operations 
	 * 
	 * 3. retreive in ArrayList comes to directly result, while in Linkedlist it will 
	 * go all element till find the true. 
	 * ==>it like if condition and switch cases. switch case comes to result directly ,
	 * but if go all value it find the true.
	 *  
	 * 4. %90 we use ArrayList.
	 * 
	 * 5. Manipulation with ArrayList is slow because it internally uses array. 
	 * If any element is removed from the array, all the bits are shifted in memory.
	 * but Manipulation with LinkedList is faster than ArrayList because it uses doubly linked 
	 * list so no bit shifting is required in memory.
	 */



	
}
