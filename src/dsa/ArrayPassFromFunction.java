package dsa;

import java.util.*;

public class ArrayPassFromFunction {
	
	public static  void printArr(int myarr[])
	{
		System.out.println("your entered array:");
		for(int i=0;i<myarr.length;i++) {
			System.out.println(myarr[i]);
		}
	}
	
	public static int binarySearch(int arr[],int key) {
		int s=0;
		int e=arr.length-1;
		while(s<=e) {
			int mid = (s+e)/2;
			
			if(arr[mid]==key) {
				return mid;
			}else if(arr[mid]>key){
				e= mid-1;	
			}else {
				s= mid+1;
			}
		}
		return -1;
	}

	
		
	
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("enter any 5 numbers in increasing or decreasing order");
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Enter a value to search");
		int key= s.nextInt();
		printArr(arr);
		
		int present= binarySearch(arr, key);
		if(present == -1) {
			System.out.println("Key is not Present");
		}else {
			System.out.println(key+ " is  Present at index :"+ present);
		}
		
	}
}
