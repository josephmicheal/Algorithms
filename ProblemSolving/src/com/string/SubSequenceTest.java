package com.string;

public class SubSequenceTest {

	public static void main(String[] args) {

		String str2 = "Substr11";
		String str1 = "ssub1";

		System.err.println(isSubSequence(str1, str2, str1.length() - 1, str2.length() - 1));

	}

	public static boolean isSubSequence(String str1, String str2, int m, int n) {

		if (m == 0)
			return true;
		if (n == 0)
			return false;
		
		if(str1.charAt(m) == str2.charAt(n))
			return isSubSequence(str1, str2, m-1, n-1);
		
		return isSubSequence(str1, str2, m, n-1);

	}

}
