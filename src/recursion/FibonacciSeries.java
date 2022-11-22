package recursion;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static int fibonacci(int term) {
			// Base case
			if(term ==0 || term ==1) {
				return term;
			}
			// Recursion Case
			int f1= fibonacci(term-1);
			int f2= fibonacci(term-2);
			return f1+f2;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter the number of terms to know the value of term");
	    int term = s.nextInt();
	    
	    System.out.print(fibonacci(term));

	}

}
