package com.interview.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputReader {
	
	public static FileReader fr = null;
	public static BufferedReader br = null;
	
	public static String readCSVtoString (String path) throws IOException {
		String str = ""; String s = "";
		fr = new FileReader(path);
		br = new BufferedReader(fr);
		str = br.readLine();
		while((str = br.readLine()) != null) {
			s = s + str;
		}
		return s;
	}

}
