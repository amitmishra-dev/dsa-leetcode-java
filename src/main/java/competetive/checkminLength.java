package com.java.competetive;

import java.util.ArrayList;
import java.util.List;

public class checkminLength {
	
	/**
	 * Check minimum length 
	 * Cut them [2,3,4]
	 * sum = 7 (Impossible)
	 * Sum = 5 (Possible) 
	 * 
	 * 
	 * @param lengths
	 * @param minLength
	 * @return
	 */

	public static String cutThemAll(List<Long> lengths, long minLength) {

		// Write your code here
		long sum = 0;
		boolean checkMin = false;

		for (int i = 0; i < lengths.size(); i++) {

			sum = sum + lengths.get(i);
			if (sum > 1 && sum <= 100000) {
				checkMin = checkminLength(sum, minLength);
				if (checkMin)
					return "Possible";

			}
		}

		return "Impossible";
	}

	private static boolean checkminLength(long sum, long minLength) {
		// TODO Auto-generated method stub
		if ((sum - minLength) == 0)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Long> l= new ArrayList<>();
l.add((long) 2);
l.add((long) 3);
l.add((long) 4);
System.out.println(cutThemAll(l, 9));
	}

}
