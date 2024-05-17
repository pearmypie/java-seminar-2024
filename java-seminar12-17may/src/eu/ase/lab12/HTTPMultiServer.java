package eu.ase.lab12;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import eu.ase.net.HTTPMultiServerThread;

public class HTTPMultiServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		boolean listening = true;
		
		
		try {
			int port = Integer.parseInt(args[0]);
			serverSocket = new ServerSocket(port);
			System.out.println("Server is listening on port " + port);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (listening) {
			try {
				Socket client = serverSocket.accept();
				
				HTTPMultiServerThread objClient = new HTTPMultiServerThread(client);
				
				objClient.start();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			
			if (serverSocket != null) {
				serverSocket.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
