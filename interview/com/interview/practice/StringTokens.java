package com.interview.practice;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		String [] s = str.split(" ");
		System.out.println(s.length);
		for(String st : s) {
			System.out.println(st);
		}
		sc.close();
	}

}
