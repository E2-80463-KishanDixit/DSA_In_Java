package linkedList;

public class LLTest {
	Node head;
	private int size;
	
	LLTest(){
		size =0;
	}
	
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	//1. ADD FIRST	
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		
	}
	
	//2.  ADD LAST
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head ==null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next!=null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	//3.  ADD AT DEFINIT POSITION
	public void add(int position,String data) {
		
		if(position>size || position <0) {
             System.out.print("Index is out Bound. Please Enter a valid Index");
             return;
		}
		
		Node newNode = new Node(data);
		if(head == null || position ==0) {
			newNode.next = head;
			head = newNode;
		}
		
		Node currNode = head;;
		for(int i=1;i<size;i++) {
			if(i==position) {
				Node nextNode = currNode.next;
				currNode.next = newNode;
				newNode = nextNode;
				break;
			}
			currNode = currNode.next;
		}
	}
	
	
	//4.  REMOVE FIRST
	public void removeFirst() {
		if(head==null) {
			System.out.print("List is empty. Nothing to Delete");
			return;
		}
		size--;
		head = this.head.next;
	}
	
	//5.  REMOVE LAST
	public void removeLast() {
		if(head==null) {
			System.out.print("List is empty. Nothing to Delete");
			return;
		}
		size--;
		if(head.next==null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next!=null) {
			  lastNode = lastNode.next;
			  secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	
	//6.  REMOVE MIDDLE
	
	public void remove(int index) {
		if(index<0 || index>size) {
			System.out.print("Enter a valid Index");
			return;
		}
		
		if(head == null) {
			System.out.print("List is Empty. No Element is available to Remove.");
			return;
		}
		
		if(head.next == null || index==0) {
			head=head.next;
			size--;
			return;
		}
		
		Node currNode = head;
		Node second = head.next;
		for(int i=1;i<size;i++) {
			if(i==index) {
				currNode.next =	second.next;
				size--;
				break;
			}
			currNode = currNode.next;
			second = second.next;
		}
	}
	
	//8. SEARCH ELEMENT LINEARILY
	public int  search(String key) {
		if(head==null) {
			System.out.print("List is empty.");
			return -1;
		}
		
		Node currNode = head;
		for(int i=0;i<size;i++) {
			if(currNode.data== key) {
				return i;
			}
			currNode = currNode.next;
		}
		return -1;
	}
	
	//9. SEARCH ELEMENT RECURSIVELY

	public int  helper(Node currNode,String s,int i) {
		if(currNode == null) {
			return -1;
		}
		
		
		if(currNode.data==s) {
			return i;
		}
		int idx =helper(currNode.next,s,i+1);
		if(idx==-1) {
			return -1;
		}
		return idx;
	}
	
	public int searchRec(String key) {
		Node currNode = head;
		int index = helper(currNode,key,0);
		return index;
	}
	
	//10.  CLEAR 
	
	public void clear() {
		while(head!=null) {
			if(head==null) {
				System.out.print("List is empty. Nothing to Delete");
				return;
			}
			size--;
			head = this.head.next;
		}
	}
	
	//11. REVSERS A LINKEDLIST ITERATE
	public void reverseIterate() {
		if(head==null || head.next==null) {
			return;
		}
		
		Node preNode = head;
		Node currNode = head.next;
		
		while(currNode.next!=null) { 
			Node nextNode = currNode.next;
			currNode.next=preNode;
			
			// UPDATE all Nodes
			preNode = currNode;
			currNode = nextNode;
		}
		head.next=null;
		head = preNode;
	}
	
	//12.  REVERSE A LINKEDLIST USING RECURSION 
	public Node reverseRec(Node head) {
		if(head==null || head.next== null) {
			return head;
		}
		
		Node newHead = reverseRec(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	//13. kth element from last
	public String kthLastElement(int k) {
		int n = size-k+1;
		
		Node currNode = head;
		for(int i=1;i<=size;i++) {
			if(i==n) {
				return currNode.data;
			}
			currNode = currNode.next;
		}
		return null;
	}
	
	public void mergeList() {
		
	}
	
	//7. PRINT
	public void printList() {
		if(head==null) {
			System.out.print("List is empty");
			return;
		}
		Node currNode = head;
		while(currNode!=null) {
			System.out.print(currNode.data +"->");
			currNode = currNode.next;
		}
		System.out.print("NULL");
	}
	
	public static void main(String[] args) {
		LLTest list = new LLTest();
		
		list.addFirst("is");
		list.addFirst("This");
		
		list.addLast("a");
		list.addLast("perfect");
		list.addLast("Girl");
		
		list.addLast("who");
		list.addLast("cares");
		list.addLast("about");
		list.addLast("all");
	    
//		list.add(2, "worst");
//	    
//		list.removeFirst();
//	    
//		list.removeLast();
//	    
//		list.remove(0);
	    
		list.printList();
		 System.out.println();

//		int index=list.search("boy");
//		if(index!=-1) {
//			System.out.println("Your String is present at index "+index);
//		}else {
//			System.out.println("Your String is not present. ");
//		}
		 
//			int indexRec=list.searchRec("a");
//			if(indexRec!=-1) {
//				System.out.println("Your String is present at index "+indexRec);
//			}else {
//				System.out.println("Your String is not present. ");
//			}
		
//			list.clear();
//	
//		    list.printList();
		
//		 list.reverseIterate();
//		 list.head =list.reverseRec(list.head);
//		 list.printList();
		 
//		String data = list.kthLastElement(0);
//	    System.out.println(data);
		 
		 
	    
	    System.out.print("Size of Current List  "+list.size);
	}
}
