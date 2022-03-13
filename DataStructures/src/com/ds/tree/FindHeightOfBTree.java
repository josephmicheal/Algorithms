package com.ds.tree;

public class FindHeightOfBTree {

	public static void main(String[] args) {
		Node six = new Node(6);
		
		Node five = new Node(5);
		Node four = new Node(4);
		Node three = new Node(3);
		Node two = new Node(2);
		Node one = new Node(1);

		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;

		
		//five.left = six;
		
		System.out.println(isBalanced(one));

	}

	public static int height(Node node) {

		if (node == null)
			return 0;

		int lh = height(node.left);
		int rh = height(node.right);

		return Math.max(lh, rh) + 1;

	}
	
	public static boolean isBalanced(Node node) {
		
		if(node == null)
			return true;
		
		int lh = height(node.left);
		int rh = height(node.right);
		
		if( (lh - rh) > 1) return false;
		else return true;
		
		//return isBalanced(node.left) && isBalanced(node.right);
		
	}
}
