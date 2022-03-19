package com.tried.off;

public class MiddleLinkedList {

	public static void main(String[] args) {

		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(5);
		list1.add(8);
		list1.add(9);

		list1.sort();

		LinkedList list2 = new LinkedList();
		list2.add(2);
		list2.add(6);
		list2.add(11);
		list2.add(13);

		list2.sort();

		Node1 current1 = list1.head;
		Node1 current2 = list2.head;

		LinkedList list3 = new LinkedList();
		while (current1 != null && current2 != null) {
			if (current1.data < current2.data) {
				list3.add(current1.data);
				current1 = current1.next;
			} else {
				list3.add(current2.data);
				current2 = current2.next;
			}
		}

		while (current1 != null) {
			list3.add(current1.data);
			current1 = current1.next;
		}

		while (current2 != null) {
			list3.add(current2.data);
			current2 = current2.next;
		}

		list3.print();

	}

}

