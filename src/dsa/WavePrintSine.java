package dsa;

import java.util.Scanner;

public class WavePrintSine {

	public static int[] wavePrint(int[][] arr, int nRows,int mCols) {
		int  startrow =0;
        int endrow =nRows-1;
        int startcln=0;
        int endcln=mCols-1;
        
        int size = nRows*mCols;
        int[]wave = new int [size];
        int j=0;
        while(startcln<=endcln){
            for(int i=startrow;i<=endrow;i++){          
                    wave[j]=arr[i][startcln];
                j++;
            }
            startcln++;
            if(startcln<=endcln){
                for(int i=endrow;i>=startrow;i--){          
                    wave[j]=arr[i][startcln];
                j++;
                }
            startcln++;
            }
        }
        for(int i=0;i<size;i++) {
        	System.out.print(wave);
        }
        System.out.print(wave);
        return wave;
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
        
        
       int wave2[]= wavePrint(twodArray, row, clmn);
       System.out.print(wave2);
       

	}

}
