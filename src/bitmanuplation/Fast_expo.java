package bitmanuplation;
import java.util.*;
public class Fast_expo {

	public static int findExpo(int n, int expo) {
		int ans=1;
		while(expo>0) {
			int last_bit = expo&1;
			if( last_bit!=0) {
				ans = ans*n;
			}
			n= n*n;
			expo=expo>>1;
		}
		return ans;	
	}
	
	public static int  decimalToBinary(int d) {
		int ans=0;
		int base=1;
		while(d>0) {
			int last_bit = d&1;
			if(last_bit!=0) {
				ans+=base;
			}
			d=d>>1;
			base= base*10;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number and exponent to find the value");
		int num = s.nextInt();
		int expo = s.nextInt();
		System.out.println(findExpo(num, expo));
		
		
		//<<<<<<<<<<<<<<<<<<<   TO COVERT FROM DECIMAL TO BINARY   >>>>>>>>>>>>>>>>>>>>
		
//		System.out.println("Enter number to convert into binary");
//		int decimal = s.nextInt();
//		System.out.println( decimalToBinary(decimal));
	}

}
