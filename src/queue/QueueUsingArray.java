package queue;

public class QueueUsingArray {
	static class  Queue{
		static int[] Arr;
		static int size;
		static int rear;
		Queue(int n){
			Arr= new int[n];
			this.size= n;
			rear=-1;
		}
		
		public static boolean isEmpty() {
			return rear==-1;
		}
		
		// ENQUEUE
		public static void add(int data) {
			if(rear==size-1) {
				System.out.print("Full Queue");
				return;
			}
			rear++;
			Arr[rear]=data;
		}
		
		// DEQUEUE
		public static int remove() {
			if(isEmpty()) {
				System.out.print("Queue is empty");
				return -1;
			}
			
			int front = Arr[0];
			for(int i=0;i<rear;i++) {
				Arr[i]=Arr[i+1];
			}
			rear--;
			return front;
		}
		
		// PEEK
		public static int  peek() {
			if(isEmpty()) {
				System.out.print("Queue is empty");
				return -1;
			}
			return Arr[0];
		}
	}

	public static void main(String[] args) {
		Queue q = new  Queue(6);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.remove();
		
		while(!q.isEmpty()) {
			System.out.print(q.peek()+",");
			q.remove();
		}
	}

}
