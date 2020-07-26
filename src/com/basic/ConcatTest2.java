package com.basic;

//Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.  
public class ConcatTest2 {
	
	//Time taken by StringBuffer: 3ms
	//Time taken by StringBuilder: 2ms
	
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 20000; i++) {
			sb.append("Tpoint");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 20000; i++) {
			sb2.append("Tpoint");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}