package dsa;

public class Exercise16 {

	public static int binarystringToDecimal(String s) {
       
		int len = s.length();
		int base=1;
		int decimal = 0;
		for(int i=len-1;i>=0;i--) {
			if(s.charAt(i)=='1') {
				decimal+=base;
			}
			base= base*2;
		}
		
		return decimal;
	}
	public static void main(String[] args) {
		String s = "11111";
		 int decimal = binarystringToDecimal(s);
		 System.out.println(decimal);

	}

}
