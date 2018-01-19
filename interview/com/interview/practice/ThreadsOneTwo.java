package com.interview.practice;

public class ThreadsOneTwo {

	public static void main(String[] args) {
		
		PrintStar pr = new PrintStar();
		PrintNumber pn = new PrintNumber();
		
		Thread t1 = new Thread(pr);
		Thread t2 = new Thread(pn);
		
		t1.start();
		t2.start();
		
	}
}
