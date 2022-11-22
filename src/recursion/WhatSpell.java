package recursion;
import java.util.Scanner;
public class WhatSpell {

	static String spell [] = {"Zero","One", "Two" , "Three" ,"Four", "Five", "Six", "Seven", "Eight","Nine"};
	
	public static void whatSpell(int num ){
		if(num==0) {
			return;
		}
		
		int digit = num%10;
		whatSpell(num/10);
		System.out.print(spell[digit]+" ");
	}
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 
	 System.out.println("Enter a number to spell");
	 int num = s.nextInt();
	 
	 whatSpell(num);

	}

}
