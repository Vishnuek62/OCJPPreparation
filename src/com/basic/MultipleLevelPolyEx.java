package com.basic;

class Animal3 {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog3 extends Animal3 {
	void eat() {
		System.out.println("dog is eating...");
	}
}

class MultipleLevelPolyEx extends Dog3 {
	public static void main(String args[]) {
		Animal3 a = new MultipleLevelPolyEx();
		a.eat();   // dog is eating
	}
}