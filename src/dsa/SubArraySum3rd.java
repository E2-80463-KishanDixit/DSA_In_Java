package dsa;

public class SubArraySum3rd {
	// KADANES ALGORITHMS---- is says if sum of element makes sum negative then it makes it 0
	
	public static void preSubArraySum(int arr[]){
		int  cs=0 ; // current sum 
		int  max=0; // maximum sum
		
		for(int i=0;i<arr.length;i++) {
			cs = cs+arr[i];
			if(cs<0) {
				cs=0;
			}
			max = Math.max(max,cs);
		}
		
		System.out.println("Largest Element is :"+ max);
		
	}
			
			

	public static void main(String[] args) {
		
		int arr[] = {-2,3,4,-1,5,-12,6,1,3}; 
//		int arr[] = {1,-2,3,4,4,-2}; // TEST CASE
		preSubArraySum(arr);


	}

}
