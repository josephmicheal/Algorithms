package com.ds.tree.mirror;
// Java program to convert binary tree into its mirror

/* Class containing left and right child of current
node and key value*/
public class Node
{
	public int data;
	public Node left;
	public Node right;

	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

