package recursion;

public class SortedArryCheck {

	public static boolean isSorted(int arr[],int i , int n) {
		
		// BASE CASE
		if(i==n-1) {
			return true;
		}
		// RECURSIVE CASE
		if(arr[i]<arr[i+1] && isSorted(arr, i+1,n)){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
	
		int []arr = {1,2,3,4,5,45,39};
		int size = arr.length;
	    System.out.print(isSorted(arr,0,size));
	}

}
