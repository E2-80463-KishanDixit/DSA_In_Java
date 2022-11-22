package binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BST {

	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	// TO BUILD TREE
	public static Node insert(Node root, int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(root.data>val) {
			 root.left = insert(root.left,val);
		}else {
			root.right = insert(root.right,val);
		}
		return root;
	}
	
	// TO SEARCH NODE IN THE TREE
	static boolean search(Node root,int val) {
		if(root==null) {
			return false;
		}
		if(root.data == val) {
			return true;
		}
		if(root.data > val) {
			return search(root.left,val);
		}else {
			return search(root.right,val);
		}
	}
	
     // TO DELETE A NODE FORM THE TREE
	static Node inOrderSuccessor(Node root) {
		while(root.left!= null) {
			root = root.left;
		}
		return root;
	}
	static Node delete(Node root,int val) {
		if(root.data >val) {
			root.left = delete(root.left,val);
		}else if(root.data < val) {
			root.right = delete(root.right,val);
		}else {
			if(root.left == null && root.right == null) {
				return null;
			}
			
			if(root.left == null) {
				return root.right ;
			}else if(root.right==null) {
				return root.left;
			}
			
			Node IS = inOrderSuccessor(root.right);
			root.data = IS.data;
			root.right=delete(root.right,IS.data);
		}
		return root;	
	}
	
	// TO PRINT THE TREE
	static void inOrder(Node root) {
		if(root == null) {
			return ;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	// PRINT IN RANGE 
	static void printRange(Node root,int x,int y) {
		if(root==null) {
			return;
		}
		if(root.data >= x && root.data <= y) {
			printRange(root.left,x,y);
			System.out.print(root.data+" ");
			printRange(root.right,x,y);
		}else if(root.data < x) {
			printRange(root.right,x,y);
		}else if(root.data > y) {
			printRange(root.left,x,y);
		}
	}
	
	// PRINT ALL PATH ROOT TO LEAF
	
	static void printPath(ArrayList<Integer> path ) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+"->");
		}
		System.out.println();
	}
	static void printAllPath(Node root,ArrayList<Integer> path) {
		if(root== null) {
			return;
		}
		path.add(root.data);
		
		if(root.left==null && root.right == null) {
			printPath(path);
		}else {
			printAllPath(root.left,path);
			printAllPath(root.right,path);
		}
		path.remove(path.size()-1);
	}
	
	//  BUILD A MIRROR TREEE
	static void mirrorTree(Node root) {
		if(root==null) {
			return ;
		}else {
		    mirrorTree(root.left);
			mirrorTree(root.right);
			
			Node temp = root.left;
			root.left = root.right;
			root.right = temp;
		}	
	}
	
	public static void main(String[] args) {
//		int values[] = {5,1,3,4,2,7};
		// TEST CASE 2
//		int values[] = {8,5,3,1,4,6,10,11,14};
		// test case 3 
//		int values[] = {3,1,5,2,4};
//		int values[] = { 30, 10, 60, 20, 40};
		int  values [] = {40,20,60,10,30};
		Node root = null;
		for(int i=0;i<values.length;i++) {
			root = insert(root,values[i]);
		}
		
		inOrder(root);
		
		//1. TO delete
//		System.out.println();
//		delete(root,5);
//		inOrder(root);
		
		//2. TO search
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a Key Value to Serach");
//		int key = s.nextInt();
//		boolean  isPresent = search(root,key);
//		if(isPresent) {
//			System.out.print("Found");
//		}else {
//			System.out.print("Not Found");
//		}
		
		//3. TO print in range 
//		printRange(root,6,10);
		
		//4. TO print all possible path from root to leaf
//		ArrayList<Integer> path = new ArrayList<>();
//		printAllPath(root,path);
		
		//5. TO convert tree in a miroor tree
		mirrorTree(root);
		System.out.println();
		inOrder(root);
	}
}
