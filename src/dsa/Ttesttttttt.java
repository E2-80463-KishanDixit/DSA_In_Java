package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Ttesttttttt {

	
	public static void removeDuplicates(String str) 
    {  
        char cht[] = str.toCharArray();
        
        int len = cht.length;
        int index=0;
        for(int i=0;i<len;i++){
         int j;
            for(j=0;j<i;j++){
                if(cht[j]==cht[i]){
                    break;
                }
                if(j==i){
                    cht[index++]+=str.charAt(i);
                }
            }
        }
        System.out.println(String.valueOf("what happened   "+Arrays.copyOf(cht, index)));
        
    }
	public static void main(String[] args) {
		String str = "abcadeecfb";
		 removeDuplicates(str);
//		System.out.println(" string         "+s1);

        
	}

}
