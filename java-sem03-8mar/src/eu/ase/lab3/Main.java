package eu.ase.lab3;

public class Main {

	public static void main(String[] args) {
		
		// poate fi atribuit clasei parinte
		Aircraft airplane = new Airplane(80, 4, 925, 11000);
		Aircraft helicopter = new Helicopter(4, 2, 240, 6000);
		
		System.out.println(airplane.toString());
		airplane.startEngine();
		airplane.takeOff();
		airplane.navigate();
		airplane.land();
		airplane.stopEngine();
		
		System.out.println(helicopter.toString());
		helicopter.startEngine();
		helicopter.takeOff();
		helicopter.navigate();
		helicopter.land();
		helicopter.stopEngine();
		
		System.out.println(airplane instanceof Aircraft);
		System.out.println(airplane instanceof Airplane);
		System.out.println(helicopter instanceof Aircraft);
		System.out.println(helicopter instanceof Helicopter);
		
		System.out.println(String.format("%.2f", airplane.speedPerEngine()));
		System.out.println(String.format("%.2f", helicopter.speedPerEngine()));
		
		System.out.println(Operable.i);
		System.out.println(Operable.j);
		Operable.engineWorking();
		
		Aircraft[] hangar = new Aircraft[2];
		hangar[0] = airplane;
		hangar[1] = helicopter;
		
		for (Aircraft aircraft : hangar) {
			System.out.println(aircraft.toString());
			aircraft.takeOff();
		}
		
		// un obiect poate fi atribuit tipului interfetei (folositor in array-uri de obiecte doar dintr-o interfata)
		Operable operable = new Airplane(60, 6, 880, 10000);
		operable.startEngine();
		operable.stopEngine();
	}

}
