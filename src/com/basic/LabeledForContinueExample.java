package com.basic;

public class LabeledForContinueExample {
	public static void main(String[] args) {
		aa: for (int i = 1; i <= 3; i++) {
			bb: for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					// using continue statement with label
					continue aa;
				}
				System.out.println(i + " " + j); // print 1 1, 1 2, 1 3, 2 1, 3 1, 3 2,3 3 
			}
		}
	}
}