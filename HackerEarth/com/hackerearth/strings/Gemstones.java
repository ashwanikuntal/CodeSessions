package com.hackerearth.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gemstones {

	public static void main(String[] args) {
		
		int n, num = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc= new Scanner(System.in);
		
		n = sc.nextInt();
		String str[] = new String[n];
		for(int i=0; i<n; i++)
			str[i] = sc.next();
		
		ArrayList<String> listOfAlpha = new  ArrayList<String>();
		listOfAlpha.add("a");
		listOfAlpha.add("b");
		listOfAlpha.add("c");
		listOfAlpha.add("d");
		listOfAlpha.add("e");
		listOfAlpha.add("f");
		listOfAlpha.add("g");
		listOfAlpha.add("h");
		listOfAlpha.add("i");
		listOfAlpha.add("j");
		listOfAlpha.add("k");
		listOfAlpha.add("l");
		listOfAlpha.add("m");
		listOfAlpha.add("n");
		listOfAlpha.add("o");
		listOfAlpha.add("p");
		listOfAlpha.add("q");
		listOfAlpha.add("r");
		listOfAlpha.add("s");
		listOfAlpha.add("t");
		listOfAlpha.add("u");
		listOfAlpha.add("v");
		listOfAlpha.add("w");
		listOfAlpha.add("x");
		listOfAlpha.add("y");
		listOfAlpha.add("z");
		
		for(String c : listOfAlpha) {
			for(int i=0;i<n;i++) {
				if(str[i].contains(c) && !map.containsKey(c))
					map.put(c, 1);
				else if(str[i].contains(c) && map.containsKey(c))
					map.put(c, map.get(c)+1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
			if(entry.getValue() == n)
				num++;
		
		System.out.println(num);
		
		sc.close();
	}

}
