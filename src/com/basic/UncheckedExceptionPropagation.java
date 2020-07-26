package com.basic;

public class UncheckedExceptionPropagation {

	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		UncheckedExceptionPropagation obj = new UncheckedExceptionPropagation();
		obj.p();   // print exception handled
		System.out.println("normal flow...");
	}
	
	// checked exception is not propagated. only unchecked default propagated.
	//Exception Handling is mainly used to handle the checked exceptions. because, unchecked is 
	//need to solve.
	// need to propagated checked exceptions, use throws
	// If you are calling a method that declares an exception, you must either caught or declare the exception.
}