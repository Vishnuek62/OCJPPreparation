package com.basic;


class Animal4 {
	private void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog4 extends Animal4 {
	void eat() {
		System.out.println("dog is eating...");
	}

}

public class OverridePrivate {

	public static void main(String args[]) {
		Dog4 a = new Dog4();  
		a.eat();  // print dog is eating... // not happen overrideing private declaration in super calss
		
		Animal4 b  = new Dog4();  
	//	b.eat();   // compile time error.. visibility of eat method , b type of super calss
		
		
		
		
	}
}