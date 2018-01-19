package com.interview.practice;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramIsPalindrome {

	public static void main(String[] args) {
		
		String inpString1, inpString2;
		boolean result;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		inpString1 = s.nextLine();
		System.out.print("Enter 2nd String : ");
		inpString2 = s.nextLine();
		
		result = anagramIsPalindrome(inpString1, inpString2);
		System.out.println(result);
		s.close();
	}
	
	public static boolean anagramIsPalindrome(String s1, String s2)
	{
		boolean finalResult = false;
		boolean isAnagram = true;
		HashMap<Character, Integer> mapS1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> mapS2 = new HashMap<Character, Integer>();
		
		for(int i=0; i<s1.length(); i++)
		{
			char c = s1.charAt(i);
			if(mapS1.containsKey(c))
				mapS1.put(c, mapS1.get(c) + 1);
			else
				mapS1.put(c,  1);
		}
		
		for(int i=0; i<s2.length(); i++)
		{
			char c = s2.charAt(i);
			if(mapS2.containsKey(c))
				mapS2.put(c, mapS2.get(c) + 1);
			else
				mapS2.put(c,  1);
		}
		
		if(s1.length() == s2.length())
		{
			for(int i=0; i<s1.length(); i++)
			{
				if(mapS1.get(s1.charAt(i))!=mapS2.get(s1.charAt(i)))
				{
					isAnagram = false;
					break;
				}
			}	
		}
		
		if(isAnagram == true)
		{
			int noOfCharWithEvenCount = 0;
			int noOfCharWithOddCount = 0;
			
			for(int i=0; i<s1.length(); i++)
			{
				char c = s1.charAt(i);
				if(mapS1.get(c) % 2 == 0)
					noOfCharWithEvenCount++;
				else
					noOfCharWithOddCount++;
			}
			
			if(s1.length()%2 == 0) 
			{ 
				if(noOfCharWithEvenCount % 2 == 0 && noOfCharWithOddCount == 0)
					finalResult = true;
			}
			else 
			{
				if(noOfCharWithEvenCount % 2 == 0 && noOfCharWithOddCount == 1)
					finalResult = true;
			}
		}
		return finalResult;
	}
}
