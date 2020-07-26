package com.basic;

public class LabelForExample {
	public static void main(String[] args) {
		// Using Label for outer and for loop
		aa: for (int i = 1; i <= 3; i++) {
			bb: for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					break aa;
				}
				System.out.println(i + " " + j);// print 1 1, 1 2, 1 3, 2 1
			}
		}
	}
}