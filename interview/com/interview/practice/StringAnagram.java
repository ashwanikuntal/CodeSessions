package com.interview.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		if(s1.length() == s2.length()) {
			for(Character c : s1.toCharArray()) {
				if(!map1.containsKey(c)) {
					map1.put(c, 1);
				} else {
					map1.put(c, map1.get(c) + 1);
				}
			}
			
			for(Character c : s2.toCharArray()) {
				if(!map2.containsKey(c)) {
					map2.put(c, 1);
				} else {
					map2.put(c, map2.get(c) + 1);
				}
			}
			
			for(int i=0; i<s1.length(); i++) {
				if(map1.get(s1.charAt(i)) != map2.get(s1.charAt(i))) {
					System.out.println("String is not Permutation of Other");
					break;
				}
				else {
					if(i==s1.length()-1)
						System.out.println("String is permutation of Other");
						continue;
					}
				}
			} else {
				System.out.println("String is not Permutation of Other");
			}
		sc.close();
	}

}
