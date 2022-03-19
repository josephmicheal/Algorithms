package com.tried.off;
import java.util.HashSet;
import java.util.Set;

public class LinkedList {

	Node1 head;

	public void add(int data) {
		Node1 newNode = new Node1(data);
		if (head == null)
			head = newNode;
		else {
			Node1 current = head;
			while (current.next != null)
				current = current.next;

			current.next = newNode;
		}
	}
	public void add(int data,Node1 next) {
		Node1 newNode = new Node1(data);
		if (head == null)
			head = newNode;
		else {
			Node1 current = head;
			while (current.next != null)
				current = current.next;

			current.next = newNode;
		}
		newNode.next = next;
	}
	public Node1 getMiddleNode() {
		int count = 0;
		Node1 current = head;
		while (current.next != null) {
			count++;
			current = current.next;
		}
		current = head;
		count = count / 2;
		while (count > 0) {
			count--;
			current = current.next;
		}
		return current;
	}
	
	public int findMiddle() {
		int count = 0;
		Node1 current = head;
		while (current.next != null) {
			count++;
			current = current.next;
		}
		current = head;
		count = count / 2;
		while (count > 0) {
			count--;
			current = current.next;
		}
		return current.data;
	}

	public void sort() {
		Node1 current = head;

		while (current != null) {
			Node1 index = current;

			while (index.next != null) {
				Node1 tmp = index.next;
				if (index.data > tmp.data) {
					int tmpData = index.data;
					index.data = tmp.data;
					tmp.data = tmpData;
				}
				index = index.next;
			}
			current = current.next;
		}
	}

	public void print() {
		Node1 current = head;
		while (current != null) {
			System.out.print(current.data + " > ");
			current = current.next;
		}
	}
	
	public boolean isCyclic() {
		Node1 current = head;
		Set<Integer> items = new HashSet<>();
		while(current != null) {
			if(!items.add(current.data)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
}