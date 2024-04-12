package eu.ase.testthreads;

public class Main {
	public static void main(String[] args) {
		
		HelloThread thread1 = new HelloThread("1. Threads in Java 1.1 -> 17");
		thread1.start();
		
		
		HelloRunnable runnableObject = new HelloRunnable();
		Thread thread2 = new Thread(runnableObject, "2. Threads in Java 1.1 -> 17");
		thread2.start();
		
		// anonymous inner-class from java 7+
		Runnable runnableAnon = new Runnable() {
			
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name + " (anon class)");
			}
		};
		
		Thread thread3 = new Thread(runnableAnon, "3. Threads in Java 7 -> 17");
		thread3.start();
				
		// functional interface from java 8+
		
		Runnable runnableLambda = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " (lambda expression)");
		};
		Thread thread4 = new Thread(runnableLambda, "4. Threads in Java 8 -> 17");
		thread4.start();
		
		System.out.println("Main finished");
		
	}
}
