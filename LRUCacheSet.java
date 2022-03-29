package com.tried.off;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCacheSet {

	static Deque<Integer> queue = new LinkedList<>(); 
	
	static Set<Integer> set = new LinkedHashSet<>();
	
	static final int SIZE = 3;
	
	public static void main(String[] args) {

		refer(1);
		refer(2);
		refer(1);
		refer(5);
		refer(4);
		//refer(6);

		print();
		
		
		

		
	}
	
	public static  int refer(int i) {
		if(set.contains(i)) {
			queue.remove(i);		
		}else if(SIZE==set.size()){
			set.remove(queue.removeFirst());
			set.add(i);
		}else {
			set.add(i);
		}
		queue.add(i);	
		return i;
	}
	
	public static  int remove(int i) {
		if(set.contains(i)) {
			queue.remove(i);
			set.remove(i);		
		}
		return i;
	}
	
	public static void print() {
		
		Iterator<Integer> iterator = queue.descendingIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
	}

}