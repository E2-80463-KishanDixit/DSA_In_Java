package linkedList;
import java.util.LinkedList;

public class TestLinkedList {	

	public static void main(String[] args) {
		
		LinkedList<String> test = new LinkedList<String>();
		
		test.addFirst("a");
		test.addFirst("is");
		test.addFirst("this");
		test.addLast("LinkedList");
		test.addLast("a");
		test.addLast("perfect");
		test.addLast("Girl");
		
		test.addLast("who");
		test.addLast("cares");
		test.addLast("about");
		test.addLast("all");
//		test.add(1, "worst");
//		test.remove(3);
		System.out.print(test);
		test.subList(3, 6).clear();
	    System.out.println();
	    System.out.print(test);
	}

}
