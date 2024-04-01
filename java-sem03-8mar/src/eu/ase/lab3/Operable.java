package eu.ase.lab3;

// interfetele reprezinta 'obligatii contractuale'
// poti defini doar metode

public interface Operable {
	
	public static int i = 10000; 
	public final static int j = 20000;
	// final = nu mai poate fi modificata (immutable)
	// atributele unei interfete nu pot fi private, si sunt automat statice.
	// nu este nevoie sa fie 'abstract'
	// clasele au OBLIGATIA sa implementeze toate metodele interfetei
	
	public void startEngine();
	public void stopEngine();
	
	// metodele statice pot fi implementate
	public static void engineWorking() {
		System.out.println("The engine is working.");
	}
}
