package com.basic.nestedclassex.annonynousinnerclass;

abstract class Person {
	abstract void eat();
}

//A class that have no name is known as anonymous inner class in java.
//It should be used if you have to override method of class or interface.
//Java Anonymous inner class can be created by two ways:

//1.Class (may be abstract or concrete).
//2.Interface

public class TestAnonymousInner {
	public static void main(String args[]) {
		Person p = new Person() {
			void eat() {
				System.out.println("nice fruits");
			}
		};
		p.eat();
	}
}