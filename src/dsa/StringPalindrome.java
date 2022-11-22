package dsa;

import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string to check palindrome  ");
		String str1 = s.nextLine();
		String rev= "";
		 for(int i = str1.length()-1;i>=0;i--) {
			 rev=rev+str1.charAt(i);
		 }
		 
		 System.out.println("rev string :  "+rev);
		 
		 if(str1.equals(rev)) {
			 System.out.print("yes a palindrome");
		 }else {
			 System.out.print("Not a palindrome");
		 }
	}
}
