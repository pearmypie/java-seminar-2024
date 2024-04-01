package eu.ase.lab3;

public abstract class Aircraft implements Operable{
	
	// are atribute, metode sau metode abstracte (sau nimic)
	// nu poate fi instantiata, asta e chestia xd
	// pot exista obiecte de clase derivate, cast la cea abstracta
	
	private int engineNumber;
	private float maxSpeed;
	private float maxAltitude;
	
	protected Aircraft(int engineNumber, float maxSpeed, float maxAltitude) {
		super();
		this.engineNumber = engineNumber;
		this.maxSpeed = maxSpeed;
		this.maxAltitude = maxAltitude;
	}

	public int getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public float getMaxAltitude() {
		return maxAltitude;
	}

	public void setMaxAltitude(float maxAltitude) {
		this.maxAltitude = maxAltitude;
	}
	
	// metodele abstracte trebuie obligatoriu implementate in clasele mostenitoare
	public abstract void land();
	public abstract void takeOff();
	public abstract void navigate();
	
	// clasele copil pot face override la orice metoda din parinte
	public float speedPerEngine() {
		return this.getMaxSpeed() / this.getEngineNumber();
	}
	
}
