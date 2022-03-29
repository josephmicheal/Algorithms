package com.tried.off;

public class MergeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 > 4
		Node1 four = new Node1(4);
		Node1 one = new Node1(1);
		one.next = four;

		// 2 > 3 > 5
		Node1 three = new Node1(3);
		Node1 two = new Node1(2);
		two.next = three;
		Node1 five = new Node1(5);
		three.next = five;

		Node1 n1 = one;
		Node1 n2 = two;
		Node1 merged = null;

		while (n1 != null && n2 != null) {
			if (n1.data < n2.data) {
				if (merged == null) {
					merged = new Node1(n1.data);
				} else {
					merged.next = new Node1(n1.data);
				}
				n1 = n1.next;
			} else {
				if (merged == null) {
					merged = new Node1(n2.data);
				} else {
					merged.next = new Node1(n2.data);
				}
				n2 = n2.next;
			}
		}
		
		while(n1 != null) {
			merged.next = new Node1(n1.data);
			n1 = n1.next;
		}
		
		while(n2 != null) {
			merged.next = new Node1(n2.data);
			n2 = n2.next;
		}
		
		System.out.println(merged);
	}

}
