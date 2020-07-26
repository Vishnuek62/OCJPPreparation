package com.basic;

class Animal2 {
	void eat() {
		System.out.println("eating...");
		
	}
}

class Dog2 extends Animal2 {
	void eat() {  //to int return if same method name , if change return type, compile time error happend
		super.eat();
		System.out.println("eating bread...");
	}
}

class TestSuper2 {
	public static void main(String args[]) {
		Dog2 d = new Dog2();
		
		d.eat();  // print eating...
				  //	eating bread...

		
	}
}