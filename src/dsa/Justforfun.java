package dsa;
import java.util.*;
import java.io.*;


public class Justforfun {

	public static void main (String[] args) throws java.lang.Exception
	{
	       
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter no of elenemnt");
	       int  n= s.nextInt();
	        int[] actualArray = new int[n];
	 
	        for(int i=0;i<5;i++) {
	        	actualArray[i]= s.nextInt();
	        }
	        
	        for(int i=0;i<5;i++) {
	        	System.out.println(actualArray[i]);
	        }

           
  }
}
