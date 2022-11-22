package queue;

import queue.QueueUsingArray.Queue;

public class QueueUsingCircularArray {
	static class  Queue{
		static int[] Arr;
		static int size;
		static int rear;
		static int front;
		
		Queue(int n){
			Arr= new int[n];
			this.size= n;
			rear=-1;
			front=-1;
		}
		
		public static boolean isEmpty() {
			return front==-1 && rear==-1;
		}
		public static boolean isFull() {
			return (rear+1)%size==front;
		}
		
		// ENQUEUE
		public static void add(int data) {
			if(isFull()) {
				System.out.println("Full Queue");
				return;
			}
			// Add Ist Element 
			if(front == -1) {
				front=0;
			}
			rear = (rear+1)%size;
			Arr[rear]=data;
		}
		
		// DEQUEUE
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			
			int result = Arr[front];
			if(front == rear) {
				rear=front=-1;
			}else {
				front = (front+1)%size;
			}
			return result;
		}
		
		// PEEK
		public static int  peek() {
			if(isEmpty()) {
				System.out.print("Queue is empty");
				return -1;
			}
			int result = Arr[front];
			return result;
	    }
	}
	public static void main(String[] args) {
		Queue q = new  Queue(6);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+",");
			q.remove();
		}
	}

}
