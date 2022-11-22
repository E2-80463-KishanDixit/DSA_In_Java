package bitmanuplation;
import java.util.Scanner;

public class Bitchange {
//                 <<<<<<<<<<<<<<<<<<<<<<<<<<<<  POWER OF TWO  >>>>>>>>>>>>>>>>>>>>>>>>>>>>
	public static void checkPowofTwo(int n){
     if((n&(n-1))==0) {
    	 System.out.print("Yes");
     }else {
    	 System.out.print("Not");
     }
	}
	
	public static int numOfSetbits(int n) {
		int count=0;
		while(n>0) {
			int last_bit = n&1;
			count = count+ last_bit;
			n=n>>1;
		}
		return count;
	}
	
	// SECOND METHOD TO FIND NUMBER OF SET BITS ------<<<<<<< FAST than above method>>>>>>>>>>>>>>>>>.-------------
	
	public static int  numOfSetbits2(int n) {
		int ans=0;
        while(n>0) {
        	n = n&(n-1);
        	ans++;
        }
        return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your value to check power of TWO or not");
//        int n = sc.nextInt();
//        checkPowofTwo(n);
        
		
      System.out.println("Enter the number to know the set bits");
      int n = sc.nextInt();
      System.out.println(numOfSetbits(n));
      
      // Second method to count the number of setbits
      System.out.println(numOfSetbits2(n));
      
	}
}