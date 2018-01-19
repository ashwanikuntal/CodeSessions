package com.interview.practice;

import java.util.Scanner;

public class DiagonalDifference {
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int array[][] = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				array[i][j] = sc.nextInt();
		
		int count = 0;
		int diagOne = 0, diagTwo = 0;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				count++;
				if(n%2 !=0 && i==j && count == ((n*n)+1)/2){
					diagOne = diagOne + array[i][j];
					diagTwo = diagTwo + array[i][j];
				}	
				else if(i==j)
					diagOne = diagOne + array[i][j];
				else if((i+j) == n-1)
					diagTwo = diagTwo + array[i][j];
			}
		}
		System.out.println(Math.abs(diagOne - diagTwo));
		sc.close();
	}
}