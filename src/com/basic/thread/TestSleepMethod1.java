package com.basic.thread;

public class TestSleepMethod1 extends Thread {
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
					Thread-1 1
					Thread-1 2
					Thread-1 3
					Thread-1 4
					Thread-2 1
					Thread-2 2
					Thread-2 3
					Thread-2 4


				 */
			}
	}



	public static void main(String args[]) {
		TestSleepMethod1 obj1 = new TestSleepMethod1();
		//TestSleepMethod1 obj2 = new TestSleepMethod1();
		Thread t1=new Thread(obj1);  
		Thread t2=new Thread(obj1);  
		
		t1.start();
		t2.start();
	}
}