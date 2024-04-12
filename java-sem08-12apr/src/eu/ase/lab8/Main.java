package eu.ase.lab8;

public class Main {

	public static void main(String[] args) {
		
		ThreadNonSync thread1 = new ThreadNonSync("th1");
		ThreadNonSync thread2 = new ThreadNonSync("th2");

		System.out.println("Non synchronized threads");
		
		thread1.start();
		thread2.start();
		
		ThreadSync thread1s = new ThreadSync("th1s");
		ThreadSync thread2s = new ThreadSync("th2s");
		
		try { // wait
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Synchronized threads");
	
		thread1s.start();
		thread2s.start();
		
		try {
			thread1s.join();
			thread2s.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ExampleThread exTh = new ExampleThread("My Example");
		
		exTh.start(); // -> Cauzeaza un thread sa inceapa executia. Un thread separat este creat.
		//exTh.run(); // -> Executa metoda run this clasa, nu creeaza un thread separat.
		
		try {
			exTh.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println("Main finished.");
		
	}

}
