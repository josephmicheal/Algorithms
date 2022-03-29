package com.tried.off;

public class SeconSmalltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 11, 4, 2, 8, 3 };
		int small1 = Integer.MAX_VALUE;
		int small2 = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (small1 > arr[i])
				small1 = arr[i];
			else if (small2 > arr[i]) {
				small2 = arr[i];
			}
		}

		System.out.println(small2);
	}

}
