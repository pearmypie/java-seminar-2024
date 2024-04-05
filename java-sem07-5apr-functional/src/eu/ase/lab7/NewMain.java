package eu.ase.lab7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NewMain {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("This", "", "is", "a", "", "", "sentence", "big", "fly", "car", "dog", "cat");
		long tStart, tStop;
		
		// Counting empty strings example
		// Benchmark 1
		int count1 = 0;
		tStart = System.nanoTime();
		
		for (int i = 0; i < strList.size(); i++) {
			if(strList.get(i).isEmpty()) {
				count1++;
			}
		}
		
		tStop = System.nanoTime();
		
		System.out.println("Empty strings: " + count1 + ", Duration: " + (tStop - tStart));
		
		// Benchmark 2
		int count2 = 0;
		tStart = System.nanoTime();
		
		for (String element : strList) {
			if(element.isEmpty()) {
				count2++;
			}
		}
		
		tStop = System.nanoTime();
		
		System.out.println("Empty strings: " + count2 + ", Duration: " + (tStop - tStart));
		
		// Benchmark 3
		tStart = System.nanoTime();
		
		// Lambda expressions on streams
		Predicate<String> strPred = str -> str.isEmpty();
		int count3 = (int) strList.stream().filter(strPred).count();
		tStop = System.nanoTime();
		
		System.out.println("Empty strings: " + count3 + ", Duration: " + (tStop - tStart));
		
		// Benchmark 4
		tStart = System.nanoTime();
		int count4 = (int) strList.stream().filter(str -> str.isEmpty()).count();
		tStop = System.nanoTime();
		
		System.out.println("Empty strings: " + count4 + ", Duration: " + (tStop - tStart));
		
		// Sorting example
		List<String> orderedList = strList.stream().filter(str -> !str.isEmpty()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(orderedList);
		
		List<String> threeCharWords = strList.stream().filter(str -> str.length() == 3).toList();
		System.out.println(threeCharWords);
		
		String s = strList.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(","));
		System.out.println(s);
		
		List<Integer> intList = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 69, 420, 1337, 42069, 666);
		List<Integer> powList = intList.stream().distinct().map(i -> i * i).toList();
		System.out.println(intList);
		System.out.println(powList);
		
		// Oricand se asteapta un argument de tip interfata functionala, noi putem furniza o expresie lambda
		Random rand = new Random();
		rand.ints().limit(5).forEach(randInt -> System.out.println(randInt));
	}

}
