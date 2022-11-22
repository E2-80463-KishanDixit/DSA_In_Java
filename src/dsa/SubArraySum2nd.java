package dsa;

public class SubArraySum2nd {
	// PREFIX SUM APPROACH TO SOLVE THE PROBLEM 
	public static void preSubArraySum(int arr[]) {
		int  prefix[] = new int [arr.length];
		prefix[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			prefix[i]= prefix[i-1]+arr[i];
		}
		
		int largest_sum=0,sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {	 
				sum = i>0?prefix[j]-prefix[i-1]: prefix[j];
				largest_sum= Math.max(largest_sum, sum) ;
				 }
				}
		System.out.print("largestSum is :"+largest_sum);
		}	
	

	public static void main(String[] args) {
		int arr[] = {-2,3,4,-1,5,-12,6,1,3};
		preSubArraySum(arr);

	}

}
