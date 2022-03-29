package com.tried.off;

import java.util.Queue;
import java.util.Stack;

public class PrintLevelOrderTravesal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node1 node5 = new Node1(5);
		Node1 node4 = new Node1(4);
		Node1 node3 = new Node1(3);
		node3.left = node4;
		node3.right = node5;
		Node1 node2 = new Node1(2);
		node2.left = node3;
		Node1 node6 = new Node1(6);
		Node1 node1 = new Node1(1);
		node1.left = node2;
		node1.right = node6;
		Stack<Node1> stack = new Stack<>();
		leverlOrderTraversal(stack,node1);
		System.out.println();
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().data+ " > ");
		}

		test(null);
	}

	public static void leverlOrderTraversal(Stack<Node1> stack,Node1 root) {

		Queue<Node1> queue = new java.util.LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node1 curr = queue.poll();
			stack.add(curr);
			System.out.print(curr.data+ " > ");
			if (curr.left != null)
				queue.add(curr.left);
			if (curr.right != null)
				queue.add(curr.right);
		}
	}
	
	
	public static void test(String str) {
		System.out.println("string");
	}
	public static void test(Object str) {
		System.out.println("object");
	}
}
