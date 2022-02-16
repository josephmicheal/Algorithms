package com.problem.solving;

import java.util.HashMap;
import java.util.Map;

public class MatrixMaximumNoOfOnes {

	public static void main(String args[]) {
		int[][] array = {{0,0,1},{1,1,1}};
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i< array.length;i++) {
			for(int j=0;j< array[i].length;j++) {
				if(array[i][j]==1) {
					map.put(i, map.get(i)==null?1:map.get(i)+1);
				}
			}
		}
		
		System.out.println(map);
	}
}
