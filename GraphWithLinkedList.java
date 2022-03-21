package com.tried.off;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphWithLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> items[] = new LinkedList[5];

		for (int i = 0; i < items.length; i++) {
			items[i] = new LinkedList<>();
		}

		addEdge(items, 0, 1);
		addEdge(items, 0, 2);
		addEdge(items, 1, 2);
		addEdge(items, 2, 0);
		addEdge(items, 2, 3);
		//addEdge(items, 3, 3);

		doBFS(items, 0);
	}

	public static void addEdge(LinkedList<Integer> items[], int u, int v) {

		items[u].add(v);
	}

	public static void doBFS(LinkedList<Integer> items[], int start) {

		Queue<Integer> queue = new LinkedList<>();

		boolean visited[] = new boolean[items.length];

		queue.add(start);
		
		visited[start] = true;

		while (queue.size() != 0) {

			int currentItem = queue.poll();
			System.out.println(" Item: " + currentItem);

			LinkedList<Integer> list = items[currentItem];
			Iterator<Integer> iter = list.iterator();
			while (iter.hasNext()) {
				int tempItem = iter.next();
				if (!visited[tempItem]) {
					queue.add(tempItem);
					visited[tempItem] = true;
				}
			}
		}

	}

}