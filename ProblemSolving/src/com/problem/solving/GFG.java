package com.problem.solving;
// Java program to find the closest perfect square
// taking minimum steps to reach from a number

class GFG {

	// Function to check if a number is
	// perfect square or not
	static boolean isPerfect(int N)
	{
		if ((Math.sqrt(N) - Math.floor(Math.sqrt(N))) != 0)
			return false;
		return true;
	}

	// Function to find the closest perfect square
	// taking minimum steps to reach from a number
	static void getClosestPerfectSquare(int N)
	{
		if (isPerfect(N)) {
			System.out.println(N + " "
							+ "0");
			return;
		}

		// Variables to store first perfect
		// square number
		// above and below N
		int aboveN = -1, belowN = -1;
		int n1;

		// Finding first perfect square
		// number greater than N
		n1 = N + 1;
		while (true) {
			if (isPerfect(n1)) {
				aboveN = n1;
				break;
			}
			else
				n1++;
		}

		// Finding first perfect square
		// number less than N
		n1 = N - 1;
		while (true) {
			if (isPerfect(n1)) {
				belowN = n1;
				break;
			}
			else
				n1--;
		}

		// Variables to store the differences
		int diff1 = aboveN - N;
		int diff2 = N - belowN;

		if (diff1 > diff2)
			System.out.println(belowN + " " + diff2);
		else
			System.out.println(aboveN + " " + diff1);
	}

	// Driver code
	public static void main(String args[])
	{
		int N = 1500;

		getClosestPerfectSquare(N);
	}
}
