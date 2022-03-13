package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {

	public static void main(String[] args) {

		int n = 10;
		int queries[][] = new int[][] { { 1, 5, 3 }, { 4, 8, 7 }, { 6, 9, 1 } };
		
	
		int arr[] = new int[10];

		for (int i = 0; i < queries.length; i++) {
			int start = queries[i][0];
			int end = queries[i][1];
			int value = queries[i][2];
			
			for(int j=start;j<end;j++) {
				arr[j]=arr[j]+value;
			}

		}
		
		int value=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > value)
				value = arr[i];
		}
		
		System.out.println(value);

	}

}
