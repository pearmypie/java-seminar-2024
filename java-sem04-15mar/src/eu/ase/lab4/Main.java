package eu.ase.lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// List este o interfata de tip template
		// Pt initializare este nevoie de o clasa care implementeaza interfata
		List<Integer> intList = new ArrayList<Integer>();
		
		// fiecare tip primitiv are si o clasa -> auto boxing
		// din clasa putem obtine primitiva -> unboxing
		// Integer elementInt = new Integer(5);
		Integer elementInt = Integer.valueOf(5);
		// int a = elementInt.intValue();
				
		for (int i = 0; i < 10; i++) {
			intList.add((i + 1) * 10);
		}
		
		System.out.println("List size: " + intList.size() + "\nElements:");
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		intList.add(4, 49);
		intList.set(7, 71);
		System.out.println("List size: " + intList.size() + "\nElements:");
		for (Integer element : intList) {
			System.out.println(
					intList.indexOf(element)
					+ " -> " +
					element
			);
		}
		
		System.out.println("List size: " + intList.size() + "\nElements:");
		for (Iterator<Integer> it = intList.iterator(); it.hasNext();) {
			Integer element = it.next();
			System.out.println(element);
		}
		
		System.out.println("toString():\n" + intList.toString());
		
		List<Integer> intList2 = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			intList2.add(random.nextInt(0, 100));
		}
		
		System.out.println("Random list toString():\n" + intList2.toString());
		
		// .sort() ia ca argument un obiect Comparator
		intList2.sort(Comparator.naturalOrder());
		System.out.println("Sorted list toString():\n" + intList2.toString());
		
		Collections.shuffle(intList2);
		System.out.println("Shuffled toString():\n" + intList2.toString());
		
		intList2.sort(Comparator.reverseOrder());
		System.out.println("Reversed order sorted list toString():\n" + intList2.toString());
		
		// merge si Collections.sort fara Comparator
		Collections.sort(intList2);
		System.out.println("Sorted #2 list toString():\n" + intList2.toString());
	
		Collections.reverse(intList2);
		System.out.println("Reversed list toString():\n" + intList2.toString());
		
		Movie movie1 = new Movie(1999, "Matrix", 9.5f);
		Movie movie2 = new Movie(2003, "Matrix Reloaded", 9.6f);
		Movie movie3 = new Movie(2003, "Matrix Revolutions", 9.0f);
		Movie movie4 = new Movie(2021, "Matrix 4", 5.6f);
		
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		movies.add(movie4);
		
		for (Movie movie : movies) {
			System.out.println("Index " + movies.indexOf(movie) + ": " + movie);
		}
		
		// functie anonima
		movies.forEach(movie -> System.out.println(movie));
		movies.forEach(movie -> {
			if (movie.getTitle().startsWith("M")) {
				System.out.println("Numele filmului incepe cu M.");
			}
			
			if (movie.getRating() > 6.0f) {
				System.out.println("Filmul a fost bun.");
			} else {
				System.out.println("Filmul a fost naspa.");
			}
		});
		
//		Collections.sort(movies);
//		System.out.println(movie1.compareTo(movie4));
//		System.out.println(movies);
		movies.sort(new RatingComparator());
		System.out.println(movies);
		movies.sort(new YearComparator());
		System.out.println(movies);
		movies.sort(new TitleComparator());
		System.out.println(movies);
		
	}

}
