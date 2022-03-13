package com.quicksorting;

public class Try1 {

	public static void main(String[] args) {
		int arr[]=new int[] {3,1,6,4};
		quickSort(arr,0,arr.length-1);
		print(arr);
	}
	
	public static void quickSort(int arr[],int start, int end) {
		int pivot = partition(arr,start,end);
		quickSort(arr,start,pivot-1);
		quickSort(arr,pivot+1,end);
	}

	private static int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int i = start - 1;
		for(int j=start;j < end;j++) {
			if(arr[j] <= pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,end);
		return i+1;
	}
	
	public static void swap(int arr[],int indexFrom,int indexTo) {
		int tmp = arr[indexFrom];
		arr[indexFrom] = arr[indexTo];
		arr[indexTo] =tmp;
	}
	
	public static void print(int arr[]) {
		for(int i=0;i< arr.length;i++) {
			System.out.println(arr[i]+" > ");
		}
	}

}
