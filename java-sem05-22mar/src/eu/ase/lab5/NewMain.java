package eu.ase.lab5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class NewMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input: ");
		String line = scanner.nextLine(); // .next() vs .nextLine():
		System.out.println(line);
		
		System.out.println("Int: ");
		int a = scanner.nextInt();
		System.out.println(a);
		
		File file = new File("file.txt");
		try {
			scanner = new Scanner(file);
			String lineFromFile = scanner.nextLine();
			System.out.println(lineFromFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("newfile.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter writer = new BufferedWriter(osw);
			
			writer.write("Hello world!");
			writer.write(40); // codul ASCII 40
			writer.write(10); // codul ASCII 10 = newline
			writer.write("Java Java Java");
			
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("newfile.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader reader = new BufferedReader(isr);
			
			int b = reader.read();
			System.out.println(b);
			
//			String lineFromFile2 = reader.readLine();
//			System.out.println(lineFromFile2);
//			
//			lineFromFile2 = reader.readLine();
//			System.out.println(lineFromFile2);
//			
//			lineFromFile2 = reader.readLine();
//			System.out.println(lineFromFile2);
			
			char[] charBuffer = new char[1024];
			reader.read(charBuffer);
			
			System.out.println(new String(charBuffer));
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
