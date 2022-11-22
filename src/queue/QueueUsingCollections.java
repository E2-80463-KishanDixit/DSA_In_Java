package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollections {

	public static void main(String[] args) {
//		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> q = new ArrayDeque();
	    q.add(1);
	    q.add(2);
	    q.add(3);
	    q.add(4);
	    q.add(5);	
	    System.out.print(q.poll()+" i am poll "); //  remove and return  the front value and not give error while queue is empty it retrun null at that condition
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}

}
