package eu.ase.lab6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
//		try {
//			FileOutputStream fos = new FileOutputStream("data.bin");
//			
//			BufferedOutputStream bos = new BufferedOutputStream(fos);
//			
//			DataOutputStream dos = new DataOutputStream(bos);
//			
//			dos.writeUTF("Hello world!");
//			
//			dos.write(4);
//			
//			dos.writeFloat(54.05f);
//			
//			dos.writeInt(-3);
//			
//			dos.writeBoolean(true);
//			
//			dos.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			FileInputStream fis = new FileInputStream("data.bin");
//			
//			BufferedInputStream bis = new BufferedInputStream(fis);
//			
//			DataInputStream dis = new DataInputStream(bis);
//			
//			String strFromFile = dis.readUTF();
//			System.out.println(strFromFile);
//			
//			byte byteFromFile = dis.readByte();
//			System.out.println(byteFromFile);
//			
//			float floatFromFile = dis.readFloat();
//			System.out.println(floatFromFile);
//			
//			int intFromFile = dis.readInt();
//			System.out.println(intFromFile);
//			
//			boolean boolFromFile = dis.readBoolean();
//			System.out.println(boolFromFile);
//			
//			dis.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Book b1 = new Book(1866, "Crime and Punishment", "Fyodor Dostoevsky");
//		
//		Book b2 = new Book(1830, "Dead Souls", "Nikolay Gogol");
//		
//		Book b3 = new Book(1820, "The Hero of our times", "Mikhail Lermontov");
//		
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
//		
//		try {
//			FileOutputStream fos = new FileOutputStream("book.bin");
//			b1.saveToFile(fos);
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			FileInputStream fis = new FileInputStream("book.bin");
//			Book b4 = Book.readFromFile(fis);
//			
//			System.out.println(b4);
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
