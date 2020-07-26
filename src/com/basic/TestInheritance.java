package com.basic;

class Animal {
	static {
		{
			System.out.println("Animal static instance  block");
		}
		System.out.println("Animal static block");
	}
	{
		System.out.println("Animal Instance block");
	}
	
	Animal() {
		{
			System.out.println("Animal Constructor INstance block");
		}
		
		System.out.println("Animal Constructor");
	}
	
	int i = 9;
	void eat() {
		{
			System.out.println("eat method instance block");
		}
		
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	static {
		{
			System.out.println("Dog static instance block");
		}
		System.out.println("Dog static block");
	}
	{
		System.out.println("Dog Instance block");
	}
	
	Dog() {
		{
			System.out.println("Dog Constructor instance block");
		}
		System.out.println("Dog Constructor");
	}
	
	int i = 10;
	void bark() {
		System.out.println("barking...");
	}
}

class TestInheritance {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		System.out.println(d.i); // print 10
			
		//Animal static instance  block
		//Animal static block
		//Dog static instance block
		//Dog static block
		//Animal Instance block
		//Animal Constructor INstance block
		//Animal Constructor
		//Dog Instance block
		//Dog Constructor instance block
		//Dog Constructor
		//barking...
		//eat method instance block
		//eating...
		//10

		
		
		//In the above example, it seems that instance initializer block is firstly invoked but NO.
		//Instance intializer block is invoked at the time of object creation.
		//The java compiler copies the instance initializer block in the constructor after the first statement super().
		//So firstly, constructor is invoked.
		
		
	}
}