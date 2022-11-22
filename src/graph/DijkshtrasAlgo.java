package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class DijkshtrasAlgo {
	
	static class Pair implements Comparable<Pair>{
		int first;
		int second;
		Pair(int a ,int b){
			first = a;
			second = b; 
		}
		@Override
		public int compareTo(Pair o) {
			if(this.first != o.first) {
				return this.first-o.first;
			}
			return this.second - o.second;
		}
	}
	
//	static class Graph{
//		static int v;
//		static ArrayList<Pair> l[];
//		Graph(int v){
//			this.v = v;
//			l = new ArrayList[v];
//			
//			for(int i=0;i<v;i++) {
//				l[i] = new ArrayList<>();
//			}
//		}
//		
//		
//	    public static void addEdge(int i,int j,int wt,boolean undir) {
//	    l[i].add(new Pair(wt,j));
//	    if(undir) {
//	    	l[j].add(new Pair(wt,i));
//	       }
//	    }
	    
//	   static  int dijshatraAlgo() {
//	    	int []dist = new int[v];
//	    	Arrays.fill(dist, Integer.MAX_VALUE);
	    	
//	    	
//	    }
//	}


	public static void main(String[] args) {
		
	}
}
