package com.interview.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hacker {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		String nextLargestNum;
		ArrayList<String> completeList = permutation(str);
		Collections.sort(completeList);
		int indexOfString = completeList.indexOf(str);
		if(indexOfString == (completeList.size()-1))
			nextLargestNum = completeList.get(indexOfString);
		else
			nextLargestNum = completeList.get((indexOfString+1));
		System.out.println(nextLargestNum);
		sc.close();
	}
	
	public static ArrayList<String> permutation(String s) {
	    ArrayList<String> list = new ArrayList<String>();
	    if (s.length() == 1) {
	        list.add(s);
	    } else if (s.length() > 1) {
	        int lastIndex = s.length() - 1;
	        String last = s.substring(lastIndex);
	        String rest = s.substring(0, lastIndex);
	        list = merge(permutation(rest), last);
	    }
	    return list;
	}
	
	public static ArrayList<String> merge(ArrayList<String> list, String c) {
	    ArrayList<String> res = new ArrayList<String>();
	    for (String s : list) {
	        for (int i = 0; i <= s.length(); ++i) {
	            String ps = new StringBuffer(s).insert(i, c).toString();
	            res.add(ps);
	        }
	    }
	    return res;
	}
	
	
}
