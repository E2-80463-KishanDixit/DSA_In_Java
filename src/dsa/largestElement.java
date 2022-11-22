package dsa;
import java.util.ArrayList;

public class largestElement {
	

   public static int largestElement(ArrayList<Integer> A) {

        int largestEle = Integer.MIN_VALUE;

        for (int element : A ) {
            largestEle = Math.max(largestEle, element);
        }

        return largestEle;
    }
    
    public static void main(String args[]) {
    	ArrayList<Integer> A = new ArrayList<Integer>();
    	A.add(-3);
    	A.add(4);
    	A.add(1);
    	A.add(2);
    	A.add(3);
    	
    	
        int big=largestElement( A) ;
        System.out.println(big);
		
    	
    	
    }
}