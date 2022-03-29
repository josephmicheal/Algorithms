package com.tried.off;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCacheMap {

	static Deque<CachedObject> queue = new LinkedList<>(); 
	
	static Set<CachedObject> set = new LinkedHashSet<>();
	
	static final int SIZE = 3;
	
	public static void main(String[] args) {

		refer(new CachedObject(1,"one"));
		refer(new CachedObject(2,"two"));
		refer(new CachedObject(1,"one"));
		refer(new CachedObject(5,"five"));
		refer(new CachedObject(4,"four"));
		//refer(6);

		print();
		
		
		

		
	}
	
	public static  CachedObject refer(CachedObject i) {
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
	
	public static  CachedObject remove(CachedObject i) {
		if(set.contains(i)) {
			queue.remove(i);
			set.remove(i);		
		}
		return i;
	}
	
	public static void print() {
		
		Iterator<CachedObject> iterator = queue.descendingIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}

class CachedObject{
	public String data;
	public int id;
	public CachedObject(int id,String data) {
		this.data = data;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof CachedObject) {
			return ((CachedObject)obj).id==this.id;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "id:"+id+"  data:"+data;
	}
}