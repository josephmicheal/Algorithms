package com.tried.off;

public class PolindtromCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "hioiih";

		//System.out.println(isPolindrome(string, 0, string.length()-1));
		
		System.out.println(isPolindrome(string));
	}

	public static  boolean isPolindrome(String string,int start,int end) {
		
		if(start==end) return true;
		
		if(string.charAt(start)!=string.charAt(end)) return false;
		
		if(start < end +1 ) {
			return isPolindrome(string,++start,--end);
		}
		
		return true;
	}
	
public static  boolean isPolindrome(String string) {
		
	    int end = string.length()-1;
	    for(int i=0;i<string.length()/2;i++) {
	    	if(string.charAt(i)!=string.charAt(end--)) return false;
	    }

		return true;
	}
}
