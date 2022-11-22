package stack;

import java.util.Stack;

public class NextSmallElement {
	
	public static int[] nextSmallElement(int arr[]){
		int n = arr.length;
		int arr1[] = new int[n];
		Stack<Integer> s = new Stack<>();
		
		for(int i=n-1;i>=0;i--) {
			while(!s.isEmpty() && arr[i]<s.peek()) {
				s.pop();
			}if(s.isEmpty()) {
				arr1[i]=-1;
			}else {
				arr1[i]= s.peek();
			}
			s.push(arr[i]);
		}
		return arr1;
	}
	
	public static void main(String[] args) {
		int arr[]={ 4, 10, 5, 8, 20, 15, 3, 12 };
		int arr1[]=nextSmallElement(arr);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+",");
		}
	}
}