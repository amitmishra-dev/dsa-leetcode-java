package competetive.ArrayProg;

import java.util.ArrayList;
import java.util.List;

public class generateSequenceInteger {

	/**
	 * Generate the Sequence Integer
	 * 
	 * n =3 lo = 5 hi= 9
	 * 
	 * ans= [8, 9, 8]
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabc";

		System.out.println(SequenceInteger(3, 5, 9));
	}

	private static List<Integer> SequenceInteger(int n, int lo, int hi) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();

		if (n > 2 && n <= 100000 && lo > 0 && lo <= 100000 && hi > 0 && hi <= 100000) {

			if ((hi - lo) >= n) {
				list.add(hi - 1);
				for (int i = 0; i < n - 1; i++) {
					list.add(hi - i);

				}
			}
		}
		return list;
	}

}
