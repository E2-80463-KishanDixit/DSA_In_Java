package backTracking;
import java.util.Scanner;
public class BackTrackingInArray {

	private static void print(int arr[],int n,int i){
	    for(i=0;i<n;i++) {
	    	System.out.print(arr[i]+",");
	    }
	    System.out.println();
	}
	private static void fillCount(int arr[],int n,int i,int val){
		if(i==n) {
			print(arr,n,i);
			return;
		}
		
		arr[i]=val;
		fillCount(arr,n,i+1,val+1);
		arr[i]=-1*arr[i];
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	    System.out.println("Entet the value of n");
	    int n = s.nextInt();
	    int  arr [] = new int[100];
	    
	    fillCount(arr,n,0,1);
	    for(int i=0;i<n;i++) {
	    	System.out.print(arr[i]+",");
	    }

	}

}
