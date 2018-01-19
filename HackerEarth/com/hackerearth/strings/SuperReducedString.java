package com.hackerearth.strings;

import java.util.*;

public class SuperReducedString {

	public static void main(String[] args) {
		String str; 
		String newStr = "";
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		Stack<Character> s = new Stack<>();	
		
		for(int i=0; i<str.length(); i++) {
			if(s.size() == 0) {
				s.push(str.charAt(i));
			} else {
				if(s.peek().equals(str.charAt(i)))
					s.pop();
				else
					s.push(str.charAt(i));
			}
		}
		
		int sz = s.size();
		for(int i=0; i<sz; i++)
		{
			if(null != s.peek())
				newStr = newStr + s.peek();
			s.pop();
		}
		StringBuilder sb = new StringBuilder(newStr);
		
		if(newStr.equals(""))
			System.out.println("Empty String");
		else
			sb = sb.reverse();
		
		System.out.println(sb);
		sc.close();
	}
	
}
