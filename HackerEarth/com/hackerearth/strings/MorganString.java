package com.hackerearth.strings;

import java.util.Scanner;
import java.util.Stack;

public class MorganString {

	public static void main(String[] args) {
		
		int num;
        
		//ArrayList<Character> list = new ArrayList<Character>();
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        String str[] = new String[num*2];
        
        for(int i=0; i<num*2; i++){
               str[i] = sc.next();
        }
        
        @SuppressWarnings("unchecked")
		Stack<Character> st[] = new Stack[num*2];
        
        for(int i=0; i<num*2; i++){
               for(int j=0; j<str[i].length(); j++)
                     st[i].push(str[i].charAt(j));   
        }
        
        for(Stack<?> s : st)
        	System.out.println(s);
        sc.close();
	}

}
