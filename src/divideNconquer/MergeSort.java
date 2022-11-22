package divideNconquer;

import java.util.ArrayList;

public class MergeSort {
	
	//HELPER METHOD
	static void merge(int arr[],int s,int e) {
		int i=s;
		int m = (s+e)/2;
		int j= m+1;
		
		ArrayList<Integer> temp =  new ArrayList<>();
		
		if(i<=m && j<=e) {
		   if(arr[i]<arr[j]) {
			   temp.add(arr[i]);
			   i++;
		   }else {
			   temp.add(arr[j]);
			   j++;
		   }
		}
		
		// COPY THE ELEMENT FROM ARRAYLIST TO ARRAY
		
		while(i<=m) {
			temp.add(arr[i++]);
		}
		
		while(j<=e) {
		    temp.add(arr[j++]);
		}
		
		int k=0;
		for(int indx=s;indx<=e;indx++) {
			arr[indx] = temp.get(k++);
		}
		
	}

	static void mergeSort(int []arr,int s,int e){
		// BASE CASE
		if(s>=e) {
			return;
		}
		
		// RECURSIVE CASE
		int mid = (s+e)/2;
		mergeSort(arr,s,mid);
		mergeSort(arr,mid+1,e);	
	    merge(arr,s,e);
	}
	public static void main(String[] args) {
		int [] arr = {1,9,0,5,8,4,6};
		int s=0;
		int e = arr.length-1;
		mergeSort(arr,s,e);
		
		for(int me :arr) {
			System.out.print(me+" ");
		}
	}

}
