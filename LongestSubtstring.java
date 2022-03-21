package com.tried.off;

import java.util.HashMap;
import java.util.Map;

public class LongestSubtstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Boolean> visited = new HashMap<>();

		String string = "GEEKSFORGABCDHIJLMN"; // EKSFORG
		int oldStartIdx = 0;
		int oldEndIdx = 0;
		int startIdx = 0;
		int endIdx = 0;

		for (int i = 0; i < string.length(); i++) {
			String curChar = String.valueOf(string.charAt(i));
			if (visited.get(curChar) == null || !visited.get(curChar)) {
				visited.put(curChar, true);
			} else if (visited.get(curChar)) {
				if ((oldEndIdx - oldStartIdx) < (endIdx - startIdx)) {
					oldStartIdx = startIdx;
					oldEndIdx = endIdx;
				}
				startIdx = i;
				visited.put(curChar, true);
			}
			endIdx = i;
		}
		if ((endIdx - startIdx) > (oldEndIdx - oldStartIdx))
			System.out.println(string.substring(startIdx, endIdx + 1));
		else
			System.out.println(string.substring(oldStartIdx, oldEndIdx + 1));
		
	}

	
	
}
