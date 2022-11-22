package dsa;

public class SubArraySum {

	public static void subArraySum(int arr[]) {
		int largest_sum=0,sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(" "+arr[k]);
					sum = sum+arr[k];
				}
				System.out.println();
				System.out.println("Sum of this sub array is :"+ sum);
//				if (largest_sum<sum) {
//					largest_sum=sum;
//				}
				
				largest_sum= Math.max(largest_sum, sum) ;
				
				
				sum=0;
				}
		}
		System.out.print("largestSum is :"+largest_sum);
		
	}
	public static void main(String[] args) {
		int arr[] = {-2,3,4,-1,5,-12,6,1,3};
		subArraySum(arr);
	}

}
