package com.string;
import java.util.*;

class StringPermutationJava{

static void permute(String s,int l,int e)
{
	if (l == 0)
	{
		System.out.print(s);
		return;
	}
	
	for(int i = 0 ;i < s.length(); i++)
	{
		s = swap(s,i,e);
		permute(s,i+1,e);
		s = swap(s,i,e);
	}
	
	
}

static String swap(String str,int s,int e) {
	char firstChar = str.charAt(s);
	char secondChar = str.charAt(e);
	String left_substr = str.substring(0, s);
	String right_substr = str.substring(s + 1);
	String rest = left_substr + secondChar + right_substr;
	
	
	left_substr = rest.substring(0, e);
	right_substr = rest.substring(e + 1);
	rest = left_substr + firstChar + right_substr;
	
	return rest;
}

// Driver code
public static void main(String args[])
{
	System.out.print("\nAll possible strings are : ");
	permute("abc", 0,"abc".length());
	
	/*
	 * String str = swap("Hello",1,3); System.out.println(str);
	 */
}
}

// This code is contributed by adityapande88
