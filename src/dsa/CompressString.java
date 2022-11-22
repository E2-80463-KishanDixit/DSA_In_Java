package dsa;

import java.util.Arrays;

public class CompressString {
	
	//<<<<<<<<<<<<<<<<<<<< THIS WILL GIVE ONLY VOWEL PRESENT IN THE FUNCTION>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//	public static int countSubstrings(String s) 
//	{
//	    char ch[] = s.toCharArray();
//	     Arrays.sort(ch);
//	    System.out.println(ch);
//	    
//	    String vwlString = "";
//        int count =0;
//        int start =0;
//        int end =0;
//        while(start<ch.length){	
//        	
//            if(ch[start]==97 || ch[start]==101||ch[start]==105||ch[start]==111|| ch[start]==117){
//                      count++;
//                      vwlString+=ch[start];
//         
//            }
//            
//            while((end < ch.length)&& (ch[start]==ch[end])) {
//          		end++;
//          	}
//            start=end;
//        }
//        
//        System.out.print("Vowel String    "+vwlString);
//         
//        return count;
//    }
	
	
	
	//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  EXERCISE NO 15 UDEMY >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	public static int eleminateVowel(String s) 
	{
	    char ch[] = s.toCharArray();
	    
	    String vwlString = "";
        int count =0;
        int start =0;
        int end =0;
        while(start<ch.length){	
        	
            while((end < ch.length)&& (ch[start]==ch[end])) {
          		end++;
                if(ch[start]==97 || ch[start]==101||ch[start]==105||ch[start]==111|| ch[start]==117){
                    count++;
                    vwlString+=ch[start];
          }
          	}  
            start=end;
        }
        
        System.out.print("Vowel String    "+vwlString);
         
        return count;
    }

	public static void main(String[] args) {
	   String str1 = "aeoibsddaeioudb";
		String str2 = "codingninjas";
//		int c =countSubstrings(str1);
		
		int c =eleminateVowel(str1);
		System.out.println(c);
             
    }

}
