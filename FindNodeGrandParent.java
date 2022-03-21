package com.tried.off;

import java.util.LinkedList;
import java.util.Queue;

public class FindNodeGrandParent {

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
		
		Queue<Node1> queue = new LinkedList<>();
		findParent(node1, 55,queue);
		
		queue.iterator().forEachRemaining(node -> {
			System.out.print(node.data+" > ");
		});
	}
	
	public static boolean findParent(Node1 root,int data,Queue<Node1> queue) {
		
		if(root == null) 	return false;
		
		if(root.data==data) { queue.add(root);return true;}
		
		if(findParent(root.left,data,queue) || findParent(root.right,data,queue)) {
			queue.add(root);
			return true;
		}
		
		return false;
	}

}
