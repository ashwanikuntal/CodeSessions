package com.algo.sort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		int n, min, temp, index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.print("Enter the numbers in array : ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		System.out.print("Unsorted Array : ");
		for(int x : arr)
			System.out.print(x + " ");
		
		for(int i=0; i<arr.length; i++) {
			min = arr[i];
			for(int j=i; j<arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			
			if(min < arr[i]) {
				temp = arr[i];
				arr[i] = min;
				arr[index] = temp;
			}
		}
		
		System.out.println();
		System.out.print("Sorted Array is : ");
		for(int x: arr)
			System.out.print(x + " ");
		
		sc.close();
	}
}
