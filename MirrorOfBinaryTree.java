package com.tried.off;

public class MirrorOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node1 node6 = new Node1(6);
		Node1 node5 = new Node1(5);
		
		Node1 node4 = new Node1(4);
		Node1 node3 = new Node1(3);
		
		node3.left = node4;
		node3.right = node5;
		Node1 node2 = new Node1(2);
		node2.left = node3;
		
		Node1 node1 = new Node1(1);
		node1.left = node2;
		node1.right = node6;
		
		printTree(node1);
		mirrorTree(node1);
		System.out.println();
		printTree(node1);
		
	}
	
	public static Node1 mirrorTree(Node1 root) {
		
		if(root==null) return null;
		
		Node1 left = mirrorTree(root.left);
		Node1 right = mirrorTree(root.right);
		
		root.left = right;
		root.right = left;
		
		return root;
	}
	
	public static void printTree(Node1 root) {
		if(root != null) {
			
			System.out.print(root.data+" > ");
			
			printTree(root.left);
			printTree(root.right);
		}		
	}

}
