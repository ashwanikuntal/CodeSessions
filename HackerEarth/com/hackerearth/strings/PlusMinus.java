package com.hackerearth.strings;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        for(int i=0; i < n; i++){
	            arr[i] = in.nextInt();
	        }
	        
	        int posCount = 0;
	        int negCount = 0;
	        int zerosCount = 0;
	        
	        for(int i=0; i < n; i++){
	        	if(arr[i] > 0)
	        		posCount = posCount+ 1;
	        	else if(arr[i] < 0)
	        		negCount = negCount + 1;
	        	else 
	        		zerosCount = zerosCount + 1;
	        }
	        
	        float p = (float)posCount/n;
	        float neg = (float)negCount/n;
	        float z = (float)zerosCount/n;
	        System.out.println(p);
	        System.out.println(neg);
	        System.out.println(z);
	        
	        in.close();       
	}
}
