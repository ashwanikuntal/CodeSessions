package com.interview.practice;

import java.util.Scanner;

public class RevSentence {

	public static void main(String[] args) {
		
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		s = reverseSentence(s);
		System.out.println(s);
		sc.close();
	}
	
	public static String reverseSentence(String str)
	{
		String revStr = "";
		String tokens[] = str.split(" ");
		for(int i=(tokens.length-1); i>=0; i--)
			revStr = revStr + tokens[i] + " ";
		return revStr;
	}
}
