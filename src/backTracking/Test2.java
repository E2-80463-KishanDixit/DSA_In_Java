package backTracking;

import java.util.ArrayList;


public class Test2 {
	static ArrayList<String> str = new ArrayList<String>();
	
	static void helper(int [][]m,int n,int i,int j){
		String st ="";
		if(i<=n && j<=n) {
			str.add(st);
			return;
		  }
		
		if(m[i][j+1]==1) {
			st+="R";
			helper(m,n,i,j+1);
//			j++;
		}
		if(m[i+1][j]==1) {
			st+="D";
			helper(m,n,i+1,j);
//			i++;
		}
	}
	
    public static ArrayList<String> findPath(int[][] m, int n) {
        int i=0;
        int j=0;
        
        if(m[n][n]==0) {
        	String st1="-1";
        	str.add(st1);
        	return str;
        }
        helper(m,n,i,j);
        return str;
    }

	public static void main(String[] args) {
		
	    int n = 4;
		int 	m[][] = {{1, 0, 0, 0},
			             {1, 1, 0, 1}, 
			             {1, 1, 0, 0},
			             {0, 1, 1, 1}};
		ArrayList<String> str =  findPath( m, n-1);
		System.out.println(str);
    }    
}
