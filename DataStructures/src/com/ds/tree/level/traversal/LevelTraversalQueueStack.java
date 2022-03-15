package com.ds.tree.level.traversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.ds.tree.mirror.Node;

public class LevelTraversalQueueStack {

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
		
		levelTraversal(one);
		 
	}

	public static void levelTraversal(Node node) {
		
		Queue<Node> queue = new LinkedList<>();
		Queue<Node> queuePrint = new LinkedList<>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			queuePrint.add(curr);			
			if(curr.left != null) queue.add(curr.left);			
			if(curr.right != null) queue.add(curr.right);			
		}
		
		while(!queuePrint.isEmpty()) {
			Node curr = queuePrint.poll();
			System.out.println(curr.data+" ");
		}
	}
	
public static void reverseLevelTraversal(Node node) {
		
		Queue<Node> queue = new LinkedList<>();
		Stack<Node> stack = new Stack<>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			stack.add(curr);
			
			if(curr.right != null) queue.add(curr.right);
			
			if(curr.left != null) queue.add(curr.left);
		}
		
		while(!stack.empty()) {
			Node curr = stack.pop();
			System.out.println(curr.data+" ");
		}
	}
}
