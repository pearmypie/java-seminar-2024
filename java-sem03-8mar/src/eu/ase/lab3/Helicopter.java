package eu.ase.lab3;

public class Helicopter extends Aircraft {
	
	private int rotorBlades;

	public Helicopter(int rotorBlades, int engineNumber, float maxSpeed, float maxAltitude) {
		super(engineNumber, maxSpeed, maxAltitude);
		this.rotorBlades = rotorBlades;
	}

	@Override
	public void land() {
		System.out.println("The helicopter is landing.");
		
	}

	@Override
	public void takeOff() {
		System.out.println("The helicopter is taking off.");
		
	}

	@Override
	public void navigate() {
		System.out.println("The helicopter is navigating.");		
	}

	public int getRotorBlades() {
		return rotorBlades;
	}

	public void setRotorBlades(int rotorBlades) {
		this.rotorBlades = rotorBlades;
	}

	@Override
	public String toString() {
		return String.format("The helicopter has %d rotor blades, %d engines, a maximum speed of %.2f and a max altitude of %.2f",
				this.getRotorBlades(), this.getEngineNumber(), this.getMaxSpeed(), this.getMaxAltitude());
	}

	@Override
	public float speedPerEngine() {
		return super.speedPerEngine() / this.getRotorBlades();
	}

	@Override
	public void startEngine() {
		for (int i = 0; i < this.getEngineNumber(); i++) {
			System.out.println(String.format("Engine %d is starting.", i + 1));
		}
		
		System.out.println(String.format("The %d rotor blades of the helicopter started spinning", this.getRotorBlades()));
		
	}

	@Override
	public void stopEngine() {
		for (int i = 0; i < this.getEngineNumber(); i++) {
			System.out.println(String.format("Engine %d is stopping.", i + 1));
		}
		
		System.out.println(String.format("The %d rotor blades of the helicopter stopped spinning", this.getRotorBlades()));
	}
	
	
}
