package com.tried.off;

public class IslandCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { { 1, 0, 0, 0, 1 }, 
						{ 1, 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0, 1 }, 
						{ 1, 0, 0, 0, 1 } };

		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					mark(arr, i, j);
					total++;
				}
			}
		}

		System.out.println(total);
	}

	public static void mark(int arr[][], int x, int y) {
		arr[x][y] = 2;
		if (x < arr.length - 1)
			arr[x + 1][y] = 2;
		if (x > 0)
			arr[x - 1][y] = 2;
		if (y < arr.length - 1)
			arr[x][y + 1] = 2;
		if (y > 0)
			arr[x][y - 1] = 2;
	}

}
