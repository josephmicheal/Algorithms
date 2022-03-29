package com.tried.off;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 2;
		int arr[] = { 1, 2, 3, 4,5 };

		for (int j = 1; j <= k; j++) {
			int tmp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length-1]=tmp;
		}
		for(int i: arr) System.out.print(i+" ");

	}

}
