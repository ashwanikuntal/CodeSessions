package com.hackerearth.strings;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		 
		String str; String newStr = "";
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			Character ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				newStr = newStr + "_" + ch;
			} else
				newStr = newStr + ch;
		}
		
		String s[] = newStr.split("_");
		
		for(String ss : s)
			System.out.println(ss);
		
		sc.close();
	}

}