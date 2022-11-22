package backTracking;

public class AllpossibleSolution {

	private static void solution(char arr[],int num){
		
		int j=0;
        if(num==0) {
        	System.out.print("NULL");
        }
        
		while(num>0) {
			int last_bit = (num&1);
			
			if(last_bit>0) {
				System.out.print(arr[j]);
			}
			j++;
			num = num>>1;
		}
		System.out.println();
	}
	public static void main(String[] args) {
     	
	char[] chr = {'a', 'b','c'};
	
	int n = chr.length;
	
	for(int i=0;i<(1<<n);i++) {
		solution(chr,i);
	}
	}
}