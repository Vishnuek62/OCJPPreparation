package com.basic;

interface Drawable {
	void draw();

	default void msg() {
		System.out.println("default method");
	}

	static int cube(int x) {
		return x * x * x;
	}
}

class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class TestInterfaceDefault {
	public static void main(String args[]) {
		Rectangle d = new Rectangle();
		d.draw(); // drawing rectangle
		d.msg(); // default method

		Drawable e = new Rectangle();
		d.msg(); // default method

		System.out.println(Drawable.cube(3)); 
	}
}