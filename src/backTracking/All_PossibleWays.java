package backTracking;

import java.util.Scanner;

public class All_PossibleWays {

	private static void print_board(int arr[][],int n){
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private static boolean isplaceOfQueen(int arr[][],int n,int row,int j) {
		for(int k=0;k<n;k++) {
			if(arr[k][j]==1) {
				return false;
			}
		}
		
		int x=row;
		int y=j;
		while(x>=0 && y>=0) {
			if(arr[x][y]==1) {
				return false;
			}
			x--;
			y--;
		}
		
		 x=row;
		 y=j;
		while(x>=0 && y<n) {
			if(arr[x][y]==1) {
				return false;
			}
			x--;
			y++;
		}
		
		return true;
	}
	
	private static int  solveN_Q_Prlblem(int arr[][],int n,int row){
		// base case
		if(row==n) {
			print_board(arr,n);
			return 1;
		}
		
		int ways=0;
		for(int j=0;j<n;j++) {
			if(isplaceOfQueen(arr,n,row,j)) {
				arr[row][j]=1;
				 ways += solveN_Q_Prlblem(arr,n,row+1);
				arr[row][j]=0;
			}
		}
		return ways;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of Queen  ");
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		
		int ways =solveN_Q_Prlblem(arr,n,0);
		System.out.println("Total number of ways:  "+ways);

	}
}
