package recursion;
import java.util.*;
public class Factorial {
	
	public static int factorial(int n){
		// BASE CASE
		if(n==0) {
			return 1;
		}
		
		// RECURISON CASE
		int ans = n* factorial(n-1);
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter the number to know the Factorial");
	    int num = s.nextInt();
	    
//	    factorial(num);
	   System.out.println(factorial(num));
	}
}
