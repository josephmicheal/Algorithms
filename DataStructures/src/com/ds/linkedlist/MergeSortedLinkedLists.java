package com.ds.linkedlist;

public class MergeSortedLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList llist1 = new LinkedList();
		LinkedList llist2 = new LinkedList();

		// Node head1 = new Node(5);
		llist1.add(5);
		llist1.add(10);
		llist1.add(15);

		// Node head2 = new Node(2);
		llist2.add(2);
		llist2.add(3);
		llist2.add(20);

		Node dummy = new Node(0);
		Node finalResult = dummy;

		Node h1 = llist1.head;
		Node h2 = llist2.head;
		while (true) {

			if(h1 == null) {
				dummy.right = h2;
				break;
			}
			
			if(h2 == null) {
				dummy.right = h1;
				break;
			}
			
			if(h1.data <= h2.data) {
				dummy.right = h1;
				h1 = h1.right;
			}else{
				dummy.right = h2;
				h2 = h2.right;
			}
			
			dummy = dummy.right;
		}
		
		while(finalResult != null) {
			System.out.print(finalResult.data+" ");
			finalResult = finalResult.right;
		}

	}

}
