package com.tried.off;

public class SubTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Node1 root1 = new Node1(26);
        root1.right = new Node1(3);
        root1.right.right = new Node1(3);
        root1.left = new Node1(10);
        root1.left.left = new Node1(4);
        root1.left.left.right = new Node1(30);
        root1.left.right = new Node1(6);
  

           
        Node1 root2 = new Node1(10);
        root2.right = new Node1(6);
        root2.left = new Node1(4);
        root2.left.right = new Node1(30);
		
        System.out.println(isSubtree(root1, root2));

	}

	
	public static boolean areIdentical(Node1 T, Node1 S) {
		
		if(T== null && S == null) return true;
		
		if(T==null || S == null) return false;
		
		if(T.data==S.data && areIdentical(T.right, S.right) && areIdentical(T.left, S.left) ) return true;
		
		return false;
	}
	
	public static boolean isSubtree(Node1 T,Node1 S) {
		
		if(T == null) return false;
		
		if(areIdentical(T, S))
			return true;
		else {
			return isSubtree(T.left, S) || isSubtree(T.right, S);
		}
	}
}
