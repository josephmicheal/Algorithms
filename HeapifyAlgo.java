package com.tried.off;

public class HeapifyAlgo {

	public static void main(String[] args) {
		/*
		heapify(array)
		   Root = array[0]
		   Largest = largest( array[0] , array [2 * 0 + 1]. array[2 * 0 + 2])
		   if(Root != Largest)
		       Swap(Root, Largest)
		 */

		
		 int arr[] = { 6,5,10,2,4,3,15 };
		 //deleteItem(arr, arr.length);
		 //heapify(arr, arr.length-1, 0);	
		 sort(arr);
		 for(int a:arr) System.out.print(a+" ");
		 
	}
	
	public static void deleteItem(int arr[],int length) {
		arr[0] = arr[length-1];
		heapify(arr, length-1, 0);		
	}
	
	public static void heapify(int arr[],int length,int largestIndex) {
		
		int i = largestIndex;
		
		int leftIdex = 2 * i + 1;
		int rightIdex = 2 * i + 2;
		
		if(leftIdex < length && arr[leftIdex] > arr[largestIndex])
			largestIndex = leftIdex;
		
		if(rightIdex < length && arr[rightIdex] > arr[largestIndex])
			largestIndex = rightIdex;
		
		if(i != largestIndex) {
			int tmp = arr[i];
			arr[i]=arr[largestIndex];
			arr[largestIndex]=tmp;
			
			heapify(arr, length, largestIndex);
		}
	}
	
	public static void sort(int arr[])
    {
        int n = arr.length;

 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

}
