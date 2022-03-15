package com.string;

public class StringPermutation {

	public static void main(String[] args) {

		
		permutate("abc","");

	}
	

	public static void permutate(String s, String answer) {

		if(s.length()==0) { System.out.print(answer +" "); return;}
		
		for(int i=0;i<s.length();i++) {
			String charAt = s.charAt(i)+"";
			String leftStr = s.substring(0,i);
			String rightStr = s.substring(i+1);
			permutate(leftStr+rightStr,answer+charAt);
		}
		
	}

}
