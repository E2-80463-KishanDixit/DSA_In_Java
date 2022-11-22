package dsa;
import java.util.*;
public class Exercise1 {
	
	public static int largestElement(ArrayList<Integer> A) {
		int largeEl= Integer.MIN_VALUE;
		for(int currentEl : A ) {
			largeEl = Math.max(largeEl,currentEl);
		}
		return largeEl;
	}
	public static void main(String args[]) {
    	ArrayList<Integer> A = new ArrayList<Integer>();
    	A.add(-3);
    	A.add(8);
    	A.add(1);
    	A.add(2);
    	A.add(13);
    	
    	
        int big=largestElement( A) ;
        System.out.println(big);
		
    	
    	
    }
}
