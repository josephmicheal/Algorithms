package com.tried.off;

public class ReverseNumberAsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 56789;
		String numberStr = number+"";
		
		String result="";
		for(int i=0;i<numberStr.length();i++) {
			result = numberStr.charAt(i)+result;
		}
		System.out.println(result);
		
		number = Integer.valueOf(result);
		
		int newResult = 0;
		
		while(number != 0) {
			newResult = newResult*10 + number%10;
			number = number/10;
		}
		
		System.out.println(newResult);
	}

}
