package backTracking;

import java.util.Scanner;

public class GridWays {

	
	static int  gridAllWays(int m,int n,int i,int j) {
		
		if(i==m-1 && j==n-1) {
			return 1;
		}
		
		if(i>=m || j>=n) {
			return 0;
		}
		int ans = gridAllWays(m,n, i+1,j) + gridAllWays(m,n, i,j+1);

		return ans;
	}
	
	
	// Math trick to find grid move
	static int  findFactorial(int p) {
		int ans=1;
		while(p>0) {
			 ans = ans*p;
			 p--;
		}
		return ans;
	}
	 static void gridMove(int m, int n) {
		 int ans = findFactorial(m+n-2)/(findFactorial(m-1)*findFactorial(n-1));
		System.out.print("Total number of ways with math trick:  "+ans);
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of Grid rows and column  ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		

		
//		 gridAllWays(m,n,0,0);
		System.out.println("Total number of ways:  "+ gridAllWays(m,n,0,0));
		
		// Math trick to solve
		gridMove( m, n);
	}
}
