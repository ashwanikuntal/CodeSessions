package com.interview.practice;

import java.io.BufferedReader;
import java.io.FileReader;

public class FindZerothIndex {

	static int count;
	public static void main(String[] args) {
		
		try {
			FileReader file = new FileReader("D:/myfile.txt");
			BufferedReader br = new BufferedReader(file);
			String str = br.readLine();
			
			int index = findTheZeroData(str, 0, str.length()-1);
			if(str.charAt(index) == '0')
				System.out.println("The first zeroth index is : " + index);
			
			System.out.println(count);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static int findTheZeroData(String str, int startIndex, int endIndex) {
		int start = startIndex;
		int end = endIndex;
		int firstZerothIndex = 0;
		while(start <= end) {
			if(end-start == 0) 
				break;
			else {
				count++;
				int mid = start + ((end - start)/2);
				if(str.charAt(mid) == '0') {
					end = mid - 1;
					firstZerothIndex = mid;
				}	
				if(str.charAt(mid) == '1')
					start = mid + 1;
			}
		}
		return firstZerothIndex;
	}
}
