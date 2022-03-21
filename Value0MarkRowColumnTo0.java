package com.tried.off;

public class Value0MarkRowColumnTo0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 0, 1, 1 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) {
					updateToZero(arr, i, arr[i].length-1);
					updateToZero(arr, arr.length-1, j);
				}
			}
		}
		print(arr);
	}

	public static void updateToZero(int arr[][], int row, int col) {

		for (int i = 0; i <= row; i++) {
			arr[i][col] = 0;
			//arr[col][i] = 0;
		}
		for (int i = 0; i <= col; i++) {
			arr[row][i] = 0;
			//arr[i][row] = 0;
		}
	}

	public static void print(int arr[][]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
