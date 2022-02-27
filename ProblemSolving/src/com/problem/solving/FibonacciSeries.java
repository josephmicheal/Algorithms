package com.problem.solving;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {

	public static void main(String[] args) {
		fibonacciLoop(9);
	}

	static void fibonacciLoop(int n) {

		int no1 = 0;
		int no2 = 1;

		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i <= n;) {
			sum = sum + no1 + no2;
			System.out.print(no1 + " ");
			no1 = no1 + no2;
			i++;
			System.out.print(no2 + " ");
			no2 = no1 + no2;
			i++;
			map.put(i, no1);
			map.put(i, no2);
		}
		System.out.println("sum : " + sum);
		System.out.println("nth item is " + map.get(n));
	}
	
	static int fibonacciRecursion(int n) {
	 if(n<=1)
		 return n;
	 
	 return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
	}
}

class NPE extends NullPointerException{
	public NPE(String msg) {
	 super(msg);
	}
}