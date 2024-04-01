package eu.ase.lab6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Book {
	
	private int publishingYear;
	
	private String title;
	
//	private String author;
	
	private Author author;
	
	public Book() {
		super();
		this.setPublishingYear(0);
		this.setTitle("Untitled");
		this.setAuthor("Anonymous");
	}
	
	public Book(int publishingYear, String title, String author) {
		super();
		this.publishingYear = publishingYear;
		this.title = title;
		this.author = author;
	}
	
	public int getPublishingYear() {
		return publishingYear;
	}
	
	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
//	public String getAuthor() {
//		return author;
//	}
//	
//	public void setAuthor(String author) {
//		this.author = author;
//	}	
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return String.format("%s by %s published in %d", this.getTitle(), this.getAuthor(), this.getPublishingYear());
//	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
//	public static Book readFromFile(FileInputStream fis) {
//		BufferedInputStream bis = new BufferedInputStream(fis);
//		DataInputStream dis = new DataInputStream(bis);
//		
//		try {
//			
//			return new Book(dis.readInt(), dis.readUTF(), dis.readUTF());
//			
//		} catch (IOException e) {
//			
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			
//			return new Book();
//			
//		} finally {
//			
//			try {
//				dis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		
//	}
//	
//	public void saveToFile(FileOutputStream fos) {
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		DataOutputStream dos = new DataOutputStream(bos);
//		
//		try {
//			dos.writeInt(this.getPublishingYear());
//			
//			dos.writeUTF(this.getTitle());
//			
//			dos.writeUTF(this.getAuthor());
//			
//			dos.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	
}
