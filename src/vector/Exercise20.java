package vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise20 {
                           //<<<<<<<<<<<<<<<<<<<<<<<<<<<< SORTING CABS>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	static class Pair implements Comparable<Pair>{
		int first;
		int second;
		
		Pair(int a, int b){
			first = a;
			second = b;
		}

		@Override
		public int compareTo(Pair o) {
		 return this.first+o.second;
		}
	}
	

	
	public static void main(String[] args) {
		ArrayList<Pair> sortedCabs =  new ArrayList<>(Arrays.asList(new Pair(2,3),
				                                                    new Pair(1,2),
				                                                    new Pair(3,4),
				                                                    new Pair(2,4),
				                                                    new Pair(1,4)));

		Collections.sort(sortedCabs);
		for(Pair sc : sortedCabs) {
			System.out.println(sc);
		}
	}

}
