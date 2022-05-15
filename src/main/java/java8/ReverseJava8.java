package java8;

import java.util.Scanner;
import java.util.function.Function;

class ReverseJava8 {

	public static String FirstReverse(String str) {

		// str.chars().mapToObj(mapper)
		Function<String, String> rev = s -> new StringBuilder(s).reverse().toString();
		return rev.apply(str);
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(FirstReverse(s.nextLine()));
	}

}