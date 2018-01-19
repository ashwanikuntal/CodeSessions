package com.interview.practice;

public class PrintNumberSeq {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + (i-1) + " ");
			}
			System.out.println();
		}
	}
}
