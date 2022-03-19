package com.tried.off;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,2,7,5,9};
		
		print(arr);
		//reverseIterative(arr);
		recursiveReverse(arr,0,arr.length-1);
		print(arr);
		

	}
	
	public static void recursiveReverse(int arr[], int start, int end) {
		if(start >= end) {
			return;
		}
		
		int tmp = arr[start];
		arr[start]=arr[end];
		arr[end] = tmp;
		start++;
		end--;
		
		recursiveReverse(arr, start, end);
		
	}
	
	public static void reverseIterative(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
			int tmp = arr[start];
			arr[start]=arr[end];
			arr[end] = tmp;
			start++;
			end--;
		}
		
	}
	
	public static  void print(int arr[]) {
		for(int i: arr) {
			System.out.print(i+" > ");
		}
		System.out.println();
	}

}
