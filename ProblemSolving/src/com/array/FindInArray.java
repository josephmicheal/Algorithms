package com.array;

public class FindInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][] = new int[][]{ {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
                
                findUsingBubble(mat,29);
                
	}
	

	public static void findUsingBubble(int mat[][], int x) {
		for(int i=0;i < mat.length;i++ ) {
			if(x < mat[i][mat[i].length-1]) {
				for(int j=0;j<mat[i].length;j++) {
					if(x == mat[i][j]) {
						System.out.println(i+":"+j);
					}
				}
			}			
		}
	}
}
