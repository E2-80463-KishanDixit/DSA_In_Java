package dsa;

import java.util.ArrayList;
import java.util.Collections;


public class InsertionSort27 {
	//MY ALGO >>>>>>>>>>>>>>>>>..MY SOLUTION FOR SORTING 
	public static void insertionSortedArray(ArrayList<Integer> A) {
		for(int i=1;i<A.size();i++) {
			for(int j=i;j>0;j--) {
				if(A.get(j)<A.get(j-1)) {
					Collections.swap(A,j,j-1);
			  }
			}
		}
		System.out.println(A);
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
    	
    	insertionSortedArray(A);
	}
}
