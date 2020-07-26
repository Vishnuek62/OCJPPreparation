package com.basic;

public class WrapperExample1 {
	public static void main(String args[]) {
//Converting int into Integer  
		int a = 20;
		Integer i = Integer.valueOf(a);// converting int into Integer explicitly
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally

		System.out.println(a + " " + i + " " + j); // 20 20 20
		
		
		//Converting Integer to int    
		Integer b=new Integer(3);    
		int p=b.intValue();//converting Integer to int explicitly  
		int q=b;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(b+" "+p+" "+q);     // 3 3 3
		
		
	}
}