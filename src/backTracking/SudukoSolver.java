package backTracking;

public class SudukoSolver {
	
	private static void print_solution(int mat[][],int n){
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	private static boolean isSafe(int [][] mat,int i,int j,int no,int n) {
		//Row  & Column
        for(int k=0;k<n;k++) {
        	if(mat[i][k]==no || mat[k][j]==no) {
        		return false;
        	}
        }
        
        int x= (i/3)*3;
        int y= (j/3)*3;
        
        for(int sx= x;sx<x+3;sx++) {
        	for(int sy=y;sy<y+3;sy++) {
        		if(mat[x][y]==no) {
        			return false;
        		}
        	}
        }
        return true;
	}
	private static boolean solveSudoku(int [][] mat,int i,int j,int n){
		//  Base Case
		if(i==n) {
			print_solution(mat,n);
			return true;
		}

		// REC Case
		if(j==n) {
			return solveSudoku(mat,i+1,0,n);
		}
		
		if(mat[i][j]!=0) {
			return solveSudoku(mat,i,j+1,n);
		}
		
		for(int no=1;no<=n;no++) {
			if(isSafe(mat,i,j,no,n)) {
				mat[i][j] = no;
				boolean success = solveSudoku(mat,i,j+1,n);
				if(success) {
					return true;
				}
			}
		}
		mat[i][j]=0;
		return false;
	}

	public static void main(String[] args) {
		
        int n = 9;
        int[][] mat =
           {{5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}};


        if(!solveSudoku(mat,0,0,n)){
            System.out.println("No solution exists!");
        }
	}
}
