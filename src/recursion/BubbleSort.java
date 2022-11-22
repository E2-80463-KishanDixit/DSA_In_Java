package recursion;

public class BubbleSort {
	
	public static void recursionSort(int[] arr,int n) {
		if(n==1) {
			return;
		}
		
		for(int j=0;j<n-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		recursionSort(arr,n-1);
	}

	public static void recursionSort2(int[] arr,int n,int j) {
		if(n==1) {
			return;
		}	
        if(j==n-1) {
        	recursionSort2(arr,n-1, 0);
        	return;
        }
		if(arr[j]>arr[j+1]) {
			int temp = arr[j];
			arr[j]= arr[j+1];
			arr[j+1] = temp;
		}
		recursionSort2(arr,n, j+1);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,8,-13,-5,3,5,6,0};
		int size = arr.length;
//		recursionSort(arr,size);
		recursionSort2(arr,size,0);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
}
