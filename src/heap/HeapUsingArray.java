package heap;

public class HeapUsingArray {
	static class Heap{
		static int []heap;
		static int pos;
		static int capacity;
		Heap(int capacity){
			heap=new int[capacity];
			this.capacity = capacity;
			pos=1;
		}
		
		// insert for max heap
		static void insert(int key) {
			if(pos==capacity) {
				System.out.print("Heap is Full:  ");
				return;
			}else {
				heap[pos++] = key;
				
				int child = pos-1;
				int parent = child/2;
				
				while(heap[parent] < heap[child] && parent>0) {
					int temp = heap[parent];
					heap[parent] = heap[child];
					heap[child] = temp;
					child = parent;
					parent = child/2;
				}
			}
		}
		
		// TO REMOVE MAX ELEMENT
		static void heapefy(int max){
			
				int leftChild = 2*max;
				int rightChild = 2*max+1;
			
				int maxIdx = max;
				
				if(heap[max] < heap[leftChild] && leftChild < pos) {
					maxIdx = leftChild;
				}
				if(heap[maxIdx] < heap[rightChild]  && rightChild < pos) {
					maxIdx = rightChild;
				}if(maxIdx!=max) {
					int temp = heap[max];
					heap[max] = heap[maxIdx];
					heap[maxIdx] = temp;
					heapefy(maxIdx);
				}
		}
		static void removeMax() {
			if(pos==0) {
				System.out.print("Empty heap");
				return;
			}
			// STEP 1: TO SWAP TOP ELEMENT WITH BOTTOM ELEMENT
			int idx = pos-1;
			int temp = heap[1];
			heap[1]  = heap[idx];
			heap[idx] = temp;

			// STEP 2: TO REMOVE LAST ELEMENT 
			pos--;
			
			// STEP3: HEPEFY THE HEAP
			heapefy(1);
		}
		
		
		static void print(){
			for(int i=1;i<pos;i++) {
				System.out.println(heap[i]);
			}
		}
	}


	public static void main(String[] args) {
		Heap p = new Heap(10);
		p.insert(50);
		p.insert(55);
		p.insert(53);
		p.insert(52);
		p.insert(54);
		p.print();
		System.out.println();
		p.removeMax();
		p.print();
	}
}
