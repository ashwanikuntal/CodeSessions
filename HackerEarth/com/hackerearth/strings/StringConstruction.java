package com.hackerearth.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class StringConstruction {

	public static void main(String[] args) {
	
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String str[] = new String[n];
		for(int i=0; i<n; i++){
			str[i] = sc.next();
		}
		ArrayList<HashSet<Character>> list = new ArrayList<HashSet<Character>>();
		for(int i=0; i<str.length; i++){
			HashSet<Character> set = new HashSet<Character>();
			for(int j=0; j<str[i].length(); j++){
				char c = str[i].charAt(j);
				set.add(c);
			}
			list.add(set);
		}
		
		for(HashSet<Character> set : list){
			System.out.println(set.size());
		}
		sc.close();
	}

}
