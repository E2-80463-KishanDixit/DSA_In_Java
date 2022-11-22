package dsa;

public class PrintingPairs {

	public static void printPair(int arr[]) {
		int s=0;
		while(s<arr.length-1) {
			int e=s+1;
			while(e<arr.length) {
				System.out.print("("+arr[s]+","+arr[e]+")");
				e++;
			}
			s=s+1;
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		 printPair(arr);
	}
}