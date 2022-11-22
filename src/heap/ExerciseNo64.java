package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ExerciseNo64 {
	static class Pair{
		int val,rollNo;
		Pair(int val, int rollNo){
			this.val = val;
			this.rollNo = rollNo;
		}
	}
	
	static String[] findRelativeRanks(int scoreList[]) {
		PriorityQueue<Pair> pqRank = new PriorityQueue<>(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				return - o1.val + o2.val;
			}
		});
		
		int n = scoreList.length;
		
		for(int i=0;i<n;i++) {
			pqRank.add(new Pair(scoreList[i],i));
		}
		
		String vec[] = new String[n];
		
		int cnt=0;
		while(!pqRank.isEmpty()) {
			cnt++;
			if(cnt==1) {
				vec[pqRank.peek().rollNo]= "Gold Medal";
			}else if(cnt==2) {
				vec[pqRank.peek().rollNo]= "Silver Medal";
			}else if(cnt==3) {
				vec[pqRank.peek().rollNo]= "Bronze Medal";
			}else {
				vec[pqRank.peek().rollNo]= String.valueOf(cnt);
			}
			pqRank.poll();
		}
		return vec;
	}

	public static void main(String[] args) {
		// Smple test case1
		int score[] = {5,4,3,2,1};
		
		// Sample test case2
		//roolNo            0  1  2  3  4  5  6
		int scoreList[] = {90,40,70,35,10,38,77};
		
		String[] Ranks =findRelativeRanks(scoreList);
		for(int i=0;i<Ranks.length;i++) {
			System.out.print(Ranks[i]+",");
		}
	}
}
