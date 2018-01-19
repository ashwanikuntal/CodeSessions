package com.ds.stack;

public class MyStack {

	public static void main(String[] args) {
		ArrayStack as = new ArrayStack();
		
		System.out.println(as.top);
		as.push(5);
		as.push(10);
		System.out.println(as.top());
		as.pop();
		System.out.println(as.top());
		as.displayData();
		/*as.push(15);
		as.push(20);
		as.pop();
		as.pop();
		System.out.println(as.top);
		as.displayData();*/
	}
}
