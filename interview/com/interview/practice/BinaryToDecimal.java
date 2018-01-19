package com.interview.practice;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		String binaryStr; int decimalNum = 0;
		Scanner sc = new Scanner(System.in);
		
		binaryStr = sc.next();
		int count = 0;
		for(int i=(binaryStr.length()-1); i>=0; i--) 
		{
			decimalNum = (int) (decimalNum + Integer.parseInt(String.valueOf(binaryStr.charAt(i))) * Math.pow(2, count));
			count ++;
		}
		
		System.out.println(decimalNum);
		sc.close();

	}

}
