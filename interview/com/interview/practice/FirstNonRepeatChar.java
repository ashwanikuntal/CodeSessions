package com.interview.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		/*char c = nonRepeatChar(s);
		System.out.println("The first non-repeated character is : " + c);*/
		for(char i :s.toCharArray()){
			if(s.indexOf(i)==s.lastIndexOf(i)){
				System.out.println(i);
				System.out.println(s.indexOf(i));
				break;
			}	
		}
		sc.close();
	}
	
	public static char nonRepeatChar(String str)
	{
		Character c = null;
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<str.length();i++)
		{
			c = str.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else 
				map.put(c, 1);
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet()){
			c = m.getKey();
			if(map.get(c) == 1)
				break;
		}
		return c;
	}

}
