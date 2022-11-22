package stack;

import java.util.Scanner;
import java.util.Stack;

public class ExerciseNo44 {
	
	
	// REVERSE THE GIVEN NUMBER
	public static void reverse(int n) {
		Stack <Integer> revNum =  new Stack<>();
		while(n!=0) {
			int lastdigi = n%10;
			n = n/10;
			revNum.push(lastdigi);
		}
		
		int digi=0;
		int i =1;
		while(!revNum.isEmpty()) {
			digi = digi+i* revNum.pop();
			i = i*10;
		}
		System.out.print(digi);
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number to Reverse");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		reverse(n);
	}

}
