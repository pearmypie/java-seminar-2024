package eu.ase.lab8;

public class ThreadNonSync extends Thread {
	
	// shared resources
	private static int a = 0;
	private static int b = 0;
	
	public ThreadNonSync(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			this.myMethod();
		}
	}
	
	// critical section
	private void myMethod() {
		System.out.println("Thread " + getName() + ": a = " + a + " b = " + b);
		a++;
		try {
			sleep((int)Math.random() * 1000); // sleep random number of milliseconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b++;
	}
	
}
