package com.basic;

class Bike {
	int speedlimit = 90;
}

public class PolyMorphismExample extends Bike {
	int speedlimit = 150;

	public static void main(String args[]) {
		Bike obj = new PolyMorphismExample();
		System.out.println(obj.speedlimit);// 90
		PolyMorphismExample obj2 = new PolyMorphismExample();
		System.out.println(obj2.speedlimit);// 150
	}
}