package vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class search {


    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
       ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,3,4,5,34,23,5,6,77,46,78));
       System.out.println("Enter a number to search");
       int key = s.nextInt();
       
       System.out.println(arr.contains(key));
	}
}