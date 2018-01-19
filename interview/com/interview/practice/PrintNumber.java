package com.interview.practice;

public class PrintNumber implements Runnable{
	
	String space = " ";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=5; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print(j);
			}
			System.out.println();
			System.out.print(space);
			space = space + " ";
		}	
	}

}
