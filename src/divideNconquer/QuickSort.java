package divideNconquer;

public class QuickSort {
	
	
	private static int partition(int[] arr, int s, int e) {
		int pvt = arr[e];
		int i=s-1;
		
		for(int j=s;j<e;j++) {
			if(arr[j]<pvt) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
			}
		}
		int temp2=arr[i+1];
		arr[i+1] = arr[e];
		arr[e] = temp2;
		return i+1;
	}

	static void quickSort(int []arr,int s,int e) {

		if(s>=e) {
			return;
		}
		
		int p = partition(arr,s,e);
		quickSort(arr,s,p-1);
		quickSort(arr,p+1,e);
		
		 
	}
	public static void main(String[] args) {
		int [] arr = {1,9,0,5,8,4,6};
		int e = arr.length-1;
		quickSort(arr,0,e-1);
		
		for(int me :arr) {
			System.out.print(me+",");
		}
	}

}
