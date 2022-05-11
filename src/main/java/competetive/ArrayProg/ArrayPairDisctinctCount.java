package competetive.ArrayProg;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairDisctinctCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,2,5,5,5,2,2};//{ 11, 2, 103, 4 };
		// {0,2,2,5,5,5}; count- 3

		disctinctList(arr);
	}

	private static void disctinctList(int[] arr) {
		Set<Integer> s = new HashSet<>();
		int count = 0;
		for (int i : arr) {
			System.out.println(i);
			if (s.contains(i)) {
				count++;
			} else {
				s.add(i);
			}
		}
		System.out.println("Count - " + count);// Count - 0
	}

}
