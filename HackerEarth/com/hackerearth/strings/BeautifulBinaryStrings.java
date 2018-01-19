package com.hackerearth.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeautifulBinaryStrings {

	public static void main(String[] args) {
		
		int n, count = 0; String str; 
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		str = sc.next().substring(0, n);
		
		Pattern p = Pattern.compile("010");
		Matcher m = p.matcher(str);
		
		while(m.find())
			count++;
		
		System.out.println(count);
		sc.close();

	}

}
