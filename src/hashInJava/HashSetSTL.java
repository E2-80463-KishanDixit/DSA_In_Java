package hashInJava;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetSTL {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		// ADD
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(2);
		set.add(2);
		
		// SIZE 
		System.out.println(set.size());
		
		// SEARCH
		if(set.contains(2)) {
			System.out.println("map contains 2");
		}
		
		if(!set.contains(6)) {
			System.out.println("Map is not contais 6");
		}
		
		// Delete
		set.remove(2);
		
		if(!set.contains(2)) {
			System.out.println("map contains 2---Deleted");
		}
		System.out.println(set.size()+" Size After deleteing");
		
		System.out.println(set);
		
		// Iterator
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		while(!set.isEmpty()) {
//			System.out.print("set is empty");
//		}
	}
}
