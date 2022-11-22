package backTracking;

import java.util.Scanner;

public class NQueenProblem {
	
	static void print_board(int arr[][],int n){
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			    System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static boolean isPlaceOfQueen(int arr[][],int n,int x,int y){
		// COLUMN
		for(int k=0;k<x;k++) {
			if(arr[k][y]==1) {
				return false;
			}
		}
		
		// LEFT DIGONAL

		int k =x;
		int l= y;
		
		while(k>=0 && l>=0) {
			if(arr[k][l]==1) {
				return false;
			}
			k--;
			l--;
		}
		
		// RIGHT DIAGONAL
		
		 k =x;
		 l= y;
		
		while(k>=0 && l<n) {
			if(arr[k][l]==1) {
				return false;
			}
			k--;
			l++;
		}
		return true;
	}
	
	 static boolean solveN_Q_Prlblem(int arr[][],int n,int row){
		// BASE CASE
			if(row==n) {
				print_board(arr,n);
			     return true;
			}
		
		// RECURSIVE CASE
		for(int j=0;j<n;j++) {
			if(isPlaceOfQueen(arr,n,row,j)) {
				arr[row][j] = 1;
			boolean  success = solveN_Q_Prlblem(arr, n,row+1);
			if(success) {
				return true;
			  }
		     arr[row][j]=0;
			}
		 }	
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of Queen  ");
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
//		System.out.print(solveN_Q_Prlblem(arr,n,0));
	    solveN_Q_Prlblem(arr,n,0);
		
	}

}
