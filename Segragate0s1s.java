package com.tried.off;
// Java code to Segregate 0s and 1s in an array

// Importing generic libraries
import java.util.*;
import java.io.*;

class Segragate0s1s {

	// Print function outside main to print elements
	static void print(int a[])
	{

		System.out.print("Array after segregation is: ");

		// Iteration over array using array
		// class inbuilt function .length()
		for (int i = 0; i < a.length; ++i) {

			// Printing elements in array
			System.out.print(a[i] + " ");
		}
	}

	// Main driver method
	public static void main(String[] args)
	{
		// Random array taken for consideration
		int a[] = { 1, 1, 0, 0, 0, 0, 1, 1 };

		// Maintaining left pointer
		int left = 0;

		// Iteration over array using length function
		for (int i = 0; i < a.length; ++i) {

			// If zeros are present
			if (a[i] == 0) {

				// Swap the elements using
				// temporary variable
				int temp = a[left];
				a[left] = a[i];
				a[i] = temp;

				// Pre incrementing left pointer
				++left;
			}
		}

		// Calling above function to
		// print updated array
		print(a);
	}
}
