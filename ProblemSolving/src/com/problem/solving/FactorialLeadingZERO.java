package com.problem.solving;

public class FactorialLeadingZERO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100;

		int count = 0;
		for (int i = 5; n / i >= 1; i = i * 5) {
			count = count + n / i;
		}

		System.out.println(count);
	}

}
