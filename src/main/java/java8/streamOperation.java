package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamOperation {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6, 7);
		s.filter(n -> (n % 2 == 0)).forEach(System.out::println);
		System.out.println("*********************");

		// find Multiplication of all between 1 to 5 and add 10 to that
		int reduce = IntStream.of(1, 2, 3, 4, 5).reduce(10, (x, y) -> x * y);
		System.out.println("Sum of all between 1 to 5 and added 10 to that: " + reduce);

		System.out.println("*********************");
		OptionalInt optionalInt = OptionalInt.of(5);

		// isPresent() will return true - If a value is present
		System.out.println("optionalInt.isPresent(): " + optionalInt.isPresent());
		optionalInt.ifPresent((i) -> System.out.println("value = " + i)); // value = 5

		System.out.println("*********************");
		List<String> stringList = new ArrayList<>();

		stringList.add("agra");
		stringList.add("bombay");
		stringList.add("ambala");

		Stream<String> stream = stringList.stream();

		// reduce list to store it in optional
		System.out.println("Step 1. Reduce list to store it in optional.");
		// a container object may or may not contain a non-null value
		Optional<String> optional = stream.sorted().reduce((s1, s2) -> s1 + ", " + s2);

		// display optional - isPresent() will return true if a value is present
		System.out.println(optional.isPresent());

		// get value
		System.out.println(optional.get());
	}

}
