package stack;

import java.util.Scanner;
import java.util.Stack;

public class ExerciseNo47 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string  ");
		String expr = s.next();
		
		Stack<Character> st = new Stack<Character>();
		boolean ans=false;
		for(int i=0;i<expr.length();i++) {
			if(expr.charAt(i)=='+' || expr.charAt(i)=='-' || expr.charAt(i)=='*' || expr.charAt(i)=='/') {
				st.push(expr.charAt(i));
			}else if(expr.charAt(i)=='(') {
				st.push(expr.charAt(i));
			}else if(expr.charAt(i)==')') {
				if(st.peek()=='(') {
					ans=true;
				}
				while(st.peek()=='+' || st.peek()=='-' || st.peek()=='*' || st.peek()=='/') {
					st.pop();
				}
				st.pop();
			}
		}
		
		System.out.print(ans);
	}
}