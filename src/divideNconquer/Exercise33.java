package divideNconquer;
import java.util.Scanner;
public class Exercise33 {

	private static int linearSearch(int []arr,int key,int s,int e) {
		if(s>e) {
			return -1;
		}
		
		if(arr[s]==key) {
			return s;
		}
		int p = linearSearch(arr,key,s+1, e);
		return p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = {1,9,0,5,8,4,6};
		
		System.out.println("Enter a number to search in array");
		int key = sc.nextInt();
		int s=0;
		int e=arr.length-1;
		System.out.print(linearSearch(arr,key,s,e));
	}
}
