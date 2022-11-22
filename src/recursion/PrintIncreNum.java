package recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintIncreNum {

	static void helper(int n) {
		
		   if(n==0) {
			   return;
		   }
		  
		   helper(n-1);
		   vec.add(n);
	}
	
	
   static ArrayList<Integer> vec = new ArrayList<>();
   
   public static ArrayList<Integer> printIncre(int n){
	   helper(n);
	   return vec;
   }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int  n= s.nextInt();
		
		System.out.println(printIncre(n));
	}

}
