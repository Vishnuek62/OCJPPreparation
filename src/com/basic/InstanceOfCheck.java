package com.basic;

public class InstanceOfCheck {

	public static void main(String args[]) {
		Dog5 d = new Dog5();
		System.out.println(d instanceof Animal5);// true
		Dog5 e = null;
		System.out.println(e instanceof Dog5);// false
	}
}

class Animal5 {
}

class Dog5 extends Animal5 {// Dog inherits Animal

}