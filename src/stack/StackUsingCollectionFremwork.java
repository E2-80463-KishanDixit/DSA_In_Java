package stack;

import java.util.Stack;

public class StackUsingCollectionFremwork {

	public static void main(String[] args) {
		Stack<Integer> list = new Stack<>();
		
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		
		while(!list.isEmpty()) {
			System.out.print(list.peek());
			System.out.println();
			list.pop();
		}
	}
}