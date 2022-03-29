package com.tried.off;

public class ReverseNumberSumThenLinkedList {

	public static void main(String[] args) {

		int no1 = 321;
		int no2 = 987;
		
		String no11 = no1+"";
		String no22 = no2+"";
		
		String no111="";
		String no222="";
		
		for(int i=0;i< no11.length();i++) {
			no111 = no11.charAt(i)+no111;
		}
		
		for(int i=0;i< no22.length();i++) {
			no222 = no22.charAt(i)+no222;
		}
		
		String sum = 	Integer.valueOf(no111)+Integer.valueOf(no222)+"";
		
		LinkedList list = new LinkedList();
		for(int i=0;i< sum.length();i++) {
			list.add(Integer.parseInt(sum.charAt(i)+""));
		}
			
		list.print();
	}

}
