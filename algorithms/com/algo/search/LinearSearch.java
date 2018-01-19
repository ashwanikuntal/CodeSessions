package com.algo.search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[]; int n; int data;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); arr = new int[n];
		sc.nextLine();
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		} sc.nextLine(); data  = sc.nextInt();
		findTheData(arr, data);
		sc.close();
	}
	
	private static void findTheData(int arr[], int data) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == data) {
				System.out.println(arr[i] +" is found at index " + i);
				break;
			}
		}
	}

}
