package com.interview.practice;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class KthMostFrequentEntries {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		File file = new File("C:/Users/Ashwani/Desktop/Coding Interview Questions.txt");
		
		try {
			FileInputStream f = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = br.readLine();
			while(s != null)
			{
				sb.append(s);
				sb.append(System.lineSeparator());
				s = br.readLine();
			}
			String everything = sb.toString();
			String st[] = everything.split(" ");
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for(int i=0; i<st.length; i++){
				if(map.containsKey(st[i]))
					map.put(st[i], map.get(st[i])+1);
				else
					map.put(st[i], 1);		
			}
			for(Map.Entry<String, Integer> m : map.entrySet()){
					System.out.println(m.getKey() + " : " + m.getValue());
			}
			br.close();
			f.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
