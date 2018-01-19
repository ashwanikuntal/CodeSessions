package com.interview.practice;

import java.util.Scanner;

public class amazon {

	public static void main(String[] args) {
		int n, q;
		Scanner sc = new Scanner(System.in);
	
		n = sc.nextInt();
		q = sc.nextInt();
		
		int l[] = new int[q];
		int r[] = new int[q];
		
		String substr[] = new String[q];
		
		for(int k=0; k<q; k++)
		{
			l[k] = sc.nextInt();
			r[k] = sc.nextInt();
		}
		
		for(int m=0; m<q; m++)
		{
			String Num = String.valueOf(n);
			substr[m] = Num.substring(l[m]-1, r[m]);
		}
		
		for(int m=0; m<q; m++)
		{
			if(Integer.parseInt(substr[m])%7 == 0)
			{
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
