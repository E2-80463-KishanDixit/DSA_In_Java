package recursion;

import java.util.Scanner;

public class PowerFunction {
	
	public static int printPower(int base,int  power) {
		if(power==0) {
			return 1;
		}
		
		return base*printPower(base, power-1);
	}
	
	//<<<<<<<<<<<<<<<<             FAST METHOD TO CALCULATE POWER             >>>>>>>>>>>>>>>>
	public static int  printFastPower(int base,int  power) {
		if(power==0) {
			return 1;
		}
		
		int sub = printFastPower(base,power/2);
		int subsqr = sub*sub;
		if((power&1)==0) {
			return subsqr;
		}
		return base*subsqr;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a value of base and poewer ");
		int  base= s.nextInt();
		int  power = s.nextInt();
		
		System.out.println(printPower(base, power));
		System.out.println(printFastPower(base, power));
	}
}