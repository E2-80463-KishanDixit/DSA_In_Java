package dsa;

import java.util.*;
public class CountingSort {

	public static void main(String[] args) {
		int arr[]= {8,5,9,3,3,2,7};
		
		int largest = -1;
		for(int i=0;i<arr.length-1;i++) {
			largest= Math.max(largest, arr[i]);
		}
		
		int freq[] = new int[largest+1];
		for(int i=0;i<=arr.length-1;i++) {
				freq[arr[i]]++;
		}
		
		int j=0;
		for(int i=0;i<=freq.length-1;i++) {
			while(freq[i]>0) {
				arr[j]=i;
				freq[i]--;
				j++;
			}
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]);
		}
	}

}
