package com.tried.off;

public class SwapTwoNumbers {

	public static void main(String args[]) {
		int i=10;
		int j=20;
		
		
		i=j+i;
		j=i-j;
		i=i-j;
		
		System.out.println(i+":"+j);
	}
}
