package com.interview.practice;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class NoDupCharString {

	public static void main(String[] args) {
		String str;
		
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		str = findPerfectString(str);
		
		System.out.println(str);
		sc.close();
	}
	
	public static String findPerfectString(String s) {
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		char[] c = s.toCharArray();
		String ss = "";
		for(int i=0; i<c.length; i++)
			hs.add(c[i]);
		for(char ch : hs)
			ss = ss + ch;
		return ss;
	}

}
