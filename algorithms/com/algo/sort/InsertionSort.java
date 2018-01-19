package com.algo.sort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		n = s.nextInt();
		
		int[] numArray = new int[n];
		
		System.out.print("Put the elements into the array : ");
		for(int i=0; i<n; i++){
			numArray[i] = s.nextInt();
		}
		
		System.out.print("Elements in Unsorted Array is : ");
		for(int i=0; i<numArray.length; i++)
			System.out.print(numArray[i] + " ");
		
		numArray = sortTheArray(numArray);
		System.out.println("");
		System.out.print("Elements in sorted Array is : ");
		for(int i=0; i<numArray.length; i++)
			System.out.print(numArray[i] + " ");
		
		s.close();
		
		
	}
	
	public static int[] sortTheArray(int[] A)
	{
		for(int i=1; i<A.length; i++)
		{
			int key = A[i];
			int j = i-1;
			while(j >= 0 && A[j] > key)
			{
				A[j + 1] = A[j];
				j = j - 1;
			}
			A[j + 1] = key;
		}
		return A;
	}
}
