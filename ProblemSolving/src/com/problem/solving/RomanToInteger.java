package com.problem.solving;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String args[]) {
		String romanNo = "CLXXV";
		Map<String, Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);

		Map<String, Integer> mapCount = new HashMap<>();

		for (Character curr : romanNo.toCharArray()) {
			mapCount.put(curr + "", mapCount.get(curr + "") == null ? 1 : mapCount.get(curr + "") + 1);
		}
		
		int finalValue = mapCount.keySet().stream()
				.mapToInt(key -> (mapCount.get(key) * map.get(key))).sum();

		System.out.println(finalValue);
	}
}
