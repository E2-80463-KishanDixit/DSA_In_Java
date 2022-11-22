package spacetimeComplexity;

import java.util.ArrayList;
import java.util.Collections;

public class ExperimentalAnalysis {

	public static void sortedArray(ArrayList<Integer> A) {
		
		final long startTime = System.currentTimeMillis();
		for(int i=1;i<A.size()-1;i++) {
			for(int j=0;j<A.size()-i;j++) {
				if(A.get(j)>A.get(j+1)) {
					Collections.swap(A,j,j+1);
				}
			}
		}
		final long endTime = System.currentTimeMillis();
		
		System.out.println("Total executing Time   "+(endTime-startTime));
		System.out.print(A);
	}
	
	public static void main(String[] args) {
      
		ArrayList<Integer> A = new ArrayList<Integer>();
    	A.add(-2);
    	A.add(3);
    	A.add(4);
    	A.add(-1);
    	A.add(5);
    	A.add(12);
    	A.add(6);
    	A.add(1);
    	A.add(3);
    	
//    	A.add(1);
//    	A.add(3);
//    	A.add(5);
//    	A.add(7);
//    	A.add(9);
//    	
        sortedArray(A);
	}

}
