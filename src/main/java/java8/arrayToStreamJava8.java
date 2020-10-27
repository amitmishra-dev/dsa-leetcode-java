package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class arrayToStreamJava8 {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("amit");
		stringList.add("papa");
		stringList.add("mummy");
		stringList.add("ajit");

		// display record that start with 'a' in stringList
		System.out.println("1. Used stream for filtering and display:");
		stringList.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);

		System.out.println("*****************");

		stringList.stream().filter(s -> s.startsWith("a")).sorted().forEach(System.out::println);
		System.out.println("*****************");

		System.out.println("3. Used stream for filtering, sorting and display in descending order: ");
		stringList.stream().filter(s -> s.startsWith("a")).sorted((a, b) -> b.compareTo(a))
				.forEach(System.out::println);

		System.out.println("*****************");

		// display all record in upper case that starts with 'a' in stringList
		System.out.println("4. Used stream for filtering, uppercase, sorting and display: ");
		stringList.stream().filter(s -> s.startsWith("a")).sorted().map(String::toUpperCase)
				.forEach(System.out::println);

		System.out.println("*****************");

		// In one line check whether any record starts with 'a' in stringList
		boolean anyRecordStartsWithA = stringList.stream().anyMatch(s -> s.startsWith("a"));
		System.out.println("Any record starts with a: " + anyRecordStartsWithA);

		System.out.println("*****************");

		// In one line check whether any record starts with 'a' in stringList
		long countsWithA = stringList.stream().filter(s -> s.startsWith("a")).count();
		System.out.println("Any record starts with a: " + countsWithA);

		System.out.println("*****************");

		// In one line check whether all record starts with 'a' in stringList
		boolean allRecordStartsWithA = stringList.stream().allMatch(s -> s.startsWith("a"));
		System.out.println("Any record starts with a: " + allRecordStartsWithA);

		System.out.println("*****************");

		// In one line check whether none of the record starts with 'b' in stringList
		boolean noneRecordStartsWithA = stringList.stream().noneMatch(s -> s.startsWith("b"));
		System.out.println("Any record starts with a: " + noneRecordStartsWithA);

		System.out.println("*****************");

		Stream<String> stream = stringList.stream();
		System.out.println("6. Use stream for filtering, sorting and display (in sorted manner - DESCENDING Order):");
		stream.filter(s -> s.startsWith("a")).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
