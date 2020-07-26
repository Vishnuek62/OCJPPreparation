package com.basic;

class ObjectPrint {
	void m() {
		System.out.println(this);// prints same reference ID
	}

	public static void main(String args[]) {
		ObjectPrint obj = new ObjectPrint();
		System.out.println(obj);// prints the reference ID //com.basic.ObjectPrint@15db9742
															//com.basic.ObjectPrint@15db9742
		obj.m();
	}
}