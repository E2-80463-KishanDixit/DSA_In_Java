package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {
	static class Stack{
		static Queue<Integer> q1 = new LinkedList<>();
		static Queue<Integer> q2 = new LinkedList<>();
		
		public static boolean isEmpty() {
			return q1.isEmpty() && q2.isEmpty();
		}
		
		// PUSH
		public static void push(int data) {
			if(!q1.isEmpty()) {
				q1.add(data);
			}else {
				q2.add(data);
			}
		}
		
		// POP
		public static void pop() {
			if(isEmpty()) {
				System.out.print("Empty Queue");
				return ;
			}
			
			if(q1.isEmpty()) {
				while(!q2.isEmpty()) {
					int front = q2.remove();
					if(q2.isEmpty()) {
						break;
					}
					q1.add(front);
				}
			}else {
				while(!q1.isEmpty()) {
					int front = q1.remove();
					if(q1.isEmpty()) {
						break;
					}
					q2.add(front);
				}
				
			}
		}
		
		// PEEk
		public static int peek() {
			if(isEmpty()) {
				System.out.print("Empty Queue");
				return -1;
			}
			if(q1.isEmpty()) {
				while(!q2.isEmpty()) {
					int front = q2.remove();
					q1.add(front);
					if(q2.isEmpty()) {
						return front;
					}
				}
			}else {
				while(!q1.isEmpty()) {
					int front = q1.remove();
					q2.add(front);
					if(q1.isEmpty()) {
						return front;
					}
				}
		   }
			return -1;
	    }
	}
	public static void main(String[] args) {
		Stack q = new Stack();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		
		q.pop();
		System.out.println(q.peek()+"I am peek");
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.pop();
		}
	}
}