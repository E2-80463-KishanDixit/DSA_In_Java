package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSort {

	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-2;i++) {
			int pos=arr[i];
			int min=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
					}
			}
			arr[i]=arr[min];
			arr[min]=pos;

		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	
		
	}
	public static void main(String[] args) {
		
		int arr[] = {-2,5,3,9,6,-1};
		selectionSort(arr);
		
      
  }
}