package eu.ase.lab8;

public class ExampleThread extends Thread {

	public ExampleThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		String name = Thread.currentThread().getName();
		System.out.println("Hello from " + name);
	}	
	
}
