package com.basis.java8;

interface Sayable {
	// default method
	default void say() {
		System.out.println("In Sayble interface");
	}

	// Abstract method
	void sayMore(String msg);

	// static method
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

public class DefaultMethods implements Sayable {

	public void say() {
		System.out.println("In DefaultMethods");
		Sayable.super.say(); // super can't call inside super.. Call say in inteface through this 
	}

	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Sayable dm = new DefaultMethods();
		dm.say(); // calling default method but overriding happened
		dm.sayMore("Work is worship"); // calling abstract method
		Sayable.sayLouder("Helloooo..."); // calling static method	
	}
}