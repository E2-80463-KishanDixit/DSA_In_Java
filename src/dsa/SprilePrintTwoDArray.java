package dsa;

import java.util.Scanner;

public class SprilePrintTwoDArray {

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
        
        System.out.println("Your element of spiral");
        int strtrow =0; 
        int endclmn= clmn-1;
        int endrow = row-1;
        int strtclmn= 0;
        while(strtrow<=endrow && endclmn>=strtclmn) {
             for(int i=strtclmn;i<=endclmn;i++) {
            	 System.out.print(twodArray [strtrow][i]+" ");
             }
             strtrow++;
             
             for(int i=strtrow;i<=endrow;i++) {
               	 System.out.print(twodArray [i][endclmn]+" ");
               }
                endclmn--;
                
              for(int i=endclmn;i>=strtclmn;i--) {
                  System.out.print(twodArray [endrow][i]+" ");
                 }
                   endrow--;
                   
                   for(int i=endrow;i>=strtrow;i--) {
                     System.out.print(twodArray [i][strtclmn]+" ");
                    }
                   strtclmn++; 
                   
        }
	}
}
