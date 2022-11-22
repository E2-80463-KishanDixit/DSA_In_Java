package stack;

import java.util.Stack;

public class ExerciseNo48 {
	
	public static int[] preSmallElement(int arr[]){
		int n = arr.length;
		int arr1[] = new int[n];
		Stack<Integer> s = new Stack<>();
		
		for(int i=0;i<n;i++) {
			while(!s.isEmpty() && arr[i]<=arr[s.peek()]) {
				s.pop();
			}if(s.isEmpty()) {
				arr1[i]=-1;
			}else {
				arr1[i]=s.peek();
			}
			s.push(i);
		}
		return arr1;
	}
	
	public static int[] nextSmallElement(int arr[]){
		int n = arr.length;
		int arr1[] = new int[n];
		Stack<Integer> s = new Stack<>();
		
		for(int i=n-1;i>=0;i--) {
			while(!s.isEmpty() && arr[i]<arr[s.peek()]) {
				s.pop();
			}if(s.isEmpty()) {
				arr1[i]=-1;
			}else {
				arr1[i]= s.peek();
			}
			s.push(i);
		}
		return arr1;
	}
	
	public static int maxRectArea(int arr[]) {
       int maxAns=0;
       int pre[] = preSmallElement(arr);
       int nxt[] = nextSmallElement(arr);
       
       for(int i=0;i<arr.length;i++) {
    	     int curr= (nxt[i]-pre[i]-1)*arr[i];
    	     maxAns = Math.max(maxAns, curr);
       }
       return maxAns;
	}
	
	public static void main(String[] args) {
		int arr[]=  {6, 2, 5, 4, 5, 1, 6};
		int ans = maxRectArea(arr);
		System.out.print(ans);
	}
}