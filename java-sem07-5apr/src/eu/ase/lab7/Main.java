package eu.ase.lab7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// Save object
		
		Author a1 = new Author("Franz Kafka", 1883);
		Book b1 = new Book("The Trial", a1, 1925);
		Book b2 = new Book("The Castle", a1, 1926);
		
		boolean stmt = (b1.getAuthor() == b2.getAuthor()) && (b1.getAuthor() == a1);
		System.out.println(stmt);
		
		try {
			FileOutputStream fos = new FileOutputStream("books.bin");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			System.out.println("Saving to file...");
			
			oos.writeObject(b1);
			oos.writeObject(b2);
			oos.writeObject(a1);
			
			oos.close();
			
			System.out.println("Done");	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("books.bin");
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			ObjectInputStream ois = new ObjectInputStream(bis);
			
//			Book b1citit = (Book) ois.readObject();
//			System.out.println(b1citit);
//			
//			Book b2citit = (Book) ois.readObject();
//			System.out.println(b2citit);
//			
//			Author a1citit = (Author) ois.readObject();
//			System.out.println(a1citit);
			
			// clasele citite dintr-un fisier generat de alt program
			// pastreaza validitatea referintelor
			//stmt = (b1citit.getAuthor() == b2citit.getAuthor()) && (b1citit.getAuthor() == a1citit);
			//System.out.println(stmt);
			
			ois.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
