//package eu.ase.lab5;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Map<Integer, Movie> movieMap = new HashMap<Integer, Movie>();
//		
//		Movie m1 = new Movie(2021, "Dune", 8.0f);
//		Movie m2 = new Movie(2023, "Barbie", 9.0f);
//		Movie m3 = new Movie(1977, "Star Wars", 10.0f);
//		Movie m4 = new Movie(1999, "Matrix", 7.5f);
//		Movie m5 = new Movie(2021, "Dune", 8.0f);
//		
//		System.out.println(m1.equals(m5));
//		System.out.println(m1.hashCode() + " " + m2.hashCode() + " " + m5.hashCode());
//		
//		movieMap.put(m1.hashCode(), m1);
//		movieMap.put(m2.hashCode(), m2);
//		movieMap.put(m3.hashCode(), m3);
//		movieMap.put(m4.hashCode(), m4);
//		movieMap.put(m5.hashCode(), m5);
//		
//		System.out.println("Movie map: {");
//		for (Integer key : movieMap.keySet()) {
//			System.out.println("\t" + key + ": " + movieMap.get(key));
//		}
//		System.out.println("}");
//		
//		// optimizat prin red-black tree
//		Map<Integer, String> treeMap = new TreeMap<Integer, String>(); 
//		treeMap.put(1, "String1");
//		treeMap.put(2, "String3");
//		treeMap.put(3, "String3");
//		
//		System.out.println(treeMap);
//		System.out.println(treeMap.keySet());
//		System.out.println(treeMap.get(2));
//	}
//
//}
