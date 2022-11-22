package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_DFS {
	
	static class Graph{
		int v;
		ArrayList<ArrayList<Integer>> l;
		Graph(int v){
			this.v = v;
			l = new ArrayList<>();
			
			for(int i=0;i<v;i++) {
				l.add(new ArrayList());
			}
		}
		
		public void addEdges(int i,int j,boolean undir) {
			l.get(i).add(j);
			if(undir) {
				l.get(j).add(i);
			}
		}
		
		public void bfs(int source) {
			Queue<Integer> q = new LinkedList<>();
			boolean visited[] = new boolean[v];
			Arrays.fill(visited, false);
			
			q.add(source);
			visited[source]= true;
			
			while(!q.isEmpty()) {
				int f=q.poll();
				System.out.print(f+",");
				
				for(int nbr: l.get(f)) {
					if(!visited[nbr]) {
						q.add(nbr);
						visited[nbr] = true;
					}
				}
			}
		}
		
		
		//  DFS
		public void helper(int source, boolean visited[]) {
			
			System.out.print(source+" ");
			visited[source] = true;
			
			for(int nbr : l.get(source)) {
				if(!visited[nbr]) {
					helper(nbr,visited);
				}
			}
		}
		
		public void dfs(int source) {
			boolean visited[] = new boolean[v];
			Arrays.fill(visited, false);
			helper(source,visited);
		}
	}

	public static void main(String[] args) {
        Graph g = new Graph(7);
        g.addEdges(0,1, true);
        g.addEdges(1,2, true);
        g.addEdges(2,3, true);
        g.addEdges(3,5, true);
        g.addEdges(5,6, true);
        g.addEdges(4,5, true);
        g.addEdges(0,4, true);
        g.addEdges(3,4, true);
        g.bfs(1);
        System.out.println();
        g.dfs(1);
	}

}
