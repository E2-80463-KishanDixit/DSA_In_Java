package dsa;
import java.util.*;

public class SortingWithComparator {

	public static void sortWithComp(Integer []arr,boolean flag){
		if(flag==false) {
			Arrays.sort(arr);
		}else {
			Arrays.sort(arr,Collections.reverseOrder());
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Integer arr[]= {8,5,9,3,3,2,7};
		boolean flag = true;
		
		sortWithComp(arr,flag);

	}

}
