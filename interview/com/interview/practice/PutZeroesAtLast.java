package com.interview.practice;

import java.util.*;

public class PutZeroesAtLast {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		n = sc.nextInt();
		int numArray[] = new int[n];
		System.out.print("Enter Array Elements : ");
		for(int i=0; i<n; i++){
			numArray[i] = sc.nextInt();
		}
		System.out.print("Original Array : ");
		for(int k : numArray)
			System.out.print(k + " ");
		sc.close();
	}
}
