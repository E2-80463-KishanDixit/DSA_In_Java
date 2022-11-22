package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalOrder {

	static class Graph{
		static int v;
		static ArrayList<Integer>[] list;
		Graph(int v){
			this.v = v;
			list = new ArrayList[v];
			
			for(int i=0;i<v;i++) {
				list[i] = new ArrayList();
			}
		}
		
		public static void addEdge(int i,int j) {
			list[i].add(j);
		}
		
		public static void topologicalSortBFS() {
			int inDegree[] = new int[v];
			
			for(int i=0;i<v;i++) {
				for(int nbr : list[i]) {
					inDegree[nbr]++;
				}
			}
			
			Queue<Integer> q = new LinkedList<>();
			
			for(int i=0;i<v;i++) {
				if(inDegree[i]==0) {
					q.add(i);
				}
			}
			
			while(!q.isEmpty()) {
				int f = q.poll();
				System.out.print(f+" ");
				
				for(int nbr : list[f]) {
					inDegree[nbr]--;
					if(inDegree[nbr]==0) {
						q.add(nbr);
					}
				}
			}
		}
		
		//<<<<<<<<<<<<----------------------- not implimented properly--WRONG----------------->>>>>>>>>>>>>>>>>>>>> 
		public static void helper(Stack <Integer> stack,boolean visited[],int s) {
				for(int f : list[s]) {
					if(!visited[f]) {
						visited[f] = true;
						stack.add(f);
						helper(stack, visited, f);
					}
				}
		 }
		
		public static void topologicalSortDFS() {
			Stack<Integer> stck = new Stack<>();
			boolean visited[] = new boolean[v];
			Arrays.fill(visited, false);
			
			helper(stck,visited,0);
			
			while(!stck.isEmpty()) {
				System.out.print(stck.pop()+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Graph g = new Graph(6);
//		g.addEdge(0, 2);
//		g.addEdge(2, 3);
//		g.addEdge(3, 5);
//		g.addEdge(4, 5);
//		g.addEdge(1, 4);
//		g.addEdge(1, 2);
		
//		g.topologicalSortBFS();
		// <<<<<<<<<<<--------------------TEST CASE FOR DFS ------------->>>>>>>>>>>>>>>>>>>>>>
		
		g.addEdge(0, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 5);
		g.addEdge(4, 5);
		g.addEdge(1, 4);
		g.addEdge(1, 2);
		
		g.topologicalSortDFS();
	  }
}
