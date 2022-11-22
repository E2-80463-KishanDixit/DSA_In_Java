package dsa;

import java.util.ArrayList;

public class Exercise2 {
	
	public static int largestSubarraySum( ArrayList<Integer> A) {
		int large_subarray_sum=0;
		int current_sum =0;
		for(int i=0;i<A.size();i++) {
			
			current_sum = current_sum + A.get(i);
			
			if(current_sum<0) {
				
				current_sum=0;
			}
			System.out.println(current_sum);
			large_subarray_sum = Math.max(large_subarray_sum, current_sum);
		}
		return large_subarray_sum;
	}
	
	

	public static void main(String[] args) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();
    	A.add(1);
    	A.add(-2);
    	A.add(3);
    	A.add(4);
    	A.add(4);
    	A.add(-2);
    	
    	
    	ArrayList<Integer> B = new ArrayList<Integer>();
    	B.add(5);
    	B.add(0);
    	B.add(-1);
    	B.add(0);
    	B.add(1);
    	B.add(2);
    	B.add(-1);
    	
    	
    	
        int large_sum=largestSubarraySum(B);
        System.out.println("Largest sum "+large_sum);
	}
}
