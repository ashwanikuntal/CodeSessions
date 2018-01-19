package com.hackerearth.strings;

import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)
        	System.out.println("Anagrams");
        else 
        	System.out.println("Not Anagrams");
        
        sc.close();

	}
	
	public static boolean isAnagram(String A, String B) {
		boolean isAnag = true;
		int strLenA = A.length();
		int strLenB = B.length();
		
		HashMap<Character, Integer> mapA = new HashMap<Character, Integer>();
		HashMap<Character, Integer> mapB = new HashMap<Character, Integer>();
		
		if(strLenA == strLenB) {
			for(int i=0; i<strLenA; i++){
				Character ch = Character.toLowerCase(A.charAt(i));
				if(mapA.containsKey(ch))
					mapA.put(ch, mapA.get(ch)+1);
				else
					mapA.put(ch, 1);
			}
			for(int i=0; i<strLenB; i++){
				Character ch = Character.toLowerCase(B.charAt(i));
				if(mapB.containsKey(ch))
					mapB.put(ch, mapB.get(ch)+1);
				else
					mapB.put(ch, 1);
			}
			for(int i=0; i<(strLenA-1); i++) {
				Character c = A.charAt(i);
				if(mapA.get(c) != mapB.get(c)) {
					isAnag = false;
					break;
				}
			}
			return isAnag;
		} else {
			isAnag = false;
			return isAnag;
		}	
	}
}
