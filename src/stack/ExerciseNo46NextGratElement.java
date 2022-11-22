package stack;

import java.util.Stack;

public class ExerciseNo46NextGratElement {

	public static int[] nextGreaterElement(int arr[]) {
		int n = arr.length;
		int arr1[] = new int [n];
		Stack<Integer> s = new Stack<>();
		
		for(int i=n-1;i>=0;i--) {
			while(!s.isEmpty() && s.peek()<=arr[i]){
				s.pop();
			}
			if(s.isEmpty()) {
				arr1[i] = -1;
			}else {
				arr1[i]= s.peek();
			}
			s.push(arr[i]);
		}
		return arr1;
	}

	public static void main(String[] args) {
		int arr[]={ 4, 5, 2, 25 };
//		int arr[]={ 13, 7, 6, 12,10 };
		int arr1[]=nextGreaterElement(arr);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+",");
		}
	}
}