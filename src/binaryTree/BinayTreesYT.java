package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

import binaryTree.BuildLevelOrderTree.Node;

public class BinayTreesYT {
	    static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
    static class BuildTree{
    	static int idx = -1;
    	static Node buildTree(int nodes[]) {
    		idx++;
    		if(nodes[idx]==-1) {
    			return null;
    		}
    	 Node newNode = new Node(nodes[idx]);
    		newNode.left = buildTree(nodes);
    		newNode.right= buildTree(nodes);
    		return newNode;
    	}
    }
    
    // DEPTH FIRST SEARCH<<<<<<<<------------- USING TRAVERSAL
    public static void preorder(Node root) {
    	if(root == null) {
//    		System.out.print("-1 ");
    		return;
    	}
    	System.out.print(root.data+" ");
    	preorder(root.left);
    	preorder(root.right);
    }
    
    public static void inorder(Node root) {
    	if(root == null) {
//    		System.out.print("-1 ");
    		return;
    	}
    	inorder(root.left);
    	System.out.print(root.data+" ");
    	inorder(root.right);
    }
    
    public static void postorder(Node root) {
    	if(root == null) {
//    		System.out.print("-1 ");
    		return;
    	}
    	postorder(root.left);
    	postorder(root.right);
    	System.out.print(root.data+" ");
    }
    
    // BRIDTH FIRST SEARCH<<<<<<---------- ITERATION
    public static void levelOrder(Node root) {
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
    
    
    // HEIGHT OF THE TREE
    static int height(Node root) {
    	if(root == null) {
    		return 0;
    	}
    	int h1 = height(root.left);
    	int h2 = height(root.right);
    	return 1+Math.max(h1, h2);
    }
    
    public static int countOfNodes(Node root) {
    	if(root==null) {
    		return 0;
    	}
    	int leftCount = countOfNodes(root.left);
    	int rightCount = countOfNodes(root.right);
    	return leftCount+ rightCount+1;
    }
    
    static int sumOfNodes(Node root) {
    	if(root==null) {
    		return 0;
    	}
    	int leftSum = sumOfNodes(root.left);
    	int rightSum = sumOfNodes(root.right);
    	return leftSum+ rightSum+ root.data;
    }
    
    // this approch complexity is O(n2)
   static int maxDiameterOfTree(Node root) {
	   if(root==null) {
		   return 0;
	   }
	   
	   int diam1 = maxDiameterOfTree(root.left);
	   int diam2 = maxDiameterOfTree(root.right);
	   int diam3 = height(root.left)+height(root.right)+1;
	   return Math.max(diam3,Math.max(diam1, diam2));
   }
    
   
   // Diameter code with O(n) Complexity
   static class TreeInfo{
	   int height;
	   int diam;
	  TreeInfo(int height,int diam){
		   this.height = height;
		   this.diam = diam;
	   }
   }
   
   static TreeInfo maxDiameterOfTree2(Node root) {
	   
	   if(root==null) {
		   return  new TreeInfo(0,0);
	   }
	   
	   TreeInfo left = maxDiameterOfTree2(root.left);
	   TreeInfo right = maxDiameterOfTree2(root.right); 
	   
	   int myHeight = Math.max(left.height, right.height)+1;
	   
	   int diam1 = left.diam;
	   int diam2 = right.diam;
	   int diam3 = left.height+right.height+1;
	   
	   int myDiam = Math.max(Math.max(diam1, diam2), diam3);
	   
	   TreeInfo myInfo = new TreeInfo(myHeight,myDiam);
	   return myInfo;
   }
   
   public static int minDepth(Node root) {
	   if(root==null) {
		   return 1;
	   }
	   int h1 = minDepth(root.left);
	   int h2 = minDepth(root.right);
	   return Math.min(h1,h2)+1;
   }
	public static void main(String[] args) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//		int nodes[] = {2,7,-1,9,11,-1,-1,4,-1,-1,5,-1,1,-1,-1};
		BuildTree tree = new BuildTree();
		
		Node root = tree.buildTree(nodes);
//		System.out.print(root.data);
		
		preorder(root);
//		inorder(root);
//		postorder(root);
//		levelOrder(root);
		
//		int height = height(root);
//		System.out.println("Height if tree is  "+height);
//		
//		int nodeCount = countOfNodes(root);
//		System.out.println("count of nodes  "+nodeCount);
//		
//		int nodeSum  = sumOfNodes(root);
//		System.out.println("Sum of all Nodes is  "+nodeSum);
//		
//		int maxDiameter = maxDiameterOfTree(root);
//		System.out.println("Max Diameter of Tree   "+ maxDiameter);
//		
//		TreeInfo maxDiameter2 = maxDiameterOfTree2(root);
//		System.out.println("Max Diameter of Tree   "+ maxDiameter2.diam);
		
		int mindepth = minDepth(root);
		System.out.println("Min depth of Tree  "+mindepth);
	}
}
