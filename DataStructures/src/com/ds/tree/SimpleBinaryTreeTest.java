package com.ds.tree;

public class SimpleBinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(5);
		add(root,2);
		add(root,3);
		add(root,6);
		print(root);
		
		
	}
	
	public static void add(Node root,int value) {
		while(root != null) {
			if(root.data < value) {
				if(root.right != null) {
					root = root.right;
				}else {
					root.right= new Node(value);
					break;
				}
			}else {
				if(root.left != null) {
					root = root.left;
				}else {
					root.left= new Node(value);
					break;
				}
			}
			
		}		
	}
	
	public static void print(Node root) {
		
		while(root != null) {
			System.out.println(root.data);
			if(root.left != null) {
				print(root.left);
			}
			if(root.right != null) {   
				print(root.right);
			}
			
			if(root.right == null && root.left == null) {
				break;
			}
		}
	}
}
