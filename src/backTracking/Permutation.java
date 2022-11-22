package backTracking;

import java.util.Scanner;

public class Permutation {
	static String swap(String str,int s,int i) {
		     char temp;
		     char [] charArray = str.toCharArray();
		     temp = charArray[i];
		     charArray[i] = charArray[s];
		     charArray[s] = temp;
		     return String.valueOf(charArray);	     
	}
	static void allPermutations(String str,int s,int e) {
		if(s==e) {
			System.out.print(str);
			System.out.println();
		}
		
		for(int i =s ;i<=e;i++) {
			str = swap(str,s,i);
			allPermutations(str,s+1,e);
			str = swap(str,s,i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to know Permutaion");
		
		String str = sc.nextLine();
		int n = str.length();
		
		allPermutations(str,0,n-1);
	}
}
