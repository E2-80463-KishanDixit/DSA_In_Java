package backTracking;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PossibleSolutionInOrder {

	static ArrayList<String> result = new ArrayList<>();
	
	private static void solution(char arr[],int num){
        
		int j=0;
		String temp = "";
		
		while(num>0) {
			int last_bit = (num&1);
			if(last_bit!=0) {
				temp = temp+String.valueOf(arr[j]);
			}
			j++;
			num = num>>1;
		}
		result.add(temp);
	}
	
	// CUSTOM COMPARATOR
	static Comparator c = new Comparator<String>() {
		
		public int compare(String s1, String s2) {
			return Integer.compare(s1.length(),s2.length());
		}
	};

	
	public static void main(String[] args) {
     	
	char[] chr = {'a', 'b','c'};
	
	int n = chr.length;
	
	for(int i=0;i<(1<<n);i++) {
		solution(chr,i);
	}
	
	Collections.sort(result,c);
	System.out.print(result);
	}

}
