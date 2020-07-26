package com.basic;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();  
        al.add(1);    
        al.add(2);    
        al.add(3);   
        al.add(4);  
        al.add(5);  
        System.out.println("An initial list of elements: "+al);   
        //Removing specific element from arraylist  
        al.remove(new Integer(4));  
        System.out.println("After invoking remove(object) method: "+al);   
        //Removing element on the basis of specific position  
        al.remove(0);  
        System.out.println("After invoking remove(index) method: "+al);   
		
		
	}
	
	
}
