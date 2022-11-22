package dsa;

public class SortedPairSum {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,90};
		int x=88;
		
		int s=0;
		int e=arr.length-1;
		int diff= Integer.MAX_VALUE;
		 
		int s_start=0, e_end=0;
		
		while(e>s) {
			if((arr[s]+arr[e]-x)<diff) {
				s_start=s;
				e_end = e;
				
				diff=Math.abs(arr[s_start]+arr[e_end]-x);
			}
			if(arr[s]+arr[e]>x) {
				e--;
			}else {
				s++;
			}
		}
		System.out.println("pairs are"+arr[s_start]+"and"+arr[e_end]);
	}

}
