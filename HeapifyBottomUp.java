package com.tried.off;

public class HeapifyBottomUp {

	// Driver Code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Java program to insert new element to Heap
		
		// Driver Code

		
		int arr[] = { 10, 5, 3, 2, 4 };

		
		// Array representation of Max-Heap
		// 10
		// / \
		// 5 3
		// / \
		// 2 4
		
		int n = 5;

		int key = 15;

		insertNode(arr, n, key);

		printArray(arr, n);
		// Final Heap will be:
		// 15
		// / \
		// 5	 10
		// / \ /
		// 2 4 3

		
		
	}
	


	// Function to heapify ith node in a Heap
	// of size n following a Bottom-up approach
	static void heapify(int arr[], int n, int i)
	{
		// Find parent
		int parent = (i - 1) / 2;

		if (arr[parent] > 0) {
			// For Max-Heap
			// If current node is greater than its parent
			// Swap both of them and call heapify again
			// for the parent
			if (arr[i] > arr[parent]) {
				int tmp = arr[i];
				arr[i]=arr[parent];
				arr[parent]=tmp;

				// Recursively heapify the parent node
				heapify(arr, n, parent);
			}
		}
	}

	// Function to insert a new node to the Heap
	static void insertNode(int arr[], int n, int Key)
	{
		// Increase the size of Heap by 1
		n = n + 1;

		// Insert the element at end of Heap
		arr[n - 1] = Key;

		// Heapify the new node following a
		// Bottom-up approach
		heapify(arr, n, n - 1);
	}

	// A utility function to print array of size n
	static void printArray(int arr[], int n)
	{
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}


}
