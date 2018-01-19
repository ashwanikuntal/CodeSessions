package com.interview.practice;

import java.util.Scanner;

/*
You are given an array A.
Now you need to convert this array into special array which has the following characteristics.
1. All prime numbers come before all non prime numbers in the special array even if they are greater
2. All prime numbers are sorted in increasing order
3. All non prime numbers are sorted in decreasing order 

For example let the array A is 1,4,3,2,6 then the array after special sorting will become 2,3,6,4,1.
Note that 1 is not a prime number. Here 2 and 3 are prime so they are sorted in increasing order and 
6,4,1 are non prime so they are sorted in decreasing order. Also all the prime numbers come before 
non prime

Input
First line contains an integer N as input denoting total elements in the array A.
Next line contains N space separated integers that denotes the element of array A.

Output
In the output you need to print the array elements separated by space after it is specially sorted.

*/

public class ArrayConversion {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		

	}

}
