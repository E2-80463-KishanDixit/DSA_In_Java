package recursion;
import java.util.*;
public class RecursionDirection {
	
	public static void printCountRev(int n){
		if(n==0) {
			return;
		}
		
		System.out.print(n+", ");
		printCountRev(n-1);
		}

	public static void printCount(int n){
		if(n==0) {
			return;
		}
		
		printCount(n-1);
		System.out.print(n+", ");
		}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
        int n = s.nextInt();
		printCountRev(n);
		System.out.println();
		printCount(n);
	}
}