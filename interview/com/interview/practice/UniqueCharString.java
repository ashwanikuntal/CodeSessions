package com.interview.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class UniqueCharString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		/*List Implementation*/
		List<Character> list = new ArrayList<Character>();
		for(Character c : s.toCharArray()) {
			if(list.indexOf(c) == -1) {
				list.add(c);
			} else {
				System.out.println("The String has not all characters unique");
				break;
			}
		} System.out.println("Thumbs Up");
		
		//Map Implementation
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character c : s.toCharArray()) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				System.out.println("The String has not all characters unique");
				break;
			}
		} System.out.println("Thumbs Up");
		
		//Set Implementation
		Set<Character> set = new HashSet<Character>();
		for(Character c : s.toCharArray()) {
			set.add(c);
		}
		if(set.size() != s.length()) {
			System.out.println("The String has not all characters unique");
		} else {
			System.out.println("The String has all characters unique");
		}
		
        sc.close();
	}

}
