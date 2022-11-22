package hashInJava;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSTL {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		// INSERTION 
		map.put("India", 120);
		map.put("China", 150);
		map.put("USA", 30);
		
		 int val =map.get("India");
		System.out.println(val+" val----->>>>>>>>>");
		
		map.put("India",val--);
		System.out.println(map.get("India")+"----->>>>>>>>>>");
	
		// SEARCHING 
		if(map.containsKey("China")) {
			System.out.println("key is present");
		}
		if(!map.containsKey("Indonesia")) {
			System.out.println("key is not present");
		}
		
		System.out.println(map.get("India"));
		
		
		//  ITERATION  1
		for(Map.Entry<String,Integer> e : map.entrySet()) {
			System.out.print(e.getKey()+" ");
			System.out.print(e.getValue()+" ");
		}
		
		// ITERATION 2
		System.out.println();
		Set<String> keys = map.keySet();
		for(String key :  keys){
			System.out.print(key+" "+map.get(key)+" ");
		}
		
		System.out.println();
		// DELETION
		map.remove("China");
		System.out.print(map);
	}

}
