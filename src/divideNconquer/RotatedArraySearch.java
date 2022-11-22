package divideNconquer;

import java.util.Scanner;

public class RotatedArraySearch {


	public static int  searchRotatedArray(int []arr,int key){
		int s= 0;
		int e= arr.length-1;

		while(s<=e) {
			
			int mid=(s+e)/2;
			
			if(arr[mid]==key)
			{
				return mid;
			    
			}
			
			
			if(arr[s]<=arr[mid]) 
			{
				if(key>=arr[s] && key<=arr[mid] ) 
				{
					e=mid-1;
				}
				else
				{
					s=mid+1;
				}
			}
			else  {
				
				if(key>=arr[mid] && key<=arr[e]) 
				{
					s=mid+1;
				}
				else 
				{
					e=mid-1;
				}
			  }
			
			}
		return -1;
		}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = {7,8,9,0,1,2,3,4,5};
		System.out.println("Enter a number to search in array");
		int key = sc.nextInt();

		System.out.println(searchRotatedArray(arr,key));
	}

}
