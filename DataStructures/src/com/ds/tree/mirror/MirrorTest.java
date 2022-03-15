package com.ds.tree.mirror;

public class MirrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node one = new Node(1);

		Node two = new Node(2);

		Node three = new Node(3);

		one.left = two;
		one.right = three;

		Node four = new Node(4);
		Node five = new Node(5);
		three.left = four;
		three.right = five;
		 
		print(one);
		mirror(one);
		print(one);

	}
	
	public static void print(Node root) {
		
		if(root == null) return;
		
		print(root.left);
		System.out.println(root.data);
		print(root.right);
		
	}

	public static Node mirror(Node root) {

		if (root == null)
			return null;

		Node left = mirror(root.left);
		Node right = mirror(root.right);

		root.left = right;
		root.right = left;

		return root;
	}

}
