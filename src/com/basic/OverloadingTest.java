package com.basic;

class OverloadingTest {
	static int add(short a, short b) {
		return a + b;
	}

	static double add(double a, double b) {  // float is not working
		return a + b;
	}
	
	public static void main(String[] args) {
		System.out.println(OverloadingTest.add(11, 11));    // print 22.0
		System.out.println(OverloadingTest.add(12.3, 12.6)); // print 24.9
	}
}
