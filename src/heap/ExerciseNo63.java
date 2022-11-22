package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

import heap.ExerciseNo64.Pair;

import java.util.Comparator;

public class ExerciseNo63 {
	
	static class Pair{
		int val,idx;
		Pair(int val,int idx){
			this.val = val;
			this.idx = idx;
		}
	}
	
	static ArrayList<Integer> kWeakestRows(int[][]mat,int k){
		
		PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				return o1.val -o2.val;
			}
		});
		
		for(int i=0;i<mat.length;i++) {
			int count=0;
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]==1) {
					count++;
				}
			}
			pq.add(new Pair(count,i));
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		while(k>0) {
			Pair temp = pq.peek();
			ans.add(temp.idx);
			pq.poll();
			k--;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][]{{1,1,1,1,1},
			                         {1,1,0,1,1},
			                         {0,1,0,1,0},
			                         {1,1,1,0,0}};
			                                                          
        ArrayList<Integer> ans = kWeakestRows(matrix,2);	
        System.out.print(ans); 
	}
}
