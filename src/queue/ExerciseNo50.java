package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExerciseNo50 {
	public static Queue<Integer>  interLeave(Queue<Integer> q){
		Queue<Integer> q1 = new LinkedList<>(),q2 = new LinkedList<>();
		int n = q.size();
		
		for(int i=0;i<n/2;i++) {
			q1.add(q.poll());
		}
		
		for(int i=0;i<n/2;i++) {
			q2.add(q.poll());
		}
		
		for(int i=0;i<n/2;i++) {
			q.add(q1.poll());
			q.add(q2.poll());
		}
		return q;
		
	}

	public static void main(String[] args) {
		Queue <Integer> q = new LinkedList<>();
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.add(16);
		q.add(17);
		q.add(18);
		q.add(19);
		q.add(20);
		
		Queue<Integer> p =  interLeave(q);
		while(!p.isEmpty()) {
			System.out.print(p.peek()+" ");
			p.remove();
		}
	}

}
