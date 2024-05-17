package eu.ase.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class HTTPMultiServerThread extends Thread {
	private Socket client;

	public HTTPMultiServerThread(Socket client) {
		super();
		this.client = client;
	}

	@Override
	public void run() {
		OutputStream os = null;
		PrintWriter out = null;
		
		InputStream is = null;
		BufferedReader in = null;
		
		try {
			is = this.client.getInputStream();
			in = new BufferedReader(new InputStreamReader(is));
			
			os = this.client.getOutputStream();
			out = new PrintWriter(os, true);
			
			String inputLine = "";
			String outputLine = "";
			String processLine = "";
			
			while (((inputLine = in.readLine()) != null)
					&& (inputLine.length() > 1)) {
				processLine += inputLine;
			}
			
			MyHTTPProtocol objProtocol = new MyHTTPProtocol();
			outputLine = objProtocol.processInput(processLine);
			out.println(outputLine);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (out != null);
			out.close();
		}
	}
	
	
}
