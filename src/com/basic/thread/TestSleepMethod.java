package com.basic.thread;

public class TestSleepMethod extends Thread {
	  synchronized public void run() {
		 for (int i = 1; i < 5; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				System.out.println(Thread.currentThread().getName()+" "+i);
				// print
				/*
					Thread-3 1
					Thread-2 1
					Thread-3 2
					Thread-2 2
					Thread-2 3
					Thread-3 3
					Thread-2 4
					Thread-3 4

				 */
			}
	}



	public static void main(String args[]) {
		TestSleepMethod obj1 = new TestSleepMethod();
		TestSleepMethod obj2 = new TestSleepMethod();
		Thread t1=new Thread(obj1);  
		Thread t2=new Thread(obj2);  
		
		t1.start();
		t2.start();
	}
}