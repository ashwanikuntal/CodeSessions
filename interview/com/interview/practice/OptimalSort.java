package com.interview.practice;

import java.util.HashMap;
import java.util.Map;

public class OptimalSort {
	
	public static void main(String args[]) {
		
		int a[] = {0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1};
		//a = sort(a);
		a = easySort(a, a.length);
		for(int n : a)
			System.out.print(n + ",");

	}
	
	static int[] sort(int []arr) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int x : arr) {
			if(!map.containsKey(x))
				map.put(x, 1);
			else
				map.put(x, map.get(x) + 1);
		}
		
		int size = map.get(0) + map.get(1);
		arr = new int[size];
		
		for(int i=0; i<map.get(0); i++) {
			arr[i] = 0;
		}
		
		for(int i=(map.get(0)); i<size; i++) {
			arr[i] = 1;
		}
		return arr;
	}
	
	static int[] easySort(int []arr, int size) {
		
		int sum = 0;
		for(int i=0; i<size; i++) {
			sum = sum + arr[i];
		}
		
		for(int i=0; i<size-sum; i++) {
			arr[i] = 0;
		}
		
		for(int i=size-sum; i<size; i++) {
			arr[i] = 1;
		}
		return arr;
	}

}
