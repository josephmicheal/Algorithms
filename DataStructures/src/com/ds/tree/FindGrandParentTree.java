package com.ds.tree;

import com.ds.tree.mirror.Node;

public class FindGrandParentTree {

	public static void main(String[] args) {


		Node one = new Node(1);

		Node two = new Node(2);

		Node three = new Node(3);

		one.left = two;
		one.right = three;

		Node four = new Node(4);
		Node five = new Node(5);
		three.left = four;
		three.right = five;
		
		

		printAncestor(one,5);
		
	}
	
	public static boolean printAncestor(Node node, int x) {
		
		if(node == null ) return false;
		
		if(node.data == x) return true;
		
		if(printAncestor(node.left,x)||printAncestor(node.right,x)) {
			System.out.println(node.data);
			return true;
		}else {
			return false;
		}
		
		
	}
	
}
