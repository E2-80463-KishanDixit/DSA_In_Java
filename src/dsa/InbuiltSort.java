package dsa;
import java.util.*;
public class InbuiltSort {

	public static void main(String args[]) {
//		int arr[]={1,3,4,-67,90,-1,-2,-2};
		
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(Arrays.toString(arr));
			
//			Arrays.sort(arr, Collections.reverseOrder());
//			System.out.println(Arrays.toString(arr));
			
		
		Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
		 
        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());
 
        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(arr));
	}
}
