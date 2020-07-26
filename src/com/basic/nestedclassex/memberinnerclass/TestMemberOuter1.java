package com.basic.nestedclassex.memberinnerclass;

public class TestMemberOuter1 {
	private int data = 30;

	class Inner {
		// inner class is accessing the variable of Outer Class 'data'
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		TestMemberOuter1 obj = new TestMemberOuter1();
		TestMemberOuter1.Inner in = obj.new Inner();
		in.msg(); // print data is 30
	}
}