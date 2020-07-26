package com.basic;

class LogicalBitwiseOperator {
	public static void main(String args[]) {
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a < b && a++ < c);// false && true = false
		System.out.println(a);// 10 because second condition is not checked
		System.out.println(a < b & a++ < c);// false && true = false
		System.out.println(a);// 11 because second condition is checked
		
		
		
		int a1=10;  
		int b1=20;  
		a1+=4;//a=a+4 (a=10+4)  
		b1-=4;//b=b-4 (b=20-4)  
		System.out.println(a1);  
		System.out.println(b1);
		
		
		
		
	}
}