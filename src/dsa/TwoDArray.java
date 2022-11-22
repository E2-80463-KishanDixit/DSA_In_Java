package dsa;

import java.util.Scanner;

public class TwoDArray {

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
         
         for(int i=0;i<row;i++) {
        	 for(int j=0;j<clmn;j++) {
        	 System.out.print(twodArray [i][j]+"  ");
        	 }
        	 System.out.println();
         }
	}
}
