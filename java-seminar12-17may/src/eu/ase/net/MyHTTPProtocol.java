package eu.ase.net;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyHTTPProtocol {
	public String processInput(String input) {
		String output = "";
		byte[] bufferResponse = new byte[4096];
		
		if(input.indexOf("GET") != 0) {
			output = "HTTP/1.1 200 OK\r\nContent-Length: 19\r\nNO SUCH COMMAND\r\n\r\n";
		} else {
			String filename = input.substring(input.indexOf("/") + 1, input.indexOf(" HTTP/"));
			String fileExt = filename.substring(filename.indexOf(".") + 1);
			String contentType = "";
			String fileContent = "";
			
			if (fileExt.compareToIgnoreCase("txt") == 0) {
				contentType = "text/plain";
			}
			
			if (fileExt.compareToIgnoreCase("html") == 0) {
				contentType = "text/html";
			}
			
			if (fileExt.compareToIgnoreCase("htm") == 0) {
				contentType = "text/html";
			}
			
			if (fileExt.compareToIgnoreCase("gif") == 0) {
				contentType = "image/gif";
			}
			
			try {
				int bytesRead = 0;
				FileInputStream fis = new FileInputStream(filename);
				
				while ((bytesRead = fis.read(bufferResponse)) != -1) {
					fileContent += new String(bufferResponse, 0, bytesRead);
				}
				
				fis.close();
				
				output = "HTTP/1.1 200 OK/r/nContent-Type: " + contentType
						+ "\r\nContent-Length: " + (fileContent.length() + 2)
						+ "\r\n\r\n" + fileContent + "\r\n";
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				output = "HTTP/1.1 404 Not found\r\n";
			}
 		}
		
		return output;
	}
}
