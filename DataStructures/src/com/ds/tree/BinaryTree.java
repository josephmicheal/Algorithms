package com.ds.tree;

public class BinaryTree {

	Node root;

	public void add(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return;
		} else {
			Node current = root;
			while (current != null) {
				if (data < current.data) {
					if (current.left == null) {
						current.left = newNode;
						break;
					} else {
						current = current.left;
					}
				} else {
					if (current.right == null) {
						current.right = newNode;
						break;
					} else {
						current = current.right;
					}
				}
			}
		}

	}
}
