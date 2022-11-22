package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import binaryTree.BinayTreesYT.Node;

public class BuildLevelOrderTree {
    // BUILD TREE <<<<<<<<<<<<<<-------------------- LEVEL ORDER BUILD 
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	static class BuildTree{
		static Node buildTree() {
			Scanner s = new Scanner(System.in);
			Queue<Node> q = new LinkedList<>();
			System.out.print("enter root value");
			int d = s.nextInt();
			
			Node root  = new Node(d);
			q.add(root);
			while(!q.isEmpty()) {
				Node current = q.peek();
				q.poll();
				System.out.print("enter next two values");
				int c1 = s.nextInt();
				int c2 = s.nextInt();
				
				if(c1!=-1) {
					current.left = new Node(c1);
					q.add(current.left);
				}
				if(c2!=-1) {
					current.right = new Node(c2);
					q.add(current.right);
				}
			}
			return root;
		}
	}
	
	// lavel order print function 
    public static void levelOrderprint(Node root) {
    	if(root == null) {
    		return;
    	}
    	Queue<Node> q = new LinkedList<>();
    	q.add(root);
    	q.add(null);
    	while(!q.isEmpty()) {
    		Node currNode = q.remove();
    		if(currNode == null) {
    			System.out.println();
    			if(q.isEmpty()) {
    				break;
    			}else {
    				q.add(null);
    			}
    		}else {
    			System.out.print(currNode.data+" ");
    			if(currNode.left != null) {
    				q.add(currNode.left);
    			}
    			if(currNode.right!= null) {
    				q.add(currNode.right);
    			}
    		}
    	}
    }

	public static void main(String[] args) {
//	    Enter these values one by one <<<<<<<<----->>>  1,2,3,4,5,-1,6-1,-1,7,-1,-1,-1,-1,-1
		BuildTree tree = new BuildTree();
		Node root = BuildTree.buildTree();
		levelOrderprint(root);
	}
}
