package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class ExerciseNo62 {

	static int minSetSize(int arr[]){
		
		int freq[]  = new int[10];
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		for(int x : freq) {
			if(x>0) {
				pq.add(x);
			}
		}
		int length = arr.length/2;
		int ans=0;
		int count=0;
		
		while(count <=length) {
			count +=pq.remove();
			ans++;
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {3,3,3,3,5,5,5,2,2,7};
		
		int ans = minSetSize(arr);
		System.out.print(ans);
	}

}
