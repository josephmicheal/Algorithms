package com.ds.stack;

public class StackCustomeTesco {

	public static void main(String args[]) throws Exception {

		Stack stack = new Stack(50);
		stack.push(25);
		stack.push(5);
		stack.pop();
		stack.push(10);
		stack.push(12);
		stack.inc(2, 2);
		stack.pop();
		stack.pop();
		stack.pop();
		
	}
}

class Stack {
	int arr[];
	int current = -1;

	public Stack(int size) {
		arr = new int[size];
	}

	public void push(int a) {
		arr[++current] = a;
		System.out.println("added "+a);
	}

	public int pop() throws Exception {
		if (size() != 0) {
			int a = arr[current--];
			System.out.println("removed "+a);
			return a;
		}
		throw new Exception("Stack is empty");
	}

	public void inc(int a, int b) throws Exception {
		if (size() >= b) {
			int items = size() - b;
			for (int i = items; i < size(); i++) {
				arr[i] = arr[i] + a;
			}
		}else throw new Exception("Stack items are less than b");
	}

	public int size() {
		if (current == -1) {
			return 0;
		} else {
			return current + 1;
		}
	}

}
