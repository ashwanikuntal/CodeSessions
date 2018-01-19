package com.hackerearth.strings;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		
		int n; String newStr = "";
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		String str[] = new String [n];
		
		for(int i=0; i<n; i++)
			str[i] = sc.next();
		
		for(String s: str){
			if(isPalindrome(s))
				System.out.println("-1");
			else {
				int strlen = s.length();
				for(int i=0; i<(strlen/2); i++){
					if(s.charAt(i) == s.charAt(strlen-(i+1)))
						continue;
					else{
						int skipIndex[] = new int[2];
						skipIndex[0] = i;
						skipIndex[1] = strlen-(i+1);
						for(int j=0; j<s.length(); j++){
							if(j == skipIndex[0])
								continue;
							else
								newStr = newStr + s.charAt(j);
						}
						if(isPalindrome(newStr)){
							System.out.println(skipIndex[0]);
							break;
						}
						else {
							System.out.println(skipIndex[1]);
							break;
						}
					}
				}
						
			}
		}
		sc.close();
	}
	
	public static boolean isPalindrome(String st) {
		int strlen = st.length();
		for(int i=0; i<(strlen/2); i++){
			if(st.charAt(i) == st.charAt(strlen-(i+1)))
				continue;
			else
				return false;
		}
		return true;
	}

}
