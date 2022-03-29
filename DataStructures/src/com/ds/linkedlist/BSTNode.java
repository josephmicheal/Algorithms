package com.ds.linkedlist;

public class BSTNode {

	int data;
	BSTNode left;
	BSTNode right;
	
	public BSTNode() {
		
	}
	
	public BSTNode(int data){
		this.data = data;
	}
	
	@Override
	public String toString() {
		return data+"";
	}
	
	public void insert(BSTNode current, int data) {
		
		BSTNode pointer = null;
		BSTNode node = current;
		while(node != null) {
			pointer = node;
			if(node.data < data) {
				node = node.right;
			}else {
				node = node.left;
			}
		}
		if(node == null) {
			
		}
	}
}
