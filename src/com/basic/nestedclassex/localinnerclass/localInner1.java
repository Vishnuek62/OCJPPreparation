package com.basic.nestedclassex.localinnerclass;

public class localInner1 {
	private int data = 30;// instance variable

	void display() {
		int i = 3;
		class Local {
			void msg() {
				System.out.println(data);
				System.out.println(i);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		localInner1 obj = new localInner1();
		obj.display(); //30
	}
}