package com.array;

public class FindPairWithSmallestDifference {

	public static void main(String[] args) {
		int itemA = 0;
		int itemB = 0;
		int arr1[] = { 1, 2, 33,44 };
		int arr2[] = { 5, 22, 9, 11,2 };
		int diff = getDiff(arr1[0], arr2[0]);

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (getDiff(arr1[i], arr2[j]) < diff) {
					itemA = arr1[i];
					itemB = arr2[j];
					diff = getDiff(arr1[i], arr2[j]);
					if(diff==0)break;
				}
			}
			if(diff==0)break;
		}
		System.out.println(itemA + " : " + itemB);
	}

	public static int getDiff(int val1, int val2) {

		if (val1 > val2)
			return val1 - val2;

		else if (val2 > val1)
			return val2 - val1;

		else
			return 0;
	}

}
