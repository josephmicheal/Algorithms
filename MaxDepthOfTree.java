package com.tried.off;

public class MaxDepthOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node1 one = new Node1(1);
		Node1 two = new Node1(2);
		Node1 three = new Node1(3);

		three.left = two;
		two.left = one;
		one.left = new Node1(0); // 3 > 2 > 1 > 0

		Node1 four = new Node1(4);
		Node1 five = new Node1(5);
		Node1 six = new Node1(6);

		three.right = five;
		five.left = four;
		five.right = six;

		System.out.println(height(three));
	}

	public static int height(Node1 node) {
		if (node == null)
			return -1;

		int leftHeight = height(node.left);
		int rightHeight = height(node.right);

		return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
	}

}
