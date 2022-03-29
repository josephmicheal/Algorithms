package com.tried.off;
import java.util.HashSet;
import java.util.Set;

public class NumberKfindTwoNumbersAddToK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5};
		int start=0;
		int end =arr.length-1;
		int sum = 6;
		
		usingSet(arr, start, end, sum);
	}

	private static void usingTwoPointers(int[] arr, int start, int end, int sum) {
		while(start < end) {
			if(arr[start]+arr[end] == sum) break;
			else if (arr[start]+arr[end] < sum) start++;
			else end--;
		}
		
		System.out.println(arr[start]+":"+arr[end]);
	}
	
	private static void usingSet(int[] arr, int start, int end, int sum) {
		
		Set<Integer> set = new HashSet<>();
		for(int i=0;i< arr.length;i++) {
			if(set.contains(sum-arr[i])) {
				System.out.println(arr[i]+":"+(sum-arr[i]));
				break;
			}else {
				set.add(arr[i]);
			}
		}
		
	}

}
