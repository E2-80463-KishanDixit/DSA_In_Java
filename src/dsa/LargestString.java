package dsa;

import java.util.*;
public class LargestString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of Strings");
		int str_num =s.nextInt()+1;
		
		System.out.println("Enter your Strings");
		String  largest_string="";
		int large= 0;
		while(str_num-->0) {
			String str1 = s.nextLine();
		    if(largest_string.length()< str1.length()) {
		    	largest_string = str1;
		    }
		}
		System.out.println(largest_string);
	}
}
