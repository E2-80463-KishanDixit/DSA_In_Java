package hashInJava;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hasmap <K,V> {

	private class Node{
		K key;
		V value;
		Node(K key, V value){
			this.key = key;
			this.value = value;
		}
	}
	
	private int n; // No of nodes
	private int N; // No of buckets
	private LinkedList<Node> buckets[];
	
	public Hasmap(){
		n=0;
		this.N=4;
		this.buckets = new LinkedList[4];
		
		for(int i=0;i<4;i++) {
			this.buckets[i] = new LinkedList<>();
		}	
	}
	
	private int hsahFunction(K key) {
		int bi = key.hashCode();
		return Math.abs(bi)% N;
	}
	
	private int searchInLL(K key,int bi) {
		LinkedList<Node> ll = buckets[bi];
		
		for(int i=0;i<ll.size();i++) {
			if(key==ll.get(i).key) {
				return i;
			}
		}
		return -1;
	}
	
	private void rehash() {
		LinkedList<Node> oldBuckets[] = buckets;
		
		buckets = new LinkedList[N*2];
		
		for(int i =0;i<N*2;i++) {
			buckets[i] = new LinkedList<>();
		}
		
		for(int i=0;i<oldBuckets.length;i++) {
			LinkedList<Node> ll = oldBuckets[i];
			for(int j=0;j<ll.size();j++) {
				Node node = ll.get(j);
				put(node.key,node.value);
			}
		} 
	}
	
	public void put(K key, V value) {
		int bi = hsahFunction(key);
		int di = searchInLL(key,bi);
		if(di==-1) { // key does not exist
			buckets[bi].add(new Node(key,value));
			n++;
		}else {
			Node node = buckets[bi].get(di);
			node.value = value;
		}
		
		double lambda = (double)n/N;
		
		if(lambda>2.0) {
			rehash();
		}
	}
	
	public boolean containsKey(K key) {
		int bi = hsahFunction(key);
		int di = searchInLL(key,bi);
		if(di==-1) { // key does not exist
			return false;
		}else {
			return true;
		}
	}
	
	public V remove(K key) {
		int bi = hsahFunction(key);
		int di = searchInLL(key,bi);
		if(di==-1) { // key does not exist
			return null;
		}else {
			Node node = buckets[bi].remove(di);
			n--;
			return node.value;
		}
	}
	
	public V get(K key) {
		int bi = hsahFunction(key);
		int di = searchInLL(key,bi);
		if(di==-1) { // key does not exist
			return null;
		}else {
			Node node = buckets[bi].get(di);
			return node.value;
		}
	}
	
	
	public ArrayList<K> keySet(){
		ArrayList<K> keys = new ArrayList<>();
		for(int i=0;i<buckets.length;i++) {
			LinkedList<Node> ll = buckets[i];
			for(int j=0;j<ll.size();j++) {
				Node node = ll.get(j);
				keys.add(node.key);
			}
		}
		return keys;
	}
	
	public boolean isEmpty() {
		return n==0;
	}
	
	public  void printHashTable() {
		for(int i=0;i<buckets.length;i++) {
			LinkedList<Node> ll = buckets[i];
			System.out.print("Bucket->");
			for(int j=0;j<ll.size();j++) {
				System.out.print(ll.get(j).key+"->");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Hasmap<String, Integer> map = new Hasmap<>();
		map.put("India", 190);
		map.put("China", 200);
		map.put("US", 50);
		map.put("NEPAL", 50);
		map.put("ShriLanka", 50);
		map.put("mohan", 50);
		map.put("Das", 50);
		map.put("Karam", 50);
		
//		ArrayList<String> keys = map.keySet();
//		for(int i=0;i<keys.size();i++){
//			System.out.print(keys.get(i)+","+map.get(keys.get(i))+"  ");
//		}
		
		map.printHashTable();
	}

}
