package competetive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class RemoveDuplicateFromString {

	private static int removeDuplicateFromString(String s) {

		// TODO Auto-generated method stub
		/**
		 * str = "abcabc"
		 * 
		 * remove duplicate count = 3
		 * 
		 */

		List<Character> st = new ArrayList<>();
		if (s.length() > 0 && s.length() <= 100000) {
			for (int i = 0; i < s.length(); i++) {
				st.add(s.charAt(i));
			}
			int sizeB = st.size();
			List<Character> distinctElements = st.stream().distinct().collect(Collectors.toList());
			System.out.println("list :: " + distinctElements.toString());
			int sizeAfter = distinctElements.size();
			System.out.println(sizeB - sizeAfter);
			return sizeB - sizeAfter;
		} else
			return 0;

	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(removeDuplicateFromString(s.nextLine()));
	}

}