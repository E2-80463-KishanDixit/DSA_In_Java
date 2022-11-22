package linkedList;

public class LL {
    Node head;
	
	class Node {
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next=null;
		}
	}
	
	// ADD FIRST 
	
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	//ADD LAST
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next !=null) {
			currNode = currNode.next;
		}	
		currNode.next = newNode;
	}
	
	//PRINT
	
	public void printList() {
		if(head == null) {
			System.out.print("List is empty");
			return;
		}
		
		Node currNode = head;
		
		while(currNode!=null) {
			System.out.print(currNode.data + " ->");
			currNode= currNode.next;
		}
		System.out.print("Null");
	}
	public static void main(String []args) {
		LL list = new LL();
		list.addFirst("Dixit");
		list.addFirst("Kishan");
		list.printList();
		
	}
	

}
