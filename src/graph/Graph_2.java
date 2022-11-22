package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Graph_2 {
	static class Node{
		String name;
		ArrayList<String> nabrs;
		Node(String name){
			this.name = name;
			nabrs = new ArrayList<>();
		}
	}
	
	static class Graph{
		HashMap<String,Node> map ;
		
		Graph(ArrayList<String> cities){
			map = new HashMap<>();
			for(String city : cities) {
				map.put(city, new Node(city));
			}
		}
		
		public void addEdge(String x, String y, boolean unDirected) {
			map.get(x).nabrs.add(y);
			if(unDirected) {
				map.get(y).nabrs.add(x);
			}
		}
		
		public void  printAdjList() {
			for(Entry<String , Node> cityPair : map.entrySet()) {
				System.out.print(cityPair.getKey()+"---->");
				for(String nabrs : cityPair.getValue().nabrs) {
					System.out.print(nabrs+",");
				}
				System.out.println();
			}
		}
	
	}
	
	public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("London");
        cities.add("Paris");
        cities.add( "New York");

        Graph g = new Graph(cities);
        g.addEdge("Delhi", "London" , true);
        g.addEdge("New York","London", true);
        g.addEdge("Delhi","Paris" , true);
        g.addEdge("Paris","New York" , true);

        g.printAdjList();
	}
}
