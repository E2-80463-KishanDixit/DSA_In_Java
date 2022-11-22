package linkedList;

import java.util.LinkedList;

import linkedList.LLTest.Node;

public class MergeListAlternative {
	Node head;
	private int size;
	
	MergeListAlternative(){
		size =0;
	}
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	

	//1. ADD FIRST	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		
	}
	
	//2.  ADD LAST
	public void addLast(int data) {
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
	
	// PRINT
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
	
	Node head1,head2;
	public void mergeList(Node h1 ,Node h2) {
		Node h1nxt,h2nxt;
		 head1 = h1;
		 head2 = h2;
		while(head1.next==null || head2.next == null) {
			h1nxt=head1.next;
			head1.next = head2;
			head1 = h1nxt;
			
			h2nxt = head2.next;
			head2.next = h1nxt;
			head2 = h2nxt;
		}
		 head2 = h2;
	}

	public static void main(String[] args) {
    
		MergeListAlternative list1 = new MergeListAlternative();
		
		MergeListAlternative list2 = new MergeListAlternative();
		
		list1.addFirst(1);
		list1.addFirst(5);
		list1.addFirst(3);
		list1.addFirst(9);
		list1.addFirst(6);
		
		list2.addLast(12);
		list2.addLast(8);
		list2.addLast(14);
		
		list1.printList();
		System.out.println();
		list2.printList();
		
		list1.mergeList(list1.head,list2.head);
		list1.printList();
		
		
	}

}
