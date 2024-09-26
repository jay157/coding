package java_practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Notes {
	
	
	private void streamsImpl() {
		
		
		/*
		 * 
		 * Java Lambda Expressions were introduced in Java 8 to provide a concise way to implement functional interfaces 
		 * (interfaces with a single abstract method). 
		 * 
		 * streams allow developers to process sequences of elements (such as collections, arrays, or input/output resources) 
		 * in a functional, declarative style. 
		 * 
		 * 
		 * */
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
		
		
		List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
		numbers.sort((a, b) -> a - b);
		System.out.println(numbers);
		
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Alice");
		map.put(2, "Bob");
		map.put(3, "Charlie");

		map.replaceAll((key, value) -> value.toUpperCase());
		map.computeIfPresent(1, (key, value) -> value + " Johnson");

		System.out.println(map);
		
		
		List<Integer> evenNumbers = numbers.stream()
			    .filter(n -> n % 2 == 0)
			    .collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		
		
		
		int sumOfSquares = numbers.stream()
			    .filter(n -> n % 2 == 0)          
			    .map(n -> n * n)                  
			    .reduce(0, Integer::sum);          

			System.out.println(sumOfSquares);
		
	}
	
	
	
	
	public static void main(String[] args) {
		Notes n = new Notes();
		System.out.println("yo");
		n.streamsImpl();
		
	}

}
