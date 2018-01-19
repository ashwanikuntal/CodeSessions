package com.ds.stack;

public class ArrayStack {
	
	int[] num;
	int top;
	
	public ArrayStack() {
		num = new int[10];
		top = -1;
	}
	
	void push(int data){
		if(top == 10)
			System.out.println("Stack Overflow");
		else
		num[++top] = data;
		}

	void pop(){
		if(top == -1)
			System.out.println("Stack Underflow");
		else
			top = top - 1;
	}
	
	int top()
	{
		return num[top];
	}
	
	public void displayData(){
		for(int a : num)
		{
			System.out.println(a);
		}	
	}
}
