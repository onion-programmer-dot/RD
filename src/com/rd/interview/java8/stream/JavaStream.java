package com.rd.interview.java8.stream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {

		
		// 1.	Integer Stream
		IntStream
		.range(1, 10)
		.skip(5)
		.forEach(System.out::println);
		
		System.out.println("Sum of 1 to 5  == "+
				
				IntStream.range(1, 5).sum()
				);
		
		// Stream of sort and find first
		Stream.of(" anil" ,"aalok", "amol")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);

		// Stream array sort filer and print
		
		String arr[] = {"Al", "Ankit", "Kushal", "Brent", "Shivika", "Sarika", "Amanda" };
		
		Arrays.stream(arr)
		.filter(s -> s.startsWith("S"))
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
		// avrage of square of an int array
		int intArr[] = {2, 4, 6, 8, 10};
		Arrays.stream(intArr)
		.map( x -> x * x)
		.average()
		.ifPresent(System.out::println);
		
		// Stream from list filer and print
		List<String> people = Arrays.asList(arr);
		people
		.stream()
		.map(String :: toLowerCase)
		.filter(s -> s.startsWith("a"))
		.forEach(System.out::println);
		
		// Stream rows from text file sort, filter and print
		try{
		Stream<String> bands = Files.lines(Paths.get("Bands.txt"));
		bands.sorted()
		.filter(x -> x.length() < 13)
		.forEach(System.out::println);
		
		bands.close();
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
