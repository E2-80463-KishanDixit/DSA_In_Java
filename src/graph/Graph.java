package graph;

import java.util.ArrayList;

public class Graph {
	int V;
	ArrayList<ArrayList<Integer>> list;
	
	Graph(int V){
		this.V = V;
		list = new ArrayList<>();
		
		for(int i=0;i<V;i++) {
			list.add(new ArrayList<>());
		}
	}
	
	public void addEdge(int i,int j,boolean undir) {
		list.get(i).add(j);
		if(undir) {
			list.get(j).add(i);
		}
	}
	
	public void printAdjList() {
		for(int i=0;i<V;i++) {
			System.out.print(i+"--->");
			for(int p : list.get(i)) {
				System.out.print(p+",");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
        Graph g = new Graph(6);
        g.addEdge(0,1, true);
        g.addEdge(0,4, true);
        g.addEdge(2,1, true);
        g.addEdge(3,4, true);
        g.addEdge(4,5, true);
        g.addEdge(2,3, true);
        g.addEdge(3,5, true);
        g.printAdjList();
	}

}
