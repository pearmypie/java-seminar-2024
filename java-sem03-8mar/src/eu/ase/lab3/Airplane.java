package eu.ase.lab3;

public class Airplane extends Aircraft{

	private float wingSpan;
	
	public Airplane(float wingSpan, int engineNumber, float maxSpeed, float maxAltitude) {
		super(engineNumber, maxSpeed, maxAltitude);
		this.wingSpan = wingSpan;
	}

	@Override
	public void land() {
		System.out.println("The airplane is landing.");
		
	}

	@Override
	public void takeOff() {
		System.out.println("The airplane is taking off.");
		
	}

	@Override
	public void navigate() {
		System.out.println("The airplane is navigating.");
		
	}

	public float getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(float wingSpan) {
		this.wingSpan = wingSpan;
	}
	
	@Override
	public String toString() {
		return String.format("The airplane has a wingspan of %.2f meters, %d engines, a maximum speed of %.2f and a max altitude of %.2f",
				this.getWingSpan(), this.getEngineNumber(), this.getMaxSpeed(), this.getMaxAltitude());
	}

	@Override
	public void startEngine() {
		for (int i = 0; i < this.getEngineNumber(); i++) {
			System.out.println(String.format("Engine %d is starting.", i + 1));
		}
		
	}

	@Override
	public void stopEngine() {
		for (int i = 0; i < this.getEngineNumber(); i++) {
			System.out.println(String.format("Engine %d is stopping.", i + 1));
		}
	}
}
