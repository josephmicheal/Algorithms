package com.string;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "rertyuiyyyyyyyyyyttttt";
		Map<String,Integer> map = new HashMap<>();
		int max = 0;
		String maxChar = "";
		for(int i=0;i<word.length();i++) {
			String curr = word.charAt(i)+"";
			int count =map.get(curr)!=null?map.get(curr)+1:1;
			map.put(curr, count);
			if(count > max) {
				max = count;
				maxChar = curr;
			}
		}
		System.out.println(maxChar);
	}

}
