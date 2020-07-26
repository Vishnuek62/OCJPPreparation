package com.basis.java8;

interface MyInterface3 {
	public static int num = 100;

	public default void display() {
		System.out.println("display method of MyInterface3");
	}
}

interface MyInterface4 {
	public static int num = 1000;

	public default void display() {
		System.out.println("display method of MyInterface4");
	}
}

public class DefaultMethods3 implements MyInterface3, MyInterface4 {
	public static void main(String args[]) {
		DefaultMethods3 obj = new DefaultMethods3();
		System.out.println(MyInterface3.num);
		obj.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		MyInterface3.super.display();
		MyInterface4.super.display();

	}
}