package stack;

import java.util.Stack;

public class ExerciseNo45 {
	
	public static void stockSpan(int stock[], int span[]){
		Stack<Integer> solution = new Stack<>();
		solution.push(0);
		span[0] =1;
		for(int i=1;i<stock.length;i++) {
			int currPrice = stock[i];
			if(!solution.isEmpty() && stock[solution.peek()]<=currPrice) {
				solution.pop();
			}
			if(!solution.isEmpty()) {
				int preHighest = solution.pop();
				span[i] = i-preHighest;
			}else {
				span[i] = i+1;
			}
			solution.push(i);
		}
	}

	public static void main(String[] args) {
		int stock[] = {100, 80, 60, 70, 60, 75, 85};
		int size = stock.length;
		int span[]= new int[size];
		stockSpan(stock, span);

		for(int i=0;i<size;i++) {
			System.out.println(span[i]);
		}
	}
}