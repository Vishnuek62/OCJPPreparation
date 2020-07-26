package com.basis.java8;

interface MyInterface1 {
	public static int num = 100;

	public default void display() {
		System.out.println("display method of MyInterface1");
	}
}

interface MyInterface2 {
	public static int num = 1000;

	public default void display() {
		System.out.println("display method of MyInterface2");
	}
}

public class DefaultMethods2 implements MyInterface1, MyInterface2 {
	public static void main(String args[]) {
		DefaultMethods2 obj = new DefaultMethods2();
		System.out.println(obj.num); // num is ambigous.. call using interface names
		// obj.display();
		
		//when your class implements two interfaces, and if they both have methods with same name and prototype.
		//You must override this method else a compile time error is generated.
		
	}
}