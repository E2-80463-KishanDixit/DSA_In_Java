package heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapUsingSTL {

	public static void main(String[] args) {
		int arr[] = {90,40,70,35,10,38,77};
		
		// FOR NORMAL ORDER(LOW TO HIGH ORDER)
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		// FOR HIGH TO LOW ORDER 
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());

		for(int x : arr) {
			pq.add(x);
		}
		
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.remove();
		}
	}

}
