package com.basic;

class Animal1 {
	String color = "white";
}

class Dog1 extends Animal1 {
	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}
}

public class TestSuper {
	public static void main(String args[]) {
		Dog1 d = new Dog1();
		d.printColor();
	}
}