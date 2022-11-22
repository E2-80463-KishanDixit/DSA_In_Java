package hashInJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ExerciseNo65 {

	
    public static int[] intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
         
         for(int i=0;i<nums1.length;i++){
        	 
        	 
             if (map.containsKey(nums1[i]))
             {
                 map.put(nums1[i], map.get(nums1[i]) + 1);
             }
             else
             {
                 map.put(nums1[i], 1);
             }
        	 
         }
         System.out.print(map);
         
         HashSet<Integer> set = new HashSet<>();
         
         for(int i=0;i<nums2.length;i++){
             
             if(map.containsKey(nums2[i])){
        		 set.add(nums2[i]);
        		 
//            	 int val=map.get(nums2[i]);
//            	 if(val>0) {
//                     ans[cnt++]=nums2[i];
//                     val--;
//                     map.put(nums2[i],val);
//            	 }
             } 
         }
         
        int ans[] = new int[set.size()];
 		Iterator it  = set.iterator();
        int cnt=0;
 		while(it.hasNext()) {
 			ans[cnt++] = (int) it.next();
 		}
         return ans;
     }
	public static void main(String[] args) {
		int nums1[] = {1,2,2,1};
		int nums2[] = {2,2};

		int ans[] = intersection(nums1,nums2);
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
