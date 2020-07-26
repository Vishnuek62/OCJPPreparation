package com.basic;

import java.util.*;

public class ArrayListExample {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add(0, "Mango");// Adding object in arraylist
		System.out.println(list);

		list.add(0, "Apple");
		System.out.println(list);

		list.add(1, "Banana");
		System.out.println(list);

		list.add(3,"Grapes");

		System.out.println(list);
		
		//list has no value at 4th index, java.lang.IndexOutOfBoundsException: Index: 5, Size: 4	
		
		//list.add(5,"pinapple");//IndexOutOfBoundsException
		
		System.out.println(list);
		
		
		
		// adding in same index, date is moved to next index, not replacing , shifting happens
	}
}
