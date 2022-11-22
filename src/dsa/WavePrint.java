package dsa;

import java.util.Scanner;

public class WavePrint {
	//<<<<<<<<<<<<<<<<<<<<<<<<<<   BACKWORD WAVE  >>>>>>>>>>>>>>>>>>>>>>>>>
	
	public static void wavePrint(int [][]twodArray, int row, int clumn){
		 
		int strtRow=0;
		int endRow = row-1;
		int strtClm = 0;
		int endClm = clumn-1;
		
		while(endClm>=strtClm) {
			for(int i=strtRow;i<=endRow ;i++) {
				System.out.print(twodArray [i][endClm]+" ");
			}
			endClm--;
			System.out.println();
			
			if(endClm>=strtClm) {
				for(int i=endRow ;i>=strtRow;i--) {
					System.out.print(twodArray [i][endClm]+" ");	
			    }
				endClm--;
				System.out.println();
			}
	   }	
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
        
        wavePrint(twodArray, row, clmn);

	}

}
