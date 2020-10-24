package com.class28;

public class SetInfo {
	
	/*
	 * ===================================== SET COLLECTIONS ===================================== 
	 * Set is a collection that stores group of objects without duplicates 
	 * NOTE: A Set doesn't provide any method for data retrieval.!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 * note: WE can olny use enhance loop and iterator but
	 * we can not use for loop any set collection coz there is no index in Set collection!!!!!!!!!!!!!!!
	 * 
	 * There are three main implementations of Set interface: 
	 * 1. HashSet - collection that doesnt not maintain the insertion order 
	 * 2. LinkedHashSet - collection that maintains the insertion order 
	 * 3. TreeSet - collection that stores object in Ascending order
	 * 
	 * 
	 * =============== HashSet ======================= 
	 * HashSet is the class, Which implements the Set interface in Java. 
	 * HashSet is a collection that doesnt not maintain the insertion order
	 * HashSet can be used in place of ArrayList to store the object if you require
	 * no duplicate and don’t care about insertion order.
	 * HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, the old value
	 * would be overwritten.
	 * 
	 * note: WE can olny use enhance loop and iterator but
	 * we can not use for loop any set collection coz there is no index in Set collection!!!!!!!!!!!!!!!
	 * 
	 * =============== Methods in Hashset ====================
	 * boolean add(Element e), void clear(), boolean contains(Object o),boolean isEmpty()
	 * Iterator iterator(), int size(), Boolean remove (Object o), Object clone()
	 * 
	 * NOTE: A Set doesn't provide any method for data retrieval.
	 */
	
	
	/*=============== ArrayList(AL) vs HashSet (HS)? =================
	 * AL --> has duplicates and preserves order 
	 * HS --> does not allow duplicates and does not preserves order==>siralamayi korumak 
	 * AL -- > methods get and set available 
	 * HS --> get and set not available
	 */
	
	
	/* =============== LinkedHashSet ====================== 
	 * The LinkedHashSet class is the simplest implementation of the Set interface. 
	 * LinkedHashSet maintains the insertion order. 
	 * Elements get sorted in the same sequence in which they have been added to the Set.
	 * The LinkedHashSet achieves good performance by using a hash to store the Object in the Set. 
	 * The hash allows fast lookup.
	 */

	
	
	
	/*
	 * ====================== TreeSet in Java ========================== 
	 * The TreeSet class is the simplest implementation of the Set interface. 
	 * TreeSet is similar to HashSet except that it sorts the elements in the ascending order 
	 * while HashSet doesn’t maintain any order.
	 * TreeSet allows null element but like HashSet it doesn’t allow.
	 */

}
