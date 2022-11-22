package dynamicProgramming;

public class BottomUpDp {

	static int fib(int n) {
		int dp[] = new int [n+1];
		dp[0]=0;
		dp[1] = 1;
		
		for(int i=2;i<n;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		for(int i=0;i<dp.length;i++) {
			System.out.print(dp[i]+" ");
		}
		return dp[n];
	}
	
	static void print(int dp[]) {
	}
	public static void main(String[] args) {
		fib(8);
	}
}
