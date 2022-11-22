package bitmanuplation;
import java.util.*;


public class GetIthBit {
    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<     FIND THE iTH BITS      >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  
    public static int getIbit(int n,int i) {
    int shiftedNo = n>>i;

    return (shiftedNo & 1)>0 ?1:0;
    }

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<   2nd method  FIND THE iTH BITS      >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  
    public static int findIBit(int n,int i) {
	int mask = 1<<i;
    
    return (n& mask)>0?1:0;
    }

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< SET iTH BIT AS ONE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     public static int setIthBit(int n, int i) {
    	 int mask = 1<<i;
    	 int num = n|mask;
    	 return num;
     }
     
     public static int clearIthBit(int n , int i) {
    	 int mask = 1<<i;
    	 return n^mask;
     }
   //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<   2nd method  CLEAR THE iTH BITS      >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  
     public static int clearIthBit2(int n , int i) {
    	 int mask = ~(1<<i);
    	 return n&mask;
     }
     
     public static int updateIthBit(int n, int i) {
    	 int mask = ~(1<<i);
    	 return ~(n^mask);
     }
     
     public static int clearlastIBit(int n , int i) {
    	 int mask = (-1<<i);
    	 return n&mask;
     }

    public static int clearBitInRange(int n, int i, int j) {
    	int a = (-1<<j+1);
    	int b = (1<<i)-1;
    	int mask = a|b;
    	return n&mask;
    }
    
   public static int replaceRangeofBits(int n, int i, int j, int insert) {
	  n= clearBitInRange( n,  i, j);
	   int mask = insert<<i;
	   return n|mask;
	   
   }
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter a number");
int num = sc.nextInt();

System.out.println("Enter a number of ith bit");
int i = sc.nextInt();

//System.out.println(getIbit(num, i));

//2nd funtion;
//System.out.println(findIBit(num, i));

//System.out.println(setIthBit(num, i));

//System.out.println(clearIthBit(num, i));
//2nd method to clear ith bit
//System.out.println(clearIthBit2(num, i));

//System.out.println(updateIthBit(num, i));

//System.out.println(clearlastIBit(num, i));

// CLEAR BIT I TO J RANGE 
System.out.println("Enter the value of j");
int j = sc.nextInt();
//System.out.println(clearBitInRange(num, i, j));

// REPLACE BIT FROM  GIVEN RANGE
System.out.println("Enter the value to replace");
int insert = sc.nextInt();
System.out.println(replaceRangeofBits(num , i, j, insert));
}

}
