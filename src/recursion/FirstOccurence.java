package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstOccurence {

	 static int findFirstOcr(int arr[],int i , int n,int key){
		
		 if(n==i) {
			 return -1;
		 }
		 
			 if(arr[i]==key) {
				 return i;
			 }
		int subIndex = findFirstOcr( arr, i+1,  n, key);
		if(subIndex!=-1) {
			return subIndex ;
		}	 
			 return  -1;	
	}
	 
	 static int findLastOcr(int arr[],int i , int n,int key){
			
		    if(n==i) {
			 return -1;
		    }
		 
		 int subIndex = findLastOcr( arr, i+1,  n, key);
		 
		 if(subIndex==-1) {
			 if(arr[i]==key) {
				  return i;
			 }else {
				 return -1;
			 }
		 }else {
			 return subIndex;
		 }
		 
	}
	 
	 static void helper(int []arr,int i,int n,int key) {
			if(n==i) {
			return ;
		    }
			
			if(arr[i]==key) {
				vec.add(i);
			}
			helper(arr,i+1,n,key);
	 }
	 
	  static ArrayList<Integer> vec = new ArrayList<>();
	  static ArrayList<Integer> findAllOcr( int arr[], int i , int n, int  key){
		  helper(arr,i,n,key);
         return vec;
	 }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter key to find ");
		int key = s.nextInt();
		
		int arr[] = {1,8,7,4,5,7,7,9,8,9,9,10};
		int size =arr.length;
		
//		System.out.print(findFirstOcr(arr,0,size,key));
		
//		System.out.print(findLastOcr( arr, 0 , size, key));
		
		System.out.print(findAllOcr( arr, 0 , size, key));
		
		

	}

}
