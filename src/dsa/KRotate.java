package dsa;

import java.util.Scanner;

public class KRotate {
	
	public static void rotateTheArray(int arr[],int first,int last) {
		
		for(int i=first;i<last;i++) {			
			int reserve = arr[i];
			arr[i] = arr[last];
			arr[last]=reserve;
			last--;
		}
				
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,9};
		System.out.print("Enter the number to rotate  ");
		Scanner s = new Scanner (System.in);
		int rotate = s.nextInt();
		int n= arr.length-1-rotate;
		
	
		int first_1=0;
		int last_1=n;
		rotateTheArray(arr,first_1,last_1);
		
		int first_2 = n+1 ;
		int last_2 = arr.length-1;
		rotateTheArray(arr,first_2,last_2);
		
		
		int first_3=0;
		int last_3=arr.length-1;
		rotateTheArray(arr,first_3,last_3);
		
		
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
		}
	

	}

}
