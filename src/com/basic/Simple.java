package com.basic;

class Simple {
	public static void main(String[] args) {
		
		int a = 10;
		//byte b = a; // compile time error
		byte b = (byte)a;  // Narrowing
		short s = (short)a; // Narrowing
		float f = a; // Widening
		long l = a; // Widening
		double d = a; // Widening
		System.out.println(a); // print 10
		System.out.println(b); // print 10
		System.out.println(s); // print 10
		System.out.println(f); // print 10.0
		System.out.println(l); // print 10
		System.out.println(d); // print 10.0
		
		
		float f1 = 10.5f;  
		//int a1 = f;//Compile time error  
		int a1 = (int) f1;  // Narrowing
		System.out.println(f1);  // print 10.5
		System.out.println(a1);  // print 10
		
		
		
		int a2 = 130;  
		byte b2 = (byte)a2;    // Overflow   
		System.out.println(a2);  // print 130
		System.out.println(b2);  // print -126
		
		
		byte a3=10;  
		byte b3=10;  
		//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
		byte c3= (byte)(a3+b3);  
		System.out.println(c3);  // print 20
		
	}
}
