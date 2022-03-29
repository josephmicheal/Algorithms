package com.ds.linkedlist;
public class LinkedList {

	Node head;
	Node tail;

	public void add(int data) {
		Node node = new Node(data);
		tail = node;
		if(head==null) { 
			head = node;
			return;
		}
		Node current = head;
		while (current.right != null) {
			current = current.right;
		}
		current.right = node;
		
	}

	public int getLength() {
		Node current = head;
		int count = 0;
		while (current.right != null) {
			current = current.right;
			count++;
		}
		return count+1;
	}
	
	public void print() {
		Node current = head;
		while (current.right != null) {
			System.out.print(current+" > ");
			current = current.right;	
		}
		System.out.print(current);
	}
	
	public void rotateList(int times) {
		//https://www.geeksforgeeks.org/clockwise-rotation-of-linked-list/
		int length = this.getLength();
		int kTimes = times;
		if(kTimes > length) {
			kTimes = kTimes%length;
		}
		
		if(kTimes == 0 || kTimes==length)
			return;
		
		int counter = 1;

		Node current = head;
		while(counter < kTimes && current != null) {
			counter++;
			current = current.right; // 3
		}
		
		//1 > 2 > 3 > 4
		
		Node kthNode = current.right; //2
		
		Node lastNode = getLastNode();//4
		lastNode.right = head;//4 > 1
		head  = kthNode;// 3 > 4 > 1 > 2
		current = null;
		int i = 0;

	}
	
	public Node getLastNode() {
		if(head.right==null) return head;
		Node current = head.right;
		while(current != null) {
			if(current.right==null) return current;
			current = current.right;
		}
		return head;		
	}
}