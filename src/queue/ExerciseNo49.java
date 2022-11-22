package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//                             <<<<<<<<<<<--- LEFT MOST NON- REPEATING ELEMENT----->>>>>>>>>>>
public class ExerciseNo49 {

    final static int MAX_CHAR = 26;

    static ArrayList<Character> firstnonrepeating(ArrayList<Character> str)
    {
        Queue<Character> q = new LinkedList<>();
        ArrayList<Character> v = new ArrayList<>();

        int[] charCount = new int[MAX_CHAR] ;

        for (int i = 0; i<str.size(); i++) {

            q.add(str.get(i));

            charCount[str.get(i) - 'a']++;

            while (!q.isEmpty()) {
                if (charCount[q.peek() - 'a'] > 1)
                    q.poll();
                else {
                    v.add(q.peek());
                    break;
                }
            }

            if (q.isEmpty())
                v.add('0');
        }
        return v;
    }
	public static void main(String[] args) {
		ArrayList<Character> c = new ArrayList<>();
		c.add('a');
		c.add('b');
		c.add('c');
		c.add('b');
		c.add('b');
		c.add('a');
		c.add('c');
		ArrayList p = firstnonrepeating(c);
		System.out.print(p);
	}
}