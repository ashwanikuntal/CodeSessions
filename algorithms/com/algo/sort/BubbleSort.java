package com.algo.sort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		int n, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array size : ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.print("Enter the numbers in array : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Unsorted Array : ");
		for(int x: arr)
			System.out.print(x + " ");
		
		for(int i=(arr.length-1); i>0; i--) {
			for(int j=(arr.length-1); j>0; j--) {
				if(arr[j] < arr[j-1]) { 
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
 				}
			}
		}
		
		System.out.println();
		System.out.print("Sorted Array : ");
		for(int x: arr)
			System.out.print(x + " ");
		
		sc.close();
	}

}
