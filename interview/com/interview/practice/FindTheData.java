package com.interview.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindTheData {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("C:/Users/Ashwani/Desktop/myfile.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		
		System.out.println(s);
		Pattern p = Pattern.compile(s);
		Matcher m = p.matcher("/w+/,/w+/,/d");
		
		while(m.find())
			System.out.println(m.groupCount());
	
		br.close();
		fr.close();
	}

}
