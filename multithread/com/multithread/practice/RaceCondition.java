package com.multithread.practice;

public class RaceCondition {

	public static void main(String[] args) {
		
		test ts = new test();
		Thread t1 = new Thread(ts, "ThreadOne");
		Thread t2 = new Thread(ts, "ThreadTwo");
		
		t1.start();
		t2.start();
	}
}

class test implements Runnable {
    int id; int num;
	static int count;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<100; i++) {
				System.out.println(Thread.currentThread().getName() + " ----> " + num++);
			}
		}
	}
}
