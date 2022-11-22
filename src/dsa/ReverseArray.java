package dsa;

public class ReverseArray {
	
	public static void reverseArray(int arr[]) {
		int s=0;
		int e=arr.length-1;
		int swap;
		while(s<=e) {
			swap = arr[s];
			arr[s] = arr[e];
			arr[e] = swap;
			s=s+1;
			e=e-1;
		}
		System.out.println("your reversed array:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

	public static void main(String arg[]) {
		int arr[] = {1,2,3,4,5};
		reverseArray(arr);
	}
}
