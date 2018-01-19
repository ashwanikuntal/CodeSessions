package com.hackerearth.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarsExploration {

	public static void main(String[] args) {
		String s; int count = 0;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		
		if(s.length()%3 != 0)
			System.exit(0);
		else {
			int noOfSignal = s.length()/3;
			Pattern p = Pattern.compile("SOS");
			Matcher m = p.matcher(s);
			while(m.find())
				count++;
			System.out.println(noOfSignal-count);
		}
		sc.close();
	}

}
