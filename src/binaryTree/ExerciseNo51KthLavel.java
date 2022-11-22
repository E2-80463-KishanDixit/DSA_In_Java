package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExerciseNo51KthLavel extends BinayTreesYT  {
	static ArrayList<Integer> result = new ArrayList<>();
	
	static void printKthLevel(Node root,int k){
		if(root==null) {
			return ;
		}
		if(k==0) {
			 result.add(root.data);
			 return ;
		}else {
			printKthLevel(root.left,k-1);
			printKthLevel(root.right,k-1);
		}	
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BuildTree tree = new BuildTree();
		
		Node root = tree.buildTree(nodes);
//		levelOrder(root);
		System.out.print("Entet the value of k   ");
		int k=s.nextInt();
		 printKthLevel(root,k);
		for(int i=0;i<result.size();i++) {
			System.out.print(result.get(i)+" ");
		}
	}

}
