package com.basic.thread;

public class TestSleepMethod2 extends Thread {
	public void run() {
		print();
	}

	static synchronized private void print() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
			// print
			
		}
	}

	public static void main(String args[]) {
		TestSleepMethod2 obj1 = new TestSleepMethod2();
		TestSleepMethod2 obj2 = new TestSleepMethod2();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
}