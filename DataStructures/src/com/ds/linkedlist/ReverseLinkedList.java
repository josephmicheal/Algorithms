package com.ds.linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		reverseLinkedList(list);
		
		Node current = list.head;
		while(current != null) {
			System.out.print(current.data +" > ");
			current = current.right;
		}
	}
	
	public static void reverseLinkedList(LinkedList list) {
		Node current = list.head;
		Node prev = null;
		while(current != null) {
			Node next = current.right;
			current.right = prev;
			prev = current;
			current = next;
		}
		list.head = prev;
	}

}
