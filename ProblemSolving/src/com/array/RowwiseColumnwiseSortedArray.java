package com.array;

public class RowwiseColumnwiseSortedArray {

	public static void main(String[] args) {
		int[][] mat = new int[][] { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

		int x = 35;

		String finalIndex = "";
		for (int i = 0; i < mat.length; i++) {

			int index = search(mat[i], 0, mat[i].length - 1, x);
			if (index != -1) {
				finalIndex = "[" + i + "][" + index + "]";
				break;
			}
		}

		System.out.println(x+" is in mat"+finalIndex);
		//System.out.println(search(mat[0], 0, mat[0].length - 1, x));

	}

	public static int search(int arr[], int start, int end, int x) {

		if (start < end) {
			int middle = start + (end - 1) / 2;

			if (arr[middle] == x)
				return middle;
			else if (arr[middle] > x)
				return search(arr, start, middle - 1, x);
			else
				return search(arr, middle, end, x);
		} else
			return -1;
	}
}
