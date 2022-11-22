package stack;
import java.util.Stack;

public class InsertionAtbottom {
	
	// INSERT A ELEMENT AT BOTTOM 
	
	public static void insertAtbottom( Stack<Integer> count,int value) {
		if(count.isEmpty()) {
			count.push(value);
			return;
		}
		
		int top=count.pop();
		insertAtbottom(count,value);
		count.push(top);
	}
	
	// REVERSE A STACK 
	
	public static void reverseStack( Stack<Integer> count) {
		if(count.isEmpty()) {
			return;
		}
		
		int top=count.pop();
		reverseStack(count);
		insertAtbottom(count,top);
	}

	public static void main(String[] args) {
		 Stack<Integer> count = new Stack<>();
		 
		 count.push(1);
		 count.push(2);
		 count.push(3);
		 count.push(4);
		 count.push(5);
		 
//		 insertAtbottom(count,0);
		 reverseStack(count);
		 
			while(!count.isEmpty()) {
				System.out.print(count.peek());
				System.out.println();
				count.pop();
			}
	}
}