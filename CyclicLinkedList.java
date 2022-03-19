package com.tried.off;

public class CyclicLinkedList {

	public static void main(String[] args) {

		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(5);
		list1.add(8);
		//list1.add(9);
		//list1.add(3);
		//list1.add(4);
		Node1 middleNode = list1.getMiddleNode();
		
		//list1.add(7,middleNode);
		System.out.println(list1.isCyclic());
	}

}



