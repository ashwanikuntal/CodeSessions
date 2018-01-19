package com.hackerearth.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockValidString {

	public static void main(String[] args) {
		
		String s; int countOne = 0, countTwo = 0, countThree = 0, countFour = 0;
		Scanner sc = new Scanner(System.in);
		
		s = sc.next();
	
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++){
			if(map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			else
				map.put(s.charAt(i), 1);
		}
		
		int num = map.get(s.charAt(0));
		
		for(Map.Entry<Character, Integer> m : map.entrySet()){	
			if(m.getValue() == num)
				countOne = countOne + 1;
			else if(m.getValue() == num-1)
				countTwo = countTwo + 1;
			else if(m.getValue() == num+1)
				countThree = countThree + 1;
			else
				countFour = countFour + 1;		
		}
		
		if(countOne !=0 && countTwo == 0 && countThree == 0 && countFour == 0)
			System.out.println("YES");
		else if(((countOne == 1 && countTwo != 0) || (countOne != 0 && countTwo == 1)) && countThree == 0 && countFour == 0)
			System.out.println("YES");
		else if(((countOne == 1 && countThree != 0) || (countOne != 0 && countThree == 1))&& countTwo == 0 && countFour == 0)
			System.out.println("YES");
        else if(countOne != 0 && countFour == 1 && countTwo == 0 && countThree == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		sc.close();

	}

}
