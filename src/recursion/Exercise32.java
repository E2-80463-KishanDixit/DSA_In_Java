package recursion;

import java.util.Scanner;

public class Exercise32 {
	
	static int pairFrnd(int n) {
		
		if(n<2) {
			return 1;
		}
		
		return pairFrnd(n-1) + (n-1)*pairFrnd(n-2);
	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("Enter the value of N ");
		 int n = s.nextInt();
		 
		System.out.println(pairFrnd(n));

	}

}
