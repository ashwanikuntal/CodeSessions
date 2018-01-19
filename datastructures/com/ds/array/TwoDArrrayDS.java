package com.ds.array;

import java.util.Scanner;

public class TwoDArrrayDS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i < 6; i++)
            for(int j=0; j < 6; j++)
                arr[i][j] = in.nextInt();
        
        for(int r=0; r<4; r++){
        	for(int c=0; c<4; c++){
        		int currentSum = arr[r][c] + arr[r][c+1] + arr[r][c+2] + arr[r+1][c+1] + arr[r+2][c] + arr[r+2][c+1] + arr[r+2][c+2];
        		if(currentSum > maxSum)
                	maxSum = currentSum;
        	}
        }
        
        System.out.println(maxSum);
        in.close();
	}
}
