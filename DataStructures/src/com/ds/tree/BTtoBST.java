package com.ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BTtoBST {

	public static void main(String[] args) {
		Node five = new Node(5);
		Node four = new Node(4);
		Node three = new Node(3);
		Node two = new Node(2);
		Node one = new Node(1);

		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		bfs(one);

		List<Integer> items = new ArrayList<>();
		bfsToList(one, items);
		BinaryTree tree = new BinaryTree();
		items.forEach(item -> tree.add(item));

		//quickSort(items, 0, items.size() - 1);
		mergeSort(items,0,items.size()-1);

		System.out.println(items);

		int middleVal = items.size() / 2;

		BinaryTree bst = new BinaryTree();
		bst.add(items.get(middleVal));
		IntStream.range(0, items.size()).filter(currIdx -> currIdx != middleVal)
				.forEach(indx -> bst.add(items.get(indx)));

		System.out.println(bst);

	}

	public static void bfs(Node root) {
		if (root == null)
			return;

		System.out.print(root.data + " > ");

		bfs(root.left);
		bfs(root.right);
	}

	public static void bfsToList(Node root, List<Integer> items) {
		if (root == null)
			return;

		items.add(root.data);

		bfsToList(root.left, items);
		bfsToList(root.right, items);
	}

	public static void quickSort(List<Integer> list, int start, int end) {
		if (start < end) {
			int pivot = partition(list, start, end);
			quickSort(list, start, pivot - 1);
			quickSort(list, pivot + 1, end);
		}
	}

	private static int partition(List<Integer> list, int start, int end) {

		int pivot = list.get(end);
		int i = start - 1;
		for (int j = start; j <= end; j++) {

			if (list.get(j) < pivot) {
				i++;
				swap(list, i, j);
			}
		}
		swap(list, i + 1, end);
		return i + 1;
	}

	public static void swap(List<Integer> list, int fromIdx, int endIdx) {
		int tmp = list.get(fromIdx);
		list.set(fromIdx, list.get(endIdx));
		list.set(endIdx, tmp);
	}

	public static void mergeSort(List<Integer> items, int start, int end) {

		if (start < end) {
			int middle = start + (end-start) / 2;

			mergeSort(items, start, middle);
			mergeSort(items, middle + 1, end);

			merge(items, start, middle, end);
		}
	}

	private static void merge(List<Integer> items, int start, int middle, int end) {

		int n1 = middle - start +1;
		int n2 = end - middle;

		List<Integer> firstItems = new ArrayList<>();

		for (int i = 0; i < n1; i++)
			firstItems.add(items.get(i));

		List<Integer> secondItems = new ArrayList<>();

		for (int j = middle + 1; j < n2; j++)
			secondItems.add(items.get(middle + j +1));

		int i = 0;
		int j = 0;
		int k = start;

		while (i < n1 && j < n2) {
			if (firstItems.get(i) <= secondItems.get(j)) {
				items.set(k, firstItems.get(i));
				i++;
			} else {
				items.set(k, secondItems.get(j));
				j++;
			}
			k++;
		}

		while (i < n1) {
			items.set(k, firstItems.get(i));
			i++;
			k++;
		}

		while (j < n2) {
			items.set(k, secondItems.get(j));
			j++;
			k++;
		}
	}

}
