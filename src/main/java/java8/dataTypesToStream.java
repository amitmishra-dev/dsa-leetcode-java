package com.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class dataTypesToStream {

	public static void main(String[] args) {
	
		System.out.println("Step 1. Creating list of integer.");
		List<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.add(11);
		listOfIntegers.add(12);
		
		System.out.println("Step 2. Converting list (ArrayList) of integer to stream.");
		Stream<Integer> streamOfInteger = listOfIntegers.stream();
		System.out.println("Step 3. Display stream of integer: ");
		streamOfInteger.forEach(System.out::println);

		System.out.println("***************");
		// Count number of elements in IntStream
		System.out.println("Count number of elements in IntStream");
		long count = IntStream.of(1, 2, 3, 4, 5).count();
		System.out.println("Count: " + count);

		System.out.println("***************");
		IntStream countIntstream = IntStream.of(1, 2, 3, 4, 5).filter(n->(n>2));
		System.out.println("Greater than 2 Intstream" );
		countIntstream.forEach(System.out::println);
				
		System.out.println("***************");
		DoubleStream doubleStream = DoubleStream.of(1.1,2.2,3.3,7.7);
		OptionalDouble optDoubleStream = doubleStream.reduce((a1, b1) -> a1+b1);
		System.out.println("double Stream SUM : "+ optDoubleStream.getAsDouble());

	}

}
