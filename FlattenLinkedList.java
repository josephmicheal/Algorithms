package com.tried.off;

public class FlattenLinkedList {

	public static void main(String[] args) {

		LinkedList2 L = new LinkedList2();
		L.head = L.push(L.head, 30);
		L.head = L.push(L.head, 5);

		L.head.right = L.push(L.head.right, 20);
		L.head.right = L.push(L.head.right, 10);
		/*
		 * L.head.right.right = L.push(L.head.right.right, 50); L.head.right.right =
		 * L.push(L.head.right.right, 22); L.head.right.right =
		 * L.push(L.head.right.right, 19);
		 * 
		 * L.head.right.right.right = L.push(L.head.right.right.right, 45);
		 * L.head.right.right.right = L.push(L.head.right.right.right, 40);
		 * L.head.right.right.right = L.push(L.head.right.right.right, 35);
		 * L.head.right.right.right = L.push(L.head.right.right.right, 20);
		 */

		// flatten the list
		L.head = L.flatten(L.head);

		L.printList();
	}

}

class LinkedList2 {
	Node2 head;

	Node2 push(Node2 head_ref, int data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node2 new_node = new Node2(data);

		/* 3. Make next of new Node as head */
		new_node.down = head_ref;

		/* 4. Move the head to point to new Node */
		head_ref = new_node;

		/* 5. return to link it back */
		return head_ref;
	}

	public void printList() {
		// TODO Auto-generated method stub
		System.out.println();
		Node2 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
		}
		System.out.println();
	}

	public Node2 flatten(Node2 node) {
		Node2 merged = null;
		while (node != null) {

			Node2 nodeFlattened = node.right;

			if (merged == null) {
				merged = merge(node, nodeFlattened);
			} else {
				merged.down = merge(node, nodeFlattened);
			}

			node = node.right;
		}

		return merged;

	}

	private Node2 merge(Node2 node, Node2 nodeFlattened) {

		Node2 merged = null;

		while (node != null && nodeFlattened != null) {

			if (node.data < nodeFlattened.data) {
				if (merged == null) {
					merged = new Node2(node.data);
				} else {
					merged.down = new Node2(node.data);
				}
				node = node.down;
			} else {
				if (merged == null) {
					merged = new Node2(nodeFlattened.data);
				} else {
					merged.down = new Node2(nodeFlattened.data);
				}
				nodeFlattened = nodeFlattened.down;
			}
		}

		while (node != null) {
			merged.down = new Node2(node.data);
			node = node.down;
		}
		while (nodeFlattened != null) {
			merged.down = new Node2(nodeFlattened.data);
			node = nodeFlattened.down;
		}

		return merged;
	}
}

class Node2 {
	Node2 right;
	Node2 down;
	int data;

	public Node2(int data) {
		this.data = data;
	}

}
