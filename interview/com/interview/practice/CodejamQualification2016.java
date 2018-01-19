package com.interview.practice;

import java.util.HashSet;
import java.util.Scanner;

public class CodejamQualification2016 {

	public static void main(String[] args) {
		
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		int[] num = new int[t];
		
		for(int i=0; i<t; i++)
			num[i] = sc.nextInt();
		
		for(int i=0; i<t; i++)
			System.out.println(findLastNum(num[i]));
		
		sc.close();
	}
	
	public static int findLastNum(int n) {
		HashSet<Character> set = new HashSet<Character>();
		int prefix = 1;
		while(set.size() != 10) {
			for(char c: String.valueOf(prefix*n).toCharArray()) {
				set.add(c);
			}if(set.size() != 10)
				prefix++;
			continue;
		}
		return prefix*n;
	}
	
}
