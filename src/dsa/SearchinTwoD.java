package dsa;

import java.util.Scanner;
//<<<<<<<<<<<<<<<<<<<<<<<WRONG>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

public class SearchinTwoD {
	public static void searchElement(int [][] twodArray,int  row,int clmn, int key){
		int rowIdx=0;
		int clmnIdx=clmn-1;
		boolean bool= false;
		if(key==twodArray[rowIdx][clmnIdx] ) {
			System.out.println("yes");
		}
//		else if(key <= twodArray[rowIdx][clmnIdx-i]) {			
//		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of row and column");
        int row = sc.nextInt();
        int clmn = sc.nextInt();
        
        int twodArray [][] = new int[row][clmn];
        
        System.out.println("Enter Number elements");
        for(int i=0;i<row;i++) {
       	 for(int j=0;j<clmn;j++) {
       		 twodArray [i][j] = sc.nextInt();
       	 }
        }
        
       int  search =5;
        
        searchElement(twodArray, row, clmn,search);

	}

}
