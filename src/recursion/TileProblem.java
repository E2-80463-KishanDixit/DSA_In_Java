package recursion;

import java.util.Scanner;

public class TileProblem {

	public static int fixTiles(int N,int M){
		if(N<M) {
			return 1;
		}
		
		int opt1 = fixTiles(N-1,M);
		int opt2 = fixTiles(N-M,M);
		
		return opt1+opt2;
	}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("Enter the value of N and M");
		 int N = s.nextInt();
		 int M = s.nextInt();
		 
		System.out.println(fixTiles(N,M));

	}

}
