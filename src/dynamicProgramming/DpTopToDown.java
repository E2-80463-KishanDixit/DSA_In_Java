package dynamicProgramming;

public class DpTopToDown {

	static int fib(int n,int dp[]) {
		if(n==0 || n==1) {
			return n;
		}
		
		if(dp[n]!=0) {
			return dp[n];
		}
		
		return dp[n] = fib(n-1, dp)+fib(n-2,dp);
	
    }
	public static void main(String []args) {
		int[] dp = new int[9];
		fib(8,dp);
		for(int i=1;i<dp.length;i++) {
			System.out.print(dp[i]+" ");
		}
	}
}
