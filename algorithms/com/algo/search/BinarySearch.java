package com.algo.search;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]; int n; int data;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); arr = new int[n];
		sc.nextLine();
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		} sc.nextLine(); data  = sc.nextInt();
		if(findTheData(arr, data) != -1)
			System.out.println(data + " is found at index " + findTheData(arr, data));
		else
			System.out.println("Data is not present in the array");
		sc.close();
	}
	
	private static int findTheData(int arr[], int data) {
		int start = 0, end = arr.length-1;
		while(start <= end) {
			int mid = start + ((end - start)/2);
			if(arr[mid] == data)
				return mid;
			else if(arr[mid] < data)
				start = mid + 1;
			else if(arr[mid] > data)
				end = mid - 1;
		}
		return -1;
	}

}
